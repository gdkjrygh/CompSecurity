// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.database.Cursor;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.moviemaker.picker.PickerTileView;

final class ctm
    implements android.widget.SimpleCursorAdapter.ViewBinder
{

    private cti a;

    ctm(cti cti1)
    {
        a = cti1;
        super();
    }

    public final boolean setViewValue(View view, Cursor cursor, int i)
    {
        Handler handler;
        long l;
        boolean flag;
label0:
        {
            ctg ctg1 = (ctg)cursor;
            view = (PickerTileView)view;
            view.b = cti.c(a);
            handler = cti.d(a);
            flag = cti.e(a)[ctg1.a];
            l = Long.parseLong(cursor.getString(i));
            synchronized (((PickerTileView) (view)).a)
            {
                if (((PickerTileView) (view)).d != flag || ((PickerTileView) (view)).e != l)
                {
                    break label0;
                }
            }
            break MISSING_BLOCK_LABEL_157;
        }
        view.c = null;
        view.d = flag;
        view.e = l;
        view.setImageBitmap(null);
        cursor;
        JVM INSTR monitorexit ;
        view.setImageAlpha(0);
        view.f = false;
        ((PickerTileView) (view)).g.cancel();
        handler.removeCallbacks(((PickerTileView) (view)).h);
        handler.post(((PickerTileView) (view)).h);
        break MISSING_BLOCK_LABEL_157;
        view;
        cursor;
        JVM INSTR monitorexit ;
        throw view;
        return true;
    }
}
