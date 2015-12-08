// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Json;
import com.dominos.android.sdk.common.dom.order.Address;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.google.b.ab;
import com.google.b.k;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserObject
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private ArrayList addressList;
    private boolean agreedToTerms;
    private String alternatePhone;
    private String alternatePhoneExtension;
    private String customerId;
    private String email;
    private boolean emailOptIn;
    private String emailOptInTime;
    private String firstName;
    private String lastName;
    private CustomerLoyalty mCustomerLoyalty;
    private boolean over13;
    private String password;
    private String passwordHash;
    private String passwordSalt;
    private String phone;
    private String phoneExtension;
    private String smsOptInTime;
    private int status;
    private String updateTime;

    public UserObject()
    {
        addressList = new ArrayList();
    }

    public UserObject(Parcel parcel)
    {
        addressList = new ArrayList();
        addressList = parcel.readArrayList(com/dominos/android/sdk/core/models/LabsAddress.getClassLoader());
        customerId = parcel.readString();
        email = parcel.readString();
        firstName = parcel.readString();
        lastName = parcel.readString();
        phone = parcel.readString();
        phoneExtension = parcel.readString();
        alternatePhone = parcel.readString();
        alternatePhoneExtension = parcel.readString();
        passwordHash = parcel.readString();
        passwordSalt = parcel.readString();
        emailOptInTime = parcel.readString();
        smsOptInTime = parcel.readString();
        updateTime = parcel.readString();
        password = parcel.readString();
        status = parcel.readInt();
        mCustomerLoyalty = (CustomerLoyalty)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/CustomerLoyalty.getClassLoader());
    }

    public static UserObject from(String s)
    {
        boolean flag = false;
        new ab();
        z z1 = (z)ab.a(s);
        UserObject userobject = new UserObject();
        int i;
        boolean flag1;
        if (z1.a("Age13OrOlder"))
        {
            flag1 = z1.b("Age13OrOlder").g();
        } else
        {
            flag1 = false;
        }
        userobject.setOver13(flag1);
        if (z1.a("AgreeToTermsOfUse"))
        {
            flag1 = z1.b("AgreeToTermsOfUse").g();
        } else
        {
            flag1 = false;
        }
        userobject.setAgreedToTerms(flag1);
        if (z1.a("AlternateExtension"))
        {
            s = z1.b("AlternateExtension").c();
        } else
        {
            s = "";
        }
        userobject.setAlternatePhoneExtension(s);
        if (z1.a("AlternatePhone"))
        {
            s = z1.b("AlternatePhone").c();
        } else
        {
            s = "";
        }
        userobject.setAlternatePhone(s);
        if (z1.a("CustomerID"))
        {
            s = z1.b("CustomerID").c();
        } else
        {
            s = "";
        }
        userobject.setCustomerId(s);
        if (z1.a("Email"))
        {
            s = z1.b("Email").c();
        } else
        {
            s = "";
        }
        userobject.setEmail(s);
        if (z1.a("EmailOptIn"))
        {
            flag1 = z1.b("EmailOptIn").g();
        } else
        {
            flag1 = false;
        }
        userobject.setEmailOptIn(flag1);
        if (z1.a("EmailOptInTime"))
        {
            s = z1.b("EmailOptInTime").c();
        } else
        {
            s = "";
        }
        userobject.setEmailOptInTime(s);
        if (z1.a("Extension"))
        {
            s = z1.b("Extension").c();
        } else
        {
            s = "";
        }
        userobject.setPhoneExtension(s);
        if (z1.a("FirstName"))
        {
            s = z1.b("FirstName").c();
        } else
        {
            s = "";
        }
        userobject.setFirstName(s);
        if (z1.a("LastName"))
        {
            s = z1.b("LastName").c();
        } else
        {
            s = "";
        }
        userobject.setLastName(s);
        if (z1.a("PasswordHash"))
        {
            s = z1.b("PasswordHash").c();
        } else
        {
            s = "";
        }
        userobject.setPasswordHash(s);
        if (z1.a("PasswordSalt"))
        {
            s = z1.b("PasswordSalt").c();
        } else
        {
            s = "";
        }
        userobject.setPasswordSalt(s);
        if (z1.a("Password"))
        {
            s = z1.b("Password").c();
        } else
        {
            s = "";
        }
        userobject.setPassword(s);
        if (z1.a("Phone"))
        {
            s = z1.b("Phone").c();
        } else
        {
            s = "";
        }
        userobject.setPhone(s);
        if (z1.a("SmsOptInTime"))
        {
            s = z1.b("SmsOptInTime").c();
        } else
        {
            s = "";
        }
        userobject.setSmsOptInTime(s);
        if (z1.a("Status"))
        {
            i = z1.b("Status").f();
        } else
        {
            i = 0;
        }
        userobject.setStatus(i);
        if (z1.a("UpdateTime"))
        {
            s = z1.b("UpdateTime").c();
        } else
        {
            s = "";
        }
        userobject.setUpdateTime(s);
        s = z1.c("Addresses");
        if (s != null)
        {
            ArrayList arraylist = new ArrayList();
            for (i = ((flag) ? 1 : 0); i < s.a(); i++)
            {
                z z2 = s.a(i).h();
                if (z2 != null)
                {
                    arraylist.add(new LabsAddress(z2));
                }
            }

            userobject.setAddressList(arraylist);
        }
        if (z1.a("Loyalty"))
        {
            s = z1.b("Loyalty");
        } else
        {
            s = null;
        }
        if (s != null)
        {
            userobject.setCustomerLoyalty((CustomerLoyalty)(new k()).a(s.toString(), com/dominos/android/sdk/core/models/loyalty/CustomerLoyalty));
        }
        return userobject;
    }

    public static UserObject parseUserObject(JSONObject jsonobject)
    {
        int i = 0;
        UserObject userobject = new UserObject();
        userobject.setOver13(jsonobject.optBoolean("Age13OrOlder", false));
        userobject.setAgreedToTerms(jsonobject.optBoolean("AgreeToTermsOfUse", false));
        userobject.setCustomerId(jsonobject.optString("CustomerID", ""));
        userobject.setEmail(jsonobject.optString("Email", ""));
        userobject.setEmailOptIn(jsonobject.optBoolean("EmailOptIn", false));
        userobject.setEmailOptInTime(jsonobject.optString("EmailOptInTime", ""));
        userobject.setPhoneExtension(jsonobject.optString("Extension", ""));
        userobject.setFirstName(jsonobject.optString("FirstName", ""));
        userobject.setLastName(jsonobject.optString("LastName", ""));
        userobject.setPasswordHash(jsonobject.optString("PasswordHash", ""));
        userobject.setPasswordSalt(jsonobject.optString("PasswordSalt", ""));
        userobject.setPassword(jsonobject.optString("Password", ""));
        userobject.setPhone(jsonobject.optString("Phone", ""));
        userobject.setSmsOptInTime(jsonobject.optString("SmsOptInTime", ""));
        userobject.setStatus(jsonobject.optInt("Status", 0));
        userobject.setUpdateTime(jsonobject.optString("UpdateTime", ""));
        userobject.setAlternatePhone(jsonobject.optString("AlternatePhone", ""));
        userobject.setAlternatePhoneExtension(jsonobject.optString("AlternateExtension", ""));
        JSONArray jsonarray = jsonobject.optJSONArray("Addresses");
        if (jsonarray != null)
        {
            for (; i < jsonarray.length(); i++)
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(i);
                if (jsonobject1 != null)
                {
                    userobject.addAddress(new LabsAddress(Address.from(Json.parse(jsonobject1.toString()))));
                }
            }

        }
        jsonobject = jsonobject.optJSONObject("Loyalty");
        if (jsonobject != null)
        {
            userobject.setCustomerLoyalty((CustomerLoyalty)(new k()).a(jsonobject.toString(), com/dominos/android/sdk/core/models/loyalty/CustomerLoyalty));
        }
        return userobject;
    }

    public void addAddress(LabsAddress labsaddress)
    {
        addressList.add(labsaddress);
    }

    public UserObject copy()
    {
        return parseUserObject(toJson());
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAddressList()
    {
        return addressList;
    }

    public String getAlternatePhone()
    {
        return alternatePhone;
    }

    public String getAlternatePhoneExtension()
    {
        return alternatePhoneExtension;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public CustomerLoyalty getCustomerLoyalty()
    {
        return mCustomerLoyalty;
    }

    public String getEmail()
    {
        return email;
    }

    public String getEmailOptInTime()
    {
        return emailOptInTime;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public String getPasswordHash()
    {
        return passwordHash;
    }

    public String getPasswordSalt()
    {
        return passwordSalt;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPhoneExtension()
    {
        return phoneExtension;
    }

    public String getSmsOptInTime()
    {
        return smsOptInTime;
    }

    public int getStatus()
    {
        return status;
    }

    public String getUpdateTime()
    {
        return updateTime;
    }

    public boolean isAgreedToTerms()
    {
        return agreedToTerms;
    }

    public boolean isEmailOptIn()
    {
        return emailOptIn;
    }

    public boolean isOver13()
    {
        return over13;
    }

    public void removeAddress(int i)
    {
        addressList.remove(i);
    }

    public void setAddressList(ArrayList arraylist)
    {
        addressList = arraylist;
    }

    public void setAgreedToTerms(boolean flag)
    {
        agreedToTerms = flag;
    }

    public void setAlternatePhone(String s)
    {
        if (s != null)
        {
            s = s.replaceAll("[^0-9]+", "");
        } else
        {
            s = null;
        }
        alternatePhone = s;
    }

    public void setAlternatePhoneExtension(String s)
    {
        alternatePhoneExtension = s;
    }

    public void setCustomerId(String s)
    {
        customerId = s;
    }

    public void setCustomerLoyalty(CustomerLoyalty customerloyalty)
    {
        mCustomerLoyalty = customerloyalty;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEmailOptIn(boolean flag)
    {
        emailOptIn = flag;
    }

    public void setEmailOptInTime(String s)
    {
        emailOptInTime = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setOver13(boolean flag)
    {
        over13 = flag;
    }

    public void setPassword(String s)
    {
        password = s;
    }

    public void setPasswordHash(String s)
    {
        passwordHash = s;
    }

    public void setPasswordSalt(String s)
    {
        passwordSalt = s;
    }

    public void setPhone(String s)
    {
        if (s != null)
        {
            s = s.replaceAll("[^0-9]+", "");
        } else
        {
            s = null;
        }
        phone = s;
    }

    public void setPhoneExtension(String s)
    {
        phoneExtension = s;
    }

    public void setSmsOptInTime(String s)
    {
        smsOptInTime = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setUpdateTime(String s)
    {
        updateTime = s;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("Age13OrOlder", over13);
        jsonobject.put("AgreeToTermsOfUse", agreedToTerms);
        jsonobject.put("CustomerID", customerId);
        jsonobject.put("Email", email);
        jsonobject.put("EmailOptIn", emailOptIn);
        jsonobject.put("EmailOptInTime", emailOptInTime);
        jsonobject.put("Extension", phoneExtension);
        jsonobject.put("FirstName", firstName);
        jsonobject.put("LastName", lastName);
        jsonobject.put("PasswordHash", passwordHash);
        jsonobject.put("PasswordSalt", passwordSalt);
        jsonobject.put("Password", password);
        jsonobject.put("Phone", phone);
        jsonobject.put("SmsOptInTime", smsOptInTime);
        jsonobject.put("Status", status);
        jsonobject.put("UpdateTime", updateTime);
        jsonobject.put("AlternatePhone", alternatePhone);
        jsonobject.put("AlternateExtension", alternatePhoneExtension);
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = getAddressList().iterator(); iterator.hasNext(); jsonarray.put(((LabsAddress)iterator.next()).toJson())) { }
        if (mCustomerLoyalty != null)
        {
            StringHelper.isNotEmpty(mCustomerLoyalty.getCommand());
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("Command", mCustomerLoyalty.getCommand());
            jsonobject.put("Loyalty", jsonobject1);
        }
        jsonobject.put("Addresses", jsonarray);
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = toJson().toString();
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return "";
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(addressList);
        parcel.writeString(customerId);
        parcel.writeString(email);
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(phone);
        parcel.writeString(phoneExtension);
        parcel.writeString(alternatePhone);
        parcel.writeString(alternatePhoneExtension);
        parcel.writeString(passwordHash);
        parcel.writeString(passwordSalt);
        parcel.writeString(emailOptInTime);
        parcel.writeString(phone);
        parcel.writeString(smsOptInTime);
        parcel.writeString(updateTime);
        parcel.writeString(password);
        parcel.writeInt(status);
        parcel.writeParcelable(mCustomerLoyalty, i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final UserObject createFromParcel(Parcel parcel)
        {
            return new UserObject(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UserObject[] newArray(int i)
        {
            return new UserObject[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
