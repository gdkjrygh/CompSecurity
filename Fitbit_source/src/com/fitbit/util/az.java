// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.IntentFilter;
import com.fitbit.data.repo.ap;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.util:
//            bi

public abstract class az extends bi
    implements ap
{

    private static final long a = 100L;

    public az(Context context)
    {
        this(context, null);
    }

    public az(Context context, IntentFilter intentfilter)
    {
        super(context, intentfilter);
        setUpdateThrottle(100L);
    }

    protected abstract boolean a(String s);

    protected abstract void b();

    public void b(String s)
    {
        if (a(s))
        {
            FitbitHandlerThread.a(new Runnable() {

                final az a;

                public void run()
                {
                    a.onContentChanged();
                }

            
            {
                a = az.this;
                super();
            }
            });
        }
    }

    protected abstract void d();

    protected Object onLoadInBackground()
    {
        Object obj = super.onLoadInBackground();
        b();
        return obj;
    }

    protected void onReset()
    {
        super.onReset();
        d();
    }
}
