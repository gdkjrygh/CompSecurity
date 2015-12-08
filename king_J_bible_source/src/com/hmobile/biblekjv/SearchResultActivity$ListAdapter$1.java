// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.model.VerseInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

class val.info
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final VerseInfo val$info;

    public void onClick(View view)
    {
        view = new Intent();
        view.putExtra("book_id", val$info.BookId);
        view.putExtra("chap_id", val$info.ChapterNumber);
        view.putExtra("verse_id", val$info.VerseNumber);
        cess._mth0(this._cls1.this).setResult(-1, view);
        cess._mth0(this._cls1.this).finish();
    }

    ()
    {
        this$1 = final_;
        val$info = VerseInfo.this;
        super();
    }
}
