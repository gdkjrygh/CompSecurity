// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.daydream.DreamViewFlipper;
import com.google.android.apps.photos.daydream.PhotosDreamService;
import java.util.Set;

public final class ezx
    implements ezv
{

    private PhotosDreamService a;

    public ezx(PhotosDreamService photosdreamservice)
    {
        a = photosdreamservice;
        super();
    }

    public final void a(Set set)
    {
        if (!set.isEmpty())
        {
            a.setContentView(b.nw);
        } else
        {
            a.setContentView(b.nv);
        }
        PhotosDreamService.a(a, (DreamViewFlipper)a.findViewById(u.b));
        if (PhotosDreamService.a(a) && PhotosDreamService.b(a) != null)
        {
            PhotosDreamService.b(a).a(a);
        }
    }
}
