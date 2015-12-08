// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.model.NotesInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity, EditNotesActivity

class val.noteInfo
    implements android.view.apter._cls3
{

    final rResult this$1;
    private final NotesInfo val$noteInfo;

    public void onClick(View view)
    {
        view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/EditNotesActivity);
        view.putExtra("notes_id", val$noteInfo.getID());
        cess._mth0(this._cls1.this).startActivityForResult(view, 1);
    }

    ()
    {
        this$1 = final_;
        val$noteInfo = NotesInfo.this;
        super();
    }
}
