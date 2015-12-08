.class public final Lcom/google/zxing/client/android/result/ISBNResultHandler;
.super Lcom/google/zxing/client/android/result/ResultHandler;
.source "ISBNResultHandler.java"


# static fields
.field private static final buttons:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 33
    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 34
    sget v2, Lcom/google/zxing/client/android/R$string;->button_product_search:I

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 35
    sget v2, Lcom/google/zxing/client/android/R$string;->button_book_search:I

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 36
    sget v2, Lcom/google/zxing/client/android/R$string;->button_search_book_contents:I

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 37
    sget v2, Lcom/google/zxing/client/android/R$string;->button_custom_product_search:I

    aput v2, v0, v1

    .line 33
    sput-object v0, Lcom/google/zxing/client/android/result/ISBNResultHandler;->buttons:[I

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
    new-instance v0, Lcom/google/zxing/client/android/result/ISBNResultHandler$1;

    invoke-direct {v0, p0}, Lcom/google/zxing/client/android/result/ISBNResultHandler$1;-><init>(Lcom/google/zxing/client/android/result/ISBNResultHandler;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->showGoogleShopperButton(Landroid/view/View$OnClickListener;)V

    .line 49
    return-void
.end method


# virtual methods
.method public getButtonCount()I
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->hasCustomProductSearch()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/zxing/client/android/result/ISBNResultHandler;->buttons:[I

    array-length v0, v0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/google/zxing/client/android/result/ISBNResultHandler;->buttons:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public getButtonText(I)I
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 58
    sget-object v0, Lcom/google/zxing/client/android/result/ISBNResultHandler;->buttons:[I

    aget v0, v0, p1

    return v0
.end method

.method public getDisplayTitle()I
    .locals 1

    .prologue
    .line 82
    sget v0, Lcom/google/zxing/client/android/R$string;->result_isbn:I

    return v0
.end method

.method public handleButtonPress(I)V
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/result/ISBNParsedResult;

    .line 64
    .local v0, "isbnResult":Lcom/google/zxing/client/result/ISBNParsedResult;
    packed-switch p1, :pswitch_data_0

    .line 78
    :goto_0
    return-void

    .line 66
    :pswitch_0
    invoke-virtual {v0}, Lcom/google/zxing/client/result/ISBNParsedResult;->getISBN()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->openProductSearch(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :pswitch_1
    invoke-virtual {v0}, Lcom/google/zxing/client/result/ISBNParsedResult;->getISBN()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->openBookSearch(Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :pswitch_2
    invoke-virtual {v0}, Lcom/google/zxing/client/result/ISBNParsedResult;->getISBN()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->searchBookContents(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :pswitch_3
    invoke-virtual {v0}, Lcom/google/zxing/client/result/ISBNParsedResult;->getISBN()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->fillInCustomSearchURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;->openURL(Ljava/lang/String;)V

    goto :goto_0

    .line 64
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
