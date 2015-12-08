// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import am;
import an;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;
import com.spotify.mobile.android.spotlets.collection.service.Annotation;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.squareup.picasso.Picasso;
import cu;
import da;
import dmz;
import dtg;
import dto;
import dtt;
import duc;
import dvv;
import eob;
import eoc;
import eod;
import eoe;
import eoh;
import eoi;
import eok;
import fop;
import gcj;
import gck;
import gcw;
import gft;
import ggc;
import ggl;
import ggn;
import gwb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Map;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            AnnotateDiscardChangesActivity

public class AnnotatePlaylistActivity extends u
{

    private String A;
    private String B;
    private String C;
    private eoi D;
    private android.view.View.OnClickListener E;
    private android.view.View.OnClickListener F;
    private gck G;
    private android.content.DialogInterface.OnClickListener H;
    private android.view.View.OnClickListener I;
    private TextWatcher J;
    private an K;
    private an L;
    private Picasso d;
    private ggl e;
    private eoh f;
    private View g;
    private ImageView h;
    private Button i;
    private Button j;
    private Button k;
    private EditText l;
    private EditText m;
    private View n;
    private View o;
    private TextView p;
    private Uri q;
    private Uri r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status w;
    private String x;
    private String y;
    private String z;

    public AnnotatePlaylistActivity()
    {
        d = ((gft)dmz.a(gft)).a();
        dmz.a(fop);
        w = com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a;
        D = new eoi() {

            private AnnotatePlaylistActivity a;

            public final void a()
            {
                AnnotatePlaylistActivity.a(a).c();
                AnnotatePlaylistActivity.a(a, AnnotatePlaylistActivity.a(a).g());
            }

            public final void a(com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status status)
            {
                AnnotatePlaylistActivity.a(a).c();
                AnnotatePlaylistActivity.a(a, status);
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        E = new android.view.View.OnClickListener() {

            private AnnotatePlaylistActivity a;

            public final void onClick(View view)
            {
                if (a.isFinishing())
                {
                    return;
                }
                final class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2.a[AnnotatePlaylistActivity.b(a).ordinal()])
                {
                default:
                    AnnotatePlaylistActivity.f(a);
                    a.finish();
                    return;

                case 1: // '\001'
                    Object obj = AnnotatePlaylistActivity.a(a);
                    view = (eob)((eoh) (obj)).f();
                    obj = ((eoh) (obj)).f;
                    view.a(((String) (obj)));
                    Annotation annotation = (Annotation)AnnotateService.h(((eob) (view)).a).get(obj);
                    if (annotation != null && annotation.getStatus() == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d)
                    {
                        AnnotateService.a(((eob) (view)).a, ((String) (obj)), annotation, com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.b);
                        ((eob) (view)).a.b();
                    }
                    ((ggc)dmz.a(ggc)).c(a);
                    a.finish();
                    return;

                case 2: // '\002'
                case 3: // '\003'
                    AnnotatePlaylistActivity.c(a);
                    break;
                }
                if (AnnotatePlaylistActivity.d(a) != null && !Uri.EMPTY.equals(AnnotatePlaylistActivity.d(a)))
                {
                    view = AnnotatePlaylistActivity.e(a);
                    try
                    {
                        AnnotatePlaylistActivity.a(AnnotatePlaylistActivity.d(a), view);
                    }
                    catch (IOException ioexception)
                    {
                        Logger.b(ioexception, "Failed to copy file", new Object[0]);
                    }
                    AnnotatePlaylistActivity.a(a, view);
                }
                AnnotatePlaylistActivity.a(a).h();
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        F = new android.view.View.OnClickListener() {

            private AnnotatePlaylistActivity a;

            public final void onClick(View view)
            {
                a.startActivityForResult(AnnotateDiscardChangesActivity.a(a), 2);
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        G = new gck() {

            private AnnotatePlaylistActivity a;

            public final void d(boolean flag)
            {
                AnnotatePlaylistActivity.a(a, flag);
                View view = AnnotatePlaylistActivity.h(a);
                byte byte0;
                if (AnnotatePlaylistActivity.g(a))
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                view.setVisibility(byte0);
                AnnotatePlaylistActivity.i(a);
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        H = new android.content.DialogInterface.OnClickListener() {

            private AnnotatePlaylistActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                switch (i1)
                {
                default:
                    Assertion.a((new StringBuilder("Unexpected button")).append(i1).toString());
                    return;

                case 0: // '\0'
                    fop.a(a, ViewUri.bz, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cs));
                    dialoginterface = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    a.startActivityForResult(dialoginterface, 0);
                    return;

                case 1: // '\001'
                    dialoginterface = new Intent("android.media.action.IMAGE_CAPTURE");
                    fop.a(a, ViewUri.bz, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ct));
                    AnnotatePlaylistActivity.b(a, AnnotatePlaylistActivity.e(a));
                    dialoginterface.putExtra("output", AnnotatePlaylistActivity.j(a));
                    a.startActivityForResult(dialoginterface, 1);
                    return;

                case 2: // '\002'
                    fop.a(a, ViewUri.bz, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cu));
                    break;
                }
                AnnotatePlaylistActivity.a(AnnotatePlaylistActivity.d(a));
                AnnotatePlaylistActivity.a(a, Uri.EMPTY);
                AnnotatePlaylistActivity annotateplaylistactivity = a;
                if (AnnotatePlaylistActivity.k(a))
                {
                    dialoginterface = AnnotatePlaylistActivity.d(a);
                } else
                {
                    dialoginterface = Uri.parse(AnnotatePlaylistActivity.l(a));
                }
                AnnotatePlaylistActivity.c(annotateplaylistactivity, dialoginterface);
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        I = new android.view.View.OnClickListener() {

            private AnnotatePlaylistActivity a;

            public final void onClick(View view)
            {
                view = new android.app.AlertDialog.Builder(a);
                ArrayList arraylist = new ArrayList();
                arraylist.add(a.getString(0x7f08007c));
                if ((new Intent("android.media.action.IMAGE_CAPTURE")).resolveActivity(a.getPackageManager()) != null)
                {
                    arraylist.add(a.getString(0x7f08007e));
                }
                if (AnnotatePlaylistActivity.m(a))
                {
                    arraylist.add(a.getString(0x7f08007d));
                }
                view.setCancelable(true);
                view.setItems((CharSequence[])arraylist.toArray(new String[arraylist.size()]), AnnotatePlaylistActivity.n(a));
                view.show();
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        J = new TextWatcher() {

            private AnnotatePlaylistActivity a;

            public final void afterTextChanged(Editable editable)
            {
                Button button = AnnotatePlaylistActivity.o(a);
                boolean flag;
                if (AnnotatePlaylistActivity.b(a) != com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a || editable.toString().trim().length() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                button.setEnabled(flag);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
        K = new an() {

            private final String a[] = {
                "image_large_uri", "name", "description", "image_is_annotated"
            };
            private AnnotatePlaylistActivity b;

            public final da a(Bundle bundle)
            {
                return new cu(b, dtt.a(AnnotatePlaylistActivity.p(b)), a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Cursor cursor = (Cursor)obj;
                if (cursor.moveToFirst() && duc.a(cursor) && !b.isFinishing())
                {
                    AnnotatePlaylistActivity.a(b, gcw.a(cursor, "name", ""));
                    AnnotatePlaylistActivity annotateplaylistactivity = b;
                    String s1 = gcw.a(cursor, "description", "");
                    obj = s1;
                    if (s1.contains("&"))
                    {
                        obj = s1.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&#x27;", "\\").replace("&#x2F;", "/").replace("&amp;", "&");
                    }
                    AnnotatePlaylistActivity.b(annotateplaylistactivity, ((String) (obj)));
                    AnnotatePlaylistActivity.c(b, dto.a(gcw.a(cursor, "image_large_uri", "")).toString());
                    AnnotatePlaylistActivity.b(b, gcw.a(cursor, "image_is_annotated"));
                    if (!AnnotatePlaylistActivity.q(b) && !AnnotatePlaylistActivity.r(b))
                    {
                        AnnotatePlaylistActivity.t(b).setText(AnnotatePlaylistActivity.s(b));
                        AnnotatePlaylistActivity.v(b).setText(AnnotatePlaylistActivity.u(b));
                        AnnotatePlaylistActivity.a(b, null);
                        AnnotatePlaylistActivity.w(b);
                    }
                    if (AnnotatePlaylistActivity.d(b) == null)
                    {
                        AnnotatePlaylistActivity.c(b, Uri.parse(AnnotatePlaylistActivity.l(b)));
                        return;
                    }
                }
            }

            
            {
                b = AnnotatePlaylistActivity.this;
                super();
            }
        };
        L = new an() {

            private AnnotatePlaylistActivity a;

            public final da a(Bundle bundle)
            {
                com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(AnnotatePlaylistActivity.x(a))).c;
                bundle = Uri.EMPTY;
                String as[] = new String[1];
                if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT)
                {
                    bundle = com.spotify.mobile.android.provider.Metadata.Track.a(AnnotatePlaylistActivity.x(a));
                    as[0] = "album_image_large_uri";
                } else
                if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
                {
                    bundle = dtg.a(AnnotatePlaylistActivity.x(a));
                    as[0] = "image_large_uri";
                } else
                {
                    Assertion.a("Link type is neither Album nor Track.");
                }
                return new cu(a, bundle, as, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst() && duc.a(((Cursor) (obj))) && !a.isFinishing())
                {
                    AnnotatePlaylistActivity.c(a, dto.a(gcw.a(((Cursor) (obj)), 0, "")).toString());
                    if (AnnotatePlaylistActivity.d(a) == null)
                    {
                        AnnotatePlaylistActivity.c(a, Uri.parse(AnnotatePlaylistActivity.l(a)));
                        return;
                    }
                }
            }

            
            {
                a = AnnotatePlaylistActivity.this;
                super();
            }
        };
    }

    static Uri a(AnnotatePlaylistActivity annotateplaylistactivity, Uri uri)
    {
        annotateplaylistactivity.q = uri;
        return uri;
    }

    static eoh a(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.f;
    }

    static String a(AnnotatePlaylistActivity annotateplaylistactivity, String s1)
    {
        annotateplaylistactivity.A = s1;
        return s1;
    }

    static void a(Uri uri)
    {
        b(uri);
    }

    static void a(Uri uri, Uri uri1)
    {
        Object obj = null;
        FileChannel filechannel = (new FileInputStream(new File(uri.getPath()))).getChannel();
        uri1 = (new FileOutputStream(new File(uri1.getPath()))).getChannel();
        uri1.transferFrom(filechannel, 0L, filechannel.size());
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (uri1 != null)
        {
            uri1.close();
        }
        return;
        uri;
        uri1 = null;
        filechannel = obj;
_L2:
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (uri1 != null)
        {
            uri1.close();
        }
        throw uri;
        uri;
        uri1 = null;
        continue; /* Loop/switch isn't completed */
        uri;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(AnnotatePlaylistActivity annotateplaylistactivity, com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status status)
    {
        boolean flag1 = false;
        if (annotateplaylistactivity.isFinishing()) goto _L2; else goto _L1
_L1:
        Object obj;
        annotateplaylistactivity.w = annotateplaylistactivity.f.g();
        boolean flag2 = eoh.a(annotateplaylistactivity.w);
        obj = annotateplaylistactivity.w;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        Object obj1;
        Object obj2;
        int i1;
        int j1;
        if (annotateplaylistactivity.w == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = annotateplaylistactivity.i;
        if (i1 != 0)
        {
            j1 = 0x7f080081;
        } else
        {
            j1 = 0x7f08007a;
        }
        ((Button) (obj)).setText(j1);
        obj = annotateplaylistactivity.j;
        if (i1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        if (annotateplaylistactivity.u) goto _L4; else goto _L3
_L3:
        obj1 = annotateplaylistactivity.l;
        obj2 = annotateplaylistactivity.f;
        obj = (eob)((eoh) (obj2)).f();
        obj2 = ((eoh) (obj2)).f;
        obj = (Annotation)AnnotateService.h(((eob) (obj)).a).get(obj2);
        if (obj != null)
        {
            obj = ((Annotation) (obj)).getName();
        } else
        {
            obj = null;
        }
        ((EditText) (obj1)).setText(((CharSequence) (obj)));
        obj1 = annotateplaylistactivity.m;
        obj2 = annotateplaylistactivity.f;
        obj = (eob)((eoh) (obj2)).f();
        obj2 = ((eoh) (obj2)).f;
        obj = (Annotation)AnnotateService.h(((eob) (obj)).a).get(obj2);
        if (obj != null)
        {
            obj = ((Annotation) (obj)).getDescription();
        } else
        {
            obj = null;
        }
        ((EditText) (obj1)).setText(((CharSequence) (obj)));
        obj1 = annotateplaylistactivity.f;
        obj = (eob)((eoh) (obj1)).f();
        obj1 = ((eoh) (obj1)).f;
        obj = (Annotation)AnnotateService.h(((eob) (obj)).a).get(obj1);
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((Annotation) (obj)).getImageUri();
        if (obj == null) goto _L6; else goto _L7
_L7:
        obj = Uri.parse(((String) (obj)));
_L8:
        annotateplaylistactivity.q = ((Uri) (obj));
        annotateplaylistactivity.c(annotateplaylistactivity.q);
        annotateplaylistactivity.u = true;
_L4:
        if (status == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.e)
        {
            annotateplaylistactivity.q = null;
        }
        annotateplaylistactivity.g();
        status = annotateplaylistactivity.l;
        boolean flag;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        status.setEnabled(flag);
        status = annotateplaylistactivity.m;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        status.setEnabled(flag);
        status = annotateplaylistactivity.h;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        status.setEnabled(flag);
        status = annotateplaylistactivity.k;
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
        status.setEnabled(flag);
        annotateplaylistactivity.i.setEnabled(true);
        annotateplaylistactivity.S_().b(0x7f110064, null, annotateplaylistactivity.K);
_L2:
        return;
_L6:
        obj = null;
          goto _L8
        annotateplaylistactivity.i.setText(0x7f080082);
          goto _L4
    }

    static boolean a(AnnotatePlaylistActivity annotateplaylistactivity, boolean flag)
    {
        annotateplaylistactivity.s = flag;
        return flag;
    }

    static Uri b(AnnotatePlaylistActivity annotateplaylistactivity, Uri uri)
    {
        annotateplaylistactivity.r = uri;
        return uri;
    }

    static com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status b(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.w;
    }

    static String b(AnnotatePlaylistActivity annotateplaylistactivity, String s1)
    {
        annotateplaylistactivity.C = s1;
        return s1;
    }

    private static void b(Uri uri)
    {
        if (uri != null && !(new File(uri.getPath())).delete())
        {
            uri.getPath();
        }
    }

    static boolean b(AnnotatePlaylistActivity annotateplaylistactivity, boolean flag)
    {
        annotateplaylistactivity.t = flag;
        return flag;
    }

    static String c(AnnotatePlaylistActivity annotateplaylistactivity, String s1)
    {
        annotateplaylistactivity.B = s1;
        return s1;
    }

    private void c(Uri uri)
    {
        if (isFinishing())
        {
            return;
        } else
        {
            d.a(uri).a(0x7f02006c).a(0x7f0c0083, 0x7f0c0083).b().b(0x7f02006c).a(h, null);
            return;
        }
    }

    static void c(AnnotatePlaylistActivity annotateplaylistactivity, Uri uri)
    {
        annotateplaylistactivity.c(uri);
    }

    static boolean c(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        annotateplaylistactivity.u = true;
        return true;
    }

    static Uri d(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.q;
    }

    static Uri e(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.f();
    }

    private Uri f()
    {
        File file;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            file = new File(getExternalCacheDir(), "annotate");
        } else
        {
            file = new File(getCacheDir(), "annotate");
        }
        if (!file.exists())
        {
            Assertion.a(file.mkdirs(), "Unable to create cache directory!");
        }
        return Uri.fromFile(new File(file, (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
    }

    static void f(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        ClientEvent clientevent;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = false;
        flag = false;
        flag2 = true;
        j1 = 1;
        flag3 = annotateplaylistactivity.h();
        flag4 = TextUtils.isEmpty(annotateplaylistactivity.z);
        clientevent = (new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cr)).a("something_changed", String.valueOf(flag3));
        if (!flag3 && !flag4) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        String s2;
        Object obj1;
        int i1;
        s1 = annotateplaylistactivity.l.getText().toString();
        s2 = annotateplaylistactivity.m.getText().toString();
        String s3;
        if (annotateplaylistactivity.q != null)
        {
            if (!Uri.EMPTY.equals(annotateplaylistactivity.q))
            {
                clientevent.a("with_image", "true");
                obj = annotateplaylistactivity.q;
            } else
            {
                clientevent.a("remove_image", "true");
                obj = Uri.EMPTY;
            }
        } else
        {
            obj = null;
        }
        if (obj != null && !Uri.EMPTY.equals(obj))
        {
            obj1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ah);
            new eok();
            Object obj2 = new android.graphics.BitmapFactory.Options();
            Object obj3 = new android.graphics.BitmapFactory.Options();
            obj3.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(((Uri) (obj)).getPath(), ((android.graphics.BitmapFactory.Options) (obj3)));
            ((ClientEvent) (obj1)).a("image_original_width", String.valueOf(((android.graphics.BitmapFactory.Options) (obj3)).outWidth));
            ((ClientEvent) (obj1)).a("image_original_height", String.valueOf(((android.graphics.BitmapFactory.Options) (obj3)).outHeight));
            obj3.inSampleSize = 1;
            if (((android.graphics.BitmapFactory.Options) (obj3)).outHeight > 1080 || ((android.graphics.BitmapFactory.Options) (obj3)).outWidth > 1920)
            {
                i1 = Math.round((float)((android.graphics.BitmapFactory.Options) (obj3)).outHeight / 1080F);
                k1 = Math.round((float)((android.graphics.BitmapFactory.Options) (obj3)).outWidth / 1920F);
                if (i1 >= k1)
                {
                    i1 = k1;
                }
                obj3.inSampleSize = i1;
            }
            obj2.inSampleSize = ((android.graphics.BitmapFactory.Options) (obj3)).inSampleSize;
            obj2 = eok.a(((Uri) (obj)), BitmapFactory.decodeFile(((Uri) (obj)).getPath(), ((android.graphics.BitmapFactory.Options) (obj2))));
            try
            {
                obj3 = new FileOutputStream(((Uri) (obj)).getPath());
                ((Bitmap) (obj2)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((java.io.OutputStream) (obj3)));
                ((FileOutputStream) (obj3)).close();
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                Logger.b(filenotfoundexception, "Could not save file to %s", new Object[] {
                    ((Uri) (obj)).getPath()
                });
            }
            catch (IOException ioexception)
            {
                Logger.b(ioexception, "Failed to compress image.", new Object[0]);
            }
            dmz.a(fop);
            fop.a(annotateplaylistactivity, ViewUri.bz, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.O, ((ClientEvent) (obj1)));
        }
        clientevent.a("new_playlist", String.valueOf(flag4));
        obj1 = new eoc(annotateplaylistactivity);
        if (flag4)
        {
            break MISSING_BLOCK_LABEL_665;
        }
        s3 = annotateplaylistactivity.z;
        ((eoc) (obj1)).b.putExtra("playlist_uri", s3);
        obj1 = new eod(((eoc) (obj1)).a, ((eoc) (obj1)).b);
        ((eod) (obj1)).b.putExtra("name", s1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (Uri.EMPTY.equals(obj)) goto _L6; else goto _L5
_L5:
        obj = ((Uri) (obj)).toString();
        ((eod) (obj1)).b.putExtra("image_uri", ((String) (obj)));
        i1 = 1;
_L7:
        String s4;
        int k1;
        if (!TextUtils.equals(annotateplaylistactivity.C, s2))
        {
            clientevent.a("with_description", "true");
            ((eod) (obj1)).b.putExtra("description", s2);
        } else
        {
            j1 = 0;
        }
        ((eod) (obj1)).a.startService(((eod) (obj1)).b);
        k1 = 0;
_L8:
        if (i1 != 0 || j1 != 0)
        {
            ((ggc)dmz.a(ggc)).c(annotateplaylistactivity);
        } else
        if (flag)
        {
            ((ggc)dmz.a(ggc)).d(annotateplaylistactivity, s1);
        } else
        if (k1 != 0)
        {
            ((ggc)dmz.a(ggc)).b(annotateplaylistactivity);
        } else
        {
            ((ggc)dmz.a(ggc)).a(annotateplaylistactivity, SpotifyIcon.aA, 0x7f08055b);
        }
_L2:
        fop.a(annotateplaylistactivity, ViewUri.bz, clientevent);
        return;
_L6:
        ((eod) (obj1)).b.putExtra("image_uri", "");
_L4:
        i1 = 0;
          goto _L7
        ((eoc) (obj1)).b.putExtra("playlist_uri", null);
        ((eoc) (obj1)).b.putExtra("name", s1);
        obj1 = new eoe(((eoc) (obj1)).a, ((eoc) (obj1)).b);
        if (!TextUtils.isEmpty(annotateplaylistactivity.y))
        {
            s4 = annotateplaylistactivity.y;
            ((eoe) (obj1)).b.putExtra("folder_uri", s4);
        }
        if (!TextUtils.isEmpty(annotateplaylistactivity.x))
        {
            s4 = annotateplaylistactivity.x;
            ((eoe) (obj1)).b.putExtra("add_uri", s4);
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (obj != null && !Uri.EMPTY.equals(obj))
        {
            obj = ((Uri) (obj)).toString();
            ((eoe) (obj1)).b.putExtra("image_uri", ((String) (obj)));
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = ((flag1) ? 1 : 0);
        if (!TextUtils.equals(annotateplaylistactivity.C, s2))
        {
            k1 = ((flag1) ? 1 : 0);
            if (!TextUtils.isEmpty(s2))
            {
                clientevent.a("with_description", "true");
                ((eoe) (obj1)).b.putExtra("description", s2);
                k1 = 1;
            }
        }
        ((eoe) (obj1)).a.startService(((eoe) (obj1)).b);
        flag = j1;
        j1 = k1;
        flag1 = i1;
        i1 = ((flag) ? 1 : 0);
        k1 = ((flag2) ? 1 : 0);
        flag = flag1;
          goto _L8
    }

    private void g()
    {
        boolean flag = eoh.a(w);
        Object obj = n;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = k;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Button) (obj)).setEnabled(flag);
        switch (_cls2.a[w.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
        case 3: // '\003'
            TextView textview = p;
            int j1;
            if (s)
            {
                j1 = 0x7f0802ff;
            } else
            {
                j1 = 0x7f080300;
            }
            textview.setText(j1);
            o.setVisibility(0);
            return;

        case 1: // '\001'
            p.setText(0x7f0802fe);
            o.setVisibility(8);
            return;
        }
    }

    static boolean g(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.s;
    }

    static View h(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.g;
    }

    private boolean h()
    {
        String s1;
        String s2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (A != null)
        {
            s1 = A;
        } else
        {
            s1 = "";
        }
        if (C != null)
        {
            s2 = C;
        } else
        {
            s2 = "";
        }
        if (!TextUtils.equals(s1, l.getText().toString()) || !TextUtils.equals(s2, m.getText().toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (t && q != null && Uri.EMPTY.equals(q))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (q != null && !Uri.EMPTY.equals(q))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 || flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (w == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.c || w == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.b)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return !flag2 && (flag || flag1) && w != com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d;
    }

    static void i(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        annotateplaylistactivity.g();
    }

    static Uri j(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.r;
    }

    static boolean k(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.t;
    }

    static String l(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.B;
    }

    static boolean m(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (annotateplaylistactivity.q != null && !Uri.EMPTY.equals(annotateplaylistactivity.q))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (annotateplaylistactivity.t && (annotateplaylistactivity.q == null || !Uri.EMPTY.equals(annotateplaylistactivity.q)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    static android.content.DialogInterface.OnClickListener n(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.H;
    }

    static Button o(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.i;
    }

    static String p(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.z;
    }

    static boolean q(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.u;
    }

    static boolean r(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.v;
    }

    static String s(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.A;
    }

    static EditText t(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.l;
    }

    static String u(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.C;
    }

    static EditText v(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.m;
    }

    static boolean w(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        annotateplaylistactivity.v = true;
        return true;
    }

    static String x(AnnotatePlaylistActivity annotateplaylistactivity)
    {
        return annotateplaylistactivity.x;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        Object obj1;
        Exception exception;
        Object obj2;
        exception = null;
        obj1 = null;
        obj2 = null;
        super.onActivityResult(i1, j1, intent);
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        if (j1 == -1)
        {
            b(q);
            q = r;
            c(q);
        } else
        {
            fop.a(this, ViewUri.bz, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.ct));
        }
        r = null;
_L12:
        return;
_L2:
        if (i1 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        Object obj;
        b(q);
        q = f();
        intent = intent.getData();
        obj = q;
        intent = getContentResolver().openInputStream(intent);
        obj = new FileOutputStream(((Uri) (obj)).getPath());
        obj1 = new byte[1024];
_L7:
        i1 = intent.read(((byte []) (obj1)));
        if (i1 == -1) goto _L6; else goto _L5
_L5:
        ((FileOutputStream) (obj)).write(((byte []) (obj1)), 0, i1);
          goto _L7
        obj1;
_L15:
        if (intent != null)
        {
            try
            {
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
_L10:
        c(q);
        return;
_L6:
        if (intent != null)
        {
            try
            {
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
          goto _L8
        intent;
        intent = null;
        obj = exception;
_L14:
        if (intent != null)
        {
            try
            {
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
_L8:
        if (true) goto _L10; else goto _L9
_L9:
        obj;
        intent = null;
_L13:
        if (intent != null)
        {
            try
            {
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        throw obj;
_L4:
        fop.a(this, ViewUri.bz, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cs));
        return;
        if (i1 != 2 || j1 != -1) goto _L12; else goto _L11
_L11:
        b(q);
        if (f != null)
        {
            f.h();
        }
        finish();
        return;
        obj;
          goto _L13
        exception;
        obj1 = obj;
        obj = exception;
          goto _L13
        obj;
        obj = exception;
          goto _L14
        IOException ioexception;
        ioexception;
          goto _L14
        intent;
        obj = null;
        intent = obj2;
          goto _L15
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = null;
          goto _L15
    }

    public void onBackPressed()
    {
        if (!h())
        {
            super.onBackPressed();
            return;
        } else
        {
            startActivityForResult(AnnotateDiscardChangesActivity.a(this), 2);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        FontSupport.a(this);
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        e = ggn.a(this, ViewUri.bz);
        h = (ImageView)findViewById(0x7f11026a);
        h.setOnClickListener(I);
        k = (Button)findViewById(0x7f11029e);
        k.setOnClickListener(I);
        m = (EditText)findViewById(0x7f1102a3);
        l = (EditText)findViewById(0x7f11026e);
        g = findViewById(0x7f110298);
        n = findViewById(0x7f11029d);
        n.setVisibility(8);
        o = n.findViewById(0x7f1103a1);
        p = (TextView)n.findViewById(0x7f11049c);
        Object obj = getIntent();
        int i1;
        boolean flag;
        if (bundle != null)
        {
            z = bundle.getString("playlist_uri");
            y = bundle.getString("folder_uri");
            x = bundle.getString("item_uri");
            l.setText(bundle.getString("title"));
            m.setText(bundle.getString("description"));
            q = (Uri)bundle.getParcelable("image_uri");
            r = (Uri)bundle.getParcelable("temp_uri");
        } else
        {
            z = ((Intent) (obj)).getStringExtra("playlist_uri");
            y = ((Intent) (obj)).getStringExtra("folder_uri");
            x = ((Intent) (obj)).getStringExtra("item_uri");
            obj = ((Intent) (obj)).getStringExtra("title");
            l.setText(((CharSequence) (obj)));
        }
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = flag;
        if (q != null)
        {
            c(q);
        } else
        {
            bundle = (new SpotifyLink(x)).c;
            if (bundle == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT || bundle == com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
            {
                S_().b(0x7f110063, null, L);
            }
        }
        i = (Button)findViewById(0x7f11029b);
        bundle = i;
        if (l.getText().toString().trim().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.setEnabled(flag);
        i.setOnClickListener(E);
        j = (Button)findViewById(0x7f11029a);
        j.setOnClickListener(F);
        l.addTextChangedListener(J);
        flag = TextUtils.isEmpty(z);
        bundle = (TextView)findViewById(0x7f110296);
        if (flag)
        {
            i1 = 0x7f080086;
        } else
        {
            i1 = 0x7f080083;
        }
        bundle.setText(i1);
        if (flag)
        {
            i.setText(0x7f080076);
        }
        S_().a(0x7f110062, null, new gcj(this, G));
        if (!TextUtils.isEmpty(z))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(z))
        {
            f = new eoh(this, z, D);
            f.a();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (f != null)
        {
            f.i();
        }
    }

    protected void onPause()
    {
        super.onPause();
        e.b();
    }

    protected void onResume()
    {
        super.onResume();
        e.a();
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("playlist_uri", z);
        bundle.putString("folder_uri", y);
        bundle.putString("item_uri", x);
        bundle.putParcelable("image_uri", q);
        bundle.putParcelable("temp_uri", r);
        if (l != null)
        {
            bundle.putString("title", l.getText().toString());
            bundle.putString("description", m.getText().toString());
        }
        super.onSaveInstanceState(bundle);
    }
}
