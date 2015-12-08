// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.login.FbLoginActivity;
import com.cardinalblue.android.piccollage.activities.login.TwitterLoginActivity;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.auth.a.e;
import com.cardinalblue.android.piccollage.controller.a.n;
import com.cardinalblue.android.piccollage.controller.a.o;
import com.cardinalblue.android.piccollage.controller.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.a.a.a;
import net.a.a.c;
import org.apache.http.NameValuePair;
import twitter4j.auth.AccessToken;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity, KddiShareActivity

public abstract class BaseShareActivity extends AbsDrawerActivity
    implements com.cardinalblue.android.piccollage.controller.r.b
{

    protected c e;
    protected ImageButton f;
    protected AsyncTask g;
    protected String h;
    private boolean i;
    private ClipboardManager j;

    public BaseShareActivity()
    {
        e = null;
    }

    private void a(int l)
    {
        EditText edittext = new EditText(this);
        edittext.setInputType(0x20000);
        edittext.setSingleLine(false);
        h = s();
        if (!TextUtils.isEmpty(h))
        {
            edittext.setText(h);
        }
        Object obj = new android.app.AlertDialog.Builder(this);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(getString(0x7f0702c5));
        ((android.app.AlertDialog.Builder) (obj)).setView(edittext);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getString(0x7f07025c), new android.content.DialogInterface.OnClickListener() {

            final BaseShareActivity a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                com.cardinalblue.android.piccollage.activities.BaseShareActivity.a(a, true);
            }

            
            {
                a = BaseShareActivity.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final BaseShareActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                com.cardinalblue.android.piccollage.activities.BaseShareActivity.a(a, false);
            }

            
            {
                a = BaseShareActivity.this;
                super();
            }
        });
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(edittext, l) {

            final EditText a;
            final int b;
            final BaseShareActivity c;

            public void onDismiss(DialogInterface dialoginterface)
            {
                c.h = a.getText().toString();
                if (!com.cardinalblue.android.piccollage.activities.BaseShareActivity.a(c)) goto _L2; else goto _L1
_L1:
                b;
                JVM INSTR lookupswitch 4: default 72
            //                           1: 89
            //                           6: 81
            //                           9: 73
            //                           12: 97;
                   goto _L2 _L3 _L4 _L5 _L6
_L2:
                return;
_L5:
                com.cardinalblue.android.piccollage.activities.BaseShareActivity.b(c);
                return;
_L4:
                com.cardinalblue.android.piccollage.activities.BaseShareActivity.c(c);
                return;
_L3:
                BaseShareActivity.d(c);
                return;
_L6:
                com.cardinalblue.android.piccollage.activities.BaseShareActivity.e(c);
                return;
            }

            
            {
                c = BaseShareActivity.this;
                a = edittext;
                b = l;
                super();
            }
        });
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).getWindow().setSoftInputMode(5);
        ((AlertDialog) (obj)).show();
    }

    private void a(AsyncTask asynctask)
    {
        if (g != null && g != asynctask)
        {
            g.cancel(false);
        }
        g = asynctask;
    }

    private void a(Bundle bundle)
    {
        a((new o(this)).a(new Bundle[] {
            bundle
        }));
    }

    static boolean a(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.i;
    }

    static boolean a(BaseShareActivity baseshareactivity, boolean flag)
    {
        baseshareactivity.i = flag;
        return flag;
    }

    static void b(BaseShareActivity baseshareactivity)
    {
        baseshareactivity.v();
    }

    static void c(BaseShareActivity baseshareactivity)
    {
        baseshareactivity.w();
    }

    static void d(BaseShareActivity baseshareactivity)
    {
        baseshareactivity.x();
    }

    static void e(BaseShareActivity baseshareactivity)
    {
        baseshareactivity.y();
    }

    private void v()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("key_pic_login_purpose", PicLoginActivity.d);
        intent.putExtra("key_pic_login_caption", h);
        intent.putExtra("from", "sharing");
        startActivityForResult(intent, 113);
    }

    private void w()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/login/FbLoginActivity);
        intent.putExtra("caption", h);
        startActivityForResult(intent, 112);
    }

    private void x()
    {
        (new r(this, this)).e();
    }

    private void y()
    {
        Object obj = new e();
        if (!((e) (obj)).a(this))
        {
            ((e) (obj)).a(this, 115, "");
            return;
        }
        obj = (new e()).b();
        Bundle bundle = new Bundle();
        for (int l = 0; l < ((List) (obj)).size(); l++)
        {
            bundle.putString(((NameValuePair)((List) (obj)).get(l)).getName(), ((NameValuePair)((List) (obj)).get(l)).getValue());
            bundle.putString("caption", h);
        }

        a(bundle);
    }

    protected abstract net.a.a.c.a a(ArrayList arraylist);

    protected void a(int l, ArrayList arraylist, int i1)
    {
        l;
        JVM INSTR tableswitch 1 12: default 64
    //                   1 105
    //                   2 185
    //                   3 126
    //                   4 172
    //                   5 155
    //                   6 94
    //                   7 214
    //                   8 239
    //                   9 83
    //                   10 64
    //                   11 264
    //                   12 115;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L11 _L12
_L1:
        arraylist = null;
_L13:
        if (arraylist != null)
        {
            a(arraylist.a(new Void[0]));
        }
        return;
_L10:
        a(9);
        arraylist = null;
          goto _L13
_L7:
        a(6);
        arraylist = null;
          goto _L13
_L2:
        a(1);
        arraylist = null;
          goto _L13
_L12:
        a(12);
        arraylist = null;
          goto _L13
_L4:
        arraylist = new n(this, l, (ActivityInfo)arraylist.get(i1), s(), t());
          goto _L13
_L6:
        arraylist = new n(this, l, t());
          goto _L13
_L5:
        arraylist = new n(this, l);
          goto _L13
_L3:
        arraylist = new Intent();
        arraylist.setClass(this, com/cardinalblue/android/piccollage/activities/KddiShareActivity);
        a(((Intent) (arraylist)), 110);
        arraylist = null;
          goto _L13
_L8:
        arraylist = new n(this, l, (ActivityInfo)arraylist.get(i1), t());
          goto _L13
_L9:
        arraylist = new n(this, l, (ActivityInfo)arraylist.get(i1), t());
          goto _L13
_L11:
        Object obj;
        if (j == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist = t();
        obj = ClipData.newPlainText(null, arraylist);
        j.setPrimaryClip(((ClipData) (obj)));
        k.a(this, 0x7f07011d, 0);
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setType("text/plain");
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", arraylist);
        startActivity(Intent.createChooser(((Intent) (obj)), null));
        arraylist = null;
          goto _L13
        arraylist;
        com.cardinalblue.android.piccollage.a.f.a(arraylist);
        if (true) goto _L1; else goto _L14
_L14:
    }

    protected void a(Intent intent, int l)
    {
        try
        {
            startActivityForResult(intent, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            k.a(this, 0x7f0701e1, 0);
        }
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof com.cardinalblue.android.piccollage.controller.network.f.g)) goto _L2; else goto _L1
_L1:
        throwable = (com.cardinalblue.android.piccollage.controller.network.f.g)throwable;
        if (!throwable.a()) goto _L4; else goto _L3
_L3:
        throwable.b();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 49
    //                   1 54
    //                   2 59;
           goto _L4 _L5 _L6 _L7
_L4:
        return;
_L5:
        v();
        return;
_L6:
        w();
        return;
_L7:
        x();
        return;
_L2:
        k.a(this, 0x7f0700f8, 1);
        return;
    }

    public void a(AccessToken accesstoken)
    {
        Bundle bundle = new Bundle();
        bundle.putString("target", "twitter");
        bundle.putString("auth[twitter][token]", accesstoken.getToken());
        bundle.putString("auth[twitter][token_secret]", accesstoken.getTokenSecret());
        bundle.putString("caption", h);
        a(bundle);
    }

    protected void o()
    {
        e = new c(this, getWindow().getDecorView(), false);
        e.a(new net.a.a.c.b() {

            final BaseShareActivity a;

            public void a()
            {
                com.cardinalblue.android.piccollage.a.b.au();
            }

            
            {
                a = BaseShareActivity.this;
                super();
            }
        });
        ArrayList arraylist = new ArrayList();
        Object obj = getPackageManager();
        Resources resources = getResources();
        Object obj1 = resources.getDrawable(0x7f020207);
        obj1 = new a(6, getString(0x7f070143), ((android.graphics.drawable.Drawable) (obj1)));
        e.a(((a) (obj1)));
        arraylist.add(null);
        obj1 = resources.getDrawable(0x7f02020d);
        obj1 = new a(12, getString(0x7f0702ad), ((android.graphics.drawable.Drawable) (obj1)));
        e.a(((a) (obj1)));
        arraylist.add(null);
        obj1 = new Intent("android.intent.action.SEND");
        ((Intent) (obj1)).setType("image/jpg");
        obj1 = ((PackageManager) (obj)).queryIntentActivities(((Intent) (obj1)), 0);
        Object obj2 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo;
            if (!activityinfo.packageName.equalsIgnoreCase("com.instagram.android"))
            {
                continue;
            }
            obj2 = new a(8, activityinfo.loadLabel(((PackageManager) (obj))).toString(), resources.getDrawable(0x7f02020a));
            e.a(((a) (obj2)));
            arraylist.add(activityinfo);
            break;
        } while (true);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/.");
        obj2 = ((PackageManager) (obj)).queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            ActivityInfo activityinfo1 = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo;
            if (!activityinfo1.packageName.equalsIgnoreCase("com.google.android.gm"))
            {
                continue;
            }
            obj = new a(3, activityinfo1.loadLabel(((PackageManager) (obj))).toString(), resources.getDrawable(0x7f020209));
            e.a(((a) (obj)));
            arraylist.add(activityinfo1);
            break;
        } while (true);
        obj = new a(4, getString(0x7f070251), getResources().getDrawable(0x7f020208));
        e.a(((a) (obj)));
        arraylist.add(null);
        obj = new a(11, getString(0x7f07011f), getResources().getDrawable(0x7f02020b));
        e.a(((a) (obj)));
        arraylist.add(null);
        if (((List) (obj1)).size() != 0)
        {
            a a1 = new a(5, getString(0x7f070221), getResources().getDrawable(0x7f02020c));
            e.a(a1);
            arraylist.add(null);
        }
        e.a(a(arraylist));
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        l;
        JVM INSTR tableswitch 110 115: default 48
    //                   110 49
    //                   111 49
    //                   112 49
    //                   113 49
    //                   114 49
    //                   115 67;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (i1 == -1)
        {
            k.i(this);
            a(intent.getExtras());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == -1)
        {
            y();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = (ClipboardManager)getSystemService("clipboard");
    }

    public void p()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/login/TwitterLoginActivity);
        intent.putExtra("caption", h);
        startActivityForResult(intent, 111);
    }

    protected boolean q()
    {
        return true;
    }

    public abstract String r();

    public abstract String s();

    public void showShareQuickAction(View view)
    {
        if (!q())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (e == null)
        {
            o();
        }
        if (isFinishing())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        e.b(view);
        return;
        view;
        com.cardinalblue.android.piccollage.a.f.a(view);
        return;
    }

    public String t()
    {
        return "";
    }

    public abstract Bitmap u()
        throws IOException;
}
