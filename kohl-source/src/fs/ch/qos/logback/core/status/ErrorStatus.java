// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;


// Referenced classes of package fs.ch.qos.logback.core.status:
//            StatusBase

public class ErrorStatus extends StatusBase
{

    public ErrorStatus(String s, Object obj)
    {
        super(2, s, obj);
    }

    public ErrorStatus(String s, Object obj, Throwable throwable)
    {
        super(2, s, obj, throwable);
    }
}
