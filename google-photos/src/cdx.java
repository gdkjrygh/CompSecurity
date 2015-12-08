// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Map;
import java.util.TreeMap;

public final class cdx
{

    public Map a;
    public android.hardware.Camera.Face b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public cdx()
    {
        a = new TreeMap();
    }

    private cdx(android.hardware.Camera.Face face, float f1, float f2, float f3, float f4, float f5, float f6)
    {
        a = new TreeMap();
        b = face;
        c = f1;
        d = f2;
        e = f3;
        f = f4;
        g = f5;
        h = f6;
    }

    public static float a(float f1)
    {
        f1 = Math.max(Math.min(f1, 30F), -30F);
        float f2 = (float)(1.0D / (Math.exp(1.0D) + 1.0D));
        return (float)(1.0D / (Math.exp(-0.10000000000000001D * ((double)f1 - 10D)) + 1.0D)) - f2;
    }

    public static cdx a(cvw cvw1)
    {
        android.hardware.Camera.Face face;
        if (cvw1.a == null)
        {
            face = null;
        } else
        {
            face = new android.hardware.Camera.Face();
            cvx cvx1 = cvw1.a;
            cvz cvz1 = cvx1.a;
            face.rect = new Rect(cvz1.a, cvz1.b, cvz1.c, cvz1.d);
            face.leftEye = new Point(cvx1.b.a, cvx1.b.b);
            face.rightEye = new Point(cvx1.c.a, cvx1.c.b);
            face.mouth = new Point(cvx1.d.a, cvx1.d.b);
            face.id = cvx1.e;
            face.score = (int)cvw1.f;
        }
        return new cdx(face, cvw1.b, cvw1.c, cvw1.e, cvw1.d, cvw1.f, cvw1.g);
    }

    public final cvw a()
    {
        cvw cvw1 = new cvw();
        cvw1.b = c;
        cvw1.c = d;
        cvw1.d = f;
        cvw1.e = e;
        cvw1.f = g;
        cvw1.g = h;
        if (b != null)
        {
            cvx cvx1 = new cvx();
            cvz cvz1 = new cvz();
            cvy cvy1 = new cvy();
            cvy cvy2 = new cvy();
            cvy cvy3 = new cvy();
            cvz1.a = b.rect.left;
            cvz1.b = b.rect.top;
            cvz1.c = b.rect.right;
            cvz1.d = b.rect.bottom;
            cvy1.a = b.leftEye.x;
            cvy1.b = b.leftEye.y;
            cvy2.a = b.rightEye.x;
            cvy2.b = b.rightEye.y;
            cvy3.a = b.mouth.x;
            cvy3.b = b.mouth.y;
            cvx1.a = cvz1;
            cvx1.b = cvy1;
            cvx1.c = cvy2;
            cvx1.d = cvy3;
            cvx1.e = b.id;
            cvw1.a = cvx1;
        }
        return cvw1;
    }
}
