// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            h, f

public class a
{

    private static final String a = "http://googleads.g.doubleclick.net/mads/static/sdk/native/";
    private static final long b;
    private final Context c;
    private final String d;
    private final String e[];

    a(Context context, String s, String as[])
    {
        c = context;
        d = s;
        e = as;
    }

    public static transient Future a(Context context, h h1, String s, String as[])
    {
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(h1.a(as[i], new _cls1()));
        }

        return f.a(new _cls2(arraylist, context, s));
    }

    public void a(String s, AdListener adlistener)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<html><head>");
        String as[] = e;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            stringbuilder.append("<script>");
            stringbuilder.append(s1);
            stringbuilder.append("</script>");
        }

        stringbuilder.append("</head><body><script>");
        stringbuilder.append(s);
        stringbuilder.append("</script></body></html>");
        b(stringbuilder.toString(), adlistener);
    }

    protected void b(String s, AdListener adlistener)
    {
        Object obj = new JSONObject();
        ((JSONObject) (obj)).put("ad_html", s);
        if (TextUtils.isEmpty(d))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        s = d;
_L1:
        ((JSONObject) (obj)).put("ad_base_url", s);
        s = new Bundle();
        s.putString("_ad", ((JSONObject) (obj)).toString());
        obj = new PublisherAdView(c);
        ((PublisherAdView) (obj)).setAdSizes(new AdSize[] {
            AdSize.BANNER
        });
        ((PublisherAdView) (obj)).setAdUnitId("a00000000000000");
        if (adlistener != null)
        {
            ((PublisherAdView) (obj)).setAdListener(adlistener);
        }
        ((PublisherAdView) (obj)).loadAd((new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder()).addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, s).build());
        (new Handler(Looper.getMainLooper())).postDelayed(new _cls3(((PublisherAdView) (obj))), b);
        return;
        try
        {
            s = a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
          goto _L1
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(10L);
    }

    private class _cls1
        implements h.a
    {

        public final String a()
        {
            return null;
        }

        public final String a(InputStream inputstream)
        {
            inputstream = h.a(inputstream);
            try
            {
                inputstream = new String(inputstream, "UTF8");
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
            return inputstream;
        }

        public final Object b()
        {
            return a();
        }

        public final Object b(InputStream inputstream)
        {
            return a(inputstream);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Callable
    {

        final ArrayList a;
        final Context b;
        final String c;

        public final a a()
        {
            String as[] = new String[a.size()];
            int i = 0;
_L4:
            if (i >= a.size())
            {
                break MISSING_BLOCK_LABEL_54;
            }
            as[i] = (String)((Future)a.get(i)).get();
            if (as[i] == null)
            {
                return null;
            }
            break MISSING_BLOCK_LABEL_80;
            a a1 = new a(b, c, as);
            return a1;
            Object obj;
            obj;
_L2:
            return null;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
            i++;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final Object call()
        {
            return a();
        }

        _cls2(ArrayList arraylist, Context context, String s)
        {
            a = arraylist;
            b = context;
            c = s;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final PublisherAdView a;
        final a b;

        public void run()
        {
            a.destroy();
        }

        _cls3(PublisherAdView publisheradview)
        {
            b = a.this;
            a = publisheradview;
            super();
        }
    }

}
