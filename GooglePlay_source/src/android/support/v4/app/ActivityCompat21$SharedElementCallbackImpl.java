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

// Referenced classes of package android.support.v4.app:
//            ActivityCompat21

private static final class mCallback extends SharedElementCallback
{

    private SharedElementStart._cls70d861b8 mCallback;

    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
    {
        return mCallback.CaptureSharedElementSnapshot(view, matrix, rectf);
    }

    public final View onCreateSnapshotView(Context context, Parcelable parcelable)
    {
        return mCallback.CreateSnapshotView(context, parcelable);
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
        mCallback._mth70d861b8(list);
    }

    public ( )
    {
        mCallback = ;
    }
}
