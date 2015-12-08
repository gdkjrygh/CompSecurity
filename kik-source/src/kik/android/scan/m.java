// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.hardware.Camera;
import android.widget.ImageView;
import java.util.concurrent.ExecutorService;
import kik.android.util.av;
import kik.android.util.cv;
import org.c.b;

// Referenced classes of package kik.android.scan:
//            k, n

final class m
    implements android.hardware.Camera.PreviewCallback
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (k.a(a).getAnimation() == null && cv.c(k.a(a)))
        {
            av.b(k.a(a), 300);
        }
        if (abyte0 == null)
        {
            k.f().a("Null preview data from camera");
            return;
        } else
        {
            k.g().submit(new n(this, abyte0, camera));
            return;
        }
    }
}
