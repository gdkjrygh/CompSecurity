// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.views.CameraPreview;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.f;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseGalleryActivity, ExerciseStatsView

public class ShareExerciseCameraActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{

    private static final String a = "ShareExerciseCameraActivity";
    private static final String b = "uuid";
    private static final String c = "tmpImage";
    private static final int d = 3;
    private int e;
    private int f;
    private int g;
    private String h;
    private Camera i;
    private UUID j;
    private ToggleButton k;
    private ImageButton l;
    private CameraPreview m;
    private ExerciseStatsView n;

    public ShareExerciseCameraActivity()
    {
        h = "off";
    }

    public static Intent a(Context context, ActivityLogEntry activitylogentry)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/ShareExerciseCameraActivity);
        context.putExtra("uuid", new ParcelUuid(activitylogentry.getUuid()));
        return context;
    }

    static CameraPreview a(ShareExerciseCameraActivity shareexercisecameraactivity)
    {
        return shareexercisecameraactivity.m;
    }

    private void a(int i1, Camera camera)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (parameters.getFlashMode() == null || d(i1) == 1)
        {
            k.setVisibility(8);
            return;
        } else
        {
            parameters.setFlashMode(h);
            camera.setParameters(parameters);
            k.setVisibility(0);
            k.setChecked(h.equals("on"));
            return;
        }
    }

    private void a(Activity activity, int i1, Camera camera)
    {
        activity = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i1, activity);
        if (((android.hardware.Camera.CameraInfo) (activity)).facing == 1)
        {
            i1 = (360 - ((android.hardware.Camera.CameraInfo) (activity)).orientation % 360) % 360;
        } else
        {
            i1 = (((android.hardware.Camera.CameraInfo) (activity)).orientation + 360) % 360;
        }
        camera.setDisplayOrientation(i1);
    }

    static int b(ShareExerciseCameraActivity shareexercisecameraactivity)
    {
        return shareexercisecameraactivity.g;
    }

    private boolean b(int i1)
    {
        boolean flag = false;
        Camera camera;
        try
        {
            k();
            i = Camera.open(i1);
            camera = i;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.f("ShareExerciseCameraActivity", exception);
            return false;
        }
        if (camera != null)
        {
            flag = true;
        }
        return flag;
    }

    static UUID c(ShareExerciseCameraActivity shareexercisecameraactivity)
    {
        return shareexercisecameraactivity.j;
    }

    private void c(int i1)
    {
        if (d(i1) == 0)
        {
            l.setImageResource(0x7f02025a);
            return;
        } else
        {
            l.setImageResource(0x7f020259);
            return;
        }
    }

    private int d(int i1)
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i1, camerainfo);
        return camerainfo.facing;
    }

    private void f()
    {
        if (!h.equals("off")) goto _L2; else goto _L1
_L1:
        h = "on";
_L4:
        a(g, i);
        return;
_L2:
        if (h.equals("on"))
        {
            h = "off";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void g()
    {
        startActivityForResult(com.fitbit.runtrack.ui.ShareExerciseGalleryActivity.a(this, j), 0);
    }

    private void h()
    {
        i.takePicture(null, null, new android.hardware.Camera.PictureCallback() {

            final ShareExerciseCameraActivity a;

            public void onPictureTaken(byte abyte0[], Camera camera)
            {
                abyte0 = com.fitbit.runtrack.ui.ShareExerciseCameraActivity.a(a).getBitmap();
                camera = ProgressDialogFragment.b(0x7f080392, 0x7f080392, null);
                camera.show(a.getSupportFragmentManager(), null);
            /* block-local class not found */
            class _cls1 {}

                com.fitbit.util.f.a(new _cls1(null, abyte0, camera));
            }

            
            {
                a = ShareExerciseCameraActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        l.setEnabled(false);
        g = g + 1;
        g = g % f;
        j();
        l.setEnabled(true);
    }

    private void j()
    {
        if (b(g))
        {
            m.a(i);
            a(this, g, i);
            a(g, i);
            c(g);
            return;
        }
        int i1 = e;
        e = i1 + 1;
        if (i1 < 3)
        {
            j();
            return;
        } else
        {
            com.fitbit.e.a.f("ShareExerciseCameraActivity", "Cannot open camera", new Object[0]);
            finish();
            return;
        }
    }

    private void k()
    {
        if (m != null)
        {
            m.a(null);
        }
        if (i != null)
        {
            i.release();
            i = null;
        }
    }

    public void a(Loader loader, ActivityLogEntry activitylogentry)
    {
        n.a(activitylogentry);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1)
        {
            finish();
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131820979: 
            i();
            return;

        case 2131820978: 
            h();
            return;

        case 2131820977: 
            g();
            return;

        case 2131820976: 
            f();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040049);
        f = Camera.getNumberOfCameras();
        g = 0;
        for (int i1 = 1; i1 < f; i1++)
        {
            if (d(i1) == 1)
            {
                g = i1;
            }
        }

        e = 0;
        j = ((ParcelUuid)getIntent().getParcelableExtra("uuid")).getUuid();
        m = (CameraPreview)findViewById(0x7f1101af);
        n = (ExerciseStatsView)findViewById(0x7f1101ad);
        l = (ImageButton)findViewById(0x7f1101b3);
        if (Camera.getNumberOfCameras() > 1)
        {
            l.setOnClickListener(this);
        } else
        {
            l.setVisibility(4);
        }
        findViewById(0x7f1101b2).setOnClickListener(this);
        ((ImageButton)findViewById(0x7f1101b1)).setOnClickListener(this);
        k = (ToggleButton)findViewById(0x7f1101b0);
        k.setOnClickListener(this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        if (i1 == 20)
        {
            return new com.fitbit.runtrack.a(this, j);
        } else
        {
            return null;
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        super.onPause();
        k();
    }

    protected void onResume()
    {
        super.onResume();
        getSupportLoaderManager().initLoader(20, null, this);
        j();
    }
}
