// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.b;

import android.content.Context;
import android.util.Log;
import com.qihoo.security.clearengine.sdk.a.a;
import com.qihoo.security.clearengine.sdk.a.b;
import com.qihoo.security.clearengine.sdk.a.c;
import com.qihoo360.i.v1.main.pt.IPtManager;
import com.qihoo360.mobilesafe.opti.i.IFunctionManager;
import com.qihoo360.mobilesafe.opti.i.plugins.IApkScanProcess;
import com.qihoo360.mobilesafe.opti.i.plugins.ISharedPreferences;
import com.qihoo360.mobilesafe.opti.i.plugins.IUpdate;

// Referenced classes of package com.qihoo.security.clearengine.b:
//            a

class a
    implements IFunctionManager
{

    private final Context a;

    public Object query(Class class1)
    {
        class1 = class1.getName();
        if (class1.equals(com/qihoo360/i/v1/main/pt/IPtManager.getName()))
        {
            return new b(a);
        }
        if (class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences.getName()))
        {
            return new c(a);
        }
        if (class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/IApkScanProcess.getName()))
        {
            return new a(a);
        } else
        {
            class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/IUpdate.getName());
            Log.e("FunctionManagerImpl", (new StringBuilder("query interface is not supported ")).append(class1).toString());
            return null;
        }
    }

    s.IUpdate(Context context)
    {
        a = context;
        super();
    }
}
