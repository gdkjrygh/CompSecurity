// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            l

public class af
    implements Iterable
{
    public static interface a
    {

        public abstract Intent a();
    }

    static interface b
    {
    }

    static class c
        implements b
    {

        c()
        {
        }
    }

    static class d
        implements b
    {

        d()
        {
        }
    }


    private static final b a;
    private final ArrayList b = new ArrayList();
    private final Context c;

    private af(Context context)
    {
        c = context;
    }

    public static af a(Context context)
    {
        return new af(context);
    }

    public af a(Activity activity)
    {
        Object obj = null;
        if (activity instanceof a)
        {
            obj = ((a)activity).a();
        }
        if (obj == null)
        {
            activity = android.support.v4.app.l.a(activity);
        } else
        {
            activity = ((Activity) (obj));
        }
        if (activity != null)
        {
            ComponentName componentname = activity.getComponent();
            obj = componentname;
            if (componentname == null)
            {
                obj = activity.resolveActivity(c.getPackageManager());
            }
            a(((ComponentName) (obj)));
            a(((Intent) (activity)));
        }
        return this;
    }

    public af a(ComponentName componentname)
    {
        int i = b.size();
        try
        {
            componentname = android.support.v4.app.l.a(c, componentname);
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
        componentname = android.support.v4.app.l.a(c, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public af a(Intent intent)
    {
        b.add(intent);
        return this;
    }

    public void a()
    {
        a(((Bundle) (null)));
    }

    public void a(Bundle bundle)
    {
        if (b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])b.toArray(new Intent[b.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        if (!android.support.v4.content.a.a(c, aintent, bundle))
        {
            bundle = new Intent(aintent[aintent.length - 1]);
            bundle.addFlags(0x10000000);
            c.startActivity(bundle);
        }
    }

    public Iterator iterator()
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
