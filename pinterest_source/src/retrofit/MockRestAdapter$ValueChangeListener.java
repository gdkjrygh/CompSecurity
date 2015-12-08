// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


public interface _cls1
{

    public static final _cls1 EMPTY = new _cls1();

    public abstract void onMockValuesChanged(long l, int i, int j);


    class _cls1
        implements MockRestAdapter.ValueChangeListener
    {

        public final void onMockValuesChanged(long l, int i, int j)
        {
        }

            _cls1()
            {
            }
    }

}
