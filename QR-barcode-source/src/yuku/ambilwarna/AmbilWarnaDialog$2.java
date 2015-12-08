// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaDialog

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
            if (f > (float)viewAlphaCheckered.getMeasuredHeight())
            {
                f1 = (float)viewAlphaCheckered.getMeasuredHeight() - 0.001F;
            }
            int i = Math.round(255F - (255F / (float)viewAlphaCheckered.getMeasuredHeight()) * f1);
            AmbilWarnaDialog.access$4(AmbilWarnaDialog.this, i);
            moveAlphaCursor();
            int j = AmbilWarnaDialog.access$2(AmbilWarnaDialog.this);
            viewNewColor.setBackgroundColor(i << 24 | 0xffffff & j);
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
