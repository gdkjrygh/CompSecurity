// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class val.f_size
    implements android.widget.lectedListener
{

    final MainBookActivity this$0;
    private final android.content.itor val$editor;
    private final int val$f_size[];

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        val$editor.putInt("font_size", val$f_size[i]);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    Listener()
    {
        this$0 = final_mainbookactivity;
        val$editor = itor;
        val$f_size = _5B_I.this;
        super();
    }
}
