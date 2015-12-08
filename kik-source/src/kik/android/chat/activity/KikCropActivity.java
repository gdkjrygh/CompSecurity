// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kik.android.util.e;
import kik.android.widget.KikCropView;

// Referenced classes of package kik.android.chat.activity:
//            KikActivityBase, ac, ad, ae, 
//            af, ag

public class KikCropActivity extends KikActivityBase
{

    private KikCropView a;
    private boolean e;
    private File f;
    private File g;

    public KikCropActivity()
    {
        e = false;
    }

    static void a(KikCropActivity kikcropactivity)
    {
        if (!kikcropactivity.e) goto _L2; else goto _L1
_L1:
        kikcropactivity.finish();
_L4:
        return;
_L2:
        Bitmap bitmap;
        kikcropactivity.e = true;
        bitmap = kikcropactivity.a.d();
        if (bitmap == null)
        {
            Toast.makeText(kikcropactivity, 0x7f090134, 1).show();
            return;
        }
        FileOutputStream fileoutputstream1 = new FileOutputStream(kikcropactivity.g);
        FileOutputStream fileoutputstream = fileoutputstream1;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, fileoutputstream1);
        fileoutputstream = fileoutputstream1;
        kikcropactivity.setResult(-1);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        fileoutputstream = fileoutputstream1;
        bitmap.recycle();
        fileoutputstream = fileoutputstream1;
        kikcropactivity.finish();
        try
        {
            fileoutputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (KikCropActivity kikcropactivity)
        {
            kikcropactivity.printStackTrace();
        }
        return;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        fileoutputstream1 = null;
_L7:
        fileoutputstream = fileoutputstream1;
        filenotfoundexception.printStackTrace();
        fileoutputstream = fileoutputstream1;
        Toast.makeText(kikcropactivity, 0x7f090134, 1).show();
        if (fileoutputstream1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            fileoutputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (KikCropActivity kikcropactivity)
        {
            kikcropactivity.printStackTrace();
        }
        return;
        kikcropactivity;
        fileoutputstream = null;
_L6:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw kikcropactivity;
        kikcropactivity;
        if (true) goto _L6; else goto _L5
_L5:
        filenotfoundexception;
          goto _L7
    }

    static KikCropView b(KikCropActivity kikcropactivity)
    {
        return kikcropactivity.a;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000b);
        f = kik.android.util.e.a(kik.android.util.e.a(getIntent()), this);
        g = new File(((Uri)getIntent().getParcelableExtra("output")).getPath());
        a = (KikCropView)findViewById(0x7f0e005b);
        if (f == null)
        {
            Toast.makeText(this, getString(0x7f090062), 1).show();
            finish();
        } else
        {
            a.a(f.getPath());
            if (!a.a())
            {
                Toast.makeText(this, getString(0x7f090062), 1).show();
                finish();
                return;
            }
            ((Button)findViewById(0x7f0e005a)).setOnClickListener(new ac(this));
            ((Button)findViewById(0x7f0e0013)).setOnClickListener(new ad(this));
            findViewById(0x7f0e0057).setOnClickListener(new ae(this));
            findViewById(0x7f0e0058).setOnClickListener(new af(this));
            bundle = findViewById(0x7f0e001d);
            if (bundle != null)
            {
                bundle.setOnClickListener(new ag(this));
            }
            bundle = (TextView)findViewById(0x7f0e0078);
            if (bundle != null)
            {
                bundle.setText(0x7f09022b);
                return;
            }
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a.e();
    }
}
