// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.kik.g.f;
import com.kik.g.i;
import kik.a.ab;
import kik.a.e.k;
import kik.android.chat.KikApplication;
import kik.android.chat.a;

// Referenced classes of package kik.android.chat.activity:
//            m

public class KikActivityBase extends Activity
{
    private final class a
    {

        final KikActivityBase a;
        private f b;
        private i c;

        static f a(a a1)
        {
            return a1.b;
        }

        public final void a()
        {
            b.a();
        }

        public a()
        {
            a = KikActivityBase.this;
            super();
            c = new m(this);
            b = new f();
            b.a(KikActivityBase.this.c.a(), c);
            b.a(KikActivityBase.this.c.c(), c);
        }
    }


    private volatile boolean a;
    k b;
    ab c;
    protected final int d = 1;
    private volatile boolean e;
    private a f;

    public KikActivityBase()
    {
        a = false;
        e = false;
        f = null;
    }

    static a a(KikActivityBase kikactivitybase)
    {
        kikactivitybase.f = null;
        return null;
    }

    protected final void b()
    {
        a = true;
    }

    protected final boolean c()
    {
        return a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((kik.android.chat.a)getApplication()).a().a(this);
        requestWindowFeature(1);
        f = new a();
    }

    protected void onDestroy()
    {
        if (f != null)
        {
            f.a();
        }
        f = null;
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a = true;
        ((KikApplication)getApplication()).d(this);
    }

    protected void onPause()
    {
        super.onPause();
        a = false;
        ((KikApplication)getApplication()).c(this);
    }

    protected void onResume()
    {
        super.onResume();
        b.c();
        a = true;
        ((KikApplication)getApplication()).d(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        e = flag;
    }
}
