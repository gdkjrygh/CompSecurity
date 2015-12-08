.class public final Lcom/squareup/okhttp/internal/http/RawHeaders;
.super Ljava/lang/Object;
.source "RawHeaders.java"


# static fields
.field private static final FIELD_NAME_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private httpMinorVersion:I

.field private final namesAndValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private requestLine:Ljava/lang/String;

.field private responseCode:I

.field private responseMessage:Ljava/lang/String;

.field private statusLine:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders$1;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders$1;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/http/RawHeaders;->FIELD_NAME_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    .line 72
    const/4 v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    .line 73
    const/4 v0, -0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    .line 77
    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V
    .locals 2
    .param p1, "copyFrom"    # Lcom/squareup/okhttp/internal/http/RawHeaders;

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    .line 72
    const/4 v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    .line 73
    const/4 v0, -0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    .line 80
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    iget-object v1, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 81
    iget-object v0, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    .line 82
    iget-object v0, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    .line 83
    iget v0, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    .line 84
    iget v0, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    .line 85
    iget-object v0, p1, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseMessage:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseMessage:Ljava/lang/String;

    .line 86
    return-void
.end method

.method private addLenient(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "fieldName"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 196
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    return-void
.end method

.method public static fromBytes(Ljava/io/InputStream;)Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 3
    .param p0, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 310
    :cond_0
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 311
    .local v0, "headers":Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setStatusLine(Ljava/lang/String;)V

    .line 312
    invoke-static {p0, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->readHeaders(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 313
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v1

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    .line 314
    return-object v0
.end method

.method public static fromMultimap(Ljava/util/Map;Z)Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 8
    .param p1, "response"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;Z)",
            "Lcom/squareup/okhttp/internal/http/RawHeaders;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 359
    .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    if-nez p1, :cond_0

    new-instance v5, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v5}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v5

    .line 360
    :cond_0
    new-instance v2, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 361
    .local v2, "result":Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 362
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 363
    .local v1, "fieldName":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 364
    .local v4, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v1, :cond_2

    .line 365
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 366
    .local v3, "value":Ljava/lang/String;
    invoke-direct {v2, v1, v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLenient(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 368
    .end local v3    # "value":Ljava/lang/String;
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 369
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setStatusLine(Ljava/lang/String;)V

    goto :goto_0

    .line 372
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .end local v1    # "fieldName":Ljava/lang/String;
    .end local v4    # "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_3
    return-object v2
.end method

.method public static fromNameValueBlock(Ljava/util/List;)Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/squareup/okhttp/internal/http/RawHeaders;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 416
    .local p0, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v9

    rem-int/lit8 v9, v9, 0x2

    if-eqz v9, :cond_0

    .line 417
    new-instance v9, Ljava/lang/IllegalArgumentException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Unexpected name value block: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 419
    :cond_0
    const/4 v5, 0x0

    .line 420
    .local v5, "status":Ljava/lang/String;
    const/4 v8, 0x0

    .line 421
    .local v8, "version":Ljava/lang/String;
    new-instance v3, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 422
    .local v3, "result":Lcom/squareup/okhttp/internal/http/RawHeaders;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v9

    if-ge v1, v9, :cond_5

    .line 423
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 424
    .local v2, "name":Ljava/lang/String;
    add-int/lit8 v9, v1, 0x1

    invoke-interface {p0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 425
    .local v7, "values":Ljava/lang/String;
    const/4 v4, 0x0

    .local v4, "start":I
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v4, v9, :cond_4

    .line 426
    const/4 v9, 0x0

    invoke-virtual {v7, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 427
    .local v0, "end":I
    const/4 v9, -0x1

    if-ne v0, v9, :cond_1

    .line 428
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    .line 430
    :cond_1
    invoke-virtual {v7, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 431
    .local v6, "value":Ljava/lang/String;
    const-string v9, ":status"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 432
    move-object v5, v6

    .line 439
    :goto_2
    add-int/lit8 v4, v0, 0x1

    .line 440
    goto :goto_1

    .line 433
    :cond_2
    const-string v9, ":version"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 434
    move-object v8, v6

    goto :goto_2

    .line 436
    :cond_3
    iget-object v9, v3, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    iget-object v9, v3, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 422
    .end local v0    # "end":I
    .end local v6    # "value":Ljava/lang/String;
    :cond_4
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 442
    .end local v2    # "name":Ljava/lang/String;
    .end local v4    # "start":I
    .end local v7    # "values":Ljava/lang/String;
    :cond_5
    if-nez v5, :cond_6

    new-instance v9, Ljava/net/ProtocolException;

    const-string v10, "Expected \':status\' header not present"

    invoke-direct {v9, v10}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 443
    :cond_6
    if-nez v8, :cond_7

    new-instance v9, Ljava/net/ProtocolException;

    const-string v10, "Expected \':version\' header not present"

    invoke-direct {v9, v10}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 444
    :cond_7
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setStatusLine(Ljava/lang/String;)V

    .line 445
    return-object v3
.end method

.method public static readHeaders(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/http/RawHeaders;)V
    .locals 2
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "out"    # Lcom/squareup/okhttp/internal/http/RawHeaders;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 321
    :goto_0
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .local v0, "line":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 322
    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLine(Ljava/lang/String;)V

    goto :goto_0

    .line 324
    :cond_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "fieldName"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 183
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fieldname == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 184
    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v1, :cond_3

    .line 186
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected header: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLenient(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    return-void
.end method

.method public addAll(Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .param p1, "fieldName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 210
    .local p2, "headerFields":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 211
    .local v0, "value":Ljava/lang/String;
    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 213
    .end local v0    # "value":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public addLine(Ljava/lang/String;)V
    .locals 3
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 171
    const-string v1, ":"

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 172
    .local v0, "index":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 173
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLenient(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    :goto_0
    return-void

    .line 174
    :cond_0
    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 175
    const-string v1, ""

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLenient(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 177
    :cond_1
    const-string v1, ""

    invoke-direct {p0, v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addLenient(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public addSpdyRequestHeaders(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "path"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "host"    # Ljava/lang/String;
    .param p5, "scheme"    # Ljava/lang/String;

    .prologue
    .line 136
    const-string v0, ":method"

    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, ":scheme"

    invoke-virtual {p0, v0, p5}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, ":path"

    invoke-virtual {p0, v0, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, ":version"

    invoke-virtual {p0, v0, p3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, ":host"

    invoke-virtual {p0, v0, p4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return-void
.end method

.method public get(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "fieldName"    # Ljava/lang/String;

    .prologue
    .line 258
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v0, v1, -0x2

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_1

    .line 259
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 260
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    add-int/lit8 v2, v0, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 263
    :goto_1
    return-object v1

    .line 258
    :cond_0
    add-int/lit8 v0, v0, -0x2

    goto :goto_0

    .line 263
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public getAll(Ljava/util/Set;)Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/squareup/okhttp/internal/http/RawHeaders;"
        }
    .end annotation

    .prologue
    .line 282
    .local p1, "fieldNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v2, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 283
    .local v2, "result":Lcom/squareup/okhttp/internal/http/RawHeaders;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 284
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 285
    .local v0, "fieldName":Ljava/lang/String;
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 286
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    add-int/lit8 v4, v1, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    :cond_0
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 289
    .end local v0    # "fieldName":Ljava/lang/String;
    :cond_1
    return-object v2
.end method

.method public getFieldName(I)Ljava/lang/String;
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 231
    mul-int/lit8 v0, p1, 0x2

    .line 232
    .local v0, "fieldNameIndex":I
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 233
    :cond_0
    const/4 v1, 0x0

    .line 235
    :goto_0
    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0
.end method

.method public getHttpMinorVersion()I
    .locals 2

    .prologue
    .line 152
    iget v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getResponseCode()I
    .locals 1

    .prologue
    .line 157
    iget v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    return v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusLine()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    return-object v0
.end method

.method public getValue(I)Ljava/lang/String;
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 249
    mul-int/lit8 v1, p1, 0x2

    add-int/lit8 v0, v1, 0x1

    .line 250
    .local v0, "valueIndex":I
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 251
    :cond_0
    const/4 v1, 0x0

    .line 253
    :goto_0
    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0
.end method

.method public length()I
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public names()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 240
    new-instance v1, Ljava/util/TreeSet;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 241
    .local v1, "result":Ljava/util/TreeSet;, "Ljava/util/TreeSet<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 242
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 241
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 244
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    return-object v2
.end method

.method public removeAll(Ljava/lang/String;)V
    .locals 2
    .param p1, "fieldName"    # Ljava/lang/String;

    .prologue
    .line 201
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 202
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 203
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 204
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 201
    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 207
    :cond_1
    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "fieldName"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 220
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->removeAll(Ljava/lang/String;)V

    .line 221
    invoke-virtual {p0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    return-void
.end method

.method public setRequestLine(Ljava/lang/String;)V
    .locals 0
    .param p1, "requestLine"    # Ljava/lang/String;

    .prologue
    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 91
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setStatusLine(Ljava/lang/String;)V
    .locals 9
    .param p1, "statusLine"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v8, 0x20

    const/16 v7, 0xd

    const/16 v6, 0x9

    const/16 v5, 0xc

    .line 98
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseMessage:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 99
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "statusLine is already set"

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 103
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v7, :cond_2

    const/4 v1, 0x1

    .line 104
    .local v1, "hasMessage":Z
    :goto_0
    const-string v4, "HTTP/1."

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v4, v5, :cond_1

    const/16 v4, 0x8

    .line 106
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v8, :cond_1

    if-eqz v1, :cond_3

    .line 107
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v8, :cond_3

    .line 108
    :cond_1
    new-instance v4, Ljava/net/ProtocolException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected status line: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 103
    .end local v1    # "hasMessage":Z
    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 110
    .restart local v1    # "hasMessage":Z
    :cond_3
    const/4 v4, 0x7

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v2, v4, -0x30

    .line 111
    .local v2, "httpMinorVersion":I
    if-ltz v2, :cond_4

    if-le v2, v6, :cond_5

    .line 112
    :cond_4
    new-instance v4, Ljava/net/ProtocolException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected status line: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 116
    :cond_5
    const/16 v4, 0x9

    const/16 v5, 0xc

    :try_start_0
    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 120
    .local v3, "responseCode":I
    if-eqz v1, :cond_6

    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    iput-object v4, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseMessage:Ljava/lang/String;

    .line 121
    iput v3, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->responseCode:I

    .line 122
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    .line 123
    iput v2, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->httpMinorVersion:I

    .line 124
    return-void

    .line 117
    .end local v3    # "responseCode":I
    :catch_0
    move-exception v0

    .line 118
    .local v0, "e":Ljava/lang/NumberFormatException;
    new-instance v4, Ljava/net/ProtocolException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected status line: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 120
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    .restart local v3    # "responseCode":I
    :cond_6
    const-string v4, ""

    goto :goto_1
.end method

.method public toBytes()[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 294
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 295
    .local v1, "result":Ljava/lang/StringBuilder;
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\r\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 297
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    .line 298
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    add-int/lit8 v4, v0, 0x1

    .line 299
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\r\n"

    .line 300
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 302
    :cond_0
    const-string v2, "\r\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ISO-8859-1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    return-object v2
.end method

.method public toMultimap(Z)Ljava/util/Map;
    .locals 9
    .param p1, "response"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 331
    new-instance v4, Ljava/util/TreeMap;

    sget-object v6, Lcom/squareup/okhttp/internal/http/RawHeaders;->FIELD_NAME_COMPARATOR:Ljava/util/Comparator;

    invoke-direct {v4, v6}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 332
    .local v4, "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_1

    .line 333
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 334
    .local v1, "fieldName":Ljava/lang/String;
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    add-int/lit8 v7, v2, 0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 336
    .local v5, "value":Ljava/lang/String;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .local v0, "allValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 338
    .local v3, "otherValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v3, :cond_0

    .line 339
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 341
    :cond_0
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v4, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 344
    .end local v0    # "allValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v1    # "fieldName":Ljava/lang/String;
    .end local v3    # "otherValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v5    # "value":Ljava/lang/String;
    :cond_1
    if-eqz p1, :cond_3

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 345
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->statusLine:Ljava/lang/String;

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v4, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    :cond_2
    :goto_1
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    return-object v6

    .line 346
    :cond_3
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 347
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->requestLine:Ljava/lang/String;

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v4, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public toNameValueBlock()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 381
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 382
    .local v3, "names":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .local v4, "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v0, v6, :cond_4

    .line 384
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 385
    .local v2, "name":Ljava/lang/String;
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/RawHeaders;->namesAndValues:Ljava/util/List;

    add-int/lit8 v7, v0, 0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 388
    .local v5, "value":Ljava/lang/String;
    const-string v6, "connection"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "host"

    .line 389
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "keep-alive"

    .line 390
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "proxy-connection"

    .line 391
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "transfer-encoding"

    .line 392
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 383
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 397
    :cond_1
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 398
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 399
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 404
    :cond_2
    const/4 v1, 0x0

    .local v1, "j":I
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_0

    .line 405
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 406
    add-int/lit8 v7, v1, 0x1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v6, v1, 0x1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "\u0000"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v7, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 404
    :cond_3
    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 411
    .end local v1    # "j":I
    .end local v2    # "name":Ljava/lang/String;
    .end local v5    # "value":Ljava/lang/String;
    :cond_4
    return-object v4
.end method

.method public values(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 268
    const/4 v1, 0x0

    .line 269
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 270
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 271
    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    .end local v1    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .restart local v1    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_0
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 275
    :cond_2
    if-eqz v1, :cond_3

    .line 276
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 277
    :goto_1
    return-object v2

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_1
.end method
