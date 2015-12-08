// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.Timber;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class Fh
{

    private static final Fh c = new Fh();
    public LayoutInflater a;
    public Resources b;
    private final Map d = new HashMap();

    protected Fh()
    {
    }

    public static Fh a()
    {
        return c;
    }

    public final View a(int i, ViewGroup viewgroup)
    {
        PG.a();
        String s = b.getResourceEntryName(i);
        Queue queue = (Queue)d.get(Integer.valueOf(i));
        if (queue != null && !queue.isEmpty())
        {
            Timber.c("PooledResourceInflater", "Inflate '%s': Using recycled view. There are %d views of this type in the pool", new Object[] {
                s, Integer.valueOf(queue.size())
            });
            return (View)queue.poll();
        } else
        {
            Timber.c("PooledResourceInflater", "Inflate '%s': Inflating new view. There are no views of this type in the pool", new Object[] {
                s
            });
            return a.inflate(i, viewgroup, false);
        }
    }

    public final void a(int i, View view)
    {
        PG.a();
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        if (b != null)
        {
            String s = b.getResourceEntryName(i);
            Queue queue = (Queue)d.get(Integer.valueOf(i));
            Object obj = queue;
            if (queue == null)
            {
                obj = new LinkedList();
                d.put(Integer.valueOf(i), obj);
            }
            ((Queue) (obj)).add(view);
            Timber.c("PooledResourceInflater", "Recycle '%s': There are now %d views of this type in the pool", new Object[] {
                s, Integer.valueOf(((Queue) (obj)).size())
            });
        }
    }

}
