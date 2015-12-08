.class public Lcom/hmobile/biblekjv/InAppBillingActivity;
.super Landroid/app/Activity;
.source "InAppBillingActivity.java"


# static fields
.field static final SKU_Pay:Ljava/lang/String; = "remove_ads"

.field static final TAG:Ljava/lang/String; = "HollyBible"

.field static mIsPayed:Z


# instance fields
.field btnpay:Landroid/widget/Button;

.field mHelper:Lcom/hmobile/util/IabHelper;

.field mPurchaseFinishedListener:Lcom/hmobile/util/IabHelper$OnIabPurchaseFinishedListener;

.field mService:Lcom/android/vending/billing/IInAppBillingService;

.field mServiceConn:Landroid/content/ServiceConnection;

.field skuArray:Lorg/json/JSONArray;

.field updateProductData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    sput-boolean v0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mIsPayed:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 119
    new-instance v0, Lcom/hmobile/biblekjv/InAppBillingActivity$1;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/InAppBillingActivity$1;-><init>(Lcom/hmobile/biblekjv/InAppBillingActivity;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mServiceConn:Landroid/content/ServiceConnection;

    .line 27
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 172
    const/16 v6, 0x3e9

    if-ne p1, v6, :cond_0

    .line 173
    const-string v6, "RESPONSE_CODE"

    const/4 v7, 0x0

    invoke-virtual {p3, v6, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 174
    .local v4, "responseCode":I
    const-string v6, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 175
    .local v3, "purchaseData":Ljava/lang/String;
    const-string v6, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    .local v0, "dataSignature":Ljava/lang/String;
    const/4 v6, -0x1

    if-ne p2, v6, :cond_0

    .line 179
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 180
    .local v2, "jo":Lorg/json/JSONObject;
    const-string v6, "productId"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 181
    .local v5, "sku":Ljava/lang/String;
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "You have bought the "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .end local v0    # "dataSignature":Ljava/lang/String;
    .end local v2    # "jo":Lorg/json/JSONObject;
    .end local v3    # "purchaseData":Ljava/lang/String;
    .end local v4    # "responseCode":I
    .end local v5    # "sku":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 182
    .restart local v0    # "dataSignature":Ljava/lang/String;
    .restart local v3    # "purchaseData":Ljava/lang/String;
    .restart local v4    # "responseCode":I
    :catch_0
    move-exception v1

    .line 183
    .local v1, "e":Lorg/json/JSONException;
    const-string v6, "Failed to parse purchase data."

    invoke-static {v6}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 42
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    const v1, 0x7f030023

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/InAppBillingActivity;->setContentView(I)V

    .line 44
    const v1, 0x7f0e00aa

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/InAppBillingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->btnpay:Landroid/widget/Button;

    .line 46
    const v1, 0x7f0700ca

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/InAppBillingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 47
    .local v0, "base64EncodedPublicKey":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    .line 48
    const-string v2, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 49
    iget-object v2, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mServiceConn:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    .line 47
    invoke-virtual {p0, v1, v2, v3}, Lcom/hmobile/biblekjv/InAppBillingActivity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 79
    iget-object v1, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->btnpay:Landroid/widget/Button;

    new-instance v2, Lcom/hmobile/biblekjv/InAppBillingActivity$2;

    invoke-direct {v2, p0}, Lcom/hmobile/biblekjv/InAppBillingActivity$2;-><init>(Lcom/hmobile/biblekjv/InAppBillingActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 192
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 193
    iget-object v0, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/hmobile/biblekjv/InAppBillingActivity;->mServiceConn:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/InAppBillingActivity;->unbindService(Landroid/content/ServiceConnection;)V

    .line 196
    :cond_0
    return-void
.end method
