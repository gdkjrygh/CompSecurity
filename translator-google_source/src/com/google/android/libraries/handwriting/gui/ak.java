// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            UIHandler

final class ak
{

    int a;
    int b;
    int c;
    int d;
    final UIHandler e;

    ak(UIHandler uihandler)
    {
        e = uihandler;
        super();
    }

    public final String toString()
    {
        return String.format("cursorState: selection: %d:%d compose: %d:%d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d)
        });
    }
}
