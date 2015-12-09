// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cu, bg, as, aq, 
//            at

final class ServiceManagerImpl extends cu
{

    private static ServiceManagerImpl aPX;
    private static final Object yS = new Object();
    private as aPO;
    private volatile aq aPP;
    private int aPQ;
    private boolean aPR;
    private boolean aPS;
    private boolean aPT;
    private at aPU;
    private boolean aPW;
    private boolean connected;

    private ServiceManagerImpl()
    {
        aPQ = 0x1b7740;
        aPR = true;
        aPS = false;
        connected = true;
        aPT = true;
        aPU = new at() {

            final ServiceManagerImpl aPY;

            
            {
                aPY = ServiceManagerImpl.this;
                super();
            }
        };
        aPW = false;
    }

    static as e(ServiceManagerImpl servicemanagerimpl)
    {
        return servicemanagerimpl.aPO;
    }

    public static ServiceManagerImpl getInstance()
    {
        if (aPX == null)
        {
            aPX = new ServiceManagerImpl();
        }
        return aPX;
    }

    public final void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (aPS) goto _L2; else goto _L1
_L1:
        bg.v("Dispatch call queued. Dispatch will run once initialization is complete.");
        aPR = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aq aq = aPP;
        new Runnable() {

            final ServiceManagerImpl aPY;

            public final void run()
            {
                ServiceManagerImpl.e(aPY);
            }

            
            {
                aPY = ServiceManagerImpl.this;
                super();
            }
        };
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
