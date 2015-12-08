// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            e

public final class PasswordSpecification
    implements SafeParcelable
{
    public static final class a
    {

        private final TreeSet a = new TreeSet();
        private final List b = new ArrayList();
        private final List c = new ArrayList();
        private int d;
        private int e;

        private static TreeSet a(String s, String s1)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new b((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
            }
            TreeSet treeset = new TreeSet();
            s = s.toCharArray();
            int l = s.length;
            for (int k = 0; k < l; k++)
            {
                char c1 = s[k];
                if (PasswordSpecification.a(c1))
                {
                    throw new b((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
                }
                treeset.add(Character.valueOf(c1));
            }

            return treeset;
        }

        public final a a()
        {
            d = 12;
            e = 16;
            return this;
        }

        public final a a(String s)
        {
            a.addAll(a(s, "allowedChars"));
            return this;
        }

        public final a b(String s)
        {
            s = a(s, "requiredChars");
            b.add(PasswordSpecification.a(s));
            c.add(Integer.valueOf(1));
            return this;
        }

        public final PasswordSpecification b()
        {
            if (a.isEmpty())
            {
                throw new b("no allowed characters specified");
            }
            Iterator iterator = c.iterator();
            int k;
            for (k = 0; iterator.hasNext(); k = ((Integer)iterator.next()).intValue() + k) { }
            if (k > e)
            {
                throw new b("required character count cannot be greater than the max password size");
            }
            boolean aflag[] = new boolean[95];
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext();)
            {
                char ac[] = ((String)iterator1.next()).toCharArray();
                int i1 = ac.length;
                int l = 0;
                while (l < i1) 
                {
                    char c1 = ac[l];
                    if (aflag[c1 - 32])
                    {
                        throw new b((new StringBuilder("character ")).append(c1).append(" occurs in more than one required character set").toString());
                    }
                    aflag[c1 - 32] = true;
                    l++;
                }
            }

            return new PasswordSpecification(1, PasswordSpecification.a(a), b, c, d, e);
        }

        public a()
        {
            d = 12;
            e = 16;
        }
    }

    public static final class b extends Error
    {

        public b(String s)
        {
            super(s);
        }
    }


    public static final e CREATOR = new e();
    public static final PasswordSpecification a = (new a()).a().a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").b("abcdefghijkmnopqrstxyz").b("ABCDEFGHJKLMNPQRSTXY").b("3456789").b();
    public static final PasswordSpecification b = (new a()).a().a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").b("abcdefghijklmnopqrstuvwxyz").b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").b("1234567890").b();
    final int c;
    final String d;
    final List e;
    final List f;
    final int g;
    final int h;
    private final int i[] = a();
    private final Random j = new SecureRandom();

    PasswordSpecification(int k, String s, List list, List list1, int l, int i1)
    {
        c = k;
        d = s;
        e = Collections.unmodifiableList(list);
        f = Collections.unmodifiableList(list1);
        g = l;
        h = i1;
    }

    static String a(Collection collection)
    {
        char ac[] = new char[collection.size()];
        collection = collection.iterator();
        for (int k = 0; collection.hasNext(); k++)
        {
            ac[k] = ((Character)collection.next()).charValue();
        }

        return new String(ac);
    }

    static boolean a(int k)
    {
        return k < 32 || k > 126;
    }

    private int[] a()
    {
        int ai[] = new int[95];
        Arrays.fill(ai, -1);
        Iterator iterator = e.iterator();
        for (int k = 0; iterator.hasNext(); k++)
        {
            char ac[] = ((String)iterator.next()).toCharArray();
            int i1 = ac.length;
            for (int l = 0; l < i1; l++)
            {
                ai[ac[l] - 32] = k;
            }

        }

        return ai;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.auth.api.credentials.e.a(this, parcel);
    }

}
