// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            Predicate

public class CombinationPredicate extends Predicate
{

    protected List children;
    protected Predicate.Operation operation;
    protected String operationKey;

    protected CombinationPredicate(String s, Object obj)
        throws JSONException
    {
        operationKey = s;
        operation = Predicate.Operation.parse(s);
        children = new ArrayList();
        if (obj instanceof JSONArray)
        {
            s = (JSONArray)obj;
            for (int i = 0; i < s.length(); i++)
            {
                obj = (JSONObject)s.get(i);
                children.add(parse(null, obj));
            }

        } else
        if (obj instanceof JSONObject)
        {
            s = (JSONObject)obj;
            String s1;
            for (obj = s.keys(); ((Iterator) (obj)).hasNext(); children.add(parse(s1, s.get(s1))))
            {
                s1 = (String)((Iterator) (obj)).next();
            }

        } else
        {
            Log.w("Unrecognized Combination Predicate: %s", new Object[] {
                obj.toString()
            });
        }
    }

    public boolean apply(Context context)
    {
        Iterator iterator;
        Log.v("Start: Combination Predicate: %s", new Object[] {
            operation.name()
        });
        if (operation != Predicate.Operation.$and)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        iterator = children.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag = ((Predicate)iterator.next()).apply(context);
        Log.v("=> %b", new Object[] {
            Boolean.valueOf(flag)
        });
        if (!flag)
        {
            Log.v("End:   Combination Predicate: %s", new Object[] {
                operation.name()
            });
            return false;
        }
          goto _L1
        Log.v("End:   Combination Predicate: %s", new Object[] {
            operation.name()
        });
        return true;
        if (operation != Predicate.Operation.$or)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        iterator = children.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        flag = ((Predicate)iterator.next()).apply(context);
        Log.v("=> %b", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag)
        {
            Log.v("End:   Combination Predicate: %s", new Object[] {
                operation.name()
            });
            return true;
        }
          goto _L2
        Log.v("End:   Combination Predicate: %s", new Object[] {
            operation.name()
        });
        return false;
        if (operation != Predicate.Operation.$not)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        if (children.size() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("$not condition must have exactly one child, has .").append(children.size()).toString());
        }
        break MISSING_BLOCK_LABEL_309;
        context;
        Log.v("End:   Combination Predicate: %s", new Object[] {
            operation.name()
        });
        throw context;
        if (!((Predicate)children.get(0)).apply(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.v("=> %b", new Object[] {
            Boolean.valueOf(flag)
        });
        Log.v("End:   Combination Predicate: %s", new Object[] {
            operation.name()
        });
        return flag;
        Log.v("Unsupported operation: \"%s\" => false", new Object[] {
            operationKey
        });
        Log.v("End:   Combination Predicate: %s", new Object[] {
            operation.name()
        });
        return false;
    }
}
