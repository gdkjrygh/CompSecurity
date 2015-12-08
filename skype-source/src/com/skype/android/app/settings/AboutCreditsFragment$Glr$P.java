// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.graphics.Color;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

public class fiiii
{

    protected static final int A = 0;
    protected static final int B = 3;
    protected static final int G = 2;
    protected static final int R = 1;
    protected static final int X = 0;
    protected static final int Y = 1;
    private float die;
    private float mA;
    private boolean mAg;
    private boolean mBooom;
    private float mC[];
    private boolean mFiiii;
    private boolean mFw;
    private float mP[];
    private float mS;
    private float mSd[];
    private int mTextureId;
    final mP this$0;

    public void ani(long l)
    {
        if (mC[0] < 10F)
        {
            mFw = false;
            mBooom = false;
        } else
        {
            if (mAg)
            {
                float af[] = mC;
                af[0] = af[0] - (float)l * die * 4F;
            }
            mA = mA + (float)l * mS;
            float af1[] = mSd;
            af1[1] = af1[1] + 0.0098F;
            mP[0] = mP[0] + mSd[0] * (float)l;
            mP[1] = mP[1] + mSd[1] * (float)l;
            if (mP[1] > (float)AboutCreditsFragment.access$500())
            {
                mC[0] = 0.0F;
            }
            if (mSd[1] > 0.1F && mFw)
            {
                mFiiii = true;
                return;
            }
        }
    }

    public void boooom(float af[], int i, float f)
    {
        if (mBooom)
        {
            return;
        } else
        {
            mBooom = true;
            mAg = true;
            mP[0] = af[0];
            mP[1] = af[1];
            mSd[0] = ols.getRandomGaussian(f);
            mSd[1] = ols.getRandomGaussian(f) - 0.1F;
            mC[0] = 255F;
            mC[1] = Color.red(i);
            mC[2] = Color.green(i);
            mC[3] = Color.blue(i);
            return;
        }
    }

    public void d(GL10 gl10)
    {
        while (mC[0] < 10F || !mFw) 
        {
            return;
        }
        gl10.glPushMatrix();
        gl10.glTranslatef(mP[0], mP[1], 0.0F);
        gl10.glRotatef(mA, 0.0F, 0.0F, 1.0F);
        cess._mth700(this._cls0.this).sTx(gl10, mTextureId);
        ols.drawSprite(gl10, mVb, mB);
        gl10.glPopMatrix();
    }

    public void die()
    {
        mFiiii = false;
        mFw = false;
        mAg = true;
        mC[0] = 0.0F;
    }

    public void fiiii()
    {
        mFw = true;
        mAg = false;
        mP[0] = (int)((float)AboutCreditsFragment.access$600() / 2.0F);
        mP[1] = AboutCreditsFragment.access$500();
        mSd[0] = ols.getRandom(-0.15F, 0.15F);
        mSd[1] = ols.getRandom(Math.max(-1.2F, (float)(-AboutCreditsFragment.access$500()) / 850F), (float)(-AboutCreditsFragment.access$500()) / 1500F);
        mC[0] = 255F;
        mC[1] = 255F;
        mC[2] = 255F;
        mC[3] = 255F;
        mS = ols.getRandom(-0.7F, 0.7F);
        mTextureId = cess._mth700(this._cls0.this).gimmeone();
    }

    public float getA()
    {
        return mC[0] / 255F;
    }

    public float getB()
    {
        return mC[3] / 255F;
    }

    public float getG()
    {
        return mC[2] / 255F;
    }

    public float[] getP()
    {
        return mP;
    }

    public float getR()
    {
        return mC[1] / 255F;
    }

    public float getX()
    {
        return mP[0];
    }

    public float getY()
    {
        return mP[1];
    }

    public boolean isFiiii()
    {
        return mFiiii;
    }

    public void setP(int i, int j)
    {
        mP[0] = i;
        mP[1] = j;
    }

    public ols(boolean flag)
    {
        this$0 = this._cls0.this;
        super();
        die = 0.03F;
        mP = new float[2];
        mSd = new float[2];
        mC = new float[4];
        mP[0] = -1F;
        mP[1] = -1F;
        mSd[0] = 0.0F;
        mSd[1] = 0.0F;
        mC[0] = 0.0F;
        mC[1] = 0.0F;
        mC[2] = 0.0F;
        mC[3] = 0.0F;
        mA = 0.0F;
        mAg = true;
        mFw = flag;
        if (flag)
        {
            fiiii();
        }
    }
}
