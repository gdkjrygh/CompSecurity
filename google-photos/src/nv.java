// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Comparator;

public final class nv
    implements Comparator
{

    public nv()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = (nn)((View) (obj)).getLayoutParams();
        obj1 = (nn)((View) (obj1)).getLayoutParams();
        if (((nn) (obj)).a != ((nn) (obj1)).a)
        {
            return !((nn) (obj)).a ? -1 : 1;
        } else
        {
            return ((nn) (obj)).e - ((nn) (obj1)).e;
        }
    }
}
