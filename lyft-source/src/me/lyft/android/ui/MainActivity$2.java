// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import com.lyft.scoop.Screen;
import me.lyft.android.analytics.ScreenAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            MainActivity, DialogScreensContainer

class this._cls0
    implements Action1
{

    final MainActivity this$0;

    public void call(Screen screen)
    {
        ScreenAnalytics.trackDialogView(screen);
        MainActivity.access$100(MainActivity.this).goTo(screen);
    }

    public volatile void call(Object obj)
    {
        call((Screen)obj);
    }

    ntainer()
    {
        this$0 = MainActivity.this;
        super();
    }
}
