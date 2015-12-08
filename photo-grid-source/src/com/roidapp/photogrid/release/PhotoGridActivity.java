// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.a.ac;
import com.google.a.u;
import com.google.a.x;
import com.google.a.z;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.j;
import com.roidapp.cloudlib.template.m;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.s;
import com.roidapp.imagelib.filter.y;
import com.roidapp.imagelib.retouch.l;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.b.g;
import com.roidapp.photogrid.b.k;
import com.roidapp.photogrid.cloud.BaseShareActivity;
import com.roidapp.photogrid.cloud.DropBoxSelectorActivity;
import com.roidapp.photogrid.cloud.FbPhotoSelectorActivity;
import com.roidapp.photogrid.cloud.FlickrSelectorActivity;
import com.roidapp.photogrid.cloud.GoogleSearchSelectorActivity;
import com.roidapp.photogrid.cloud.InstagramSelectorActivity;
import com.roidapp.photogrid.cloud.TemplateChangeActivity;
import com.roidapp.photogrid.cloud.TemplateSelectorActivity;
import com.roidapp.photogrid.cloud.bf;
import com.roidapp.photogrid.cloud.br;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.ap;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bc;
import com.roidapp.photogrid.common.be;
import com.roidapp.photogrid.common.bp;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.filter.ImageEditGLESActivity;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageShowActivity;
import com.roidapp.photogrid.video.VideoPictureEditActivity;
import com.roidapp.videolib.a.a;
import com.roidapp.videolib.core.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.UUID;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, lo, lr, mp, 
//            ok, ml, az, ih, 
//            ig, FaceDetectorActivity, hk, oi, 
//            rf, PhotoView, ri, mm, 
//            hw, oo, pd, ou, 
//            pa, ox, or, ol, 
//            pi, pg, ng, ln, 
//      