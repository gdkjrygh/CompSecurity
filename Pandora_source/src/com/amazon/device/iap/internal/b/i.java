// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import android.os.RemoteException;
import com.amazon.android.Kiwi;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.licensing.LicenseFailurePromptContentMapper;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.RequestId;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazon.device.iap.internal.b:
//            e, b

public abstract class i extends AbstractCommandTask
{

    private static final String a = com/amazon/device/iap/internal/b/i.getSimpleName();
    private final com.amazon.device.iap.internal.b.e b;
    private final String c;
    private final String d;
    private final String e;
    private final Map f = new HashMap();
    private final LicenseFailurePromptContentMapper g = new LicenseFailurePromptContentMapper();
    private boolean h;
    private i i;
    private i j;
    private boolean k;

    public i(com.amazon.device.iap.internal.b.e e1, String s, String s1)
    {
        k = false;
        b = e1;
        c = e1.c().toString();
        d = s;
        e = s1;
        f.put("requestId", c);
        f.put("sdkVersion", "2.0.61.0");
        h = true;
        i = null;
        j = null;
    }

    private void a(PromptContent promptcontent)
    {
        if (promptcontent == null)
        {
            return;
        } else
        {
            promptcontent = new b(promptcontent);
            Kiwi.getPromptManager().present(promptcontent);
            return;
        }
    }

    public i a(boolean flag)
    {
        k = flag;
        return this;
    }

    public void a(i l)
    {
        i = l;
    }

    protected void a(String s, Object obj)
    {
        f.put(s, obj);
    }

    protected abstract boolean a(SuccessResult successresult)
        throws Exception;

    public void a_()
    {
        Kiwi.addCommandToCommandTaskPipeline(this);
    }

    protected com.amazon.device.iap.internal.b.e b()
    {
        return b;
    }

    public void b(i l)
    {
        j = l;
    }

    protected void b(boolean flag)
    {
        h = flag;
    }

    protected String c()
    {
        return c;
    }

    protected Map getCommandData()
    {
        return f;
    }

    protected String getCommandName()
    {
        return d;
    }

    protected String getCommandVersion()
    {
        return e;
    }

    protected boolean isExecutionNeeded()
    {
        return true;
    }

    protected final void onException(KiwiException kiwiexception)
    {
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("onException: exception = ").append(kiwiexception.getMessage()).toString());
        if ("UNHANDLED_EXCEPTION".equals(kiwiexception.getType()) && "2.0".equals(e) && j != null)
        {
            j.a(k);
            j.a_();
        } else
        {
            if (h)
            {
                a(g.map(kiwiexception));
            }
            if (!k)
            {
                b.b();
                return;
            }
        }
    }

    protected final void onFailure(FailureResult failureresult)
        throws RemoteException, KiwiException
    {
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("onFailure: result = ").append(failureresult).toString());
        if (failureresult == null) goto _L2; else goto _L1
_L1:
        String s = (String)failureresult.getExtensionData().get("maxVersion");
        if (s == null || !s.equalsIgnoreCase("1.0")) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L9:
        if (!flag || j == null) goto _L5; else goto _L4
_L4:
        j.a(k);
        j.a_();
_L7:
        return;
_L5:
        if (h)
        {
            a(new PromptContent(failureresult.getDisplayableName(), failureresult.getDisplayableMessage(), failureresult.getButtonLabel(), failureresult.show()));
        }
        if (k) goto _L7; else goto _L6
_L6:
        b.b();
        return;
_L2:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        String s;
        s = (String)successresult.getData().get("errorMessage");
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("onSuccess: result = ").append(successresult).append(", errorMessage: ").append(s).toString());
        if (!com.amazon.device.iap.internal.util.d.a(s)) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = false;
        boolean flag1;
        try
        {
            flag1 = a(successresult);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("Error calling onResult: ").append(successresult).toString());
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
_L9:
        if (!flag || i == null) goto _L4; else goto _L3
_L3:
        i.a_();
_L6:
        return;
_L4:
        if (k) goto _L6; else goto _L5
_L5:
        if (flag)
        {
            b.a();
            return;
        } else
        {
            b.b();
            return;
        }
_L2:
        if (k) goto _L6; else goto _L7
_L7:
        b.b();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
