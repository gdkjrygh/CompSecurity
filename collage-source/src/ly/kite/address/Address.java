// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ly.kite.address:
//            Country, AddressSearchRequest, AddressSearchRequestListener

public class Address
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final int NOT_PERSITED = -1;
    private static final String PERSISTED_ADDRESS_BOOK_FILENAME = "address_book";
    private static final long serialVersionUID = 0L;
    private String addressId;
    private String city;
    private Country country;
    private String displayName;
    private String line1;
    private String line2;
    private String recipientName;
    private boolean searchRequiredForFullDetails;
    private String stateOrCounty;
    private int storageIdentifier;
    private String zipOrPostalCode;

    public Address()
    {
        storageIdentifier = -1;
    }

    private Address(Parcel parcel)
    {
        boolean flag = true;
        super();
        storageIdentifier = -1;
        recipientName = parcel.readString();
        line1 = parcel.readString();
        line2 = parcel.readString();
        city = parcel.readString();
        stateOrCounty = parcel.readString();
        zipOrPostalCode = parcel.readString();
        country = Country.getInstance(parcel.readString());
        addressId = parcel.readString();
        displayName = parcel.readString();
        storageIdentifier = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        searchRequiredForFullDetails = flag;
    }

    Address(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public Address(String s, String s1, String s2, String s3, String s4, String s5, Country country1)
    {
        storageIdentifier = -1;
        recipientName = s;
        line1 = s1;
        line2 = s2;
        city = s3;
        stateOrCounty = s4;
        zipOrPostalCode = s5;
        country = country1;
    }

    static Address createPartialAddress(String s, String s1)
    {
        Address address = new Address();
        address.addressId = s;
        address.displayName = s1;
        address.searchRequiredForFullDetails = true;
        return address;
    }

    public static List getAddressBook(Context context)
    {
        ObjectInputStream objectinputstream = new ObjectInputStream(new BufferedInputStream(context.openFileInput("address_book")));
        Object obj = objectinputstream;
        ArrayList arraylist = (ArrayList)objectinputstream.readObject();
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return arraylist;
        }
        return arraylist;
        obj;
        objectinputstream = null;
_L6:
        obj = objectinputstream;
        arraylist = new ArrayList();
        obj = objectinputstream;
        persistAddressesToDisk(context, arraylist);
        try
        {
            objectinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return arraylist;
        }
        return arraylist;
        context;
        obj = null;
_L4:
        throw new RuntimeException(context);
        context;
_L2:
        try
        {
            ((ObjectInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw context;
        context;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        obj = objectinputstream;
        if (true) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Address getKiteTeamAddress()
    {
        Address address = new Address();
        address.recipientName = "Kite Team";
        address.line1 = "Eastcastle House";
        address.line2 = "27-28 Eastcastle St";
        address.city = "London";
        address.zipOrPostalCode = "W1W 8DH";
        address.country = Country.getInstance("GBR");
        return address;
    }

    public static int getNextStorageIdentifier(List list)
    {
        int i = 0;
        int j;
        int k;
        for (j = 0; i < list.size(); j = k)
        {
            Address address = (Address)list.get(i);
            k = j;
            if (j <= address.storageIdentifier)
            {
                k = address.storageIdentifier + 1;
            }
            i++;
        }

        return j;
    }

    private static void persistAddressesToDisk(Context context, List list)
    {
        Object obj = null;
        context = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("address_book", 0)));
        context.writeObject(list);
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        context = null;
_L4:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        list = obj;
_L2:
        try
        {
            list.close();
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw context;
        Exception exception;
        exception;
        list = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
        list;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        recipientName = (String)objectinputstream.readObject();
        line1 = (String)objectinputstream.readObject();
        line2 = (String)objectinputstream.readObject();
        city = (String)objectinputstream.readObject();
        stateOrCounty = (String)objectinputstream.readObject();
        zipOrPostalCode = (String)objectinputstream.readObject();
        country = Country.getInstance((String)objectinputstream.readObject());
        addressId = (String)objectinputstream.readObject();
        displayName = (String)objectinputstream.readObject();
        storageIdentifier = objectinputstream.readInt();
        boolean flag;
        if (objectinputstream.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        searchRequiredForFullDetails = flag;
    }

    public static AddressSearchRequest search(Context context, String s, Country country1, AddressSearchRequestListener addresssearchrequestlistener)
    {
        AddressSearchRequest addresssearchrequest = new AddressSearchRequest();
        addresssearchrequest.search(context, s, country1, addresssearchrequestlistener);
        return addresssearchrequest;
    }

    public static AddressSearchRequest search(Context context, Address address, AddressSearchRequestListener addresssearchrequestlistener)
    {
        AddressSearchRequest addresssearchrequest = new AddressSearchRequest();
        addresssearchrequest.search(context, address, addresssearchrequestlistener);
        return addresssearchrequest;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(recipientName);
        objectoutputstream.writeObject(line1);
        objectoutputstream.writeObject(line2);
        objectoutputstream.writeObject(city);
        objectoutputstream.writeObject(stateOrCounty);
        objectoutputstream.writeObject(zipOrPostalCode);
        objectoutputstream.writeObject(country.iso2Code());
        objectoutputstream.writeObject(addressId);
        objectoutputstream.writeObject(displayName);
        objectoutputstream.writeInt(storageIdentifier);
        int i;
        if (searchRequiredForFullDetails)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        objectoutputstream.writeInt(i);
    }

    public void deleteFromAddressBook(Context context)
    {
        if (!isSavedInAddressBook())
        {
            return;
        }
        List list = getAddressBook(context);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Address)iterator.next()).storageIdentifier != storageIdentifier)
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        persistAddressesToDisk(context, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCity()
    {
        return city;
    }

    public Country getCountry()
    {
        return country;
    }

    String getDisplayAddressWithoutRecipient()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (line1 != null && line1.trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(line1);
        }
        if (line2 != null && line2.trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(line2);
        }
        if (city != null && city.trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(city);
        }
        if (stateOrCounty != null && stateOrCounty.trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(stateOrCounty);
        }
        if (zipOrPostalCode != null && zipOrPostalCode.trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(zipOrPostalCode);
        }
        if (country != null && country.displayName().trim().length() > 0)
        {
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(country.displayName());
        }
        return stringbuilder.toString();
    }

    String getId()
    {
        return addressId;
    }

    public String getLine1()
    {
        return line1;
    }

    public String getLine2()
    {
        return line2;
    }

    public String getRecipientName()
    {
        return recipientName;
    }

    public String getStateOrCounty()
    {
        return stateOrCounty;
    }

    public String getZipOrPostalCode()
    {
        return zipOrPostalCode;
    }

    public boolean isSavedInAddressBook()
    {
        return storageIdentifier != -1;
    }

    public boolean isSearchRequiredForFullDetails()
    {
        return searchRequiredForFullDetails;
    }

    public void saveToAddressBook(Context context)
    {
        Object obj = getAddressBook(context);
        if (!isSavedInAddressBook())
        {
            storageIdentifier = getNextStorageIdentifier(((List) (obj)));
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(this);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Address address = (Address)((Iterator) (obj)).next();
            if (address.storageIdentifier != storageIdentifier)
            {
                arraylist.add(address);
            }
        } while (true);
        persistAddressesToDisk(context, arraylist);
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountry(Country country1)
    {
        country = country1;
    }

    public void setLine1(String s)
    {
        line1 = s;
    }

    public void setLine2(String s)
    {
        line2 = s;
    }

    public void setRecipientName(String s)
    {
        recipientName = s;
    }

    public void setStateOrCounty(String s)
    {
        stateOrCounty = s;
    }

    public void setZipOrPostalCode(String s)
    {
        zipOrPostalCode = s;
    }

    public String toString()
    {
        if (displayName != null)
        {
            return displayName;
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (recipientName != null && recipientName.trim().length() > 0)
        {
            stringbuilder.append(recipientName);
        }
        String s1 = getDisplayAddressWithoutRecipient();
        if (s1 != null && s1.trim().length() > 0)
        {
            String s;
            if (stringbuilder.length() > 0)
            {
                s = ", ";
            } else
            {
                s = "";
            }
            stringbuilder.append(s).append(s1);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(recipientName);
        parcel.writeString(line1);
        parcel.writeString(line2);
        parcel.writeString(city);
        parcel.writeString(stateOrCounty);
        parcel.writeString(zipOrPostalCode);
        parcel.writeString(country.iso2Code());
        parcel.writeString(addressId);
        parcel.writeString(displayName);
        parcel.writeInt(storageIdentifier);
        if (searchRequiredForFullDetails)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    /* member class not found */
    class _cls1 {}

}
