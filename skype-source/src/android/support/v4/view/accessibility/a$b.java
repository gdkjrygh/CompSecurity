// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            a

static final class ent extends ent
{

    public final int a(AccessibilityEvent accessibilityevent)
    {
        return accessibilityevent.getContentChangeTypes();
    }

    public final void a(AccessibilityEvent accessibilityevent, int i)
    {
        accessibilityevent.setContentChangeTypes(i);
    }

    ent()
    {
    }
}
