// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.widget.Button;
import android.widget.TextView;
import com.skype.android.media.CameraView;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePromotionActivity

public class  extends com.skype.android...Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((VideoMessagePromotionActivity)getTarget()).cameraPreview = null;
        ((VideoMessagePromotionActivity)getTarget()).mOkButton = null;
        ((VideoMessagePromotionActivity)getTarget()).mNoThanksTextView = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((VideoMessagePromotionActivity)getTarget()).cameraPreview = (CameraView)findViewById(0x7f1004bc);
        ((VideoMessagePromotionActivity)getTarget()).mOkButton = (Button)findViewById(0x7f1004da);
        ((VideoMessagePromotionActivity)getTarget()).mNoThanksTextView = (TextView)findViewById(0x7f1004db);
    }

    public (VideoMessagePromotionActivity videomessagepromotionactivity)
    {
        super(videomessagepromotionactivity);
    }
}
