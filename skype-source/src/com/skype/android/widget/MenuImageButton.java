// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype.android.widget:
//            OnItemSelectionChanged

public class MenuImageButton extends ImageButton
{

    private HashSet a;

    public MenuImageButton(Context context)
    {
        super(context);
        a = new HashSet();
    }

    public MenuImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new HashSet();
    }

    public final void a(OnItemSelectionChanged onitemselectionchanged)
    {
        a.add(onitemselectionchanged);
    }

    public final void b(OnItemSelectionChanged onitemselectionchanged)
    {
        a.remove(onitemselectionchanged);
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((OnItemSelectionChanged)iterator.next()).onSelected(flag)) { }
    }
}
