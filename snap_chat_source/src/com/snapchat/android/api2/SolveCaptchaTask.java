// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import Bt;
import IJ;
import PG;
import Qd;
import UC;
import UD;
import com.snapchat.android.security.SCPluginWrapper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oD;
import oO;
import pi;
import pn;

public class SolveCaptchaTask extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void F_();

        public abstract void a(boolean flag);

        public abstract void c();
    }


    private static final String PATH = "/bq/solve_captcha";
    public static int b044C044C044C044C044C044C = 0;
    public static int b044C044C044C044C044C044C = 2;
    public static int b044C044C044C044C044C044C = 17;
    public static int b044C044C044C044C044C044C = 1;
    private final String mCaptchaId;
    private final List mSelectedCaptchas;
    private final a mSolveCaptchaCallback;

    public SolveCaptchaTask(String s, List list, a a1)
    {
        mCaptchaId = s;
        mSelectedCaptchas = list;
        mSolveCaptchaCallback = a1;
        registerCallback(UD, this);
    }

    public static int b043E043E043E043E043E043E()
    {
        return 2;
    }

    public static int b044C044C044C044C044C044C()
    {
        return 17;
    }

    public Map getHeaders(pn pn)
    {
        Map map;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            map = super.getHeaders(pn);
            i = b044C044C044C044C044C044C;
            j = b044C044C044C044C044C044C;
            k = b044C044C044C044C044C044C;
            l = b044C044C044C044C044C044C;
            i1 = b044C044C044C044C044C044C;
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        try
        {
            b044C044C044C044C044C044C = 40;
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        b044C044C044C044C044C044C = 45;
        i = b044C044C044C044C044C044C();
        switch ((i * (b044C044C044C044C044C044C + i)) % b044C044C044C044C044C044C)
        {
        default:
            b044C044C044C044C044C044C = 89;
            b044C044C044C044C044C044C = 98;
            break;

        case 0: // '\0'
            break;
        }
        pn = (oO)pn;
        pn = ((oO) (pn)).mPayload;
        i = b044C044C044C044C044C044C();
        j = b044C044C044C044C044C044C;
        k = b044C044C044C044C044C044C();
        l = b044C044C044C044C044C044C;
        i1 = b044C044C044C044C044C044C;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        b044C044C044C044C044C044C = b044C044C044C044C044C044C();
        b044C044C044C044C044C044C = b044C044C044C044C044C044C();
        pn = SCPluginWrapper.generateHeader(pn, "/bq/solve_captcha");
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 166
    //                   1 215;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 166
    //                   1 215;
           goto _L1 _L2 _L3
_L3:
        i = b044C044C044C044C044C044C();
        j = b044C044C044C044C044C044C;
        k = b044C044C044C044C044C044C();
        l = b044C044C044C044C044C044C;
        i1 = b044C044C044C044C044C044C;
        if (((i + j) * k) % l == i1) goto _L5; else goto _L4
_L4:
        b044C044C044C044C044C044C = 92;
        b044C044C044C044C044C044C = 20;
        i = b044C044C044C044C044C044C;
        switch ((i * (b044C044C044C044C044C044C + i)) % b044C044C044C044C044C044C)
        {
        default:
            b044C044C044C044C044C044C = b044C044C044C044C044C044C();
            b044C044C044C044C044C044C = 95;
            break;

        case 0: // '\0'
            break;
        }
_L5:
        if (pn == null) goto _L7; else goto _L6
_L6:
        map.put("X-Snapchat-Client-Auth", pn);
        i = b044C044C044C044C044C044C();
        j = b044C044C044C044C044C044C;
        k = b043E043E043E043E043E043E();
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 364
    //                   0 375;
           goto _L8 _L9
_L9:
        break; /* Loop/switch isn't completed */
_L8:
        b044C044C044C044C044C044C = 78;
        b044C044C044C044C044C044C = b044C044C044C044C044C044C();
_L7:
        return map;
    }

    protected String getPath()
    {
        return "/bq/solve_captcha";
    }

    public pn getRequestPayload()
    {
        String s = Bt.q();
        if (s == null)
        {
            Bt.a();
            s = Bt.S();
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = mSelectedCaptchas.iterator();
        while (iterator.hasNext()) 
        {
            String s1;
            if (((Boolean)iterator.next()).booleanValue())
            {
                s1 = "1";
            } else
            {
                s1 = "0";
            }
            stringbuilder.append(s1);
        }
        Qd qd = buildAuthPayload((new UC()).a(mCaptchaId).b(stringbuilder.toString()));
        qd.username = s;
        return new oO(qd);
    }

    public void onJsonResult(final UD responsePayload, final pi networkResult)
    {
        PG.a(new Runnable() {

            final SolveCaptchaTask this$0;
            final pi val$networkResult;
            final UD val$responsePayload;

            public final void run()
            {
                onJsonResultMainThread(responsePayload, networkResult);
            }

            
            {
                this$0 = SolveCaptchaTask.this;
                responsePayload = ud;
                networkResult = pi1;
                super();
            }
        });
    }

    public volatile void onJsonResult(Object obj, pi pi1)
    {
        onJsonResult((UD)obj, pi1);
    }

    void onJsonResultMainThread(UD ud, pi pi1)
    {
        if (pi1.mResponseCode == 200)
        {
            pi1 = mSolveCaptchaCallback;
            boolean flag;
            if (ud != null && IJ.a(ud.a()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pi1.a(flag);
            return;
        }
        if (pi1.mResponseCode == 403)
        {
            mSolveCaptchaCallback.F_();
            return;
        } else
        {
            mSolveCaptchaCallback.c();
            return;
        }
    }
}
