// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class jvf
    implements jyx
{

    private jva a;

    jvf(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void a(jyw jyw)
    {
        obj = (juy)jyw;
        if (((juy) (obj)).a_().b()) goto _L2; else goto _L1
_L1:
        jva.b().d("Connection was not successful", new Object[0]);
        jva.c(a);
_L4:
        return;
_L2:
        jva.b().a("startRemoteDisplay successful", new Object[0]);
        synchronized (jva.d())
        {
            if (jva.e() != null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            jva.b().a("Remote Display started but session already cancelled", new Object[0]);
            jva.c(a);
        }
        return;
        obj;
        jyw;
        JVM INSTR monitorexit ;
        throw obj;
        jyw;
        JVM INSTR monitorexit ;
        jyw = ((juy) (obj)).b();
        if (jyw != null)
        {
            jva.a(a, jyw);
        } else
        {
            jva.b().d("Cast Remote Display session created without display", new Object[0]);
        }
        jva.c().set(false);
        if (jva.d(a) != null && jva.e(a) != null)
        {
            try
            {
                jva.d(a).unbindService(jva.e(a));
            }
            // Misplaced declaration of an exception variable
            catch (jyw jyw)
            {
                jva.b().a("No need to unbind service, already unbound", new Object[0]);
            }
            jva.a(a, null);
            jva.a(a, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
