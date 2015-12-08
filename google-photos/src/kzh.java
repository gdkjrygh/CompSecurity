// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;

public final class kzh extends kzf
{

    private final kzj a;
    private kzg b;

    public kzh(kzg kzg1, kzj kzj1)
    {
        b = kzg1;
        super(kzg1.g);
        a = kzj1;
    }

    public final void a(int i)
    {
        kzb.a().a("onError: %d", new Object[] {
            Integer.valueOf(i)
        });
        kzb.a(b.g);
        b.a(new juy(Status.c));
    }

    public final void a(int i, int j, Surface surface)
    {
        kzb.a().a("onConnected", new Object[0]);
        DisplayManager displaymanager = (DisplayManager)((kbo) (a)).f.getSystemService("display");
        if (displaymanager == null)
        {
            kzb.a().d("Unable to get the display manager", new Object[0]);
            b.a(new juy(Status.c));
            return;
        }
        kzb.a(b.g);
        int k;
        if (i < j)
        {
            k = i;
        } else
        {
            k = j;
        }
        k = (k * 320) / 1080;
        kzb.a(b.g, displaymanager.createVirtualDisplay("private_display", i, j, k, surface, 2));
        if (kzb.d(b.g) == null)
        {
            kzb.a().d("Unable to create virtual display", new Object[0]);
            b.a(new juy(Status.c));
            return;
        }
        if (kzb.d(b.g).getDisplay() == null)
        {
            kzb.a().d("Virtual display does not have a display", new Object[0]);
            b.a(new juy(Status.c));
            return;
        }
        try
        {
            surface = a;
            i = kzb.d(b.g).getDisplay().getDisplayId();
            ((kzo)surface.o()).a(this, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Surface surface) { }
        // Misplaced declaration of an exception variable
        catch (Surface surface) { }
        kzb.a().d("Unable to provision the route's new virtual Display", new Object[0]);
        b.a(new juy(Status.c));
    }

    public final void b()
    {
        kzb.a().a("onConnectedWithDisplay", new Object[0]);
        Display display = kzb.d(b.g).getDisplay();
        if (display != null)
        {
            b.a(new juy(display));
            return;
        } else
        {
            kzb.a().d("Virtual display no longer has a display", new Object[0]);
            b.a(new juy(Status.c));
            return;
        }
    }
}
