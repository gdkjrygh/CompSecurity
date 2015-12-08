.class Lcom/hmobile/biblekjv/HolyBibleApplication$1;
.super Ljava/lang/Object;
.source "HolyBibleApplication.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/HolyBibleApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 13
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    .line 110
    :try_start_0
    invoke-static {p2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v9

    sput-object v9, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 111
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .local v7, "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    # getter for: Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->access$0()Lcom/hmobile/biblekjv/HolyBibleApplication;

    move-result-object v9

    const v10, 0x7f0700b9

    invoke-virtual {v9, v10}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 114
    .local v2, "querySkus":Landroid/os/Bundle;
    const-string v9, "ITEM_ID_LIST"

    invoke-virtual {v2, v9, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 115
    sget-object v9, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v10, 0x3

    .line 116
    # getter for: Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->access$0()Lcom/hmobile/biblekjv/HolyBibleApplication;

    move-result-object v11

    invoke-virtual {v11}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getPackageName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "inapp"

    .line 115
    invoke-interface {v9, v10, v11, v12, v2}, Lcom/android/vending/billing/IInAppBillingService;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    .line 117
    .local v6, "skuDetails":Landroid/os/Bundle;
    const-string v9, "RESPONSE_CODE"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 118
    .local v3, "response":I
    if-nez v3, :cond_0

    .line 120
    const-string v9, "DETAILS_LIST"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 121
    .local v4, "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_1

    .line 140
    .end local v4    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_0
    invoke-static {}, Lcom/hmobile/common/NotificationCenter;->Instance()Lcom/hmobile/common/NotificationCenter;

    move-result-object v9

    const-string v10, "purchase"

    invoke-virtual {v9, v10}, Lcom/hmobile/common/NotificationCenter;->postNotification(Ljava/lang/String;)V

    .line 144
    .end local v2    # "querySkus":Landroid/os/Bundle;
    .end local v3    # "response":I
    .end local v6    # "skuDetails":Landroid/os/Bundle;
    .end local v7    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_1
    return-void

    .line 121
    .restart local v2    # "querySkus":Landroid/os/Bundle;
    .restart local v3    # "response":I
    .restart local v4    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v6    # "skuDetails":Landroid/os/Bundle;
    .restart local v7    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 122
    .local v8, "thisResponse":Ljava/lang/String;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 123
    .local v0, "object":Lorg/json/JSONObject;
    const-string v10, "productId"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 124
    .local v5, "sku":Ljava/lang/String;
    const-string v10, "price"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 125
    .local v1, "price":Ljava/lang/String;
    # getter for: Lcom/hmobile/biblekjv/HolyBibleApplication;->_intance:Lcom/hmobile/biblekjv/HolyBibleApplication;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->access$0()Lcom/hmobile/biblekjv/HolyBibleApplication;

    move-result-object v10

    .line 126
    const v11, 0x7f0700b9

    invoke-virtual {v10, v11}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 125
    invoke-virtual {v5, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 136
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->isItemPurchased()Z

    move-result v10

    sput-boolean v10, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 141
    .end local v0    # "object":Lorg/json/JSONObject;
    .end local v1    # "price":Ljava/lang/String;
    .end local v2    # "querySkus":Landroid/os/Bundle;
    .end local v3    # "response":I
    .end local v4    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v5    # "sku":Ljava/lang/String;
    .end local v6    # "skuDetails":Landroid/os/Bundle;
    .end local v7    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v8    # "thisResponse":Ljava/lang/String;
    :catch_0
    move-exception v9

    goto :goto_1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    .line 103
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 104
    const-string v0, "in onServiceDisconnected **********************"

    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 105
    return-void
.end method
