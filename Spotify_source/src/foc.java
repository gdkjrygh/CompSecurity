// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import com.spotify.mobile.android.ui.ActionBarManager;
import java.lang.ref.WeakReference;

public final class foc extends Handler
{

    private final WeakReference a;

    public foc(ActionBarManager actionbarmanager)
    {
        a = new WeakReference(actionbarmanager);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message = (ActionBarManager)a.get();
        if (message != null)
        {
            if (((ActionBarManager) (message)).h > 0.0F)
            {
                ((ActionBarManager) (message)).l.sendEmptyMessageDelayed(0, 4000L);
                return;
            }
            if (((ActionBarManager) (message)).b.e())
            {
                ((ActionBarManager) (message)).b.d();
                return;
            }
        }
    }
}
