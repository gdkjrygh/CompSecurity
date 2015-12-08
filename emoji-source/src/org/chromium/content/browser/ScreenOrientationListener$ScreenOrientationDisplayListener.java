// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.hardware.display.DisplayManager;

// Referenced classes of package org.chromium.content.browser:
//            ScreenOrientationListener

private class <init>
    implements <init>, android.hardware.display.end
{

    final ScreenOrientationListener this$0;

    public void onDisplayAdded(int i)
    {
    }

    public void onDisplayChanged(int i)
    {
        ScreenOrientationListener.access$200(ScreenOrientationListener.this);
    }

    public void onDisplayRemoved(int i)
    {
    }

    public void startAccurateListening()
    {
    }

    public void startListening()
    {
        ((DisplayManager)ScreenOrientationListener.access$000(ScreenOrientationListener.this).getSystemService("display")).registerDisplayListener(this, null);
    }

    public void stopAccurateListening()
    {
    }

    public void stopListening()
    {
        ((DisplayManager)ScreenOrientationListener.access$000(ScreenOrientationListener.this).getSystemService("display")).unregisterDisplayListener(this);
    }

    private ()
    {
        this$0 = ScreenOrientationListener.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
