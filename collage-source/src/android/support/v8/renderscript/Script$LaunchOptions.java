// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Script, RSIllegalArgumentException

public static final class zend
{

    private int strategy;
    private int xend;
    private int xstart;
    private int yend;
    private int ystart;
    private int zend;
    private int zstart;

    public int getXEnd()
    {
        return xend;
    }

    public int getXStart()
    {
        return xstart;
    }

    public int getYEnd()
    {
        return yend;
    }

    public int getYStart()
    {
        return ystart;
    }

    public int getZEnd()
    {
        return zend;
    }

    public int getZStart()
    {
        return zstart;
    }

    public zstart setX(int i, int j)
    {
        if (i < 0 || j <= i)
        {
            throw new RSIllegalArgumentException("Invalid dimensions");
        } else
        {
            xstart = i;
            xend = j;
            return this;
        }
    }

    public xend setY(int i, int j)
    {
        if (i < 0 || j <= i)
        {
            throw new RSIllegalArgumentException("Invalid dimensions");
        } else
        {
            ystart = i;
            yend = j;
            return this;
        }
    }

    public yend setZ(int i, int j)
    {
        if (i < 0 || j <= i)
        {
            throw new RSIllegalArgumentException("Invalid dimensions");
        } else
        {
            zstart = i;
            zend = j;
            return this;
        }
    }







    public ption()
    {
        xstart = 0;
        ystart = 0;
        xend = 0;
        yend = 0;
        zstart = 0;
        zend = 0;
    }
}
