// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.SharedPreferences;
import android.view.View;
import com.hmobile.model.VerseInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity, ClickPreventableTextView

class tView
    implements android.view.r
{

    final MainBookActivity this$0;
    private final VerseInfo val$s;
    private final ClickPreventableTextView val$txtVerse;

    public void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        MainBookActivity.access$33(MainBookActivity.this, val$s.VerseNumber);
        if (i == 0)
        {
            underlineText(val$txtVerse);
            MainBookActivity.access$22(MainBookActivity.this).add(Integer.valueOf(val$s.VerseNumber));
            view.setTag(Integer.valueOf(1));
        } else
        {
            removeunderline(val$txtVerse);
            MainBookActivity.access$22(MainBookActivity.this).remove(Integer.valueOf(val$s.VerseNumber));
            view.setTag(Integer.valueOf(0));
        }
        if (MainBookActivity.access$22(MainBookActivity.this).size() > 0)
        {
            navigationfade_global = false;
        } else
        {
            navigationfade_global = settings.getBoolean("navigation_fade", true);
        }
        setoncontentClick();
    }

    tView()
    {
        this$0 = final_mainbookactivity;
        val$s = verseinfo;
        val$txtVerse = ClickPreventableTextView.this;
        super();
    }
}
