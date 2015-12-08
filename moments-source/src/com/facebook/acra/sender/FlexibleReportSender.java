// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.sender;

import java.net.Proxy;

// Referenced classes of package com.facebook.acra.sender:
//            ReportSender

public interface FlexibleReportSender
    extends ReportSender
{

    public abstract boolean setHost(String s);

    public abstract void setProxy(Proxy proxy);
}
