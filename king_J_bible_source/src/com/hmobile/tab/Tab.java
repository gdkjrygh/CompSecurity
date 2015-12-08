// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tab;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tab
{

    private ImageView btn;
    private Activity context;
    private Dialog dialog;
    private ImageView img;
    private Intent intent;
    private boolean isSelected;
    public int preferedHeight;
    private int requestCode;
    private int resourceIcon;
    private int resourceIconSelected;
    private String tabTag;
    private int transparentResourceID;
    TextView txtStripe;
    private View view;

    public Tab(Activity activity, String s)
    {
        resourceIconSelected = 0;
        preferedHeight = -1;
        requestCode = -1;
        if (activity == null)
        {
            throw new IllegalStateException("Context can't be null");
        } else
        {
            tabTag = s;
            context = activity;
            return;
        }
    }

    private void bindListenersforSample()
    {
        img.setOnClickListener(new android.view.View.OnClickListener() {

            final Tab this$0;

            public void onClick(View view1)
            {
                if (intent != null || dialog != null) goto _L2; else goto _L1
_L1:
                Toast.makeText(context, (new StringBuilder("Intent or Dialog not set for '")).append(tabTag).append("'").toString(), 0).show();
_L4:
                return;
_L2:
                if (intent != null && dialog != null)
                {
                    Toast.makeText(context, (new StringBuilder(" Only ONE can be set Intent or Dialog for '")).append(tabTag).append("'").toString(), 0).show();
                    return;
                }
                if (intent == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (requestCode != -1)
                {
                    context.startActivityForResult(intent, requestCode);
                    return;
                }
                if (context.getComponentName().getClassName().equalsIgnoreCase(intent.getComponent().getClassName())) goto _L4; else goto _L3
_L3:
                context.startActivity(intent);
                if (context.getClass().getSimpleName().equalsIgnoreCase("MainBookActivity")) goto _L4; else goto _L5
_L5:
                context.finish();
                return;
                if (dialog == null) goto _L4; else goto _L6
_L6:
                dialog.show();
                return;
            }

            
            {
                this$0 = Tab.this;
                super();
            }
        });
    }

    private void createViewSample()
    {
        Object obj = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        int i = (((DisplayMetrics) (obj)).widthPixels - 4) / 5;
        int j = (int)(48F * ((DisplayMetrics) (obj)).density);
        Object obj1 = context.getLayoutInflater().inflate(0x7f030032, null);
        obj = (LinearLayout)((View) (obj1)).findViewById(0x7f0e00d0);
        img = (ImageView)((View) (obj1)).findViewById(0x7f0e0124);
        txtStripe = (TextView)((View) (obj1)).findViewById(0x7f0e0123);
        img.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, j));
        j = resourceIcon;
        i = j;
        if (isSelected)
        {
            i = j;
            if (resourceIconSelected != 0)
            {
                i = resourceIconSelected;
            }
        }
        obj1 = BitmapFactory.decodeResource(context.getResources(), i);
        img.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        if (isSelected)
        {
            img.setBackgroundResource(0x7f0200a4);
            txtStripe.setVisibility(0);
            txtStripe.setBackgroundColor(Color.parseColor("#5384AB"));
        } else
        {
            img.setBackgroundResource(0x7f0200a5);
            txtStripe.setVisibility(0);
            txtStripe.setBackgroundColor(context.getResources().getColor(0x7f08002a));
        }
        bindListenersforSample();
        view = ((View) (obj));
    }

    public Intent getIntent()
    {
        return intent;
    }

    public String getTag()
    {
        return tabTag;
    }

    public View getView()
    {
        if (view == null)
        {
            createViewSample();
        }
        return view;
    }

    public void setDialog(Dialog dialog1)
    {
        dialog = dialog1;
    }

    public void setIcon(int i)
    {
        resourceIcon = i;
    }

    public void setIconSelected(int i)
    {
        resourceIconSelected = i;
    }

    public void setIntent(Intent intent1)
    {
        intent = intent1;
    }

    public void setIntent(Intent intent1, int i)
    {
        intent = intent1;
        requestCode = i;
    }

    public void setSelected(boolean flag)
    {
        isSelected = flag;
    }

    public void setTransparentResourceID(int i)
    {
        transparentResourceID = i;
    }





}
