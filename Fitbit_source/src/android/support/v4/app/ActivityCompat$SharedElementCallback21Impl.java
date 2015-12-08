// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            ActivityCompat, SharedElementCallback

private static class mCallback extends mCallback
{

    private SharedElementCallback mCallback;

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
    {
        return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable)
    {
        return mCallback.onCreateSnapshotView(context, parcelable);
    }

    public void onMapSharedElements(List list, Map map)
    {
        mCallback.onMapSharedElements(list, map);
    }

    public void onRejectSharedElements(List list)
    {
        mCallback.onRejectSharedElements(list);
    }

    public void onSharedElementEnd(List list, List list1, List list2)
    {
        mCallback.onSharedElementEnd(list, list1, list2);
    }

    public void onSharedElementStart(List list, List list1, List list2)
    {
        mCallback.onSharedElementStart(list, list1, list2);
    }

    public (SharedElementCallback sharedelementcallback)
    {
        mCallback = sharedelementcallback;
    }
}
