// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.a.a.a;
import java.util.ArrayList;
import kik.android.util.bf;

// Referenced classes of package kik.android.widget:
//            VideoKeyFrameView

private final class b extends bf
{

    final VideoKeyFrameView a;
    private int b;

    private transient Bitmap a()
    {
        Object obj1 = VideoKeyFrameView.b(a).getFrameAtTime(kik.android.widget.VideoKeyFrameView.a(a) * (long)b * 1000L);
        Object obj;
        Object obj2;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj2 = obj1;
        obj = VideoKeyFrameView.b(a).getFrameAtTime(kik.android.widget.VideoKeyFrameView.a(a) * (long)b * 1000L + 100L);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj2 = obj;
        obj1 = obj;
        Bitmap bitmap = kik.android.widget.VideoKeyFrameView.a(((Bitmap) (obj)), VideoKeyFrameView.c(a), VideoKeyFrameView.d(a));
        obj2 = obj;
        obj1 = obj;
        ((Bitmap) (obj)).recycle();
        return bitmap;
        obj1;
        obj = null;
_L3:
        com.a.a.a.a(((Exception) (obj1)).getMessage());
        return ((Bitmap) (obj));
        obj;
        return null;
        obj;
        return ((Bitmap) (obj2));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L3; else goto _L2
_L2:
        return ((Bitmap) (obj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (b < VideoKeyFrameView.e(a))
        {
            VideoKeyFrameView.f(a).add(obj);
            a.invalidate();
            (new <init>(a, b + 1)).a(new Void[0]);
        }
    }

    public (VideoKeyFrameView videokeyframeview, int i)
    {
        a = videokeyframeview;
        super();
        b = i;
    }
}
