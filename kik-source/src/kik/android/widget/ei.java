// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package kik.android.widget:
//            UpdatingDateView

final class ei extends ContentObserver
{

    final UpdatingDateView a;

    ei(UpdatingDateView updatingdateview, Handler handler)
    {
        a = updatingdateview;
        super(handler);
    }

    public final void onChange(boolean flag)
    {
        UpdatingDateView.b(a);
    }
}
