// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class epw
    implements eox
{

    epw()
    {
    }

    public final void a(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ekp ekp1;
        if (intent.hasExtra("collection_type") && intent.hasExtra("com.google.android.apps.photos.core.media"))
        {
            throw new IllegalStateException("Provide either a collection type or a media, not both");
        }
        esm esm1 = (esm)intent.getSerializableExtra("collection_type");
        ekp1 = (ekp)intent.getParcelableExtra("com.google.android.apps.photos.core.media");
        intent = (ekq)intent.getParcelableExtra("com.google.android.apps.photos.core.media_collection");
        if (esm1 == null || esm1 == esm.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = (fba)olm.b(context, fba);
        if (context == null) goto _L1; else goto _L3
_L3:
        context.a(faz.c, null);
        return;
        if (ekp1 == null) goto _L1; else goto _L4
_L4:
        fba fba1 = (fba)olm.b(context, fba);
        if (fba1 != null)
        {
            fba1.a(faz.b, null);
        }
        ((epv)((nwm)olm.a(context, nwm)).ai_().a(epv)).a(ekp1, intent);
        return;
    }
}
