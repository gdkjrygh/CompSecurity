// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display.tasks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.util.Log;
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

    private Display a()
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                return imageview.getDisplay();
            } else
            {
                return ((WindowManager)imageview.getContext().getSystemService("window")).getDefaultDisplay();
            }
        } else
        {
            return null;
        }
    }

    private int b(Bitmap bitmap)
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

    private Point b()
    {
        Object obj = null;
        Point point = obj;
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            Display display = a();
            point = obj;
            if (display != null)
            {
                point = new Point();
                display.getSize(point);
            }
        }
        return point;
    }

    protected transient Bitmap a(URI auri[])
    {
        if (auri == null || auri.length == 0 || auri[0] == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("urlRequired"));
        }
        Object obj = auri[0];
        Point point;
        try
        {
            point = b();
        }
        catch (Exception exception)
        {
            Log.e(TAG, (new StringBuilder()).append("error encountered in loading image: ").append(auri[0]).toString(), exception);
            return null;
        }
        if (point == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        return b.doImageGetRequest(((URI) (obj)), point.x, point.y);
        obj = b.doImageGetRequest(((URI) (obj)));
        return ((Bitmap) (obj));
    }

    protected void a(Bitmap bitmap)
    {
        ImageView imageview;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 12 && bitmap != null)
            {
                Log.v(TAG, (new StringBuilder()).append("onPostExecute: byte count = ").append(b(bitmap)).toString());
            }
            if (c != null)
            {
                imageview = (ImageView)c.get();
                if (imageview != null)
                {
                    if (bitmap == null)
                    {
                        break label0;
                    }
                    imageview.setImageBitmap(bitmap);
                    imageview.setVisibility(0);
                    imageview.requestLayout();
                    if (d != null)
                    {
                        a.emit(d);
                    }
                }
            }
            return;
        }
        imageview.setImageResource(e);
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
        a((Bitmap)obj);
    }

    public void setSuccessEventType(String s)
    {
        d = s;
    }

}
