// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.activities.ar;
import com.jcp.adapters.ProductListAdapter;
import com.jcp.adapters.bj;
import com.jcp.b.b;
import com.jcp.c.ab;
import com.jcp.c.p;
import com.jcp.e.ac;
import com.jcp.e.ah;
import com.jcp.e.ai;
import com.jcp.e.o;
import com.jcp.e.q;
import com.jcp.e.r;
import com.jcp.e.z;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.h.c;
import com.jcp.h.d;
import com.jcp.h.f;
import com.jcp.h.g;
import com.jcp.h.m;
import com.jcp.model.Price;
import com.jcp.pojo.SavedItems;
import com.jcp.productentity.Image;
import com.jcp.productentity.RecommendationsEntityContainer;
import com.jcp.productfilter.pojo.ProductList;
import com.jcp.productlistentity.ProductListContentElement;
import com.jcp.productlistentity.ProductListContentEntity;
import com.jcp.productlistentity.ProductListEntityContainer;
import com.jcp.productlistentity.ProductListImageEntity;
import com.jcp.productlistentity.ProductListPageEntity;
import com.jcp.productlistentity.ProductListPriceEntity;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.productlistentity.ProductListSortOptionEntity;
import com.jcp.recommendation.myrecs.RecommendedProduct;
import com.jcp.searchentity.SearchRedirectUrl;
import com.jcp.searchentity.SearchRelatedTermEntity;
import com.jcp.util.a;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bi;
import com.jcp.util.bo;
import com.jcp.util.bq;
import com.jcp.util.bt;
import com.jcp.util.bv;
import com.jcp.util.k;
import com.jcp.views.HtmlTypefaceTextView;
import com.jcp.widget.BackToTopButton;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, eo, ep, em, 
//            en, ProductDetailFragment, t, er, 
//            es, eq

public class el extends s
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, ac, ah, ai, o, r, z
{

    private static final String a = com/jcp/fragments/el.getSimpleName();
    private static ProductListEntityContainer aw;
    private List aA;
    private String aB;
    private String aC;
    private String aD;
    private int aE;
    private String aF;
    private TextView aG;
    private RelativeLayout aH;
    private ImageView aI;
    private TextView aJ;
    private AnimationDrawable aK;
    private boolean aL;
    private List aM;
    private RelativeLayout aN;
    private com.jcp.a.a aO;
    private q aP;
    private m aQ;
    private FrameLayout aR;
    private Button aS;
    private BackToTopButton aT;
    private Boolean aU;
    private TextView aV;
    private ProductListEntityContainer aW;
    private boolean aX;
    private com.jcp.c.aa aj;
    private com.jcp.c.g ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private String ar;
    private String as;
    private ListView at;
    private ProgressBar au;
    private p av;
    private List ax;
    private List ay;
    private List az;
    private TextView b;
    private Button c;
    private LinearLayout d;
    private LinearLayout e;
    private View f;
    private ProductListAdapter g;
    private View h;
    private com.jcp.c.ah i;

    public el()
    {
        ax = new ArrayList();
        ay = new ArrayList();
        az = new ArrayList();
        aA = new ArrayList();
        an = true;
        aL = false;
        aU = Boolean.valueOf(false);
    }

    public static ProductListEntityContainer U()
    {
        return aw;
    }

    private void V()
    {
        aP = new eo(this);
        at.setRecyclerListener(new ep(this));
    }

    private void W()
    {
        aQ = null;
        if (g != null)
        {
            ProductListAdapter productlistadapter = g;
            if (ProductListAdapter.a() != -1)
            {
                ProductListAdapter productlistadapter1 = g;
                ProductListAdapter.c();
            }
        }
    }

    private void X()
    {
        if (b != null && g != null && aw != null)
        {
            b.setText(String.format(i().getResources().getString(0x7f070352), new Object[] {
                Integer.valueOf(g.getCount()), aw.getCount()
            }));
        }
    }

    private void Z()
    {
        int j1 = ao();
        int i1 = 24;
        if (j1 > 1)
        {
            i1 = 24 / j1;
        }
        aT.setTriggerHeight(i1);
    }

    static TextView a(el el1, TextView textview)
    {
        el1.aG = textview;
        return textview;
    }

    static com.jcp.c.g a(el el1)
    {
        return el1.ak;
    }

    static m a(el el1, m m1)
    {
        el1.aQ = m1;
        return m1;
    }

    private List a(RecommendedProduct recommendedproduct)
    {
        Object obj = recommendedproduct.getPrices();
        recommendedproduct = new ArrayList();
        ProductListPriceEntity productlistpriceentity;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); recommendedproduct.add(productlistpriceentity))
        {
            Price price = (Price)((Iterator) (obj)).next();
            productlistpriceentity = new ProductListPriceEntity();
            productlistpriceentity.setMax(price.getMax());
            productlistpriceentity.setMin(price.getMin());
            productlistpriceentity.setType(price.getType());
        }

        return recommendedproduct;
    }

    private void a(int i1, String s1)
    {
        if (aQ != null)
        {
            double d1 = i1 / 1000;
            aQ.a(String.valueOf(d1));
            aQ.b(s1);
            com.jcp.h.c.a(aQ);
            return;
        } else
        {
            com.jcp.util.ae.a(a, (new StringBuilder()).append("VideoTaggingAttributes are Null for action : ").append(s1).toString());
            return;
        }
    }

    private void a(View view)
    {
        aN = (RelativeLayout)view.findViewById(0x7f0e02ad);
        c = (Button)view.findViewById(0x7f0e02af);
        d = (LinearLayout)view.findViewById(0x7f0e02aa);
        e = (LinearLayout)view.findViewById(0x7f0e02ac);
        au = (ProgressBar)view.findViewById(0x7f0e02b9);
        at = (ListView)view.findViewById(0x7f0e02b8);
        b(view);
        if (!ao)
        {
            f = ((LayoutInflater)i().getSystemService("layout_inflater")).inflate(0x7f03009f, null, false);
            aa();
            at.setOnScrollListener(this);
        }
        at.setVisibility(8);
        b = (TextView)view.findViewById(0x7f0e02b7);
        c(view);
        d.setVisibility(8);
        aH = (RelativeLayout)view.findViewById(0x7f0e04db);
        aH.setOnTouchListener(new em(this));
        aI = (ImageView)view.findViewById(0x7f0e04dd);
        aJ = (TextView)view.findViewById(0x7f0e04de);
        aK = new AnimationDrawable();
        com.jcp.util.a.a(aK, aI, i());
        ((ImageView)view.findViewById(0x7f0e04dc)).setOnClickListener(new en(this));
        V();
    }

    private void a(ListView listview, int i1, int j1, int k1, ListAdapter listadapter)
    {
        if (i1 > 0 && j1 > 0 && k1 > 0)
        {
            if (j1 != k1)
            {
                i1 = (i1 * j1) / k1;
            }
            if (i1 > 0)
            {
                j1 = listadapter.getCount() - 1;
                if (i1 >= j1)
                {
                    i1 = j1;
                }
                listview.setSelection(i1);
            }
        }
    }

    private void a(ListView listview, ProductListAdapter productlistadapter)
    {
        a(listview, productlistadapter, 0, 1);
    }

    private void a(ListView listview, ProductListAdapter productlistadapter, int i1, int j1)
    {
        int k1 = ao();
        productlistadapter.a(k1);
        productlistadapter = new bj(i(), productlistadapter, k1, (int)j().getDimension(0x7f08008f));
        listview.setAdapter(productlistadapter);
        a(listview, i1, j1, k1, ((ListAdapter) (productlistadapter)));
    }

    static void a(el el1, int i1, String s1)
    {
        el1.a(i1, s1);
    }

    static void a(el el1, Bundle bundle)
    {
        el1.l(bundle);
    }

    static void a(el el1, ListView listview, ProductListAdapter productlistadapter, int i1, int j1)
    {
        el1.a(listview, productlistadapter, i1, j1);
    }

    private void a(ProductListContentEntity productlistcontententity)
    {
        if (productlistcontententity != null && !com.jcp.util.ah.a(productlistcontententity.getElements()))
        {
            productlistcontententity = (ProductListContentElement)productlistcontententity.getElements().get(0);
            if (!bq.a(productlistcontententity.getData()))
            {
                View view = LayoutInflater.from(i()).inflate(0x7f0300c3, null, false);
                view.setTag("banner");
                ImageView imageview = (ImageView)view.findViewById(0x7f0e03c7);
                if (at.getHeaderViewsCount() > 0)
                {
                    View view1 = at.findViewWithTag("banner");
                    if (view1 != null)
                    {
                        at.removeHeaderView(view1);
                    }
                }
                at.addHeaderView(view);
                com.jcp.g.a.a().a(productlistcontententity.getData()).b(0x7f02017f).a(imageview);
            }
        }
    }

    private void a(ProductListEntityContainer productlistentitycontainer)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (TextUtils.isEmpty(aB) && !am)
        {
            aB = bv.a(productlistentitycontainer.getName());
            a(aB, ((Activity) (i())));
        }
        au.setVisibility(8);
        at.setVisibility(0);
        if (!ao)
        {
            ab();
        }
        if (productlistentitycontainer != null)
        {
            ax.clear();
            ay.clear();
            az.clear();
            aw = productlistentitycontainer;
            a(productlistentitycontainer.getContent());
            if (aX)
            {
                com.jcp.h.g.a(a(), T(), S());
                aX = false;
            }
            if (b != null)
            {
                if (aw.getCount() != null && aw.getCount().intValue() > 0)
                {
                    X();
                } else
                {
                    b.setVisibility(8);
                }
                if (aw.getAlternateMessage() != null)
                {
                    ad();
                }
                ac();
            }
            if (productlistentitycontainer.getProducts() != null)
            {
                ax.addAll(productlistentitycontainer.getProducts());
                aE = ax.size();
            } else
            {
                aw = null;
            }
        } else
        {
            aw = null;
        }
        if (ay.isEmpty() && productlistentitycontainer != null && productlistentitycontainer.getPages() != null)
        {
            ay.addAll(productlistentitycontainer.getPages());
        }
        if (ah() && c != null)
        {
            c(8);
        }
        if (productlistentitycontainer != null && productlistentitycontainer.getRelatedTerms() != null && productlistentitycontainer.getRelatedTerms().size() > 0)
        {
            az.addAll(productlistentitycontainer.getRelatedTerms());
            a(az);
        }
        a(at, an());
    }

    private void a(String s1, String s2)
    {
        android.support.v4.app.ac ac1 = i();
        if (bt.a(ac1))
        {
            ((MainActivity)ac1).a(s1, s2);
            return;
        } else
        {
            ad();
            return;
        }
    }

    private void a(boolean flag, String s1)
    {
        ProductDetailFragment productdetailfragment;
        Bundle bundle;
        productdetailfragment = new ProductDetailFragment();
        bundle = new Bundle();
        bundle.putBoolean(j().getString(0x7f070246), flag);
        bundle.putString(j().getString(0x7f07031b), s1);
        bundle.putBoolean(j().getString(0x7f07031f), true);
        s1 = h();
        if (!s1.containsKey("breadcrumbs")) goto _L2; else goto _L1
_L1:
        s1 = s1.getStringArrayList("breadcrumbs");
        if (s1 != null && s1.size() > 0)
        {
            bundle.putStringArrayList("breadcrumbs", new ArrayList(s1));
        }
_L4:
        productdetailfragment.g(bundle);
        s1 = a(i());
        if (s1 != null)
        {
            s1.c(productdetailfragment, "ProductDetailFragment");
        }
        return;
_L2:
        if (s1.containsKey("SEARCH") && s1.containsKey("SEARCH_TAG"))
        {
            bundle.putBoolean("SEARCH", true);
            bundle.putString("SEARCH_TAG", s1.getString("SEARCH_TAG"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(float f1)
    {
        return f1 % 1.0F != 0.0F;
    }

    public static boolean a(File file)
    {
        if (file != null && file.isDirectory())
        {
            String as1[] = file.list();
            for (int i1 = 0; i1 < as1.length; i1++)
            {
                if (!a(new File(file, as1[i1])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    private void aa()
    {
        if (at != null && f != null && !f.isShown())
        {
            at.addFooterView(f);
        }
    }

    private void ab()
    {
        if (at != null && f != null && f.isShown())
        {
            at.removeFooterView(f);
        }
    }

    private void ac()
    {
        if (aw.getRedirectUrl() == null || aw.getRedirectUrl().size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new ArrayList();
        ((List) (obj)).addAll(aw.getRedirectUrl());
        if (!c(((List) (obj)))) goto _L4; else goto _L3
_L3:
        String s1;
        boolean flag;
        boolean flag1 = false;
        s1 = d(((List) (obj)));
        flag = flag1;
        if (s1.startsWith(a(0x7f070164)))
        {
            flag = flag1;
            if (i() != null)
            {
                flag = com.jcp.util.g.a().d(s1);
            }
        }
        obj = e(((List) (obj)));
        if (!flag) goto _L6; else goto _L5
_L5:
        a(s1, ((String) (obj)));
_L8:
        return;
_L6:
        if (s1.startsWith(j().getString(0x7f0700e4)))
        {
            g(com.jcp.b.b.v(s1));
            return;
        } else
        {
            ad();
            return;
        }
_L4:
        ad();
        return;
_L2:
        if (aw.getCount() != null && aw.getCount().intValue() == 0 && !TextUtils.isEmpty(aC))
        {
            ad();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void ad()
    {
        Object obj1 = (RelativeLayout)h.findViewById(0x7f0e02b2);
        Object obj = (RelativeLayout)h.findViewById(0x7f0e02ad);
        ((RelativeLayout) (obj1)).setVisibility(0);
        String s1 = aw.getAlternateMessage();
        if (s1 != null)
        {
            ((RelativeLayout) (obj1)).findViewById(0x7f0e02b4).setVisibility(0);
            obj = (HtmlTypefaceTextView)((RelativeLayout) (obj1)).findViewById(0x7f0e02b6);
            if (aw.getCount().intValue() <= 0)
            {
                ai();
                b.setVisibility(8);
                c(8);
            }
            ((HtmlTypefaceTextView) (obj)).setHtmlText(s1);
            ((HtmlTypefaceTextView) (obj)).setMovementMethod(new er(this, s1));
            com.jcp.util.ae.c(a, j().getString(0x7f0703b6));
            return;
        } else
        {
            TextView textview = (TextView)((RelativeLayout) (obj1)).findViewById(0x7f0e02b3);
            obj1 = new SpannableString((new StringBuilder()).append(j().getString(0x7f070325)).append(" \n").append(aC).toString());
            ((Spannable) (obj1)).setSpan(new ForegroundColorSpan(0xff000000), 39, aC.length() + 39, 33);
            ((Spannable) (obj1)).setSpan(new StyleSpan(1), 39, aC.length() + 39, 33);
            ((Spannable) (obj1)).setSpan(new RelativeSizeSpan(0.9F), 39, aC.length() + 39, 33);
            textview.setText(((CharSequence) (obj1)));
            ((RelativeLayout) (obj)).setBackgroundColor(Color.parseColor("#f0f0f0"));
            textview.setMovementMethod(LinkMovementMethod.getInstance());
            b.setVisibility(8);
            c(8);
            return;
        }
    }

    private String ae()
    {
        String s1;
        String s2;
        if (aw.getName() == null)
        {
            s1 = "";
        } else
        {
            s1 = aw.getName();
        }
        s2 = s1;
        if (s1.startsWith("SHOP"))
        {
            s2 = s1.substring(5, s1.length());
        }
        return s2;
    }

    private String af()
    {
label0:
        {
            if (aw == null)
            {
                break label0;
            }
            Object obj = aw.getSortOptions();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            ProductListSortOptionEntity productlistsortoptionentity;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                productlistsortoptionentity = (ProductListSortOptionEntity)((Iterator) (obj)).next();
            } while (!productlistsortoptionentity.getSelected().booleanValue());
            return productlistsortoptionentity.getName();
        }
        return null;
    }

    private boolean ag()
    {
        return i().getFragmentManager().findFragmentByTag(j().getString(0x7f070320)) != null && i().getFragmentManager().findFragmentByTag(j().getString(0x7f070320)).isVisible();
    }

    private boolean ah()
    {
        if (aw != null && aw.getSortOptions() != null)
        {
            return aw.getSortOptions().isEmpty();
        } else
        {
            return true;
        }
    }

    private void ai()
    {
        boolean flag;
        flag = true;
        synchronized (aU)
        {
            if (aU.booleanValue())
            {
                flag = false;
            }
        }
        if (flag)
        {
            synchronized (aU)
            {
                aU = Boolean.valueOf(true);
            }
            if (au != null)
            {
                au.setVisibility(0);
            }
            obj = new ab(i());
            ((ab) (obj)).a(com.jcp.b.b.E(aC), b.i);
            ((ab) (obj)).a(this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void aj()
    {
        aI.setImageDrawable(aK);
        aK.start();
        aH.setVisibility(0);
    }

    private void ak()
    {
        aH.setVisibility(8);
        aK.stop();
    }

    private SharedPreferences al()
    {
        return i().getSharedPreferences("com.jcp.activities", 0);
    }

    private void am()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
        int i1;
        if (bt.a(i()) == 0)
        {
            boolean flag = al().getBoolean("show_products_as_list", true);
            Button button;
            if (flag)
            {
                i1 = 0x7f020146;
            } else
            {
                i1 = 0x7f020148;
            }
            aS.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
            button = aS;
            if (flag)
            {
                i1 = 0x7f07020a;
            } else
            {
                i1 = 0x7f070274;
            }
            button.setText(i1);
            layoutparams.width = 0;
            layoutparams.weight = 1.0F;
            i1 = 0;
        } else
        {
            i1 = 8;
            layoutparams.width = -1;
        }
        aR.setVisibility(i1);
        c.setLayoutParams(layoutparams);
    }

    private ProductListAdapter an()
    {
        g = new ProductListAdapter(i(), ax, this, aP);
        g.a(this);
        X();
        return g;
    }

    private int ao()
    {
        if (bt.a(i()) == 0 && al().getBoolean("show_products_as_list", true))
        {
            return 1;
        } else
        {
            return j().getInteger(0x7f0b0000);
        }
    }

    private SavedItems b(String s1, String s2)
    {
        s1 = (SavedItems[])com.jcp.util.aa.a(new InputStreamReader(new ByteArrayInputStream(s1.getBytes())), [Lcom/jcp/pojo/SavedItems;);
        JCP.b().a(s1);
        for (int i1 = 0; i1 < s1.length; i1++)
        {
            if (s1[i1].getPpId().equals(s2))
            {
                return s1[i1];
            }
        }

        return null;
    }

    private List b(RecommendedProduct recommendedproduct)
    {
        Object obj = recommendedproduct.getImages();
        recommendedproduct = new ArrayList();
        ProductListImageEntity productlistimageentity;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); recommendedproduct.add(productlistimageentity))
        {
            Image image = (Image)((Iterator) (obj)).next();
            productlistimageentity = new ProductListImageEntity();
            productlistimageentity.setUrl(image.getUrl());
            productlistimageentity.setSwatchUrl(image.getSwatchUrl());
            productlistimageentity.setType(image.getType());
            productlistimageentity.setAltText(image.getAltText());
        }

        return recommendedproduct;
    }

    private void b(int i1)
    {
        ab();
        al = false;
        if (au != null)
        {
            au.setVisibility(8);
        }
        if (n())
        {
            com.jcp.util.au.a(i(), j().getString(0x7f070322));
        }
    }

    private void b(int i1, String s1)
    {
        String s2 = null;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L7:
        if (i1 >= aA.size()) goto _L4; else goto _L3
_L3:
        if (((ProductListSortOptionEntity)aA.get(i1)).getName().replace(" ", "").contains(s1.replace(" ", "").toLowerCase()))
        {
            s2 = ((ProductListSortOptionEntity)aA.get(i1)).getUrl();
        }
          goto _L5
_L4:
        if (!am)
        {
            au.setVisibility(0);
            av.a(this);
            if (ax != null)
            {
                ax.clear();
            }
            av.b(com.jcp.b.b.w(s2));
        }
_L2:
        return;
        s1;
        com.jcp.util.ae.a(a, (new StringBuilder()).append("IndexOutOfBoundsException : getting entity value from desired array list : ").append(s1).toString());
        s1.printStackTrace();
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void b(Context context)
    {
        context = context.getCacheDir();
        if (context != null && context.isDirectory())
        {
            a(context);
        }
    }

    private void b(View view)
    {
        aT = (BackToTopButton)view.findViewById(0x7f0e02a6);
        aT.setListView(at);
    }

    static void b(el el1)
    {
        el1.ak();
    }

    static ProductListAdapter c(el el1)
    {
        return el1.g;
    }

    private void c(int i1)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)aR.getLayoutParams();
        if (i1 == 8)
        {
            layoutparams.width = -1;
        } else
        {
            layoutparams.width = 0;
            layoutparams.weight = 1.0F;
        }
        c.setVisibility(i1);
        aR.setLayoutParams(layoutparams);
    }

    private void c(Bundle bundle)
    {
        if (bundle != null)
        {
            ap = bundle.getBoolean("showSearch", false);
            ao = bundle.getBoolean("pagingDisabled", false);
            ar = bundle.getString("SELECTED_VALUE", null);
            aB = bundle.getString("Title", null);
            an = bundle.getBoolean("progress", false);
            am = bundle.getBoolean("SEARCH", false);
            aF = bundle.getString(j().getString(0x7f070404), null);
            aC = bundle.getString("SEARCH_TAG", null);
            aM = bundle.getStringArrayList("categoryProductsSkuIds");
            aq = bundle.getBoolean("resultsIncluded", false);
            as = bundle.getString("response", null);
            aW = (ProductListEntityContainer)bundle.getParcelable("PRODUCT_LIST_CACHE");
        }
    }

    private void c(View view)
    {
        aR = (FrameLayout)view.findViewById(0x7f0e02b0);
        aS = (Button)view.findViewById(0x7f0e02b1);
        am();
        aR.setOnClickListener(new es(this));
    }

    private boolean c(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            SearchRedirectUrl searchredirecturl = (SearchRedirectUrl)list.next();
            if (searchredirecturl.getChannel().equals("mobile"))
            {
                list = searchredirecturl.getUrl();
                if (list != null)
                {
                    return list.contains("jcpenney.com");
                } else
                {
                    return false;
                }
            }
        }

        return false;
    }

    static m d(el el1)
    {
        return el1.aQ;
    }

    private String d(List list)
    {
        String s1 = null;
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            if (((SearchRedirectUrl)list.get(i1)).getChannel().equals(j().getString(0x7f070295)))
            {
                s1 = ((SearchRedirectUrl)list.get(i1)).getUrl();
            }
        }

        return h(s1);
    }

    private String e(List list)
    {
        Object obj = null;
        int i1 = 0;
        String s1 = null;
        for (; i1 < list.size(); i1++)
        {
            if (((SearchRedirectUrl)list.get(i1)).getChannel().equals(j().getString(0x7f070295)))
            {
                s1 = ((SearchRedirectUrl)list.get(i1)).getUrl();
            }
        }

        list = obj;
        if (s1.contains(j().getString(0x7f070123)))
        {
            list = s1.split(j().getString(0x7f070123))[1];
        }
        return list;
    }

    static void e(el el1)
    {
        el1.W();
    }

    static TextView f(el el1)
    {
        return el1.aG;
    }

    private void f(String s1)
    {
        s1 = i(s1);
        if (s1 != null)
        {
            a(s1, 84);
        }
    }

    private void f(List list)
    {
        if (ax != null)
        {
            ax.clear();
        }
        a(at, an());
        if (!ao)
        {
            ab();
        }
        aO = av.a(list, this);
    }

    static ListView g(el el1)
    {
        return el1.at;
    }

    private void g(String s1)
    {
        if (ax != null)
        {
            ax.clear();
            if (g != null)
            {
                g.notifyDataSetChanged();
            }
        }
        if (ay.size() != 0)
        {
            ay.clear();
        }
        av.b(s1);
    }

    private void g(List list)
    {
        aO = av.a(list, this);
    }

    static int h(el el1)
    {
        return el1.ao();
    }

    private String h(String s1)
    {
        if (s1.contains("id="))
        {
            return s1.split("id=")[1].split("&")[0];
        } else
        {
            return j().getString(0x7f0702bd);
        }
    }

    static SharedPreferences i(el el1)
    {
        return el1.al();
    }

    private ProductListEntityContainer i(String s1)
    {
        return (ProductListEntityContainer)com.jcp.util.aa.a(s1, com/jcp/productlistentity/ProductListEntityContainer);
    }

    static void j(el el1)
    {
        el1.am();
    }

    static void k(el el1)
    {
        el1.Z();
    }

    static ProductListAdapter l(el el1)
    {
        return el1.an();
    }

    private void l(Bundle bundle)
    {
        el el1 = new el();
        el1.g(bundle);
        bundle = a(i());
        if (bundle != null)
        {
            bundle.b(el1, "ProductListFragment");
        }
    }

    protected f S()
    {
        Object obj = null;
        String s3 = null;
        Object obj1 = JCP.A();
        Object obj2 = JCP.B();
        d d1 = bi.a(aw.getFilters());
        String s4 = af();
        if (obj1 != null || obj2 != null || d1 != null || !TextUtils.isEmpty(s4))
        {
            String s1;
            String s2;
            if (obj1 != null)
            {
                obj = ((d) (obj1)).a();
                obj1 = ((d) (obj1)).b();
            } else
            {
                obj1 = null;
                obj = null;
            }
            if (obj2 != null)
            {
                s1 = ((d) (obj2)).a();
                obj2 = ((d) (obj2)).b();
            } else
            {
                obj2 = null;
                s1 = null;
            }
            if (d1 != null)
            {
                s2 = d1.a();
                s3 = d1.b();
            } else
            {
                s2 = null;
            }
            com.jcp.util.ae.d(a, "Product List pageview values");
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Top type = ").append(s2).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Top value = ").append(s3).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Current type = ").append(s2).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Current value = ").append(s3).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Combo type = ").append(s2).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Combo value = ").append(s3).toString());
            com.jcp.util.ae.d(a, (new StringBuilder()).append("Sort by value = ").append(s4).toString());
            obj = com.jcp.h.f.a(((String) (obj)), ((String) (obj1)), s1, ((String) (obj2)), s2, s3, s4);
        }
        return ((f) (obj));
    }

    protected String T()
    {
        return com.jcp.h.g.a(h());
    }

    protected boolean Y()
    {
        return false;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = layoutinflater.inflate(0x7f030072, viewgroup, false);
        layoutinflater = i();
        aV = (TextView)layoutinflater.findViewById(0x7f0e045d);
        ap = h().getBoolean("showSearch", true);
        if (ap)
        {
            i().findViewById(0x7f0e0164).setVisibility(0);
        }
        ao = h().getBoolean("pagingDisabled", false);
        ar = h().getString("SELECTED_VALUE");
        viewgroup = h().getString("Title");
        if (viewgroup != null)
        {
            aB = bv.a(viewgroup);
        }
        if (h().containsKey("progress"))
        {
            an = h().getBoolean("progress");
        }
        if (h().containsKey("SEARCH"))
        {
            am = h().getBoolean("SEARCH");
            aF = h().getString(j().getString(0x7f070404));
        }
        if (h().containsKey("SEARCH_TAG"))
        {
            aC = h().getString("SEARCH_TAG");
            aV.setText(aC);
        }
        if (h().containsKey("categoryProductsSkuIds"))
        {
            aM = h().getStringArrayList("categoryProductsSkuIds");
        }
        if (h().containsKey("resultsIncluded"))
        {
            aq = h().getBoolean("resultsIncluded");
            if (aq)
            {
                as = h().getString("response");
                if (!TextUtils.isEmpty(as))
                {
                    f(as);
                }
            }
        }
        c(bundle);
        a(h);
        c.setOnClickListener(this);
        av = new p(i());
        av.a(this);
        if (bundle != null)
        {
            a(aW);
        } else
        {
            a(ar, ((String) (viewgroup)), an);
        }
        i = new com.jcp.c.ah(layoutinflater);
        aj = new com.jcp.c.aa(layoutinflater);
        ak = new com.jcp.c.g(layoutinflater, this);
        b(layoutinflater);
        return h;
    }

    protected String a()
    {
        if (aw != null && !am)
        {
            String s1 = ae().toLowerCase();
            return (new StringBuilder()).append("Category:").append(bv.a(s1)).append("(").append(aw.getId()).append(")").toString();
        }
        if (am)
        {
            return "Search Results";
        } else
        {
            return "PRODUCTLIST";
        }
    }

    public void a(int i1, int j1)
    {
    }

    public void a(int i1, int j1, Intent intent)
    {
        super.a(i1, j1, intent);
        if (i1 == 102)
        {
            String s1 = intent.getStringExtra(j().getString(0x7f0702c5));
            intent = intent.getStringExtra(j().getString(0x7f07029f));
            b(Integer.parseInt(s1), intent);
        } else
        if (i1 == 100 && intent != null)
        {
            String s2 = intent.getStringExtra(j().getString(0x7f070321));
            aB = intent.getStringExtra("Title");
            boolean flag = intent.getBooleanExtra(j().getString(0x7f070126), true);
            String s3 = intent.getStringExtra("SEARCH_TAG");
            intent = intent.getStringExtra(j().getString(0x7f070404));
            com.jcp.util.ae.d("", (new StringBuilder()).append("received url   ").append(s2).toString());
            if (flag)
            {
                Bundle bundle = new Bundle();
                bundle.putString("SELECTED_VALUE", s2);
                bundle.putBoolean("progress", false);
                if (s2.contains(j().getString(0x7f0703b8)))
                {
                    am = true;
                    aC = s3;
                    aF = intent;
                }
                a(s2, aB, true);
                at.setVisibility(8);
                return;
            }
        }
    }

    public void a(int i1, String s1, int j1)
    {
        com.jcp.util.ae.d("ProductListFragment", (new StringBuilder()).append("onSuccess: ").append(i1).append("Response: ").append(s1).toString());
        break MISSING_BLOCK_LABEL_36;
        if (i() != null && n() && i1 == 200)
        {
            if (j1 == 41)
            {
                g.f();
                JCP.b().a(aD);
                JCP.e().b(aD);
                com.jcp.util.k.b(i());
                return;
            }
            if (j1 == 40)
            {
                if (!TextUtils.isEmpty(s1))
                {
                    s1 = b(s1, aD);
                    if (s1 != null && s1.getPpId() != null && s1.getPpId().equalsIgnoreCase(aD))
                    {
                        g.g();
                        g.a(false);
                        com.jcp.util.k.a(i());
                        JCP.e().a(aD, s1.getId());
                        return;
                    }
                } else
                {
                    JCP.b().a(null);
                    return;
                }
            }
        }
        return;
    }

    public void a(long l1)
    {
        if (aJ != null)
        {
            String s1 = j().getString(0x7f0702f8);
            aJ.setText(String.format(s1, new Object[] {
                Long.valueOf(l1)
            }));
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        JCP.C();
        aX = false;
    }

    public void a(RecommendationsEntityContainer recommendationsentitycontainer, int i1)
    {
        boolean flag;
        if (i() == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        flag = n();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        synchronized (aU)
        {
            aU = Boolean.valueOf(false);
        }
        return;
        exception;
        recommendationsentitycontainer;
        JVM INSTR monitorexit ;
        throw exception;
        if (au != null)
        {
            au.setVisibility(8);
        }
        if (i1 != 38 || recommendationsentitycontainer == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        recommendationsentitycontainer = recommendationsentitycontainer.getProducts();
        ax.clear();
        ProductListProductEntity productlistproductentity;
        for (recommendationsentitycontainer = recommendationsentitycontainer.iterator(); recommendationsentitycontainer.hasNext(); ax.add(productlistproductentity))
        {
            RecommendedProduct recommendedproduct = (RecommendedProduct)recommendationsentitycontainer.next();
            productlistproductentity = new ProductListProductEntity();
            productlistproductentity.setId(recommendedproduct.getId());
            productlistproductentity.setName(recommendedproduct.getName());
            productlistproductentity.setUrl(recommendedproduct.getUrl());
            productlistproductentity.setIsNew(Boolean.valueOf(recommendedproduct.isNew()));
            productlistproductentity.setIsPreOrder(Boolean.valueOf(recommendedproduct.isPreOrder()));
            productlistproductentity.setRating(recommendedproduct.getRating());
            productlistproductentity.setReviewCount(recommendedproduct.getReviewCount());
            productlistproductentity.setImages(b(recommendedproduct));
            productlistproductentity.setPrices(a(recommendedproduct));
        }

        break MISSING_BLOCK_LABEL_240;
        Exception exception1;
        exception1;
        synchronized (aU)
        {
            aU = Boolean.valueOf(false);
        }
        throw exception1;
        g.notifyDataSetChanged();
        recommendationsentitycontainer = ((LayoutInflater)i().getSystemService("layout_inflater")).inflate(0x7f0300cb, null, false);
        ((TextView)recommendationsentitycontainer.findViewById(0x7f0e0404)).setText(String.format(j().getString(0x7f0703c2), new Object[] {
            aC
        }));
        at.addHeaderView(recommendationsentitycontainer);
        synchronized (aU)
        {
            aU = Boolean.valueOf(false);
        }
        return;
        exception2;
        recommendationsentitycontainer;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        recommendationsentitycontainer;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    public void a(ProductList productlist, int i1)
    {
        while (i() == null || !n() || productlist == null) 
        {
            return;
        }
        Intent intent = new Intent(i(), com/jcp/activities/ar);
        intent.putExtra("ProductList", productlist);
        a(intent);
    }

    public void a(ProductListEntityContainer productlistentitycontainer, int i1)
    {
        a(productlistentitycontainer);
        aW = productlistentitycontainer;
    }

    public void a(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            b(i1);
            return;
        }
    }

    public void a(String s1, String s2, boolean flag)
    {
        au.setVisibility(0);
        if (s2 != null)
        {
            a(b(s2), ((Activity) (i())));
        } else
        {
            a(j().getString(0x7f07032b), ((Activity) (i())));
        }
        b.setText("");
        if (aM != null)
        {
            d.setVisibility(8);
            aN.setVisibility(8);
            if (aM.size() > 10)
            {
                s1 = aM.subList(0, 10);
            } else
            {
                s1 = aM;
            }
            f(s1);
        } else
        {
            if (s1 != null && s1.contains(j().getString(0x7f0700e4)))
            {
                g(s1);
                return;
            }
            if (am)
            {
                s2 = s1;
                if (s1 != null)
                {
                    s2 = s1;
                    if (!s1.contains(j().getString(0x7f070422)))
                    {
                        s2 = com.jcp.b.b.w(s1);
                    }
                }
                if (am)
                {
                    aw = null;
                    ax.clear();
                    a(j().getString(0x7f0703b9), ((Activity) (i())));
                }
                av.b(s2);
                return;
            }
        }
    }

    public void a(List list)
    {
        d.setVisibility(0);
        e.removeAllViews();
        LayoutInflater layoutinflater = (LayoutInflater)i().getSystemService("layout_inflater");
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            View view = layoutinflater.inflate(0x7f0300cf, null);
            TextView textview = (TextView)view.findViewById(0x7f0e0414);
            textview.setText(bv.a(((SearchRelatedTermEntity)list.get(i1)).getText()));
            textview.setTag(((SearchRelatedTermEntity)list.get(i1)).getUrl());
            textview.setOnClickListener(new eq(this, textview));
            e.addView(view);
        }

    }

    public void a(boolean flag, String s1, int i1)
    {
        aD = s1;
        if (flag)
        {
            if (i != null)
            {
                i.a(s1, i1, "");
                i.a(this);
            }
        } else
        if (aj != null)
        {
            aj.b(com.jcp.b.b.l(JCP.e().a(aD)));
            aj.a(this);
            return;
        }
    }

    public void a_(int i1)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            ak();
            com.jcp.util.au.a(i(), j().getString(0x7f0701bb), j().getString(0x7f07023b));
            return;
        }
    }

    public String b(String s1)
    {
        String s2 = s1;
        if (s1.toLowerCase().startsWith(j().getString(0x7f07040c)))
        {
            s2 = s1.toLowerCase().substring(j().getString(0x7f07040c).length());
        }
        return bv.b(s2);
    }

    public void b()
    {
        a(true);
        a(aB);
        super.b();
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
        if (h().containsKey("SEARCH_TAG"))
        {
            aC = h().getString("SEARCH_TAG");
            aV.setText(aC);
            ((TextView)i().findViewById(0x7f0e045d)).setText(aC);
        }
    }

    public void b(int i1, int j1)
    {
        while (i() == null || !n() || j1 != 4 || i1 != 201) 
        {
            return;
        }
        aj.d();
        aj.a(this);
    }

    public void b(ProductListEntityContainer productlistentitycontainer, int i1)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (productlistentitycontainer != null)
        {
            productlistentitycontainer = productlistentitycontainer.getProducts();
            if (productlistentitycontainer != null)
            {
                ax.addAll(productlistentitycontainer);
                aE = ax.size();
                if (aW != null)
                {
                    List list = aW.getProducts();
                    if (list != null)
                    {
                        list.addAll(productlistentitycontainer);
                    }
                }
            }
        }
        g.notifyDataSetChanged();
        X();
        al = false;
    }

    public void b(String s1, int i1)
    {
        while (i() == null || !n() || TextUtils.isEmpty(s1)) 
        {
            return;
        }
        com.jcp.util.au.a(i(), s1);
    }

    public void b(List list)
    {
        if (i() != null && n())
        {
            ax.addAll(list);
            al = false;
            aE = ax.size();
            if (au.getVisibility() != 8)
            {
                au.setVisibility(8);
            }
            at.setVisibility(0);
            if (g != null)
            {
                g.notifyDataSetChanged();
                return;
            }
        }
    }

    public void c()
    {
        ak();
        if (i() == null || !n())
        {
            return;
        } else
        {
            com.jcp.util.au.a(i(), j().getString(0x7f0702af), j().getString(0x7f0702ae));
            return;
        }
    }

    public void c(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if ((i1 == 400 || i1 == 404 || i1 == 500) && errormessageentitycontainer != null && !TextUtils.isEmpty(errormessageentitycontainer.getErrorMessage()) && n())
        {
            com.jcp.util.au.a(i(), errormessageentitycontainer.getErrorMessage());
        }
    }

    public void c(String s1)
    {
        ak();
        if (i() != null && n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        s1 = i(s1);
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s1.getProducts();
        if (s1 == null || s1.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = false;
        ax.clear();
        ax.addAll(s1);
        aE = ax.size();
        ab();
        c(8);
        if (g == null)
        {
            an();
        }
        g.e(true);
        g.notifyDataSetChanged();
        aL = true;
        a(j().getString(0x7f0703fe), i());
_L4:
        if (flag)
        {
            c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = true;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void c(String s1, int i1)
    {
        if (i1 == 40)
        {
            if (!JCP.e().a(s1).equals("null") && !ax.isEmpty() && ax.size() >= com.jcp.b.a.h())
            {
                ((ProductListProductEntity)ax.get(com.jcp.b.a.h())).setSaved(true);
                if (g != null)
                {
                    g.notifyDataSetChanged();
                }
            }
        } else
        if (i1 == 41 && JCP.e().a(s1).equals(j().getString(0x7f0702bd)) && !ax.isEmpty() && ax.size() >= com.jcp.b.a.h())
        {
            ((ProductListProductEntity)ax.get(com.jcp.b.a.h())).setSaved(false);
            if (g != null)
            {
                g.notifyDataSetChanged();
                return;
            }
        }
    }

    public void d(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
    }

    public void d(String s1)
    {
        ak();
        if (i() == null || !n())
        {
            return;
        }
        if (!TextUtils.isEmpty(s1))
        {
            a(false, s1);
            return;
        } else
        {
            c();
            return;
        }
    }

    public void d(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            b(i1);
            return;
        }
    }

    public void e(Bundle bundle)
    {
        bundle.putBoolean("showSearch", ap);
        bundle.putBoolean("pagingDisabled", ao);
        if (!TextUtils.isEmpty(ar))
        {
            bundle.putString("SELECTED_VALUE", ar);
        }
        if (!TextUtils.isEmpty(aB))
        {
            bundle.putString("Title", aB);
        }
        bundle.putBoolean("progress", an);
        bundle.putBoolean("SEARCH", am);
        if (TextUtils.isEmpty(aF))
        {
            bundle.putString(j().getString(0x7f070404), aF);
        }
        if (TextUtils.isEmpty(aC))
        {
            bundle.putString("SEARCH_TAG", aC);
        }
        if (aM != null)
        {
            bundle.putStringArrayList("categoryProductsSkuIds", (ArrayList)aM);
        }
        bundle.putBoolean("resultsIncluded", aq);
        if (TextUtils.isEmpty(as))
        {
            bundle.putString("response", as);
        }
        if (aW != null)
        {
            bundle.putParcelable("PRODUCT_LIST_CACHE", aW);
        }
        super.e(bundle);
    }

    public void e(String s1)
    {
        aj();
        ak.c(s1);
    }

    public void f()
    {
        if (aO != null)
        {
            aO.cancel(true);
        }
        super.f();
    }

    public void f(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (au != null)
        {
            au.setVisibility(8);
        }
        synchronized (aU)
        {
            aU = Boolean.valueOf(false);
        }
        return;
        exception;
        s1;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        synchronized (aU)
        {
            aU = Boolean.valueOf(false);
        }
        throw exception1;
        exception2;
        s1;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public void f_()
    {
        super.f_();
        aX = true;
        if (ag())
        {
            i().findViewById(0x7f0e0164).setVisibility(0);
        }
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131624623 2131624623: default 24
    //                   2131624623 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (aw != null && aw.getSortOptions() != null && aw.getFilters() != null)
        {
            view = new Intent(i(), com/jcp/activities/ProductFilterSortActivity);
            view.putExtra("Title", aB);
            if (am)
            {
                view.putExtra("SEARCH", am);
                view.putExtra("SEARCH_TAG", aC);
            }
            a(view, 100);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
_L2:
        return;
        if (!n() || g == null) goto _L2; else goto _L1
_L1:
        try
        {
            com.jcp.b.b.d(false);
            adapterview = (ProductListProductEntity)g.getItem(i1);
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            com.jcp.util.ae.a(a, (new StringBuilder()).append("IllegalArgumentException : while getting entity object ").append(adapterview).toString());
            adapterview.printStackTrace();
            return;
        }
        if (adapterview == null) goto _L2; else goto _L3
_L3:
        view = adapterview.getId();
        if (!TextUtils.isEmpty(view))
        {
            a(adapterview.isSaved(), view);
            com.jcp.b.a.a(i1);
            return;
        }
          goto _L2
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        aT.onScroll(abslistview, i1, j1, k1);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (!aL)
        {
            aT.onScrollStateChanged(abslistview, i1);
            if (i1 == 0 && !al)
            {
                float f1 = (float)aE / 24F;
                int j1 = (int)f1;
                i1 = j1;
                if (a(f1))
                {
                    i1 = j1 + 1;
                }
                if (aM != null && aM.size() > aE)
                {
                    aa();
                    int k1 = aE + 10;
                    i1 = k1;
                    if (k1 >= aM.size())
                    {
                        i1 = aM.size() - 1;
                    }
                    abslistview = aM.subList(aE, i1);
                    if (abslistview.size() > 0)
                    {
                        g(abslistview);
                        al = true;
                        return;
                    } else
                    {
                        ab();
                        return;
                    }
                }
                if (ay != null && i1 < ay.size())
                {
                    if (at.getLastVisiblePosition() >= at.getCount() - 1)
                    {
                        aa();
                        if (!aT.b())
                        {
                            Z();
                        }
                        al = true;
                        String s1 = com.jcp.b.b.w(((ProductListPageEntity)ay.get(i1)).getUrl());
                        abslistview = s1;
                        if (am)
                        {
                            abslistview = s1;
                            if (aF != null)
                            {
                                abslistview = (new StringBuilder()).append(s1).append("&sortBy=").append(aF).toString();
                            }
                        }
                        av.a(abslistview);
                        return;
                    }
                } else
                {
                    ab();
                    return;
                }
            }
        }
    }

    public void u()
    {
        b(i());
        super.u();
    }

}
