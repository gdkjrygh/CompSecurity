// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.HashSet;
import java.util.Set;

public class ajr
{

    public Context a;
    public Set b;
    public Set c;
    public ahb d;
    public ajt e;
    SurfaceView f;
    Handler g;
    boolean h;
    public RenderScript i;
    private boolean j;
    private boolean k;

    public ajr(Context context, ajs ajs1)
    {
        boolean flag1 = false;
        super();
        a = null;
        b = new HashSet();
        c = new HashSet();
        j = false;
        d = null;
        e = new ajt();
        f = null;
        g = null;
        boolean flag;
        if (((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (ajs1.b && !h)
        {
            throw new RuntimeException("Cannot create context that requires GL support on this platform!");
        }
        flag = flag1;
        if (ahb.b() > 0)
        {
            flag = true;
        }
        k = flag;
        if (ajs1.a && !k)
        {
            throw new RuntimeException("Cannot create context that requires a camera on this platform!");
        }
        if (Looper.myLooper() == null)
        {
            throw new RuntimeException("MffContext must be created in a thread with a Looper!");
        }
        g = new Handler();
        a = context.getApplicationContext();
        if (ajs1.a && ahb.c())
        {
            ajs1 = new SurfaceView(context);
            ajs1.getHolder().setType(3);
            if (context instanceof Activity)
            {
                context = (Activity)context;
            } else
            {
                context = null;
            }
            if (context != null)
            {
                context.addContentView(ajs1, new android.view.ViewGroup.LayoutParams(1, 1));
            } else
            {
                Log.w("MffContext", "Could not find activity for dummy surface! Consider specifying your own SurfaceView!");
            }
            f = ajs1;
        }
    }

    public final ahb a()
    {
        if (d == null)
        {
            d = new ahb(this);
        }
        return d;
    }
}
