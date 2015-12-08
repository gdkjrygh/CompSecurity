// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.ImageButton;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.c;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseStatsView, ShareExerciseSharingEvent

public class ShareExerciseActivity extends FitbitActivity
    implements android.view.View.OnClickListener
{

    private static final String a = "ShareExerciseActivity";
    private static final String b = "filename";
    private static final String c = "uuid";
    private static final String d = "source";
    private String e;
    private UUID f;
    private ShareExerciseSharingEvent.Source g;
    private ActivityLogEntry h;
    private SubsamplingScaleImageView i;
    private ExerciseStatsView j;
    private android.support.v4.app.LoaderManager.LoaderCallbacks k;

    public ShareExerciseActivity()
    {
        k = new android.support.v4.app.LoaderManager.LoaderCallbacks() {

            final ShareExerciseActivity a;

            public void a(Loader loader, ActivityLogEntry activitylogentry)
            {
                com.fitbit.runtrack.ui.ShareExerciseActivity.a(a, activitylogentry);
                com.fitbit.runtrack.ui.ShareExerciseActivity.c(a).a(activitylogentry);
            }

            public Loader onCreateLoader(int l, Bundle bundle)
            {
                return new com.fitbit.runtrack.a(a, ShareExerciseActivity.b(a));
            }

            public void onLoadFinished(Loader loader, Object obj)
            {
                a(loader, (ActivityLogEntry)obj);
            }

            public void onLoaderReset(Loader loader)
            {
            }

            
            {
                a = ShareExerciseActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, UUID uuid, String s, ShareExerciseSharingEvent.Source source)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/ShareExerciseActivity);
        context.putExtra("filename", s);
        context.putExtra("uuid", new ParcelUuid(uuid));
        context.putExtra("source", source.a());
        return context;
    }

    static SubsamplingScaleImageView a(ShareExerciseActivity shareexerciseactivity)
    {
        return shareexerciseactivity.i;
    }

    static ActivityLogEntry a(ShareExerciseActivity shareexerciseactivity, ActivityLogEntry activitylogentry)
    {
        shareexerciseactivity.h = activitylogentry;
        return activitylogentry;
    }

    private void a(Bitmap bitmap)
    {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        j.setDrawingCacheEnabled(true);
        j.buildDrawingCache();
        Bitmap bitmap1 = j.getDrawingCache();
        canvas.drawBitmap(bitmap1, 0.0F, bitmap.getHeight() - bitmap1.getHeight(), null);
    }

    static void a(ShareExerciseActivity shareexerciseactivity, Bitmap bitmap)
    {
        shareexerciseactivity.a(bitmap);
    }

    static UUID b(ShareExerciseActivity shareexerciseactivity)
    {
        return shareexerciseactivity.f;
    }

    static ExerciseStatsView c(ShareExerciseActivity shareexerciseactivity)
    {
        return shareexerciseactivity.j;
    }

    public void e()
    {
        ProgressDialogFragment progressdialogfragment = ProgressDialogFragment.b(0x7f080392, 0x7f080392, null);
        progressdialogfragment.show(getSupportFragmentManager(), null);
        com.fitbit.util.f.a(new com.fitbit.util.f.a(null, progressdialogfragment) {

            final DialogFragment a;
            final ShareExerciseActivity b;
            private Uri c;

            public void a(Object obj)
            {
                b((Void)obj);
            }

            public void a(Void void1)
            {
                void1 = com.fitbit.runtrack.ui.ShareExerciseActivity.a(b).getBackground();
                if (!(void1 instanceof BitmapDrawable))
                {
                    break MISSING_BLOCK_LABEL_173;
                }
                void1 = ((BitmapDrawable)void1).getBitmap();
_L1:
                void1 = void1.copy(void1.getConfig(), true);
                com.fitbit.runtrack.ui.ShareExerciseActivity.a(b, void1);
                File file = b.getExternalFilesDir(b.getString(0x7f080059));
                if (!file.mkdirs())
                {
                    com.fitbit.e.a.f("ShareExerciseActivity", "Directory[%s] not created", new Object[] {
                        file
                    });
                }
                file = new File(file, (new StringBuilder()).append("IMG_").append(System.currentTimeMillis()).append(".png").toString());
                void1.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file));
                void1 = new ContentValues();
                void1.put("_data", file.getAbsolutePath());
                c = b.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, void1);
                return;
                try
                {
                    void1 = Bitmap.createBitmap(com.fitbit.runtrack.ui.ShareExerciseActivity.a(b).getWidth(), com.fitbit.runtrack.ui.ShareExerciseActivity.a(b).getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(void1);
                    com.fitbit.runtrack.ui.ShareExerciseActivity.a(b).draw(canvas);
                }
                // Misplaced declaration of an exception variable
                catch (Void void1)
                {
                    com.fitbit.e.a.f("ShareExerciseActivity", void1);
                    return;
                }
                  goto _L1
            }

            public void b(Object obj)
            {
                a((Void)obj);
            }

            public void b(Void void1)
            {
                a.dismiss();
                void1 = new Intent("android.intent.action.SEND");
                void1.setType("image/png");
                void1.putExtra("android.intent.extra.STREAM", c);
                b.startActivityForResult(Intent.createChooser(void1, "Send options"), 0);
            }

            
            {
                b = ShareExerciseActivity.this;
                a = dialogfragment;
                super(void1);
            }
        });
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        setResult(-1);
        finish();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131820974: 
            (new ShareExerciseSharingEvent()).a(h).a(g).f();
            break;
        }
        e();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040048);
        f = ((ParcelUuid)getIntent().getParcelableExtra("uuid")).getUuid();
        e = getIntent().getStringExtra("filename");
        g = com.fitbit.runtrack.ui.ShareExerciseSharingEvent.Source.a(getIntent().getStringExtra("source"));
        i = (SubsamplingScaleImageView)findViewById(0x7f1100c4);
        i.c(2);
        i.a(com.davemorrissey.labs.subscaleview.c.b(e));
        j = (ExerciseStatsView)findViewById(0x7f1101ad);
        ((ImageButton)findViewById(0x7f1101ae)).setOnClickListener(this);
    }

    protected void onResume()
    {
        super.onResume();
        getSupportLoaderManager().initLoader(0, null, k);
    }
}
