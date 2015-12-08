// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import com.google.android.apps.moviemaker.picker.PickerTileView;

public final class cto
    implements Runnable
{

    private PickerTileView a;

    public cto(PickerTileView pickertileview)
    {
        a = pickertileview;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (PickerTileView.a(a))
            {
                if (PickerTileView.e(a) != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (PickerTileView.b(a))
        {
            PickerTileView.a(a, true);
        }
        a.setImageBitmap(PickerTileView.e(a));
        obj;
        JVM INSTR monitorexit ;
        PickerTileView.f(a).start();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
