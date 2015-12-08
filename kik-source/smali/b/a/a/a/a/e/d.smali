.class public final Lb/a/a/a/a/e/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/a/e/d$e;,
        Lb/a/a/a/a/e/d$a;,
        Lb/a/a/a/a/e/d$d;,
        Lb/a/a/a/a/e/d$c;,
        Lb/a/a/a/a/e/d$b;
    }
.end annotation


# static fields
.field private static final b:[Ljava/lang/String;

.field private static c:Lb/a/a/a/a/e/d$b;


# instance fields
.field public final a:Ljava/net/URL;

.field private d:Ljava/net/HttpURLConnection;

.field private final e:Ljava/lang/String;

.field private f:Lb/a/a/a/a/e/d$e;

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
    .line 270
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lb/a/a/a/a/e/d;->b:[Ljava/lang/String;

    .line 378
    sget-object v0, Lb/a/a/a/a/e/d$b;->a:Lb/a/a/a/a/e/d$b;

    sput-object v0, Lb/a/a/a/a/e/d;->c:Lb/a/a/a/a/e/d$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1292
    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/a/a/a/e/d;->d:Ljava/net/HttpURLConnection;

    .line 1304
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/a/a/a/e/d;->h:Z

    .line 1306
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/a/a/a/e/d;->i:Z

    .line 1308
    const/16 v0, 0x2000

    iput v0, p0, Lb/a/a/a/a/e/d;->j:I

    .line 1323
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lb/a/a/a/a/e/d;->a:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1327
    iput-object p2, p0, Lb/a/a/a/a/e/d;->e:Ljava/lang/String;

    .line 1328
    return-void

    .line 1324
    :catch_0
    move-exception v0

    .line 1325
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method static synthetic a(Lb/a/a/a/a/e/d;)I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Lb/a/a/a/a/e/d;->j:I

    return v0
.end method

.method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lb/a/a/a/a/e/d;
    .locals 6

    .prologue
    .line 2419
    new-instance v0, Lb/a/a/a/a/e/e;

    iget-boolean v3, p0, Lb/a/a/a/a/e/d;->h:Z

    move-object v1, p0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lb/a/a/a/a/e/e;-><init>(Lb/a/a/a/a/e/d;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Lb/a/a/a/a/e/e;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/e/d;

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 1003
    new-instance v0, Lb/a/a/a/a/e/d;

    const-string v1, "PUT"

    invoke-direct {v0, p0, v1}, Lb/a/a/a/a/e/d;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;Ljava/util/Map;)Lb/a/a/a/a/e/d;
    .locals 3

    .prologue
    .line 918
    invoke-static {p0, p1}, Lb/a/a/a/a/e/d;->c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 919
    invoke-static {v0}, Lb/a/a/a/a/e/d;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lb/a/a/a/a/e/d;

    const-string v2, "GET"

    invoke-direct {v1, v0, v2}, Lb/a/a/a/a/e/d;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2548
    const-string v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2549
    if-eqz p2, :cond_0

    .line 2550
    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2551
    :cond_0
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2552
    const-string v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lb/a/a/a/a/e/d;->e(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    .line 2553
    if-eqz p3, :cond_1

    .line 2554
    const-string v0, "Content-Type"

    invoke-direct {p0, v0, p3}, Lb/a/a/a/a/e/d;->e(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    .line 2555
    :cond_1
    const-string v0, "\r\n"

    invoke-direct {p0, v0}, Lb/a/a/a/a/e/d;->d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 1059
    new-instance v0, Lb/a/a/a/a/e/d;

    const-string v1, "DELETE"

    invoke-direct {v0, p0, v1}, Lb/a/a/a/a/e/d;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/CharSequence;Ljava/util/Map;)Lb/a/a/a/a/e/d;
    .locals 3

    .prologue
    .line 974
    invoke-static {p0, p1}, Lb/a/a/a/a/e/d;->c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 975
    invoke-static {v0}, Lb/a/a/a/a/e/d;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lb/a/a/a/a/e/d;

    const-string v2, "POST"

    invoke-direct {v1, v0, v2}, Lb/a/a/a/a/e/d;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v1
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 112
    invoke-static {p0}, Lb/a/a/a/a/e/d;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 774
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 779
    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 780
    invoke-virtual {v4}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 781
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 782
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

    .line 785
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

    .line 786
    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 787
    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 788
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

    .line 790
    :cond_1
    return-object v0

    .line 775
    :catch_0
    move-exception v0

    .line 776
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 791
    :catch_1
    move-exception v0

    .line 792
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Parsing URI failed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 793
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 794
    new-instance v0, Lb/a/a/a/a/e/d$c;

    invoke-direct {v0, v1}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method private static c(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0x3f

    const/16 v6, 0x3d

    const/16 v4, 0x2f

    const/16 v5, 0x26

    .line 809
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 810
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 838
    :cond_0
    :goto_0
    return-object v0

    .line 813
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 815
    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 816
    :cond_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_5

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 820
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 821
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 822
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 824
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 825
    if-eqz v0, :cond_4

    .line 826
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 828
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 829
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 830
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 831
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 833
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 834
    if-eqz v0, :cond_4

    .line 835
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 816
    :cond_5
    if-ge v2, v3, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v5, :cond_3

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 838
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 277
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 280
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

    .line 2089
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, v2

    .line 2119
    :cond_1
    :goto_0
    return-object v0

    .line 2092
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 2093
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 2094
    if-eqz v3, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    move-object v0, v2

    .line 2095
    goto :goto_0

    .line 2097
    :cond_4
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2098
    if-ne v0, v5, :cond_8

    move v0, v3

    move v3, v1

    .line 2101
    :goto_1
    if-ge v0, v3, :cond_7

    .line 2102
    const/16 v4, 0x3d

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 2103
    if-eq v4, v5, :cond_5

    if-ge v4, v3, :cond_5

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2104
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 2105
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    .line 2106
    if-eqz v4, :cond_5

    .line 2107
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

    .line 2108
    const/4 v1, 0x1

    add-int/lit8 v2, v4, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2113
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 2114
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2115
    if-ne v0, v5, :cond_6

    move v0, v1

    :cond_6
    move v8, v0

    move v0, v3

    move v3, v8

    .line 2117
    goto :goto_1

    :cond_7
    move-object v0, v2

    .line 2119
    goto :goto_0

    :cond_8
    move v8, v0

    move v0, v3

    move v3, v8

    goto :goto_1
.end method

.method private d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2814
    :try_start_0
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->i()Lb/a/a/a/a/e/d;

    .line 2815
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a/a/a/a/e/d$e;->a(Ljava/lang/String;)Lb/a/a/a/a/e/d$e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2819
    return-object p0

    .line 2816
    :catch_0
    move-exception v0

    .line 2817
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2596
    :try_start_0
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->j()Lb/a/a/a/a/e/d;

    .line 2597
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    .line 2598
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    invoke-virtual {v0, p2}, Lb/a/a/a/a/e/d$e;->a(Ljava/lang/String;)Lb/a/a/a/a/e/d$e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2602
    return-object p0

    .line 2599
    :catch_0
    move-exception v0

    .line 2600
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1592
    const-string v0, "Content-Length"

    invoke-direct {p0}, Lb/a/a/a/a/e/d;->h()Lb/a/a/a/a/e/d;

    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v1

    if-lez v1, :cond_0

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 1594
    :goto_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {p0}, Lb/a/a/a/a/e/d;->f()Ljava/io/InputStream;

    move-result-object v2

    iget v3, p0, Lb/a/a/a/a/e/d;->j:I

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v1, v0}, Lb/a/a/a/a/e/d;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lb/a/a/a/a/e/d;

    .line 1595
    invoke-static {p1}, Lb/a/a/a/a/e/d;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1592
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    goto :goto_0

    .line 1596
    :catch_0
    move-exception v0

    .line 1597
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2727
    invoke-direct {p0, p1}, Lb/a/a/a/a/e/d;->d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    const-string v1, ": "

    invoke-direct {v0, v1}, Lb/a/a/a/a/e/d;->d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    invoke-direct {v0, p2}, Lb/a/a/a/a/e/d;->d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-direct {v0, v1}, Lb/a/a/a/a/e/d;->d(Ljava/lang/CharSequence;)Lb/a/a/a/a/e/d;

    move-result-object v0

    return-object v0
.end method

.method private e()Ljava/net/HttpURLConnection;
    .locals 7

    .prologue
    .line 1349
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/e/d;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1350
    sget-object v0, Lb/a/a/a/a/e/d;->c:Lb/a/a/a/a/e/d$b;

    iget-object v1, p0, Lb/a/a/a/a/e/d;->a:Ljava/net/URL;

    new-instance v2, Ljava/net/Proxy;

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v4, Ljava/net/InetSocketAddress;

    iget-object v5, p0, Lb/a/a/a/a/e/d;->k:Ljava/lang/String;

    iget v6, p0, Lb/a/a/a/a/e/d;->l:I

    invoke-direct {v4, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v2, v3, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    invoke-interface {v0, v1, v2}, Lb/a/a/a/a/e/d$b;->a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 1353
    :goto_0
    iget-object v1, p0, Lb/a/a/a/a/e/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 1354
    return-object v0

    .line 1352
    :cond_0
    sget-object v0, Lb/a/a/a/a/e/d;->c:Lb/a/a/a/a/e/d$b;

    iget-object v1, p0, Lb/a/a/a/a/e/d;->a:Ljava/net/URL;

    invoke-interface {v0, v1}, Lb/a/a/a/a/e/d$b;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1355
    :catch_0
    move-exception v0

    .line 1356
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private f()Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 1682
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->b()I

    move-result v0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_2

    .line 1684
    :try_start_0
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1698
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lb/a/a/a/a/e/d;->i:Z

    if-eqz v1, :cond_1

    const-string v1, "gzip"

    const-string v2, "Content-Encoding"

    invoke-virtual {p0, v2}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1702
    :cond_1
    :goto_1
    return-object v0

    .line 1685
    :catch_0
    move-exception v0

    .line 1686
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 1689
    :cond_2
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 1690
    if-nez v0, :cond_0

    .line 1692
    :try_start_1
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 1693
    :catch_1
    move-exception v0

    .line 1694
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 1702
    :cond_3
    :try_start_2
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v1

    goto :goto_1

    .line 1703
    :catch_2
    move-exception v0

    .line 1704
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private g()Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2462
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    if-nez v0, :cond_0

    .line 2475
    :goto_0
    return-object p0

    .line 2464
    :cond_0
    iget-boolean v0, p0, Lb/a/a/a/a/e/d;->g:Z

    if-eqz v0, :cond_1

    .line 2465
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    const-string v1, "\r\n--00content0boundary00--\r\n"

    invoke-virtual {v0, v1}, Lb/a/a/a/a/e/d$e;->a(Ljava/lang/String;)Lb/a/a/a/a/e/d$e;

    .line 2466
    :cond_1
    iget-boolean v0, p0, Lb/a/a/a/a/e/d;->h:Z

    if-eqz v0, :cond_2

    .line 2468
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    invoke-virtual {v0}, Lb/a/a/a/a/e/d$e;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2474
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    goto :goto_0

    .line 2473
    :cond_2
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    invoke-virtual {v0}, Lb/a/a/a/a/e/d$e;->close()V

    goto :goto_1

    .line 2471
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private h()Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2487
    :try_start_0
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->g()Lb/a/a/a/a/e/d;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 2488
    :catch_0
    move-exception v0

    .line 2489
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method private i()Lb/a/a/a/a/e/d;
    .locals 4

    .prologue
    .line 2500
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    if-eqz v0, :cond_0

    .line 2505
    :goto_0
    return-object p0

    .line 2502
    :cond_0
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 2503
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "charset"

    invoke-static {v0, v1}, Lb/a/a/a/a/e/d;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2504
    new-instance v1, Lb/a/a/a/a/e/d$e;

    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget v3, p0, Lb/a/a/a/a/e/d;->j:I

    invoke-direct {v1, v2, v0, v3}, Lb/a/a/a/a/e/d$e;-><init>(Ljava/io/OutputStream;Ljava/lang/String;I)V

    iput-object v1, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    goto :goto_0
.end method

.method private j()Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2515
    iget-boolean v0, p0, Lb/a/a/a/a/e/d;->g:Z

    if-nez v0, :cond_0

    .line 2516
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/a/a/a/e/d;->g:Z

    .line 2517
    const-string v0, "multipart/form-data; boundary=00content0boundary00"

    const-string v1, "Content-Type"

    invoke-virtual {p0, v1, v0}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v0

    invoke-direct {v0}, Lb/a/a/a/a/e/d;->i()Lb/a/a/a/a/e/d;

    .line 2518
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    const-string v1, "--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lb/a/a/a/a/e/d$e;->a(Ljava/lang/String;)Lb/a/a/a/a/e/d$e;

    .line 2521
    :goto_0
    return-object p0

    .line 2520
    :cond_0
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    const-string v1, "\r\n--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lb/a/a/a/a/e/d$e;->a(Ljava/lang/String;)Lb/a/a/a/a/e/d$e;

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Number;)Lb/a/a/a/a/e/d;
    .locals 1

    .prologue
    .line 2614
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lb/a/a/a/a/e/d;->d(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    .locals 1

    .prologue
    .line 1882
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1883
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lb/a/a/a/a/e/d;
    .locals 3

    .prologue
    .line 2668
    const/4 v2, 0x0

    .line 2670
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2671
    :try_start_1
    invoke-virtual {p0, p1, p2, p3, v1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lb/a/a/a/a/e/d;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 2675
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2679
    :goto_0
    return-object v0

    .line 2672
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 2673
    :goto_1
    :try_start_3
    new-instance v2, Lb/a/a/a/a/e/d$c;

    invoke-direct {v2, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2675
    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v1, :cond_0

    .line 2677
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 2679
    :cond_0
    :goto_3
    throw v0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_3

    .line 2675
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_2

    .line 2672
    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lb/a/a/a/a/e/d;
    .locals 2

    .prologue
    .line 2709
    :try_start_0
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->j()Lb/a/a/a/a/e/d;

    .line 2710
    invoke-direct {p0, p1, p2, p3}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    .line 2711
    iget-object v0, p0, Lb/a/a/a/a/e/d;->f:Lb/a/a/a/a/e/d$e;

    invoke-direct {p0, p4, v0}, Lb/a/a/a/a/e/d;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)Lb/a/a/a/a/e/d;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2715
    return-object p0

    .line 2712
    :catch_0
    move-exception v0

    .line 2713
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1929
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->h()Lb/a/a/a/a/e/d;

    .line 1930
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 1371
    iget-object v0, p0, Lb/a/a/a/a/e/d;->d:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 1372
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->e()Ljava/net/HttpURLConnection;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/e/d;->d:Ljava/net/HttpURLConnection;

    .line 1373
    :cond_0
    iget-object v0, p0, Lb/a/a/a/a/e/d;->d:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 1406
    :try_start_0
    invoke-direct {p0}, Lb/a/a/a/a/e/d;->g()Lb/a/a/a/a/e/d;

    .line 1407
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1408
    :catch_0
    move-exception v0

    .line 1409
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    .locals 1

    .prologue
    .line 2580
    invoke-direct {p0, p1, p2}, Lb/a/a/a/a/e/d;->d(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1608
    const-string v0, "Content-Type"

    const-string v1, "charset"

    invoke-virtual {p0, v0}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lb/a/a/a/a/e/d;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb/a/a/a/a/e/d;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2988
    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lb/a/a/a/a/e/d;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
