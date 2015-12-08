// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaDialog

class val.view
    implements android.view.GlobalLayoutListener
{

    final AmbilWarnaDialog this$0;
    private final View val$view;

    public void onGlobalLayout()
    {
        moveCursor();
        if (AmbilWarnaDialog.access$7(AmbilWarnaDialog.this))
        {
            moveAlphaCursor();
        }
        moveTarget();
        if (AmbilWarnaDialog.access$7(AmbilWarnaDialog.this))
        {
            AmbilWarnaDialog.access$3(AmbilWarnaDialog.this);
        }
        val$view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    balLayoutListener()
    {
        this$0 = final_ambilwarnadialog;
        val$view = View.this;
        super();
    }
}
