// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

final class dkj
    implements ezy
{

    private final mmv a;
    private final dkk b;

    public dkj(Context context)
    {
        a = (mmv)olm.a(context, mmv);
        b = new dkk(context);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final Set a(int i)
    {
        if (i == -1)
        {
            return new HashSet();
        } else
        {
            String s = a.a(i).d("com.google.android.apps.photos.allphotos").b("dream_all_photos");
            return b.a(s, i);
        }
    }

    public final void a(int i, Set set)
    {
        if (i == -1)
        {
            return;
        } else
        {
            a.b(i).h("com.google.android.apps.photos.allphotos").c("dream_all_photos", b.a(set)).d();
            return;
        }
    }
}
