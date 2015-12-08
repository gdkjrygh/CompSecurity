// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

final class android.support.v4.app.b
{
    public static abstract class a
    {

        public abstract Parcelable a(View view, Matrix matrix, RectF rectf);

        public abstract View a(Context context, Parcelable parcelable);

        public a()
        {
        }
    }

    private static final class b extends SharedElementCallback
    {

        private a a;

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
        {
            return a.a(view, matrix, rectf);
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable)
        {
            return a.a(context, parcelable);
        }

        public final void onMapSharedElements(List list, Map map)
        {
        }

        public final void onRejectSharedElements(List list)
        {
        }

        public final void onSharedElementEnd(List list, List list1, List list2)
        {
        }

        public final void onSharedElementStart(List list, List list1, List list2)
        {
        }

        public b(a a1)
        {
            a = a1;
        }
    }


    static SharedElementCallback a(a a1)
    {
        b b1 = null;
        if (a1 != null)
        {
            b1 = new b(a1);
        }
        return b1;
    }
}
