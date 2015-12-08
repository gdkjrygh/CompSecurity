// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewConfiguration;
import java.util.Set;

public class hyy
    implements nuc, nug, omb, opl, opn, ops, opv
{

    private static final Set f = new hyz();
    public final ntz a = new ntz(this);
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    private hzh g;
    private mwx h;
    private final Bundle i;
    private Activity j;
    private mwz k;
    private final Runnable l = new hza(this);

    public hyy(Activity activity, opd opd1)
    {
        boolean flag = false;
        super();
        d = true;
        e = true;
        j = activity;
        Bundle bundle = activity.getIntent().getExtras();
        if (f.contains(activity.getIntent().getAction()))
        {
            activity = activity.getIntent();
            if (activity.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false) || "android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(activity.getAction()))
            {
                flag = true;
            }
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 2;
            }
            if (bundle != null)
            {
                activity = new Bundle(bundle);
            } else
            {
                activity = new Bundle();
            }
            activity.putInt("com.google.android.apps.photos.selection.ExtraPhotoPickerMode", i1);
        } else
        {
            activity = bundle;
        }
        i = activity;
        opd1.a(this);
    }

    static boolean a(hyy hyy1, boolean flag)
    {
        hyy1.e = true;
        return true;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = (hzh)olm1.a(hzh);
        h = (mwx)olm1.a(mwx);
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        if (bundle != null)
        {
            b = bundle.getInt("com.google.android.apps.photos.selection.PickerModeModel.PickerMode", 0);
            c = bundle.getBoolean("com.google.android.apps.photos.selection.PickerModeModel.StartedInMultiSelect", false);
        } else
        if (i != null)
        {
            b = i.getInt("com.google.android.apps.photos.selection.ExtraPhotoPickerMode");
            boolean flag = flag1;
            if (b != 3)
            {
                flag = flag1;
                if (b != 1)
                {
                    if (b == 4)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            c = flag;
        } else
        {
            b = 0;
        }
        g.a.a(this, false);
    }

    public final void a(boolean flag)
    {
        d = flag;
        if (!flag)
        {
            e = false;
            h.a(k);
            k = null;
        } else
        if (k == null)
        {
            k = h.a(l, ViewConfiguration.getLongPressTimeout());
            return;
        }
    }

    public final boolean a(int i1)
    {
        if (!d)
        {
            return false;
        }
        b = i1;
        if (!b())
        {
            c = false;
        }
        j.invalidateOptionsMenu();
        a.b();
        return true;
    }

    public final boolean b()
    {
        return b != 5 && b != 0;
    }

    public final void b_(Object obj)
    {
        if (((hzh)obj).b.a.size() == 0 && b != 1 && b != 2 && b != 4)
        {
            a(0);
        }
    }

    public final void c()
    {
        g.a.a(this);
    }

    public final boolean d()
    {
        return b == 3 || b == 1;
    }

    public final void e(Bundle bundle)
    {
        bundle.putInt("com.google.android.apps.photos.selection.PickerModeModel.PickerMode", b);
        bundle.putBoolean("com.google.android.apps.photos.selection.PickerModeModel.StartedInMultiSelect", c);
    }

}
