// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.moviemaker.picker.PickerTileView;

public final class ctn
    implements Runnable
{

    private PickerTileView a;

    public ctn(PickerTileView pickertileview)
    {
        a = pickertileview;
        super();
    }

    public final void run()
    {
        long l;
        boolean flag;
        synchronized (PickerTileView.a(a))
        {
            flag = PickerTileView.b(a);
            l = PickerTileView.c(a);
        }
        if (flag)
        {
            obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(a.getContext().getContentResolver(), l, 1, null);
        } else
        {
            obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(a.getContext().getContentResolver(), l, 1, null);
        }
        synchronized (PickerTileView.a(a))
        {
            if (flag == PickerTileView.b(a) && l == PickerTileView.c(a))
            {
                PickerTileView.a(a, ((android.graphics.Bitmap) (obj)));
                a.post(PickerTileView.d(a));
            }
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
