// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class cri extends Exception
{

    public cri(Uri uri, Throwable throwable)
    {
        super(String.format("The URI %s is no longer available.", new Object[] {
            uri
        }), throwable);
    }

    public cri(String s, Throwable throwable)
    {
        super(String.format("The path %s is no longer available.", new Object[] {
            s
        }), throwable);
    }
}
