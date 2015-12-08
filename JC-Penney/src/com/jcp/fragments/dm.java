// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.jcp.JCP;
import com.jcp.productentity.AddToBagInputEntity;
import com.jcp.productentity.AttributesList;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productentity.VDATAOptionValueEntity;
import com.jcp.productentity.VDataOptionEntity;
import com.jcp.storepickup.pojo.Inventory;
import com.jcp.storepickup.pojo.Stores;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment, fz, s, t

class dm
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    dm(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        ProductDetailFragment.h(a, true);
        if (a.mSelectionOptionsLayout.getVisibility() == 0)
        {
            if (!ProductDetailFragment.B(a) && ProductDetailFragment.C(a))
            {
                ProductDetailFragment.D(a);
            }
            if (ProductDetailFragment.B(a))
            {
                if (ProductDetailFragment.f(a, true))
                {
                    a.a(ProductDetailFragment.j(a));
                }
            } else
            {
                if (ProductDetailFragment.j(a).getType() != null && "GIFTCARD".equalsIgnoreCase(ProductDetailFragment.j(a).getType()))
                {
                    a.b(ProductDetailFragment.j(a));
                    return;
                }
                if (ProductDetailFragment.f(a, true))
                {
                    JCP.a(null);
                    if (ProductDetailFragment.j(a).getId() != null && ProductDetailFragment.j(a).getItemId() != null)
                    {
                        ProductDetailFragment.E(a).setProductType(ProductDetailFragment.j(a).getType());
                        ProductDetailFragment.E(a).setId(ProductDetailFragment.j(a).getItemId());
                        ProductDetailFragment.E(a).setPpId(ProductDetailFragment.j(a).getId());
                        ProductDetailFragment.E(a).setQuantity(Integer.valueOf(ProductDetailFragment.d(a)));
                        if (ProductDetailFragment.j(a).getvDataType() != null)
                        {
                            ProductDetailFragment.E(a).setvDataType(ProductDetailFragment.j(a).getvDataType());
                        }
                        view = ProductDetailFragment.j(a).getvDataOption();
                        if (view != null)
                        {
                            Iterator iterator = view.iterator();
                            do
                            {
                                if (!iterator.hasNext())
                                {
                                    break;
                                }
                                VDataOptionEntity vdataoptionentity = (VDataOptionEntity)iterator.next();
                                AttributesList attributeslist = ProductDetailFragment.F(a);
                                if (vdataoptionentity.getName() != null)
                                {
                                    view = vdataoptionentity.getName();
                                } else
                                {
                                    view = "";
                                }
                                attributeslist.setType(view);
                                view = vdataoptionentity.getvDataOptionValues();
                                if (view != null)
                                {
                                    Iterator iterator1 = view.iterator();
                                    while (iterator1.hasNext()) 
                                    {
                                        view = (VDATAOptionValueEntity)iterator1.next();
                                        AttributesList attributeslist1 = ProductDetailFragment.F(a);
                                        if (view.isSelected())
                                        {
                                            view = view.getValue();
                                        } else
                                        {
                                            view = "";
                                        }
                                        attributeslist1.setValue(view);
                                    }
                                }
                            } while (true);
                            ProductDetailFragment.G(a).add(ProductDetailFragment.F(a));
                            ProductDetailFragment.E(a).setmAttributesList(ProductDetailFragment.G(a));
                        }
                        if (ProductDetailFragment.H(a))
                        {
                            view = new fz();
                            Object obj = new Bundle();
                            ((Bundle) (obj)).putBoolean("isUpdatingSavedItems", true);
                            ((Bundle) (obj)).putString("ItemID", ProductDetailFragment.l(a));
                            ((Bundle) (obj)).putString("id", ProductDetailFragment.I(a));
                            ((Bundle) (obj)).putInt("quantity", ProductDetailFragment.d(a));
                            view.g(((Bundle) (obj)));
                            obj = s.a(a.i());
                            if (obj != null)
                            {
                                ((t) (obj)).b(view, "SavedItemFragment");
                                return;
                            }
                        } else
                        {
                            view = ProductDetailFragment.a(a, ProductDetailFragment.j(a));
                            if (!TextUtils.isEmpty(view))
                            {
                                ProductDetailFragment.E(a).setServiceAgreementId(view);
                            }
                            ProductDetailFragment.E(a).setmAttributesList(ProductDetailFragment.J(a));
                            if (ProductDetailFragment.K(a) && ProductDetailFragment.L(a) != null && ProductDetailFragment.L(a).getInventory() != null && ProductDetailFragment.L(a).getInventory().getStatus() != null && !"AVAILABLE".equals(ProductDetailFragment.L(a).getInventory().getStatus()))
                            {
                                ProductDetailFragment.M(a);
                                return;
                            } else
                            {
                                ProductDetailFragment.N(a);
                                return;
                            }
                        }
                    }
                } else
                {
                    a.mSelectOptionsScroll.fullScroll(33);
                    return;
                }
            }
        }
    }
}
