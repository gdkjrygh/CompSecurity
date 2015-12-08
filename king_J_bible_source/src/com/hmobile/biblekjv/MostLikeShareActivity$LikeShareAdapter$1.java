// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            MostLikeShareActivity, MainBookActivity

class val.verse_id
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final int val$book_id;
    private final int val$chap_id;
    private final int val$verse_id;

    public void onClick(View view)
    {
        view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/MainBookActivity);
        view.putExtra("book_id", val$book_id);
        view.putExtra("chap_id", val$chap_id);
        view.putExtra("verse_id", val$verse_id);
        view.putExtra("isFromLikeShare", true);
        cess._mth0(this._cls1.this).startActivity(view);
        cess._mth0(this._cls1.this).finish();
    }

    ()
    {
        this$1 = final_;
        val$book_id = i;
        val$chap_id = j;
        val$verse_id = I.this;
        super();
    }
}
