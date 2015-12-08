// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class lhm extends lgx
{

    public final lhj b;

    public lhm(Context context, Looper looper, jyq jyq, jys jys, String s, kax kax1)
    {
        this(context, looper, jyq, jys, s, kax1, CopresenceApiOptions.a);
    }

    private lhm(Context context, Looper looper, jyq jyq, jys jys, String s, kax kax1, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, jyq, jys, s, kax1);
        b = new lhj(context, a);
        kax1.a();
    }

    public final void a()
    {
        lhj lhj1 = b;
        lhj1;
        JVM INSTR monitorenter ;
        boolean flag = j();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj2 = b;
        Object obj = ((lhj) (obj2)).c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = ((lhj) (obj2)).c.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj3 = (lhl)iterator.next();
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        ((lhd)((lhj) (obj2)).a.b()).a(LocationRequestUpdateData.a(((lim) (obj3))));
          goto _L6
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        Object obj1;
        try
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
_L2:
        super.a();
        lhj1;
        JVM INSTR monitorexit ;
        return;
_L4:
        ((lhj) (obj2)).c.clear();
        iterator = ((lhj) (obj2)).d.values().iterator();
_L7:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_207;
            }
            obj3 = (lhk)iterator.next();
        } while (obj3 == null);
        ((lhd)((lhj) (obj2)).a.b()).a(LocationRequestUpdateData.a(((lij) (obj3))));
          goto _L7
        ((lhj) (obj2)).d.clear();
        obj;
        JVM INSTR monitorexit ;
        obj = b;
        flag = ((lhj) (obj)).b;
        if (!flag) goto _L2; else goto _L8
_L8:
        ((lhj) (obj)).a.a();
        ((lhd)((lhj) (obj)).a.b()).a(false);
        obj.b = false;
          goto _L2
        obj1;
        throw new IllegalStateException(((Throwable) (obj1)));
        lhj1;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final boolean p()
    {
        return true;
    }
}
