// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            TodayActivity, SearchResultActivity

class this._cls0
    implements android.widget.emClickListener
{

    final TodayActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
        i = m_strings.indexOf(adapterview);
        adapterview = ((String)m_tempstrings.get(i)).split("###");
        view = new Intent(TodayActivity.this, com/hmobile/biblekjv/SearchResultActivity);
        view.putExtra("BookName", adapterview[0]);
        view.putExtra("ChapCount", adapterview[1]);
        view.putExtra("FromToday", true);
        view.putExtra("isFromAuto", true);
        startActivityForResult(view, 2);
        TodayActivity.access$4(TodayActivity.this).setVisibility(8);
        TodayActivity.access$5(TodayActivity.this).setVisibility(0);
    }

    vity()
    {
        this$0 = TodayActivity.this;
        super();
    }
}
