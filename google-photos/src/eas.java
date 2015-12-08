// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public final class eas
    implements omb, opv
{

    static final String a;
    static final ekk b = (new ekm()).a(hpe).a(iks).a();
    mtj c;
    ekp d;
    ekp e;
    ekq f;
    private final Activity g;
    private Context h;

    public eas(Activity activity, opd opd1)
    {
        g = activity;
        opd1.a(this);
    }

    private void a()
    {
        if (f == null || d != null && e == null)
        {
            return;
        } else
        {
            Activity activity = g;
            fhm fhm1 = new fhm(h);
            fhm1.a = ((mmr)olm.a(h, mmr)).d();
            fhm1.b = ((hpe)f.a(hpe)).a.a;
            fhm1.c = ((iks)f.a(iks)).a;
            fhm1.f = e;
            activity.startActivity(fhm1.a());
            return;
        }
    }

    static void a(eas eas1, mue mue1)
    {
        if (mue1 == null || mue1.c() || mue1.a().getParcelable("com.google.android.apps.photos.core.media") == null)
        {
            eas1.d = null;
        } else
        {
            eas1.e = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
        }
        eas1.a();
    }

    static void b(eas eas1, mue mue1)
    {
        if (mue1 == null || mue1.c() || mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection") == null)
        {
            Toast.makeText(eas1.h, b.kH, 0).show();
            return;
        } else
        {
            eas1.f = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
            eas1.a();
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        h = context;
        c = ((mtj)olm1.a(mtj)).a(a, new eau(this)).a("LoadPagerMediaTask", new eat(this));
    }

    static 
    {
        a = elc.a(b.kG);
    }
}
