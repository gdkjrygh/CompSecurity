// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.soft.SoftObject;

final class due
{

    SoftObject a;
    int b;

    public due(String s)
    {
        if (s != null && s.length() > 0)
        {
            b = s.length();
            a = new SoftObject(s);
        }
    }
}
