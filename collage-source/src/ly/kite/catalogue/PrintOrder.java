// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ly.kite.address.Address;
import ly.kite.address.Country;
import ly.kite.pricing.OrderPricing;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.catalogue:
//            PostcardPrintJob, PrintsPrintJob, AssetUploadRequest, SubmitPrintOrderRequest, 
//            PrintJob, Asset, MultipleCurrencyAmount, SingleCurrencyAmount, 
//            PrintOrderSubmissionListener

public class PrintOrder
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls2();
    private static final int NOT_PERSITED = -1;
    private static final String PERSISTED_PRINT_ORDERS_FILENAME = "print_orders";
    private static final long serialVersionUID = 0L;
    private boolean assetUploadComplete;
    private AssetUploadRequest assetUploadReq;
    private List assetsToUpload;
    private ArrayList jobs;
    private Date lastPrintSubmissionDate;
    private Exception lastPrintSubmissionError;
    private OrderPricing mOrderPricing;
    private SubmitPrintOrderRequest printOrderReq;
    private String promoCode;
    private String proofOfPayment;
    private String receipt;
    private Address shippingAddress;
    private String statusNotificationEmail;
    private String statusNotificationPhone;
    private int storageIdentifier;
    private PrintOrderSubmissionListener submissionListener;
    private JSONObject userData;
    private boolean userSubmittedForPrinting;
    private String voucherCode;

    public PrintOrder()
    {
        jobs = new ArrayList();
        storageIdentifier = -1;
    }

    private PrintOrder(Parcel parcel)
    {
        jobs = new ArrayList();
        storageIdentifier = -1;
        shippingAddress = (Address)parcel.readValue(ly/kite/address/Address.getClassLoader());
        proofOfPayment = parcel.readString();
        voucherCode = parcel.readString();
        String s = parcel.readString();
        int i;
        int j;
        if (s != null)
        {
            try
            {
                userData = new JSONObject(s);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException(parcel);
            }
        }
        j = parcel.readInt();
        i = 0;
        while (i < j) 
        {
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                PostcardPrintJob postcardprintjob = (PostcardPrintJob)PostcardPrintJob.CREATOR.createFromParcel(parcel);
                jobs.add(postcardprintjob);
            } else
            {
                PrintsPrintJob printsprintjob = (PrintsPrintJob)PrintsPrintJob.CREATOR.createFromParcel(parcel);
                jobs.add(printsprintjob);
            }
            i++;
        }
        userSubmittedForPrinting = ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue();
        assetUploadComplete = ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue();
        lastPrintSubmissionDate = (Date)parcel.readValue(java/util/Date.getClassLoader());
        receipt = parcel.readString();
        lastPrintSubmissionError = (Exception)parcel.readSerializable();
        storageIdentifier = parcel.readInt();
        promoCode = parcel.readString();
        mOrderPricing = (OrderPricing)parcel.readParcelable(ly/kite/pricing/OrderPricing.getClassLoader());
        statusNotificationEmail = parcel.readString();
        statusNotificationPhone = parcel.readString();
    }

    PrintOrder(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private boolean isAssetUploadInProgress()
    {
        return assetsToUpload != null || assetUploadReq != null;
    }

    private void startAssetUpload(Context context)
    {
        if (isAssetUploadInProgress() || assetUploadComplete)
        {
            throw new IllegalStateException("Asset upload should not have previously been started");
        } else
        {
            assetsToUpload = getAssetsToUpload();
            assetsToUpload.size();
            assetUploadReq = new AssetUploadRequest(context);
    /* block-local class not found */
    class MyAssetUploadRequestListener {}

            assetUploadReq.uploadAssets(context, assetsToUpload, new MyAssetUploadRequestListener(context));
            return;
        }
    }

    private void submitForPrinting(Context context)
    {
        if (!userSubmittedForPrinting)
        {
            throw new IllegalStateException("oops");
        }
        if (!assetUploadComplete || isAssetUploadInProgress())
        {
            throw new IllegalStateException("Oops asset upload should be complete by now");
        } else
        {
            printOrderReq = new SubmitPrintOrderRequest(this);
            printOrderReq.submitForPrinting(context, new _cls1());
            return;
        }
    }

    public void addPrintJob(PrintJob printjob)
    {
        if (!(printjob instanceof PrintsPrintJob) && !(printjob instanceof PostcardPrintJob))
        {
            throw new IllegalArgumentException("Currently only support PrintsPrintJobs & PostcardPrintJob, if any further jobs classes are added support for them must be added to the Parcelable interface in particular readTypedList must work ;)");
        } else
        {
            jobs.add(printjob);
            return;
        }
    }

    public void cancelSubmissionOrPreemptedAssetUpload()
    {
        if (assetUploadReq != null)
        {
            assetUploadReq.cancelUpload();
            assetUploadReq = null;
        }
        if (printOrderReq != null)
        {
            printOrderReq.cancelSubmissionForPrinting();
            printOrderReq = null;
        }
        userSubmittedForPrinting = false;
    }

    public void clearPromoCode()
    {
        promoCode = null;
        mOrderPricing = null;
    }

    public int describeContents()
    {
        return 0;
    }

    List getAssetsToUpload()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = jobs.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((PrintJob)iterator.next()).getAssetsForUploading().iterator();
            while (iterator1.hasNext()) 
            {
                Asset asset = (Asset)iterator1.next();
                if (!arraylist.contains(asset))
                {
                    arraylist.add(asset);
                }
            }
        }

        return arraylist;
    }

    public Set getCurrenciesSupported()
    {
        Set set = null;
        for (Iterator iterator = jobs.iterator(); iterator.hasNext();)
        {
            Set set1 = ((PrintJob)iterator.next()).getCurrenciesSupported();
            if (set == null)
            {
                set = set1;
            } else
            {
                set.retainAll(set1);
            }
        }

        Set set2 = set;
        if (set == null)
        {
            set2 = Collections.EMPTY_SET;
        }
        return set2;
    }

    JSONObject getJSONRepresentation()
    {
        Object obj = new JSONObject();
        if (proofOfPayment == null) goto _L2; else goto _L1
_L1:
        ((JSONObject) (obj)).put("proof_of_payment", proofOfPayment);
_L4:
        ((JSONObject) (obj)).put("receipt_email", statusNotificationEmail);
        if (promoCode != null)
        {
            ((JSONObject) (obj)).put("promo_code", promoCode);
        }
        JSONArray jsonarray = new JSONArray();
        ((JSONObject) (obj)).put("jobs", jsonarray);
        for (Iterator iterator = jobs.iterator(); iterator.hasNext(); jsonarray.put(((PrintJob)iterator.next()).getJSONRepresentation())) { }
        break MISSING_BLOCK_LABEL_136;
_L2:
        try
        {
            ((JSONObject) (obj)).put("proof_of_payment", "");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (userData != null)
        {
            ((JSONObject) (obj)).put("user_data", userData);
        }
        if (getOrderPricing() != null)
        {
            SingleCurrencyAmount singlecurrencyamount = getOrderPricing().getTotalCost().getDefaultAmountWithFallback();
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("{");
            stringbuilder.append("\"currency\": \"").append(singlecurrencyamount.getCurrencyCode()).append("\"").append(",");
            stringbuilder.append(String.format(Locale.ENGLISH, "\"amount\": %.2f", new Object[] {
                Float.valueOf(singlecurrencyamount.getAmount().floatValue())
            }));
            stringbuilder.append("}");
            ((JSONObject) (obj)).put("customer_payment", new JSONObject(stringbuilder.toString()));
        }
        if (shippingAddress != null)
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("recipient_name", shippingAddress.getRecipientName());
            jsonobject.put("address_line_1", shippingAddress.getLine1());
            jsonobject.put("address_line_2", shippingAddress.getLine2());
            jsonobject.put("city", shippingAddress.getCity());
            jsonobject.put("county_state", shippingAddress.getStateOrCounty());
            jsonobject.put("postcode", shippingAddress.getZipOrPostalCode());
            jsonobject.put("country_code", shippingAddress.getCountry().iso3Code());
            ((JSONObject) (obj)).put("shipping_address", jsonobject);
        }
        return ((JSONObject) (obj));
    }

    public ArrayList getJobs()
    {
        return jobs;
    }

    public Date getLastPrintSubmissionDate()
    {
        return lastPrintSubmissionDate;
    }

    public Exception getLastPrintSubmissionError()
    {
        return lastPrintSubmissionError;
    }

    public String getNotificationEmail()
    {
        return statusNotificationEmail;
    }

    public String getNotificationPhoneNumber()
    {
        return statusNotificationPhone;
    }

    public OrderPricing getOrderPricing()
    {
        return mOrderPricing;
    }

    public String getPromoCode()
    {
        return promoCode;
    }

    public String getProofOfPayment()
    {
        return proofOfPayment;
    }

    public String getReceipt()
    {
        return receipt;
    }

    public Address getShippingAddress()
    {
        return shippingAddress;
    }

    public int getTotalAssetsToUpload()
    {
        return getAssetsToUpload().size();
    }

    public JSONObject getUserData()
    {
        return userData;
    }

    public String getVoucherCode()
    {
        return voucherCode;
    }

    public boolean isPrinted()
    {
        return receipt != null;
    }

    public void preemptAssetUpload(Context context)
    {
        if (isAssetUploadInProgress() || assetUploadComplete)
        {
            return;
        } else
        {
            startAssetUpload(context);
            return;
        }
    }

    public void removePrintJob(PrintJob printjob)
    {
        jobs.remove(printjob);
    }

    public void setNotificationEmail(String s)
    {
        statusNotificationEmail = s;
    }

    public void setNotificationPhoneNumber(String s)
    {
        statusNotificationPhone = s;
    }

    public void setOrderPricing(OrderPricing orderpricing)
    {
        mOrderPricing = orderpricing;
    }

    public void setPromoCode(String s)
    {
        promoCode = s;
    }

    public void setProofOfPayment(String s)
    {
        if (!s.startsWith("AP-") && !s.startsWith("PAY-"))
        {
            throw new IllegalArgumentException("Proof of payment must be a PayPal REST payment confirmation id or a PayPal Adaptive PayPalCard pay key i.e. PAY-... or AP-...");
        } else
        {
            proofOfPayment = s;
            return;
        }
    }

    public void setShippingAddress(Address address)
    {
        shippingAddress = address;
    }

    public void setUserData(JSONObject jsonobject)
    {
        userData = jsonobject;
    }

    public void setVoucherCode(String s)
    {
        voucherCode = s;
    }

    public void submitForPrinting(Context context, PrintOrderSubmissionListener printordersubmissionlistener)
    {
        if (userSubmittedForPrinting)
        {
            throw new AssertionError("A PrintOrder can only be submitted once unless you cancel the previous submission");
        }
        if (printOrderReq != null)
        {
            throw new AssertionError("A PrintOrder request should not already be in progress");
        }
        lastPrintSubmissionDate = new Date();
        userSubmittedForPrinting = true;
        submissionListener = printordersubmissionlistener;
        if (assetUploadComplete)
        {
            submitForPrinting(context);
        } else
        if (!isAssetUploadInProgress())
        {
            startAssetUpload(context);
            return;
        }
    }

    public String toBasketString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        toBasketString(stringbuilder);
        return stringbuilder.toString();
    }

    public void toBasketString(StringBuilder stringbuilder)
    {
        Iterator iterator = jobs.iterator();
        for (String s = ""; iterator.hasNext(); s = ",")
        {
            PrintJob printjob = (PrintJob)iterator.next();
            stringbuilder.append(s).append(printjob.getProductId()).append(":").append(String.valueOf(printjob.getQuantity()));
        }

    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(shippingAddress);
        parcel.writeString(proofOfPayment);
        parcel.writeString(voucherCode);
        Object obj;
        if (userData == null)
        {
            obj = null;
        } else
        {
            obj = userData.toString();
        }
        parcel.writeString(((String) (obj)));
        parcel.writeInt(jobs.size());
        for (obj = jobs.iterator(); ((Iterator) (obj)).hasNext();)
        {
            PrintJob printjob = (PrintJob)((Iterator) (obj)).next();
            if (printjob instanceof PostcardPrintJob)
            {
                parcel.writeInt(1);
                printjob.writeToParcel(parcel, i);
            } else
            {
                parcel.writeInt(0);
                printjob.writeToParcel(parcel, i);
            }
        }

        parcel.writeValue(Boolean.valueOf(userSubmittedForPrinting));
        parcel.writeValue(Boolean.valueOf(assetUploadComplete));
        parcel.writeValue(lastPrintSubmissionDate);
        parcel.writeString(receipt);
        parcel.writeSerializable(lastPrintSubmissionError);
        parcel.writeInt(storageIdentifier);
        parcel.writeString(promoCode);
        parcel.writeParcelable(mOrderPricing, i);
        parcel.writeString(statusNotificationEmail);
        parcel.writeString(statusNotificationPhone);
    }



/*
    static String access$002(PrintOrder printorder, String s)
    {
        printorder.receipt = s;
        return s;
    }

*/




/*
    static SubmitPrintOrderRequest access$202(PrintOrder printorder, SubmitPrintOrderRequest submitprintorderrequest)
    {
        printorder.printOrderReq = submitprintorderrequest;
        return submitprintorderrequest;
    }

*/



/*
    static boolean access$302(PrintOrder printorder, boolean flag)
    {
        printorder.userSubmittedForPrinting = flag;
        return flag;
    }

*/


/*
    static Exception access$402(PrintOrder printorder, Exception exception)
    {
        printorder.lastPrintSubmissionError = exception;
        return exception;
    }

*/



/*
    static List access$602(PrintOrder printorder, List list)
    {
        printorder.assetsToUpload = list;
        return list;
    }

*/



/*
    static boolean access$802(PrintOrder printorder, boolean flag)
    {
        printorder.assetUploadComplete = flag;
        return flag;
    }

*/


/*
    static AssetUploadRequest access$902(PrintOrder printorder, AssetUploadRequest assetuploadrequest)
    {
        printorder.assetUploadReq = assetuploadrequest;
        return assetuploadrequest;
    }

*/

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
