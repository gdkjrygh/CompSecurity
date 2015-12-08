// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            MoreActivity, SuggestActivity

class this._cls0
    implements android.view.tener
{

    final MoreActivity this$0;

    public void onClick(View view)
    {
        view = new Intent(MoreActivity.access$000(MoreActivity.this), com/aetn/history/android/historyhere/view/SuggestActivity);
        view.putExtra("called_from", "more");
        MoreActivity.access$000(MoreActivity.this).startActivity(view);
    }

    ()
    {
        this$0 = MoreActivity.this;
        super();
    }
}
