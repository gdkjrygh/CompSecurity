// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import android.view.View;

public abstract class DebouncingOnClickListener
    implements android.view.View.OnClickListener
{

    private static final Runnable ENABLE_AGAIN = new Runnable() {

        public void run()
        {
            DebouncingOnClickListener.enabled = true;
        }

    };
    private static boolean enabled = true;

    public DebouncingOnClickListener()
    {
    }

    public abstract void doClick(View view);

    public final void onClick(View view)
    {
        if (enabled)
        {
            enabled = false;
            view.post(ENABLE_AGAIN);
            doClick(view);
        }
    }



/*
    static boolean access$002(boolean flag)
    {
        enabled = flag;
        return flag;
    }

*/
}
