// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            h, b

public final class PasswordSpecification
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    public static final PasswordSpecification a = (new b()).a().a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").b("abcdefghijkmnopqrstxyz").b("ABCDEFGHJKLMNPQRSTXY").b("3456789").b();
    public static final PasswordSpecification b = (new b()).a().a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").b("abcdefghijklmnopqrstuvwxyz").b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").b("1234567890").b();
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
        com.google.android.gms.auth.api.credentials.h.a(this, parcel);
    }

}
