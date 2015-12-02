// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

final class ahl
    implements Runnable
{

    final Map a;
    final ahk b;

    ahl(ahk ahk1, Map map)
    {
        b = ahk1;
        a = map;
        super();
    }

    public final void run()
    {
        ahk;
        JVM INSTR monitorenter ;
        boolean flag = ahs.b(ahk.a(b));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        ahk;
        JVM INSTR monitorexit ;
        return;
        Object obj = aho.a(ahk.a(b));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        flag = aid.a(((ahp) (obj)).a());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        ahk;
        JVM INSTR monitorexit ;
        Exception exception;
        return;
        throw exception;
        exception = ahk.a(b, a);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        long l;
        if (!exception.b())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        exception = ahk.a(b);
        l = System.currentTimeMillis();
        exception = exception.getSharedPreferences("vkeyid_settings", 0).edit();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        try
        {
            exception.putString("dynamic_valid", aiv.a(aiv.a(), String.valueOf(l)));
            exception.commit();
        }
        catch (Throwable throwable) { }
        ahk;
        JVM INSTR monitorexit ;
        return;
label0:
        {
            if (exception == null)
            {
                break label0;
            }
            try
            {
                ahw.a(ahk.a(b), (new StringBuilder("Server error, result:")).append(exception.g()).toString());
            }
            catch (Throwable throwable1) { }
            finally
            {
                ahk;
            }
        }
        break MISSING_BLOCK_LABEL_141;
        ahw.a(ahk.a(b), "Server error, dynamic data upload fail!");
        break MISSING_BLOCK_LABEL_141;
    }
}
