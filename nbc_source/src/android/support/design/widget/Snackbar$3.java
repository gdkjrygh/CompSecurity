// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;

// Referenced classes of package android.support.design.widget:
//            Snackbar

class this._cls0
    implements ager.Callback
{

    final Snackbar this$0;

    public void dismiss()
    {
        Snackbar.access$000().sendMessage(Snackbar.access$000().obtainMessage(1, Snackbar.this));
    }

    public void show()
    {
        Snackbar.access$000().sendMessage(Snackbar.access$000().obtainMessage(0, Snackbar.this));
    }

    ager.Callback()
    {
        this$0 = Snackbar.this;
        super();
    }
}
