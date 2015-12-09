// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.f;

// Referenced classes of package android.support.v7.app:
//            p

public class q extends f
{

    public q()
    {
        setCancelable(true);
    }

    public p a(Context context, Bundle bundle)
    {
        return new p(context);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return a(getActivity(), bundle);
    }
}
