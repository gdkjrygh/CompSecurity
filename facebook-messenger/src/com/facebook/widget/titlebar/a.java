// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.titlebar;

import android.view.View;
import java.util.List;

// Referenced classes of package com.facebook.widget.titlebar:
//            b

public interface a
{

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract void b();

    public abstract View getTitleBarDivebarButtonOverlay();

    public abstract void setButtonSpecs(List list);

    public abstract void setCustomTitleView(View view);

    public abstract void setHasBackButton(boolean flag);

    public abstract void setHasProgressBar(boolean flag);

    public abstract void setOnToolbarButtonListener(b b1);

    public abstract void setTitle(int i);

    public abstract void setTitle(String s);
}
