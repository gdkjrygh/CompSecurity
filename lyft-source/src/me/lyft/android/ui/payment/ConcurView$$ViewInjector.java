// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.Toggle;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurView

public class _cls9
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ConcurView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ConcurView concurview, Object obj)
    {
        concurview.sendToConcur = (TextView)viewinjector.sendToConcur((View)viewinjector.sendToConcur(obj, 0x7f0d0138, null), 0x7f0d0138, "field 'sendToConcur'");
        concurview.sendToConcurToggle = (Toggle)viewinjector.sendToConcurToggle((View)viewinjector.sendToConcurToggle(obj, 0x7f0d0133, null), 0x7f0d0133, "field 'sendToConcurToggle'");
    }

    public volatile void reset(Object obj)
    {
        reset((ConcurView)obj);
    }

    public void reset(ConcurView concurview)
    {
        concurview.sendToConcur = null;
        concurview.sendToConcurToggle = null;
    }

    public _cls9()
    {
    }
}
