// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.moviemaker.app.ApplicationEnabler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class cwv
    implements cwu
{

    private static final String a = cwv.getSimpleName();
    private final cwx b;
    private final cwn c;
    private final ApplicationEnabler d;
    private final bju e;
    private final cwy f;
    private final now g;
    private final nnr h;
    private final nff i;
    private final Runnable j = new cww(this);

    public cwv(cwx cwx1, cwn cwn1, ApplicationEnabler applicationenabler, bju bju1, cwy cwy1, nff nff1, nnr nnr1, 
            cjs cjs, noj noj, bpg bpg)
    {
        b = (cwx)b.a(cwx1, "service", null);
        c = (cwn)b.a(cwn1, "backgroundServiceHelper", null);
        d = (ApplicationEnabler)b.a(applicationenabler, "applicationEnabler", null);
        e = (bju)b.a(bju1, "metricsAndMetadataStore", null);
        olm.a(cwx1, bnl);
        f = (cwy)b.a(cwy1, "settings", null);
        b.a(cjs, "mediaExtractorFactory", null);
        b.a(noj, "movieMakerProvider", null);
        b.a(bpg, "movieMakerClusterFilter", null);
        g = (now)olm.a(cwx1, now);
        h = (nnr)b.a(nnr1, "aamEventsLogger", null);
        i = nfe.a(false, a, nff1);
    }

    public static PendingIntent a(Context context, boolean flag)
    {
        return PendingIntent.getService(context, 0, (new Intent(context, cwx)).setAction("com.google.android.apps.moviemaker.analyzer.PING").putExtra("is_clean_up", flag), 0x48000000);
    }

    static cwn a(cwv cwv1)
    {
        return cwv1.c;
    }

    public static cwy a(bnl bnl1)
    {
        return new cwy(bnl1);
    }

    static now b(cwv cwv1)
    {
        return cwv1.g;
    }

    public final void a()
    {
        c.d();
    }

    public final void a(Intent intent)
    {
        if (c.e()) goto _L2; else goto _L1
_L1:
        d.a();
_L4:
        return;
_L2:
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction()))
        {
            cwx.a(b, f.a(), true);
            return;
        }
        if (!"com.google.android.apps.moviemaker.analyzer.PING".equals(intent.getAction()) || !intent.getBooleanExtra("is_clean_up", false))
        {
            break; /* Loop/switch isn't completed */
        }
        if (i != null)
        {
            i.a("start clean-up");
        }
        intent = new HashSet(e.a());
        if (i != null)
        {
            nff nff1 = i;
            int k = intent.size();
            nff1.a((new StringBuilder(40)).append("metrics store contains ").append(k).append(" items").toString());
        }
        intent = intent.iterator();
        do
        {
            if (!intent.hasNext())
            {
                break;
            }
            Uri uri = (Uri)intent.next();
            if (b.getContentResolver().query(uri, new String[] {
    "_size"
}, null, null, null) == null)
            {
                if (i != null)
                {
                    nff nff3 = i;
                    String s1 = String.valueOf(uri);
                    nff3.a((new StringBuilder(String.valueOf(s1).length() + 22)).append("Removing metrics for: ").append(s1).toString());
                }
                e.b(uri);
            }
        } while (true);
        if (i != null)
        {
            i.a("stop clean-up");
        }
        if (c.a())
        {
            if (i != null)
            {
                i.a("power disconnected: abort now");
                i.a("stopping");
                return;
            }
        } else
        {
            cwx.a(b, f.b(), false);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("com.google.android.apps.moviemaker.analyzer.PING".equals(intent.getAction()) && !intent.getBooleanExtra("is_clean_up", false))
        {
            h.a();
            try
            {
                c.a(j);
                g.b(false);
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                intent = i;
                String s = String.valueOf(interruptedexception);
                intent.a((new StringBuilder(String.valueOf(s).length() + 23)).append("interrupted exception: ").append(s).toString());
                return;
            }
        }
        if (i != null)
        {
            nff nff2 = i;
            intent = String.valueOf(intent);
            nff2.a((new StringBuilder(String.valueOf(intent).length() + 19)).append("unexpected intent: ").append(intent).toString());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
