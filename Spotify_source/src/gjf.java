// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.tracking.TrackingService;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;
import java.util.UUID;

public class gjf
{

    private Context a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private int f;

    private gjf(Context context, String s)
    {
        f = 0;
        Assertion.a(s, "viewName must not be null");
        a = context;
        c = null;
        d = s;
        e = false;
        b = UUID.randomUUID().toString();
    }

    public static gjf a(Context context, String s)
    {
        return new gjf(context, s);
    }

    public static boolean b(Bundle bundle)
    {
        while (bundle == null || !bundle.containsKey("ViewLoadingTracker.ID") || !bundle.containsKey("ViewLoadingTracker.VIEW_URI") || !bundle.containsKey("ViewLoadingTracker.STATE")) 
        {
            return false;
        }
        return true;
    }

    public final void a()
    {
        switch (f)
        {
        default:
            Context context = a;
            String s = b;
            Object obj = d;
            boolean flag = e;
            obj = ViewLoadTimerMessage.a(((String) (obj)), "load_start", System.currentTimeMillis());
            obj.a = true;
            obj.c = s;
            TrackingService.a(context, "TYPE_VIEW_LOADING", "load_start", gje.a(s, ((gjd) (obj)).a(), flag));
            f = 1;
            // fall through

        case 1: // '\001'
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        bundle.putString("ViewLoadingTracker.ID", b);
        bundle.putString("ViewLoadingTracker.VIEW_NAME", d);
        bundle.putString("ViewLoadingTracker.VIEW_URI", c);
        bundle.putInt("ViewLoadingTracker.STATE", f);
        bundle.putBoolean("ViewLoadingTracker.DRY_RUN", e);
    }

    public final void b()
    {
        switch (f)
        {
        case 1: // '\001'
        default:
            Context context = a;
            String s = b;
            Object obj = d;
            boolean flag = e;
            obj = ViewLoadTimerMessage.a(((String) (obj)), "load_finished", System.currentTimeMillis());
            obj.b = true;
            obj.c = s;
            TrackingService.a(context, "TYPE_VIEW_LOADING", "load_finished", gje.a(s, ((gjd) (obj)).a(), flag));
            f = 2;
            // fall through

        case 2: // '\002'
            return;

        case 0: // '\0'
            Assertion.b("Complete called in wrong state. Have you called start()?");
            return;

        case 3: // '\003'
            Assertion.b("Complete cannot be called after tracking was cancelled.");
            break;
        }
    }

    public final void c()
    {
        switch (f)
        {
        case 1: // '\001'
        default:
            Context context = a;
            String s = b;
            Object obj = d;
            boolean flag = e;
            obj = ViewLoadTimerMessage.a(((String) (obj)), "load_cancelled", System.currentTimeMillis());
            obj.b = true;
            obj.c = s;
            TrackingService.a(context, "TYPE_VIEW_LOADING", "load_cancelled", gje.a(s, ((gjd) (obj)).a(), flag));
            f = 3;
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 0: // '\0'
            Assertion.b("Cancel called in wrong state. Have you called start()?");
            break;
        }
    }

    public final void c(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        if (!b(bundle))
        {
            Assertion.b("Invalid saved state bundle. Have you called saveToBundle?");
            return;
        } else
        {
            bundle.setClassLoader(gjf.getClassLoader());
            b = bundle.getString("ViewLoadingTracker.ID");
            c = bundle.getString("ViewLoadingTracker.VIEW_URI");
            d = bundle.getString("ViewLoadingTracker.VIEW_NAME");
            f = bundle.getInt("ViewLoadingTracker.STATE");
            e = bundle.getBoolean("ViewLoadingTracker.DRY_RUN");
            return;
        }
    }

    public final boolean d()
    {
        return f == 3;
    }

    public final boolean e()
    {
        return f == 1;
    }
}
