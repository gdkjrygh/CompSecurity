// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.mtop;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.taobao.securityjni.GlobalInit;
import com.taobao.securityjni.SecretUtil;
import com.taobao.securityjni.tools.DataContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.android.agoo.log.AgooLog;
import org.android.agoo.net.async.RequestParams;
import org.android.agoo.util.PhoneUtil;
import org.android.agoo.util.StringUtils;

// Referenced classes of package org.android.agoo.net.mtop:
//            MtopRequest

public class MtopRequestHelper
{

    public static final String SPLIT_STR = "&";
    private static final String TAG = "MtopRequestHelper";

    public MtopRequestHelper()
    {
    }

    public static final void checkAppKeyAndAppSecret(MtopRequest mtoprequest, String s, String s1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static final long getTime()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static final RequestParams getUrlWithRequestParams(Context context, MtopRequest mtoprequest)
    {
        RequestParams requestparams;
        if (mtoprequest == null)
        {
            return null;
        }
        String s;
        String s1;
        Object obj;
        Object obj1;
        String s2;
        long l;
        long l1;
        try
        {
            requestparams = new RequestParams();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        try
        {
            requestparams.put("api", mtoprequest.getApi());
            requestparams.put("v", mtoprequest.getV());
            l1 = mtoprequest.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return requestparams;
        }
        l = l1;
        if (l1 > 0L)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l = getTime();
        requestparams.put("t", (new StringBuilder()).append("").append(l).toString());
        s = null;
        s1 = null;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = PhoneUtil.getImei(context);
        s1 = PhoneUtil.getImsi(context);
        requestparams.put("imei", s);
        requestparams.put("imsi", s1);
        requestparams.put("ttid", mtoprequest.getTtId());
        requestparams.put("appKey", mtoprequest.getAppKey());
        if (!StringUtils.isEmpty(mtoprequest.getDeviceId()))
        {
            requestparams.put("deviceId", mtoprequest.getDeviceId());
        }
        obj = mtoprequest.getSysParams();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        obj = ((Map) (obj)).entrySet().iterator();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
_L2:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_280;
            }
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        } while (obj1 == null);
        if (StringUtils.isEmpty((String)((java.util.Map.Entry) (obj1)).getKey()) || StringUtils.isEmpty((String)((java.util.Map.Entry) (obj1)).getValue())) goto _L2; else goto _L1
_L1:
        requestparams.put((String)((java.util.Map.Entry) (obj1)).getKey(), (String)((java.util.Map.Entry) (obj1)).getValue());
          goto _L2
        obj = param2String(mtoprequest.getParams());
        if (StringUtils.isEmpty(((String) (obj))))
        {
            AgooLog.w("MtopRequestHelper", "data==null");
        }
        obj1 = mtoprequest.getAppKey();
        if (StringUtils.isEmpty(((String) (obj1))))
        {
            AgooLog.w("MtopRequestHelper", "appkey==null");
        }
        s2 = mtoprequest.getAppSecret();
        if (!mtoprequest.isHasSigin()) goto _L4; else goto _L3
_L3:
        if (!StringUtils.isEmpty(s2)) goto _L6; else goto _L5
_L5:
        context = toV3Sign(context, ((String) (obj1)), mtoprequest.getApi(), mtoprequest.getV(), s, s1, l, ((String) (obj)), mtoprequest.getEcode());
        if (!TextUtils.isEmpty(context)) goto _L8; else goto _L7
_L7:
        AgooLog.d("MtopRequestHelper", "SecretUtil[failed]");
_L16:
        if (StringUtils.isEmpty(((String) (obj)))) goto _L10; else goto _L9
_L9:
        requestparams.put("sign", context);
_L4:
        if (StringUtils.isEmpty(((String) (obj)))) goto _L12; else goto _L11
_L11:
        requestparams.put("data", ((String) (obj)));
_L14:
        if (!StringUtils.isEmpty(mtoprequest.getSId()))
        {
            requestparams.put("sid", mtoprequest.getSId());
        }
          goto _L13
_L8:
        AgooLog.d("MtopRequestHelper", (new StringBuilder()).append("SecretUtil[").append(context).append("]").toString());
        continue; /* Loop/switch isn't completed */
_L6:
        context = toV3Sign(((String) (obj1)), s2, mtoprequest.getApi(), mtoprequest.getV(), s, s1, l, ((String) (obj)), mtoprequest.getEcode());
        continue; /* Loop/switch isn't completed */
_L10:
        AgooLog.w("MtopRequestHelper", "sign==null");
          goto _L4
_L12:
        AgooLog.w("MtopRequestHelper", "data==null");
          goto _L14
_L13:
        return requestparams;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static final String param2String(Map map)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static final String toV3Sign(Context context, String s, String s1, String s2, String s3, String s4, long l, 
            String s5, String s6)
    {
        try
        {
            GlobalInit.GlobalSecurityInitSyncSDK((ContextWrapper)context);
            context = new SecretUtil((ContextWrapper)context);
            HashMap hashmap = new HashMap();
            hashmap.put("API", s1);
            hashmap.put("DATA", s5);
            hashmap.put("IMEI", s3);
            hashmap.put("IMSI", s4);
            hashmap.put("TIME", (new StringBuilder()).append("").append(l).toString());
            hashmap.put("V", s2);
            if (!StringUtils.isEmpty(s6))
            {
                hashmap.put("ECODE", s6);
            }
            s1 = new DataContext();
            s1.extData = s.getBytes();
            context = context.getSign(hashmap, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AgooLog.w("MtopRequestHelper", "toV3Sign", context);
            return null;
        }
        return context;
    }

    private static final String toV3Sign(String s, String s1, String s2, String s3, String s4, String s5, long l, 
            String s6, String s7)
        throws Throwable
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
