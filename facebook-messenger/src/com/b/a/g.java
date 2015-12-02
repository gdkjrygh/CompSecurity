// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            b, c

public class g extends b
{

    public g(c c1)
    {
        super(c1);
    }

    public android.os.StrictMode.ViolationInfo handle(android.os.StrictMode.ViolationInfo violationinfo)
    {
        job.report(violationinfo.crashInfo.stackTrace);
        return violationinfo;
    }

    public volatile Object handle(Object obj)
    {
        return handle((android.os.StrictMode.ViolationInfo)obj);
    }
}
