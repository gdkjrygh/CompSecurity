// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class val.editor
    implements android.widget.lectedListener
{

    final MainBookActivity this$0;
    private final android.content.itor val$editor;
    private final String val$fontStyle[];

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (new StringBuilder(String.valueOf(val$fontStyle[i].toLowerCase().replace("-", "")))).append(".ttf").toString();
        val$editor.putString("font_style", adapterview);
        val$editor.commit();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    Listener()
    {
        this$0 = final_mainbookactivity;
        val$fontStyle = as;
        val$editor = android.content.itor.this;
        super();
    }
}
