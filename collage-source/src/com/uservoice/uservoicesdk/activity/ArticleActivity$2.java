// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.view.View;
import android.widget.Toast;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ArticleActivity

class val.article
    implements android.view.er
{

    final ArticleActivity this$0;
    final Article val$article;

    public void onClick(View view)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.E_ARTICLE, val$article.getId());
        Toast.makeText(ArticleActivity.this, com.uservoice.uservoicesdk., 0).show();
    }

    ()
    {
        this$0 = final_articleactivity;
        val$article = Article.this;
        super();
    }
}
