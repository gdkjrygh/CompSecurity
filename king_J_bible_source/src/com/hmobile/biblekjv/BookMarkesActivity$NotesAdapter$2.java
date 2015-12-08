// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.model.NotesInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity

class val.noteInfo
    implements android.view.apter._cls2
{

    final StackTrace this$1;
    private final NotesInfo val$noteInfo;

    public void onClick(View view)
    {
        try
        {
            val$noteInfo.delete();
            cess._mth0(this._cls1.this).LoadViewForNotes();
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
        val$noteInfo = NotesInfo.this;
        super();
    }
}
