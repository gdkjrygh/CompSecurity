// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bm, ab

public class UpdateDisplayState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bm();
    private static final ReentrantLock d = new ReentrantLock();
    private static long e = -1L;
    private static UpdateDisplayState f = null;
    private static int g = 0;
    private static int h = -1;
    private final String a;
    private final String b;
    private final DisplayState c;

    private UpdateDisplayState(Bundle bundle)
    {
        a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        c = (DisplayState)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }

    UpdateDisplayState(Bundle bundle, bm bm1)
    {
        this(bundle);
    }

    UpdateDisplayState(DisplayState displaystate, String s, String s1)
    {
        a = s;
        b = s1;
        c = displaystate;
    }

    static int a(DisplayState displaystate, String s, String s1)
    {
        int i = -1;
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        if (!b())
        {
            e = System.currentTimeMillis();
            f = new UpdateDisplayState(displaystate, s, s1);
            g++;
            i = g;
        } else
        if (ab.a)
        {
            Log.v("MixpanelAPI.UpdateDisplayState", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        return i;
    }

    static ReentrantLock a()
    {
        return d;
    }

    public static void a(int i)
    {
        d.lock();
        if (i == h)
        {
            h = -1;
            f = null;
        }
        d.unlock();
        return;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public static UpdateDisplayState b(int i)
    {
        d.lock();
        int j;
        if (h <= 0)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        j = h;
        if (j != i)
        {
            d.unlock();
            return null;
        }
        UpdateDisplayState updatedisplaystate = f;
        if (updatedisplaystate == null)
        {
            d.unlock();
            return null;
        }
        e = System.currentTimeMillis();
        h = i;
        updatedisplaystate = f;
        d.unlock();
        return updatedisplaystate;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    static boolean b()
    {
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        long l = System.currentTimeMillis();
        long l1 = e;
        if (g > 0 && l - l1 > 0x2932e00L)
        {
            Log.i("MixpanelAPI.UpdateDisplayState", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
            f = null;
        }
        return f != null;
    }

    public DisplayState c()
    {
        return c;
    }

    public String d()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return b;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", c);
        parcel.writeBundle(bundle);
    }


    private class DisplayState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new bo();

        public abstract String a();


        private DisplayState()
        {
        }

        DisplayState(bm bm1)
        {
            this();
        }
    }

}
