// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import java.net.URL;

// Referenced classes of package org.apache.log4j.spi:
//            LoggerRepository

public interface Configurator
{

    public abstract void doConfigure(URL url, LoggerRepository loggerrepository);
}
