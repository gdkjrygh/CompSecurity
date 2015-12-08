// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.snapchat.android.util.SnapMediaUtils;

public class JE extends AsyncTask
{

    private final android.graphics.Bitmap.Config mConfig;
    private final int mHeight;
    private final int mWidth;

    public JE(int i, int j, android.graphics.Bitmap.Config config)
    {
        mWidth = i;
        mHeight = j;
        mConfig = config;
    }

    protected Object doInBackground(Object aobj[])
    {
        return SnapMediaUtils.a(mWidth, mHeight, mConfig);
    }
}
