// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


final class n extends Enum
{

    public static final n WEB_VIEW_DID_APPEAR;
    public static final n WEB_VIEW_DID_CLOSE;
    private static final n b[];
    private String a;

    private n(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/mopub/mobileads/n, s);
    }

    public static n[] values()
    {
        return (n[])b.clone();
    }

    protected final String a()
    {
        return a;
    }

    protected final String b()
    {
        return (new StringBuilder("javascript:")).append(a).toString();
    }

    static 
    {
        WEB_VIEW_DID_APPEAR = new n("WEB_VIEW_DID_APPEAR", 0, "webviewDidAppear();");
        WEB_VIEW_DID_CLOSE = new n("WEB_VIEW_DID_CLOSE", 1, "webviewDidClose();");
        b = (new n[] {
            WEB_VIEW_DID_APPEAR, WEB_VIEW_DID_CLOSE
        });
    }
}
