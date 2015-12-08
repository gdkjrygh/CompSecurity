// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            az, ay, aq, ax

public final class av
    implements Iterable
{

    private static final ax c;
    public final ArrayList a = new ArrayList();
    public final Context b;

    private av(Context context)
    {
        b = context;
    }

    public static av a(Context context)
    {
        return new av(context);
    }

    public final av a(ComponentName componentname)
    {
        int i = a.size();
        try
        {
            componentname = aq.a(b, componentname);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            throw new IllegalArgumentException(componentname);
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a.add(i, componentname);
        componentname = aq.a(b, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            c = new az();
        } else
        {
            c = new ay();
        }
    }
}
