// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

final class nit> extends nit>
{

    protected final Context a(Object obj)
    {
        return ((Dialog)obj).getContext();
    }

    public final View a(Object obj, int i)
    {
        return ((Dialog)obj).findViewById(i);
    }

    (String s)
    {
        super(s, 2, (byte)0);
    }
}
