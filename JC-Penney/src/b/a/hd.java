// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, no, he, gm, 
//            gh, gl, pn

public final class hd extends pe
{

    public static final hd a = new hd(0);

    private hd(int i)
    {
        super(i);
    }

    public static hd a(gm gm1, int i)
    {
        no no1;
        no no3;
        he ahe[];
        int j;
        int k;
        boolean flag1;
        int i1;
        switch (i)
        {
        default:
            throw new IllegalArgumentException("bogus howMuch");

        case 1: // '\001'
            return a;

        case 2: // '\002'
        case 3: // '\003'
            no3 = no.a;
            break;
        }
        i1 = ((pe) (gm1)).K.length;
        ahe = new he[i1];
        k = 0;
        j = 0;
        flag1 = false;
        no1 = no3;
_L2:
        no no2;
        gl gl1;
        boolean flag;
        int l;
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        gl1 = gm1.a(k);
        if (!(gl1 instanceof gh))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        no2 = no1;
        l = j;
_L4:
        k++;
        j = l;
        flag1 = flag;
        no1 = no2;
        if (true) goto _L2; else goto _L1
_L1:
        no no4;
        no4 = gl1.e;
        l = j;
        flag = flag1;
        no2 = no1;
        if (no4.equals(no3)) goto _L4; else goto _L3
_L3:
        l = j;
        flag = flag1;
        no2 = no1;
        if (no4.a(no1)) goto _L4; else goto _L5
_L5:
        if (i != 3) goto _L7; else goto _L6
_L6:
        l = j;
        flag = flag1;
        no2 = no1;
        if (!flag1) goto _L4; else goto _L7
_L7:
        ahe[j] = new he(gl1.d(), no4);
        l = j + 1;
        flag = false;
        no2 = no4;
          goto _L4
        gm1 = new hd(j);
        for (i = 0; i < j; i++)
        {
            gm1.a(i, ahe[i]);
        }

        gm1.L = false;
        return gm1;
    }

    public final he a(int i)
    {
        return (he)d(i);
    }

}
