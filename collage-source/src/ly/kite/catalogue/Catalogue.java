// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.util.Log;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package ly.kite.catalogue:
//            ProductGroup, Product

public class Catalogue
{

    private static final String LOG_TAG = "Catalogue";
    private ArrayList mGroupList;
    private HashMap mIdProductTable;
    private HashMap mNameGroupTable;
    private HashMap mProductIdGroupTable;
    private JSONObject mUserConfigJSONObject;

    Catalogue()
    {
        mNameGroupTable = new HashMap();
        mGroupList = new ArrayList();
        mIdProductTable = new HashMap();
        mProductIdGroupTable = new HashMap();
    }

    Catalogue(JSONObject jsonobject)
    {
        this();
        setCustomData(jsonobject);
    }

    void addProduct(String s, URL url, Product product)
    {
        ProductGroup productgroup1 = (ProductGroup)mNameGroupTable.get(s);
        ProductGroup productgroup = productgroup1;
        if (productgroup1 == null)
        {
            productgroup = new ProductGroup(s, product.getDisplayLabelColour(), url);
            Log.i("Catalogue", "-- New Product Group --");
            Log.i("Catalogue", productgroup.toLogString());
            mGroupList.add(productgroup);
            mNameGroupTable.put(s, productgroup);
        }
        productgroup.add(product);
        mIdProductTable.put(product.getId(), product);
        mProductIdGroupTable.put(product.getId(), productgroup);
    }

    public void confirmProductIdExistsOrThrow(String s)
    {
        if (getProductById(s) == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Product id ").append(s).append(" not found in catalogue").toString());
        } else
        {
            return;
        }
    }

    public Catalogue createFiltered(String as[])
    {
        Catalogue catalogue = new Catalogue(mUserConfigJSONObject);
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = as[i];
                Product product = getProductById(((String) (obj)));
                obj = getGroupByProductId(((String) (obj)));
                if (product != null && obj != null)
                {
                    catalogue.addProduct(((ProductGroup) (obj)).getDisplayLabel(), ((ProductGroup) (obj)).getDisplayImageURL(), product);
                }
            }

        }
        return catalogue;
    }

    public String getCustomDataString(String s)
    {
        return mUserConfigJSONObject.optString(s);
    }

    public ProductGroup getGroupByProductId(String s)
    {
        return (ProductGroup)mProductIdGroupTable.get(s);
    }

    public Product getProductById(String s)
    {
        return (Product)mIdProductTable.get(s);
    }

    public int getProductCount()
    {
        return mIdProductTable.size();
    }

    public ArrayList getProductGroupList()
    {
        return mGroupList;
    }

    public ArrayList getProductsForGroup(String s)
    {
        s = (ProductGroup)mNameGroupTable.get(s);
        if (s != null)
        {
            return s.getProductList();
        } else
        {
            return null;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            jsonobject = new JSONObject();
        }
        mUserConfigJSONObject = jsonobject;
    }
}
