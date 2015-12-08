// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;
import com.spotify.mobile.android.spotlets.collection.service.Annotation;
import java.util.Map;

public final class eob extends Binder
{

    public final AnnotateService a;

    public eob(AnnotateService annotateservice)
    {
        a = annotateservice;
        super();
    }

    public final com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status a(String s)
    {
        s = (Annotation)AnnotateService.h(a).get(s);
        if (s != null)
        {
            return s.getStatus();
        } else
        {
            return com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a;
        }
    }
}
