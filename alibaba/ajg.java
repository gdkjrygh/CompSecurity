// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ajg
    implements ajf
{

    final ajc a;

    ajg(ajc ajc1)
    {
        a = ajc1;
        super();
    }

    public final void a(SensorEvent sensorevent)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj1 = (String)ajc.a().get(sensorevent.sensor.getType(), "Unknown Sensor");
        if (ajc.a(a).get(obj1) != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new ArrayList();
        ajc.a(a).put(obj1, obj);
_L1:
        obj1 = a;
        ((List) (obj)).add(ajc.a(sensorevent.values));
        this;
        JVM INSTR monitorexit ;
        return;
        obj = (List)ajc.a(a).get(obj1);
          goto _L1
        sensorevent;
        throw sensorevent;
    }
}
