// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hbr
    implements iwt
{

    private final am a;

    public hbr(am am1)
    {
        a = am1;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = (new gzm(a.R)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (View)iterator.next();
            if (obj instanceof PhotoTileView)
            {
                obj = (PhotoTileView)obj;
                if (((PhotoTileView) (obj)).m != null)
                {
                    arraylist.add(new iws(((View) (obj)), ((PhotoTileView) (obj)).m, new Rect(0, 0, ((PhotoTileView) (obj)).getWidth(), ((PhotoTileView) (obj)).getHeight())));
                }
            }
        } while (true);
        return arraylist;
    }
}
