// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import com.google.android.gms.drive.metadata.CollectionMetadataField;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.BooleanMetadataField;
import com.google.android.gms.drive.metadata.internal.LongMetadataField;
import com.google.android.gms.drive.metadata.internal.ParcelableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.ParcelableMetadataField;
import com.google.android.gms.drive.metadata.internal.ParentsMetadataField;
import com.google.android.gms.drive.metadata.internal.StringCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.StringMetadataField;
import com.google.android.gms.drive.metadata.internal.UserMetadataField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.metadata.internal.fields:
//            DriveIdField, CustomPropertiesField

public final class BasicFields
{
    public static final class CustomPropertiesMetadataField extends CustomPropertiesField
        implements SearchableMetadataField
    {

        public CustomPropertiesMetadataField()
        {
            super(0x4c4b40);
        }
    }

    public static final class IsPinnedMetadataField extends BooleanMetadataField
        implements SearchableMetadataField
    {

        public IsPinnedMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class MimeTypeMetadataField extends StringMetadataField
        implements SearchableMetadataField
    {

        public MimeTypeMetadataField()
        {
            super("mimeType", 0x3e8fa0);
        }
    }

    public static final class QuotaBytesUsedMetadataField extends LongMetadataField
        implements SortableMetadataField
    {

        public QuotaBytesUsedMetadataField(String s)
        {
            super(s, 0x419ce0);
        }
    }

    public static final class SpacesMetadataField extends ParcelableCollectionMetadataField
    {

        protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            return doDataHolderRead(dataholder, i, j);
        }

        protected final Collection doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            ArrayList arraylist = new ArrayList();
            if (dataholder.getBoolean("inDriveSpace", i, j))
            {
                arraylist.add(DriveSpace.DRIVE);
            }
            if (dataholder.getBoolean("isAppData", i, j))
            {
                arraylist.add(DriveSpace.APP_DATA_FOLDER);
            }
            if (dataholder.getBoolean("inGooglePhotosSpace", i, j))
            {
                arraylist.add(DriveSpace.PHOTOS);
            }
            return arraylist;
        }

        public SpacesMetadataField()
        {
            super("spaces", Arrays.asList(new String[] {
                "inDriveSpace", "isAppData", "inGooglePhotosSpace"
            }), Collections.emptySet(), 0x6acfc0);
        }
    }

    public static final class StarredMetadataField extends BooleanMetadataField
        implements SearchableMetadataField
    {

        public StarredMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class TitleMetadataField extends StringMetadataField
        implements SearchableMetadataField, SortableMetadataField
    {

        public TitleMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }

    public static final class TrashedMetadataField extends BooleanMetadataField
        implements SearchableMetadataField
    {

        protected final Boolean doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            boolean flag;
            if (dataholder.getInteger(super.mFieldName, i, j) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            return doDataHolderRead(dataholder, i, j);
        }

        public TrashedMetadataField(String s)
        {
            super(s, 0x3e8fa0);
        }
    }


    public static final MetadataField ALTERNATE_LINK = new StringMetadataField("alternateLink", 0x419ce0);
    public static final CustomPropertiesMetadataField CUSTOM_FILE_PROPERTIES = new CustomPropertiesMetadataField();
    public static final MetadataField DESCRIPTION = new StringMetadataField("description", 0x419ce0);
    public static final MetadataField DRIVE_ID;
    public static final MetadataField EMBED_LINK = new StringMetadataField("embedLink", 0x419ce0);
    public static final MetadataField FILE_EXTENSION = new StringMetadataField("fileExtension", 0x419ce0);
    public static final MetadataField FILE_SIZE = new LongMetadataField("fileSize", 0x419ce0);
    public static final MetadataField FOLDER_COLOR_RGB = new StringMetadataField("folderColorRgb", 0x7270e0);
    public static final MetadataField HAS_THUMBNAIL = new BooleanMetadataField("hasThumbnail", 0x419ce0);
    public static final MetadataField INDEXABLE_TEXT = new StringMetadataField("indexableText", 0x419ce0);
    public static final MetadataField IS_APPDATA = new BooleanMetadataField("isAppData", 0x419ce0);
    public static final MetadataField IS_COPYABLE = new BooleanMetadataField("isCopyable", 0x419ce0);
    public static final MetadataField IS_EDITABLE = new BooleanMetadataField("isEditable", 0x3e8fa0);
    public static final MetadataField IS_EXPLICITLY_TRASHED = new BooleanMetadataField("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet()) {

        protected final Boolean doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            boolean flag;
            if (dataholder.getInteger("trashed", i, j) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            return doDataHolderRead(dataholder, i, j);
        }

    };
    public static final MetadataField IS_GOOGLE_PHOTOS = new BooleanMetadataField("isGooglePhotosFolder", 0x6acfc0);
    public static final MetadataField IS_GOOGLE_PHOTOS_ROOT_FOLDER = new BooleanMetadataField("isGooglePhotosRootFolder", 0x6acfc0);
    public static final MetadataField IS_LOCAL_CONTENT_UP_TO_DATE = new BooleanMetadataField("isLocalContentUpToDate", 0x7704c0);
    public static final MetadataField IS_OPENABLE = new BooleanMetadataField("isOpenable", 0x6ddd00);
    public static final IsPinnedMetadataField IS_PINNED = new IsPinnedMetadataField("isPinned");
    public static final MetadataField IS_RESTRICTED = new BooleanMetadataField("isRestricted", 0x419ce0);
    public static final MetadataField IS_SHARED = new BooleanMetadataField("isShared", 0x419ce0);
    public static final MetadataField IS_TRASHABLE = new BooleanMetadataField("isTrashable", 0x432380);
    public static final MetadataField IS_VIEWED = new BooleanMetadataField("isViewed", 0x419ce0);
    public static final UserMetadataField LAST_MODIFYING_USER = new UserMetadataField("lastModifyingUser");
    public static final MetadataField MD5_CHECKSUM = new StringMetadataField("md5Checksum", 0x6acfc0);
    public static final MimeTypeMetadataField MIME_TYPE = new MimeTypeMetadataField();
    public static final MetadataField ORIGINAL_FILENAME = new StringMetadataField("originalFilename", 0x419ce0);
    public static final CollectionMetadataField OWNER_NAMES = new StringCollectionMetadataField("ownerNames");
    public static final ParentsMetadataField PARENTS = new ParentsMetadataField();
    public static final QuotaBytesUsedMetadataField QUOTA_BYTES_USED = new QuotaBytesUsedMetadataField("quotaBytesUsed");
    public static final MetadataField RECENCY_REASON = new StringMetadataField("recencyReason", 0x7a1200);
    public static final MetadataField ROLE = new StringMetadataField("role", 0x5b8d80);
    public static final UserMetadataField SHARING_USER = new UserMetadataField("sharingUser");
    public static final SpacesMetadataField SPACES = new SpacesMetadataField();
    public static final StarredMetadataField STARRED = new StarredMetadataField("starred");
    public static final MetadataField SUBSCRIBED = new BooleanMetadataField("subscribed", 0x7a1200);
    public static final MetadataField THUMBNAIL = new ParcelableMetadataField("thumbnail", Collections.emptySet(), Collections.emptySet()) {

        protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
        {
            throw new IllegalStateException("Thumbnail field is write only");
        }

    };
    public static final TitleMetadataField TITLE = new TitleMetadataField("title");
    public static final TrashedMetadataField TRASHED = new TrashedMetadataField("trashed");
    public static final MetadataField UNIQUE_IDENTIFIER = new StringMetadataField("uniqueIdentifier", 0x4c4b40);
    public static final MetadataField WEB_CONTENT_LINK = new StringMetadataField("webContentLink", 0x419ce0);
    public static final MetadataField WEB_VIEW_LINK = new StringMetadataField("webViewLink", 0x419ce0);
    public static final BooleanMetadataField WRITERS_CAN_SHARE = new BooleanMetadataField("writersCanShare", 0x5b8d80);

    static 
    {
        DRIVE_ID = DriveIdField.INSTANCE;
    }
}
