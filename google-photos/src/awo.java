// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.nio.ByteBuffer;

public final class awo
    implements anj
{

    public static final anf a = anf.a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private static final awp b = new awp();
    private static final awq c = new awq();
    private final Context d;
    private final awq e;
    private final aqm f;
    private final awp g;
    private final amv h;

    public awo(Context context, aqm aqm, aqh aqh)
    {
        this(context, aqm, aqh, c, b);
    }

    private awo(Context context, aqm aqm, aqh aqh, awq awq1, awp awp1)
    {
        d = context;
        f = aqm;
        g = awp1;
        h = new amv(aqm, aqh);
        e = awq1;
    }

    private awu a(ByteBuffer bytebuffer, int i, int j)
    {
        Object obj1;
        amy amy1;
        obj1 = null;
        amy1 = e.a(bytebuffer);
        long l1;
        l1 = bac.a();
        if (amy1.a == null)
        {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        break MISSING_BLOCK_LABEL_48;
        bytebuffer;
        e.a(amy1);
        throw bytebuffer;
        Object obj2;
        if (!amy1.c())
        {
            amy1.b();
            if (!amy1.c())
            {
                amy1.a(0x7fffffff);
                if (amy1.b.c < 0)
                {
                    amy1.b.b = 1;
                }
            }
        }
        obj2 = amy1.b;
        Object obj = obj1;
        if (((amx) (obj2)).c <= 0) goto _L2; else goto _L1
_L1:
        int k = ((amx) (obj2)).b;
        if (k == 0) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L2:
        e.a(amy1);
        return ((awu) (obj));
_L4:
        k = Math.min(((amx) (obj2)).g / j, ((amx) (obj2)).f / i);
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        k = 0;
_L6:
        k = Math.max(1, k);
        if (Log.isLoggable("BufferGifDecoder", 2))
        {
            obj = String.valueOf("Downsampling gif, sampleSize: ");
            int l = ((amx) (obj2)).f;
            int i1 = ((amx) (obj2)).g;
            (new StringBuilder(String.valueOf(obj).length() + 95)).append(((String) (obj))).append(k).append(", target dimens: [").append(i).append("x").append(j).append("], actual dimens: [").append(l).append("x").append(i1).append("]");
        }
        bytebuffer = new amu(h, ((amx) (obj2)), bytebuffer, k);
        bytebuffer.a();
        obj2 = bytebuffer.b();
        obj = obj1;
        if (obj2 == null) goto _L2; else goto _L5
_L5:
        obj = auz.a();
        bytebuffer = new awr(d, bytebuffer, f, ((anl) (obj)), i, j, ((android.graphics.Bitmap) (obj2)));
        if (Log.isLoggable("BufferGifDecoder", 2))
        {
            double d1 = bac.a(l1);
            (new StringBuilder(51)).append("Decoded gif from stream in ").append(d1);
        }
        obj = new awu(bytebuffer);
          goto _L2
        k = Integer.highestOneBit(k);
          goto _L6
    }

    public final volatile aqa a(Object obj, int i, int j, ani ani1)
    {
        return a((ByteBuffer)obj, i, j);
    }

    public final boolean a(Object obj, ani ani1)
    {
        obj = (ByteBuffer)obj;
        aqp aqp1 = new aqp();
        return !((Boolean)ani1.a(a)).booleanValue() && (new ImageHeaderParser(((ByteBuffer) (obj)), aqp1)).a() == com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF;
    }

}
