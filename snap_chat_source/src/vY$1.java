// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.ui.DSnapView;

final class lang.Object
    implements android.view.OnClickListener
{

    private vY a;

    public final void onClick(View view)
    {
        Timber.c("DSnapItemRemoteVideoAdapter", "Close sign pressed. Moving to top snap.", new Object[0]);
        a.n.a(0, true);
    }

    >(vY vy)
    {
        a = vy;
        super();
    }
}
