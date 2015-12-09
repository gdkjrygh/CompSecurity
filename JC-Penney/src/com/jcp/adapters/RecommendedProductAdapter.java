// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.b.a;
import com.jcp.model.Price;
import com.jcp.productentity.Image;
import com.jcp.recommendation.myrecs.RecommendedProduct;
import com.jcp.util.af;
import com.jcp.util.ah;
import com.jcp.util.y;
import com.jcp.widget.ProductRating;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            cf

public class RecommendedProductAdapter extends BaseAdapter
{

    private static final String a = com/jcp/adapters/RecommendedProductAdapter.getSimpleName();
    private final Context b;
    private final int c;
    private final List d;
    private final boolean e;

    public RecommendedProductAdapter(Context context, int i, List list, boolean flag)
    {
        b = context;
        c = i;
        d = list;
        e = flag;
    }

    static Context a(RecommendedProductAdapter recommendedproductadapter)
    {
        return recommendedproductadapter.b;
    }

    private String a(String s, String s1)
    {
        if (s.equals(s1))
        {
            return String.format(b.getString(0x7f0702d5), new Object[] {
                String.valueOf(s)
            });
        } else
        {
            return String.format(b.getString(0x7f0702d6), new Object[] {
                String.valueOf(s), String.valueOf(s1)
            });
        }
    }

    private String a(String s, String s1, String s2)
    {
        s2 = com.jcp.b.a.a(b, s2);
        if (s.equals(s1))
        {
            return String.format(b.getString(0x7f070393), new Object[] {
                s2, String.valueOf(s)
            });
        } else
        {
            return String.format(b.getString(0x7f070394), new Object[] {
                s2, String.valueOf(s), String.valueOf(s1)
            });
        }
    }

    private void a(ViewHolder viewholder)
    {
        viewholder.product.setVisibility(8);
        viewholder.personalizedRecommendation.setVisibility(0);
        Boolean boolean1 = Boolean.valueOf(JCP.s().c());
        if (boolean1.booleanValue())
        {
            viewholder.userName.setVisibility(0);
            viewholder.tvFor.setVisibility(0);
            try
            {
                String s = af.a(b).f();
                if (!TextUtils.isEmpty(s))
                {
                    viewholder.userName.setAllCaps(true);
                    viewholder.userName.setText(s);
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        } else
        {
            viewholder.userName.setVisibility(4);
            viewholder.tvFor.setVisibility(4);
            viewholder.lineOne.setText(b.getString(0x7f070232));
            viewholder.lineTwo.setText(b.getString(0x7f070341));
        }
        a(viewholder, boolean1.booleanValue());
    }

    private void a(ViewHolder viewholder, RecommendedProduct recommendedproduct)
    {
        viewholder.product.setVisibility(0);
        viewholder.personalizedRecommendation.setVisibility(8);
        b(viewholder, recommendedproduct);
        c(viewholder, recommendedproduct);
        d(viewholder, recommendedproduct);
        e(viewholder, recommendedproduct);
    }

    private void a(ViewHolder viewholder, boolean flag)
    {
        if (flag)
        {
            viewholder.shopNow.setText(b.getString(0x7f0703f4));
            viewholder.shopNow.setBackgroundColor(b.getResources().getColor(0x7f0d000e));
        } else
        {
            viewholder.shopNow.setText(b.getString(0x7f0703fa));
            viewholder.shopNow.setBackgroundColor(b.getResources().getColor(0x7f0d006c));
        }
        viewholder.shopNow.setOnClickListener(new cf(this, flag));
    }

    private void b(ViewHolder viewholder, RecommendedProduct recommendedproduct)
    {
        if (!ah.a(recommendedproduct.getImages()))
        {
            recommendedproduct = ((Image)recommendedproduct.getImages().get(0)).getUrl();
        } else
        {
            recommendedproduct = recommendedproduct.getImageURL();
        }
        if (!TextUtils.isEmpty(recommendedproduct))
        {
            com.jcp.g.a.a().a(recommendedproduct).b(0x7f02017f).a(viewholder.image);
            return;
        } else
        {
            viewholder.image.getLayoutParams().height = 408;
            viewholder.image.getLayoutParams().width = 408;
            com.jcp.g.a.a().a(0x7f02017f).a(viewholder.image);
            return;
        }
    }

    private void c(ViewHolder viewholder, RecommendedProduct recommendedproduct)
    {
        viewholder.name.setText(recommendedproduct.getName());
    }

    private void d(ViewHolder viewholder, RecommendedProduct recommendedproduct)
    {
        viewholder.salePrice.setVisibility(0);
        viewholder.salePrice.setText("");
        viewholder.originalPrice.setVisibility(0);
        viewholder.originalPrice.setText("");
        if (recommendedproduct.getPrices() != null)
        {
            Iterator iterator = recommendedproduct.getPrices().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (Price)iterator.next();
                String s = ((Price) (obj)).getType();
                String s1 = y.a(((Price) (obj)).getMin());
                obj = y.a(((Price) (obj)).getMax());
                if (recommendedproduct.getManufacturerAdvertisedPrice())
                {
                    if (com.jcp.b.a.c(s))
                    {
                        viewholder.originalPrice.setText(a(s1, ((String) (obj))));
                    }
                    viewholder.salePrice.setText(b.getString(0x7f07046c));
                } else
                if (com.jcp.b.a.b(s))
                {
                    viewholder.salePrice.setText(a(s1, ((String) (obj)), s));
                } else
                if (com.jcp.b.a.c(s))
                {
                    viewholder.originalPrice.setText(a(s1, ((String) (obj))));
                } else
                if (com.jcp.b.a.a(s))
                {
                    viewholder.salePrice.setVisibility(8);
                }
            } while (true);
        } else
        {
            viewholder.salePrice.setText(b.getString(0x7f070395));
            viewholder.originalPrice.setText(b.getString(0x7f0702d7));
        }
    }

    private void e(ViewHolder viewholder, RecommendedProduct recommendedproduct)
    {
        viewholder.productRating.setProduct(recommendedproduct);
    }

    public int getCount()
    {
        int j = d.size();
        int i;
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public Object getItem(int i)
    {
        if (i < d.size())
        {
            return (RecommendedProduct)d.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(c, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        view = (ViewHolder)view1.getTag();
        viewgroup = (RecommendedProduct)getItem(i);
        if (viewgroup != null)
        {
            a(view, viewgroup);
            return view1;
        } else
        {
            a(view);
            return view1;
        }
    }


    private class ViewHolder
    {

        protected ImageView image;
        protected TextView lineOne;
        protected TextView lineTwo;
        protected TextView name;
        protected TextView originalPrice;
        protected View personalizedRecommendation;
        protected View product;
        protected ProductRating productRating;
        protected TextView salePrice;
        protected Button shopNow;
        protected TextView tvFor;
        protected TextView userName;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
