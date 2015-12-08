// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

class this._cls0
    implements android.widget.tedListener
{

    final SearchResultActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != 0)
        {
            m_list = new ArrayList();
            adapterview = spnBook.getSelectedItem().toString().split("\\(");
            SearchVerse(true, adapterview[0].trim());
            return;
        } else
        {
            SearchVerse(false, "");
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    tener()
    {
        this$0 = SearchResultActivity.this;
        super();
    }
}
