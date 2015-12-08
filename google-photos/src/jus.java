// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public class jus extends Presentation
{

    public jus(Context context, Display display, int i)
    {
        super(context, display, i);
        context = getWindow();
        if (context != null)
        {
            context.setType(2030);
            context.addFlags(0x10000000);
            context.addFlags(0x1000000);
            context.addFlags(1024);
        }
    }
}
