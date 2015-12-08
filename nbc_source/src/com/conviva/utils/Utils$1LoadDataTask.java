// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.conviva.utils:
//            Utils

class this._cls0
    implements Runnable
{

    final Utils this$0;

    public void run()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj1 = null;
        obj3 = null;
        if (!Utils.access$000().getFileStreamPath("conviva.json").exists())
        {
            break MISSING_BLOCK_LABEL_307;
        }
        obj2 = new StringBuffer("");
        Object obj = Utils.access$000().openFileInput("conviva.json");
        obj1 = obj;
        obj = obj1;
        byte abyte0[] = new byte[1024];
_L2:
        obj = obj1;
        int i = ((FileInputStream) (obj1)).read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((StringBuffer) (obj2)).append(new String(abyte0, 0, i));
        if (true) goto _L2; else goto _L1
        obj;
_L6:
        obj = obj1;
        err("Failed to load data from persistent storage");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        ((FileInputStream) (obj1)).close();
        obj = null;
_L3:
        obj1 = obj3;
        if (obj != null)
        {
            obj1 = obj3;
            if (((Map) (obj)).containsKey("clId"))
            {
                obj1 = ((Map) (obj)).get("clId").toString();
            }
        }
        if (obj1 != null && !((String) (obj1)).equals("0") && !((String) (obj1)).equals("null") && ((String) (obj1)).length() > 0)
        {
            clientId = ((String) (obj1));
            log((new StringBuilder()).append("Setting the client id to ").append(((String) (obj1))).append(" (from local storage)").toString());
            return;
        } else
        {
            log("Failed to load the client id from local storage");
            return;
        }
_L1:
        obj = obj1;
        ((FileInputStream) (obj1)).close();
        obj = obj1;
        obj2 = jsonDecode(((StringBuffer) (obj2)).toString());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        ((FileInputStream) (obj1)).close();
        obj = obj2;
          goto _L3
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = obj2;
          goto _L3
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = null;
          goto _L3
        obj;
_L5:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        obj1 = null;
          goto _L6
        obj = null;
          goto _L3
    }

    ()
    {
        this$0 = Utils.this;
        super();
    }
}
