// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.h;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.a.d;
import com.facebook.base.activity.i;
import com.facebook.c.s;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.ui.h:
//            b

public abstract class a extends i
{

    private static final Class p = com/facebook/ui/h/a;
    private Intent q;
    private boolean r;
    private final int s;
    private t t;
    private final Class u;

    public a(int i1, Class class1)
    {
        s = i1;
        u = class1;
    }

    static void a(a a1)
    {
        a1.l();
    }

    private Intent k()
    {
        if (q != null)
        {
            Intent intent = new Intent(q);
            intent.setFlags(intent.getFlags() & 0xefffffff);
            return intent;
        } else
        {
            Intent intent1 = new Intent();
            intent1.setComponent(j());
            return intent1;
        }
    }

    private void l()
    {
        if (r)
        {
            ((s)t.a(com/facebook/c/s)).a(k(), this);
        }
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            q = (Intent)bundle.getParcelableExtra("return_intent");
            r = bundle.getBooleanExtra("should_start_return_intent", true);
        }
        t = i();
        bundle = (d)t.a(com/facebook/base/a/d);
        if (bundle.c())
        {
            l();
            finish();
            return;
        } else
        {
            bundle.a(new b(this));
            setContentView(s);
            return;
        }
    }

    protected ComponentName j()
    {
        return new ComponentName(this, u);
    }

    protected void onPause()
    {
        super.onPause();
        if (!isFinishing())
        {
            setResult(0);
        }
    }

}
