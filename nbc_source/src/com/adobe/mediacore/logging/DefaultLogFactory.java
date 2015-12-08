// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;


// Referenced classes of package com.adobe.mediacore.logging:
//            LogFactory, DefaultLogger, Logger

final class DefaultLogFactory
    implements LogFactory
{

    DefaultLogFactory()
    {
    }

    public Logger getLogger(String s)
    {
        return new DefaultLogger();
    }
}
