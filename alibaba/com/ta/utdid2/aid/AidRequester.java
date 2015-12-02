// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ta.utdid2.aid;

import android.content.Context;
import android.util.Log;
import com.ta.utdid2.android.utils.DebugUtils;
import com.ta.utdid2.android.utils.NetworkUtils;
import com.ut.device.AidCallback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.ta.utdid2.aid:
//            AidStorageController

public class AidRequester
{
    class a extends Thread
    {

        HttpPost a;
        String b;
        AidCallback c;
        String d;
        String e;
        String f;
        final AidRequester g;

        public String a()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public void run()
        {
            Object obj1;
            obj1 = null;
            if (c != null)
            {
                c.onAidEventChanged(1000, d);
            }
            DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
            try
            {
                obj = defaulthttpclient.execute(a);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (c != null)
                {
                    c.onAidEventChanged(1002, d);
                }
                Log.e(throw , ((Exception) (obj)).toString());
                obj = null;
            }
            if (obj == null) goto _L2; else goto _L1
_L1:
            try
            {
                obj = new BufferedReader(new InputStreamReader(((HttpResponse) (obj)).getEntity().getContent(), Charset.forName("UTF-8")));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (c != null)
                {
                    c.onAidEventChanged(1002, d);
                }
                Log.e(throw , ((Exception) (obj)).toString());
                obj = obj1;
            }
_L7:
            if (obj == null) goto _L4; else goto _L3
_L3:
            obj1 = ((BufferedReader) (obj)).readLine();
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (DebugUtils.DBG)
            {
                Log.d(throw , ((String) (obj1)));
            }
            b = ((String) (obj1));
            if (true) goto _L3; else goto _L5
_L5:
            if (obj != null)
            {
                try
                {
                    ((BufferedReader) (obj)).close();
                    if (DebugUtils.DBG)
                    {
                        Log.d(throw , "close the bufferreader");
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e(throw , ((IOException) (obj)).toString());
                }
            }
            if (c == null)
            {
                synchronized (throw g)
                {
                    throw g.notifyAll();
                }
                return;
            } else
            {
                String s = throw bd;
                c.onAidEventChanged(1001, s);
                AidStorageController.setAidValueToSP(throw g, e, s, f);
                return;
            }
_L2:
            Log.e(throw , "response is null!");
            obj = obj1;
            continue; /* Loop/switch isn't completed */
_L4:
            try
            {
                Log.e(throw , "BufferredReader is null!");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                if (c != null)
                {
                    c.onAidEventChanged(1002, d);
                }
                Log.e(throw , ((Exception) (obj1)).toString());
            }
              goto _L5
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public a(HttpPost httppost)
        {
            g = AidRequester.this;
            super();
            b = "";
            f = "";
            a = httppost;
        }

        public a(HttpPost httppost, AidCallback aidcallback, String s, String s1, String s2)
        {
            g = AidRequester.this;
            super();
            b = "";
            f = "";
            a = httppost;
            c = aidcallback;
            d = s;
            e = s1;
            f = s2;
        }
    }


    private static final String AIDFUNCNAME = "/get_aid/";
    private static final String AIDSERVER = "http://hydra.alibaba.com/";
    private static final String NAME_AID = "&aid=";
    private static final String NAME_ID = "&id=";
    private static final String NAME_RESULT_ACTION = "action";
    private static final String NAME_RESULT_AID = "aid";
    private static final String NAME_RESULT_ISERROR = "isError";
    private static final String NAME_RESULT_STATUS = "status";
    private static final String NAME_RESUTL_DATA = "data";
    private static final String NAME_TOKEN = "auth[token]=";
    private static final String NAME_TYPE = "&type=";
    private static final String RSP_ACTION_CHANGED = "changed";
    private static final String RSP_ACTION_NEW = "new";
    private static final String RSP_ACTION_UNCHANGED = "unchanged";
    private static final String RSP_ISERROR_FALSE = "false";
    private static final String RSP_ISERROR_TRUE = "true";
    private static final String RSP_STATUS_INVALID_APP = "404";
    private static final String RSP_STATUS_INVALID_TOKEN = "401";
    private static final String RSP_STATUS_OK = "200";
    private static final int SESSION_TIME_OUT = 1000;
    private static final String TAG = com/ta/utdid2/aid/AidRequester.getName();
    private static final String TYPE_UTDID = "utdid";
    private static final int WEAK_SESSION_TIME_OUT = 3000;
    private static AidRequester sAidRequester = null;
    private Context mContext;
    private Object mLock;

    public AidRequester(Context context)
    {
        mLock = new Object();
        mContext = context;
    }

    private static String getAidFromJsonRsp(String s, String s1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static AidRequester getInstance(Context context)
    {
        com/ta/utdid2/aid/AidRequester;
        JVM INSTR monitorenter ;
        if (sAidRequester == null)
        {
            sAidRequester = new AidRequester(context);
        }
        context = sAidRequester;
        com/ta/utdid2/aid/AidRequester;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static String getPostUrl(String s, String s1, String s2, String s3)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String postRest(String s, String s1, String s2, String s3)
    {
        s = getPostUrl(s, s1, s2, s3);
        int i;
        if (NetworkUtils.isConnectedToWeakNetwork(mContext))
        {
            i = 3000;
        } else
        {
            i = 1000;
        }
        if (DebugUtils.DBG)
        {
            Log.d(TAG, (new StringBuilder()).append("url:").append(s).append("; timeout:").append(i).toString());
        }
        s = new a(new HttpPost(s));
        s.start();
        synchronized (mLock)
        {
            mLock.wait(i);
        }
_L2:
        s = s.a();
        if (DebugUtils.DBG)
        {
            Log.d(TAG, (new StringBuilder()).append("mLine:").append(s).toString());
        }
        return getAidFromJsonRsp(s, s3);
        s2;
        s1;
        JVM INSTR monitorexit ;
        try
        {
            throw s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e(TAG, s1.toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void postRestAsync(String s, String s1, String s2, String s3, AidCallback aidcallback)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }





}
