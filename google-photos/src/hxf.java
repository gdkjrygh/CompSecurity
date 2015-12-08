// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

public final class hxf
    implements dia
{

    public hxf()
    {
    }

    public final dif a(Activity activity, Bundle bundle)
    {
        return new hxc(activity, hxi.valueOf(bundle.getString("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingMode")));
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.search.suggestions.people_hiding_mode";
    }
}
