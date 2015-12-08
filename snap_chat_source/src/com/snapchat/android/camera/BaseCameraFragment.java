// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import Cf;
import IK;
import Ik;
import LA;
import Ll;
import OQ;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.looksery.core.LSSoundManager;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.camera.cameradecor.CameraDecor;
import com.snapchat.android.camera.cameraview.CameraView;
import com.snapchat.android.camera.lenses.LensesGlTextureView;
import com.snapchat.android.camera.model.CameraModel;
import com.snapchat.android.util.fragment.SnapchatFragment;
import fQ;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import qF;
import qP;
import qQ;
import qT;
import qU;
import qV;
import qW;
import qZ;
import qv;
import rQ;
import rR;
import rS;
import rT;
import rm;
import rq;

public abstract class BaseCameraFragment extends SnapchatFragment
    implements qF, qP.a, qT
{
