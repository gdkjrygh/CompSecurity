// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.util.ArrayList;

public final class oil
    implements oia
{

    private mzp a;
    private Runnable b;
    private boolean c;
    private TiledImageView d;

    public oil(TiledImageView tiledimageview)
    {
        d = tiledimageview;
        super();
    }

    public final void a()
    {
        a = new mzp();
        mzm.i();
        TiledImageView.c(d).g.a(TiledImageView.c(d).e, TiledImageView.c(d).d);
    }

    public final void a(int i, int j)
    {
        Object obj = a;
        obj.c = i;
        obj.d = j;
        GLES20.glViewport(0, 0, ((mzp) (obj)).c, ((mzp) (obj)).d);
        mzp.d();
        Matrix.setIdentityM(((mzp) (obj)).a, ((mzp) (obj)).b);
        Matrix.orthoM(((mzp) (obj)).e, 0, 0.0F, i, 0.0F, j, -1F, 1.0F);
        if ((mzu)((mzp) (obj)).f.get(((mzp) (obj)).f.size() - 1) == null)
        {
            Matrix.translateM(((mzp) (obj)).a, ((mzp) (obj)).b, 0.0F, j, 0.0F);
            Matrix.scaleM(((mzp) (obj)).a, ((mzp) (obj)).b, 1.0F, -1F, 1.0F);
        }
        obj = TiledImageView.c(d).g;
        obj.m = i;
        obj.n = j;
    }

    public final void b()
    {
        mzp.c();
        synchronized (TiledImageView.d(d))
        {
            b = TiledImageView.c(d).f;
            TiledImageView.c(d).g.a(TiledImageView.c(d).e, TiledImageView.c(d).d);
            oid oid1 = TiledImageView.c(d).g;
            int i = TiledImageView.c(d).b;
            int j = TiledImageView.c(d).c;
            float f = TiledImageView.c(d).a;
            if (oid1.g != i || oid1.h != j || oid1.i != f)
            {
                oid1.g = i;
                oid1.h = j;
                oid1.i = f;
                oid1.j = true;
            }
        }
        c = TiledImageView.c(d).g.a(a);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        if (c && b != null)
        {
            synchronized (TiledImageView.d(d))
            {
                if (TiledImageView.c(d).f == b)
                {
                    TiledImageView.c(d).f = null;
                }
                d.post(b);
                b = null;
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
