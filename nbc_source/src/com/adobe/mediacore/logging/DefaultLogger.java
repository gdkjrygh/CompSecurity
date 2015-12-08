// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;

import android.util.Log;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.logging:
//            Logger

final class DefaultLogger
    implements Logger
{

    private Logger.Verbosity maxVerbosityLevel;

    DefaultLogger()
    {
        maxVerbosityLevel = Logger.Verbosity.INFO;
    }

    public void clear()
    {
    }

    public void d(String s, String s1)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.DEBUG.getLevel())
        {
            return;
        } else
        {
            Log.d(s, s1);
            return;
        }
    }

    public void e(String s, String s1)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.ERROR.getLevel())
        {
            return;
        } else
        {
            Log.e(s, s1);
            return;
        }
    }

    public void e(String s, String s1, Exception exception)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.ERROR.getLevel())
        {
            return;
        } else
        {
            Log.e(s, s1, exception);
            return;
        }
    }

    public List getEntries()
    {
        return null;
    }

    public void i(String s, String s1)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.INFO.getLevel())
        {
            return;
        } else
        {
            Log.i(s, s1);
            return;
        }
    }

    public void setCapacity(int j)
    {
    }

    public void setVerbosityLevel(Logger.Verbosity verbosity)
    {
        maxVerbosityLevel = verbosity;
    }

    public void w(String s, String s1)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.WARN.getLevel())
        {
            return;
        } else
        {
            Log.w(s, s1);
            return;
        }
    }

    public void w(String s, String s1, Exception exception)
    {
        if (maxVerbosityLevel.getLevel() < Logger.Verbosity.WARN.getLevel())
        {
            return;
        } else
        {
            Log.w(s, s1, exception);
            return;
        }
    }
}
