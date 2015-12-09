// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Comparator;

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return obj1.hashCode() - obj.hashCode();
        }
    }

    ()
    {
    }
}
