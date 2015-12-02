// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLocation;
import com.ubercab.android.location.service.model.UberLocationRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class civ
{

    protected final Set a = Collections.synchronizedSet(new HashSet());
    private UberLocationRequest b;

    public civ()
    {
        b = UberLocationRequest.create();
    }

    public abstract UberLocation a();

    public void a(ciw ciw)
    {
        if (!a.contains(ciw))
        {
            a.add(ciw);
        }
    }

    public void a(UberLocationRequest uberlocationrequest)
    {
        this;
        JVM INSTR monitorenter ;
        b = uberlocationrequest;
        this;
        JVM INSTR monitorexit ;
        return;
        uberlocationrequest;
        throw uberlocationrequest;
    }

    public void b(ciw ciw)
    {
        a.remove(ciw);
    }

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    public UberLocationRequest e()
    {
        this;
        JVM INSTR monitorenter ;
        UberLocationRequest uberlocationrequest = b;
        this;
        JVM INSTR monitorexit ;
        return uberlocationrequest;
        Exception exception;
        exception;
        throw exception;
    }
}
