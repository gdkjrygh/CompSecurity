// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.create.CreateActivity;
import java.util.Collection;

public final class eoc
{

    boolean a;
    boolean b;
    Collection c;
    epd d;
    private final Context e;
    private final int f;
    private final hyv g;

    public eoc(Context context, int i)
    {
        e = context;
        f = i;
        g = (hyv)olm.a(context, hyv);
    }

    public final Intent a()
    {
        Intent intent = new Intent(e, com/google/android/apps/photos/create/CreateActivity);
        intent.putExtra("account_id", f);
        intent.putExtra("show_existing", a);
        intent.putExtra("show_only_albums", b);
        intent.putExtra("destination_album", d);
        if (c != null)
        {
            g.a(s.h, c);
        }
        return intent;
    }
}
