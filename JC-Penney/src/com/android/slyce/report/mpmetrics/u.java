// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            q, InAppNotification, af, ak

class u
    implements android.view.GestureDetector.OnGestureListener
{

    final q a;

    u(q q1)
    {
        a = q1;
        super();
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 > 0.0F)
        {
            q.a(a);
        }
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        motionevent = q.c(a).c();
        Object obj = motionevent.j();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            try
            {
                obj = Uri.parse(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                Log.i("MixpanelAPI.InAppFragment", "Can't parse notification URI, will not take any action", motionevent);
                return true;
            }
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
                q.e(a).startActivity(intent);
                q.f(a).c().a("$campaign_open", motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                Log.i("MixpanelAPI.InAppFragment", (new StringBuilder()).append("User doesn't have an activity for notification URI ").append(obj).toString());
            }
        }
        q.a(a);
        return true;
    }
}
