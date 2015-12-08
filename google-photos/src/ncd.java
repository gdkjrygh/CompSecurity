// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.List;

final class ncd
{

    public ncd a;
    public ncd b;
    final nbw c;
    List d;

    public ncd(nbw nbw)
    {
        a = this;
        b = this;
        c = nbw;
    }

    public final int a()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public final Bitmap b()
    {
        int i = a();
        if (i != 0)
        {
            return (Bitmap)d.remove(i - 1);
        } else
        {
            return null;
        }
    }
}
