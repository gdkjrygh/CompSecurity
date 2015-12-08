// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.paypal.android.sdk.fo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ch, ShippingAddress

final class bA
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ch();
    private JSONArray a;
    private ShippingAddress b;
    private int c;
    private int d;
    private JSONObject e;
    private JSONArray f;
    private int g;
    private String h;
    private String i;

    public bA(Parcel parcel)
    {
        c = -1;
        g = -1;
        if (parcel == null) goto _L2; else goto _L1
_L1:
        String s = parcel.readString();
        if (s == null) goto _L4; else goto _L3
_L3:
        try
        {
            a = new JSONArray(s);
        }
        catch (JSONException jsonexception)
        {
            a = null;
        }
_L8:
        b = (ShippingAddress)parcel.readParcelable(com/paypal/android/sdk/payments/ShippingAddress.getClassLoader());
        s = parcel.readString();
        if (s == null) goto _L6; else goto _L5
_L5:
        try
        {
            e = new JSONObject(s);
        }
        catch (JSONException jsonexception1)
        {
            e = null;
        }
        s = parcel.readString();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        try
        {
            f = new JSONArray(s);
        }
        catch (JSONException jsonexception2)
        {
            f = null;
        }
        h = parcel.readString();
        i = parcel.readString();
        g = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
_L2:
        return;
_L4:
        a = null;
        continue; /* Loop/switch isn't completed */
_L6:
        e = null;
        if (true)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        f = null;
        break MISSING_BLOCK_LABEL_97;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public bA(fo fo1, ShippingAddress shippingaddress)
    {
        c = -1;
        g = -1;
        a = fo1.w();
        e = fo1.x();
        f = fo1.y();
        h = fo1.u();
        i = fo1.v();
        b = shippingaddress;
        if (b != null)
        {
            c = 0;
            d = a(b, a);
            return;
        } else
        {
            c = a(a);
            d = -1;
            return;
        }
    }

    private static int a(ShippingAddress shippingaddress, JSONArray jsonarray)
    {
        if (shippingaddress != null && jsonarray != null)
        {
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                if (shippingaddress.a(jsonarray.optJSONObject(i1)))
                {
                    return i1;
                }
            }

        }
        return -1;
    }

    private static int a(JSONArray jsonarray)
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        int j1 = -1;
_L4:
        return j1;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= jsonarray.length())
                {
                    break label1;
                }
                j1 = i1;
                if (jsonarray.optJSONObject(i1).optBoolean("default_address", false))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return 0;
    }

    public final JSONArray a()
    {
        return a;
    }

    public final void a(int i1)
    {
        g = i1;
    }

    public final ShippingAddress b()
    {
        return b;
    }

    public final void b(int i1)
    {
        c = i1;
    }

    public final JSONObject c()
    {
        return e;
    }

    public final JSONArray d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return h;
    }

    public final String f()
    {
        return i;
    }

    public final int g()
    {
        if (g < 0)
        {
            return 0;
        } else
        {
            return g;
        }
    }

    public final int h()
    {
        if (c < 0)
        {
            return 0;
        } else
        {
            return c;
        }
    }

    public final int i()
    {
        return d;
    }

    public final boolean j()
    {
        return g != -1;
    }

    public final boolean k()
    {
        return c != -1;
    }

    public final JSONObject l()
    {
        if (g <= 0)
        {
            return null;
        } else
        {
            return f.optJSONObject(g - 1);
        }
    }

    public final JSONObject m()
    {
        if (c < 0)
        {
            return null;
        }
        if (b != null)
        {
            if (c == 0)
            {
                if (d < 0)
                {
                    return b.a();
                } else
                {
                    return a.optJSONObject(d);
                }
            }
            int j1 = c - 1;
            int i1 = j1;
            if (d >= 0)
            {
                i1 = j1;
                if (j1 >= d)
                {
                    i1 = j1 + 1;
                }
            }
            return a.optJSONObject(i1);
        } else
        {
            return a.optJSONObject(c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        Object obj = null;
        String s;
        if (a != null)
        {
            s = a.toString();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeParcelable(b, 0);
        if (e != null)
        {
            s = e.toString();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        s = obj;
        if (f != null)
        {
            s = f.toString();
        }
        parcel.writeString(s);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeInt(g);
        parcel.writeInt(c);
        parcel.writeInt(d);
    }

}
