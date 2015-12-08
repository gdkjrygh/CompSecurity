// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.widget.RadioGroup;

// Referenced classes of package com.hmobile.biblekjv:
//            SelectActivity

class this._cls0
    implements android.widget.kedChangeListener
{

    final SelectActivity this$0;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        if (radiogroup == segmentText)
        {
            try
            {
                Thread.sleep(200L);
            }
            // Misplaced declaration of an exception variable
            catch (RadioGroup radiogroup)
            {
                radiogroup.printStackTrace();
            }
            if (i == 0x7f0e00cd)
            {
                loadviewForBook();
            } else
            {
                if (i == 0x7f0e00ce)
                {
                    loadviewForChapter(book_id);
                    return;
                }
                if (i == 0x7f0e00cf)
                {
                    loadviewForVerse(book_id, chap_id);
                    return;
                }
            }
        }
    }

    ngeListener()
    {
        this$0 = SelectActivity.this;
        super();
    }
}
