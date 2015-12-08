// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import java.util.List;
import p.cr.k;

// Referenced classes of package p.ca:
//            ba

class Object
    implements android.view.OnClickListener
{

    final ba a;

    public void onClick(View view)
    {
        if (!s.a(ba.a(a)) || ba.b(a).getAlpha() == 1.0F)
        {
            a.getView().removeCallbacks(ba.c(a));
            ba.c(a).run();
        } else
        {
            view = a.a();
            if (view.l() != ac.c)
            {
                view = (String)Uri.parse(view.I()).getPathSegments().get(3);
                if (!s.a(view))
                {
                    k.a(Uri.parse("pandorav4://backstage/artist").buildUpon().appendQueryParameter("token", view).build());
                    return;
                }
            }
        }
    }

    ew.View(ba ba1)
    {
        a = ba1;
        super();
    }
}
