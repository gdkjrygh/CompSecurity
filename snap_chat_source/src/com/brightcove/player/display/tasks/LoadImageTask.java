// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display.tasks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.util.ErrorUtil;
import java.lang.ref.WeakReference;
import java.net.URI;

public class LoadImageTask extends AsyncTask
    implements Component
{

    public static final String TAG = com/brightcove/player/display/tasks/LoadImageTask.getSimpleName();
    private EventEmitter a;
    private HttpService b;
    private final WeakReference c;
    private String d;
    private int e;

    public LoadImageTask(ImageView imageview, EventEmitter eventemitter)
    {
        e = 0x108001c;
        if (imageview == null || eventemitter == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("imageViewAndEventEmitterRequired"));
        } else
        {
            a = RegisteringEventEmitter.build(eventemitter, com/brightcove/player/display/tasks/LoadImageTask);
            c = new WeakReference(imageview);
            b = new HttpService();
            return;
        }
    }

    private static int a(Bitmap bitmap)
    {
        int i;
        try
        {
            i = bitmap.getByteCount();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return -1;
        }
        return i;
    }

    private transient Bitmap a(URI auri[])
    {
        URI uri;
        if (auri == null || auri.length == 0 || auri[0] == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("urlRequired"));
        }
        uri = auri[0];
        if (android.os.Build.VERSION.SDK_INT < 13) goto _L2; else goto _L1
_L1:
        Object obj = (ImageView)c.get();
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L6; else goto _L5
_L5:
        obj = ((ImageView) (obj)).getDisplay();
_L12:
        if (obj == null) goto _L2; else goto _L7
_L7:
        Point point;
        try
        {
            point = new Point();
            ((Display) (obj)).getSize(point);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            (new StringBuilder("error encountered in loading image: ")).append(auri[0]);
            return null;
        }
        obj = point;
_L10:
        if (obj == null) goto _L9; else goto _L8
_L8:
        return b.doImageGetRequest(uri, ((Point) (obj)).x, ((Point) (obj)).y);
_L6:
        obj = ((WindowManager)((ImageView) (obj)).getContext().getSystemService("window")).getDefaultDisplay();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = b.doImageGetRequest(uri);
        return ((Bitmap) (obj));
_L2:
        obj = null;
        if (true) goto _L10; else goto _L4
_L4:
        obj = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((URI[])aobj);
    }

    public String getSuccessEventType()
    {
        return d;
    }

    protected void onPostExecute(Object obj)
    {
        ImageView imageview;
label0:
        {
            obj = (Bitmap)obj;
            if (android.os.Build.VERSION.SDK_INT >= 12 && obj != null)
            {
                (new StringBuilder("onPostExecute: byte count = ")).append(a(((Bitmap) (obj))));
            }
            imageview = (ImageView)c.get();
            if (imageview != null)
            {
                if (obj == null)
                {
                    break label0;
                }
                imageview.setImageBitmap(((Bitmap) (obj)));
                imageview.setVisibility(0);
                imageview.requestLayout();
                if (d != null)
                {
                    a.emit(d);
                }
            }
            return;
        }
        imageview.setImageResource(e);
    }

    public void setSuccessEventType(String s)
    {
        d = s;
    }

}
