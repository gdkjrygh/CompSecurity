// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.a.i;
import com.crashlytics.android.Crashlytics;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.x;
import com.tinder.a.f;
import com.tinder.adapters.b;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.c.u;
import com.tinder.e.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.FacebookPhoto;
import com.tinder.parse.c;
import com.tinder.utils.ad;
import com.tinder.utils.e;
import com.tinder.utils.v;
import com.tinder.views.CustomActionBar;
import eu.janmuller.android.simplecropimage.CropImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Fragment
    implements android.view.View.OnClickListener, x, s
{

    com.tinder.managers.f a;
    private View b;
    private GridView c;
    private ProgressBar d;
    private TextView e;
    private b f;
    private boolean g;
    private u h;
    private String i;
    private String j;
    private String k;

    public a()
    {
    }

    public static String a(Bitmap bitmap)
    {
        try
        {
            File file = new File(ManagerApp.c().getCacheDir(), "uncropped.png");
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            (new StringBuilder("Out")).append(Boolean.toString(true)).append(" file: ").append(file.toString());
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileoutputstream);
            fileoutputstream.flush();
            fileoutputstream.close();
            bitmap = file.getPath();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            v.b(bitmap.getMessage());
            Crashlytics.a(bitmap.toString());
            return "";
        }
        return bitmap;
    }

    static String a(a a1, String s1)
    {
        a1.i = s1;
        return s1;
    }

    private void a()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            e.setVisibility(0);
            d.setVisibility(8);
            return;
        }
    }

    static void a(a a1)
    {
        a1.a();
    }

    static void a(a a1, String s1, String s2)
    {
        a1.a(s1, s2);
    }

    static void a(a a1, JSONObject jsonobject)
    {
        ArrayList arraylist;
        int l;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        l = 0;
        if (a1.g)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        arraylist = new ArrayList();
        arraylist.addAll(com.tinder.parse.c.a(jsonobject));
        a1.f.a(arraylist);
        a1.d.setVisibility(8);
        a1.b.setVisibility(0);
        if (a1.f.getCount() != 0)
        {
            l = 8;
        }
        a1.e.setVisibility(l);
        a1.c.setClickable(true);
        a1.b();
        return;
        jsonobject;
        v.b(jsonobject.getMessage());
        a1.f.a(arraylist);
        a1.d.setVisibility(8);
        a1.b.setVisibility(0);
        int i1;
        if (a1.f.getCount() == 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        a1.e.setVisibility(i1);
        a1.c.setClickable(true);
        a1.b();
        return;
        jsonobject;
        a1.f.a(arraylist);
        a1.d.setVisibility(8);
        a1.b.setVisibility(0);
        int j1;
        if (a1.f.getCount() == 0)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 8;
        }
        a1.e.setVisibility(j1);
        a1.c.setClickable(true);
        a1.b();
        throw jsonobject;
    }

    private void a(String s1, String s2)
    {
        e.setVisibility(8);
        if (s1.length() > 0)
        {
            if (TextUtils.isEmpty(s2))
            {
                if (s1.equals("tagged"))
                {
                    s2 = k;
                    s2 = (new StringBuilder("https://graph.facebook.com/me/photos?limit=5000&fields=id,source,picture&access_token=")).append(s2).toString();
                } else
                {
                    s2 = k;
                    s2 = (new StringBuilder("https://graph.facebook.com/")).append(s1).append('/').append("photos?limit=5000&fields=id,source,picture&access_token=").append(s2).toString();
                }
            }
            s1 = new i(s2, new com.android.volley.i.b(s1) {

                final String a;
                final a b;

                public final void a(Object obj)
                {
                    obj = (JSONObject)obj;
                    a.a(b, ((JSONObject) (obj)));
                    if (!((JSONObject) (obj)).has("paging"))
                    {
                        break MISSING_BLOCK_LABEL_46;
                    }
                    obj = ((JSONObject) (obj)).getJSONObject("paging").getString("next");
                    a.a(b, a, ((String) (obj)));
                    return;
                    obj;
                    v.b(((JSONException) (obj)).toString());
                    return;
                }

            
            {
                b = a.this;
                a = s1;
                super();
            }
            }, new com.android.volley.i.a(s2) {

                final String a;
                final a b;

                public final void a(VolleyError volleyerror)
                {
                    a.a(b);
                }

            
            {
                b = a.this;
                a = s1;
                super();
            }
            });
            s1.j = new com.android.volley.c(10000, 0, 1.0F);
            ManagerApp.b().a(s1);
            return;
        } else
        {
            a();
            return;
        }
    }

    static u b(a a1)
    {
        return a1.h;
    }

    static String b(a a1, String s1)
    {
        a1.j = s1;
        return s1;
    }

    private void b()
    {
        c.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final a a;

            public final void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                com.tinder.fragments.a.b(a).show();
                a.a(a, ((FacebookPhoto)com.tinder.fragments.a.c(a).a.get(l)).id);
                com.tinder.fragments.a.b(a, com.tinder.fragments.a.c(a).a(l));
                adapterview = a;
                view = com.tinder.fragments.a.c(a).a(l);
                Picasso.a(adapterview.getActivity()).a(view).a(adapterview);
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    static b c(a a1)
    {
        return a1.f;
    }

    public final void onActivityResult(int l, int i1, Intent intent)
    {
        (new StringBuilder("requestCode=")).append(l).append(", resultCode=").append(i1).append(", data=").append(intent);
        if (i1 == 0 || intent == null)
        {
            return;
        } else
        {
            intent = intent.getExtras();
            float f3 = intent.getFloat("rect_crop_x");
            float f6 = intent.getFloat("rect_crop_y");
            float f4 = intent.getFloat("rect_crop_width");
            float f1 = intent.getFloat("rect_crop_height");
            float f5 = intent.getFloat("image_width");
            float f2 = intent.getFloat("image_height");
            f3 /= f5;
            f6 /= f2;
            f4 /= f5;
            f1 /= f2;
            intent = i;
            String s1 = j;
            Intent intent1 = new Intent();
            intent1.putExtra("id", intent);
            intent1.putExtra("source", s1);
            intent1.putExtra("xdistance_percent", f4);
            intent1.putExtra("ydistance_percent", f1);
            intent1.putExtra("xoffset_percent", f3);
            intent1.putExtra("yoffset_percent", f6);
            getActivity().setResult(-1, intent1);
            getActivity().finish();
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public final void onBitmapFailed(Drawable drawable)
    {
        if (g)
        {
            return;
        } else
        {
            ad.c(h);
            Toast.makeText(getActivity(), 0x7f0600a9, 0).show();
            return;
        }
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (g)
        {
            return;
        } else
        {
            bitmap = com.tinder.utils.e.a(new com.tinder.utils.e.a(bitmap) {

                final Bitmap a;
                final a b;

                public final Object a()
                {
                    return a.a(a);
                }

            
            {
                b = a.this;
                a = bitmap;
                super();
            }
            });
            bitmap.a = new com.tinder.utils.e.c() {

                final a a;

                public final void a(Object obj)
                {
                    if (a.getActivity() == null)
                    {
                        v.b("Not telling user we cropped image, activity is null.");
                        return;
                    } else
                    {
                        obj = (String)obj;
                        Intent intent = new Intent(a.getActivity(), eu/janmuller/android/simplecropimage/CropImage);
                        intent.putExtra("image-path", ((String) (obj)));
                        intent.putExtra("scale", true);
                        intent.putExtra("save res id", 0x7f0601bf);
                        intent.putExtra("cancel res id", 0x7f060075);
                        intent.putExtra("aspectX", 3);
                        intent.putExtra("aspectY", 2);
                        ad.c(com.tinder.fragments.a.b(a));
                        a.startActivityForResult(intent, 0);
                        return;
                    }
                }

            
            {
                a = a.this;
                super();
            }
            };
            bitmap.a(false);
            return;
        }
    }

    public final void onClick(View view)
    {
        getActivity().onBackPressed();
    }

    public final void onCreate(Bundle bundle)
    {
        (new StringBuilder("bundle=")).append(bundle);
        super.onCreate(bundle);
        if (bundle != null)
        {
            i = bundle.getString("id");
            j = bundle.getString("source");
            (new StringBuilder("mSelecteId=")).append(i).append(", mSelectedSource=").append(j);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f03008c, viewgroup, false);
        f = new b(getActivity());
        g = false;
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        g = true;
        super.onDestroyView();
    }

    public final void onMenuItemClick(int l)
    {
        switch (l)
        {
        default:
            return;

        case 2130837995: 
            getActivity().onBackPressed();
            break;
        }
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    public final void onResume()
    {
        super.onResume();
        ((ActivitySignedInBase)getActivity()).H().setMenu(this);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("id", i);
        bundle.putString("source", j);
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        (new StringBuilder("savedInstanceState=")).append(bundle);
        super.onViewCreated(view, bundle);
        c = (GridView)view.findViewById(0x7f0e021e);
        d = (ProgressBar)view.findViewById(0x7f0e00a3);
        e = (TextView)view.findViewById(0x7f0e021c);
        b = view.findViewById(0x7f0e021d);
        h = new u(getActivity());
        view = getArguments().getString("id");
        c.setAdapter(f);
        k = com.tinder.managers.f.a();
        a(view, ((String) (null)));
    }
}
