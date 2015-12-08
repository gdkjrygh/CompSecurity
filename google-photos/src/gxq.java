// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

public final class gxq
    implements gzb, nug, opv
{

    public final nud a = new ntz(this);
    public gxi b;

    public gxq(opd opd1)
    {
        opd1.a(this);
    }

    public final nud a()
    {
        return a;
    }

    public final void b_(Object obj)
    {
        a.b();
    }

    public final PhotoView r()
    {
        if (b != null)
        {
            return b.b;
        } else
        {
            return null;
        }
    }

    public final View s()
    {
        if (b != null)
        {
            return b.c;
        } else
        {
            return null;
        }
    }
}
