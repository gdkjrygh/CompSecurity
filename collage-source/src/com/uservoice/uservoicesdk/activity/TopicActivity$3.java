// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.uservoice.uservoicesdk.model.Article;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity, ArticleActivity

class this._cls0
    implements android.widget.emClickListener
{

    final TopicActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Article)getListAdapter().getItem(i);
        view = new Intent(TopicActivity.this, com/uservoice/uservoicesdk/activity/ArticleActivity);
        view.putExtra("article", adapterview);
        startActivity(view);
    }

    _cls9()
    {
        this$0 = TopicActivity.this;
        super();
    }
}
