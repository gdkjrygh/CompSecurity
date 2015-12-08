// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Media, MediaAnalytics

static final class val.name
    implements Runnable
{

    final String val$name;

    public void run()
    {
        MediaAnalytics.sharedInstance().close(val$name);
    }

    lytics(String s)
    {
        val$name = s;
        super();
    }
}
