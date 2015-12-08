// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.b;

// Referenced classes of package p.ca:
//            aj

class Object
    implements android.view.OnClickListener
{

    final aj a;

    public void onClick(View view)
    {
        if (aj.a(a) == null || !aj.a(a).d())
        {
            b.a.e().a(new p.bz.b(null, true));
        }
        a.getActivity().onBackPressed();
    }

    ew.View(aj aj1)
    {
        a = aj1;
        super();
    }
}
