// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.h;
import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            dj, cv, dl, ci, 
//            dm, dp, gs, do, 
//            dq, du

final class dk
    implements Runnable
{

    final TextView a;
    final Handler b;
    final MotionEvent c;
    final TextView d;
    final Handler e;
    final dj f;

    dk(dj dj1, TextView textview, Handler handler, MotionEvent motionevent, TextView textview1, Handler handler1)
    {
        f = dj1;
        a = textview;
        b = handler;
        c = motionevent;
        d = textview1;
        e = handler1;
        super();
    }

    public final void run()
    {
        org.json.JSONArray jsonarray;
        dp dp1;
        dm dm1;
        cv.a(f.a, true);
        cv.b(f.a, true);
        dl dl1 = new dl(this);
        b.post(dl1);
        jsonarray = cv.a(c.getX(), c.getY(), cv.d(f.a));
        dp1 = ci.b().b;
        dm1 = new dm(this);
        if (!ci.b().j) goto _L2; else goto _L1
_L1:
        String s;
        JSONObject jsonobject;
        s = (new StringBuilder()).append(dp1.e).append(dp1.b).append("/api/v1/experimentElements").toString().replaceAll(" ", "%20");
        jsonobject = cv.a().g;
        Object obj = new JSONObject(jsonobject.toString());
        ((JSONObject) (obj)).put("t", ci.b().f);
        ((JSONObject) (obj)).put("os", "Android");
        ((JSONObject) (obj)).put("views", jsonarray);
        ((JSONObject) (obj)).put("exp_id", jsonobject.optString("experiment_id"));
_L4:
        if (obj != null && ((JSONObject) (obj)).length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return;
        Exception exception;
        exception;
        obj = null;
_L5:
        gs.b("Setting POST experimentElements properties", exception);
        if (true) goto _L4; else goto _L3
_L3:
        Date date = new Date();
        obj = new do(s, ((JSONObject) (obj)), cv.a().g(), new dq(dp1, date, dm1), new du(dp1, s, dm1));
        obj.l = "post_viewinfo";
        dp1.f.a(((Request) (obj)));
        return;
        date;
          goto _L5
    }
}
