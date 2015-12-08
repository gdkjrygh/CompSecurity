// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog.view;

import android.graphics.Bitmap;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.activity.task.dialog.SimpleImageDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.task.dialog.view:
//            ReportBugView

class val.b extends ClickableSpan
{

    final ReportBugView this$0;
    final Bitmap val$b;

    public void onClick(View view)
    {
        view = SimpleImageDialog.newInstance();
        view.setImage(val$b);
        Events.post(new DialogEvent(view));
    }

    ()
    {
        this$0 = final_reportbugview;
        val$b = Bitmap.this;
        super();
    }
}
