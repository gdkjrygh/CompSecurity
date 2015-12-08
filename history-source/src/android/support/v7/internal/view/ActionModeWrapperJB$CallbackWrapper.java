// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.internal.view:
//            ActionModeWrapperJB, ActionModeWrapper

public static class nit> extends nit>
{

    protected ActionModeWrapper createActionModeWrapper(Context context, ActionMode actionmode)
    {
        return new ActionModeWrapperJB(context, actionmode);
    }

    public (Context context, android.support.v7.view.kWrapper kwrapper)
    {
        super(context, kwrapper);
    }
}
