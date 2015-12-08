// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.assistant.locationreporting.InfoScreenActivity;

public final class dxl
    implements android.view.View.OnClickListener
{

    private mtf a;
    private InfoScreenActivity b;

    public dxl(InfoScreenActivity infoscreenactivity, mtf mtf)
    {
        b = infoscreenactivity;
        a = mtf;
        super();
    }

    public final void onClick(View view)
    {
        mtj.a(b, a);
        InfoScreenActivity.a(b, true);
    }
}
