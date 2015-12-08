// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.photos.permissions.runtime.NoPermissionsActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class gsw
    implements omb, ooi, ops, opv
{

    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"
    })));
    private static final int b;
    private final Activity c;
    private mpk d;
    private gss e;
    private gst f;
    private boolean g;
    private final gsu h = new gsx(this);
    private final mpj i = new gsy(this);

    public gsw(Activity activity, opd opd1)
    {
        g = false;
        c = activity;
        opd1.a(this);
    }

    private void a()
    {
        Intent intent = new Intent(c, com/google/android/apps/photos/permissions/runtime/NoPermissionsActivity);
        d.a(b, intent);
    }

    static void a(gsw gsw1)
    {
        gsw1.a();
    }

    static boolean a(gsw gsw1, boolean flag)
    {
        gsw1.g = false;
        return false;
    }

    static Activity b(gsw gsw1)
    {
        return gsw1.c;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (mpk)olm1.a(mpk);
        d.a(b, i);
        e = (gss)olm1.a(gss);
        f = (gst)olm1.a(gst);
    }

    public final void b_(Bundle bundle)
    {
        if (!e.a(c, a))
        {
            if (f.a(c, a))
            {
                a();
                return;
            }
            if (bundle != null)
            {
                g = bundle.getBoolean("permission_requested");
            }
            if (!g)
            {
                g = true;
                f.a(c, a, h);
                return;
            }
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("permission_requested", g);
    }

    static 
    {
        b = b.tT;
    }
}
