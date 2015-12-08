// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Asset
    implements Parcelable
{

    public static final int BITMAP_TO_JPEG_QUALITY = 80;
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String JPEG_FILE_SUFFIX_PRIMARY = ".jpg";
    public static final String JPEG_FILE_SUFFIX_SECONDARY = ".jpeg";
    private static final String LOG_TAG = "Asset";
    public static final String PNG_FILE_SUFFIX = ".png";
    private Bitmap mBitmap;
    private int mBitmapResourceId;
    private boolean mHasBeenUploaded;
    private long mId;
    private byte mImageBytes[];
    private String mImageFilePath;
    private Uri mImageURI;
    private MIMEType mMIMEType;
    private URL mPreviewURL;
    private URL mRemoteURL;
    private Type mType;

    public Asset(int i)
    {
    /* block-local class not found */
    class Type {}

        mType = Type.BITMAP_RESOURCE_ID;
        mBitmapResourceId = i;
    }

    public Asset(Bitmap bitmap)
    {
        mType = Type.BITMAP;
        mBitmap = bitmap;
    }

    public Asset(Uri uri)
    {
        if (!uri.getScheme().equalsIgnoreCase("content"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Only uris with content schemes are currently supported, your scheme ").append(uri.getScheme()).append(" is not").toString());
        } else
        {
            mType = Type.IMAGE_URI;
            mImageURI = uri;
            return;
        }
    }

    Asset(Parcel parcel)
    {
        mType = Type.valueOf(parcel.readString());
        mImageURI = (Uri)parcel.readValue(android/net/Uri.getClassLoader());
        mRemoteURL = (URL)parcel.readSerializable();
        mBitmapResourceId = parcel.readInt();
        mImageFilePath = parcel.readString();
    /* block-local class not found */
    class MIMEType {}

        mMIMEType = MIMEType.fromString(parcel.readString());
        mHasBeenUploaded = ((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader())).booleanValue();
        mId = parcel.readLong();
        mPreviewURL = (URL)parcel.readSerializable();
    }

    public Asset(String s)
    {
        String s1 = s.toLowerCase();
        if (!s1.endsWith(".jpg") && !s1.endsWith(".jpeg") && !s1.endsWith(".png"))
        {
            throw new IllegalArgumentException("Currently only JPEG & PNG assets are supported");
        } else
        {
            mType = Type.IMAGE_FILE;
            mImageFilePath = s;
            return;
        }
    }

    public Asset(URL url)
    {
        if (!url.getProtocol().equalsIgnoreCase("http") && !url.getProtocol().equalsIgnoreCase("https"))
        {
            throw new IllegalArgumentException("Currently only support http and https URL schemes");
        }
        String s = url.getFile().toLowerCase();
        if (s.endsWith(".jpg") || s.endsWith(".jpeg"))
        {
            mMIMEType = MIMEType.JPEG;
        } else
        if (s.endsWith(".png"))
        {
            mMIMEType = MIMEType.PNG;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Currently only support URL's the identify the mime mType by ending with a supported file extension i.e. '.jpeg', '.jpg' or '.png' thus '").append(s).append("' is not valid.").toString());
        }
        mType = Type.REMOTE_URL;
        mRemoteURL = url;
    }

    public Asset(byte abyte0[], MIMEType mimetype)
    {
        mType = Type.IMAGE_BYTES;
        mImageBytes = abyte0;
        mMIMEType = mimetype;
    }

    public static boolean isInList(List list, Asset asset)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((Asset)list.next()).equals(asset))
            {
                return true;
            }
        }

        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && (obj instanceof Asset)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        obj = (Asset)obj;
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        if (mType != ((Asset) (obj)).mType || mMIMEType != ((Asset) (obj)).mMIMEType)
        {
            return false;
        }
    /* anonymous class not found */
    class _anm2 {}

        switch (_cls2..SwitchMap.ly.kite.catalogue.Asset.Type[mType.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid asset type: ").append(mType).toString());

        case 1: // '\001'
            return mImageURI.equals(((Asset) (obj)).mImageURI);

        case 2: // '\002'
            flag = flag1;
            if (mBitmapResourceId != ((Asset) (obj)).mBitmapResourceId)
            {
                return false;
            }
            break;

        case 3: // '\003'
            return mBitmap.sameAs(((Asset) (obj)).mBitmap);

        case 4: // '\004'
            return mRemoteURL.equals(((Asset) (obj)).mRemoteURL);

        case 5: // '\005'
            return mImageFilePath.equals(((Asset) (obj)).mImageFilePath);

        case 6: // '\006'
            return Arrays.equals(mImageBytes, ((Asset) (obj)).mImageBytes);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public Bitmap getBitmap()
    {
        if (mType != Type.BITMAP)
        {
            throw new IllegalStateException((new StringBuilder()).append("The bitmap has been requested, but the asset type is: ").append(mType).toString());
        } else
        {
            return mBitmap;
        }
    }

    public int getBitmapResourceId()
    {
        if (mType != Type.BITMAP_RESOURCE_ID)
        {
            throw new IllegalStateException((new StringBuilder()).append("The bitmap resource id has been requested, but the asset type is: ").append(mType).toString());
        } else
        {
            return mBitmapResourceId;
        }
    }

    public long getId()
    {
        if (!mHasBeenUploaded)
        {
            throw new IllegalStateException("The id cannot be returned if the asset has not been uploaded");
        } else
        {
            return mId;
        }
    }

    byte[] getImageBytes()
    {
        if (mImageBytes == null)
        {
            throw new IllegalStateException("No image bytes were supplied when the asset was created. Did you mean to use AssetHelper.requestImageBytes?");
        } else
        {
            return mImageBytes;
        }
    }

    public String getImageFilePath()
    {
        if (mType != Type.IMAGE_FILE)
        {
            throw new IllegalStateException((new StringBuilder()).append("The image file path has been requested, but the asset type is: ").append(mType).toString());
        } else
        {
            return mImageFilePath;
        }
    }

    public Uri getImageURI()
    {
        if (mType != Type.IMAGE_URI)
        {
            throw new IllegalStateException((new StringBuilder()).append("The URI has been requested, but the asset type is: ").append(mType).toString());
        } else
        {
            return mImageURI;
        }
    }

    MIMEType getMIMEType()
    {
        if (mMIMEType == null)
        {
            throw new IllegalStateException("No MIME type was supplied when the asset was created. Did you mean to use AssetHelper.getMIMEType?");
        } else
        {
            return mMIMEType;
        }
    }

    public URL getPreviewURL()
    {
        if (!mHasBeenUploaded)
        {
            throw new IllegalStateException("The preview URL cannot be returned if the asset has not been uploaded");
        } else
        {
            return mPreviewURL;
        }
    }

    public URL getRemoteURL()
    {
        if (mType != Type.REMOTE_URL)
        {
            throw new IllegalStateException((new StringBuilder()).append("The remote URL has been requested, but the asset type is: ").append(mType).toString());
        } else
        {
            return mRemoteURL;
        }
    }

    public Type getType()
    {
        return mType;
    }

    public boolean hasBeenUploaded()
    {
        return mHasBeenUploaded;
    }

    public int hashCode()
    {
        switch (_cls2..SwitchMap.ly.kite.catalogue.Asset.Type[mType.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid asset type: ").append(mType).toString());

        case 1: // '\001'
            return mImageURI.hashCode();

        case 2: // '\002'
            return mBitmapResourceId;

        case 3: // '\003'
            return mBitmap.hashCode();

        case 4: // '\004'
            return mRemoteURL.hashCode();

        case 5: // '\005'
            return mImageFilePath.hashCode();

        case 6: // '\006'
            return Arrays.hashCode(mImageBytes);
        }
    }

    void markAsUploaded(long l, URL url)
    {
        mHasBeenUploaded = true;
        mId = l;
        mPreviewURL = url;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!mType.isParcelable())
        {
            throw new IllegalStateException((new StringBuilder()).append(mType.name()).append(" asset cannot be parcelled").toString());
        }
        parcel.writeString(mType.name());
        parcel.writeValue(mImageURI);
        parcel.writeSerializable(mRemoteURL);
        parcel.writeInt(mBitmapResourceId);
        parcel.writeString(mImageFilePath);
        String s;
        if (mMIMEType != null)
        {
            s = mMIMEType.mimeTypeString();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeValue(Boolean.valueOf(mHasBeenUploaded));
        parcel.writeLong(mId);
        parcel.writeSerializable(mPreviewURL);
    }


    /* member class not found */
    class _cls1 {}

}
