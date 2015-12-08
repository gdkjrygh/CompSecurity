// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.allphotos.ui.AllPhotosBar;

public final class dsk extends afn
{

    private final AllPhotosBar o;

    public dsk(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.ja, viewgroup, false));
        o = (AllPhotosBar)a.findViewById(c.cg);
    }

    static AllPhotosBar a(dsk dsk1)
    {
        return dsk1.o;
    }
}
