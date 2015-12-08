// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public class dcb
{

    public final android.net.Uri.Builder a;

    public dcb(Uri uri)
    {
        a = uri.buildUpon();
    }

    public final dcb a(String s, String s1)
    {
        a.appendQueryParameter(s, s1);
        return this;
    }
}
