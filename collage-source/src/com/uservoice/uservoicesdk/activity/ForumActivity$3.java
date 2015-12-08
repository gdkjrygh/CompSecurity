// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.uservoice.uservoicesdk.dialog.SuggestionDialogFragment;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity, PostIdeaActivity

class this._cls0
    implements android.widget.emClickListener
{

    final ForumActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            startActivity(new Intent(ForumActivity.this, com/uservoice/uservoicesdk/activity/PostIdeaActivity));
        } else
        if (i != 1)
        {
            (new SuggestionDialogFragment((Suggestion)getModelAdapter().getItem(i), null)).show(getSupportFragmentManager(), "SuggestionDialogFragment");
            return;
        }
    }

    agment()
    {
        this$0 = ForumActivity.this;
        super();
    }
}
