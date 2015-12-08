// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.EditText;
import com.google.android.apps.photos.edittext.EditTextHolder;

final class fgl
    implements iwe
{

    private fgf a;

    fgl(fgf fgf1)
    {
        a = fgf1;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (fgf.e(a) != null)
        {
            EditTextHolder edittextholder = fgf.e(a);
            edittextholder.b.getLocationOnScreen(edittextholder.c);
            edittextholder.b.getHitRect(edittextholder.d);
            edittextholder.d.offset(edittextholder.c[0] - edittextholder.b.getLeft(), edittextholder.c[1] - edittextholder.b.getTop());
            boolean flag = edittextholder.d.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
            if (edittextholder.e.a())
            {
                noy.a("hitRectContainsMotionEvent", Boolean.valueOf(flag));
            }
            if (!flag)
            {
                if (motionevent.getActionMasked() != 0)
                {
                    return true;
                } else
                {
                    fgf.f(a);
                    return true;
                }
            }
        }
        return false;
    }
}
