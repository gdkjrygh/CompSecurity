// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.util.JSONUtils;
import com.urbanairship.util.UAStringUtil;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.actions:
//            ActionRegistry

public class ActionUtils
{

    public ActionUtils()
    {
    }

    public static transient boolean containsRegisteredActions(Bundle bundle, String as[])
    {
        if (as != null && as.length != 0)
        {
            if (!(bundle = parseActionNames(bundle)).isEmpty())
            {
                HashSet hashset = new HashSet();
                int j = as.length;
                for (int i = 0; i < j; i++)
                {
                    Object obj = as[i];
                    obj = ActionRegistry.shared().getEntry(((String) (obj)));
                    if (obj != null)
                    {
                        hashset.addAll(((ActionRegistry.Entry) (obj)).getNames());
                    }
                }

                return hashset.removeAll(bundle);
            }
        }
        return false;
    }

    public static Set parseActionNames(Bundle bundle)
    {
        bundle = bundle.getString("com.urbanairship.actions");
        if (UAStringUtil.isEmpty(bundle))
        {
            return Collections.emptySet();
        }
        Set set;
        try
        {
            set = JSONUtils.convertToMap(new JSONObject(bundle)).keySet();
        }
        catch (JSONException jsonexception)
        {
            Logger.info((new StringBuilder()).append("Invalid actions payload: ").append(bundle).toString());
            return Collections.emptySet();
        }
        return set;
    }
}
