// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.google.android.apps.photos.timemachine.TimeMachineFragment;

public final class ivt
    implements hhg
{

    public ivt(TimeMachineFragment timemachinefragment)
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == cn.C)
        {
            return new fro(viewgroup, flj.a, false);
        }
        if (i == cn.A)
        {
            return new fqm(viewgroup);
        }
        if (i == cn.B)
        {
            return new frf(viewgroup);
        }
        if (i == cn.E)
        {
            return new ivn(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
