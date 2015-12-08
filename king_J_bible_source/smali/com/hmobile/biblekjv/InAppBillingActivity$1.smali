.class Lcom/hmobile/biblekjv/InAppBillingActivity$1;
.super Ljava/lang/Object;
.source "InAppBillingActivity.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/InAppBillingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/InAppBillingActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 24
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    .line 129
    :try_start_0
    const-string v2, "in onServiceConnected **********************"

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 130
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    invoke-static/range {p2 .. p2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v3

    iput-object v3, v2, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 131
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .local v21, "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v2, "android.test.purchased"

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    new-instance v3, Lorg/json/JSONArray;

    move-object/from16 v0, v21

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    iput-object v3, v2, Lcom/hmobile/biblekjv/InAppBillingActivity;->skuArray:Lorg/json/JSONArray;

    .line 134
    new-instance v17, Landroid/os/Bundle;

    invoke-direct/range {v17 .. v17}, Landroid/os/Bundle;-><init>()V

    .line 135
    .local v17, "querySkus":Landroid/os/Bundle;
    const-string v2, "ITEM_ID_LIST"

    move-object/from16 v0, v17

    move-object/from16 v1, v21

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 136
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/InAppBillingActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 137
    const-string v6, "inapp"

    .line 136
    move-object/from16 v0, v17

    invoke-interface {v2, v3, v4, v6, v0}, Lcom/android/vending/billing/IInAppBillingService;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v20

    .line 138
    .local v20, "skuDetails":Landroid/os/Bundle;
    const-string v2, "RESPONSE_CODE"

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 139
    .local v18, "response":I
    if-nez v18, :cond_1

    .line 141
    const-string v2, "DETAILS_LIST"

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v19

    .line 142
    .local v19, "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RESPONSE LIST SIZE********************** "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 143
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :cond_0
    :goto_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 167
    .end local v17    # "querySkus":Landroid/os/Bundle;
    .end local v18    # "response":I
    .end local v19    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v20    # "skuDetails":Landroid/os/Bundle;
    .end local v21    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1
    :goto_1
    return-void

    .line 143
    .restart local v17    # "querySkus":Landroid/os/Bundle;
    .restart local v18    # "response":I
    .restart local v19    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v20    # "skuDetails":Landroid/os/Bundle;
    .restart local v21    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_2
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/String;

    .line 144
    .local v22, "thisResponse":Ljava/lang/String;
    const-string v2, "in FOR LOOP**********************"

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 145
    new-instance v14, Lorg/json/JSONObject;

    move-object/from16 v0, v22

    invoke-direct {v14, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 146
    .local v14, "object":Lorg/json/JSONObject;
    const-string v2, "productId"

    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 147
    .local v5, "sku":Ljava/lang/String;
    const-string v2, "price"

    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 148
    .local v16, "price":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BEFORE IF PRICE********************** "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 149
    const-string v2, "android.test.purchased"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "in SKU PRICE ********************** "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 152
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v3, 0x3

    .line 153
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/InAppBillingActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "inapp"

    const-string v7, ""

    .line 152
    invoke-interface/range {v2 .. v7}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v13

    .line 155
    .local v13, "buyIntentBundle":Landroid/os/Bundle;
    const-string v2, "BUY_INTENT"

    invoke-virtual {v13, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v15

    check-cast v15, Landroid/app/PendingIntent;

    .line 156
    .local v15, "pendingIntent":Landroid/app/PendingIntent;
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    .line 157
    invoke-virtual {v15}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v7

    const/16 v8, 0x3e9

    .line 158
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 159
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 156
    invoke-virtual/range {v6 .. v12}, Lcom/hmobile/biblekjv/InAppBillingActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 164
    .end local v5    # "sku":Ljava/lang/String;
    .end local v13    # "buyIntentBundle":Landroid/os/Bundle;
    .end local v14    # "object":Lorg/json/JSONObject;
    .end local v15    # "pendingIntent":Landroid/app/PendingIntent;
    .end local v16    # "price":Ljava/lang/String;
    .end local v17    # "querySkus":Landroid/os/Bundle;
    .end local v18    # "response":I
    .end local v19    # "responseList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v20    # "skuDetails":Landroid/os/Bundle;
    .end local v21    # "skuList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v22    # "thisResponse":Ljava/lang/String;
    :catch_0
    move-exception v2

    goto/16 :goto_1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    .line 122
    iget-object v0, p0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 123
    return-void
.end method
