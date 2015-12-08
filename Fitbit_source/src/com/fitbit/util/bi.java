// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.util:
//            bf

public abstract class bi extends bf
{

    private static final String a = "SyncDataLoader";
    private final IntentFilter b;
    private boolean c;
    private c d = new c() {

        final bi a;

        public void a(Intent intent)
        {
            com.fitbit.e.a.a("SyncDataLoader", "%s %s", new Object[] {
                a, intent
            });
            a.b(intent);
        }

            
            {
                a = bi.this;
                super();
            }
    };

    public bi(Context context)
    {
        this(context, null);
    }

    public bi(Context context, IntentFilter intentfilter)
    {
        super(context);
        b = intentfilter;
    }

    private void b()
    {
        if (b != null)
        {
            j();
            d.a(b);
        }
    }

    protected void a(Intent intent)
    {
        getContext().startService(intent);
    }

    protected Intent[] a()
    {
        Intent intent = f();
        if (intent != null)
        {
            return (new Intent[] {
                intent
            });
        } else
        {
            return null;
        }
    }

    protected void b(Intent intent)
    {
        c = true;
        onContentChanged();
    }

    protected Intent f()
    {
        return null;
    }

    public void j()
    {
        d.d();
    }

    protected boolean k()
    {
        return c;
    }

    protected void onReset()
    {
        super.onReset();
        j();
    }

    protected void onStartLoading()
    {
        super.onStartLoading();
        b();
        Intent aintent[] = a();
        if (aintent != null)
        {
            int l = aintent.length;
            for (int i = 0; i < l; i++)
            {
                a(aintent[i]);
            }

        }
    }
}
