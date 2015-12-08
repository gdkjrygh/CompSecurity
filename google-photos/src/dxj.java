// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.assistant.locationreporting.InfoScreenActivity;

final class dxj
    implements dwg
{

    private dum a;
    private dxh b;

    dxj(dxh dxh1, dum dum1)
    {
        b = dxh1;
        a = dum1;
        super();
    }

    public final void a(Context context)
    {
        context = new Intent(context, com/google/android/apps/photos/assistant/locationreporting/InfoScreenActivity);
        context.putExtra("account_id", a.a.a());
        b.a.a(b.kw, context);
    }
}
