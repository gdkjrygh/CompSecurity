// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class dw
    implements Iterable
{

    public final ArrayList a = new ArrayList();
    public final Context b;

    private dw(Context context)
    {
        b = context;
    }

    public static dw a(Context context)
    {
        return new dw(context);
    }

    public final dw a(ComponentName componentname)
    {
        int i = a.size();
        try
        {
            componentname = cd.a(b, componentname);
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
        a.add(i, componentname);
        componentname = cd.a(b, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public final dw a(Intent intent)
    {
        a.add(intent);
        return this;
    }

    public final void a()
    {
        boolean flag = true;
        if (a.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])a.toArray(new Intent[a.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        Context context = b;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            context.startActivities(aintent, null);
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
            aintent = new Intent(aintent[aintent.length - 1]);
            aintent.addFlags(0x10000000);
            b.startActivity(aintent);
        }
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
    }
}
