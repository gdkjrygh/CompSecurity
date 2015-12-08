// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gyx
    implements gyw
{

    public Set a;

    public gyx()
    {
        a = new HashSet();
    }

    public final void a(PhotoView photoview, ekp ekp)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gyw)iterator.next()).a(photoview, ekp)) { }
    }

    public final void f()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gyw)iterator.next()).f()) { }
    }

    public final void g()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gyw)iterator.next()).g()) { }
    }
}
