// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.dynamic:
//            d

public interface c
    extends IInterface
{

    public abstract void d(d d1);

    public abstract void e(d d1);

    public abstract Bundle getArguments();

    public abstract int getId();

    public abstract boolean getRetainInstance();

    public abstract String getTag();

    public abstract int getTargetRequestCode();

    public abstract boolean getUserVisibleHint();

    public abstract d getView();

    public abstract boolean isAdded();

    public abstract boolean isDetached();

    public abstract boolean isHidden();

    public abstract boolean isInLayout();

    public abstract boolean isRemoving();

    public abstract boolean isResumed();

    public abstract boolean isVisible();

    public abstract d jf();

    public abstract c jg();

    public abstract d jh();

    public abstract c ji();

    public abstract void setHasOptionsMenu(boolean flag);

    public abstract void setMenuVisibility(boolean flag);

    public abstract void setRetainInstance(boolean flag);

    public abstract void setUserVisibleHint(boolean flag);

    public abstract void startActivity(Intent intent);

    public abstract void startActivityForResult(Intent intent, int i);
}
