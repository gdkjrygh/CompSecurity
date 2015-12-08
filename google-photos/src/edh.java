// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.view.View;

final class edh
    implements dwj
{

    edh(edg edg)
    {
    }

    public final void a(Context context, View view, ekq ekq, ekp ekp)
    {
        context = (dqs)olm.a(context, dqs);
        view = new ivo(((dqs) (context)).a.ad, ekq, ((dqs) (context)).b);
        ((ivo) (view)).a.putExtra("com.google.android.apps.photos.core.media_collection", ((ivo) (view)).b);
        ((ivo) (view)).a.putExtra("account_id", ((ivo) (view)).c);
        view = ((ivo) (view)).a;
        ((mpk)((dqs) (context)).c.a(mpk)).a(b.iO, view);
    }
}
