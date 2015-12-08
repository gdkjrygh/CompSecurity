// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import androidx.media.filterpacks.text.TextViewTarget;

public final class alg
    implements Runnable
{

    private String a;
    private TextViewTarget b;

    public alg(TextViewTarget textviewtarget, String s)
    {
        b = textviewtarget;
        a = s;
        super();
    }

    public final void run()
    {
        TextViewTarget.a(b).setText(a);
    }
}
