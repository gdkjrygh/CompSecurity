// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.tinder.a.f;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements android.view.stener
{

    final FragmentJob a;

    public final void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(f.aa));
        a.startActivity(view);
    }

    (FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
