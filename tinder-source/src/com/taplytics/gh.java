// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            am, shelduck, hi, ci, 
//            bd, cv, hk, j, 
//            gs, an

public final class gh extends FrameLayout
    implements android.view.GestureDetector.OnGestureListener
{

    private long a;
    private float b;
    private float c;
    private am d;

    public gh(Context context)
    {
        super(context);
        d = new am(context, this);
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        a = System.currentTimeMillis();
        b = motionevent.getX();
        c = motionevent.getY();
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return true;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return true;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
        JSONObject jsonobject;
        int i;
        i = 0;
        jsonobject = null;
        if (hi.a(shelduck.v))
        {
            return;
        }
        if (System.currentTimeMillis() - a >= 1000L) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        float f2;
        float f3;
        f2 = b;
        f = c;
        f3 = motionevent.getX();
        f1 = motionevent.getY();
        f2 -= f3;
        f -= f1;
        if ((float)Math.round((float)Math.sqrt(f2 * f2 + f * f) / ((float)ci.b().u.getResources().getDisplayMetrics().densityDpi / 160F)) >= 15F || ci.b().t == null) goto _L2; else goto _L3
_L3:
        JSONArray jsonarray;
        Object obj;
        jsonarray = ci.b().t.l;
        f = b;
        f1 = c;
        obj = hk.b(cv.a().j).iterator();
_L5:
        motionevent = jsonobject;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        motionevent = (View)((Iterator) (obj)).next();
        if (!(motionevent instanceof Button) && (android.os.Build.VERSION.SDK_INT < 15 || !motionevent.hasOnClickListeners())) goto _L5; else goto _L4
_L4:
        int ai[];
        ai = new int[2];
        motionevent.getLocationOnScreen(ai);
        int k = ai[0];
        long l = (long)ai[1] - cv.a().m;
        if (f <= (float)k) goto _L5; else goto _L6
_L6:
        if (f >= (float)(motionevent.getWidth() + k) || f1 <= (float)l) goto _L5; else goto _L7
_L7:
        if (f1 >= (float)((long)motionevent.getHeight() + l) || motionevent.getId() == -1) goto _L5; else goto _L8
_L13:
        if (i >= jsonarray.length()) goto _L2; else goto _L9
_L9:
        jsonobject = jsonarray.optJSONObject(i);
        if (motionevent.getId() != jsonobject.optJSONObject("initProperties").optInt("anID")) goto _L11; else goto _L10
_L10:
        obj = ci.b().d;
          goto _L12
_L15:
        ci.b().e();
_L11:
        i++;
          goto _L13
_L12:
        if (!ci.b().j || hi.a(shelduck.v) || jsonobject == null) goto _L15; else goto _L14
_L14:
        JSONObject jsonobject1 = ((j) (obj)).b("touchUp", null, null);
        if (jsonobject.has("key"))
        {
            jsonobject1.put("eKey", jsonobject.optString("key"));
        }
        if (jsonobject.has("vKey"))
        {
            jsonobject1.put("vKey", ci.b().v.getClass().getSimpleName());
        }
        ((j) (obj)).a(jsonobject1);
          goto _L15
        JSONException jsonexception;
        jsonexception;
        gs.b("Track View Event", jsonexception);
          goto _L15
        motionevent;
        gs.b("Touch Overlay Problem", motionevent);
_L2:
        return;
_L8:
        if (motionevent == null) goto _L2; else goto _L13
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        d.a.a(motionevent);
        return super.onTouchEvent(motionevent);
    }
}
