// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.Log;
import java.io.File;

// Referenced classes of package crittercism.android:
//            l, at, x, ae, 
//            q

public final class j
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;

    public j(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        a = uncaughtexceptionhandler;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj;
        boolean flag;
        obj = l.i();
        at at1 = ((l) (obj)).e;
        at1.a(((h) (obj)));
        flag = at1.d();
        if (flag) goto _L2; else goto _L1
_L1:
        File file = ((l) (obj)).s;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (!file.exists())
        {
            (new StringBuilder("path = ")).append(file.getAbsolutePath());
            file.createNewFile();
        }
_L9:
        ((l) (obj)).h.a(throwable);
        ((l) (obj)).a(true);
        ((l) (obj)).m.a(((h) (obj)), ae.b.a(), ae.b.b());
_L2:
        if (a == null || (a instanceof j)) goto _L4; else goto _L3
_L3:
        obj = a;
_L7:
        ((Thread.UncaughtExceptionHandler) (obj)).uncaughtException(thread, throwable);
_L4:
        return;
        Exception exception2;
        exception2;
        Exception exception;
        try
        {
            (new StringBuilder("Exception in setDidCrashOnLastAppLoad: ")).append(exception2.getClass().getName());
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
        finally
        {
            if (a != null && !(a instanceof j))
            {
                a.uncaughtException(thread, throwable);
            }
            throw exception1;
        }
        Log.w("CrittercismExceptionHandler", "Failed to log error with Crittercism.  Please contact us at support@crittercism.com.");
        (new StringBuilder("Did not log error to Crittercism.  EXCEPTION: ")).append(exception.getClass().getName());
        if (a == null || (a instanceof j)) goto _L4; else goto _L5
_L5:
        exception = a;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
    }
}
