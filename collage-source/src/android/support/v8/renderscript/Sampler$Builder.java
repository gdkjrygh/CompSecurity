// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Sampler, RenderScript

public static class mAniso
{

    float mAniso;
    mWrapT mMag;
    mWrapT mMin;
    RenderScript mRS;
    mWrapT mWrapR;
    mWrapT mWrapS;
    mWrapT mWrapT;

    public Sampler create()
    {
        mRS.validate();
        Sampler sampler = new Sampler(mRS.nSamplerCreate(mMag.D, mMin.D, mWrapS.D, mWrapT.D, mWrapR.D, mAniso), mRS);
        sampler.mMin = mMin;
        sampler.mMag = mMag;
        sampler.mWrapS = mWrapS;
        sampler.mWrapT = mWrapT;
        sampler.mWrapR = mWrapR;
        sampler.mAniso = mAniso;
        return sampler;
    }

    public void setAnisotropy(float f)
    {
        if (f >= 0.0F)
        {
            mAniso = f;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setMagnification(mAniso maniso)
    {
        if (maniso == AREST || maniso == NEAR)
        {
            mMag = maniso;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setMinification(mMag mmag)
    {
        if (mmag == AREST || mmag == NEAR || mmag == NEAR_MIP_LINEAR || mmag == NEAR_MIP_NEAREST)
        {
            mMin = mmag;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setWrapS(mMin mmin)
    {
        if (mmin == AP || mmin == AMP || mmin == RRORED_REPEAT)
        {
            mWrapS = mmin;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setWrapT(mWrapS mwraps)
    {
        if (mwraps == AP || mwraps == AMP || mwraps == RRORED_REPEAT)
        {
            mWrapT = mwraps;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public (RenderScript renderscript)
    {
        mRS = renderscript;
        mMin = AREST;
        mMag = AREST;
        mWrapS = AP;
        mWrapT = AP;
        mWrapR = AP;
        mAniso = 1.0F;
    }
}
