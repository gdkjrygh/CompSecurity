// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.millennialmedia.c;
import com.millennialmedia.internal.utils.e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MMIntentWrapperActivity extends Activity
{
    private static class a
    {

        CountDownLatch a;
        b b;
        Intent c;
    }

    public static interface b
    {

        public abstract void a(Intent intent);

        public abstract void a(String s);
    }


    private static final String a = com/millennialmedia/internal/MMIntentWrapperActivity.getSimpleName();
    private a b;

    public MMIntentWrapperActivity()
    {
    }

    private boolean a()
    {
        Object obj = e.a(getIntent().getIntExtra("intent_wrapper_state_id", 0));
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            b = (a)obj;
            return true;
        }
    }

    private boolean b()
    {
        Intent intent = getIntent();
        intent.removeExtra("intent_wrapper_state_id");
        int i = e.a(b, null);
        if (i == 0)
        {
            return false;
        } else
        {
            intent.putExtra("intent_wrapper_state_id", i);
            return true;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (b != null && b.b != null)
        {
            if (j == -1)
            {
                b.b.a(intent);
            } else
            {
                b.b.a((new StringBuilder()).append("Activity failed with result code <").append(j).append(">").toString());
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!a())
        {
            c.d(a, (new StringBuilder()).append("Failed to load activity state, aborting activity launch <").append(this).append(">").toString());
            finish();
        } else
        if (bundle == null)
        {
            b.a.countDown();
            if (b.c != null && b.c.resolveActivity(getPackageManager()) != null)
            {
                startActivityForResult(b.c, 0);
                return;
            } else
            {
                b.b.a((new StringBuilder()).append("Failed to start activity, aborting activity launch <").append(this).append(">").toString());
                finish();
                return;
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (!isFinishing() && !b())
        {
            c.d(a, (new StringBuilder()).append("Failed to save activity state <").append(this).append(">").toString());
        }
    }


    // Unreferenced inner class com/millennialmedia/internal/MMIntentWrapperActivity$1

/* anonymous class */
    static final class _cls1
        implements Runnable
    {

        final a a;

        public void run()
        {
            try
            {
                if (!a.a.await(5000L, TimeUnit.MILLISECONDS))
                {
                    a.b.a("Failed to start activity");
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }
    }

}
