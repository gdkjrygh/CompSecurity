// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.list.PhotoTileView;

public class itd extends PhotoTileView
    implements oiz
{

    azh s;

    public itd(Context context)
    {
        super(context, null);
    }

    public final void ax_()
    {
        super.j = false;
        a(null);
        if (s != null)
        {
            aly.c(getContext()).a(s);
            s = null;
        }
    }
}
