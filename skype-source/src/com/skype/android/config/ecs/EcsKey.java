// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.config.ecs:
//            EcsKeyLocation, EcsClient, EcsKeys

public class EcsKey
{

    public static final int DISABLED = 0;
    public static final int ENABLED = 1;
    private static final String ENABLED_FLAG = "/enabled";
    private static final String NULL = "[NULL]";
    private static final Logger log = Logger.getLogger("EcsKeys");
    private Object defaultValue;
    private boolean isBooleanValue;
    private String key;
    private EcsKeyLocation keyRoot;
    private String name;

    public EcsKey(String s, String s1, EcsKeyLocation ecskeylocation, Object obj, boolean flag)
    {
        name = s;
        key = s1;
        keyRoot = ecskeylocation;
        defaultValue = obj;
        isBooleanValue = flag;
    }

    private static String stripEnclosingQuotes(String s)
    {
        boolean flag1 = false;
        String s1;
        int i;
        boolean flag;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        flag = flag1;
        if (i >= 2)
        {
            flag = flag1;
            if (s.charAt(0) == '"')
            {
                flag = flag1;
                if (s.charAt(i - 1) == '"')
                {
                    flag = true;
                }
            }
        }
        s1 = s;
        if (flag)
        {
            s1 = s.substring(1, i - 1);
        }
        return s1;
    }

    public Object getDefaultValue()
    {
        return defaultValue;
    }

    public String getKey()
    {
        return key;
    }

    public EcsKeyLocation getKeyRoot()
    {
        return keyRoot;
    }

    public String getName()
    {
        return name;
    }

    public boolean isBooleanValue()
    {
        return isBooleanValue;
    }

    public void parse(ContentValues contentvalues, EcsClient ecsclient)
    {
        Object obj;
        obj = new StringBuilder(keyRoot.getKeyPrefix());
        ((StringBuilder) (obj)).append(key);
        if (!isBooleanValue) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append("/enabled");
        boolean flag;
        if (defaultValue == null)
        {
            flag = false;
        } else
        {
            flag = ((Boolean)defaultValue).booleanValue();
        }
        flag = ecsclient.getSettingAsBool(keyRoot.getPathRoot(), ((StringBuilder) (obj)).toString(), flag);
        contentvalues.put(key, Boolean.valueOf(flag));
_L4:
        log.info((new StringBuilder("ECS: ")).append(name).append(" == ").append(contentvalues.getAsString(key)).toString());
        return;
_L2:
        if (defaultValue instanceof Integer)
        {
            int i = ((Integer)defaultValue).intValue();
            i = ecsclient.getSettingAsInt(keyRoot.getPathRoot(), ((StringBuilder) (obj)).toString(), i);
            contentvalues.put(key, Integer.valueOf(i));
        } else
        {
            String s;
            if (defaultValue != null)
            {
                s = defaultValue.toString();
            } else
            {
                s = "[NULL]";
            }
            obj = stripEnclosingQuotes(ecsclient.getSettingAsString(keyRoot.getPathRoot(), ((StringBuilder) (obj)).toString(), s));
            ecsclient = ((EcsClient) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                ecsclient = ((EcsClient) (obj));
                if (name == EcsKeys.SEARCH_ACCOUNTS_TIMEOUT.name())
                {
                    ecsclient = s;
                }
            }
            if (!"[NULL]".equals(ecsclient))
            {
                contentvalues.put(key, ecsclient);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
