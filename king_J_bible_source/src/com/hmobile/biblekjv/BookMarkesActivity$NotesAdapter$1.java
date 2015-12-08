// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.model.NotesInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity, MainBookActivity

class val.noteInfo
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final NotesInfo val$noteInfo;

    public void onClick(View view)
    {
        view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/MainBookActivity);
        view.putExtra("isFromNotes", true);
        view.putExtra("note_label", val$noteInfo.Lable);
        view.putExtra("book_id", val$noteInfo.book_id);
        view.putExtra("chap_id", val$noteInfo.chap_number);
        view.putExtra("verse_id", val$noteInfo.verse_id);
        cess._mth0(this._cls1.this).startActivity(view);
        cess._mth0(this._cls1.this).finish();
    }

    ()
    {
        this$1 = final_;
        val$noteInfo = NotesInfo.this;
        super();
    }
}
