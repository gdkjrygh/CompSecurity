// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            b, a

public final class SignInConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private static int h = 31;
    final int a;
    final String b;
    String c;
    EmailSignInConfig d;
    GoogleSignInConfig e;
    FacebookSignInConfig f;
    String g;

    SignInConfiguration(int i, String s, String s1, EmailSignInConfig emailsigninconfig, GoogleSignInConfig googlesigninconfig, FacebookSignInConfig facebooksigninconfig, String s2)
    {
        a = i;
        b = u.a(s);
        c = s1;
        d = emailsigninconfig;
        e = googlesigninconfig;
        f = facebooksigninconfig;
        g = s2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!b.equals(((SignInConfiguration) (obj = (SignInConfiguration)obj)).b)) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(c)) goto _L5; else goto _L4
_L4:
        if (!TextUtils.isEmpty(((SignInConfiguration) (obj)).c)) goto _L1; else goto _L6
_L6:
        if (!TextUtils.isEmpty(g)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((SignInConfiguration) (obj)).g))
        {
            break; /* Loop/switch isn't completed */
        }
_L15:
        if (d != null) goto _L10; else goto _L9
_L9:
        if (((SignInConfiguration) (obj)).d != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L17:
        if (f != null) goto _L12; else goto _L11
_L11:
        if (((SignInConfiguration) (obj)).f != null)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L13
_L5:
        if (!c.equals(((SignInConfiguration) (obj)).c)) goto _L14; else goto _L6
_L14:
        break; /* Loop/switch isn't completed */
_L8:
        if (!g.equals(((SignInConfiguration) (obj)).g)) goto _L16; else goto _L15
_L16:
        break; /* Loop/switch isn't completed */
_L10:
        if (!d.equals(((SignInConfiguration) (obj)).d)) goto _L18; else goto _L17
_L18:
        break; /* Loop/switch isn't completed */
_L12:
        if (!f.equals(((SignInConfiguration) (obj)).f)) goto _L1; else goto _L13
_L13:
        if (e == null)
        {
            if (((SignInConfiguration) (obj)).e != null)
            {
                break; /* Loop/switch isn't completed */
            }
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = e.equals(((SignInConfiguration) (obj)).e);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L19
_L19:
        return true;
    }

    public final int hashCode()
    {
        return (new a()).a(b).a(c).a(g).a(d).a(e).a(f).b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.signin.internal.b.a(this, parcel, i);
    }

}
