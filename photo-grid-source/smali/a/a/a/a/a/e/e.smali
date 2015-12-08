.class public final La/a/a/a/a/e/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;

.field private static c:La/a/a/a/a/e/h;


# instance fields
.field public final a:Ljava/net/URL;

.field private d:Ljava/net/HttpURLConnection;

.field private final e:Ljava/lang/String;

.field private f:La/a/a/a/a/e/l;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private k:Ljava/lang/String;

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 261
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, La/a/a/a/a/e/e;->b:[Ljava/lang/String;

    .line 323
    sget-object v0, La/a/a/a/a/e/h;->a:La/a/a/a/a/e/h;

    sput-object v0, La/a/a/a/a/e/e;->c:La/a/a/a/a/e/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1237
    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/a/a/e/e;->d:Ljava/net/HttpURLConnection;

    .line 1249
    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/a/a/e/e;->h:Z

    .line 1251
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/a/a/e/e;->i:Z

    .line 1253
    const/16 v0, 0x2000

    iput v0, p0, La/a/a/a/a/e/e;->j:I

    .line 1268
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/a/e/e;->a:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1272
    iput-object p2, p0, La/a/a/a/a/e/e;->e:Ljava/lang/String;

    .line 1273
    return-void

    .line 1269
    :catch_0
    move-exception v0

    .line 1270
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method static synthetic a(La/a/a/a/a/e/e;)I
    .locals 1

    .prologue
    .line 103
    iget v0, p0, La/a/a/a/a/e/e;->j:I

    return v0
.end method

.method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)La/a/a/a/a/e/e;
    .locals 6

    .prologue
    .line 2364
    new-instance v0, La/a/a/a/a/e/f;

    iget-boolean v3, p0, La/a/a/a/a/e/e;->h:Z

    move-object v1, p0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La/a/a/a/a/e/f;-><init>(La/a/a/a/a/e/e;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v0}, La/a/a/a/a/e/f;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/e/e;

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 948
    new-instance v0, La/a/a/a/a/e/e;

    const-string v1, "PUT"

    invoke-direct {v0, p0, v1}, La/a/a/a/a/e/e;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/util/Map;)La/a/a/a/a/e/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;)",
            "La/a/a/a/a/e/e;"
        }
    .end annotation

    .prologue
    .line 863
    invoke-static {p0, p1}, La/a/a/a/a/e/e;->c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 864
    invoke-static {v0}, La/a/a/a/a/e/e;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 3836
    new-instance v1, La/a/a/a/a/e/e;

    const-string v2, "GET"

    invoke-direct {v1, v0, v2}, La/a/a/a/a/e/e;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 864
    return-object v1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2492
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2493
    const-string v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2494
    if-eqz p2, :cond_0

    .line 2495
    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2496
    :cond_0
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2497
    const-string v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, La/a/a/a/a/e/e;->e(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    .line 2498
    if-eqz p3, :cond_1

    .line 2499
    const-string v0, "Content-Type"

    invoke-direct {p0, v0, p3}, La/a/a/a/a/e/e;->e(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    .line 2500
    :cond_1
    const-string v0, "\r\n"

    invoke-direct {p0, v0}, La/a/a/a/a/e/e;->d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 1004
    new-instance v0, La/a/a/a/a/e/e;

    const-string v1, "DELETE"

    invoke-direct {v0, p0, v1}, La/a/a/a/a/e/e;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/CharSequence;Ljava/util/Map;)La/a/a/a/a/e/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;)",
            "La/a/a/a/a/e/e;"
        }
    .end annotation

    .prologue
    .line 919
    invoke-static {p0, p1}, La/a/a/a/a/e/e;->c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 920
    invoke-static {v0}, La/a/a/a/a/e/e;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 3892
    new-instance v1, La/a/a/a/a/e/e;

    const-string v2, "POST"

    invoke-direct {v1, v0, v2}, La/a/a/a/a/e/e;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 920
    return-object v1
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    invoke-static {p0}, La/a/a/a/a/e/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 719
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 724
    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 725
    invoke-virtual {v4}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 726
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 727
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

    .line 730
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

    move-result-object v0

    .line 731
    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 732
    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 733
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "+"

    const-string v3, "%2B"

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 735
    :cond_1
    return-object v0

    .line 720
    :catch_0
    move-exception v0

    .line 721
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 736
    :catch_1
    move-exception v0

    .line 737
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Parsing URI failed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 738
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 739
    new-instance v0, La/a/a/a/a/e/j;

    invoke-direct {v0, v1}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method private static c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/16 v7, 0x3f

    const/16 v6, 0x3d

    const/16 v4, 0x2f

    const/16 v5, 0x26

    .line 754
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 755
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 783
    :cond_0
    :goto_0
    return-object v0

    .line 758
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3275
    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    .line 3276
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3282
    :cond_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 3283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 3284
    const/4 v4, -0x1

    if-ne v2, v4, :cond_5

    .line 3285
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 765
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 766
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 767
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 769
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 770
    if-eqz v0, :cond_4

    .line 771
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 773
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 774
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 775
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 776
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 778
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 779
    if-eqz v0, :cond_4

    .line 780
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3286
    :cond_5
    if-ge v2, v3, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v5, :cond_3

    .line 3287
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 783
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 267
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

    .line 2034
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, v2

    .line 2064
    :cond_1
    :goto_0
    return-object v0

    .line 2037
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 2038
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 2039
    if-eqz v3, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    move-object v0, v2

    .line 2040
    goto :goto_0

    .line 2042
    :cond_4
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2043
    if-ne v0, v5, :cond_8

    move v0, v3

    move v3, v1

    .line 2046
    :goto_1
    if-ge v0, v3, :cond_7

    .line 2047
    const/16 v4, 0x3d

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 2048
    if-eq v4, v5, :cond_5

    if-ge v4, v3, :cond_5

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2049
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 2050
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    .line 2051
    if-eqz v4, :cond_5

    .line 2052
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

    .line 2053
    const/4 v1, 0x1

    add-int/lit8 v2, v4, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2058
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 2059
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2060
    if-ne v0, v5, :cond_6

    move v0, v1

    :cond_6
    move v8, v0

    move v0, v3

    move v3, v8

    .line 2062
    goto :goto_1

    :cond_7
    move-object v0, v2

    .line 2064
    goto :goto_0

    :cond_8
    move v8, v0

    move v0, v3

    move v3, v8

    goto :goto_1
.end method

.method private d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2759
    :try_start_0
    invoke-direct {p0}, La/a/a/a/a/e/e;->i()La/a/a/a/a/e/e;

    .line 2760
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/a/a/e/l;->a(Ljava/lang/String;)La/a/a/a/a/e/l;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2764
    return-object p0

    .line 2761
    :catch_0
    move-exception v0

    .line 2762
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2541
    :try_start_0
    invoke-direct {p0}, La/a/a/a/a/e/e;->j()La/a/a/a/a/e/e;

    .line 2542
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    .line 2543
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    invoke-virtual {v0, p2}, La/a/a/a/a/e/l;->a(Ljava/lang/String;)La/a/a/a/a/e/l;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2547
    return-object p0

    .line 2544
    :catch_0
    move-exception v0

    .line 2545
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1537
    .line 7312
    const-string v0, "Content-Length"

    .line 7937
    invoke-direct {p0}, La/a/a/a/a/e/e;->h()La/a/a/a/a/e/e;

    .line 7938
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v1

    .line 6521
    if-lez v1, :cond_0

    .line 6522
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 8616
    :goto_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {p0}, La/a/a/a/a/e/e;->f()Ljava/io/InputStream;

    move-result-object v2

    iget v3, p0, La/a/a/a/a/e/e;->j:I

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 1539
    invoke-direct {p0, v1, v0}, La/a/a/a/a/e/e;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)La/a/a/a/a/e/e;

    .line 1540
    invoke-static {p1}, La/a/a/a/a/e/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 6524
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    goto :goto_0

    .line 1541
    :catch_0
    move-exception v0

    .line 1542
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2672
    invoke-direct {p0, p1}, La/a/a/a/a/e/e;->d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, ": "

    invoke-direct {v0, v1}, La/a/a/a/a/e/e;->d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;

    move-result-object v0

    invoke-direct {v0, p2}, La/a/a/a/a/e/e;->d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-direct {v0, v1}, La/a/a/a/a/e/e;->d(Ljava/lang/CharSequence;)La/a/a/a/a/e/e;

    move-result-object v0

    return-object v0
.end method

.method private e()Ljava/net/HttpURLConnection;
    .locals 7

    .prologue
    .line 1294
    :try_start_0
    iget-object v0, p0, La/a/a/a/a/e/e;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1295
    sget-object v0, La/a/a/a/a/e/e;->c:La/a/a/a/a/e/h;

    iget-object v1, p0, La/a/a/a/a/e/e;->a:Ljava/net/URL;

    .line 4288
    new-instance v2, Ljava/net/Proxy;

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v4, Ljava/net/InetSocketAddress;

    iget-object v5, p0, La/a/a/a/a/e/e;->k:Ljava/lang/String;

    iget v6, p0, La/a/a/a/a/e/e;->l:I

    invoke-direct {v4, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v2, v3, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 1295
    invoke-interface {v0, v1, v2}, La/a/a/a/a/e/h;->a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 1298
    :goto_0
    iget-object v1, p0, La/a/a/a/a/e/e;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 1299
    return-object v0

    .line 1297
    :cond_0
    sget-object v0, La/a/a/a/a/e/e;->c:La/a/a/a/a/e/h;

    iget-object v1, p0, La/a/a/a/a/e/e;->a:Ljava/net/URL;

    invoke-interface {v0, v1}, La/a/a/a/a/e/h;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1300
    :catch_0
    move-exception v0

    .line 1301
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private f()Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 1627
    invoke-virtual {p0}, La/a/a/a/a/e/e;->b()I

    move-result v0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_2

    .line 1629
    :try_start_0
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1643
    :cond_0
    :goto_0
    iget-boolean v1, p0, La/a/a/a/a/e/e;->i:Z

    if-eqz v1, :cond_1

    const-string v1, "gzip"

    .line 10143
    const-string v2, "Content-Encoding"

    invoke-virtual {p0, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1643
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1647
    :cond_1
    :goto_1
    return-object v0

    .line 1630
    :catch_0
    move-exception v0

    .line 1631
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 1634
    :cond_2
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 1635
    if-nez v0, :cond_0

    .line 1637
    :try_start_1
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 1638
    :catch_1
    move-exception v0

    .line 1639
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 1647
    :cond_3
    :try_start_2
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v1

    goto :goto_1

    .line 1648
    :catch_2
    move-exception v0

    .line 1649
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private g()La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2407
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    if-nez v0, :cond_0

    .line 2420
    :goto_0
    return-object p0

    .line 2409
    :cond_0
    iget-boolean v0, p0, La/a/a/a/a/e/e;->g:Z

    if-eqz v0, :cond_1

    .line 2410
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    const-string v1, "\r\n--00content0boundary00--\r\n"

    invoke-virtual {v0, v1}, La/a/a/a/a/e/l;->a(Ljava/lang/String;)La/a/a/a/a/e/l;

    .line 2411
    :cond_1
    iget-boolean v0, p0, La/a/a/a/a/e/e;->h:Z

    if-eqz v0, :cond_2

    .line 2413
    :try_start_0
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    invoke-virtual {v0}, La/a/a/a/a/e/l;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2419
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    goto :goto_0

    .line 2418
    :cond_2
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    invoke-virtual {v0}, La/a/a/a/a/e/l;->close()V

    goto :goto_1

    .line 2416
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private h()La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2432
    :try_start_0
    invoke-direct {p0}, La/a/a/a/a/e/e;->g()La/a/a/a/a/e/e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 2433
    :catch_0
    move-exception v0

    .line 2434
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private i()La/a/a/a/a/e/e;
    .locals 4

    .prologue
    .line 2445
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    if-eqz v0, :cond_0

    .line 2450
    :goto_0
    return-object p0

    .line 2447
    :cond_0
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 2448
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "charset"

    invoke-static {v0, v1}, La/a/a/a/a/e/e;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2449
    new-instance v1, La/a/a/a/a/e/l;

    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget v3, p0, La/a/a/a/a/e/e;->j:I

    invoke-direct {v1, v2, v0, v3}, La/a/a/a/a/e/l;-><init>(Ljava/io/OutputStream;Ljava/lang/String;I)V

    iput-object v1, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    goto :goto_0
.end method

.method private j()La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2460
    iget-boolean v0, p0, La/a/a/a/a/e/e;->g:Z

    if-nez v0, :cond_0

    .line 2461
    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/a/a/e/e;->g:Z

    .line 2462
    const-string v0, "multipart/form-data; boundary=00content0boundary00"

    .line 10294
    const-string v1, "Content-Type"

    invoke-virtual {p0, v1, v0}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    .line 2462
    invoke-direct {v0}, La/a/a/a/a/e/e;->i()La/a/a/a/a/e/e;

    .line 2463
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    const-string v1, "--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, La/a/a/a/a/e/l;->a(Ljava/lang/String;)La/a/a/a/a/e/l;

    .line 2466
    :goto_0
    return-object p0

    .line 2465
    :cond_0
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    const-string v1, "\r\n--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, La/a/a/a/a/e/l;->a(Ljava/lang/String;)La/a/a/a/a/e/l;

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Number;)La/a/a/a/a/e/e;
    .locals 1

    .prologue
    .line 2559
    .line 10573
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11525
    :goto_0
    invoke-direct {p0, p1, v0}, La/a/a/a/a/e/e;->d(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    .line 2559
    return-object v0

    .line 10573
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;
    .locals 1

    .prologue
    .line 1827
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1828
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)La/a/a/a/a/e/e;
    .locals 3

    .prologue
    .line 2613
    const/4 v2, 0x0

    .line 2615
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2616
    :try_start_1
    invoke-virtual {p0, p1, p2, p3, v1}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)La/a/a/a/a/e/e;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 2622
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2624
    :goto_0
    return-object v0

    .line 2617
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 2618
    :goto_1
    :try_start_3
    new-instance v2, La/a/a/a/a/e/j;

    invoke-direct {v2, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2620
    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v1, :cond_0

    .line 2622
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 2624
    :cond_0
    :goto_3
    throw v0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_3

    .line 2620
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_2

    .line 2617
    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)La/a/a/a/a/e/e;
    .locals 2

    .prologue
    .line 2654
    :try_start_0
    invoke-direct {p0}, La/a/a/a/a/e/e;->j()La/a/a/a/a/e/e;

    .line 2655
    invoke-direct {p0, p1, p2, p3}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    .line 2656
    iget-object v0, p0, La/a/a/a/a/e/e;->f:La/a/a/a/a/e/l;

    invoke-direct {p0, p4, v0}, La/a/a/a/a/e/e;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)La/a/a/a/a/e/e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2660
    return-object p0

    .line 2657
    :catch_0
    move-exception v0

    .line 2658
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1874
    invoke-direct {p0}, La/a/a/a/a/e/e;->h()La/a/a/a/a/e/e;

    .line 1875
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 1316
    iget-object v0, p0, La/a/a/a/a/e/e;->d:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 1317
    invoke-direct {p0}, La/a/a/a/a/e/e;->e()Ljava/net/HttpURLConnection;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/e/e;->d:Ljava/net/HttpURLConnection;

    .line 1318
    :cond_0
    iget-object v0, p0, La/a/a/a/a/e/e;->d:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 1351
    :try_start_0
    invoke-direct {p0}, La/a/a/a/a/e/e;->g()La/a/a/a/a/e/e;

    .line 1352
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1353
    :catch_0
    move-exception v0

    .line 1354
    new-instance v1, La/a/a/a/a/e/j;

    invoke-direct {v1, v0}, La/a/a/a/a/e/j;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;
    .locals 1

    .prologue
    .line 2525
    invoke-direct {p0, p1, p2}, La/a/a/a/a/e/e;->d(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1553
    .line 9073
    const-string v0, "Content-Type"

    const-string v1, "charset"

    .line 9967
    invoke-virtual {p0, v0}, La/a/a/a/a/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, La/a/a/a/a/e/e;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1553
    invoke-direct {p0, v0}, La/a/a/a/a/e/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2924
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4924
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v1

    .line 1307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 5915
    invoke-virtual {p0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v1

    .line 1307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
