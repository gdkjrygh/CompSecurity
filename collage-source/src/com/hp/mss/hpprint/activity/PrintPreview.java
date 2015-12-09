// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.hp.mss.hpprint.model.PrintItem;
import com.hp.mss.hpprint.model.PrintJobData;
import com.hp.mss.hpprint.util.b;
import com.hp.mss.hpprint.util.e;
import com.hp.mss.hpprint.util.f;
import com.hp.mss.hpprint.util.g;
import com.hp.mss.hpprint.view.PagePreviewView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintPreview extends Activity
{

    private static final android.print.PrintAttributes.MediaSize h[];
    HashMap a;
    PrintJobData b;
    String c;
    private PagePreviewView d;
    private boolean e;
    private float f;
    private float g;

    public PrintPreview()
    {
        a = new HashMap();
        e = false;
    }

    static float a(PrintPreview printpreview)
    {
        return printpreview.f;
    }

    static float a(PrintPreview printpreview, float f1)
    {
        printpreview.f = f1;
        return f1;
    }

    private static String a(double d1)
    {
        if (d1 == (double)(long)d1)
        {
            return String.format("%d", new Object[] {
                Long.valueOf((long)d1)
            });
        } else
        {
            return String.format("%s", new Object[] {
                Double.valueOf(d1)
            });
        }
    }

    private String a(android.print.PrintAttributes.MediaSize mediasize)
    {
        return String.format("%s x %s", new Object[] {
            a((float)mediasize.getWidthMils() / 1000F), a((float)mediasize.getHeightMils() / 1000F)
        });
    }

    static boolean a(PrintPreview printpreview, boolean flag)
    {
        printpreview.e = flag;
        return flag;
    }

    static float b(PrintPreview printpreview)
    {
        return printpreview.g;
    }

    static float b(PrintPreview printpreview, float f1)
    {
        printpreview.g = f1;
        return f1;
    }

    static PagePreviewView c(PrintPreview printpreview)
    {
        return printpreview.d;
    }

    private void c()
    {
        Spinner spinner = (Spinner)findViewById(com.hp.mss.hpprint.R.id.paper_size_spinner);
        Object obj = new ArrayList();
        if (f.b)
        {
            a.put("4 x 5", android.print.PrintAttributes.MediaSize.NA_INDEX_4X6);
            ((List) (obj)).add("4 x 5");
        }
        for (int i = 0; i < h.length; i++)
        {
            String s = a(h[i]);
            a.put(s, h[i]);
            ((List) (obj)).add(s);
        }

        if (b.c() != null)
        {
            Iterator iterator = b.c().keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                android.print.PrintAttributes.MediaSize mediasize1 = (android.print.PrintAttributes.MediaSize)iterator.next();
                String s2 = a(mediasize1);
                if (!((List) (obj)).contains(s2))
                {
                    a.put(s2, mediasize1);
                    ((List) (obj)).add(s2);
                }
            } while (true);
        }
        if (b.b() != null && b.b().a() != null)
        {
            android.print.PrintAttributes.MediaSize mediasize = b.b().a();
            String s1 = a(mediasize);
            if (!((List) (obj)).contains(s1))
            {
                a.put(s1, mediasize);
                ((List) (obj)).add(s1);
            }
        }
        obj = new ArrayAdapter(this, 0x1090008, (String[])((List) (obj)).toArray(new String[((List) (obj)).size()]));
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        spinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        if (b.d() != null)
        {
            spinner.setSelection(((ArrayAdapter) (obj)).getPosition(a(b.d().getMediaSize())));
        }
        a(spinner);
    }

    private void d()
    {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        if (displaymetrics.widthPixels <= displaymetrics.heightPixels)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
            int i = displaymetrics.widthPixels;
            layoutparams.width = i;
            layoutparams.height = i;
            d.setLayoutParams(layoutparams);
            return;
        } else
        {
            android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)d.getLayoutParams();
            layoutparams1.width = (int)((float)displaymetrics.widthPixels / 2.0F);
            layoutparams1.height = displaymetrics.heightPixels;
            d.setLayoutParams(layoutparams1);
            return;
        }
    }

    public void a()
    {
        PrintAttributes printattributes;
        if (b.d() == null)
        {
            printattributes = (new android.print.PrintAttributes.Builder()).setMediaSize((android.print.PrintAttributes.MediaSize)a.get(c)).build();
        } else
        {
            printattributes = (new android.print.PrintAttributes.Builder()).setColorMode(b.d().getColorMode()).setMediaSize((android.print.PrintAttributes.MediaSize)a.get(c)).setMinMargins(b.d().getMinMargins()).setResolution(b.d().getResolution()).build();
        }
        b.a(printattributes);
        b.b(c);
        com.hp.mss.hpprint.util.f.a(b);
        com.hp.mss.hpprint.util.f.b(this);
        e = false;
        invalidateOptionsMenu();
    }

    public void a(Spinner spinner)
    {
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final PrintPreview a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                a.c = (String)adapterview.getItemAtPosition(i);
                adapterview = a.b.a((android.print.PrintAttributes.MediaSize)a.a.get(a.c));
                boolean flag;
                if (adapterview != null && adapterview.a() != null)
                {
                    if (a.c == "4 x 5")
                    {
                        PrintPreview.a(a, 4F);
                        com.hp.mss.hpprint.activity.PrintPreview.b(a, 5F);
                    } else
                    {
                        PrintPreview.a(a, (float)adapterview.a().getWidthMils() / 1000F);
                        com.hp.mss.hpprint.activity.PrintPreview.b(a, (float)adapterview.a().getHeightMils() / 1000F);
                    }
                } else
                {
                    adapterview = a.b.b();
                    view = (android.print.PrintAttributes.MediaSize)a.a.get(a.c);
                    if (a.c == "4 x 5")
                    {
                        PrintPreview.a(a, 4F);
                        com.hp.mss.hpprint.activity.PrintPreview.b(a, 5F);
                    } else
                    {
                        PrintPreview.a(a, (float)view.getWidthMils() / 1000F);
                        com.hp.mss.hpprint.activity.PrintPreview.b(a, (float)view.getHeightMils() / 1000F);
                    }
                }
                PrintPreview.c(a).a(PrintPreview.a(a), com.hp.mss.hpprint.activity.PrintPreview.b(a));
                (new com.hp.mss.hpprint.view.PagePreviewView.a(a)).execute(new com.hp.mss.hpprint.view.PagePreviewView.b[] {
                    new com.hp.mss.hpprint.view.PagePreviewView.b(adapterview, PrintPreview.c(a))
                });
                if (com.hp.mss.hpprint.activity.PrintPreview.b(a) == 5F && PrintPreview.a(a) == 4F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f.b = flag;
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = PrintPreview.this;
                super();
            }
        });
    }

    public void b()
    {
        com.hp.mss.hpprint.util.e.a(this, new com.hp.mss.hpprint.util.e.a() {

            final PrintPreview a;

            public void a()
            {
                a.a();
            }

            public void b()
            {
                a.a();
            }

            public void c()
            {
            }

            public void d()
            {
                PrintPreview.a(a, false);
                a.invalidateOptionsMenu();
            }

            
            {
                a = PrintPreview.this;
                super();
            }
        });
    }

    public void onAboutLinkClicked(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse("http://www8.hp.com/us/en/ads/mobility/overview.html?jumpid=va_r11400_eprint"));
        startActivity(view);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        d();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.hp.mss.hpprint.R.layout.activity_print_preview);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayHomeAsUpEnabled(true);
            bundle.setIcon(new ColorDrawable(getResources().getColor(0x106000d)));
        }
        b = com.hp.mss.hpprint.util.f.a();
        c();
        d = (PagePreviewView)findViewById(com.hp.mss.hpprint.R.id.preview_image_view);
        d();
        ((TextView)findViewById(com.hp.mss.hpprint.R.id.ic_printing_support_link)).setOnClickListener(new android.view.View.OnClickListener() {

            final PrintPreview a;

            public void onClick(View view)
            {
                a.onAboutLinkClicked(view);
            }

            
            {
                a = PrintPreview.this;
                super();
            }
        });
        ((TextView)findViewById(com.hp.mss.hpprint.R.id.paper_size_title)).setTypeface(com.hp.mss.hpprint.util.b.a(this));
        ((TextView)findViewById(com.hp.mss.hpprint.R.id.print_preview_support_title)).setTypeface(com.hp.mss.hpprint.util.b.a(this));
        ((TextView)findViewById(com.hp.mss.hpprint.R.id.ic_printing_support_link)).setTypeface(com.hp.mss.hpprint.util.b.a(this));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.hp.mss.hpprint.R.menu.menu_print_preview, menu);
        menu = menu.findItem(com.hp.mss.hpprint.R.id.action_print);
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setEnabled(flag);
        menu.setShowAsAction(2);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d.setPhoto(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        e = true;
        invalidateOptionsMenu();
        if (i == com.hp.mss.hpprint.R.id.action_print)
        {
            if (f == 4F && g == 5F)
            {
                com.hp.mss.hpprint.util.g.a(this, new com.hp.mss.hpprint.util.g.a() {

                    final PrintPreview a;

                    public void a()
                    {
                        if (f.c)
                        {
                            a.b();
                            return;
                        } else
                        {
                            a.a();
                            return;
                        }
                    }

                    public void b()
                    {
                        PrintPreview.a(a, false);
                        a.invalidateOptionsMenu();
                    }

            
            {
                a = PrintPreview.this;
                super();
            }
                });
                return true;
            }
            if (f.c)
            {
                b();
                return true;
            } else
            {
                a();
                return true;
            }
        }
        if (i == 0x102002c)
        {
            super.onBackPressed();
            e = false;
            invalidateOptionsMenu();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    static 
    {
        h = (new android.print.PrintAttributes.MediaSize[] {
            android.print.PrintAttributes.MediaSize.NA_INDEX_4X6, new android.print.PrintAttributes.MediaSize("na_5x7_5x7in", "android", 5000, 7000), android.print.PrintAttributes.MediaSize.NA_LETTER
        });
    }
}
