// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.daydream.DreamSettingsActivity;
import java.util.Set;

public final class ezn
    implements ezv
{

    private DreamSettingsActivity a;

    public ezn(DreamSettingsActivity dreamsettingsactivity)
    {
        a = dreamsettingsactivity;
        super();
    }

    public final void a(Set set)
    {
        DreamSettingsActivity.a(a, set);
        DreamSettingsActivity.a(a, null, null);
    }
}
