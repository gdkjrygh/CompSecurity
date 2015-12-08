// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


final class OpReorderer
{
    static interface Callback
    {

        public abstract AdapterHelper.UpdateOp obtainUpdateOp(int i, int j, int k);

        public abstract void recycleUpdateOp(AdapterHelper.UpdateOp updateop);
    }


    final Callback mCallback;

    public OpReorderer(Callback callback)
    {
        mCallback = callback;
    }
}
