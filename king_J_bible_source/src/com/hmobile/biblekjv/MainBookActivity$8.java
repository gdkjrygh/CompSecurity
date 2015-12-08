// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.text.style.ClickableSpan;
import android.view.View;
import com.hmobile.model.NotesInfo;
import com.hmobile.quickaction.QuickActionNotes;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity, ClickPreventableTextView

class val.ninfo extends ClickableSpan
{

    final MainBookActivity this$0;
    private final NotesInfo val$ninfo;

    public void onClick(View view)
    {
        if (view instanceof ClickPreventableTextView)
        {
            if (((ClickPreventableTextView)view).ignoreSpannableClick())
            {
                return;
            }
            ((ClickPreventableTextView)view).preventNextClick();
        }
        MainBookActivity.access$31(MainBookActivity.this, (new StringBuilder(String.valueOf(val$ninfo.Title))).append(" : ").append(val$ninfo.Lable).toString(), val$ninfo.getID());
        qa = new QuickActionNotes(view);
        qa.addActionItem(MainBookActivity.access$32(MainBookActivity.this));
        qa.show();
    }

    ()
    {
        this$0 = final_mainbookactivity;
        val$ninfo = NotesInfo.this;
        super();
    }
}
