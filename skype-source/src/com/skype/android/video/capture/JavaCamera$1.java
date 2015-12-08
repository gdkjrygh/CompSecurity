// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.util.Log;
import com.skype.android.video.capture.impl.FrameConsumer;

// Referenced classes of package com.skype.android.video.capture:
//            JavaCamera

class this._cls0
    implements FrameConsumer
{

    final JavaCamera this$0;

    public void onFrameArrived(byte abyte0[], int i, int j)
    {
        if (!JavaCamera.access$100(JavaCamera.this))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (!JavaCamera.access$200(JavaCamera.this).checkAccept())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        JavaCamera.access$400(JavaCamera.access$300(JavaCamera.this), i, j, abyte0);
_L2:
        return;
        abyte0;
        if (!Log.isLoggable("JavaCapturer_Java", 6)) goto _L2; else goto _L1
_L1:
        Log.e("JavaCapturer_Java", "onFrameArrived: runtime exception. Error ", abyte0);
        return;
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "Frame DROPPED inside");
            return;
        }
          goto _L2
    }

    SController()
    {
        this$0 = JavaCamera.this;
        super();
    }
}
