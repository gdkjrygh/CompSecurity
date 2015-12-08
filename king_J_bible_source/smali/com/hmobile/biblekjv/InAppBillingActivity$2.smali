.class Lcom/hmobile/biblekjv/InAppBillingActivity$2;
.super Ljava/lang/Object;
.source "InAppBillingActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/InAppBillingActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/InAppBillingActivity$2;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 87
    :try_start_0
    iget-object v9, p0, Lcom/hmobile/biblekjv/InAppBillingActivity$2;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    iget-object v9, v9, Lcom/hmobile/biblekjv/InAppBillingActivity;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v10, 0x3

    iget-object v11, p0, Lcom/hmobile/biblekjv/InAppBillingActivity$2;->this$0:Lcom/hmobile/biblekjv/InAppBillingActivity;

    invoke-virtual {v11}, Lcom/hmobile/biblekjv/InAppBillingActivity;->getPackageName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "inapp"

    const/4 v13, 0x0

    invoke-interface {v9, v10, v11, v12, v13}, Lcom/android/vending/billing/IInAppBillingService;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 88
    .local v3, "ownedItems":Landroid/os/Bundle;
    const-string v9, "RESPONSE_CODE"

    invoke-virtual {v3, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 89
    .local v7, "response":I
    if-nez v7, :cond_0

    .line 91
    const-string v9, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v3, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 93
    .local v4, "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v9, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v3, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    .line 95
    .local v6, "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v9, "INAPP_DATA_SIGNATURE"

    invoke-virtual {v3, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 97
    .local v8, "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v9, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v3, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "continuationToken":Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lt v2, v9, :cond_1

    .line 114
    .end local v0    # "continuationToken":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v3    # "ownedItems":Landroid/os/Bundle;
    .end local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v7    # "response":I
    .end local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_0
    :goto_1
    return-void

    .line 100
    .restart local v0    # "continuationToken":Ljava/lang/String;
    .restart local v2    # "i":I
    .restart local v3    # "ownedItems":Landroid/os/Bundle;
    .restart local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v7    # "response":I
    .restart local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 101
    .local v5, "purchaseData":Ljava/lang/String;
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 110
    .end local v0    # "continuationToken":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v3    # "ownedItems":Landroid/os/Bundle;
    .end local v4    # "ownedSkus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v5    # "purchaseData":Ljava/lang/String;
    .end local v6    # "purchaseDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v7    # "response":I
    .end local v8    # "signatureList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :catch_0
    move-exception v1

    .line 112
    .local v1, "e":Landroid/os/RemoteException;
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_1
.end method
