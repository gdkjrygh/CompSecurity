// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import java.util.concurrent.Callable;

public class gft
    implements dmx
{

    private Picasso a;
    private boolean b;
    private final Context c;
    private final Downloader d;
    private final Callable e;

    public gft(Context context, Downloader downloader, Callable callable)
    {
        geh.b("Not called from main loop");
        c = context;
        d = downloader;
        e = callable;
    }

    public static gwi a(ImageView imageview)
    {
        return a(imageview, dfo.a(), null);
    }

    public static gwi a(ImageView imageview, dfr dfr)
    {
        ctz.a(imageview);
        boolean flag = ((gft)dmz.a(gft)).b;
        gfu gfu2 = (gfu)imageview.getTag(0x7f1100e4);
        gfu gfu1 = gfu2;
        if (gfu2 == null)
        {
            gfu1 = new gfu(imageview, new dfv(imageview) {

                private ImageView a;

                public final Drawable a(Bitmap bitmap)
                {
                    return new BitmapDrawable(a.getResources(), bitmap);
                }

            
            {
                a = imageview;
                super();
            }
            }, flag);
            imageview.setTag(0x7f1100e4, gfu1);
        }
        gfu1.b = dfr;
        return gfu1;
    }

    public static gwi a(ImageView imageview, dfv dfv)
    {
        return a(imageview, dfv, null);
    }

    public static gwi a(ImageView imageview, dfv dfv, gve gve)
    {
        ctz.a(imageview);
        ctz.a(dfv);
        boolean flag = ((gft)dmz.a(gft)).b;
        gfu gfu2 = (gfu)imageview.getTag(0x7f1100e4);
        gfu gfu1 = gfu2;
        if (gfu2 == null)
        {
            gfu1 = new gfu(imageview, dfv, flag);
            imageview.setTag(0x7f1100e4, gfu1);
        }
        gfu1.b = gve;
        gfu1.a = dfv;
        return gfu1;
    }

    private static Object a(Callable callable, Object obj)
    {
        try
        {
            callable = ((Callable) (callable.call()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            return obj;
        }
        return callable;
    }

    public final Picasso a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        obj = new gvt(c);
        obj1 = c;
        ActivityManager activitymanager = (ActivityManager)((Context) (obj1)).getSystemService("activity");
        int i = activitymanager.getMemoryClass();
        if ((((Context) (obj1)).getApplicationInfo().flags & 0x100000) != 0)
        {
            i = activitymanager.getLargeMemoryClass();
        }
        obj1 = new gvq((i * 0x100000) / 7 / 2);
        if (((gvt) (obj)).d != null)
        {
            throw new IllegalStateException("Memory cache already set.");
        }
        break MISSING_BLOCK_LABEL_101;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj.d = ((gvd) (obj1));
        obj1 = d;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        throw new IllegalArgumentException("Downloader must not be null.");
        if (((gvt) (obj)).b != null)
        {
            throw new IllegalStateException("Downloader already set.");
        }
        obj.b = ((Downloader) (obj1));
        obj1 = ((gvt) (obj)).a;
        if (((gvt) (obj)).b == null)
        {
            obj.b = gwm.a(((Context) (obj1)));
        }
        if (((gvt) (obj)).d == null)
        {
            obj.d = new gvq(((Context) (obj1)));
        }
        if (((gvt) (obj)).c == null)
        {
            obj.c = new gvx();
        }
        if (((gvt) (obj)).e == null)
        {
            obj.e = gvv.a;
        }
        gwf gwf1 = new gwf(((gvt) (obj)).d);
        a = new Picasso(((Context) (obj1)), new gvi(((Context) (obj1)), ((gvt) (obj)).c, Picasso.a, ((gvt) (obj)).b, ((gvt) (obj)).d, gwf1), ((gvt) (obj)).d, ((gvt) (obj)).e, gwf1);
        b = ((Boolean)a(e, Boolean.valueOf(false))).booleanValue();
        if (b)
        {
            a.g = true;
            a.h = true;
        }
        obj = a;
        this;
        JVM INSTR monitorexit ;
        return ((Picasso) (obj));
    }
}
