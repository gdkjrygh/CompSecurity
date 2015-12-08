// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.model.FavoriteInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            FavoritesActivity, MainBookActivity

class val.fav_info
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final FavoriteInfo val$fav_info;

    public void onClick(View view)
    {
        view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/MainBookActivity);
        view.putExtra("isFromFavorite", true);
        view.putExtra("book_id", val$fav_info.BookId);
        view.putExtra("chap_id", val$fav_info.ChapterNumber);
        view.putExtra("verse_id", val$fav_info.VerseNumber);
        cess._mth0(this._cls1.this).startActivity(view);
        cess._mth0(this._cls1.this).finish();
    }

    ()
    {
        this$1 = final_;
        val$fav_info = FavoriteInfo.this;
        super();
    }
}
