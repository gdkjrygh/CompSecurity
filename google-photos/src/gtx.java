// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.photos.photoeditor.contentprovider.EditMediaContentProvider;

public final class gtx
{

    public final gur a;
    private final Context b;

    gtx(Context context)
    {
        b = context;
        a = (gur)olm.a(context, gur);
    }

    public Uri a(gtt gtt1, ejm ejm)
    {
        gtu gtu1 = new gtu();
        gtu1.a = gtt1.a;
        gtt1 = gtu1.a(gtt1.b);
        gtt1.b = ejm;
        return gtt1.a().a(EditMediaContentProvider.a(b));
    }
}
