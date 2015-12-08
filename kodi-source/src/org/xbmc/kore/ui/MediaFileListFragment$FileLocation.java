// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

public static class artUrl
    implements Parcelable
{

    public static final android.os.ation.artUrl CREATOR = new android.os.Parcelable.Creator() {

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public MediaFileListFragment.FileLocation createFromParcel(Parcel parcel)
        {
            return new MediaFileListFragment.FileLocation(parcel, null);
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public MediaFileListFragment.FileLocation[] newArray(int i)
        {
            return new MediaFileListFragment.FileLocation[i];
        }

    };
    public final String artUrl;
    public final String details;
    public final String file;
    public final boolean isDirectory;
    private boolean isRoot;
    public final String sizeDuration;
    public final String title;

    public static artUrl newInstanceFromItemFile(Context context, org.xbmc.kore.jsonrpc.type.on on)
    {
        String s;
        byte byte0;
        s = on.on;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 72
    //                   -1544438277: 170
    //                   -759089802: 185
    //                   -577741570: 230
    //                   3536149: 215
    //                   92896879: 200
    //                   104087344: 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte0;
        JVM INSTR tableswitch 0 4: default 108
    //                   0 245
    //                   1 272
    //                   2 334
    //                   3 391
    //                   4 391;
           goto _L8 _L9 _L10 _L11 _L12 _L12
_L8:
        String s1;
        String s2;
        context = on.on;
        s = null;
        s2 = on.on;
        s1 = UIUtils.formatFileSize(on.on);
_L13:
        return new <init>(context, on.on, on.on.equalsIgnoreCase("directory"), s, s1, s2);
_L7:
        if (s.equals("movie"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s.equals("episode"))
        {
            byte0 = 1;
        }
          goto _L1
_L3:
        if (s.equals("musicvideo"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        if (s.equals("album"))
        {
            byte0 = 3;
        }
          goto _L1
_L5:
        if (s.equals("song"))
        {
            byte0 = 4;
        }
          goto _L1
_L4:
        if (s.equals("picture"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        context = on.on;
        s = on.on;
        s1 = UIUtils.formatTime(on.on);
        s2 = on.on;
          goto _L13
_L10:
        s = on.on;
        String s3 = String.format(context.getString(0x7f070081), new Object[] {
            Integer.valueOf(on.on), Integer.valueOf(on.on)
        });
        s1 = UIUtils.formatTime(on.on);
        s2 = on.on;
        context = s;
        s = s3;
          goto _L13
_L11:
        context = on.on;
        s = (new StringBuilder()).append(Utils.listStringConcat(on.on, ", ")).append(" | ").append(on.on).toString();
        s1 = UIUtils.formatTime(on.on);
        s2 = on.on;
          goto _L13
_L12:
        context = on.on;
        s = (new StringBuilder()).append(on.on).append(" | ").append(on.on).toString();
        s2 = on.on;
        s1 = UIUtils.formatTime(on.on);
          goto _L13
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean isRootDir()
    {
        return isRoot;
    }

    public void setRootDir(boolean flag)
    {
        isRoot = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(title);
        parcel.writeString(file);
        if (isDirectory)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isRoot)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(details);
        parcel.writeString(sizeDuration);
        parcel.writeString(artUrl);
    }


    private _cls1(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        title = parcel.readString();
        file = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isDirectory = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isRoot = flag;
        details = parcel.readString();
        sizeDuration = parcel.readString();
        artUrl = parcel.readString();
    }

    artUrl(Parcel parcel, artUrl arturl)
    {
        this(parcel);
    }

    public <init>(String s, String s1, boolean flag)
    {
        this(s, s1, flag, null, null, null);
    }

    public <init>(String s, String s1, boolean flag, String s2, String s3, String s4)
    {
        title = s;
        file = s1;
        isDirectory = flag;
        isRoot = false;
        details = s2;
        sizeDuration = s3;
        artUrl = s4;
    }
}
