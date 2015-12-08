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
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            a, e

public class GoogleSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final GoogleSignInConfig d = (new com.google.android.gms.auth.api.signin.a()).a();
    final int e;
    private final ArrayList f;
    private Account g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private String k;

    GoogleSignInConfig(int l, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        e = l;
        f = arraylist;
        g = account;
        h = flag;
        i = flag1;
        j = flag2;
        k = s;
    }

    private GoogleSignInConfig(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        this(1, new ArrayList(set), account, flag, flag1, flag2, s);
    }

    GoogleSignInConfig(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s, byte byte0)
    {
        this(set, account, flag, flag1, flag2, s);
    }

    public final ArrayList a()
    {
        return new ArrayList(f);
    }

    public final Account b()
    {
        return g;
    }

    public final boolean c()
    {
        return h;
    }

    public final boolean d()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return j;
    }

    public boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (f.size() != ((GoogleSignInConfig) (obj = (GoogleSignInConfig)obj)).a().size() || !f.containsAll(((GoogleSignInConfig) (obj)).a())) goto _L1; else goto _L3
_L3:
        if (g != null) goto _L5; else goto _L4
_L4:
        if (((GoogleSignInConfig) (obj)).g != null) goto _L1; else goto _L6
_L6:
        if (!TextUtils.isEmpty(k)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((GoogleSignInConfig) (obj)).k))
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        if (j == ((GoogleSignInConfig) (obj)).j && h == ((GoogleSignInConfig) (obj)).h && i == ((GoogleSignInConfig) (obj)).i)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (!g.equals(((GoogleSignInConfig) (obj)).g)) goto _L9; else goto _L6
_L9:
        break; /* Loop/switch isn't completed */
_L8:
        boolean flag;
        try
        {
            flag = k.equals(((GoogleSignInConfig) (obj)).k);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L10
    }

    public final String f()
    {
        return k;
    }

    public int hashCode()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); arraylist.add(((Scope)iterator.next()).a())) { }
        Collections.sort(arraylist);
        return (new a()).a(arraylist).a(g).a(k).a(j).a(h).a(i).a();
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.auth.api.signin.e.a(this, parcel, l);
    }

}
