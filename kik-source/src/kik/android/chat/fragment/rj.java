// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            SimpleFragmentWrapperActivity

final class rj extends r
{

    final SimpleFragmentWrapperActivity a;

    rj(SimpleFragmentWrapperActivity simplefragmentwrapperactivity)
    {
        a = simplefragmentwrapperactivity;
        super();
    }

    public final void a()
    {
        super.a();
    }

    public final void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        Intent intent = new Intent();
        intent.putExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT", ((Bundle) (obj)));
        a.setResult(-1, intent);
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.setResult(0);
    }
}
