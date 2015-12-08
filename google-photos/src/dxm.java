// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.assistant.locationreporting.InfoScreenActivity;

public final class dxm
    implements android.view.View.OnClickListener
{

    private InfoScreenActivity a;

    public dxm(InfoScreenActivity infoscreenactivity)
    {
        a = infoscreenactivity;
        super();
    }

    public final void onClick(View view)
    {
        InfoScreenActivity.a(a, false);
    }
}
