// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.arist.activity.base.BaseActivity;
import com.arist.c.f;
import com.arist.model.scan.MediaScanService;
import com.arist.model.scan.MusicScanProgressView;
import com.arist.model.scan.d;
import com.arist.model.skin.ColorCheckBox;
import com.arist.model.skin.ColorProgressBar;
import com.arist.model.skin.ColorTextView;

// Referenced classes of package com.arist.activity:
//            ak, al, MyApplication

public class ScanMusicActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener, d
{

    private ColorTextView a;
    private TextView b;
    private MusicScanProgressView c;
    private ColorCheckBox d;
    private ColorProgressBar e;
    private boolean g;

    public ScanMusicActivity()
    {
    }

    static void a(ScanMusicActivity scanmusicactivity)
    {
        scanmusicactivity.g = false;
    }

    private void b()
    {
        g = true;
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(0x7f09006f).setPositiveButton(0x7f09004b, new ak(this)).setNegativeButton(0x7f09004a, null).create();
        alertdialog.setOnDismissListener(new al(this));
        alertdialog.show();
    }

    public final void a()
    {
        MediaScanService.b(getApplicationContext());
        finish();
    }

    public final void a(int i, Object obj)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            c.b();
            e.setVisibility(4);
            b.setText("");
            a.setText(0x7f09006d);
            return;

        case 1: // '\001'
            c.a();
            e.setVisibility(4);
            if (obj != null)
            {
                b.setText(obj.toString());
            }
            a.setText(0x7f090105);
            return;

        case 2: // '\002'
            c.c();
            e.setVisibility(0);
            if (obj != null)
            {
                e.a((float)((Integer)obj).intValue() / 100F);
                b.setText((new StringBuilder(String.valueOf(getString(0x7f090107)))).append(obj.toString()).append("%").toString());
            } else
            {
                b.setText("");
            }
            e.setVisibility(0);
            return;

        case 3: // '\003'
            c.c();
            e.setVisibility(4);
            b.setText(0x7f090108);
            a.setText(0x7f090105);
            return;

        case 4: // '\004'
            c.c();
            e.setVisibility(4);
            break;
        }
        if (obj != null)
        {
            b.setText(getString(0x7f09009d, new Object[] {
                obj.toString()
            }));
        } else
        {
            b.setText("");
        }
        a.setText(0x7f09006b);
    }

    public void handleBackClicked(View view)
    {
        onBackPressed();
    }

    public void onBackPressed()
    {
        if (MediaScanService.b())
        {
            b();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        MyApplication.e.a(flag);
    }

    public void onClick(View view)
    {
        switch (MediaScanService.a())
        {
        default:
            MediaScanService.b(getApplicationContext());
            return;

        case 0: // '\0'
            MediaScanService.a(getApplicationContext());
            return;

        case 4: // '\004'
            onBackPressed();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030006);
        if (bundle == null)
        {
            MediaScanService.c();
        } else
        {
            g = bundle.getBoolean("showExitDialog", false);
        }
        b = (TextView)findViewById(0x7f06003f);
        a = (ColorTextView)findViewById(0x7f06003e);
        c = (MusicScanProgressView)findViewById(0x7f06003d);
        e = (ColorProgressBar)findViewById(0x7f060040);
        e.setVisibility(4);
        d = (ColorCheckBox)findViewById(0x7f060041);
        d.a(MyApplication.e.l());
        d.a(this);
        a.setOnClickListener(this);
        a.a();
        MediaScanService.a(this);
        a(MediaScanService.a(), null);
        if (g)
        {
            b();
        }
    }

    protected void onDestroy()
    {
        MediaScanService.b(this);
        super.onDestroy();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("showExitDialog", g);
    }
}
