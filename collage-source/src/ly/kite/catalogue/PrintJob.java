// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ly.kite.address.Address;
import org.json.JSONObject;

// Referenced classes of package ly.kite.catalogue:
//            Product, PostcardPrintJob, PrintsPrintJob, Asset

public abstract class PrintJob
    implements Parcelable
{

    private static final long serialVersionUID = 1L;
    private transient Product mProduct;

    protected PrintJob(Parcel parcel)
    {
        mProduct = (Product)Product.CREATOR.createFromParcel(parcel);
    }

    protected PrintJob(Product product)
    {
        mProduct = product;
    }

    public static PrintJob createPostcardPrintJob(Product product, Asset asset, String s, Address address)
    {
        return new PostcardPrintJob(product, asset, s, address);
    }

    public static PrintJob createPrintJob(Product product, List list)
    {
        return new PrintsPrintJob(product, list);
    }

    public static PrintJob createPrintJob(Product product, Asset asset)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(asset);
        return createPrintJob(product, ((List) (arraylist)));
    }

    abstract List getAssetsForUploading();

    public abstract BigDecimal getCost(String s);

    public abstract Set getCurrenciesSupported();

    abstract JSONObject getJSONRepresentation();

    public Product getProduct()
    {
        return mProduct;
    }

    public String getProductId()
    {
        return mProduct.getId();
    }

    public abstract int getQuantity();

    public void writeToParcel(Parcel parcel, int i)
    {
        mProduct.writeToParcel(parcel, i);
    }
}
