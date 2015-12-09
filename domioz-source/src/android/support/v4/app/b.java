// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            d, ct

final class b extends d
{

    private ct a;

    public b(ct ct1)
    {
        a = ct1;
    }

    public final Parcelable a(View view, Matrix matrix, RectF rectf)
    {
        return a.a(view, matrix, rectf);
    }

    public final View a(Context context, Parcelable parcelable)
    {
        return ct.a(context, parcelable);
    }
}
