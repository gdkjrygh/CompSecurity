// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;


// Referenced classes of package me.grantland.twitter:
//            Twitter, TwitterError

public static interface 
{

    public abstract void onCancel();

    public abstract void onComplete(String s, String s1);

    public abstract void onError(TwitterError twittererror);
}
