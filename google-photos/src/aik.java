// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.base.FrameSlotTarget;

final class aik
    implements ain
{

    private String a;
    private String b;

    public aik(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final void a(aio aio1)
    {
        aio1 = aio1.b;
        String s = a;
        String s1 = b;
        aio1.a(new FrameSlotTarget(((ahr) (aio1)).a, s, s1));
    }
}
