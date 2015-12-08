// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

public final class olx
    implements ols
{

    public olx()
    {
    }

    public final void a(Context context, olm olm1)
    {
        Object obj;
        Object obj1;
        obj1 = (oly)Class.forName("gen_binder.root.RootModule$Generated").newInstance();
        obj = ((oly) (obj1)).a();
        olm1.a(((olv) (obj1)));
        obj1 = obj;
_L2:
        olm1.a(new oll(context, ((java.util.Set) (obj1))));
        return;
        context;
        throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", context);
        context;
        throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", context);
        obj;
        obj = null;
_L3:
        obj1 = obj;
        if (Log.isLoggable("Binder", 5))
        {
            Log.w("Binder", "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs.");
            obj1 = obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
          goto _L3
    }
}
