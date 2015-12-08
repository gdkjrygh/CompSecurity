// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.a;
import com.jcp.c.aa;
import com.jcp.e.ai;
import com.jcp.e.c;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.fragments.fz;
import com.jcp.fragments.t;
import com.jcp.pojo.Attributes;
import com.jcp.pojo.SavedItems;
import com.jcp.productentity.AddToBagInputEntity;
import com.jcp.productentity.AttributesList;
import com.jcp.util.au;
import com.jcp.util.bo;
import com.jcp.util.bv;
import com.jcp.util.y;
import com.jcp.views.HtmlTypefaceTextView;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.adapters:
//            an, ap, aq, ar, 
//            as, at, ao

public class CustomSavedItemAdapter extends BaseAdapter
    implements android.view.View.OnClickListener, ai, c
{

    private static final String a = com/jcp/adapters/CustomSavedItemAdapter.getName();
    private final Context b;
    private final LayoutInflater c;
    private final List d;
    private ViewHolder e;
    private int f;
    private int g;
    private final aa h;
    private final AddToBagInputEntity i = new AddToBagInputEntity();
    private final List j = new ArrayList();
    private final AttributesList k = new AttributesList();
    private String l;
    private final fz m;
    private int n;
    private List o;
    private PopupWindow p;
    private int q;

    public CustomSavedItemAdapter(fz fz1, Context context, SavedItems asaveditems[])
    {
        l = "";
        b = context;
        d = new ArrayList(Arrays.asList(asaveditems));
        c = (LayoutInflater)context.getSystemService("layout_inflater");
        h = new aa(context);
        h.a(this);
        m = fz1;
        o = new ArrayList();
        p = au.a(m.i(), o, (ViewGroup)m.i().findViewById(0x7f0e039b), new an(this));
    }

    static int a(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.q;
    }

    private Map a(String s)
    {
        try
        {
            s = com.jcp.b.b.y(URLDecoder.decode(s, "utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    static void a(CustomSavedItemAdapter customsaveditemadapter, int i1)
    {
        customsaveditemadapter.i(i1);
    }

    private void a(SavedItems saveditems, ViewHolder viewholder)
    {
        viewholder.mItemSizeRange.setVisibility(8);
        viewholder.mItemSizeRangeDescription.setVisibility(8);
        if (saveditems.getProductURL() != null)
        {
            saveditems = a(saveditems.getProductURL());
            if (saveditems != null)
            {
                saveditems = saveditems.entrySet().iterator();
                do
                {
                    if (!saveditems.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)saveditems.next();
                    if ("SIZE_RANGE".equals(entry.getKey()))
                    {
                        viewholder.mItemSizeRange.setVisibility(0);
                        viewholder.mItemSizeRangeDescription.setVisibility(0);
                        try
                        {
                            viewholder.mItemSizeRangeDescription.setText(URLDecoder.decode((String)entry.getValue(), "UTF-8"));
                        }
                        catch (UnsupportedEncodingException unsupportedencodingexception)
                        {
                            unsupportedencodingexception.printStackTrace();
                        }
                    }
                } while (true);
            }
        }
    }

    private void a(AddToBagInputEntity addtobaginputentity)
    {
        Object obj;
        JSONArray jsonarray;
        if (addtobaginputentity.getvDataType() != null)
        {
            l = addtobaginputentity.getvDataType();
        } else
        if (addtobaginputentity.getProductType() != null)
        {
            l = addtobaginputentity.getProductType();
        }
        jsonarray = new JSONArray();
        obj = new JSONArray();
        if (b.getString(0x7f070348).equalsIgnoreCase(l))
        {
            c(addtobaginputentity, jsonarray);
        } else
        if (b.getString(0x7f070297).equalsIgnoreCase(l))
        {
            b(addtobaginputentity, jsonarray, ((JSONArray) (obj)));
        } else
        if (b.getString(0x7f070223).equalsIgnoreCase(l) || b.getString(0x7f0701fb).equalsIgnoreCase(l) || b.getString(0x7f070284).equalsIgnoreCase(l))
        {
            a(addtobaginputentity, jsonarray, ((JSONArray) (obj)));
        } else
        if (b.getString(0x7f0701f3).equalsIgnoreCase(l))
        {
            b(addtobaginputentity, jsonarray);
        } else
        {
            a(addtobaginputentity, jsonarray);
        }
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("items", jsonarray);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        n = addtobaginputentity.getQuantity();
        addtobaginputentity = new a(b);
        addtobaginputentity.a(this);
        addtobaginputentity.a(((JSONObject) (obj)));
    }

    private void a(AddToBagInputEntity addtobaginputentity, JSONArray jsonarray)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("searchTerm", "");
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
    }

    private void a(AddToBagInputEntity addtobaginputentity, JSONArray jsonarray, JSONArray jsonarray1)
    {
        JSONObject jsonobject;
        int i1;
        jsonobject = new JSONObject();
        i1 = 0;
_L2:
        if (i1 >= addtobaginputentity.getmAttributesList().size())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.put("type", ((AttributesList)addtobaginputentity.getmAttributesList().get(i1)).getType());
        jsonobject.put("value", ((AttributesList)addtobaginputentity.getmAttributesList().get(i1)).getValue());
        i1++;
        if (true) goto _L2; else goto _L1
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        Log.e(a, "IndexOutOfBoundsException while getting AttributesList:", indexoutofboundsexception);
_L1:
        jsonarray1.put(jsonobject);
        jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("attributes", jsonarray1);
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
        return;
        jsonexception;
        Log.e(a, "JSONException while adding attributes to Json Object:", jsonexception);
          goto _L1
    }

    static int b(CustomSavedItemAdapter customsaveditemadapter, int i1)
    {
        customsaveditemadapter.f = i1;
        return i1;
    }

    static Context b(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.b;
    }

    private void b()
    {
        Attributes aattributes[] = ((SavedItems)d.get(f)).getAttributes();
        int j1 = aattributes.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Attributes attributes = aattributes[i1];
            k.setType(attributes.getType());
            k.setValue(attributes.getValue());
        }

        j.add(k);
        i.setmAttributesList(j);
        i.setId(((SavedItems)d.get(f)).getItemId());
        i.setPpId(((SavedItems)d.get(f)).getPpId());
        try
        {
            i.setQuantity(Integer.valueOf(((SavedItems)d.get(f)).getQuantity()));
        }
        catch (NumberFormatException numberformatexception)
        {
            return;
        }
        i.setvDataType(((SavedItems)d.get(f)).getType());
        a(i);
    }

    private void b(int i1)
    {
        e.addToBag.setOnClickListener(new ap(this, i1));
    }

    private void b(AddToBagInputEntity addtobaginputentity, JSONArray jsonarray)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
    }

    private void b(AddToBagInputEntity addtobaginputentity, JSONArray jsonarray, JSONArray jsonarray1)
    {
        JSONObject jsonobject;
        int i1;
        jsonobject = new JSONObject();
        i1 = 0;
_L2:
        if (i1 >= addtobaginputentity.getmAttributesList().size())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.put("type", ((AttributesList)addtobaginputentity.getmAttributesList().get(i1)).getType());
        jsonobject.put("value", ((AttributesList)addtobaginputentity.getmAttributesList().get(i1)).getValue());
        i1++;
        if (true) goto _L2; else goto _L1
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        Log.e(a, " IndexOutOfBoundsException while getting AttributesList:", indexoutofboundsexception);
_L1:
        jsonarray1.put(jsonobject);
        jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("attributes", jsonarray1);
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
        return;
        jsonexception;
        Log.e(a, "JSONException while adding attributes to Json Object:", jsonexception);
          goto _L1
    }

    private void c()
    {
        Object obj = (SavedItems)d.get(f);
        String s = ((SavedItems) (obj)).getPpId();
        String s1 = ((SavedItems) (obj)).getItemId();
        String s2 = ((SavedItems) (obj)).getId();
        Bundle bundle;
        int i1;
        try
        {
            i1 = ((SavedItems) (obj)).getQuantity();
        }
        catch (NumberFormatException numberformatexception)
        {
            return;
        }
        com.jcp.b.b.d(false);
        obj = new ProductDetailFragment();
        bundle = new Bundle();
        bundle.putString("ProductURL", "");
        bundle.putString("PPID", s);
        bundle.putBoolean("ProductDetails", true);
        bundle.putBoolean("ColorSelected", false);
        bundle.putBoolean("isPersonalized", true);
        bundle.putString("itemIdPersonalize", s1);
        bundle.putString("PPIDPersonalize", s);
        bundle.putString("idPersonalized", s2);
        bundle.putInt("quantityPersonalize", i1);
        ((Fragment) (obj)).g(bundle);
        if (b instanceof t)
        {
            ((t)b).b(((Fragment) (obj)), "ProductDetailFragment");
        }
    }

    private void c(int i1)
    {
        if (((SavedItems)d.get(i1)).getPpId() != null)
        {
            com.jcp.b.b.d(false);
            ProductDetailFragment productdetailfragment = new ProductDetailFragment();
            Bundle bundle = new Bundle();
            String s = ((SavedItems)d.get(i1)).getPpId();
            String s1 = ((SavedItems)d.get(i1)).getProductURL();
            String s2 = ((SavedItems)d.get(i1)).getId();
            bundle.putString("ProductURL", s1);
            bundle.putString("PPID", s);
            bundle.putBoolean("ProductDetails", false);
            bundle.putBoolean("ColorSelected", true);
            bundle.putString("idSavedItem", s2);
            bundle.putBoolean("FromSaved", true);
            productdetailfragment.g(bundle);
            if (b instanceof t)
            {
                ((t)b).b(productdetailfragment, "ProductDetailFragment");
            }
        }
    }

    static void c(CustomSavedItemAdapter customsaveditemadapter)
    {
        customsaveditemadapter.c();
    }

    static void c(CustomSavedItemAdapter customsaveditemadapter, int i1)
    {
        customsaveditemadapter.c(i1);
    }

    private void c(AddToBagInputEntity addtobaginputentity, JSONArray jsonarray)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", addtobaginputentity.getId());
            jsonobject.put("quantity", addtobaginputentity.getQuantity());
            jsonobject.put("ppId", addtobaginputentity.getPpId());
        }
        // Misplaced declaration of an exception variable
        catch (AddToBagInputEntity addtobaginputentity)
        {
            addtobaginputentity.printStackTrace();
        }
        jsonarray.put(jsonobject);
    }

    static int d(CustomSavedItemAdapter customsaveditemadapter, int i1)
    {
        customsaveditemadapter.q = i1;
        return i1;
    }

    private void d(int i1)
    {
        e.fullLayout.setOnClickListener(new aq(this, i1));
    }

    static void d(CustomSavedItemAdapter customsaveditemadapter)
    {
        customsaveditemadapter.b();
    }

    static List e(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.d;
    }

    private void e(int i1)
    {
label0:
        {
            Attributes aattributes[] = ((SavedItems)d.get(i1)).getAttributes();
            if (aattributes != null && aattributes.length > 0)
            {
                e.colourId.setVisibility(0);
                StringBuilder stringbuilder = new StringBuilder();
                int j1 = aattributes.length;
                for (i1 = 0; i1 < j1; i1++)
                {
                    Attributes attributes = aattributes[i1];
                    stringbuilder.append((new StringBuilder()).append(bv.b(attributes.getType().replace("_", " "))).append(" : <b>").append(attributes.getValue()).append("</b><br>").toString());
                }

                if (stringbuilder.length() <= 0)
                {
                    break label0;
                }
                e.colourId.setHtmlText(stringbuilder.toString());
                e.colourId.setVisibility(0);
            }
            return;
        }
        e.colourId.setVisibility(0);
    }

    static List f(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.o;
    }

    private void f(int i1)
    {
        String s = ((SavedItems)d.get(i1)).getName();
        String s1 = ((SavedItems)d.get(i1)).getProductNumber();
        boolean flag = ((SavedItems)d.get(i1)).getManufacturerAdvertisedPrice().booleanValue();
        String s2 = ((SavedItems)d.get(i1)).getOriginalPrice();
        String s3 = ((SavedItems)d.get(i1)).getActivePrice();
        double d1 = Double.parseDouble(s2);
        double d2 = Double.parseDouble(s3);
        if (s != null)
        {
            e.header.setText(s);
        }
        if (s1 != null)
        {
            e.itemId.setText((new StringBuilder()).append(b.getString(0x7f07024b)).append(s1).toString());
        }
        if (flag)
        {
            if (s2 != null)
            {
                e.originalId.setText((new StringBuilder()).append(b.getString(0x7f0702d4)).append(y.a(d1)).toString());
            }
            e.saleId.setText(b.getString(0x7f070066));
        } else
        {
            if (s3 != null)
            {
                e.saleId.setText((new StringBuilder()).append(b.getString(0x7f070392)).append(y.a(d2)).toString());
            }
            if (s2 != null)
            {
                e.originalId.setText((new StringBuilder()).append(b.getString(0x7f0702d4)).append(y.a(d1)).toString());
                return;
            }
        }
    }

    static PopupWindow g(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.p;
    }

    private void g(int i1)
    {
label0:
        {
label1:
            {
                if (((SavedItems)d.get(i1)).getItemId() == null)
                {
                    break label0;
                }
                if (((SavedItems)d.get(i1)).getType() != null)
                {
                    String s = ((SavedItems)d.get(i1)).getType();
                    if (!b.getString(0x7f070204).equalsIgnoreCase(s))
                    {
                        break label1;
                    }
                    e.addToBag.setText(b.getString(0x7f070302));
                    e.rlPlusMinusQuantity.setVisibility(0);
                    e.prior.setVisibility(0);
                    e.after.setVisibility(0);
                }
                return;
            }
            e.addToBag.setText(b.getString(0x7f070065));
            e.rlPlusMinusQuantity.setVisibility(0);
            e.prior.setVisibility(0);
            e.after.setVisibility(0);
            return;
        }
        if (((SavedItems)d.get(i1)).getItemId() == null)
        {
            if (((SavedItems)d.get(i1)).getType() != null)
            {
                if (b.getString(0x7f070204).equalsIgnoreCase(((SavedItems)d.get(i1)).getType()))
                {
                    e.addToBag.setText(b.getString(0x7f070302));
                    e.rlPlusMinusQuantity.setVisibility(0);
                    e.prior.setVisibility(0);
                    e.after.setVisibility(0);
                    return;
                } else
                {
                    e.addToBag.setText(b.getString(0x7f0703bc));
                    e.rlPlusMinusQuantity.setVisibility(8);
                    e.prior.setVisibility(8);
                    e.after.setVisibility(8);
                    return;
                }
            } else
            {
                e.addToBag.setText(b.getString(0x7f0703bc));
                e.rlPlusMinusQuantity.setVisibility(8);
                e.prior.setVisibility(8);
                e.after.setVisibility(8);
                return;
            }
        } else
        {
            e.addToBag.setText(b.getString(0x7f0703bc));
            e.rlPlusMinusQuantity.setVisibility(8);
            e.prior.setVisibility(8);
            e.after.setVisibility(8);
            return;
        }
    }

    static int h(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.f;
    }

    private void h(int i1)
    {
        e.mQuantityItem.setText((new StringBuilder()).append("").append(((SavedItems)d.get(i1)).getQuantity()).toString());
        e.mQuantityItem.setOnClickListener(new ar(this, i1));
    }

    static aa i(CustomSavedItemAdapter customsaveditemadapter)
    {
        return customsaveditemadapter.h;
    }

    private void i(int i1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(m.i());
        builder.setMessage(0x7f07034a);
        builder.create();
        builder.setPositiveButton(0x7f07047e, new as(this, i1));
        builder.setNegativeButton(0x7f0702aa, new at(this));
        builder.show();
    }

    public void a()
    {
        notifyDataSetChanged();
    }

    protected void a(int i1)
    {
        n = i1;
    }

    public void a(int i1, int j1)
    {
        ((SavedItems)d.get(f)).setQuantity(g);
        a(g);
        notifyDataSetChanged();
    }

    public void a(int i1, String s, int j1)
    {
        if (j1 == 41)
        {
            JCP.b().a(f);
            JCP.e().b(((SavedItems)d.get(f)).getPpId());
            d.remove(f);
            a();
            if (d.size() == 0)
            {
                m.U();
            }
        }
    }

    public void a(String s, int i1)
    {
        au.a(b, b.getResources().getString(0x7f0701bb), s);
    }

    public void b(int i1, int j1)
    {
        f = i1;
        g = j1;
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", ((SavedItems)d.get(i1)).getItemId());
            jsonobject.put("quantity", j1);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        h.b(jsonobject, ((SavedItems)d.get(i1)).getId());
    }

    public void c(int i1, int j1)
    {
        if (i1 == 200 || i1 == 201)
        {
            i1 = JCP.d().a();
            j1 = n;
            JCP.d().a(i1 + j1);
            m.P();
            com.jcp.b.b.b(f);
            String s = com.jcp.b.b.l(((SavedItems)d.get(f)).getId());
            h.b(s);
        }
    }

    public void c(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        au.a(b, b.getResources().getString(0x7f0701bb), errormessageentitycontainer);
    }

    public void d(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (errormessageentitycontainer != null && errormessageentitycontainer.getErrorMessage() != null)
        {
            au.a(b, b.getResources().getString(0x7f0701bb), errormessageentitycontainer.getErrorMessage());
            return;
        } else
        {
            au.a(b, b.getResources().getString(0x7f0701bb), b.getResources().getString(0x7f070236));
            return;
        }
    }

    public int getCount()
    {
        return d.size();
    }

    public Object getItem(int i1)
    {
        return null;
    }

    public long getItemId(int i1)
    {
        return 0L;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        String s;
        int j1;
        if (view == null)
        {
            view = c.inflate(0x7f030059, viewgroup, false);
            e = new ViewHolder(view);
            view.setTag(e);
        } else
        {
            e = (ViewHolder)view.getTag();
        }
        h(i1);
        g(i1);
        f(i1);
        j1 = ((SavedItems)d.get(i1)).getQuantity();
        if (j1 >= 0)
        {
            a(j1);
        }
        s = ((SavedItems)d.get(i1)).getImageURL();
        if (s != null)
        {
            viewgroup = s;
            if (s.indexOf(".") > 0)
            {
                viewgroup = s.substring(0, s.lastIndexOf("."));
            }
            com.jcp.g.a.a().a(viewgroup).b(0x7f02017f).a(e.ivSavedItemId);
        }
        e.colourId.setVisibility(8);
        e(i1);
        a((SavedItems)d.get(i1), e);
        d(i1);
        e.removeSavedItems.setOnClickListener(new ao(this, i1));
        b(i1);
        return view;
    }

    public void onClick(View view)
    {
    }


    private class ViewHolder
    {

        final CustomSavedItemAdapter a;
        protected Button addToBag;
        protected View after;
        protected HtmlTypefaceTextView colourId;
        protected RelativeLayout fullLayout;
        protected TextView header;
        protected TextView itemId;
        protected ImageView ivSavedItemId;
        protected TextView mItemSizeRange;
        protected TextView mItemSizeRangeDescription;
        protected TextView mQuantityItem;
        protected TextView originalId;
        protected View prior;
        protected Button removeSavedItems;
        protected RelativeLayout rlPlusMinusQuantity;
        protected TextView saleId;

        public ViewHolder(View view)
        {
            a = CustomSavedItemAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
