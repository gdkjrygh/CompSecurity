// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Matrix3f

public class Matrix4f
{

    final float mMat[];

    public Matrix4f()
    {
        mMat = new float[16];
        loadIdentity();
    }

    public Matrix4f(float af[])
    {
        mMat = new float[16];
        System.arraycopy(af, 0, mMat, 0, mMat.length);
    }

    private float computeCofactor(int i, int j)
    {
        int k = (i + 1) % 4;
        int l = (i + 2) % 4;
        int i1 = (i + 3) % 4;
        int j1 = (j + 1) % 4;
        int k1 = (j + 2) % 4;
        int l1 = (j + 3) % 4;
        float f = mMat[j1 * 4 + k];
        float f1 = mMat[k1 * 4 + l];
        float f2 = mMat[l1 * 4 + i1];
        float f3 = mMat[l1 * 4 + l];
        float f4 = mMat[k1 * 4 + i1];
        float f5 = mMat[k1 * 4 + k];
        float f6 = mMat[j1 * 4 + l];
        float f7 = mMat[l1 * 4 + i1];
        float f8 = mMat[l1 * 4 + l];
        float f9 = mMat[j1 * 4 + i1];
        f1 = mMat[k + l1 * 4] * (mMat[j1 * 4 + l] * mMat[k1 * 4 + i1] - mMat[l + k1 * 4] * mMat[i1 + j1 * 4]) + (f * (f1 * f2 - f3 * f4) - f5 * (f6 * f7 - f8 * f9));
        f = f1;
        if ((i + j & 1) != 0)
        {
            f = -f1;
        }
        return f;
    }

    public float get(int i, int j)
    {
        return mMat[i * 4 + j];
    }

    public float[] getArray()
    {
        return mMat;
    }

    public boolean inverse()
    {
        boolean flag = false;
        Matrix4f matrix4f = new Matrix4f();
        for (int i = 0; i < 4; i++)
        {
            for (int k = 0; k < 4; k++)
            {
                matrix4f.mMat[i * 4 + k] = computeCofactor(i, k);
            }

        }

        float f = mMat[0] * matrix4f.mMat[0] + mMat[4] * matrix4f.mMat[1] + mMat[8] * matrix4f.mMat[2] + mMat[12] * matrix4f.mMat[3];
        if ((double)Math.abs(f) < 9.9999999999999995E-07D)
        {
            return false;
        }
        f = 1.0F / f;
        for (int j = ((flag) ? 1 : 0); j < 16; j++)
        {
            mMat[j] = matrix4f.mMat[j] * f;
        }

        return true;
    }

    public boolean inverseTranspose()
    {
        boolean flag = false;
        Matrix4f matrix4f = new Matrix4f();
        for (int i = 0; i < 4; i++)
        {
            for (int k = 0; k < 4; k++)
            {
                matrix4f.mMat[k * 4 + i] = computeCofactor(i, k);
            }

        }

        float f = mMat[0] * matrix4f.mMat[0] + mMat[4] * matrix4f.mMat[4] + mMat[8] * matrix4f.mMat[8] + mMat[12] * matrix4f.mMat[12];
        if ((double)Math.abs(f) < 9.9999999999999995E-07D)
        {
            return false;
        }
        f = 1.0F / f;
        for (int j = ((flag) ? 1 : 0); j < 16; j++)
        {
            mMat[j] = matrix4f.mMat[j] * f;
        }

        return true;
    }

    public void load(Matrix3f matrix3f)
    {
        mMat[0] = matrix3f.mMat[0];
        mMat[1] = matrix3f.mMat[1];
        mMat[2] = matrix3f.mMat[2];
        mMat[3] = 0.0F;
        mMat[4] = matrix3f.mMat[3];
        mMat[5] = matrix3f.mMat[4];
        mMat[6] = matrix3f.mMat[5];
        mMat[7] = 0.0F;
        mMat[8] = matrix3f.mMat[6];
        mMat[9] = matrix3f.mMat[7];
        mMat[10] = matrix3f.mMat[8];
        mMat[11] = 0.0F;
        mMat[12] = 0.0F;
        mMat[13] = 0.0F;
        mMat[14] = 0.0F;
        mMat[15] = 1.0F;
    }

    public void load(Matrix4f matrix4f)
    {
        System.arraycopy(matrix4f.getArray(), 0, mMat, 0, mMat.length);
    }

    public void loadFrustum(float f, float f1, float f2, float f3, float f4, float f5)
    {
        loadIdentity();
        mMat[0] = (2.0F * f4) / (f1 - f);
        mMat[5] = (2.0F * f4) / (f3 - f2);
        mMat[8] = (f1 + f) / (f1 - f);
        mMat[9] = (f3 + f2) / (f3 - f2);
        mMat[10] = -(f5 + f4) / (f5 - f4);
        mMat[11] = -1F;
        mMat[14] = (-2F * f5 * f4) / (f5 - f4);
        mMat[15] = 0.0F;
    }

    public void loadIdentity()
    {
        mMat[0] = 1.0F;
        mMat[1] = 0.0F;
        mMat[2] = 0.0F;
        mMat[3] = 0.0F;
        mMat[4] = 0.0F;
        mMat[5] = 1.0F;
        mMat[6] = 0.0F;
        mMat[7] = 0.0F;
        mMat[8] = 0.0F;
        mMat[9] = 0.0F;
        mMat[10] = 1.0F;
        mMat[11] = 0.0F;
        mMat[12] = 0.0F;
        mMat[13] = 0.0F;
        mMat[14] = 0.0F;
        mMat[15] = 1.0F;
    }

    public void loadMultiply(Matrix4f matrix4f, Matrix4f matrix4f1)
    {
        for (int i = 0; i < 4; i++)
        {
            int j = 0;
            float f = 0.0F;
            float f1 = 0.0F;
            float f2 = 0.0F;
            float f3 = 0.0F;
            for (; j < 4; j++)
            {
                float f4 = matrix4f1.get(i, j);
                f3 += matrix4f.get(j, 0) * f4;
                f2 += matrix4f.get(j, 1) * f4;
                f1 += matrix4f.get(j, 2) * f4;
                f += f4 * matrix4f.get(j, 3);
            }

            set(i, 0, f3);
            set(i, 1, f2);
            set(i, 2, f1);
            set(i, 3, f);
        }

    }

    public void loadOrtho(float f, float f1, float f2, float f3, float f4, float f5)
    {
        loadIdentity();
        mMat[0] = 2.0F / (f1 - f);
        mMat[5] = 2.0F / (f3 - f2);
        mMat[10] = -2F / (f5 - f4);
        mMat[12] = -(f1 + f) / (f1 - f);
        mMat[13] = -(f3 + f2) / (f3 - f2);
        mMat[14] = -(f5 + f4) / (f5 - f4);
    }

    public void loadOrthoWindow(int i, int j)
    {
        loadOrtho(0.0F, i, j, 0.0F, -1F, 1.0F);
    }

    public void loadPerspective(float f, float f1, float f2, float f3)
    {
        f = f2 * (float)Math.tan((float)(((double)f * 3.1415926535897931D) / 360D));
        float f4 = -f;
        loadFrustum(f4 * f1, f * f1, f4, f, f2, f3);
    }

    public void loadProjectionNormalized(int i, int j)
    {
        Matrix4f matrix4f = new Matrix4f();
        Matrix4f matrix4f1 = new Matrix4f();
        if (i > j)
        {
            float f = (float)i / (float)j;
            matrix4f.loadFrustum(-f, f, -1F, 1.0F, 1.0F, 100F);
        } else
        {
            float f1 = (float)j / (float)i;
            matrix4f.loadFrustum(-1F, 1.0F, -f1, f1, 1.0F, 100F);
        }
        matrix4f1.loadRotate(180F, 0.0F, 1.0F, 0.0F);
        matrix4f.loadMultiply(matrix4f, matrix4f1);
        matrix4f1.loadScale(-2F, 2.0F, 1.0F);
        matrix4f.loadMultiply(matrix4f, matrix4f1);
        matrix4f1.loadTranslate(0.0F, 0.0F, 2.0F);
        matrix4f.loadMultiply(matrix4f, matrix4f1);
        load(matrix4f);
    }

    public void loadRotate(float f, float f1, float f2, float f3)
    {
        mMat[3] = 0.0F;
        mMat[7] = 0.0F;
        mMat[11] = 0.0F;
        mMat[12] = 0.0F;
        mMat[13] = 0.0F;
        mMat[14] = 0.0F;
        mMat[15] = 1.0F;
        f = 0.01745329F * f;
        float f6 = (float)Math.cos(f);
        float f7 = (float)Math.sin(f);
        float f8 = (float)Math.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
        float f5 = f1;
        float f4 = f2;
        f = f3;
        if (f8 == 1.0F)
        {
            f = 1.0F / f8;
            f5 = f1 * f;
            f4 = f2 * f;
            f = f3 * f;
        }
        f1 = 1.0F - f6;
        f2 = f5 * f4;
        f3 = f4 * f;
        f8 = f * f5;
        float f9 = f5 * f7;
        float f10 = f4 * f7;
        f7 *= f;
        mMat[0] = f5 * f5 * f1 + f6;
        mMat[4] = f2 * f1 - f7;
        mMat[8] = f8 * f1 + f10;
        mMat[1] = f7 + f2 * f1;
        mMat[5] = f4 * f4 * f1 + f6;
        mMat[9] = f3 * f1 - f9;
        mMat[2] = f8 * f1 - f10;
        mMat[6] = f3 * f1 + f9;
        mMat[10] = f6 + f1 * (f * f);
    }

    public void loadScale(float f, float f1, float f2)
    {
        loadIdentity();
        mMat[0] = f;
        mMat[5] = f1;
        mMat[10] = f2;
    }

    public void loadTranslate(float f, float f1, float f2)
    {
        loadIdentity();
        mMat[12] = f;
        mMat[13] = f1;
        mMat[14] = f2;
    }

    public void multiply(Matrix4f matrix4f)
    {
        Matrix4f matrix4f1 = new Matrix4f();
        matrix4f1.loadMultiply(this, matrix4f);
        load(matrix4f1);
    }

    public void rotate(float f, float f1, float f2, float f3)
    {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadRotate(f, f1, f2, f3);
        multiply(matrix4f);
    }

    public void scale(float f, float f1, float f2)
    {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadScale(f, f1, f2);
        multiply(matrix4f);
    }

    public void set(int i, int j, float f)
    {
        mMat[i * 4 + j] = f;
    }

    public void translate(float f, float f1, float f2)
    {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadTranslate(f, f1, f2);
        multiply(matrix4f);
    }

    public void transpose()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = i + 1; j < 4; j++)
            {
                float f = mMat[i * 4 + j];
                mMat[i * 4 + j] = mMat[j * 4 + i];
                mMat[j * 4 + i] = f;
            }

        }

    }
}
