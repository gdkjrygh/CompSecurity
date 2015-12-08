// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Eg
{

    private final List a;

    public Eg()
    {
        this((byte)0);
    }

    private Eg(byte byte0)
    {
        a = new ArrayList(8);
    }

    public final Intent a(Context context, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.isEmpty()) goto _L2; else goto _L1
_L1:
        Intent intent;
        Timber.c("IntentPool", "Running out of Intents in the pool. Create one more!", new Object[0]);
        intent = new Intent();
_L6:
        intent.setComponent(new ComponentName(context, class1));
        intent.putExtra("from_pool", true);
        this;
        JVM INSTR monitorexit ;
        return intent;
_L2:
        Intent intent1;
        Iterator iterator;
        Timber.c("IntentPool", "Retrieve an Intent from the pool!", new Object[0]);
        intent1 = (Intent)a.remove(0);
        iterator = intent1.getExtras().keySet().iterator();
_L4:
        intent = intent1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        intent1.removeExtra((String)iterator.next());
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
    }

    public final void a(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        Timber.c("IntentPool", "Puts the intent back into the pool", new Object[0]);
        a.add(intent);
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }
}
