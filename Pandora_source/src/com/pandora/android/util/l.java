// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import p.cm.ad;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            s

class l
{

    private static String a(aa aa1)
    {
        String s1 = aa1.H();
        if (!com.pandora.android.util.s.a(s1))
        {
            aa1 = String.format("http://www.amazon.com/dp/%s?tag=wwwpandoracom-20", new Object[] {
                s1
            });
            p.df.a.a("KindleStoreDelegate", "KindleStoreDelegate.buildKindleStoreUrl() --> Old Amazon API NOT AVAILABLE.  building songUrl");
            return aa1;
        }
        s1 = aa1.z();
        if (!com.pandora.android.util.s.a(s1))
        {
            p.df.a.a("KindleStoreDelegate", "KindleStoreDelegate.buildKindleStoreUrl() --> Old Amazon API NOT AVAILABLE.  building albumUrl");
            return s1;
        } else
        {
            aa1 = String.format("http://www.amazon.com/gp/search/?index=music&field-artist=%s&field-title=%s", new Object[] {
                aa1.t(), aa1.s()
            });
            p.df.a.a("KindleStoreDelegate", "KindleStoreDelegate.buildKindleStoreUrl() --> Old Amazon API NOT AVAILABLE.  building searchUrl");
            return aa1;
        }
    }

    static void a(Context context, aa aa1, com.pandora.radio.data.t.a a1)
    {
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        while (aa1 == null || aa1.M() || !aa1.j()) 
        {
            return;
        }
        s3 = aa1.t();
        s4 = aa1.u();
        s5 = aa1.s();
        s2 = "";
        s1 = "";
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.t.a.values().length];
                try
                {
                    a[com.pandora.radio.data.t.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.t.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.t.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.util._cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 234
    //                   2 267
    //                   3 277;
           goto _L1 _L2 _L3 _L4
_L1:
        p.df.a.b("KindleStoreDelegate", "Unexpected TrackType", new Throwable());
_L7:
        Intent intent;
        intent = new Intent();
        intent.setFlags(0x10000000);
        intent.setAction("com.amazon.mp3.action.EXTERNAL_EVENT");
        intent.putExtra("com.amazon.mp3.extra.EXTERNAL_EVENT_TYPE", "com.amazon.mp3.type.SEARCH");
        intent.putExtra("com.amazon.mp3.extra.REFERRER_NAME", "Pandora");
        if (a1 != com.pandora.radio.data.t.a.c) goto _L6; else goto _L5
_L5:
        intent.putExtra("com.amazon.mp3.extra.SEARCH_TYPE", 0);
        intent.putExtra("com.amazon.mp3.extra.SEARCH_STRING", s2);
_L8:
        p.df.a.a("KindleStoreDelegate", (new StringBuilder()).append("KindleStoreDelegate.launchAmazonStore() --> trying NEW Amazon API.  Intent = ").append(intent.toUri(1)).toString());
        context.startActivity(intent);
_L9:
        (new ad(b.a.b(), a(aa1), b(aa1).name(), aa1)).a_(new Object[0]);
        return;
_L2:
        s2 = (new StringBuilder()).append(s3).append(" ").append(s4).toString();
        s1 = "vnd.android.cursor.item/album";
          goto _L7
_L3:
        s1 = "vnd.android.cursor.item/artist";
        s2 = s3;
          goto _L7
_L4:
        s1 = aa1.H();
        p.df.a.c("KindleStoreDelegate", (new StringBuilder()).append("asin: ").append(s1).toString());
        if (com.pandora.android.util.s.a(s1))
        {
            s1 = (new StringBuilder()).append(s3).append(" ").append(s5).toString();
        }
        p.df.a.c("KindleStoreDelegate", (new StringBuilder()).append("query: ").append(s1).toString());
        s2 = s1;
        s1 = "audio/*";
          goto _L7
_L6:
        intent.putExtra("com.amazon.mp3.extra.SEARCH_TYPE", 1);
        intent.putExtra("com.amazon.mp3.extra.SEARCH_STRING", s2);
          goto _L8
        a1;
        try
        {
            intent.setAction("android.intent.action.MEDIA_SEARCH");
            intent.putExtra("query", s2);
            intent.putExtra("android.intent.extra.artist", s3);
            intent.putExtra("android.intent.extra.album", s4);
            intent.putExtra("android.intent.extra.title", s5);
            intent.putExtra("android.intent.extra.focus", s1);
            intent.setComponent(new ComponentName("com.amazon.mp3", "com.amazon.mp3.android.client.SearchActivity"));
            p.df.a.a("KindleStoreDelegate", (new StringBuilder()).append("KindleStoreDelegate.launchAmazonStore() --> New Amazon API NOT AVAILABLE. Trying OLD API.  Intent = ").append(intent.toUri(1)).toString());
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (com.pandora.radio.data.t.a a1)
        {
            a1 = a(aa1);
            p.df.a.a("KindleStoreDelegate", (new StringBuilder()).append("KindleStoreDelegate.launchAmazonStore() --> Old Amazon API NOT AVAILABLE.  Launching in browser : Url = ").append(a1).toString());
            com.pandora.android.activity.a.a(context, a1);
        }
          goto _L9
    }

    private static p.cm.ad.a b(aa aa1)
    {
        if (com.pandora.android.util.s.a(aa1.H()) && com.pandora.android.util.s.a(aa1.z()))
        {
            return p.cm.ad.a.b;
        } else
        {
            return p.cm.ad.a.a;
        }
    }
}
