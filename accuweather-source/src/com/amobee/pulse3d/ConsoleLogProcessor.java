// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            StringArgProcessor, Log, Pulse3DView, Pulse3DViewListener

class ConsoleLogProcessor extends StringArgProcessor
{

    boolean reportError_;
    Pulse3DView viewController_;

    ConsoleLogProcessor(Pulse3DView pulse3dview, boolean flag)
    {
        viewController_ = pulse3dview;
        reportError_ = flag;
    }

    void execute()
    {
        if (!reportError_)
        {
            Log.d("JsInterface", (new StringBuilder()).append("consolelog: ").append(string_).toString());
        } else
        {
            Log.e("JsInterface", (new StringBuilder()).append("consolelog: ").append(string_).toString());
            if (viewController_.mPulse3DViewListener != null)
            {
                viewController_.mPulse3DViewListener.onFailLoadingSceneAtURL(viewController_, viewController_.mURL, new Error(string_));
                return;
            }
        }
    }
}
