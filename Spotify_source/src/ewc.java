// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.CellularSyncDialogActivity;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public final class ewc
    implements ewa
{

    private boolean a;
    private WeakReference b;
    private Verified c;

    public ewc(Context context, Verified verified)
    {
        b = new WeakReference(context);
        c = verified;
    }

    public final void a()
    {
        a = true;
    }

    public final void a(com.spotify.mobile.android.ui.view.DownloadHeaderView.State state)
    {
        Context context;
        if (a)
        {
            if ((context = (Context)b.get()) != null && CellularSyncDialogActivity.a(context) && state == com.spotify.mobile.android.ui.view.DownloadHeaderView.State.i)
            {
                context.startActivity(CellularSyncDialogActivity.a(context, c));
                return;
            }
        }
    }
}
