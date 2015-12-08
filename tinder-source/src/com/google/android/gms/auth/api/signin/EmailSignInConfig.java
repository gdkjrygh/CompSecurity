// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            a

public class EmailSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.signin.a();
    final int a;
    final Uri b;
    String c;
    Uri d;

    EmailSignInConfig(int i, Uri uri, String s, Uri uri1)
    {
        u.a(uri, "Server widget url cannot be null in order to use email/password sign in.");
        u.a(uri.toString(), "Server widget url cannot be null in order to use email/password sign in.");
        u.b(Patterns.WEB_URL.matcher(uri.toString()).matches(), "Invalid server widget url");
        a = i;
        b = uri;
        c = s;
        d = uri1;
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
        if (!b.equals(((EmailSignInConfig) (obj = (EmailSignInConfig)obj)).b)) goto _L1; else goto _L3
_L3:
        if (d != null) goto _L5; else goto _L4
_L4:
        if (((EmailSignInConfig) (obj)).d != null) goto _L1; else goto _L6
_L5:
        if (!d.equals(((EmailSignInConfig) (obj)).d)) goto _L1; else goto _L6
_L6:
        if (TextUtils.isEmpty(c))
        {
            if (!TextUtils.isEmpty(((EmailSignInConfig) (obj)).c))
            {
                break; /* Loop/switch isn't completed */
            }
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = c.equals(((EmailSignInConfig) (obj)).c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L7
_L7:
        return true;
    }

    public int hashCode()
    {
        return (new a()).a(b).a(d).a(c).b;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.signin.a.a(this, parcel, i);
    }

}
