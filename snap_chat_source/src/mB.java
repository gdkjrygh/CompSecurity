// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mB
{

    private static final mB INSTANCE = new mB();
    private static final String TAG = "ScreenParameterProvider";
    private static final int UNINITIALIZED_DIMENSION = -1;
    public int mDisplayMetricsHeight;
    public int mDisplayMetricsWidth;
    public int mMaxVideoHeight;
    public int mMaxVideoWidth;
    public IK mResolution;
    public float mScreenFullHeightIn;
    public int mScreenFullHeightPx;
    public float mScreenFullWidthIn;
    public int mScreenFullWidthPx;

    protected mB()
    {
        mResolution = new IK(0, 0);
        mScreenFullWidthPx = -1;
        mScreenFullHeightPx = -1;
    }

    public static mB a()
    {
        return INSTANCE;
    }

}
