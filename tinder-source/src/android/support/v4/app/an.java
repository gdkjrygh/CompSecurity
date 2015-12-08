// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            w

public final class an
    implements Iterable
{
    public static interface a
    {

        public abstract Intent getSupportParentActivityIntent();
    }

    public static interface b
    {

        public abstract PendingIntent a(Context context, Intent aintent[]);
    }

    static final class c
        implements b
    {

        public final PendingIntent a(Context context, Intent aintent[])
        {
            aintent = new Intent(aintent[aintent.length - 1]);
            aintent.addFlags(0x10000000);
            return PendingIntent.getActivity(context, 0, aintent, 0x40000000);
        }

        c()
        {
        }
    }

    static final class d
        implements b
    {

        public final PendingIntent a(Context context, Intent aintent[])
        {
            aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
            return PendingIntent.getActivities(context, 0, aintent, 0x40000000);
        }

        d()
        {
        }
    }


    public static final b a;
    public final ArrayList b = new ArrayList();
    public final Context c;

    private an(Context context)
    {
        c = context;
    }

    public static an a(Context context)
    {
        return new an(context);
    }

    public final an a(ComponentName componentname)
    {
        int i = b.size();
        try
        {
            componentname = w.a(c, componentname);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(componentname);
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(i, componentname);
        componentname = w.a(c, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public final an a(Intent intent)
    {
        b.add(intent);
        return this;
    }

    public final an a(Class class1)
    {
        return a(new ComponentName(c, class1));
    }

    public final void a(Bundle bundle)
    {
        boolean flag = true;
        if (b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])b.toArray(new Intent[b.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        Context context = c;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            context.startActivities(aintent, bundle);
        } else
        if (i >= 11)
        {
            context.startActivities(aintent);
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            bundle = new Intent(aintent[aintent.length - 1]);
            bundle.addFlags(0x10000000);
            c.startActivity(bundle);
        }
    }

    public final Iterator iterator()
    {
        return b.iterator();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new d();
        } else
        {
            a = new c();
        }
    }
}
