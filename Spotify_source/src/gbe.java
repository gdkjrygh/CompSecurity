// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.SeekBar;

public abstract class gbe
    implements gak
{

    private static final gak c = new gak() {

        public final void a(SeekBar seekbar)
        {
        }

        public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
        }

        public final void onStartTrackingTouch(SeekBar seekbar)
        {
        }

        public final void onStopTrackingTouch(SeekBar seekbar)
        {
        }

    };
    public gak a;
    private final eqh b;

    public gbe(eqh eqh1)
    {
        a = c;
        b = eqh1;
    }

    public abstract void a(int i);

    public abstract void a(long l, long l1);

    public final void a(SeekBar seekbar)
    {
        a.a(seekbar);
        a(seekbar.getProgress(), seekbar.getMax());
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        a.onProgressChanged(seekbar, i, flag);
        if (flag)
        {
            b.a();
            a(i / 1000);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        a.onStartTrackingTouch(seekbar);
        b.a();
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        a.onStopTrackingTouch(seekbar);
        a(seekbar.getProgress(), seekbar.getMax());
    }

}
