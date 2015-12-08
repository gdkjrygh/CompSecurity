// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.widget.Toast;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            rs, VideoTrimmingFragment

final class rt extends r
{

    final rs a;

    rt(rs rs1)
    {
        a = rs1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        Bundle bundle = new Bundle();
        bundle.putString("photoUrl", ((String) (obj)));
        a.a.a(bundle);
        a.a.J();
    }

    public final void b(Throwable throwable)
    {
        Toast.makeText(a.a.getActivity(), 0x7f09026a, 0).show();
    }
}
