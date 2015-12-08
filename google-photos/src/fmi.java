// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class fmi
{

    public ekw a;
    public boolean b;
    public boolean c;
    public ekq d;
    public String e;

    public fmi()
    {
        a = ekw.a;
    }

    public final am a()
    {
        if (d == null)
        {
            throw new IllegalArgumentException("You must provide a media collection");
        }
        fme fme1 = new fme();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", d);
        bundle.putBoolean("zoom_enabled", b);
        bundle.putBoolean("is_picker", c);
        bundle.putString("zoom_level_preference_key", e);
        if (a != null)
        {
            bundle.putParcelable("com.google.android.apps.photos.core.query_options", a);
        }
        fme1.f(bundle);
        return fme1;
    }
}
