// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.kik.g.p;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment, rt

final class rs
    implements android.view.View.OnClickListener
{

    final VideoTrimmingFragment a;

    rs(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (VideoTrimmingFragment.a(a) == 0.0F && VideoTrimmingFragment.b(a) * 1000F == (float)VideoTrimmingFragment.c(a))
        {
            view = VideoTrimmingFragment.d(a);
            if (view == null)
            {
                Toast.makeText(a.getActivity(), 0x7f09026a, 0).show();
                return;
            } else
            {
                Bundle bundle = new Bundle();
                bundle.putString("photoUrl", view);
                a.a(bundle);
                a.J();
                return;
            }
        } else
        {
            VideoTrimmingFragment.e(a).a(new rt(this));
            return;
        }
    }
}
