// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.photoeditor.intents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import b;
import ejv;
import ekk;
import ekm;
import ekp;
import ekq;
import ekw;
import ele;
import elt;
import euv;
import fbj;
import fjs;
import fjz;
import fwd;
import fzu;
import fzw;
import gtk;
import gtm;
import gtn;
import guc;
import gug;
import guw;
import gux;
import guy;
import gvl;
import java.io.File;
import java.util.List;
import mms;
import mmt;
import mpk;
import mti;
import mtj;
import mua;
import mue;
import nfw;
import ngg;
import noy;
import noz;
import olm;
import omr;
import oql;
import p;

public class EditActivity extends omr
    implements gtn, mmt, mti
{

    private static final ekk f = (new ekm()).b(elt).b(fzu).b(gtk).b(fwd).a();
    private final nfw g;
    private final gtm h;
    private noz i;
    private mpk j;
    private mtj k;
    private fbj l;
    private ekq m;
    private ekp n;

    public EditActivity()
    {
        g = (new nfw(this, e)).a(d).b(this);
        h = new gtm(e, this);
    }

    public static void a(EditActivity editactivity, Intent intent)
    {
        Object obj;
        boolean flag;
        if (!b.c(editactivity.g()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = editactivity.getIntent().getData();
        if (b.c(((Uri) (obj))))
        {
            throw new UnsupportedOperationException("No data specified for external edit intent.");
        }
        Object obj1;
        gug gug1;
        nfw nfw1;
        if (editactivity.h())
        {
            obj = Uri.fromFile(editactivity.f());
            obj1 = gvl.a;
        } else
        if (flag)
        {
            obj = editactivity.g();
            obj1 = gvl.a;
        } else
        if (oql.b(((Uri) (obj))) || "file".equals(((Uri) (obj)).getScheme()))
        {
            if (intent.getBooleanExtra("com.google.android.apps.photos.photoeditor.contract.save_as_copy", true))
            {
                obj = gvl.a;
            } else
            {
                obj = gvl.b;
            }
            obj1 = obj;
            obj = null;
        } else
        {
            editactivity = String.valueOf("No 'output' extra specified and can not save to specified inputUri: ");
            intent = String.valueOf(obj);
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(editactivity).length() + 0 + String.valueOf(intent).length())).append(editactivity).append(intent).toString());
        }
        gug1 = new gug();
        nfw1 = editactivity.g;
        b.u();
        gug1.a = nfw1.b;
        gug1.b = editactivity.m;
        gug1.c = editactivity.n;
        gug1.e = intent.getData();
        gug1.f = intent.getByteArrayExtra("com.google.android.apps.photos.photoeditor.contract.edit_list");
        gug1.h = ((gvl) (obj1));
        gug1.g = ((Uri) (obj));
        gug1.d = intent.getData();
        intent = gug1.a();
        editactivity.h.a(intent);
    }

    private void a(mue mue1)
    {
        if (i.a())
        {
            noy.a("result", mue1);
            b.a(m);
        }
        Toast.makeText(this, b.uj, 1).show();
        finish();
    }

    private String e()
    {
        String s1 = getIntent().getType();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "image/*";
        }
        return s;
    }

    private File f()
    {
        return new File(getCacheDir(), "wallpaper-temp-file.jpg");
    }

    private Uri g()
    {
        return (Uri)getIntent().getParcelableExtra("output");
    }

    private boolean h()
    {
        return getIntent().getBooleanExtra("set-as-wallpaper", false);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        i = noz.a(this, "EditActivity", new String[0]);
        j = ((mpk)d.a(mpk)).a(b.ui, new gux(this));
        k = ((mtj)d.a(mtj)).a(this);
        l = (fbj)d.a(fbj);
    }

    public final void a(String s, mue mue1, mua mua1)
    {
        boolean flag1 = false;
        if (!ele.a(b.uh).equals(s)) goto _L2; else goto _L1
_L1:
        k.b.a(ele.a(b.uh));
        if (mue1 == null || mue1.c()) goto _L4; else goto _L3
_L3:
        s = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        if (s.isEmpty()) goto _L6; else goto _L5
_L5:
        n = (ekp)s.get(0);
        s = n;
        if (s.c() != euv.b) goto _L8; else goto _L7
_L7:
        s = (fzu)s.b(fzu);
        if (s == null) goto _L8; else goto _L9
_L9:
        boolean flag2;
        mue1 = ((fzu) (s)).a;
        if (((fzw) (mue1)).d == null && i.a())
        {
            if (getIntent() == null)
            {
                s = null;
            } else
            {
                s = getIntent().getData();
            }
            noy.a("uri", s);
            noy.a("width", ((fzw) (mue1)).d);
            noy.a("height", ((fzw) (mue1)).e);
            noy.a("filePath", ((fzw) (mue1)).h);
            noy.a("fileName", ((fzw) (mue1)).g);
            noy.a("fileSize", ((fzw) (mue1)).i);
        }
        flag2 = b.c(((fzw) (mue1)).d.intValue(), ((fzw) (mue1)).e.intValue());
_L15:
        if (!flag2) goto _L11; else goto _L10
_L10:
        Toast.makeText(this, b.un, 1).show();
        finish();
_L13:
        return;
_L8:
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L11:
        s = (fzu)n.b(fzu);
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (b.k(((fzu) (s)).a.g))
            {
                flag = true;
            }
        }
        if (flag)
        {
            Toast.makeText(this, b.uk, 1).show();
            finish();
            return;
        }
        mue1 = getIntent();
        String s1 = e();
        mua1 = new guw();
        mua1.a = s1;
        p.b(mue1, "externalIntent must be null");
        s = mue1.getAction();
        if ("com.android.camera.action.CROP".equals(s))
        {
            s = guc.a;
        } else
        if ("android.intent.action.EDIT".equals(s))
        {
            s = guc.b;
        } else
        if ("com.android.camera.action.TRIM".equals(s))
        {
            s = guc.c;
        } else
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unknown external action: ".concat(s);
            } else
            {
                s = new String("Unknown external action: ");
            }
            throw new IllegalArgumentException(s);
        }
        mua1.b = s;
        if (((guw) (mua1)).b == guc.a)
        {
            mua1.j = mue1.getIntExtra("outputX", -1);
            mua1.k = mue1.getIntExtra("outputY", -1);
            mua1.l = mue1.getIntExtra("aspectX", -1);
            mua1.m = mue1.getIntExtra("aspectY", -1);
        }
        if (ejv.b(s1))
        {
            mua1.b(mue1.getData());
            mue1 = g();
            if (!b.c(mue1))
            {
                s = mue1;
                if ("file".equals(mue1.getScheme()))
                {
                    s = String.valueOf(mue1);
                    s = Uri.parse((new StringBuilder(String.valueOf(s).length() + 4)).append(s).append(".tmp").toString());
                }
            } else
            {
                s = (fwd)n.b(fwd);
                if (s == null || b.c(((fwd) (s)).a))
                {
                    s = String.valueOf(getIntent().getData());
                    throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 22)).append("Cannot overwrite URI: ").append(s).toString());
                }
                s = String.valueOf(((fwd) (s)).a);
                s = Uri.parse((new StringBuilder(String.valueOf(s).length() + 4)).append(s).append(".tmp").toString());
            }
            mua1.c(s);
        } else
        {
            mua1.a(mue1.getData());
            mua1.c = ((elt)n.a(elt)).e();
        }
        j.a(b.ui, mua1.a());
        return;
_L6:
        a(mue1);
        return;
_L4:
        a(mue1);
        return;
_L2:
        if (!"SetWallpaperTask".equals(s)) goto _L13; else goto _L12
_L12:
        byte byte0;
        if (mue1 != null && !mue1.c())
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        setResult(byte0);
        finish();
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final void a(boolean flag, ekp ekp1)
    {
        if (h())
        {
            k.b(new guy(f()));
            return;
        }
        ekp1 = new Intent();
        ekp1.setDataAndType(g(), "image/jpeg");
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        setResult(byte0, ekp1);
        finish();
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i1, int j1)
    {
        if (flag && (mms2 == mms.c || mms2 == mms.b))
        {
            mms1 = new fjz(getIntent().getData(), ejv.d(e()), System.currentTimeMillis());
            mms2 = g;
            b.u();
            m = new fjs(((nfw) (mms2)).b, mms1);
            if (n == null)
            {
                k.b.a(getApplicationContext().getString(b.ul), null, ele.a(b.uh), false);
                k.a(new ele(m, ekw.a, f, b.uh));
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            n = (ekp)bundle.getParcelable("com.google.android.apps.photos.core.media");
        }
        if (ejv.d(e()) == euv.c)
        {
            if (!fbj.a())
            {
                Toast.makeText(this, b.uo, 1).show();
                finish();
                return;
            }
            if (!oql.b(getIntent().getData()))
            {
                bundle = getIntent().getData();
                if (i.a())
                {
                    bundle = String.valueOf(bundle);
                    (new StringBuilder(String.valueOf(bundle).length() + 33)).append("TRIM intent for unsupported uri: ").append(bundle);
                }
                Toast.makeText(this, b.up, 1).show();
                finish();
                return;
            }
        }
        bundle = g;
        ngg ngg1 = new ngg();
        ngg1.d = false;
        ngg1.f = true;
        ngg1.g = true;
        ngg1.j = true;
        bundle.a(ngg1);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.apps.photos.core.media", n);
    }

}
