// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;

final class hnn
    implements hno
{

    private boolean a;
    private hnd b;

    hnn(hnd hnd1, boolean flag)
    {
        b = hnd1;
        a = flag;
        super();
    }

    public final void a(AlbumTitleCard albumtitlecard)
    {
        if (hnd.c(b).v())
        {
            hnd.a(b, true, a);
            if (hnd.d(b) == null)
            {
                hnd.a(b, new hnq(b));
            }
            if (hnd.e(b) != null)
            {
                hnd.e(b).a().a(hnd.d(b));
                return;
            }
        }
    }
}
