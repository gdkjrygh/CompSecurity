// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.model.BookMarkInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity

class val.bookmark
    implements android.view.apter._cls2
{

    final ace this$1;
    private final BookMarkInfo val$bookmark;

    public void onClick(View view)
    {
        try
        {
            val$bookmark.delete();
            cess._mth0(this._cls1.this).LoadViewForBookMark();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
    }

    ()
    {
        this$1 = final_;
        val$bookmark = BookMarkInfo.this;
        super();
    }
}
