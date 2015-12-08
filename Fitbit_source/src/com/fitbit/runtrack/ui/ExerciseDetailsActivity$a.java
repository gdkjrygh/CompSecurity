// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.support.v4.content.Loader;
import android.util.Pair;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseDetailsActivity

private static class b
    implements android.os.sActivity.a, android.support.v4.app.cks
{

    private static final int a = 0;
    private final ExerciseDetailsActivity b;
    private final b c = new b();
    private final Handler d = new Handler(this);

    public static Bundle a(UUID uuid)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("uuid", new ParcelUuid(uuid));
        return bundle;
    }

    static b a(cks cks)
    {
        return cks.c;
    }

    public void a(Loader loader, Pair pair)
    {
        d.sendMessage(d.obtainMessage(0, pair));
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            message = (Pair)message.obj;
            break;
        }
        b.a((ActivityLogEntry)((Pair) (message)).first, (ExerciseSession)((Pair) (message)).second);
        return true;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        bundle = ((ParcelUuid)bundle.getParcelable("uuid")).getUuid();
    /* block-local class not found */
    class _cls1 {}

        return new _cls1(b, bundle);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public _cls1(ExerciseDetailsActivity exercisedetailsactivity)
    {
        b = exercisedetailsactivity;
    }
}
