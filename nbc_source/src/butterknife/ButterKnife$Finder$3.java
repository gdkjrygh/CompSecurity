// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

// Referenced classes of package butterknife:
//            ButterKnife

static final class nit> extends nit>
{

    protected View findView(Object obj, int i)
    {
        return ((Dialog)obj).findViewById(i);
    }

    public Context getContext(Object obj)
    {
        return ((Dialog)obj).getContext();
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
