// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.d;
import com.cleanmaster.ui.app.utils.a;
import java.net.URLEncoder;
import java.util.HashMap;

// Referenced classes of package com.picksinit:
//            b

public class PicksMob extends b
{

    private com.cleanmaster.util.a mAesUtils;
    private HashMap mParse302UrlMaps;

    public PicksMob()
    {
    }

    public void clearParse302Url(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mParse302UrlMaps == null || !mParse302UrlMaps.containsKey(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        i = ((Integer)mParse302UrlMaps.remove(Integer.valueOf(i))).intValue();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        a.a().a(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void doFaceBookClickReport(String s, String s1, String s2, String s3, int i)
    {
        String s4 = "";
        try
        {
            if (!TextUtils.isEmpty(s1))
            {
                if (mAesUtils == null)
                {
                    mAesUtils = new com.cleanmaster.util.a();
                }
                s4 = URLEncoder.encode(mAesUtils.a(s1), "utf-8");
            }
            d.b(s, s4, s2, s3, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void doFaceBookViewReport(String s, String s1, String s2, String s3, int i)
    {
        String s4 = "";
        try
        {
            if (!TextUtils.isEmpty(s1))
            {
                if (mAesUtils == null)
                {
                    mAesUtils = new com.cleanmaster.util.a();
                }
                s4 = URLEncoder.encode(mAesUtils.a(s1), "utf-8");
            }
            d.a(s, s4, s2, s3, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void downloadSuccessReport(String s, Ad ad, String s1)
    {
        d.c(s, ad, s1);
    }

    public com.cleanmaster.down.a getExtraDownLoader()
    {
        return null;
    }

    public boolean ishaveInternalDown()
    {
        return false;
    }

    public void preLoad302Ad(Ad ad, int i)
    {
        while (ad == null || android.os.Build.VERSION.SDK_INT < 11 || !ad.isPreloadUrl()) 
        {
            return;
        }
        a.a().a(i, ad.getPkgUrl(), ad.getPkg(), "", null);
    }

    public void reportDowned(String s)
    {
    }

    public void reportInstall(String s)
    {
    }

    public void setDownLoader(com.cleanmaster.down.a a1)
    {
    }
}
