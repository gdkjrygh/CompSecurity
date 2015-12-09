// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.view.View;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ad, s

class a
    implements android.view.OnClickListener
{

    final ad a;

    public void onClick(View view)
    {
        view = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        view.putExtra("key_pic_login_purpose", PicLoginActivity.c);
        view.putExtra("from", "find friend");
        if (a.a != null)
        {
            s s1 = (s)a.a.get();
            if (s1 != null)
            {
                s1.a(a, view, 1, null);
            }
            return;
        } else
        {
            a.startActivityForResult(view, 1);
            return;
        }
    }

    y(ad ad1)
    {
        a = ad1;
        super();
    }
}
