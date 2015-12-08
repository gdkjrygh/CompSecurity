// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            VideoEngineException

public class Dictionary
{

    private long mNativeContext;

    private Dictionary(long l)
    {
        mNativeContext = l;
        nativeCreateDictionary(l);
    }

    private native void nativeCreateDictionary(long l);

    private native void nativeFinalize();

    private native byte[] nativeGetByteArrayByKey(String s)
        throws VideoEngineException;

    private native int nativeGetCount()
        throws VideoEngineException;

    private native String nativeGetKeyByIndex(int i)
        throws VideoEngineException;

    private native String nativeGetValueByKey(String s)
        throws VideoEngineException;

    private native void nativeRelease();

    protected void finalize()
    {
        nativeFinalize();
    }

    public byte[] getByteArrayByKey(String s)
        throws VideoEngineException
    {
        return nativeGetByteArrayByKey(s);
    }

    public int getCount()
        throws VideoEngineException
    {
        return nativeGetCount();
    }

    public String getKeyByIndex(int i)
        throws VideoEngineException
    {
        return nativeGetKeyByIndex(i);
    }

    public String getValueByKey(String s)
        throws VideoEngineException
    {
        return nativeGetValueByKey(s);
    }

    public void release()
        throws VideoEngineException
    {
        nativeRelease();
    }
}
