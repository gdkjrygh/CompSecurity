// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j;

import fs.org.slf4j.helpers.NOPMDCAdapter;
import fs.org.slf4j.helpers.Util;
import fs.org.slf4j.impl.StaticMDCBinder;
import fs.org.slf4j.spi.MDCAdapter;

public class MDC
{

    static MDCAdapter mdcAdapter;

    public static MDCAdapter getMDCAdapter()
    {
        return mdcAdapter;
    }

    static 
    {
        try
        {
            mdcAdapter = StaticMDCBinder.SINGLETON.getMDCA();
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            mdcAdapter = new NOPMDCAdapter();
            String s = noclassdeffounderror.getMessage();
            if (s != null && s.indexOf("StaticMDCBinder") != -1)
            {
                Util.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
                Util.report("Defaulting to no-operation MDCAdapter implementation.");
                Util.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
            } else
            {
                throw noclassdeffounderror;
            }
        }
        catch (Exception exception)
        {
            Util.report("MDC binding unsuccessful.", exception);
        }
    }
}
