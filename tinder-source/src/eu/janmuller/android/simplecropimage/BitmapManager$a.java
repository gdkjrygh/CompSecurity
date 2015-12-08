// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            BitmapManager

public static final class 
    implements Iterable
{

    private final WeakHashMap a = new WeakHashMap();

    public final Iterator iterator()
    {
        return a.keySet().iterator();
    }

    public ()
    {
    }
}
