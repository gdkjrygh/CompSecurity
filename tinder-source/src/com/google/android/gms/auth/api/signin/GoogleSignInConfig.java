// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            d

public class GoogleSignInConfig
    implements SafeParcelable
{
    public static final class a
    {

        Set a;
        boolean b;
        boolean c;
        boolean d;
        String e;
        Account f;

        public a()
        {
            a = new HashSet(Arrays.asList(new Scope[] {
                GoogleSignInConfig.c
            }));
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final GoogleSignInConfig d;
    final int e;
    Account f;
    boolean g;
    final boolean h;
    final boolean i;
    String j;
    private final ArrayList k;

    GoogleSignInConfig(int l, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        e = l;
        k = arraylist;
        f = account;
        g = flag;
        h = flag1;
        i = flag2;
        j = s;
    }

    private GoogleSignInConfig(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        this(1, new ArrayList(set), account, flag, flag1, flag2, s);
    }

    private GoogleSignInConfig(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s, byte byte0)
    {
        this(set, account, flag, flag1, flag2, s);
    }

    public final ArrayList a()
    {
        return new ArrayList(k);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (k.size() != ((GoogleSignInConfig) (obj = (GoogleSignInConfig)obj)).a().size() || !k.containsAll(((GoogleSignInConfig) (obj)).a())) goto _L1; else goto _L3
_L3:
        if (f != null) goto _L5; else goto _L4
_L4:
        if (((GoogleSignInConfig) (obj)).f != null) goto _L1; else goto _L6
_L6:
        if (!TextUtils.isEmpty(j)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((GoogleSignInConfig) (obj)).j))
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        if (i == ((GoogleSignInConfig) (obj)).i && g == ((GoogleSignInConfig) (obj)).g && h == ((GoogleSignInConfig) (obj)).h)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (!f.equals(((GoogleSignInConfig) (obj)).f)) goto _L9; else goto _L6
_L9:
        break; /* Loop/switch isn't completed */
_L8:
        boolean flag;
        try
        {
            flag = j.equals(((GoogleSignInConfig) (obj)).j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L10
    }

    public int hashCode()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = k.iterator(); iterator.hasNext(); arraylist.add(((Scope)iterator.next()).b)) { }
        Collections.sort(arraylist);
        return (new com.google.android.gms.auth.api.signin.internal.a()).a(arraylist).a(f).a(j).a(i).a(g).a(h).b;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.auth.api.signin.d.a(this, parcel, l);
    }

    static 
    {
        a a1 = new a();
        d = new GoogleSignInConfig(a1.a, a1.f, a1.d, a1.b, a1.c, a1.e, (byte)0);
    }
}
