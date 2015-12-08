// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;

public final class eoc
{

    public Context a;
    public Intent b;

    public eoc(Context context)
    {
        a = context;
        b = new Intent(a, com/spotify/mobile/android/spotlets/collection/service/AnnotateService);
        b.setAction("com.spotify.mobile.android.spotlets.collection.service.AnnotateService.action.ANNOTATE");
    }
}
