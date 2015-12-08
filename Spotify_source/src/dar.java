// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;
import java.util.HashMap;
import java.util.Map;

public final class dar
{

    private static final Map b;
    final dba a;
    private daq c;

    public dar(DelegateStateId delegatestateid, dba dba)
    {
        c = (daq)b.get(delegatestateid);
        a = dba;
    }

    public final DelegateStateId a()
    {
        this;
        JVM INSTR monitorenter ;
        DelegateStateId delegatestateid = c.a();
        this;
        JVM INSTR monitorexit ;
        return delegatestateid;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(DelegateStateId delegatestateid, Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c.a().equals(delegatestateid))
        {
            daq daq1 = c;
            delegatestateid = (daq)b.get(delegatestateid);
            delegatestateid.a();
            c = delegatestateid;
            daq1.a();
            delegatestateid.a(this, bundle);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        delegatestateid;
        throw delegatestateid;
    }

    static 
    {
        b = new HashMap();
        Object obj = new dau();
        b.put(((daq) (obj)).a(), obj);
        obj = new dav();
        b.put(((daq) (obj)).a(), obj);
        obj = new dat();
        b.put(((daq) (obj)).a(), obj);
        obj = new das();
        b.put(((daq) (obj)).a(), obj);
    }
}
