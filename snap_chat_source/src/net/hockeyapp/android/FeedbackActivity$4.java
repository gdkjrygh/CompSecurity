// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afR;
import afU;
import afW;
import afX;
import android.widget.ListView;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

final class a
    implements Runnable
{

    private afX a;
    private FeedbackActivity b;

    public final void run()
    {
        b.b(true);
        Object obj1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("d MMM h:mm a");
        if (a != null && a.b != null && a.b.a != null && a.b.a.size() > 0)
        {
            FeedbackActivity.a(b, a.b.a);
            Collections.reverse(FeedbackActivity.e(b));
            try
            {
                obj1 = ((SimpleDateFormat) (obj1)).parse(((afW)FeedbackActivity.e(b).get(0)).b);
                FeedbackActivity.f(b).setText(String.format("Last Updated: %s", new Object[] {
                    simpledateformat.format(((java.util.Date) (obj1)))
                }));
            }
            catch (ParseException parseexception)
            {
                parseexception.printStackTrace();
            }
            if (FeedbackActivity.g(b) == null)
            {
                FeedbackActivity.a(b, new afR(FeedbackActivity.c(b), FeedbackActivity.e(b)));
            } else
            {
                Object obj = FeedbackActivity.g(b);
                if (((afR) (obj)).a != null)
                {
                    ((afR) (obj)).a.clear();
                }
                obj = FeedbackActivity.e(b).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    afW afw = (afW)((Iterator) (obj)).next();
                    afR afr = FeedbackActivity.g(b);
                    if (afw != null && afr.a != null)
                    {
                        afr.a.add(afw);
                    }
                } while (true);
                FeedbackActivity.g(b).notifyDataSetChanged();
            }
            FeedbackActivity.h(b).setAdapter(FeedbackActivity.g(b));
        }
    }

    (FeedbackActivity feedbackactivity, afX afx)
    {
        b = feedbackactivity;
        a = afx;
        super();
    }
}
