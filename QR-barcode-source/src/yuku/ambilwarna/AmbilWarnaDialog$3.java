// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaDialog, AmbilWarnaSquare

class this._cls0
    implements android.view.r
{

    final AmbilWarnaDialog this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 2 || motionevent.getAction() == 0 || motionevent.getAction() == 1)
        {
            float f1 = motionevent.getX();
            float f2 = motionevent.getY();
            float f = f1;
            if (f1 < 0.0F)
            {
                f = 0.0F;
            }
            f1 = f;
            if (f > (float)viewSatVal.getMeasuredWidth())
            {
                f1 = viewSatVal.getMeasuredWidth();
            }
            f = f2;
            if (f2 < 0.0F)
            {
                f = 0.0F;
            }
            f2 = f;
            if (f > (float)viewSatVal.getMeasuredHeight())
            {
                f2 = viewSatVal.getMeasuredHeight();
            }
            AmbilWarnaDialog.access$5(AmbilWarnaDialog.this, (1.0F / (float)viewSatVal.getMeasuredWidth()) * f1);
            AmbilWarnaDialog.access$6(AmbilWarnaDialog.this, 1.0F - (1.0F / (float)viewSatVal.getMeasuredHeight()) * f2);
            moveTarget();
            viewNewColor.setBackgroundColor(AmbilWarnaDialog.access$2(AmbilWarnaDialog.this));
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = AmbilWarnaDialog.this;
        super();
    }
}
