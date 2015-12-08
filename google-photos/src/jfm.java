// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

final class jfm extends mtf
{

    private final jfq a;
    private final Map b;

    public jfm(jfq jfq1, Map map)
    {
        super("com.google.android.apps.photos.videoplayer.InitializeMediaPlayerHeadersTask");
        p.a(jfq1);
        p.a(map);
        a = jfq1;
        b = map;
    }

    protected final mue a(Context context)
    {
        context = new mue(a.a(context, b));
        context.a().putParcelable("com.google.android.apps.photos.videoplayer.InitHeaderTask.URI", a.b);
        return context;
    }
}
