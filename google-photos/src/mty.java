// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class mty
{

    final Context a;
    final SparseArray b = new SparseArray();
    final List c = new ArrayList();
    final Queue d = new LinkedBlockingQueue();
    final Handler e = new Handler(Looper.getMainLooper());
    final mtp f;
    int g;
    private final mth h;

    mty(Context context)
    {
        a = context;
        f = new mtp(context, "background_results.bin");
        g = PreferenceManager.getDefaultSharedPreferences(a).getInt("bom_last_listener_id", 0);
        h = (mth)olm.a(context, mth);
    }

    static void a(mty mty1, mtf mtf1, mue mue1)
    {
        String s;
        int i;
        mty1.c.remove(mtf1);
        i = mtf1.f;
        s = mtf1.d;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("BackgroundTask", 2))
        {
            mty1 = String.valueOf(mue1);
            (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(mty1).length())).append("No manager, dropping task result: ").append(s).append(", ").append(mty1);
        }
_L4:
        return;
_L2:
        mtj mtj1 = (mtj)mty1.b.get(i);
        if (mtj1 != null)
        {
            if (mtf1.g)
            {
                if (Log.isLoggable("BackgroundTask", 3))
                {
                    mty1 = String.valueOf(mue1);
                    (new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(mty1).length())).append("Task is canceled, dropping result from manager: ").append(s).append(", ").append(mty1);
                }
                mtj1.a.a(s);
                return;
            }
            if (Log.isLoggable("BackgroundTask", 3))
            {
                mty1 = String.valueOf(mue1);
                (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(mty1).length())).append("Deliver background task result: ").append(s).append(", ").append(mty1);
            }
            mtj1.a(s, mue1);
            return;
        }
        if (!mtf1.g)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("BackgroundTask", 3))
        {
            mty1 = String.valueOf(mue1);
            (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(mty1).length())).append("Task is canceled, dropping task result: ").append(s).append(", ").append(mty1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mue1.f != muf.a)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("BackgroundTask", 3))
        {
            mty1 = String.valueOf(mue1);
            (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(mty1).length())).append("Dropping task result: ").append(s).append(", ").append(mty1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (Log.isLoggable("BackgroundTask", 3))
        {
            mtf1 = String.valueOf(mue1);
            (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(mtf1).length())).append("Store background task result: ").append(s).append(", ").append(mtf1);
        }
        mue1.d();
        mtf1 = mty1.f;
        if (mtp.a(mue1) > 0x1f400)
        {
            if (Log.isLoggable("BackgroundTask", 5))
            {
                mty1 = String.valueOf(mue1);
                Log.w("BackgroundTask", (new StringBuilder(String.valueOf(mty1).length() + 34 + String.valueOf(s).length())).append("Result too large to store: ").append(mty1).append(", tag: ").append(s).toString());
                return;
            }
        } else
        {
            synchronized (((mtp) (mtf1)).a)
            {
                mtf1.a();
                mtf1.a(new mtq(i, s, mue1));
                mtf1.b();
            }
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        mtf1;
        mty1;
        JVM INSTR monitorexit ;
        throw mtf1;
    }

    public final int a(mtj mtj1, String s)
    {
        b.u();
        int k = mtj1.d();
        int l = c.size();
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            mtj1 = (mtf)c.get(j);
            if (((mtf) (mtj1)).f == k && ((mtf) (mtj1)).d.equals(s))
            {
                i++;
            }
        }

        return i;
    }

    public final void a(mtf mtf1, mtj mtj1)
    {
        b.u();
        mtf1.b();
        int i = 0;
        if (mtj1 != null)
        {
            i = mtj1.d();
        }
        mtf1.f = i;
        c.add(mtf1);
        d.add(mtf1);
        h.a();
        if (Log.isLoggable("BackgroundTask", 3))
        {
            mtf1 = String.valueOf(mtf1.d);
            (new StringBuilder(String.valueOf(mtf1).length() + 45)).append("Start background task: ").append(mtf1).append(", manager: ").append(i);
        }
    }

    final boolean a()
    {
        return !c.isEmpty();
    }
}
