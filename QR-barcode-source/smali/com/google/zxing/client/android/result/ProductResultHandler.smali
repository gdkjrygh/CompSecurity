.class public final Lcom/google/zxing/client/android/result/ProductResultHandler;
.super Lcom/google/zxing/client/android/result/ResultHandler;
.source "ProductResultHandler.java"


# static fields
.field private static final buttons:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 34
    const/4 v0, 0x3

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 35
    sget v2, Lcom/google/zxing/client/android/R$string;->button_product_search:I

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 36
    sget v2, Lcom/google/zxing/client/android/R$string;->button_web_search:I

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 37
    sget v2, Lcom/google/zxing/client/android/R$string;->button_custom_product_search:I

    aput v2, v0, v1

    .line 34
    sput-object v0, Lcom/google/zxing/client/android/result/ProductResultHandler;->buttons:[I

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "result"    # Lcom/google/zxing/client/result/ParsedResult;
    .param p3, "rawResult"    # Lcom/google/zxing/Result;

    .prologue
    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/google/zxing/client/android/result/ResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V

    .line 42
    new-instance v0, Lcom/google/zxing/client/android/result/ProductResultHandler$1;

    invoke-direct {v0, p0}, Lcom/google/zxing/client/android/result/ProductResultHandler$1;-><init>(Lcom/google/zxing/client/android/result/ProductResultHandler;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->showGoogleShopperButton(Landroid/view/View$OnClickListener;)V

    .line 49
    return-void
.end method


# virtual methods
.method public getButtonCount()I
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->hasCustomProductSearch()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/zxing/client/android/result/ProductResultHandler;->buttons:[I

    array-length v0, v0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/google/zxing/client/android/result/ProductResultHandler;->buttons:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public getButtonText(I)I
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 58
    sget-object v0, Lcom/google/zxing/client/android/result/ProductResultHandler;->buttons:[I

    aget v0, v0, p1

    return v0
.end method

.method public getDisplayTitle()I
    .locals 1

    .prologue
    .line 87
    sget v0, Lcom/google/zxing/client/android/R$string;->result_product:I

    return v0
.end method

.method public handleButtonPress(I)V
    .locals 4
    .param p1, "index"    # I

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v1

    .line 65
    .local v1, "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    instance-of v2, v1, Lcom/google/zxing/client/result/ProductParsedResult;

    if-eqz v2, :cond_0

    .line 66
    check-cast v1, Lcom/google/zxing/client/result/ProductParsedResult;

    .end local v1    # "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    invoke-virtual {v1}, Lcom/google/zxing/client/result/ProductParsedResult;->getNormalizedProductID()Ljava/lang/String;

    move-result-object v0

    .line 72
    .local v0, "productID":Ljava/lang/String;
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 83
    :goto_1
    return-void

    .line 67
    .end local v0    # "productID":Ljava/lang/String;
    .restart local v1    # "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    :cond_0
    instance-of v2, v1, Lcom/google/zxing/client/result/ExpandedProductParsedResult;

    if-eqz v2, :cond_1

    .line 68
    check-cast v1, Lcom/google/zxing/client/result/ExpandedProductParsedResult;

    .end local v1    # "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    invoke-virtual {v1}, Lcom/google/zxing/client/result/ExpandedProductParsedResult;->getRawText()Ljava/lang/String;

    move-result-object v0

    .line 69
    .restart local v0    # "productID":Ljava/lang/String;
    goto :goto_0

    .line 70
    .end local v0    # "productID":Ljava/lang/String;
    .restart local v1    # "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    :cond_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 74
    .end local v1    # "rawResult":Lcom/google/zxing/client/result/ParsedResult;
    .restart local v0    # "productID":Ljava/lang/String;
    :pswitch_0
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->openProductSearch(Ljava/lang/String;)V

    goto :goto_1

    .line 77
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->webSearch(Ljava/lang/String;)V

    goto :goto_1

    .line 80
    :pswitch_2
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ProductResultHandler;->fillInCustomSearchURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/zxing/client/android/result/ProductResultHandler;->openURL(Ljava/lang/String;)V

    goto :goto_1

    .line 72
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
