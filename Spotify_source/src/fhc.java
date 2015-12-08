// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonThrobberItem;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import java.text.Normalizer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class fhc extends gbr
{

    public static final drf a = new PorcelainJsonThrobberItem("pagination-indicator", null);
    public final fgp b;
    public SearchResults c;
    public LinkedList d;
    public final dpt e;
    public boolean f;

    public fhc(Context context, dpx dpx, drs drs, PorcelainMetricsLogger porcelainmetricslogger)
    {
        this(context, dpx, drs, new fgp(new StyleSpan(1)), porcelainmetricslogger);
    }

    private fhc(Context context, dpx dpx, drs drs, fgp fgp1, PorcelainMetricsLogger porcelainmetricslogger)
    {
        dog dog1 = PorcelainAdapter.e();
        dog1.a = porcelainmetricslogger;
        drs = dqe.a(context).a(drs);
        drs.b = (dqi)ctz.a(new dqd(context, fgp1) {

            private fgp a;

            protected final CharSequence b(dsc dsc1)
            {
                fgp fgp2 = a;
                String s = dsc1.getText();
                ctz.a(s);
                SpannableString spannablestring = (SpannableString)fgp2.a.get(s);
                dsc1 = spannablestring;
                if (spannablestring == null)
                {
                    ctz.a(s);
                    dsc1 = new SpannableString(Normalizer.normalize(s, java.text.Normalizer.Form.NFC));
                    if (fgp2.e && !s.isEmpty())
                    {
                        int ai[];
                        for (Iterator iterator = fgp2.d.a(dsc1.toString()).iterator(); iterator.hasNext(); dsc1.setSpan(StyleSpan.wrap(fgp2.b), ai[0], ai[1], 33))
                        {
                            ai = (int[])iterator.next();
                        }

                    }
                    fgp2.a.put(s, dsc1);
                }
                return dsc1;
            }

            
            {
                a = fgp1;
                super(context);
            }
        });
        dog1.b = drs.a();
        dog1.c = dpx;
        super(dog1.a(context));
        c = SearchResults.NO_RESULTS;
        d = new LinkedList();
        e = new dpt(Collections.emptyList(), d);
        ((PorcelainAdapter)super.h).a(e);
        b = fgp1;
    }

}
