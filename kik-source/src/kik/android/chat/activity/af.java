// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.view.View;
import kik.android.widget.KikCropView;

// Referenced classes of package kik.android.chat.activity:
//            KikCropActivity

final class af
    implements android.view.View.OnClickListener
{

    final KikCropActivity a;

    af(KikCropActivity kikcropactivity)
    {
        a = kikcropactivity;
        super();
    }

    public final void onClick(View view)
    {
        KikCropActivity.b(a).b();
    }
}
