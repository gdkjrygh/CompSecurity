// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;

final class iep
    implements ier
{

    iep(ien ien)
    {
    }

    public final boolean a(ifc ifc1)
    {
        if (ifc1.a())
        {
            if ((ifc1 = ifc1.b.getComponent()).getPackageName().equals("com.google.android.apps.docs") && ifc1.getClassName().equals("com.google.android.apps.docs.app.SendTextToClipboardActivity"))
            {
                return true;
            }
        }
        return false;
    }
}
