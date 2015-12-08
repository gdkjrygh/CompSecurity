// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package timber.log;

import android.util.Log;

// Referenced classes of package timber.log:
//            Timber

public static abstract class 
{

    private final ThreadLocal explicitTag = new ThreadLocal();

    private transient void prepareLog(int j, Throwable throwable, String s, Object aobj[])
    {
        if (isLoggable(j)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() == 0)
            {
                s1 = null;
            }
        }
        if (s1 != null) goto _L4; else goto _L3
_L3:
        if (throwable == null) goto _L1; else goto _L5
_L5:
        aobj = Log.getStackTraceString(throwable);
_L7:
        log(j, getTag(), ((String) (aobj)), throwable);
        return;
_L4:
        s = s1;
        if (aobj.length > 0)
        {
            s = String.format(s1, aobj);
        }
        aobj = s;
        if (throwable != null)
        {
            aobj = (new StringBuilder()).append(s).append("\n").append(Log.getStackTraceString(throwable)).toString();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public transient void d(String s, Object aobj[])
    {
        prepareLog(3, null, s, aobj);
    }

    public transient void d(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(3, throwable, s, aobj);
    }

    public transient void e(String s, Object aobj[])
    {
        prepareLog(6, null, s, aobj);
    }

    public transient void e(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(6, throwable, s, aobj);
    }

    String getTag()
    {
        String s = (String)explicitTag.get();
        if (s != null)
        {
            explicitTag.remove();
        }
        return s;
    }

    public transient void i(String s, Object aobj[])
    {
        prepareLog(4, null, s, aobj);
    }

    public transient void i(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(4, throwable, s, aobj);
    }

    protected boolean isLoggable(int j)
    {
        return true;
    }

    protected abstract void log(int j, String s, String s1, Throwable throwable);

    public transient void v(String s, Object aobj[])
    {
        prepareLog(2, null, s, aobj);
    }

    public transient void v(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(2, throwable, s, aobj);
    }

    public transient void w(String s, Object aobj[])
    {
        prepareLog(5, null, s, aobj);
    }

    public transient void w(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(5, throwable, s, aobj);
    }

    public transient void wtf(String s, Object aobj[])
    {
        prepareLog(7, null, s, aobj);
    }

    public transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        prepareLog(7, throwable, s, aobj);
    }


    public ()
    {
    }
}
