// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            a

public class EmailSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    private final Uri b;
    private String c;
    private Uri d;

    EmailSignInConfig(int i, Uri uri, String s, Uri uri1)
    {
        y.a(uri, "Server widget url cannot be null in order to use email/password sign in.");
        y.a(uri.toString(), "Server widget url cannot be null in order to use email/password sign in.");
        y.b(Patterns.WEB_URL.matcher(uri.toString()).matches(), "Invalid server widget url");
        a = i;
        b = uri;
        c = s;
        d = uri1;
    }

    public final Uri a()
    {
        return b;
    }

    public final Uri b()
    {
        return d;
    }

    public final String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.signin.a.a(this, parcel, i);
    }

}
