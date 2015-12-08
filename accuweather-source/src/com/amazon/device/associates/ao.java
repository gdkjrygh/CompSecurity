// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import com.amazon.android.Kiwi;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.licensing.LicenseFailurePromptContentMapper;
import com.amazon.venezia.command.FailureResult;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            RequestId, ay, bu, x, 
//            az

abstract class ao extends AbstractCommandTask
{

    private static final String b = com/amazon/device/associates/ao.getSimpleName();
    protected final ay a;
    private final String c;
    private final String d;
    private final RequestId e;
    private boolean f;
    private final Map g = new HashMap();
    private final LicenseFailurePromptContentMapper h = new LicenseFailurePromptContentMapper();

    ao(String s, String s1, RequestId requestid, ay ay1)
    {
        e = requestid;
        c = s;
        d = s1;
        f = false;
        a = ay1;
        g.put("requestId", e.toString());
        g.put("sdkVersion", a.a());
    }

    protected abstract void a();

    protected void a(String s, Object obj)
    {
        g.put(s, obj);
    }

    protected void a(String s, JSONObject jsonobject)
    {
        android.content.Context context = a.b();
        Kiwi.addCommandToCommandTaskPipeline(new bu(b(), s, jsonobject.toString(), a), context);
    }

    protected void a(boolean flag)
    {
        f = flag;
    }

    protected boolean a(String s, String s1, JSONObject jsonobject)
    {
        String s2;
        String s3;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        s3 = obj;
        s2 = obj1;
        String s4 = a.a();
        s3 = obj;
        s2 = obj1;
        String s5 = jsonobject.getString("productType");
        s3 = obj;
        s2 = obj1;
        String s6 = jsonobject.getString("productId");
        s3 = obj;
        s2 = obj1;
        String s7 = jsonobject.getString("purchaseToken");
        s3 = obj;
        s2 = obj1;
        String s8 = jsonobject.getString("receiptId");
        s3 = obj;
        s2 = obj1;
        int i = jsonobject.getInt("quantity");
        s3 = obj;
        s2 = obj1;
        Date date1 = new Date(jsonobject.getLong("purchaseDate"));
        s3 = obj;
        s2 = obj1;
        if (!jsonobject.getBoolean("isCanceled")) goto _L2; else goto _L1
_L1:
        s3 = obj;
        s2 = obj1;
        Date date = new Date(jsonobject.getLong("cancelDate"));
_L6:
        s3 = obj;
        s2 = obj1;
        s = String.format("%s|%s|%s|%s|%s|%s|%s|%d|%tQ|%tQ", new Object[] {
            s4, s, s1, s6, s5, s7, s8, Integer.valueOf(i), date1, date
        });
        s3 = obj;
        s2 = s;
        s1 = jsonobject.getString("signature");
        s3 = s1;
        s2 = s;
        x.b(b, (new StringBuilder()).append("string2sign:\n").append(s).append("\nsignature:\n").append(s1).toString());
        s3 = s1;
        s2 = s;
        boolean flag = Kiwi.isSignedByKiwi(s, s1);
        s2 = s;
        s = s1;
_L4:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        s1 = new JSONObject();
        s1.put("stringToSign", s2);
        s1.put("signature", s);
        a("SDKReceiptVerificationFailed", ((JSONObject) (s1)));
        return flag;
_L2:
        date = null;
        continue; /* Loop/switch isn't completed */
        s;
        x.a(b, (new StringBuilder()).append("error in verifyReceipt: ").append(s).toString());
        s = s3;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        x.b(b, (new StringBuilder()).append("error calling submitMetric: ").append(s).toString());
        return flag;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected RequestId b()
    {
        return e;
    }

    protected Map getCommandData()
    {
        return g;
    }

    protected String getCommandName()
    {
        return c;
    }

    protected String getCommandVersion()
    {
        return d;
    }

    protected boolean isExecutionNeeded()
    {
        return true;
    }

    protected void onException(KiwiException kiwiexception)
    {
        x.b(b, (new StringBuilder()).append("onException, result: ").append(kiwiexception.getMessage()).toString());
        PromptManager promptmanager;
        try
        {
            if (!f)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            promptmanager = Kiwi.getPromptManager();
            kiwiexception = h.map(kiwiexception);
        }
        // Misplaced declaration of an exception variable
        catch (KiwiException kiwiexception)
        {
            x.a(b, (new StringBuilder()).append("error in onException: ").append(kiwiexception).toString());
            return;
        }
        if (kiwiexception == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        promptmanager.present(new az(kiwiexception));
        a();
        return;
    }

    protected void onFailure(FailureResult failureresult)
        throws RemoteException, KiwiException
    {
        if (failureresult == null)
        {
            x.b(b, "onFailure: null result");
            return;
        }
        x.b(b, (new StringBuilder()).append("onFailure: result message: ").append(failureresult.getDisplayableMessage()).toString());
        if (f)
        {
            failureresult = new az(new PromptContent(failureresult.getDisplayableName(), failureresult.getDisplayableMessage(), failureresult.getButtonLabel(), failureresult.show()));
            Kiwi.getPromptManager().present(failureresult);
        }
        a();
    }

}
