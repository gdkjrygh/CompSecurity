// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.snapchat.android.SnapchatApplication;

public final class rT extends DisplayMetrics
{

    public rT()
    {
        this(((WindowManager)SnapchatApplication.get().getApplicationContext().getSystemService("window")).getDefaultDisplay());
    }

    private rT(Display display)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        setTo(displaymetrics);
        widthPixels = Jo.a(displaymetrics, false);
        heightPixels = Jo.b(displaymetrics, false);
        if (widthPixels != displaymetrics.widthPixels)
        {
            xdpi = displaymetrics.ydpi;
            ydpi = displaymetrics.xdpi;
        }
    }
}
