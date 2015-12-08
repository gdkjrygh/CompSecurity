// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;


// Referenced classes of package fs.ch.qos.logback.core.status:
//            StatusBase

public class WarnStatus extends StatusBase
{

    public WarnStatus(String s, Object obj)
    {
        super(1, s, obj);
    }

    public WarnStatus(String s, Object obj, Throwable throwable)
    {
        super(1, s, obj, throwable);
    }
}
