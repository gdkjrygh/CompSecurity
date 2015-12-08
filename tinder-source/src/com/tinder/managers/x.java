// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.tinder.a.f;
import com.tinder.activities.WebViewActivityInstagram;

// Referenced classes of package com.tinder.managers:
//            z, ae

public final class x
{

    public z a;
    private f b;
    private ae c;

    public x(f f1, z z, ae ae)
    {
        b = f1;
        a = z;
        c = ae;
    }

    public final void a(Fragment fragment)
    {
        if (fragment != null && fragment.getActivity() != null)
        {
            Intent intent = new Intent(fragment.getActivity(), com/tinder/activities/WebViewActivityInstagram);
            intent.putExtra("url", b.H);
            intent.putExtra("url_redirect", b.I);
            fragment.startActivityForResult(intent, 7);
        }
    }
}
