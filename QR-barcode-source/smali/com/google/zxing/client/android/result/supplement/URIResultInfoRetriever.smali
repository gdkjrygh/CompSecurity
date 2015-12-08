.class final Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;
.super Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;
.source "URIResultInfoRetriever.java"


# static fields
.field private static final MAX_REDIRECTS:I = 0x5


# instance fields
.field private final redirectString:Ljava/lang/String;

.field private final result:Lcom/google/zxing/client/result/URIParsedResult;


# direct methods
.method constructor <init>(Landroid/widget/TextView;Lcom/google/zxing/client/result/URIParsedResult;Lcom/google/zxing/client/android/history/HistoryManager;Landroid/content/Context;)V
    .locals 1
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "result"    # Lcom/google/zxing/client/result/URIParsedResult;
    .param p3, "historyManager"    # Lcom/google/zxing/client/android/history/HistoryManager;
    .param p4, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0, p1, p3}, Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;-><init>(Landroid/widget/TextView;Lcom/google/zxing/client/android/history/HistoryManager;)V

    .line 39
    sget v0, Lcom/google/zxing/client/android/R$string;->msg_redirect:I

    invoke-virtual {p4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->redirectString:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->result:Lcom/google/zxing/client/result/URIParsedResult;

    .line 41
    return-void
.end method


# virtual methods
.method retrieveSupplementalInfo()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 47
    :try_start_0
    new-instance v4, Ljava/net/URI;

    iget-object v5, p0, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->result:Lcom/google/zxing/client/result/URIParsedResult;

    invoke-virtual {v5}, Lcom/google/zxing/client/result/URIParsedResult;->getURI()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .local v4, "oldURI":Ljava/net/URI;
    invoke-static {v4}, Lcom/google/zxing/client/android/HttpHelper;->unredirect(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v3

    .line 52
    .local v3, "newURI":Ljava/net/URI;
    const/4 v0, 0x0

    .local v0, "count":I
    move v1, v0

    .line 53
    .end local v0    # "count":I
    .local v1, "count":I
    :goto_0
    add-int/lit8 v0, v1, 0x1

    .end local v1    # "count":I
    .restart local v0    # "count":I
    const/4 v5, 0x5

    if-ge v1, v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 61
    .end local v0    # "count":I
    .end local v3    # "newURI":Ljava/net/URI;
    .end local v4    # "oldURI":Ljava/net/URI;
    :cond_0
    :goto_1
    return-void

    .line 48
    :catch_0
    move-exception v2

    .line 49
    .local v2, "ignored":Ljava/net/URISyntaxException;
    goto :goto_1

    .line 54
    .end local v2    # "ignored":Ljava/net/URISyntaxException;
    .restart local v0    # "count":I
    .restart local v3    # "newURI":Ljava/net/URI;
    .restart local v4    # "oldURI":Ljava/net/URI;
    :cond_1
    iget-object v5, p0, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->result:Lcom/google/zxing/client/result/URIParsedResult;

    invoke-virtual {v5}, Lcom/google/zxing/client/result/URIParsedResult;->getDisplayResult()Ljava/lang/String;

    move-result-object v5

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    new-instance v9, Ljava/lang/StringBuilder;

    iget-object v10, p0, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->redirectString:Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, " : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    .line 57
    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v8

    .line 54
    invoke-virtual {p0, v5, v6, v7, v8}, Lcom/google/zxing/client/android/result/supplement/URIResultInfoRetriever;->append(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    move-object v4, v3

    .line 59
    invoke-static {v3}, Lcom/google/zxing/client/android/HttpHelper;->unredirect(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v3

    move v1, v0

    .end local v0    # "count":I
    .restart local v1    # "count":I
    goto :goto_0
.end method
