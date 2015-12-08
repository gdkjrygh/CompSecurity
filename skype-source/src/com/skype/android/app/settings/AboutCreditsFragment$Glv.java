// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.opengl.GLSurfaceView;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

public class setRenderMode extends GLSurfaceView
{

    private final onResume mRr;
    final AboutCreditsFragment this$0;

    public void onDestroy()
    {
        mRr.destroy();
    }

    public void onPause()
    {
        super.onPause();
        mRr.onPause();
    }

    public void onResume()
    {
        super.onResume();
        mRr.onResume();
    }

    public (Context context)
    {
        this$0 = AboutCreditsFragment.this;
        super(context);
        mRr = new <init>(context, null);
        setEGLConfigChooser(false);
        setRenderer(mRr);
        setRenderMode(1);
    }
}
