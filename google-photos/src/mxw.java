// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;

final class mxw
{

    private final mxm a;

    mxw(mxm mxm)
    {
        a = mxm;
    }

    protected final mxn a(InputStream inputstream)
    {
        mxn mxn1;
        int i;
        inputstream = mxs.a(inputstream, a);
        mxn1 = new mxn(inputstream.f());
        i = inputstream.a();
_L9:
        if (i == 6)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        i;
        JVM INSTR tableswitch 0 5: default 76
    //                   0 85
    //                   1 103
    //                   2 139
    //                   3 174
    //                   4 219
    //                   5 337;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_337;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L10:
        i = inputstream.a();
        if (true) goto _L9; else goto _L8
_L8:
        mxn1.a(new mxy(((mxs) (inputstream)).b));
          goto _L10
_L3:
        mxx mxx1 = ((mxs) (inputstream)).c;
        if (!mxx1.b())
        {
            inputstream.a(mxx1);
        } else
        {
            mxn1.b(mxx1.e).a(mxx1);
        }
          goto _L10
_L4:
        mxx mxx2 = ((mxs) (inputstream)).c;
        if (mxx2.b == 7)
        {
            inputstream.b(mxx2);
        }
        mxn1.b(mxx2.e).a(mxx2);
          goto _L10
_L5:
        byte abyte0[] = new byte[inputstream.d()];
        if (abyte0.length == inputstream.a(abyte0))
        {
            mxn1.a = abyte0;
        } else
        if (Log.isLoggable("ExifReader", 5))
        {
            Log.w("ExifReader", "Failed to read the compressed thumbnail");
        }
          goto _L10
_L6:
        byte abyte1[] = new byte[inputstream.c()];
        if (abyte1.length == inputstream.a(abyte1))
        {
            int k = ((mxs) (inputstream)).d.a;
            if (k < mxn1.b.size())
            {
                mxn1.b.set(k, abyte1);
            } else
            {
                for (int j = mxn1.b.size(); j < k; j++)
                {
                    mxn1.b.add(null);
                }

                mxn1.b.add(abyte1);
            }
        } else
        if (Log.isLoggable("ExifReader", 5))
        {
            Log.w("ExifReader", "Failed to read the strip bytes");
        }
          goto _L10
        mxn1.d = inputstream.e();
          goto _L10
        return mxn1;
    }
}
