// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import java.util.ArrayList;

public final class mlr
{

    private static final mlp b = new mlp();
    ArrayList a;

    public mlr()
    {
        a = new ArrayList();
    }

    static mlp a()
    {
        return b;
    }

    static void a(PointF apointf[], mlo mlo1, boolean flag, ArrayList arraylist, ArrayList arraylist1, float f, PointF pointf)
    {
        mls mls1;
        mls mls2;
        mls mls3;
        float af[];
        boolean flag1;
        flag1 = true;
        mls1 = new mls(null, 1.0F, mlo1.calculate(1.0F, apointf, new PointF()));
        mls2 = new mls(mls1, 0.0F, mlo1.calculate(0.0F, apointf, new PointF()));
        af = new float[1];
        mls3 = mls2;
_L5:
        if (mls1 == null) goto _L2; else goto _L1
_L1:
        boolean flag2 = flag1;
_L4:
        Object obj;
        boolean flag3;
        obj = new PointF();
        flag3 = a(apointf, mlo1, mls3.b, mls3.c, mls1.b, mls1.c, af, ((PointF) (obj)), f);
        flag = flag3;
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        flag = flag3;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        PointF pointf1 = new PointF();
        float af1[] = new float[1];
        flag3 = a(apointf, mlo1, mls3.b, mls3.c, af[0], ((PointF) (obj)), af1, pointf1, f);
        flag = flag3;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        flag1 = false;
_L6:
        if (flag3)
        {
            obj = new mls(mls1, af[0], ((PointF) (obj)));
            mls3.a = ((mls) (obj));
        } else
        {
            obj = mls1;
        }
        mls1 = ((mls) (obj));
        flag2 = flag1;
        if (flag3) goto _L4; else goto _L3
_L3:
        mls1 = ((mls) (obj)).a;
        mls3 = ((mls) (obj));
          goto _L5
_L2:
        if (arraylist.isEmpty())
        {
            arraylist.add(new PointF(0.0F, 0.0F));
            arraylist1.add(Float.valueOf(0.0F));
            pointf.set(0.0F, 0.0F);
        }
        mlo1 = (PointF)arraylist.get(arraylist.size() - 1);
        f = ((Float)arraylist1.get(arraylist1.size() - 1)).floatValue();
        for (apointf = mls2; apointf != null; apointf = ((mls) (apointf)).a)
        {
            arraylist.add(((mls) (apointf)).c);
            f += PointF.length(((mls) (apointf)).c.x - ((PointF) (mlo1)).x, ((mls) (apointf)).c.y - ((PointF) (mlo1)).y);
            arraylist1.add(Float.valueOf(f));
            mlo1 = ((mls) (apointf)).c;
        }

        return;
        flag1 = flag2;
        flag3 = flag;
          goto _L6
    }

    private static boolean a(PointF apointf[], mlo mlo1, float f, PointF pointf, float f1, PointF pointf1, float af[], PointF pointf2, 
            float f2)
    {
        boolean flag = false;
        af[0] = (f1 + f) / 2.0F;
        f1 = (pointf1.x + pointf.x) / 2.0F;
        f = (pointf1.y + pointf.y) / 2.0F;
        mlo1.calculate(af[0], apointf, pointf2);
        f1 = pointf2.x - f1;
        f = pointf2.y - f;
        if (f1 * f1 + f * f > f2)
        {
            flag = true;
        }
        return flag;
    }

}
