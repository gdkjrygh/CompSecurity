// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


// Referenced classes of package com.facebook.video.analytics:
//            SuggestedVideoInfo

public class a
{

    public final boolean a;
    public String b;

    public final a a(String s)
    {
        b = s;
        return this;
    }

    public final SuggestedVideoInfo a()
    {
        return new SuggestedVideoInfo(this);
    }

    public (boolean flag)
    {
        a = flag;
    }
}
