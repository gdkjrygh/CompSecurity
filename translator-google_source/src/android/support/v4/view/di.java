// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            db

final class di
    implements Comparator
{

    di()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = (db)((View) (obj)).getLayoutParams();
        obj1 = (db)((View) (obj1)).getLayoutParams();
        if (((db) (obj)).a != ((db) (obj1)).a)
        {
            return !((db) (obj)).a ? -1 : 1;
        } else
        {
            return ((db) (obj)).e - ((db) (obj1)).e;
        }
    }
}
