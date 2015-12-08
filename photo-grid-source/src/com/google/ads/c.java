// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.text.TextUtils;
import com.google.ads.formats.NativeAd;
import com.google.android.gms.ads.AdListener;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            a, h

public abstract class c
    implements NativeAd
{

    private final Object a = new Object();
    private long b;
    private boolean c;
    private AdListener d;
    private h e;
    private a f;
    private JSONObject g;
    private String h[];

    public c()
    {
        b = 0L;
        c = false;
    }

    protected abstract String a();

    public void a(AdListener adlistener, h h1, a a1, JSONObject jsonobject, String as[])
    {
        d = adlistener;
        e = h1;
        f = a1;
        g = jsonobject;
        h = as;
    }

    public void performClick(int i)
    {
        long l = System.currentTimeMillis();
        if (b + 1000L >= l)
        {
            return;
        } else
        {
            b = l;
            _cls1 _lcls1 = new _cls1();
            a a1 = f;
            String s = String.valueOf("google.afma.nativeAds.handleClick({'ad': ");
            String s1 = String.valueOf(g.toString());
            String s2 = a();
            a1.a((new StringBuilder(String.valueOf(s).length() + 53 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", 'click': {'template': '").append(s2).append("', 'asset': '").append(i).append("'}})").toString(), _lcls1);
            return;
        }
    }

    public void recordImpression()
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
            }
            return;
        }
        c = true;
        obj;
        JVM INSTR monitorexit ;
        if (h != null)
        {
            obj = h;
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                CharSequence charsequence = obj[i];
                if (!TextUtils.isEmpty(charsequence))
                {
                    e.a(charsequence, h.a);
                }
            }

        }
        break MISSING_BLOCK_LABEL_83;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private class _cls1 extends AdListener
    {

        final c a;

        _cls1()
        {
            a = c.this;
            super();
        }
    }

}
