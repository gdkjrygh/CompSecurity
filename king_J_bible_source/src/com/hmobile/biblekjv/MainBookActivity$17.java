// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.widget.SeekBar;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class val.editor
    implements android.widget.ngeListener
{

    final MainBookActivity this$0;
    private final android.content.itor val$editor;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        val$editor.putInt("speech_pitch", i);
        val$editor.commit();
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    tener()
    {
        this$0 = final_mainbookactivity;
        val$editor = android.content.itor.this;
        super();
    }
}
