// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.quickaction.QuickActionNotes;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity, EditNotesActivity

class val.id
    implements android.view.
{

    final MainBookActivity this$0;
    private final long val$id;

    public void onClick(View view)
    {
        view = new Intent(MainBookActivity.this, com/hmobile/biblekjv/EditNotesActivity);
        view.putExtra("notes_id", val$id);
        startActivity(view);
        qa.dismiss();
    }

    ()
    {
        this$0 = final_mainbookactivity;
        val$id = J.this;
        super();
    }
}
