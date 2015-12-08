// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class this._cls0
{

    String eventCode;
    ArrayList keysList;
    HashMap namesMatchRule;
    HashMap namesWithAttrib;
    final PluginConfigInfo this$0;

    public String debug()
    {
        Object obj;
        Object obj1;
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("EventCode:").append(eventCode).append(":\n").toString()))).append("keyNamePairs ::\n").toString()))).append("Keys List in Order::\n").toString();
        obj = obj1;
        if (keysList == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        iterator = keysList.iterator();
        obj = obj1;
_L10:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        obj1 = obj;
        if (namesMatchRule == null) goto _L5; else goto _L4
_L4:
        iterator = namesMatchRule.keySet().iterator();
_L12:
        if (iterator.hasNext()) goto _L7; else goto _L6
_L6:
        obj1 = obj;
_L5:
        obj = obj1;
        if (namesWithAttrib == null) goto _L9; else goto _L8
_L8:
        obj = namesWithAttrib.keySet().iterator();
_L14:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        obj = obj1;
_L9:
        return ((String) (obj)).toString();
_L3:
        obj1 = (String)iterator.next();
        obj = (new StringBuilder(String.valueOf(obj))).append("Key:").append(((String) (obj1))).append(":\n").toString();
          goto _L10
_L7:
        Object obj2;
        obj2 = (String)iterator.next();
        obj1 = (new StringBuilder(String.valueOf(obj))).append("Key With Match Rules:").append(((String) (obj2))).append(":\n").toString();
        obj2 = ((ArrayList)namesMatchRule.get(obj2)).iterator();
_L13:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext()) goto _L12; else goto _L11
_L11:
        obj = (namesMatchRule)((Iterator) (obj2)).next();
        obj1 = (new StringBuilder(String.valueOf(obj1))).append(((namesMatchRule) (obj)).namesMatchRule()).toString();
          goto _L13
          goto _L12
        String s = (String)((Iterator) (obj)).next();
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("Key With Attrib:").append(s).append(":\n").toString()))).append(((namesMatchRule)namesWithAttrib.get(s)).ug()).toString();
          goto _L14
    }

    ()
    {
        this$0 = PluginConfigInfo.this;
        super();
    }
}
