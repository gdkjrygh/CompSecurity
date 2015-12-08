// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.sift;

import fs.ch.qos.logback.core.sift.AppenderFactoryBase;
import fs.ch.qos.logback.core.sift.SiftingJoranConfiguratorBase;
import java.util.List;

// Referenced classes of package ch.qos.logback.classic.sift:
//            SiftingJoranConfigurator

public class AppenderFactory extends AppenderFactoryBase
{

    String key;

    AppenderFactory(List list, String s)
    {
        super(list);
        key = s;
    }

    public SiftingJoranConfiguratorBase getSiftingJoranConfigurator(String s)
    {
        return new SiftingJoranConfigurator(key, s);
    }
}
