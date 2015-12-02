// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.umid;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.taobao.dp.DeviceSecuritySDK;
import com.taobao.dp.client.IInitResultListener;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.alibaba.wireless.security.open.umid:
//            IUMIDComponent, IUMIDInitListener, IUMIDInitListenerEx

public final class a
    implements IUMIDComponent, IInitResultListener
{

    private static final Object e = new Object();
    private Context a;
    private short b;
    private volatile boolean c;
    private ArrayList d;

    public a(Context context)
    {
        c = false;
        a = context;
        b = -1;
        d = new ArrayList();
    }

    public final void a()
    {
        c = true;
        Object obj = com.alibaba.wireless.security.open.a.a(a).b();
        try
        {
            obj = ((com.alibaba.wireless.security.open.staticdatastore.a) (obj)).getAppKeyByIndex(0, "");
        }
        catch (SecException secexception)
        {
            synchronized (e)
            {
                b = 0;
            }
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (((String) (obj)).length() > 0)
        {
            DeviceSecuritySDK.getInstance(a).initAsync(((String) (obj)), 0, null, this);
            return;
        }
        synchronized (e)
        {
            b = 0;
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String getSecurityToken()
        throws SecException
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public final void initUMID(String s, int i, String s1, IUMIDInitListenerEx iumidinitlistenerex)
        throws SecException
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public final void onInitFinished(String s, int i)
    {
        short word0 = 1;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() <= 0 || "000000000000000000000000".equals(s)) goto _L2; else goto _L3
_L3:
        boolean flag = true;
          goto _L4
_L9:
        b = word0;
        s = d.iterator();
_L6:
        IUMIDInitListener iumidinitlistener;
        do
        {
            if (!s.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            iumidinitlistener = (IUMIDInitListener)s.next();
        } while (iumidinitlistener == null);
        iumidinitlistener.onUMIDInitFinished(flag);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
_L2:
        flag = false;
          goto _L4
_L10:
        word0 = 0;
        if (true) goto _L8; else goto _L7
_L8:
        break; /* Loop/switch isn't completed */
_L7:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!flag) goto _L10; else goto _L9
    }

    public final void registerInitListener(IUMIDInitListener iumidinitlistener)
        throws SecException
    {
        boolean flag;
        flag = true;
        if (!c)
        {
            throw new SecException(901);
        }
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (b != -1) goto _L2; else goto _L1
_L1:
        if (iumidinitlistener == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        d.add(iumidinitlistener);
        obj;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        obj;
        JVM INSTR monitorexit ;
        if (iumidinitlistener == null) goto _L4; else goto _L3
_L3:
        if (b != 1)
        {
            flag = false;
        }
        iumidinitlistener.onUMIDInitFinished(flag);
        return;
        iumidinitlistener;
        throw iumidinitlistener;
    }

}
