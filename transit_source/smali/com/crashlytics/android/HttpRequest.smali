.class final Lcom/crashlytics/android/HttpRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/net/HttpURLConnection;

.field private b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:I


# direct methods
.method private constructor <init>(Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/CharSequence;
    .param p2, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1303
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->d:Z

    .line 1305
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->e:Z

    .line 1307
    const/16 v0, 0x2000

    iput v0, p0, Lcom/crashlytics/android/HttpRequest;->f:I

    .line 1319
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    .line 1320
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1323
    return-void

    .line 1321
    :catch_0
    move-exception v0

    .line 1322
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private constructor <init>(Ljava/net/URL;Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1303
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->d:Z

    .line 1305
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->e:Z

    .line 1307
    const/16 v0, 0x2000

    iput v0, p0, Lcom/crashlytics/android/HttpRequest;->f:I

    .line 1336
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    .line 1337
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1340
    return-void

    .line 1338
    :catch_0
    move-exception v0

    .line 1339
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method static synthetic a(Lcom/crashlytics/android/HttpRequest;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/crashlytics/android/HttpRequest;->f:I

    return v0
.end method

.method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lcom/crashlytics/android/HttpRequest;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2370
    new-instance v0, Lcom/crashlytics/android/ai;

    iget-boolean v3, p0, Lcom/crashlytics/android/HttpRequest;->d:Z

    move-object v1, p0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/ai;-><init>(Lcom/crashlytics/android/HttpRequest;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Lcom/crashlytics/android/ai;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/HttpRequest;

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 915
    new-instance v0, Lcom/crashlytics/android/HttpRequest;

    const-string v1, "POST"

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lcom/crashlytics/android/HttpRequest;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lcom/crashlytics/android/HttpRequest;"
        }
    .end annotation

    .prologue
    const/16 v7, 0x3f

    const/16 v6, 0x3d

    const/16 v4, 0x2f

    const/16 v5, 0x26

    .line 881
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 882
    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/crashlytics/android/HttpRequest;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/crashlytics/android/HttpRequest;

    const-string v2, "GET"

    invoke-direct {v1, v0, v2}, Lcom/crashlytics/android/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v1

    .line 881
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_5

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    if-ge v2, v3, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v5, :cond_3

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2502
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2503
    const-string v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2504
    if-eqz p2, :cond_0

    .line 2505
    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2506
    :cond_0
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2507
    const-string v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    .line 2508
    if-eqz p3, :cond_1

    .line 2509
    const-string v0, "Content-Type"

    invoke-direct {p0, v0, p3}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    .line 2510
    :cond_1
    const-string v0, "\r\n"

    invoke-direct {p0, v0}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2552
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->i()Lcom/crashlytics/android/HttpRequest;

    .line 2553
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    .line 2554
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    invoke-virtual {v0, p4}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2558
    return-object p0

    .line 2555
    :catch_0
    move-exception v0

    .line 2556
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public static a(Ljava/net/URL;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 862
    new-instance v0, Lcom/crashlytics/android/HttpRequest;

    const-string v1, "GET"

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 979
    new-instance v0, Lcom/crashlytics/android/HttpRequest;

    const-string v1, "PUT"

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2535
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    invoke-static {p0}, Lcom/crashlytics/android/HttpRequest;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 735
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 740
    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 741
    invoke-virtual {v4}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 742
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 743
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 746
    :cond_0
    :try_start_1
    new-instance v0, Ljava/net/URI;

    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 736
    :catch_0
    move-exception v0

    .line 737
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 748
    :catch_1
    move-exception v0

    .line 749
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Parsing URI failed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 750
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 751
    new-instance v0, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v0, v1}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 246
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 249
    :goto_0
    return-object p0

    :cond_0
    const-string p0, "UTF-8"

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    const/16 v7, 0x22

    const/4 v2, 0x0

    const/16 v6, 0x3b

    const/4 v5, -0x1

    .line 2067
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, v2

    .line 2099
    :cond_1
    :goto_0
    return-object v0

    .line 2070
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 2071
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 2072
    if-eqz v3, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    move-object v0, v2

    .line 2073
    goto :goto_0

    .line 2075
    :cond_4
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2076
    if-ne v0, v5, :cond_8

    move v0, v3

    move v3, v1

    .line 2079
    :goto_1
    if-ge v0, v3, :cond_7

    .line 2080
    const/16 v4, 0x3d

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 2081
    if-eq v4, v5, :cond_5

    if-ge v4, v3, :cond_5

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2083
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 2084
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    .line 2085
    if-eqz v4, :cond_5

    .line 2086
    const/4 v1, 0x2

    if-le v4, v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v7, v1, :cond_1

    add-int/lit8 v1, v4, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v7, v1, :cond_1

    .line 2088
    const/4 v1, 0x1

    add-int/lit8 v2, v4, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2093
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 2094
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2095
    if-ne v0, v5, :cond_6

    move v0, v1

    :cond_6
    move v8, v0

    move v0, v3

    move v3, v8

    .line 2097
    goto :goto_1

    :cond_7
    move-object v0, v2

    .line 2099
    goto :goto_0

    :cond_8
    move v8, v0

    move v0, v3

    move v3, v8

    goto :goto_1
.end method

.method private d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2772
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->h()Lcom/crashlytics/android/HttpRequest;

    .line 2773
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2777
    return-object p0

    .line 2774
    :catch_0
    move-exception v0

    .line 2775
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2684
    invoke-direct {p0, p1}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, ": "

    invoke-direct {v0, v1}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    invoke-direct {v0, p2}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-direct {v0, v1}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/CharSequence;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1582
    const-string v0, "Content-Length"

    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->g()Lcom/crashlytics/android/HttpRequest;

    iget-object v1, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v1

    if-lez v1, :cond_0

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 1584
    :goto_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->e()Ljava/io/InputStream;

    move-result-object v2

    iget v3, p0, Lcom/crashlytics/android/HttpRequest;->f:I

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v1, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lcom/crashlytics/android/HttpRequest;

    .line 1585
    invoke-static {p1}, Lcom/crashlytics/android/HttpRequest;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1582
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    goto :goto_0

    .line 1586
    :catch_0
    move-exception v0

    .line 1587
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private e()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1647
    invoke-virtual {p0}, Lcom/crashlytics/android/HttpRequest;->b()I

    move-result v0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_1

    .line 1649
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1663
    :cond_0
    :goto_0
    return-object v0

    .line 1650
    :catch_0
    move-exception v0

    .line 1651
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 1654
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 1655
    if-nez v0, :cond_0

    .line 1657
    :try_start_1
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 1658
    :catch_1
    move-exception v0

    .line 1659
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private f()Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2414
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    if-nez v0, :cond_0

    .line 2427
    :goto_0
    return-object p0

    .line 2416
    :cond_0
    iget-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->c:Z

    if-eqz v0, :cond_1

    .line 2417
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    const-string v1, "\r\n--00content0boundary00--\r\n"

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    .line 2418
    :cond_1
    iget-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->d:Z

    if-eqz v0, :cond_2

    .line 2420
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    invoke-virtual {v0}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2426
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    goto :goto_0

    .line 2425
    :cond_2
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    invoke-virtual {v0}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->close()V

    goto :goto_1

    .line 2423
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private g()Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2439
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->f()Lcom/crashlytics/android/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 2440
    :catch_0
    move-exception v0

    .line 2441
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private h()Lcom/crashlytics/android/HttpRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2452
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    if-eqz v0, :cond_0

    .line 2459
    :goto_0
    return-object p0

    .line 2454
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 2455
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "charset"

    invoke-static {v0, v1}, Lcom/crashlytics/android/HttpRequest;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2457
    new-instance v1, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    iget-object v2, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget v3, p0, Lcom/crashlytics/android/HttpRequest;->f:I

    invoke-direct {v1, v2, v0, v3}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;-><init>(Ljava/io/OutputStream;Ljava/lang/String;I)V

    iput-object v1, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    goto :goto_0
.end method

.method private i()Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2469
    iget-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->c:Z

    if-nez v0, :cond_0

    .line 2470
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/crashlytics/android/HttpRequest;->c:Z

    .line 2471
    const-string v0, "multipart/form-data; boundary=00content0boundary00"

    const-string v1, "Content-Type"

    invoke-virtual {p0, v1, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    invoke-direct {v0}, Lcom/crashlytics/android/HttpRequest;->h()Lcom/crashlytics/android/HttpRequest;

    .line 2472
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    const-string v1, "--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    .line 2475
    :goto_0
    return-object p0

    .line 2474
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    const-string v1, "\r\n--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Lcom/crashlytics/android/HttpRequest;
    .locals 2

    .prologue
    .line 1843
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 1844
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Number;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 2571
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v1, v0}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 1

    .prologue
    .line 1855
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1856
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2630
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2634
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0

    .line 2631
    :catch_0
    move-exception v0

    .line 2632
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2665
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->i()Lcom/crashlytics/android/HttpRequest;

    .line 2666
    invoke-direct {p0, p1, p2, p3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    .line 2667
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->b:Lcom/crashlytics/android/HttpRequest$RequestOutputStream;

    invoke-direct {p0, p4, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lcom/crashlytics/android/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2671
    return-object p0

    .line 2668
    :catch_0
    move-exception v0

    .line 2669
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ljava/util/Map$Entry;)Lcom/crashlytics/android/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/crashlytics/android/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1891
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public final a(Z)Lcom/crashlytics/android/HttpRequest;
    .locals 2

    .prologue
    .line 2128
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 2129
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1902
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->g()Lcom/crashlytics/android/HttpRequest;

    .line 1903
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 1354
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public final b()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1389
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest;->f()Lcom/crashlytics/android/HttpRequest;

    .line 1390
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1391
    :catch_0
    move-exception v0

    .line 1392
    new-instance v1, Lcom/crashlytics/android/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;
    .locals 1

    .prologue
    .line 2521
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1599
    const-string v0, "Content-Type"

    const-string v1, "charset"

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/crashlytics/android/HttpRequest;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/crashlytics/android/HttpRequest;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2951
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1345
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/crashlytics/android/HttpRequest;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
