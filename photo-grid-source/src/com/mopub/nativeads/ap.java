// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.nativeads:
//            ViewBinder, NativeResponse

final class ap
{

    static final ap f = new ap();
    TextView a;
    TextView b;
    TextView c;
    ImageView d;
    ImageView e;

    private ap()
    {
    }

    static ap a(View view, ViewBinder viewbinder)
    {
        ap ap1 = new ap();
        try
        {
            ap1.a = (TextView)view.findViewById(viewbinder.b);
            ap1.b = (TextView)view.findViewById(viewbinder.c);
            ap1.c = (TextView)view.findViewById(viewbinder.d);
            ap1.d = (ImageView)view.findViewById(viewbinder.e);
            ap1.e = (ImageView)view.findViewById(viewbinder.f);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            MoPubLog.w("Could not cast from id in ViewBinder to expected View type", view);
            return f;
        }
        return ap1;
    }

    static void a(View view, NativeResponse nativeresponse, ViewBinder viewbinder)
    {
        Iterator iterator = viewbinder.g.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            View view1 = view.findViewById(((Integer)viewbinder.g.get(s)).intValue());
            Object obj = nativeresponse.getExtra(s);
            if (view1 instanceof ImageView)
            {
                ((ImageView)view1).setImageDrawable(null);
                nativeresponse.loadExtrasImage(s, (ImageView)view1);
            } else
            if (view1 instanceof TextView)
            {
                ((TextView)view1).setText(null);
                if (obj instanceof String)
                {
                    a((TextView)view1, (String)obj);
                }
            } else
            {
                MoPubLog.d((new StringBuilder("View bound to ")).append(s).append(" should be an instance of TextView or ImageView.").toString());
            }
        } while (true);
    }

    private static void a(TextView textview, String s)
    {
        if (textview == null)
        {
            MoPubLog.d((new StringBuilder("Attempted to add text (")).append(s).append(") to null TextView.").toString());
            return;
        }
        textview.setText(null);
        if (s == null)
        {
            MoPubLog.d("Attempted to set TextView contents to null.");
            return;
        } else
        {
            textview.setText(s);
            return;
        }
    }

    final void a(NativeResponse nativeresponse)
    {
        a(a, nativeresponse.getTitle());
        a(b, nativeresponse.getText());
        a(c, nativeresponse.getCallToAction());
        nativeresponse.loadMainImage(d);
        nativeresponse.loadIconImage(e);
    }

}
