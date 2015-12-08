// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class cj
    implements Iterable
{

    public final ArrayList a = new ArrayList();
    public final Context b;

    private cj(Context context)
    {
        b = context;
    }

    public static cj a(Context context)
    {
        return new cj(context);
    }

    public final cj a(ComponentName componentname)
    {
        int i = a.size();
        try
        {
            componentname = aq.a(b, componentname);
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
            new cm();
        } else
        {
            new cl();
        }
    }
}
