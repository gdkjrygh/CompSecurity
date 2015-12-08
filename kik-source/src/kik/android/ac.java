// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.graphics.Bitmap;
import com.kik.g.r;

// Referenced classes of package kik.android:
//            KikNotificationHandler

final class ac extends r
{

    final KikNotificationHandler a;

    ac(KikNotificationHandler kiknotificationhandler)
    {
        a = kiknotificationhandler;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bitmap)obj;
        super.a(obj);
        if (obj != null)
        {
            a.a(true);
        }
    }
}
