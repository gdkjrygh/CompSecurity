// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.roidapp.baselib.b.k;

// Referenced classes of package com.roidapp.cloudlib:
//            t

final class aa
    implements android.view.View.OnClickListener
{

    final String a;
    final t b;

    aa(t t1, String s)
    {
        b = t1;
        a = s;
        super();
    }

    public final void onClick(View view)
    {
        Log.i("BaseFragment", (new StringBuilder("cancel download ")).append(a).toString());
        k.a(t.a(b));
        t.a(b).setImageDrawable(null);
        b.f.dismiss();
    }
}
