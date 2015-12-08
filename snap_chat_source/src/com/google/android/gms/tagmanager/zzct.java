// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcs, zzbk, zzbf, zzar, 
//            zzbx, zzau, zzat

class zzct extends zzcs
{

    private static final Object zzBQ = new Object();
    private static zzct zzaAF;
    private boolean connected;
    private Handler handler;
    private boolean zzaAA;
    private boolean zzaAB;
    private zzau zzaAC;
    private zzbk zzaAD;
    private boolean zzaAE;
    private Context zzaAv;
    private zzat zzaAw;
    private volatile zzar zzaAx;
    private int zzaAy;
    private boolean zzaAz;

    private zzct()
    {
        zzaAy = 0x1b7740;
        zzaAz = true;
        zzaAA = false;
        connected = true;
        zzaAB = true;
        zzaAC = new zzau() {

            final zzct zzaAG;

            public void zzD(boolean flag)
            {
                zzaAG.zzb(flag, zzct.zza(zzaAG));
            }

            
            {
                zzaAG = zzct.this;
                super();
            }
        };
        zzaAE = false;
    }

    static boolean zza(zzct zzct1)
    {
        return zzct1.connected;
    }

    static int zzb(zzct zzct1)
    {
        return zzct1.zzaAy;
    }

    static boolean zzc(zzct zzct1)
    {
        return zzct1.zzaAE;
    }

    static Handler zzd(zzct zzct1)
    {
        return zzct1.handler;
    }

    static zzat zze(zzct zzct1)
    {
        return zzct1.zzaAw;
    }

    private void zzfF()
    {
        zzaAD = new zzbk(this);
        zzaAD.zzD(zzaAv);
    }

    private void zzfI()
    {
        handler = new Handler(zzaAv.getMainLooper(), new android.os.Handler.Callback() {

            final zzct zzaAG;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && zzct.zzfK().equals(message.obj))
                {
                    zzaAG.dispatch();
                    if (zzct.zzb(zzaAG) > 0 && !zzct.zzc(zzaAG))
                    {
                        zzct.zzd(zzaAG).sendMessageDelayed(zzct.zzd(zzaAG).obtainMessage(1, zzct.zzfK()), zzct.zzb(zzaAG));
                    }
                }
                return true;
            }

            
            {
                zzaAG = zzct.this;
                super();
            }
        });
        if (zzaAy > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzBQ), zzaAy);
        }
    }

    static Object zzfK()
    {
        return zzBQ;
    }

    public static zzct zztR()
    {
        if (zzaAF == null)
        {
            zzaAF = new zzct();
        }
        return zzaAF;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaAA) goto _L2; else goto _L1
_L1:
        zzbf.zzab("Dispatch call queued. Dispatch will run once initialization is complete.");
        zzaAz = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaAx.zzc(new Runnable() {

            final zzct zzaAG;

            public void run()
            {
                zzct.zze(zzaAG).dispatch();
            }

            
            {
                zzaAG = zzct.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void zzE(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzb(zzaAE, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zza(Context context, zzar zzar1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = zzaAv;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaAv = context.getApplicationContext();
        if (zzaAx == null)
        {
            zzaAx = zzar1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void zzb(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaAE != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = connected;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (zzaAy > 0)
        {
            handler.removeMessages(1, zzBQ);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzaAy > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzBQ), zzaAy);
        }
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        zzbf.zzab(stringbuilder.append(((String) (obj))).toString());
        zzaAE = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void zzfJ()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaAE && connected && zzaAy > 0)
        {
            handler.removeMessages(1, zzBQ);
            handler.sendMessage(handler.obtainMessage(1, zzBQ));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    zzat zztS()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaAw != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (zzaAv == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        zzaAw = new zzbx(zzaAC, zzaAv);
        zzat zzat;
        if (handler == null)
        {
            zzfI();
        }
        zzaAA = true;
        if (zzaAz)
        {
            dispatch();
            zzaAz = false;
        }
        if (zzaAD == null && zzaAB)
        {
            zzfF();
        }
        zzat = zzaAw;
        this;
        JVM INSTR monitorexit ;
        return zzat;
    }

}
