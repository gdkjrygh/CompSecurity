// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NavUtils

public class TaskStackBuilder
    implements Iterable
{
    public static interface SupportParentable
    {

        public abstract Intent getSupportParentActivityIntent();
    }

    static interface TaskStackBuilderImpl
    {
    }

    static class TaskStackBuilderImplBase
        implements TaskStackBuilderImpl
    {

        TaskStackBuilderImplBase()
        {
        }
    }

    static class TaskStackBuilderImplHoneycomb
        implements TaskStackBuilderImpl
    {

        TaskStackBuilderImplHoneycomb()
        {
        }
    }


    private static final TaskStackBuilderImpl IMPL;
    private final ArrayList mIntents = new ArrayList();
    private final Context mSourceContext;

    private TaskStackBuilder(Context context)
    {
        mSourceContext = context;
    }

    public static TaskStackBuilder create(Context context)
    {
        return new TaskStackBuilder(context);
    }

    public TaskStackBuilder addNextIntent(Intent intent)
    {
        mIntents.add(intent);
        return this;
    }

    public TaskStackBuilder addParentStack(Activity activity)
    {
        Intent intent = null;
        if (activity instanceof SupportParentable)
        {
            intent = ((SupportParentable)activity).getSupportParentActivityIntent();
        }
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = NavUtils.getParentActivityIntent(activity);
        }
        if (intent1 != null)
        {
            ComponentName componentname = intent1.getComponent();
            activity = componentname;
            if (componentname == null)
            {
                activity = intent1.resolveActivity(mSourceContext.getPackageManager());
            }
            addParentStack(((ComponentName) (activity)));
            addNextIntent(intent1);
        }
        return this;
    }

    public TaskStackBuilder addParentStack(ComponentName componentname)
    {
        int i = mIntents.size();
        try
        {
            componentname = NavUtils.getParentActivityIntent(mSourceContext, componentname);
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
        mIntents.add(i, componentname);
        componentname = NavUtils.getParentActivityIntent(mSourceContext, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public Iterator iterator()
    {
        return mIntents.iterator();
    }

    public void startActivities()
    {
        startActivities(null);
    }

    public void startActivities(Bundle bundle)
    {
        if (mIntents.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])mIntents.toArray(new Intent[mIntents.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        if (!ContextCompat.startActivities(mSourceContext, aintent, bundle))
        {
            bundle = new Intent(aintent[aintent.length - 1]);
            bundle.addFlags(0x10000000);
            mSourceContext.startActivity(bundle);
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new TaskStackBuilderImplHoneycomb();
        } else
        {
            IMPL = new TaskStackBuilderImplBase();
        }
    }
}
