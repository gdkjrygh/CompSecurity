// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.SparseArray;
import com.google.android.gms.games.ui.video.CameraUtils;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoUtils;

public final class VideoCapabilities
{

    public final boolean mCaptureModes[] = new boolean[2];
    private Context mContext;
    public boolean mIsCameraSupported;
    public boolean mIsMicSupported;
    public boolean mIsWriteSupported;
    public final boolean mQualityLevels[] = new boolean[4];

    public VideoCapabilities(Context context)
    {
        mContext = context;
        refresh();
    }

    private static boolean hasPermission(Context context, PackageManager packagemanager, String s)
    {
        return packagemanager.checkPermission(s, context.getPackageName()) == 0;
    }

    public final void refresh()
    {
        Object obj = mContext.getPackageManager();
        int i;
        boolean flag;
        if (((PackageManager) (obj)).hasSystemFeature("android.hardware.microphone") && hasPermission(mContext, ((PackageManager) (obj)), "android.permission.RECORD_AUDIO"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsMicSupported = flag;
        if (((PackageManager) (obj)).hasSystemFeature("android.hardware.camera.front") && hasPermission(mContext, ((PackageManager) (obj)), "android.permission.CAMERA"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsCameraSupported = flag;
        if ("mounted".equals(Environment.getExternalStorageState()) && hasPermission(mContext, ((PackageManager) (obj)), "android.permission.READ_EXTERNAL_STORAGE") && hasPermission(mContext, ((PackageManager) (obj)), "android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsWriteSupported = flag;
        if (mIsCameraSupported && CameraUtils.getFrontFacingCameraId(mContext) == null)
        {
            mIsCameraSupported = false;
        }
        mCaptureModes[0] = VideoUtils.isVideoRecordingEnabled(mContext);
        mCaptureModes[1] = VideoUtils.isStreamRecordingEnabled(mContext);
        obj = VideoEncodingProfiles.getInstance(mContext);
        i = 0;
        while (i <= 3) 
        {
            boolean aflag[] = mQualityLevels;
            if (((VideoEncodingProfiles) (obj)).mVideoParams.get(i) != null && ((VideoEncodingProfiles) (obj)).mAudioParams != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[i] = flag;
            i++;
        }
    }
}
