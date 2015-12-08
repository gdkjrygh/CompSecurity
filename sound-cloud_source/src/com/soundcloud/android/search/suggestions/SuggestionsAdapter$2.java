// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import android.database.Cursor;
import android.database.MergeCursor;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            SuggestionsAdapter

class this._cls0 extends MergeCursor
{

    final SuggestionsAdapter this$0;

    public String toString()
    {
        return getString(getColumnIndex("suggest_text_1"));
    }

    (Cursor acursor[])
    {
        this$0 = SuggestionsAdapter.this;
        super(acursor);
    }
}
