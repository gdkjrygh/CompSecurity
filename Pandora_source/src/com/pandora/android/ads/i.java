// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import java.util.Date;
import java.util.List;
import p.df.a;

// Referenced classes of package com.pandora.android.ads:
//            h, e

class i
    implements Runnable
{

    private final h a;
    private final String b;
    private final e.a c;
    private final String d;
    private final com.pandora.radio.util.a.a e;

    i(h h1, String s1, e.a a1, String s2, com.pandora.radio.util.a.a a2)
    {
        a = h1;
        b = s1;
        c = a1;
        d = s2;
        e = a2;
    }

    private static int a(af af1)
    {
        af1 = af1.l();
        if (!com.pandora.radio.util.i.a(af1))
        {
            if (!"m".equals(af1 = af1.substring(0, 1).toLowerCase()))
            {
                return !"f".equals(af1) ? 0 : 2;
            }
        }
        return 1;
    }

    private static String a(Uri uri)
    {
        return String.format("/%d/%s", new Object[] {
            Integer.valueOf(4204), b(uri)
        });
    }

    private static String a(List list, int j)
    {
        list = (String)list.get(j);
        j = list.indexOf(';');
        if (j <= 0)
        {
            j = list.length();
        }
        return list.subSequence(0, j).toString();
    }

    private static String b(Uri uri)
    {
        List list = uri.getPathSegments();
        String s2 = "";
        int j = 0;
        do
        {
label0:
            {
                String s1;
label1:
                {
                    uri = s2;
                    if (list != null)
                    {
                        uri = s2;
                        if (j < list.size())
                        {
                            s1 = a(list, j);
                            if (s.a(s1) || !s1.startsWith("pand"))
                            {
                                break label0;
                            }
                            if (j + 1 < list.size())
                            {
                                uri = a(list, j + 1);
                            } else
                            {
                                uri = null;
                            }
                            if (!s.a(uri))
                            {
                                break label1;
                            }
                            uri = s1;
                        }
                    }
                    return uri;
                }
                return String.format("%s/%s", new Object[] {
                    s1, uri
                });
            }
            j++;
        } while (true);
    }

    public void run()
    {
        Object obj = Uri.parse(b);
        PublisherAdView publisheradview = a.a(a(((Uri) (obj))));
        if (publisheradview == null)
        {
            p.df.a.a("LoadGoogleAdRunnable", "AdView not initialized");
            c.a(null, d);
            return;
        }
        if ((e)publisheradview.getTag() == null)
        {
            obj = new e(c, d, publisheradview, a, e);
            publisheradview.setTag(obj);
            publisheradview.setAdListener(((com.google.android.gms.ads.AdListener) (obj)));
            publisheradview.setOnCustomRenderedAdLoadedListener(((com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener) (obj)));
        }
        af af1 = b.a.d();
        Object obj1 = com.pandora.radio.util.i.d(b);
        obj = obj1;
        if (obj1 == null)
        {
            obj = new Bundle();
        }
        obj1 = new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder();
        ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj1)).addNetworkExtras(new AdMobExtras(((Bundle) (obj))));
        ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj1)).setGender(a(af1));
        ((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj1)).setBirthday(new Date(af1.t(), 1, 1));
        publisheradview.loadAd(((com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder) (obj1)).build());
    }
}
