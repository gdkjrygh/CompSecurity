// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//            AdjustFactory, ILogger

public class AdjustEvent
{

    private static ILogger logger = AdjustFactory.getLogger();
    Map callbackParameters;
    String currency;
    String eventToken;
    Map partnerParameters;
    Double revenue;

    public AdjustEvent(String s)
    {
        if (!checkEventToken(s, logger))
        {
            return;
        } else
        {
            eventToken = s;
            return;
        }
    }

    private static boolean checkEventToken(String s, ILogger ilogger)
    {
        if (s == null)
        {
            ilogger.error("Missing Event Token", new Object[0]);
            return false;
        }
        if (s.length() != 6)
        {
            ilogger.error("Malformed Event Token '%s'", new Object[] {
                s
            });
            return false;
        } else
        {
            return true;
        }
    }

    private boolean checkRevenue(Double double1, String s)
    {
        if (double1 != null)
        {
            if (double1.doubleValue() < 0.0D)
            {
                logger.error("Invalid amount %.5f", new Object[] {
                    double1
                });
                return false;
            }
            if (s == null)
            {
                logger.error("Currency must be set with revenue", new Object[0]);
                return false;
            }
            if (s.equals(""))
            {
                logger.error("Currency is empty", new Object[0]);
                return false;
            }
        } else
        if (s != null)
        {
            logger.error("Revenue must be set with currency", new Object[0]);
            return false;
        }
        return true;
    }

    private boolean isValidParameter(String s, String s1, String s2)
    {
        if (s == null)
        {
            logger.error("%s parameter %s is missing", new Object[] {
                s2, s1
            });
            return false;
        }
        if (s.equals(""))
        {
            logger.error("%s parameter %s is empty", new Object[] {
                s2, s1
            });
            return false;
        } else
        {
            return true;
        }
    }

    public void addCallbackParameter(String s, String s1)
    {
        if (isValidParameter(s, "key", "Callback") && isValidParameter(s1, "value", "Callback"))
        {
            if (callbackParameters == null)
            {
                callbackParameters = new LinkedHashMap();
            }
            if ((String)callbackParameters.put(s, s1) != null)
            {
                logger.warn("key %s was overwritten", new Object[] {
                    s
                });
                return;
            }
        }
    }

    public void addPartnerParameter(String s, String s1)
    {
        if (isValidParameter(s, "key", "Partner") && isValidParameter(s1, "value", "Partner"))
        {
            if (partnerParameters == null)
            {
                partnerParameters = new LinkedHashMap();
            }
            if ((String)partnerParameters.put(s, s1) != null)
            {
                logger.warn("key %s was overwritten", new Object[] {
                    s
                });
                return;
            }
        }
    }

    public boolean isValid()
    {
        return eventToken != null;
    }

    public void setRevenue(double d, String s)
    {
        if (!checkRevenue(Double.valueOf(d), s))
        {
            return;
        } else
        {
            revenue = Double.valueOf(d);
            currency = s;
            return;
        }
    }

}
