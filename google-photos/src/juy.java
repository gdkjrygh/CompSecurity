// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Display;
import com.google.android.gms.common.api.Status;

public class juy
    implements jyw
{

    public final Status a;
    public final Display b;

    public juy(Display display)
    {
        a = Status.a;
        b = display;
    }

    public juy(Status status)
    {
        a = status;
        b = null;
    }

    public Status a_()
    {
        return a;
    }

    public Display b()
    {
        return b;
    }
}
