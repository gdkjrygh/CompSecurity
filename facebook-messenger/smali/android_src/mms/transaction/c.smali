.class public Landroid_src/mms/transaction/c;
.super Ljava/lang/Object;
.source "HttpUtils.java"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/transaction/c;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid_src/mms/transaction/c;->a:Ljava/lang/String;

    .line 63
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    return-void
.end method

.method private static a(Landroid/content/Context;)Landroid/net/http/AndroidHttpClient;
    .locals 7

    .prologue
    .line 296
    invoke-static {}, Landroid_src/mms/c;->d()Ljava/lang/String;

    move-result-object v0

    .line 297
    invoke-static {v0, p0}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;Landroid/content/Context;)Landroid/net/http/AndroidHttpClient;

    move-result-object v1

    .line 298
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    .line 299
    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 302
    invoke-static {}, Landroid_src/mms/c;->k()I

    move-result v3

    .line 304
    const/4 v4, 0x3

    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 305
    const-string v4, "fb-mms:HttpUtils"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[HttpUtils] createHttpClient w/ socket timeout "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " ms, "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", UA="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :cond_0
    invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 309
    return-object v1
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 339
    if-nez p0, :cond_1

    .line 340
    const/4 p0, 0x0

    .line 352
    :cond_0
    :goto_0
    return-object p0

    .line 342
    :cond_1
    const-string v0, "iw"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 344
    const-string p0, "he"

    goto :goto_0

    .line 345
    :cond_2
    const-string v0, "in"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 347
    const-string p0, "id"

    goto :goto_0

    .line 348
    :cond_3
    const-string v0, "ji"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    const-string p0, "yi"

    goto :goto_0
.end method

.method public static a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    invoke-static {v0, p0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/StringBuilder;Ljava/util/Locale;)V

    .line 324
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, p0}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 325
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 326
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    :cond_0
    const-string v1, "en-US"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 289
    const-string v0, "fb-mms:HttpUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 291
    invoke-virtual {v0, p0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 292
    throw v0
.end method

.method private static a(Ljava/lang/StringBuilder;Ljava/util/Locale;)V
    .locals 2

    .prologue
    .line 357
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 358
    if-eqz v0, :cond_0

    .line 359
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 361
    if-eqz v0, :cond_0

    .line 362
    const-string v1, "-"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    :cond_0
    return-void
.end method

.method protected static a(Landroid/content/Context;JLjava/lang/String;[BIZLjava/lang/String;I)[B
    .locals 15

    .prologue
    .line 92
    if-nez p3, :cond_0

    .line 93
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "URL must not be null."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 96
    :cond_0
    const/4 v3, 0x2

    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 97
    const-string v3, "fb-mms:HttpUtils"

    const-string v4, "httpConnection: params list"

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v3, "fb-mms:HttpUtils"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\ttoken\t\t= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-wide/from16 v0, p1

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v3, "fb-mms:HttpUtils"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\turl\t\t= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v4, "fb-mms:HttpUtils"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\tmethod\t\t= "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v3, 0x1

    move/from16 v0, p5

    if-ne v0, v3, :cond_3

    const-string v3, "POST"

    :goto_0
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v3, "fb-mms:HttpUtils"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\tisProxySet\t= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move/from16 v0, p6

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v3, "fb-mms:HttpUtils"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\tproxyHost\t= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p7

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v3, "fb-mms:HttpUtils"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\tproxyPort\t= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move/from16 v0, p8

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_1
    const/4 v4, 0x0

    .line 114
    :try_start_0
    new-instance v3, Ljava/net/URI;

    move-object/from16 v0, p3

    invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 115
    new-instance v7, Lorg/apache/http/HttpHost;

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v3

    const-string v6, "http"

    invoke-direct {v7, v5, v3, v6}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    invoke-static {p0}, Landroid_src/mms/transaction/c;->a(Landroid/content/Context;)Landroid/net/http/AndroidHttpClient;

    move-result-object v4

    .line 121
    packed-switch p5, :pswitch_data_0

    .line 136
    const-string v3, "fb-mms:HttpUtils"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unknown HTTP method: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move/from16 v0, p5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ". Must be one of POST["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "] or GET["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 139
    const/4 v3, 0x0

    .line 279
    if-eqz v4, :cond_2

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 283
    :cond_2
    :goto_1
    return-object v3

    .line 100
    :cond_3
    const/4 v3, 0x2

    move/from16 v0, p5

    if-ne v0, v3, :cond_4

    const-string v3, "GET"

    goto/16 :goto_0

    :cond_4
    const-string v3, "UNKNOWN"

    goto/16 :goto_0

    .line 123
    :pswitch_0
    :try_start_1
    new-instance v5, Landroid_src/mms/transaction/m;

    move-wide/from16 v0, p1

    move-object/from16 v2, p4

    invoke-direct {v5, p0, v0, v1, v2}, Landroid_src/mms/transaction/m;-><init>(Landroid/content/Context;J[B)V

    .line 126
    const-string v3, "application/vnd.wap.mms-message"

    invoke-virtual {v5, v3}, Landroid_src/mms/transaction/m;->setContentType(Ljava/lang/String;)V

    .line 128
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    move-object/from16 v0, p3

    invoke-direct {v3, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v3, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    move-object v6, v3

    .line 143
    :goto_2
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v3

    .line 144
    if-eqz p6, :cond_5

    .line 145
    new-instance v5, Lorg/apache/http/HttpHost;

    move-object/from16 v0, p7

    move/from16 v1, p8

    invoke-direct {v5, v0, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    invoke-static {v3, v5}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 148
    :cond_5
    invoke-interface {v6, v3}, Lorg/apache/http/HttpRequest;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 151
    const-string v3, "Accept"

    const-string v5, "*/*, application/vnd.wap.mms-message, application/vnd.wap.sic"

    invoke-interface {v6, v3, v5}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-static {}, Landroid_src/mms/c;->e()Ljava/lang/String;

    move-result-object v3

    .line 154
    invoke-static {}, Landroid_src/mms/c;->f()Ljava/lang/String;

    move-result-object v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    const/4 v8, 0x2

    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 158
    const-string v8, "fb-mms:HttpUtils"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[HttpUtils] httpConn: xWapProfUrl="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :cond_6
    invoke-interface {v6, v3, v5}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    :cond_7
    invoke-static {}, Landroid_src/mms/c;->g()Ljava/lang/String;

    move-result-object v5

    .line 171
    if-eqz v5, :cond_a

    .line 172
    const-string v3, "phone"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v8

    .line 175
    invoke-static {}, Landroid_src/mms/c;->h()Ljava/lang/String;

    move-result-object v9

    .line 176
    const-string v3, "\\|"

    invoke-virtual {v5, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 178
    array-length v11, v10

    const/4 v3, 0x0

    move v5, v3

    :goto_3
    if-ge v5, v11, :cond_a

    aget-object v3, v10, v5

    .line 179
    const-string v12, ":"

    const/4 v13, 0x2

    invoke-virtual {v3, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 181
    array-length v12, v3

    const/4 v13, 0x2

    if-ne v12, v13, :cond_9

    .line 182
    const/4 v12, 0x0

    aget-object v12, v3, v12

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    .line 183
    const/4 v13, 0x1

    aget-object v3, v3, v13

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 185
    if-eqz v9, :cond_8

    .line 186
    invoke-virtual {v3, v9, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 188
    :cond_8
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_9

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_9

    .line 189
    invoke-interface {v6, v12, v3}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :cond_9
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto :goto_3

    .line 133
    :pswitch_1
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    move-object/from16 v0, p3

    invoke-direct {v3, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    move-object v6, v3

    .line 134
    goto/16 :goto_2

    .line 194
    :cond_a
    const-string v3, "Accept-Language"

    sget-object v5, Landroid_src/mms/transaction/c;->a:Ljava/lang/String;

    invoke-interface {v6, v3, v5}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-virtual {v4, v7, v6}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 197
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v5

    .line 198
    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    const/16 v7, 0xc8

    if-eq v6, v7, :cond_c

    .line 199
    new-instance v3, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "HTTP error: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 267
    :catch_0
    move-exception v3

    .line 268
    :try_start_2
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 279
    if-eqz v4, :cond_b

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 283
    :cond_b
    :goto_4
    const/4 v3, 0x0

    goto/16 :goto_1

    .line 202
    :cond_c
    :try_start_3
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_3
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-object v9

    .line 203
    const/4 v3, 0x0

    .line 204
    if-eqz v9, :cond_12

    .line 206
    :try_start_4
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-lez v5, :cond_d

    .line 207
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v5

    long-to-int v3, v5

    new-array v3, v3, [B

    .line 208
    new-instance v5, Ljava/io/DataInputStream;

    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 210
    :try_start_5
    invoke-virtual {v5, v3}, Ljava/io/DataInputStream;->readFully([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 213
    :try_start_6
    invoke-virtual {v5}, Ljava/io/DataInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 219
    :cond_d
    :goto_5
    :try_start_7
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->isChunked()Z

    move-result v5

    if-eqz v5, :cond_11

    .line 220
    const-string v5, "fb-mms:HttpUtils"

    const-string v6, "httpConnection: transfer encoding is chunked"

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    invoke-static {}, Landroid_src/mms/c;->b()I

    move-result v8

    .line 222
    new-array v10, v8, [B

    .line 223
    new-instance v11, Ljava/io/DataInputStream;

    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v11, v5}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 225
    const/4 v7, 0x0

    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v5, 0x0

    .line 230
    :cond_e
    :try_start_8
    invoke-virtual {v11, v10, v6, v8}, Ljava/io/DataInputStream;->read([BII)I
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-result v7

    .line 237
    if-lez v7, :cond_f

    .line 238
    sub-int/2addr v8, v7

    .line 239
    add-int/2addr v6, v7

    .line 241
    :cond_f
    if-ltz v7, :cond_10

    if-gtz v8, :cond_e

    .line 242
    :cond_10
    :goto_6
    const/4 v8, -0x1

    if-ne v7, v8, :cond_14

    if-lez v6, :cond_14

    if-nez v5, :cond_14

    .line 245
    :try_start_9
    new-array v3, v6, [B

    .line 246
    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v10, v5, v3, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 247
    const-string v5, "fb-mms:HttpUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "httpConnection: Chunked response length ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "]"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 254
    :goto_7
    :try_start_a
    invoke-virtual {v11}, Ljava/io/DataInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 261
    :cond_11
    :goto_8
    if-eqz v9, :cond_12

    .line 262
    :try_start_b
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_b
    .catch Ljava/net/URISyntaxException; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/net/SocketException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 279
    :cond_12
    if-eqz v4, :cond_2

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_1

    .line 214
    :catch_1
    move-exception v5

    .line 215
    :try_start_c
    const-string v6, "fb-mms:HttpUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error closing input stream: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto/16 :goto_5

    .line 261
    :catchall_0
    move-exception v3

    if-eqz v9, :cond_13

    .line 262
    :try_start_d
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->consumeContent()V

    :cond_13
    throw v3
    :try_end_d
    .catch Ljava/net/URISyntaxException; {:try_start_d .. :try_end_d} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/net/SocketException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 269
    :catch_2
    move-exception v3

    .line 270
    :try_start_e
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 279
    if-eqz v4, :cond_b

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_4

    .line 212
    :catchall_1
    move-exception v3

    .line 213
    :try_start_f
    invoke-virtual {v5}, Ljava/io/DataInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 216
    :goto_9
    :try_start_10
    throw v3

    .line 214
    :catch_3
    move-exception v5

    .line 215
    const-string v6, "fb-mms:HttpUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error closing input stream: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto :goto_9

    .line 231
    :catch_4
    move-exception v8

    .line 232
    const/4 v5, 0x1

    .line 233
    :try_start_11
    const-string v12, "fb-mms:HttpUtils"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "httpConnection: error reading input stream"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v12, v8}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    goto/16 :goto_6

    .line 253
    :catchall_2
    move-exception v3

    .line 254
    :try_start_12
    invoke-virtual {v11}, Ljava/io/DataInputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 257
    :goto_a
    :try_start_13
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 250
    :cond_14
    :try_start_14
    const-string v5, "fb-mms:HttpUtils"

    const-string v6, "httpConnection: Response entity too large or empty"

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    goto/16 :goto_7

    .line 255
    :catch_5
    move-exception v5

    .line 256
    :try_start_15
    const-string v6, "fb-mms:HttpUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error closing input stream: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    .line 255
    :catch_6
    move-exception v5

    .line 256
    const-string v6, "fb-mms:HttpUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error closing input stream: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    goto :goto_a

    .line 271
    :catch_7
    move-exception v3

    .line 272
    :try_start_16
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 279
    if-eqz v4, :cond_b

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_4

    .line 273
    :catch_8
    move-exception v3

    .line 274
    :try_start_17
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    .line 279
    if-eqz v4, :cond_b

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_4

    .line 275
    :catch_9
    move-exception v3

    .line 276
    :try_start_18
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Landroid_src/mms/transaction/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 279
    if-eqz v4, :cond_b

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_4

    .line 279
    :catchall_3
    move-exception v3

    if-eqz v4, :cond_15

    .line 280
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V

    :cond_15
    throw v3

    .line 121
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
