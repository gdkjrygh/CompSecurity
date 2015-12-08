// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            StringArgProcessor, Log, Pulse3DView, Pulse3DJavaScriptInterface, 
//            Pulse3DViewListener

class OpenURLProcessor extends StringArgProcessor
{

    Pulse3DView pulse3DView_;
    boolean system_;

    OpenURLProcessor(Pulse3DView pulse3dview, boolean flag)
    {
        pulse3DView_ = pulse3dview;
        system_ = flag;
    }

    void execute()
    {
        if (system_)
        {
            Log.d("JsInterface", (new StringBuilder()).append("systemOpenURL: ").append(string_).toString());
            pulse3DView_.jsInterface3D.systemOpenURL(string_);
        } else
        if (!pulse3DView_.mPulse3DViewListener.webLinkOutRequested(string_, false))
        {
            Log.d("JsInterface", (new StringBuilder()).append("open URL: ").append(string_).toString());
            pulse3DView_.jsInterface3D.systemOpenURL(string_);
            return;
        }
    }
}
