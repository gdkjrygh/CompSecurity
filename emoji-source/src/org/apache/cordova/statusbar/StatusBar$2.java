// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.statusbar;

import android.view.Window;

// Referenced classes of package org.apache.cordova.statusbar:
//            StatusBar

class val.window
    implements Runnable
{

    final StatusBar this$0;
    final Window val$window;

    public void run()
    {
        val$window.clearFlags(1024);
    }

    ()
    {
        this$0 = final_statusbar;
        val$window = Window.this;
        super();
    }
}
