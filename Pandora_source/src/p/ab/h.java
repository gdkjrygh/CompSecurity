// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p.q.a;
import p.q.e;
import p.s.k;
import p.t.c;

// Referenced classes of package p.ab:
//            s, c

public class h
    implements e
{

    private final s a;
    private final c b;
    private a c;

    public h(s s1, c c1, a a1)
    {
        a = s1;
        b = c1;
        c = a1;
    }

    public h(c c1, a a1)
    {
        this(new s(), c1, a1);
    }

    public String a()
    {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }

    public k a(ParcelFileDescriptor parcelfiledescriptor, int i, int j)
        throws IOException
    {
        return p.ab.c.a(a.a(parcelfiledescriptor, b, i, j, c), b);
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((ParcelFileDescriptor)obj, i, j);
    }
}
