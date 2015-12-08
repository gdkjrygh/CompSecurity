// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.model.BookMarkInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity, MainBookActivity

class val.bookmark
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final BookMarkInfo val$bookmark;

    public void onClick(View view)
    {
        view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/MainBookActivity);
        view.putExtra("isFromBookMark", true);
        view.putExtra("BookMarkId", val$bookmark.getID());
        cess._mth0(this._cls1.this).startActivity(view);
        cess._mth0(this._cls1.this).finish();
    }

    ()
    {
        this$1 = final_;
        val$bookmark = BookMarkInfo.this;
        super();
    }
}
