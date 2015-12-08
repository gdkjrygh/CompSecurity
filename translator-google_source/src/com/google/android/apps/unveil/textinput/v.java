// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;


// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput, ZoomableContainer

final class v
    implements Runnable
{

    final TextInput a;

    v(TextInput textinput)
    {
        a = textinput;
        super();
    }

    public final void run()
    {
        TextInput.g(a).requestLayout();
    }
}
