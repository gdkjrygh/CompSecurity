// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.print.PrintAttributes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.hp.mss.hpprint.model:
//            PrintItem, PDFPrintItem

public class PrintJobData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    String a;
    private String b;
    private Map c;
    private PrintItem d;
    private PrintAttributes e;
    private Context f;

    public PrintJobData(Context context, PrintItem printitem)
    {
        a = "N/A";
        a(printitem);
        if (printitem == null)
        {
            throw new NullPointerException("defaultPrintItem is required to be set.");
        } else
        {
            f = context;
            return;
        }
    }

    protected PrintJobData(Parcel parcel)
    {
        a = "N/A";
        b = parcel.readString();
        e = (PrintAttributes)parcel.readValue(android/print/PrintAttributes.getClassLoader());
        int j = parcel.readInt();
        c = new HashMap();
        for (int i = 0; i < j; i++)
        {
            c.put(new android.print.PrintAttributes.MediaSize(parcel.readString(), "android", parcel.readInt(), parcel.readInt()), (PrintItem)parcel.readValue(com/hp/mss/hpprint/model/PrintItem.getClassLoader()));
        }

    }

    public PrintItem a(android.print.PrintAttributes.MediaSize mediasize)
    {
        Object obj;
        if (c == null)
        {
            obj = d;
            obj.b = mediasize;
        } else
        {
            PrintItem printitem = (PrintItem)c.get(mediasize);
            obj = printitem;
            if (printitem == null)
            {
                mediasize = (PrintItem)c.get(new android.print.PrintAttributes.MediaSize(mediasize.getId(), mediasize.getLabel(f.getPackageManager()), mediasize.getHeightMils(), mediasize.getWidthMils()));
                obj = mediasize;
                if (mediasize == null)
                {
                    return d;
                }
            }
        }
        return ((PrintItem) (obj));
    }

    public String a()
    {
        return b;
    }

    public void a(PrintAttributes printattributes)
    {
        e = printattributes;
    }

    public void a(PrintItem printitem)
    {
        d = printitem;
    }

    public void a(String s)
    {
        b = s;
    }

    public PrintItem b()
    {
        return d;
    }

    public void b(String s)
    {
        a = s;
    }

    public Map c()
    {
        return c;
    }

    public PrintAttributes d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return a;
    }

    public boolean f()
    {
        if (b() instanceof PDFPrintItem)
        {
            return true;
        }
        if (c == null)
        {
            return false;
        }
        for (Iterator iterator = c.values().iterator(); iterator.hasNext();)
        {
            if ((PrintItem)iterator.next() instanceof PDFPrintItem)
            {
                return true;
            }
        }

        return false;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeValue(e);
        parcel.writeInt(c.size());
        android.print.PrintAttributes.MediaSize mediasize;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); parcel.writeValue(c.get(mediasize)))
        {
            mediasize = (android.print.PrintAttributes.MediaSize)iterator.next();
            parcel.writeString(mediasize.getId());
            parcel.writeInt(mediasize.getWidthMils());
            parcel.writeInt(mediasize.getHeightMils());
        }

    }


    /* member class not found */
    class _cls1 {}

}
