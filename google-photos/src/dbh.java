// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class dbh extends ArrayAdapter
{

    private static final String a = dbh.getSimpleName();
    private View b;
    private Drawable c;
    private File d;

    public dbh(Context context, List list)
    {
        super(context, 0, list);
        b.a(context, "context", null);
        d = bpe.a(getContext()).a.u();
    }

    public final void a(View view)
    {
        if (view != b)
        {
            if (b != null)
            {
                ((ImageView)b.findViewById(b.gX)).setImageDrawable(c);
                TextView textview = (TextView)b.findViewById(b.gZ);
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutparams.gravity = 81;
                layoutparams.setMargins(0, 0, 0, (int)getContext().getResources().getDimension(b.dC));
                textview.setLayoutParams(layoutparams);
            }
            Object obj = (ImageView)view.findViewById(b.gX);
            c = ((ImageView) (obj)).getDrawable();
            ((ImageView) (obj)).setImageResource(0x106000d);
            b = view;
            view = (TextView)view.findViewById(b.gZ);
            obj = new android.widget.FrameLayout.LayoutParams(-1, -1);
            obj.gravity = 17;
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
    }

    public final void a(View view, btp btp1)
    {
        android.graphics.Bitmap bitmap;
        File file;
        bitmap = null;
        if (view == b)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        file = new File(d, btp1.b);
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        Object obj = new FileInputStream(file);
        bitmap = BitmapFactory.decodeStream(((InputStream) (obj)), null, null);
        ((ImageView)view.findViewById(b.gX)).setImageBitmap(bitmap);
        ((InputStream) (obj)).close();
_L2:
        return;
        view;
        view = a;
        btp1 = String.valueOf(file);
        Log.w(view, (new StringBuilder(String.valueOf(btp1).length() + 17)).append("Failed to close: ").append(btp1).toString());
        return;
        view;
        view = bitmap;
_L6:
        obj = a;
        btp1 = String.valueOf(btp1.b);
        if (btp1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        btp1 = "Failed to fetch: ".concat(btp1);
_L3:
        Log.w(((String) (obj)), btp1);
        if (view == null) goto _L2; else goto _L1
_L1:
        try
        {
            view.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view = a;
        }
        btp1 = String.valueOf(file);
        Log.w(view, (new StringBuilder(String.valueOf(btp1).length() + 17)).append("Failed to close: ").append(btp1).toString());
        return;
        btp1 = new String("Failed to fetch: ");
          goto _L3
        obj;
        btp1 = view;
        view = ((View) (obj));
_L5:
        if (btp1 != null)
        {
            try
            {
                btp1.close();
            }
            // Misplaced declaration of an exception variable
            catch (btp btp1)
            {
                btp1 = a;
                obj = String.valueOf(file);
                Log.w(btp1, (new StringBuilder(String.valueOf(obj).length() + 17)).append("Failed to close: ").append(((String) (obj))).toString());
            }
        }
        throw view;
        view;
        btp1 = null;
        continue; /* Loop/switch isn't completed */
        view;
        btp1 = ((btp) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        view;
        view = ((View) (obj));
          goto _L6
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        cyy cyy1 = (cyy)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(c.R, viewgroup, false);
        }
        view = (ImageView)view1.findViewById(b.gX);
        view.setImageResource(cyy1.n);
        view.setBackgroundColor(getContext().getResources().getColor(cyy1.o));
        if (cyy1.n == b.co)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a(view1, btp.valueOf(cyy1.name()));
        }
        ((TextView)view1.findViewById(b.gZ)).setText(cyy1.m);
        view1.setTag(cyy1.name());
        return view1;
    }

}
