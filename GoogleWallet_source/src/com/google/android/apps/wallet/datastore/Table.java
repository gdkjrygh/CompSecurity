// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import com.google.common.collect.ImmutableList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            Column

public final class Table extends Enum
{

    private static final Table $VALUES[];
    public static final Table BANK_ACCOUNT;
    public static final Table CREDENTIAL;
    public static final Table EVENT_LOG;
    public static final Table FOZZIE_BEAR;
    public static final Table IMAGE_UPLOAD;
    public static final Table METADATA;
    public static final Table NOTIFICATION;
    public static final Table PROXY_CARD;
    public static final Table SYNC_GENERATION_MANAGER;
    public static final Table WALLET_SETTING;
    public static final Table WOB;
    public static final Table WOB_CATEGORY;
    public static final Table WOB_INSTANCE;
    public static final Table WOB_UI_LABEL;
    private final List columns;
    private final Column primaryKeyColumn;
    private final String tableName;

    private Table(String s, int i, String s1, Column column, ImmutableList immutablelist)
    {
        super(s, i);
        tableName = s1;
        primaryKeyColumn = column;
        columns = immutablelist;
    }

    public static Table valueOf(String s)
    {
        return (Table)Enum.valueOf(com/google/android/apps/wallet/datastore/Table, s);
    }

    public static Table[] values()
    {
        return (Table[])$VALUES.clone();
    }

    public final void appendPrimaryKeyDeclaration(StringBuilder stringbuilder)
    {
        if (primaryKeyColumn == Column.INTEGER_ID)
        {
            stringbuilder.append("INTEGER PRIMARY KEY");
            return;
        } else
        {
            stringbuilder.append(getPrimaryKeyColumn().getColumnType());
            stringbuilder.append(" NOT NULL PRIMARY KEY");
            return;
        }
    }

    public final List getColumns()
    {
        return columns;
    }

    public final Column getPrimaryKeyColumn()
    {
        return primaryKeyColumn;
    }

    public final String getTableName()
    {
        return tableName;
    }

    static 
    {
        BANK_ACCOUNT = new Table("BANK_ACCOUNT", 0, "bankAccount", Column.ID, ImmutableList.of(Column.PROTO));
        CREDENTIAL = new Table("CREDENTIAL", 1, "credential", Column.ID, ImmutableList.of(Column.PROTO));
        METADATA = new Table("METADATA", 2, "metadata", Column.ID, ImmutableList.of(Column.PROTO));
        SYNC_GENERATION_MANAGER = new Table("SYNC_GENERATION_MANAGER", 3, "syncTimestampManager", Column.ID, ImmutableList.of(Column.PROTO));
        WALLET_SETTING = new Table("WALLET_SETTING", 4, "walletSetting", Column.ID, ImmutableList.of(Column.PROTO));
        EVENT_LOG = new Table("EVENT_LOG", 5, "eventLog", Column.INTEGER_ID, ImmutableList.of(Column.PROTO));
        FOZZIE_BEAR = new Table("FOZZIE_BEAR", 6, "fozzieBear", Column.ID, ImmutableList.of(Column.FB_ADDRESS));
        IMAGE_UPLOAD = new Table("IMAGE_UPLOAD", 7, "imageUpload", Column.ID, ImmutableList.of(Column.PROTO));
        PROXY_CARD = new Table("PROXY_CARD", 8, "proxyCard", Column.ID, ImmutableList.of(Column.PROTO));
        NOTIFICATION = new Table("NOTIFICATION", 9, "notification", Column.ID, ImmutableList.of(Column.PROTO, Column.NOTIFICATION_TYPE, Column.NOTIFICATION_TIME));
        WOB_INSTANCE = new Table("WOB_INSTANCE", 10, "wobInstance", Column.ID, ImmutableList.of(Column.PROTO));
        WOB_UI_LABEL = new Table("WOB_UI_LABEL", 11, "wobUiLabel", Column.ID, ImmutableList.of(Column.PROTO, Column.DISPLAY_ORDER));
        WOB = new Table("WOB", 12, "wob", Column.ID, ImmutableList.of(Column.PROTO, Column.SORT_KEY, Column.WOB_CATEGORY, Column.IS_INSIDE_CACHE_HEAD));
        WOB_CATEGORY = new Table("WOB_CATEGORY", 13, "wob_category", Column.WOB_CATEGORY, ImmutableList.of(Column.NEXT_PAGE_TOKEN, Column.HEAD_STATE));
        $VALUES = (new Table[] {
            BANK_ACCOUNT, CREDENTIAL, METADATA, SYNC_GENERATION_MANAGER, WALLET_SETTING, EVENT_LOG, FOZZIE_BEAR, IMAGE_UPLOAD, PROXY_CARD, NOTIFICATION, 
            WOB_INSTANCE, WOB_UI_LABEL, WOB, WOB_CATEGORY
        });
    }
}
