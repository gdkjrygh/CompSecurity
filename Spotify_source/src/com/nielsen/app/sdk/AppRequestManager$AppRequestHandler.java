// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.nielsen.app.sdk:
//            h, AppRequestManager

public abstract class b extends Thread
    implements Runnable
{

    private boolean a;
    private String b;
    private BlockingQueue c;
    final AppRequestManager d;

    public BlockingQueue getQueue()
    {
        if (c == null)
        {
            c = new LinkedBlockingQueue();
        }
        return c;
    }

    public abstract void onError(String s, long l, Exception exception);

    public abstract void onFinish(String s, long l, String s1);

    public abstract void onIdle(String s, long l);

    public abstract void onStart(String s, long l);

    public abstract void onUpdate(String s, long l, long l1, long l2, 
            String s1);

    public void run()
    {
_L10:
        Object obj;
        if (a)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (a)c.take();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((c) (obj)).c();
        JVM INSTR tableswitch 0 4: default 234
    //                   0 64
    //                   1 106
    //                   2 141
    //                   3 165
    //                   4 192;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (false)
        {
        }
        break; /* Loop/switch isn't completed */
_L2:
        onIdle(((onIdle) (obj)).onIdle(), ((onIdle) (obj)).onIdle());
        break; /* Loop/switch isn't completed */
_L8:
        onError("The application was suspended or terminated while waiting sending information from the caller object", 0L, ((Exception) (obj)));
        d.l.remove(b);
        return;
_L3:
        try
        {
            onStart(((onStart) (obj)).onStart(), ((onStart) (obj)).onStart());
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            d.l.remove(b);
            throw obj;
        }
        if (true) goto _L8; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
_L4:
        onError(((onError) (obj)).onError(), ((onError) (obj)).onError(), ((onError) (obj)).onError());
        a = true;
        break; /* Loop/switch isn't completed */
_L5:
        onUpdate(((onUpdate) (obj)).onUpdate(), ((onUpdate) (obj)).onUpdate(), ((onUpdate) (obj)).onUpdate(), ((onUpdate) (obj)).onUpdate(), ((onUpdate) (obj)).onUpdate());
        break; /* Loop/switch isn't completed */
_L6:
        onFinish(((onFinish) (obj)).onFinish(), ((onFinish) (obj)).onFinish(), ((onFinish) (obj)).onFinish());
        a = true;
        if (true) goto _L10; else goto _L9
_L9:
        d.l.remove(b);
        return;
    }

    public (AppRequestManager apprequestmanager, String s)
    {
        d = apprequestmanager;
        super();
        a = false;
        b = "";
        c = null;
        long l = h.s();
        b = s;
        if (l != 0L)
        {
            b = (new StringBuilder()).append(b).append("_").append(Long.toString(l)).toString();
        }
        setName(b);
        getQueue();
        start();
        apprequestmanager.l.put(b, this);
    }
}
