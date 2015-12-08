// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

public static class <init>
    implements android.opengl.itsFragment.Glr, Runnable
{
    public class P
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
        final AboutCreditsFragment.Glr this$0;

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
                mSd[0] = Tools.getRandomGaussian(f);
                mSd[1] = Tools.getRandomGaussian(f) - 0.1F;
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
            mT.sTx(gl10, mTextureId);
            Tools.drawSprite(gl10, a.mVb, a.mB);
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
            mSd[0] = Tools.getRandom(-0.15F, 0.15F);
            mSd[1] = Tools.getRandom(Math.max(-1.2F, (float)(-AboutCreditsFragment.access$500()) / 850F), (float)(-AboutCreditsFragment.access$500()) / 1500F);
            mC[0] = 255F;
            mC[1] = 255F;
            mC[2] = 255F;
            mC[3] = 255F;
            mS = Tools.getRandom(-0.7F, 0.7F);
            mTextureId = mT.gimmeone();
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

        public P(boolean flag)
        {
            this$0 = AboutCreditsFragment.Glr.this;
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

    public static final class Tools
    {

        private static Random mRandom = new Random();

        public static void drawSprite(GL10 gl10, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
        {
            if (floatbuffer1 == null)
            {
                return;
            } else
            {
                gl10.glVertexPointer(2, 5126, 0, floatbuffer);
                gl10.glTexCoordPointer(2, 5126, 0, floatbuffer1);
                gl10.glDrawArrays(5, 0, 4);
                return;
            }
        }

        public static float getRandom(float f, float f1)
        {
            return mRandom.nextFloat() * (f1 - f) + f;
        }

        public static int getRandom(int i, int j)
        {
            return (int)(mRandom.nextFloat() * (float)(j - i)) + i;
        }

        public static float getRandomGaussian(float f)
        {
            return (float)(mRandom.nextGaussian() * (double)f);
        }

        public static FloatBuffer makeFloatBuffer(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7)
        {
            Object obj = ByteBuffer.allocateDirect(32);
            ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
            obj = ((ByteBuffer) (obj)).asFloatBuffer();
            ((FloatBuffer) (obj)).put(new float[] {
                f, f1, f2, f1, f, f5, f2, f5
            });
            ((FloatBuffer) (obj)).position(0);
            return ((FloatBuffer) (obj));
        }

        public static FloatBuffer makeFloatBuffer(float af[])
        {
            Object obj = ByteBuffer.allocateDirect(af.length * 4);
            ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
            obj = ((ByteBuffer) (obj)).asFloatBuffer();
            ((FloatBuffer) (obj)).put(af);
            ((FloatBuffer) (obj)).position(0);
            return ((FloatBuffer) (obj));
        }


        public Tools()
        {
        }
    }

    private static final class a
    {

        public static FloatBuffer mB;
        public static FloatBuffer mVb;
        private int cTid;
        private boolean mR;
        private int mTx[];

        public final void destroy(GL10 gl10)
        {
            gl10.glDeleteTextures(mTx.length, mTx, 0);
            mTx = null;
            cTid = -1;
        }

        public final int gimmeone()
        {
            if (mTx == null)
            {
                return 0;
            } else
            {
                return mTx[Tools.getRandom(0, mTx.length)];
            }
        }

        public final void lTx(GL10 gl10, Context context)
        {
            ArrayList arraylist;
            arraylist = new ArrayList();
            String as[];
            String s1;
            int i;
            int k;
            try
            {
                as = context.getAssets().list("emoticons");
                k = as.length;
            }
            catch (IOException ioexception)
            {
                break; /* Loop/switch isn't completed */
            }
            i = 0;
            if (i >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            s1 = as[i];
            if (s1.endsWith("_40.png"))
            {
                arraylist.add(s1);
            }
            i++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_27;
_L1:
            int ai[];
            int j;
            ai = new int[arraylist.size()];
            gl10.glGenTextures(arraylist.size(), ai, 0);
            mTx = ai;
            j = 0;
_L4:
            if (j >= arraylist.size())
            {
                break; /* Loop/switch isn't completed */
            }
            Bitmap bitmap1;
            InputStream inputstream = context.getAssets().open((new StringBuilder("emoticons")).append(File.separator).append((String)arraylist.get(j)).toString());
            bitmap1 = BitmapFactory.decodeStream(inputstream);
            inputstream.close();
            Bitmap bitmap = Bitmap.createScaledBitmap(bitmap1, 32, 32, true);
            gl10.glBindTexture(3553, ai[j]);
            gl10.glTexParameterx(3553, 10241, 9729);
            gl10.glTexParameterx(3553, 10240, 9729);
            gl10.glTexParameterf(3553, 10242, 33071F);
            gl10.glTexParameterf(3553, 10243, 33071F);
            gl10.glTexEnvf(8960, 8704, 7681F);
            gl10.glTexEnvf(8960, 8704, 8448F);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
_L5:
            j++;
            if (true) goto _L4; else goto _L3
_L3:
            mR = true;
            return;
            IOException ioexception1;
            ioexception1;
              goto _L5
        }

        public final void sTx(GL10 gl10, int i)
        {
            if (i == cTid)
            {
                return;
            }
            try
            {
                gl10.glBindTexture(3553, i);
                cTid = i;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (GL10 gl10)
            {
                gl10.printStackTrace();
            }
            return;
        }


        public a()
        {
            cTid = -1;
            mR = false;
            int i = (int)AboutCreditsFragment.Glr.FS;
            mVb = Tools.makeFloatBuffer(new float[] {
                (float)(-i), (float)(-i), (float)i, (float)(-i), (float)(-i), (float)i, (float)i, (float)i
            });
            mB = Tools.makeFloatBuffer(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }


    private static float FS = 0F;
    private static float PS = 0F;
    public static final long sleep = 16L;
    private final int N;
    private Context mContext;
    private int mEc[] = {
        0xffff0000, 0xff00ff00, -256, 0xff0000ff, -1, -65281
    };
    private final LinkedList mFwl;
    private int mNfw;
    private int mPid;
    private P mPl[];
    private a mT;
    private long mTimeE;
    private long mTimeOfLE;
    protected boolean run;
    int size;
    private Thread thread;
    private final long win[];
    private int winC;

    private void boom(GL10 gl10)
    {
        gl10.glDisable(3553);
        gl10.glPointSize(PS);
        Object obj = ByteBuffer.allocateDirect(mPl.length * 8);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        Object obj1 = ByteBuffer.allocateDirect(mPl.length * 16);
        ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
        obj1 = ((ByteBuffer) (obj1)).asFloatBuffer();
        for (int i = 0; i < mPl.length; i++)
        {
            ((FloatBuffer) (obj)).put(mPl[i].getX());
            ((FloatBuffer) (obj)).put(mPl[i].getY());
            ((FloatBuffer) (obj1)).put(mPl[i].getR());
            ((FloatBuffer) (obj1)).put(mPl[i].getG());
            ((FloatBuffer) (obj1)).put(mPl[i].getB());
            ((FloatBuffer) (obj1)).put(mPl[i].getA());
        }

        ((FloatBuffer) (obj)).position(0);
        ((FloatBuffer) (obj1)).position(0);
        gl10.glVertexPointer(2, 5126, 0, ((java.nio.Buffer) (obj)));
        gl10.glEnableClientState(32884);
        gl10.glColorPointer(4, 5126, 0, ((java.nio.Buffer) (obj1)));
        gl10.glEnableClientState(32886);
        gl10.glDrawArrays(0, 0, mPl.length);
        gl10.glDisableClientState(32884);
        gl10.glDisableClientState(32886);
    }

    private void booooom(float af[])
    {
        int j = mEc[Tools.getRandom(0, mEc.length)];
        float f = Tools.getRandom(0.1F, 0.25F);
        for (int i = 0; i < 50; i++)
        {
            mPl[mPid].boooom(af, j, f);
            icp();
        }

    }

    private void fiii(GL10 gl10)
    {
        LinkedList linkedlist = mFwl;
        linkedlist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mFwl.iterator(); iterator.hasNext(); ((P)iterator.next()).d(gl10)) { }
        break MISSING_BLOCK_LABEL_45;
        gl10;
        linkedlist;
        JVM INSTR monitorexit ;
        throw gl10;
        linkedlist;
        JVM INSTR monitorexit ;
    }

    private void fiiiiiii()
    {
        synchronized (mFwl)
        {
            mFwl.add(new P(true));
        }
        return;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void icp()
    {
        int i = mPid + 1;
        mPid = i;
        if (i == 300)
        {
            mPid = 0;
        }
    }

    private void lTx(GL10 gl10)
    {
        if (mT != null)
        {
            mT.destroy(gl10);
        }
        mT = new a();
        mT.lTx(gl10, mContext);
        mT.sTx(gl10, 0);
    }

    public void destroy()
    {
        mContext = null;
        mT = null;
    }

    public void e()
    {
        run = false;
        thread = null;
    }

    public void m(long l)
    {
        if (mPl.length == 0 || mT == null)
        {
            return;
        }
        mNfw = (int)((long)mNfw - l);
        if (mNfw <= 0)
        {
            fiiiiiii();
            mNfw = Tools.getRandom(100, 1000);
        }
        P ap[] = mPl;
        for (int i = 299; i >= 0; i--)
        {
            ap[i].ani(l);
        }

        LinkedList linkedlist = mFwl;
        linkedlist;
        JVM INSTR monitorenter ;
        Iterator iterator = mFwl.iterator();
        ArrayList arraylist = null;
_L2:
        P p;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        p = (P)iterator.next();
        p.ani(l);
        if (!p.isFiiii())
        {
            continue; /* Loop/switch isn't completed */
        }
        p.die();
        booooom(p.getP());
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        arraylist = new ArrayList();
        arraylist.add(p);
        if (true) goto _L2; else goto _L1
_L1:
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        mFwl.removeAll(arraylist);
        linkedlist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
_L4:
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDrawFrame(GL10 gl10)
    {
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32888);
        gl10.glEnable(3553);
        gl10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        gl10.glClear(16640);
        gl10.glClearColorx(0, 0, 0, 255);
        fiii(gl10);
        boom(gl10);
    }

    public void onPause()
    {
        e();
    }

    public void onResume()
    {
        s();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        gl10.glViewport(0, 0, i, j);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluOrtho2D(gl10, 0.0F, i, j, 0.0F);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        gl10.glShadeModel(7425);
        gl10.glDisable(2929);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        lTx(gl10);
    }

    public void run()
    {
        while (run) 
        {
            if (mT == null || !mT.mR)
            {
                SystemClock.sleep(16L);
            } else
            {
                mTimeE = SystemClock.uptimeMillis() - mTimeOfLE;
                long al[] = win;
                int i = winC;
                winC = i + 1;
                al[i] = mTimeE;
                if (winC == size)
                {
                    winC = 0;
                }
                long l = 0L;
                for (int j = 0; j < size; j++)
                {
                    l += win[j];
                }

                mTimeE = l / (long)size;
                m(mTimeE);
                mTimeOfLE = SystemClock.uptimeMillis();
                SystemClock.sleep(16L);
            }
        }
    }

    public void s()
    {
        winC = 0;
        for (int i = 0; i < size; i++)
        {
            win[i] = 15L;
        }

        if (!run)
        {
            run = true;
            mTimeOfLE = SystemClock.uptimeMillis();
            thread = new Thread(this);
            thread.start();
        }
    }



    private Tools.makeFloatBuffer(Context context)
    {
        N = 300;
        mFwl = new LinkedList();
        size = 10;
        win = new long[size];
        winC = 0;
        mNfw = 0;
        mContext = context;
        mPl = new P[300];
        for (int i = 0; i < 300; i++)
        {
            mPl[i] = new P(false);
        }

        mPid = 0;
        PS = 3F * AboutCreditsFragment.access$200();
        FS = 10F * AboutCreditsFragment.access$200();
    }

    ss._cls200(Context context, ss._cls200 _pcls200)
    {
        this(context);
    }
}
