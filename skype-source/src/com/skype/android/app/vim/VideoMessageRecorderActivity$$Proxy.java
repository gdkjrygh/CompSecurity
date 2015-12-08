// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

public class  extends com.skype.android...Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((VideoMessageRecorderActivity)getTarget()).recordTimeText = null;
        ((VideoMessageRecorderActivity)getTarget()).recordButton = null;
        ((VideoMessageRecorderActivity)getTarget()).buttonHolder = null;
        ((VideoMessageRecorderActivity)getTarget()).cancelButton = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((VideoMessageRecorderActivity)getTarget()).recordTimeText = (TextView)findViewById(0x7f10058f);
        ((VideoMessageRecorderActivity)getTarget()).recordButton = (ImageButton)findViewById(0x7f100590);
        ((VideoMessageRecorderActivity)getTarget()).buttonHolder = (RelativeLayout)findViewById(0x7f1002f2);
        ((VideoMessageRecorderActivity)getTarget()).cancelButton = (SymbolView)findViewById(0x7f100325);
    }

    public (VideoMessageRecorderActivity videomessagerecorderactivity)
    {
        super(videomessagerecorderactivity);
    }
}
