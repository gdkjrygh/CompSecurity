// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.os.Parcel;
import java.io.Externalizable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMSDK, MMLog, VideoAd, AdCache, 
//            MMAdImpl

abstract class CachedAd
    implements Externalizable
{

    static final int INTERSTITIAL = 2;
    static final int NATIVE = 3;
    private static final String TAG = "CachedAd";
    static final int VIDEO = 1;
    static final long serialVersionUID = 0x465b8f9134839c6L;
    String acid;
    String contentUrl;
    long deferredViewStart;
    boolean downloadAllOrNothing;
    int downloadPriority;
    Date expiration;
    private String id;

    CachedAd()
    {
        downloadAllOrNothing = false;
        deferredViewStart = System.currentTimeMillis();
    }

    protected CachedAd(Parcel parcel)
    {
        downloadAllOrNothing = false;
        try
        {
            id = parcel.readString();
            acid = parcel.readString();
            expiration = (Date)parcel.readSerializable();
            deferredViewStart = parcel.readLong();
            boolean aflag[] = new boolean[1];
            parcel.readBooleanArray(aflag);
            downloadAllOrNothing = aflag[0];
            contentUrl = parcel.readString();
            downloadPriority = parcel.readInt();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            parcel.printStackTrace();
        }
    }

    static CachedAd parseJSON(String s)
    {
        VideoAd videoad = null;
        if (MMSDK.logLevel < 5) goto _L2; else goto _L1
_L1:
        int i1;
        MMLog.v("CachedAd", "Received cached ad.");
        i1 = s.length();
        if (i1 <= 1000) goto _L4; else goto _L3
_L3:
        int i = 999;
        int j = 0;
        int k;
        int l;
        do
        {
            l = i;
            k = j;
            if (i >= i1)
            {
                break;
            }
            MMLog.v("CachedAd", s.substring(j, i));
            k = i;
            l = i + 1000;
            i = l;
            j = k;
            if (l <= i1)
            {
                continue;
            }
            l = i1 - 1;
            break;
        } while (true);
        MMLog.v("CachedAd", s.substring(k, l));
_L2:
        if (s.length() > 0)
        {
            videoad = new VideoAd(s);
        }
        return videoad;
_L4:
        MMLog.v("CachedAd", s);
        if (true) goto _L2; else goto _L5
_L5:
    }

    abstract boolean canShow(Context context, MMAdImpl mmadimpl, boolean flag);

    void delete(Context context)
    {
        context = AdCache.getInternalCacheDirectory(context);
        if (context == null || !context.isDirectory()) goto _L2; else goto _L1
_L1:
        context = context.listFiles(new FileFilter() {

            final CachedAd this$0;

            public boolean accept(File file)
            {
                return file.isFile() && file.getName().startsWith(id);
            }

            
            {
                this$0 = CachedAd.this;
                super();
            }
        });
        MMLog.v("CachedAd", String.format("Deleting %d files for %s.", new Object[] {
            Integer.valueOf(context.length), id
        }));
        int i = 0;
_L3:
        if (i >= context.length)
        {
            break; /* Loop/switch isn't completed */
        }
        context[i].delete();
        i++;
        if (true) goto _L3; else goto _L2
        context;
        MMLog.e("CachedAd", "Exception deleting cached ad: ", context);
_L2:
    }

    protected void deserializeFromObj(JSONObject jsonobject)
    {
        SimpleDateFormat simpledateformat;
        id = jsonobject.optString("id", null);
        acid = jsonobject.optString("vid", null);
        contentUrl = jsonobject.optString("content-url", null);
        jsonobject = jsonobject.optString("expiration", null);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZZ");
        expiration = simpledateformat.parse(jsonobject);
        return;
        jsonobject;
        MMLog.e("CachedAd", "Exception deserializing cached ad: ", jsonobject);
        return;
    }

    abstract boolean download(Context context);

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof CachedAd))
        {
            return false;
        } else
        {
            obj = (CachedAd)obj;
            return id.equals(((CachedAd) (obj)).id);
        }
    }

    String getId()
    {
        return id;
    }

    abstract int getType();

    abstract String getTypeString();

    boolean isExpired()
    {
        return expiration != null && expiration.getTime() <= System.currentTimeMillis();
    }

    abstract boolean isOnDisk(Context context);

    boolean isValid()
    {
        return id != null && id.length() > 0 && contentUrl != null && contentUrl.length() > 0;
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException, ClassNotFoundException
    {
        id = (String)objectinput.readObject();
        acid = (String)objectinput.readObject();
        expiration = (Date)objectinput.readObject();
        deferredViewStart = objectinput.readLong();
        contentUrl = (String)objectinput.readObject();
    }

    abstract boolean saveAssets(Context context);

    void setId(String s)
    {
        id = s;
    }

    abstract void show(Context context, long l);

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeObject(id);
        objectoutput.writeObject(acid);
        objectoutput.writeObject(expiration);
        objectoutput.writeLong(deferredViewStart);
        objectoutput.writeObject(contentUrl);
    }

    protected void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(acid);
        parcel.writeSerializable(expiration);
        parcel.writeLong(deferredViewStart);
        parcel.writeBooleanArray(new boolean[] {
            downloadAllOrNothing
        });
        parcel.writeString(contentUrl);
        parcel.writeInt(downloadPriority);
    }

}
