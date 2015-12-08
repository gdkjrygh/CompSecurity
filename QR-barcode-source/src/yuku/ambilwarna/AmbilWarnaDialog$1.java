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
            float f1 = motionevent.getY();
            float f = f1;
            if (f1 < 0.0F)
            {
                f = 0.0F;
            }
            f1 = f;
            if (f > (float)viewHue.getMeasuredHeight())
            {
                f1 = (float)viewHue.getMeasuredHeight() - 0.001F;
            }
            f1 = 360F - (360F / (float)viewHue.getMeasuredHeight()) * f1;
            f = f1;
            if (f1 == 360F)
            {
                f = 0.0F;
            }
            AmbilWarnaDialog.access$0(AmbilWarnaDialog.this, f);
            viewSatVal.setHue(AmbilWarnaDialog.access$1(AmbilWarnaDialog.this));
            moveCursor();
            viewNewColor.setBackgroundColor(AmbilWarnaDialog.access$2(AmbilWarnaDialog.this));
            AmbilWarnaDialog.access$3(AmbilWarnaDialog.this);
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
