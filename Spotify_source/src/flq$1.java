// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;

final class ang.Class extends Property
{

    private flq a;

    public final Object get(Object obj)
    {
        return Integer.valueOf(((CancellableSeekBar)obj).getProgress());
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (CancellableSeekBar)obj;
        obj1 = (Integer)obj1;
        ((CancellableSeekBar) (obj)).setProgress(((Integer) (obj1)).intValue());
        a.c.setText(flt.a(((Integer) (obj1)).intValue() / 1000));
    }

    (flq flq1, Class class1, String s)
    {
        a = flq1;
        super(class1, s);
    }
}
