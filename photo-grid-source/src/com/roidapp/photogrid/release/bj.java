// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.photogrid.common.bb;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            bk, bl, bn, bm, 
//            ImageSelector

public final class bj extends BaseAdapter
    implements android.view.View.OnClickListener
{

    public ListView a;
    private Context b;
    private String c[];
    private String d[];
    private Integer e[];
    private boolean f;
    private HashMap g;
    private Handler h;

    public bj(Context context, String as[], Integer ainteger[], String as1[], ListView listview, HashMap hashmap)
    {
        h = new bk(this);
        b = context;
        c = as;
        d = as1;
        e = ainteger;
        a = listview;
        g = hashmap;
    }

    public static Bitmap a(String s)
    {
        Object obj2;
        Object obj3;
        boolean flag;
        flag = true;
        obj3 = null;
        obj2 = null;
        Bitmap bitmap;
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.outWidth = 100;
        options.inJustDecodeBounds = true;
        bitmap = BitmapFactory.decodeFile(s, options);
        Object obj;
        Object obj1;
        obj = bitmap;
        obj1 = bitmap;
        options.inJustDecodeBounds = false;
        obj = bitmap;
        obj1 = bitmap;
        if (options.outWidth <= options.outHeight) goto _L2; else goto _L1
_L1:
        obj = bitmap;
        obj1 = bitmap;
        int i = options.outWidth / 20;
          goto _L3
_L8:
        obj = bitmap;
        obj1 = bitmap;
        int j;
        i = j / 10;
        if (i <= 0)
        {
            i = ((flag) ? 1 : 0);
        }
        obj = bitmap;
        obj1 = bitmap;
        options.inSampleSize = i;
        obj = bitmap;
        obj1 = bitmap;
        bitmap = BitmapFactory.decodeFile(s, options);
        obj = bitmap;
        obj1 = bitmap;
        return bb.a(bitmap, s);
_L2:
        obj = bitmap;
        obj1 = bitmap;
        i = options.outHeight / 20;
          goto _L3
        obj;
        s = null;
_L6:
        if (s != null && !s.isRecycled())
        {
            s.recycle();
            s = obj2;
        }
        ((Exception) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L5:
        if (s != null && !s.isRecycled())
        {
            s.recycle();
            s = obj3;
        }
        ((OutOfMemoryError) (obj)).printStackTrace();
        return s;
        obj1;
        s = ((String) (obj));
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        s = ((String) (obj1));
        if (true) goto _L6; else goto _L3
_L3:
        j = i;
        if (i % 10 != 0)
        {
            j = i + 10;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(bj bj1, String s)
    {
        bj1.b(s);
    }

    static boolean a(bj bj1)
    {
        return bj1.f;
    }

    static HashMap b(bj bj1)
    {
        return bj1.g;
    }

    private void b(String s)
    {
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(b, 0x7f07028d, 1).show();
            return;
        } else
        {
            (new bl(this, s)).start();
            return;
        }
    }

    static Handler c(bj bj1)
    {
        return bj1.h;
    }

    static Context d(bj bj1)
    {
        return bj1.b;
    }

    public final int getCount()
    {
        return c.length;
    }

    public final Object getItem(int i)
    {
        return c[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(b).inflate(0x7f0300d6, null);
        }
        Object obj1 = (RelativeLayout)viewgroup.findViewById(0x7f0d0384);
        ((RelativeLayout) (obj1)).setOnClickListener(this);
        ((RelativeLayout) (obj1)).setTag(c[c.length - 1 - i]);
        Object obj = (TextView)viewgroup.findViewById(0x7f0d0386);
        view = (TextView)viewgroup.findViewById(0x7f0d0387);
        obj1 = (ImageButton)((RelativeLayout) (obj1)).findViewById(0x7f0d0029);
        ((ImageButton) (obj1)).setOnClickListener(this);
        ((ImageButton) (obj1)).setTag(c[c.length - 1 - i]);
        int j = c.length;
        obj1 = c[j - 1 - i];
        obj1 = ((String) (obj1)).substring(0, ((String) (obj1)).length());
        ((TextView) (obj)).setText(((String) (obj1)).substring(((String) (obj1)).lastIndexOf("/") + 1));
        j = c.length;
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("(");
        ((StringBuilder) (obj)).append(e[j - 1 - i]);
        ((StringBuilder) (obj)).append(")");
        view.setText(((StringBuilder) (obj)).toString());
        obj = (ImageView)viewgroup.findViewById(0x7f0d0385);
        ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view = d[c.length - 1 - i];
        ((ImageView) (obj)).setTag(view);
        try
        {
            ((ImageView) (obj)).setImageResource(0x7f020225);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
        }
        if (!f)
        {
            b(view);
        }
        return viewgroup;
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d0029)
        {
            (new android.app.AlertDialog.Builder(b)).setMessage(b.getString(0x7f070169)).setPositiveButton(b.getString(0x7f07016b), new bn(this, view)).setNegativeButton(b.getString(0x7f07016a), new bm(this)).create().show();
            return;
        } else
        {
            ((ImageSelector)b).b(view.getTag().toString());
            return;
        }
    }
}
