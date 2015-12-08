// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Bundle;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb, bp

public class bq extends com.google.android.m4b.maps.df.q.a
{

    private static final String a = com/google/android/m4b/maps/cg/bq.getSimpleName();
    private static final Bundle b = new Bundle(0);
    private static final bp.a c = new bp.a() {

        public final void a(bp bp1, int i, cb cb1)
        {
            cb1.b(cb.a.av);
            bp1.a(1.0F, i);
        }

        public final String toString()
        {
            String s = String.valueOf(cb.a.av);
            return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
        }

    };
    private static final bp.a d = new bp.a() {

        public final void a(bp bp1, int i, cb cb1)
        {
            cb1.b(cb.a.aw);
            bp1.a(-1F, i);
        }

        public final String toString()
        {
            String s = String.valueOf(cb.a.aw);
            return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
        }

    };

    public bq()
    {
    }

    public final b a()
    {
        return com.google.android.m4b.maps.da.d.a(c);
    }

    public final b a(float f)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(f) {

            private float a;
            private bq b;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.ay);
                bp1.b(a, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.ay);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                b = bq.this;
                a = f;
                super();
            }
        });
    }

    public final b a(float f, float f1)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(f, f1) {

            private float a;
            private float b;
            private bq c;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.ax);
                bp1.a(a, b, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.ax);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                c = bq.this;
                a = f;
                b = f1;
                super();
            }
        });
    }

    public final b a(float f, int i, int j)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(f, i, j) {

            private float a;
            private int b;
            private int c;
            private bq d;

            public final void a(bp bp1, int k, cb cb1)
            {
                cb1.b(cb.a.aA);
                bp1.a(a, b, c, k);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aA);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                d = bq.this;
                a = f;
                b = i;
                c = j;
                super();
            }
        });
    }

    public final b a(CameraPosition cameraposition)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(cameraposition) {

            private CameraPosition a;
            private bq b;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.aB);
                bp1.a(a, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aB);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                b = bq.this;
                a = cameraposition;
                super();
            }
        });
    }

    public final b a(LatLng latlng)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(latlng) {

            private LatLng a;
            private bq b;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.aC);
                bp1.a(a, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aC);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                b = bq.this;
                a = latlng;
                super();
            }
        });
    }

    public final b a(LatLng latlng, float f)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(latlng, f) {

            private LatLng a;
            private float b;
            private bq c;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.aD);
                bp1.a(a, b, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aD);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                c = bq.this;
                a = latlng;
                b = f;
                super();
            }
        });
    }

    public final b a(LatLngBounds latlngbounds, int i)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(latlngbounds, i) {

            private LatLngBounds a;
            private int b;
            private bq c;

            public final void a(bp bp1, int j, cb cb1)
            {
                cb1.b(cb.a.aE);
                bp1.a(a, b, j);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aE);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                c = bq.this;
                a = latlngbounds;
                b = i;
                super();
            }
        });
    }

    public final b a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(latlngbounds, i, j, k) {

            private LatLngBounds a;
            private int b;
            private int c;
            private int d;
            private bq e;

            public final void a(bp bp1, int l, cb cb1)
            {
                cb1.b(cb.a.aF);
                bp1.a(a, b, c, d, l);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.aF);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                e = bq.this;
                a = latlngbounds;
                b = i;
                c = j;
                d = k;
                super();
            }
        });
    }

    public final b b()
    {
        return com.google.android.m4b.maps.da.d.a(d);
    }

    public final b b(float f)
    {
        return com.google.android.m4b.maps.da.d.a(new bp.a(f) {

            private float a;
            private bq b;

            public final void a(bp bp1, int i, cb cb1)
            {
                cb1.b(cb.a.az);
                bp1.a(a, i);
            }

            public final String toString()
            {
                String s = String.valueOf(cb.a.az);
                return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
            }

            
            {
                b = bq.this;
                a = f;
                super();
            }
        });
    }

}
