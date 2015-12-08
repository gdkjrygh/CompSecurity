// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;


// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        if (!SignupActivity.access$200(_fld0))
        {
            webViewVisibility(true);
            SignupActivity.access$202(_fld0, true);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
