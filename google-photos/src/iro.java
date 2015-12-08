// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.Log;
import com.google.android.apps.photos.stories.StoryLayout;
import java.util.ArrayList;
import java.util.List;

public final class iro
{

    public int a;
    public int b;
    public int c;
    nbj d;
    public List e;
    List f;
    public msx g[];
    public final StoryLayout h;
    private Canvas i;

    public iro(StoryLayout storylayout, Context context, int j, int k, int l)
    {
        h = storylayout;
        super();
        d = (nbj)olm.a(context, nbj);
        e = new ArrayList();
        f = new ArrayList();
        i = new Canvas();
        b = j;
        c = j;
        a = Math.min(k / 4, l);
        a(k);
    }

    private static float a(msx amsx[], float f1)
    {
        float f2;
        float f3;
        int j;
        int k;
        j = 0;
        f3 = 0.0F;
        k = amsx.length;
        f2 = f3;
        if (k <= 0) goto _L2; else goto _L1
_L1:
        if (f1 > amsx[0].a) goto _L4; else goto _L3
_L3:
        f2 = amsx[0].b;
_L2:
        return f2;
_L4:
        if (f1 >= amsx[k - 1].g)
        {
            return amsx[k - 1].h;
        }
        k = amsx.length;
        do
        {
            f2 = f3;
            if (j >= k)
            {
                continue;
            }
            msx msx1 = amsx[j];
            if (f1 >= msx1.a && f1 <= msx1.g)
            {
                return msx1.a(msx1.b(f1));
            }
            j++;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(int j)
    {
        f.clear();
        int k = (int)Math.ceil((float)j / (float)a);
        for (j = 0; j < k + 1; j++)
        {
            a(d.a(a, a));
        }

    }

    public irp a(float f1)
    {
        float f2;
        float f3;
        Bitmap bitmap;
        Object obj;
        Object obj1;
        msx msx1;
        int j;
        f3 = f1 + (float)a;
        f2 = (f3 - f1) / 2.0F;
        float f4;
        msx amsx[];
        int k;
        if (f.isEmpty())
        {
            if (Log.isLoggable("StorylineDrawer", 5))
            {
                Log.w("StorylineDrawer", "Oops, no bitmaps in the recycle bin.");
            }
            bitmap = d.a(a, a);
        } else
        {
            bitmap = (Bitmap)f.remove(0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            bitmap.setHasAlpha(true);
        }
        amsx = g;
        obj = new ArrayList();
        k = amsx.length;
        j = 0;
_L9:
        if (j >= k) goto _L2; else goto _L1
_L1:
        obj1 = amsx[j];
        msx1 = ((msx) (obj1)).a();
        if (((msx) (obj1)).g <= f1) goto _L4; else goto _L3
_L3:
        if (((msx) (obj1)).a >= f1 || ((msx) (obj1)).g < f3) goto _L6; else goto _L5
_L5:
        f3 = ((msx) (obj1)).b(f1);
        f4 = ((msx) (obj1)).b(f1);
        msx1.d(f3);
        msx1.c((f4 - f3) / (1.0F - f3));
        ((List) (obj)).add(msx1);
_L2:
        amsx = (msx[])((List) (obj)).toArray(new msx[((List) (obj)).size()]);
        f2 = a(amsx, f1 + f2) - (float)(a / 2);
        StoryLayout.d(h).reset();
        k = amsx.length;
        for (j = 0; j < k; j++)
        {
            obj = amsx[j];
            obj1 = StoryLayout.d(h);
            ((Path) (obj1)).moveTo(((msx) (obj)).a - f1, ((msx) (obj)).b - f2);
            ((Path) (obj1)).cubicTo(((msx) (obj)).c - f1, ((msx) (obj)).d - f2, ((msx) (obj)).e - f1, ((msx) (obj)).f - f2, ((msx) (obj)).g - f1, ((msx) (obj)).h - f2);
        }

        break; /* Loop/switch isn't completed */
_L6:
        if (((msx) (obj1)).a < f1 && ((msx) (obj1)).g <= f3)
        {
            msx1.d(((msx) (obj1)).b(f1));
            ((List) (obj)).add(msx1);
        } else
        if (((msx) (obj1)).a >= f1 && ((msx) (obj1)).g <= f3)
        {
            ((List) (obj)).add(msx1);
        } else
        {
            if (((msx) (obj1)).a >= f3 || ((msx) (obj1)).g < f3)
            {
                continue;
            }
            msx1.c(((msx) (obj1)).b(f3));
            ((List) (obj)).add(msx1);
            break;
        }
_L4:
        do
        {
            j++;
            continue; /* Loop/switch isn't completed */
        } while (((msx) (obj1)).a < f3);
        if (true) goto _L2; else goto _L7
_L7:
        i.setBitmap(bitmap);
        i.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        i.drawPath(StoryLayout.d(h), StoryLayout.e(h));
        return new irp(this, bitmap, f2);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(Bitmap bitmap)
    {
        f.add(bitmap);
    }
}
