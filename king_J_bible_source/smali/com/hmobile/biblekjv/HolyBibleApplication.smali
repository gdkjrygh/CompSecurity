.class public Lcom/hmobile/biblekjv/HolyBibleApplication;
.super Landroid/app/Application;
.source "HolyBibleApplication.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/HolyBibleApplication$getAllLikeShareData;
    }
.end annotation


# static fields
.field private static _intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

.field static isPurchased:Z

.field private static mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

.field private static mLocalDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

.field static mService:Lcom/android/vending/billing/IInAppBillingService;

.field static mServiceConn:Landroid/content/ServiceConnection;

.field private static myDbHelper:Lcom/hmobile/biblekjv/DataBaseHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    .line 42
    const/4 v0, 0x0

    sput-boolean v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    .line 100
    new-instance v0, Lcom/hmobile/biblekjv/HolyBibleApplication$1;

    invoke-direct {v0}, Lcom/hmobile/biblekjv/HolyBibleApplication$1;-><init>()V

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mServiceConn:Landroid/content/ServiceConnection;

    .line 145
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 195
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 196
    sput-object p0, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    .line 197
    return-void
.end method

.method public static Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 1

    .prologue
    .line 200
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->myDbHelper:Lcom/hmobile/biblekjv/DataBaseHelper;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/DataBaseHelper;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 201
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    return-object v0
.end method

.method public static LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 1

    .prologue
    .line 205
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mLocalDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    return-object v0
.end method

.method static synthetic access$0()Lcom/hmobile/biblekjv/HolyBibleApplication;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    return-object v0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 209
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    return-object v0
.end method

.method public static isItemPurchased()Z
    .locals 15

    .prologue
    .line 149
    :try_start_0
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v11, 0x3

    .line 150
    sget-object v12, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    invoke-virtual {v12}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getPackageName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "inapp"

    const/4 v14, 0x0

    .line 149
    invoke-interface {v10, v11, v12, v13, v14}, Lcom/android/vending/billing/IInAppBillingService;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 151
    .local v3, "ownedItems":Landroid/os/Bundle;
    const-string v10, "RESPONSE_CODE"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 152
    .local v7, "response":I
    if-nez v7, :cond_2

    .line 154
    const-string v10, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 156
    .local v4, "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v10, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    .line 158
    .local v6, "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v10, "INAPP_DATA_SIGNATURE"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 160
    .local v8, "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v10, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 162
    .local v0, "continuationToken":Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v2, v10, :cond_1

    .line 163
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 164
    .local v5, "purchaseData":Ljava/lang/String;
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 165
    .local v9, "sku":Ljava/lang/String;
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    .line 166
    const v11, 0x7f0700b9

    invoke-virtual {v10, v11}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 165
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    .line 166
    if-eqz v10, :cond_0

    .line 167
    const/4 v10, 0x1

    sput-boolean v10, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    .line 168
    const/4 v10, 0x1

    .line 181
    .end local v0    # "continuationToken":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v5    # "purchaseData":Ljava/lang/String;
    .end local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v7    # "response":I
    .end local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v9    # "sku":Ljava/lang/String;
    :goto_0
    return v10

    .line 170
    .restart local v0    # "continuationToken":Ljava/lang/String;
    .restart local v2    # "i":I
    .restart local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v5    # "purchaseData":Ljava/lang/String;
    .restart local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v7    # "response":I
    .restart local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v9    # "sku":Ljava/lang/String;
    :cond_0
    const/4 v10, 0x0

    sput-boolean v10, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    const/4 v10, 0x0

    goto :goto_0

    .line 174
    .end local v5    # "purchaseData":Ljava/lang/String;
    .end local v9    # "sku":Ljava/lang/String;
    :cond_1
    const/4 v10, 0x0

    goto :goto_0

    .line 176
    .end local v0    # "continuationToken":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_2
    const/4 v10, 0x0

    goto :goto_0

    .line 178
    .end local v7    # "response":I
    :catch_0
    move-exception v1

    .line 179
    .local v1, "e":Landroid/os/RemoteException;
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    .line 181
    const/4 v10, 0x0

    goto :goto_0
.end method

.method public static stopBilllingService()V
    .locals 3

    .prologue
    .line 185
    sget-object v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    if-eqz v1, :cond_0

    .line 187
    :try_start_0
    sget-object v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;

    sget-object v2, Lcom/hmobile/biblekjv/HolyBibleApplication;->mServiceConn:Landroid/content/ServiceConnection;

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/HolyBibleApplication;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    .local v0, "ex":Ljava/lang/IllegalArgumentException;
    :cond_0
    :goto_0
    return-void

    .line 188
    .end local v0    # "ex":Ljava/lang/IllegalArgumentException;
    :catch_0
    move-exception v0

    .line 189
    .restart local v0    # "ex":Ljava/lang/IllegalArgumentException;
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 46
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 48
    invoke-static {}, Lcom/hmobile/model/LikeShareList;->Instance()Lcom/hmobile/model/LikeShareList;

    move-result-object v4

    invoke-virtual {v4}, Lcom/hmobile/model/LikeShareList;->clearList()V

    .line 51
    :try_start_0
    new-instance v4, Lcom/hmobile/biblekjv/DataBaseHelper;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/DataBaseHelper;-><init>(Landroid/content/Context;)V

    sput-object v4, Lcom/hmobile/biblekjv/HolyBibleApplication;->myDbHelper:Lcom/hmobile/biblekjv/DataBaseHelper;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    new-instance v0, Lcom/hmobile/activerecorbase/DatabaseBuilder;

    const-string v4, "hmobile.db"

    invoke-direct {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .local v0, "builder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    const-class v4, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 58
    const-class v4, Lcom/hmobile/model/BookInfo;

    invoke-virtual {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 59
    const-class v4, Lcom/hmobile/model/VerseInfo;

    invoke-virtual {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 60
    const-class v4, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 62
    const-class v4, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v0, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 63
    invoke-static {v0}, Lcom/hmobile/activerecorbase/Database;->setBuilder(Lcom/hmobile/activerecorbase/DatabaseBuilder;)V

    .line 65
    new-instance v3, Lcom/hmobile/activerecorbase/DatabaseBuilder;

    const-string v4, "localhmobile.db"

    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .local v3, "locbuilder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    const-class v4, Lcom/hmobile/model/TodayVerseInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 67
    const-class v4, Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 68
    const-class v4, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 69
    const-class v4, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 70
    invoke-static {v3}, Lcom/hmobile/activerecorbase/Database;->setBuilder(Lcom/hmobile/activerecorbase/DatabaseBuilder;)V

    .line 72
    :try_start_1
    const-string v4, "localhmobile.db"

    .line 73
    const/4 v5, 0x1

    .line 72
    invoke-static {p0, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->open(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    sput-object v4, Lcom/hmobile/biblekjv/HolyBibleApplication;->mLocalDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_1
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 94
    :goto_0
    new-instance v4, Landroid/content/Intent;

    .line 95
    const-string v5, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleApplication;->mServiceConn:Landroid/content/ServiceConnection;

    .line 94
    invoke-virtual {p0, v4, v5, v6}, Lcom/hmobile/biblekjv/HolyBibleApplication;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 98
    return-void

    .line 53
    .end local v0    # "builder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    .end local v3    # "locbuilder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    :catch_0
    move-exception v2

    .line 54
    .local v2, "ioe":Ljava/io/IOException;
    new-instance v4, Ljava/lang/Error;

    const-string v5, "Unable to create database"

    invoke-direct {v4, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v4

    .line 74
    .end local v2    # "ioe":Ljava/io/IOException;
    .restart local v0    # "builder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    .restart local v3    # "locbuilder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    :catch_1
    move-exception v1

    .line 75
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0

    .line 76
    .end local v1    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :catch_2
    move-exception v1

    .line 77
    .local v1, "e":Ljava/lang/Exception;
    invoke-static {v1}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method
