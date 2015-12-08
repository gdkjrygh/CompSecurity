.class final Lcom/google/zxing/client/android/ScanFromWebPageManager;
.super Ljava/lang/Object;
.source "ScanFromWebPageManager.java"


# static fields
.field private static final CODE_PLACEHOLDER:Ljava/lang/String; = "{CODE}"

.field private static final FORMAT_PLACEHOLDER:Ljava/lang/String; = "{FORMAT}"

.field private static final META_PLACEHOLDER:Ljava/lang/String; = "{META}"

.field private static final RAW_CODE_PLACEHOLDER:Ljava/lang/String; = "{RAWCODE}"

.field private static final RAW_PARAM:Ljava/lang/String; = "raw"

.field private static final RETURN_URL_PARAM:Ljava/lang/String; = "ret"

.field private static final TYPE_PLACEHOLDER:Ljava/lang/String; = "{TYPE}"


# instance fields
.field private final returnRaw:Z

.field private final returnUrlTemplate:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/net/Uri;)V
    .locals 1
    .param p1, "inputUri"    # Landroid/net/Uri;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const-string v0, "ret"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/zxing/client/android/ScanFromWebPageManager;->returnUrlTemplate:Ljava/lang/String;

    .line 48
    const-string v0, "raw"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/google/zxing/client/android/ScanFromWebPageManager;->returnRaw:Z

    .line 49
    return-void

    .line 48
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "placeholder"    # Ljava/lang/CharSequence;
    .param p1, "with"    # Ljava/lang/CharSequence;
    .param p2, "pattern"    # Ljava/lang/String;

    .prologue
    .line 67
    if-nez p1, :cond_0

    const-string v0, ""

    .line 69
    .local v0, "escapedWith":Ljava/lang/CharSequence;
    :goto_0
    :try_start_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 73
    :goto_1
    invoke-virtual {p2, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .end local v0    # "escapedWith":Ljava/lang/CharSequence;
    :cond_0
    move-object v0, p1

    .line 67
    goto :goto_0

    .line 70
    .restart local v0    # "escapedWith":Ljava/lang/CharSequence;
    :catch_0
    move-exception v1

    goto :goto_1
.end method


# virtual methods
.method buildReplyURL(Lcom/google/zxing/Result;Lcom/google/zxing/client/android/result/ResultHandler;)Ljava/lang/String;
    .locals 3
    .param p1, "rawResult"    # Lcom/google/zxing/Result;
    .param p2, "resultHandler"    # Lcom/google/zxing/client/android/result/ResultHandler;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/google/zxing/client/android/ScanFromWebPageManager;->returnUrlTemplate:Ljava/lang/String;

    .line 57
    .local v0, "result":Ljava/lang/String;
    const-string v2, "{CODE}"

    .line 58
    iget-boolean v1, p0, Lcom/google/zxing/client/android/ScanFromWebPageManager;->returnRaw:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v1

    .line 57
    :goto_0
    invoke-static {v2, v1, v0}, Lcom/google/zxing/client/android/ScanFromWebPageManager;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    const-string v1, "{RAWCODE}"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/google/zxing/client/android/ScanFromWebPageManager;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    const-string v1, "{FORMAT}"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/google/zxing/client/android/ScanFromWebPageManager;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 61
    const-string v1, "{TYPE}"

    invoke-virtual {p2}, Lcom/google/zxing/client/android/result/ResultHandler;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/google/zxing/client/android/ScanFromWebPageManager;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    const-string v1, "{META}"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getResultMetadata()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/google/zxing/client/android/ScanFromWebPageManager;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    return-object v0

    .line 58
    :cond_0
    invoke-virtual {p2}, Lcom/google/zxing/client/android/result/ResultHandler;->getDisplayContents()Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_0
.end method

.method isScanFromWebPage()Z
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/google/zxing/client/android/ScanFromWebPageManager;->returnUrlTemplate:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
