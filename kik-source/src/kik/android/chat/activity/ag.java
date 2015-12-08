// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.view.View;

// Referenced classes of package kik.android.chat.activity:
//            KikCropActivity

final class ag
    implements android.view.View.OnClickListener
{

    final KikCropActivity a;

    ag(KikCropActivity kikcropactivity)
    {
        a = kikcropactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
