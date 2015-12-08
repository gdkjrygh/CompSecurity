// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import com.google.android.apps.photos.allphotos.fragment.month.MonthView;
import java.util.List;

public final class dro extends android.view.GestureDetector.SimpleOnGestureListener
{

    private MonthView a;

    public dro(MonthView monthview)
    {
        a = monthview;
        super();
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (MonthView.a(a) != null && MonthView.b(a) != null)
        {
            Rect rect = new Rect();
            int i = 0;
            while (i < MonthView.b(a).size()) 
            {
                a.a(rect, i);
                if (rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
                {
                    a.a(motionevent, (ekp)MonthView.b(a).get(i));
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
