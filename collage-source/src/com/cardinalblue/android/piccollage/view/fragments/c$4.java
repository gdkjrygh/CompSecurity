// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.view.a.g;
import com.cardinalblue.android.piccollage.view.a.s;
import com.facebook.GraphResponse;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            c

class a
    implements com.facebook.hRequest.Callback
{

    final c a;

    public void onCompleted(GraphResponse graphresponse)
    {
        if (!k.a(a.getActivity()))
        {
            return;
        }
        c.b(a).b();
        c.a(a);
        if (graphresponse.getError() != null)
        {
            c.a(a, graphresponse.getError());
            return;
        }
        graphresponse = c.a(a, graphresponse.getRawResponse());
        ((g)c.b(a).c()).addAll(graphresponse);
        graphresponse = c.b(a);
        boolean flag;
        if (!TextUtils.isEmpty(c.c(a)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            graphresponse.a(flag);
            c.b(a).notifyDataSetChanged();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GraphResponse graphresponse)
        {
            f.a(graphresponse);
        }
        return;
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
