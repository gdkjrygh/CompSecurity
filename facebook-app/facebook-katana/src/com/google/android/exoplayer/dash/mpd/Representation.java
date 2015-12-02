// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            SegmentBase, RangedUri

public abstract class Representation
    implements FormatWrapper
{

    public final String a;
    public final long b;
    public final Format c;
    public final long d;
    public final long e;
    public final long f;
    private final RangedUri g;

    private Representation(long l, long l1, String s, long l2, 
            Format format, SegmentBase segmentbase)
    {
        d = l;
        e = l1;
        a = s;
        b = l2;
        c = format;
        g = segmentbase.a(this);
        f = segmentbase.a();
    }

    Representation(long l, long l1, String s, long l2, 
            Format format, SegmentBase segmentbase, byte byte0)
    {
        this(l, l1, s, l2, format, segmentbase);
    }

    public static Representation a(long l, long l1, String s, long l2, Format format, 
            SegmentBase segmentbase)
    {
        if (segmentbase instanceof SegmentBase.SingleSegmentBase)
        {
            return new SingleSegmentRepresentation(l, l1, s, l2, format, (SegmentBase.SingleSegmentBase)segmentbase, -1L);
        }
        if (segmentbase instanceof SegmentBase.MultiSegmentBase)
        {
            return new MultiSegmentRepresentation(l, l1, s, l2, format, (SegmentBase.MultiSegmentBase)segmentbase);
        } else
        {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    public final RangedUri d()
    {
        return g;
    }

    public abstract RangedUri e();

    public final Format e_()
    {
        return c;
    }

    public abstract DashSegmentIndex f();

    public final String g()
    {
        return (new StringBuilder()).append(a).append(".").append(c.a).append(".").append(b).toString();
    }

    private class SingleSegmentRepresentation extends Representation
    {

        public final Uri g;
        public final long h;
        private final RangedUri i;
        private final DashSingleSegmentIndex j;

        public final RangedUri e()
        {
            return i;
        }

        public final DashSegmentIndex f()
        {
            return j;
        }

        public SingleSegmentRepresentation(long l, long l1, String s, long l2, 
                Format format, SegmentBase.SingleSegmentBase singlesegmentbase, long l3)
        {
            super(l, l1, s, l2, format, singlesegmentbase, (byte)0);
            g = Uri.parse(singlesegmentbase.d);
            i = singlesegmentbase.b();
            h = l3;
            if (i != null)
            {
                s = null;
            } else
            {
                s = new DashSingleSegmentIndex(l * 1000L, l1 * 1000L, new RangedUri(singlesegmentbase.d, null, 0L, -1L));
            }
            j = s;
        }
    }


    private class MultiSegmentRepresentation extends Representation
        implements DashSegmentIndex
    {

        private final SegmentBase.MultiSegmentBase g;

        public final int a()
        {
            return g.b();
        }

        public final int a(long l)
        {
            return g.a(l - d * 1000L);
        }

        public final long a(int i)
        {
            return g.b(i) + d * 1000L;
        }

        public final int b()
        {
            return g.c();
        }

        public final long b(int i)
        {
            return g.a(i);
        }

        public final RangedUri c(int i)
        {
            return g.a(this, i);
        }

        public final boolean c()
        {
            return g.d();
        }

        public final RangedUri e()
        {
            return null;
        }

        public final DashSegmentIndex f()
        {
            return this;
        }

        public MultiSegmentRepresentation(long l, long l1, String s, long l2, 
                Format format, SegmentBase.MultiSegmentBase multisegmentbase)
        {
            super(l, l1, s, l2, format, multisegmentbase, (byte)0);
            g = multisegmentbase;
        }
    }

}
