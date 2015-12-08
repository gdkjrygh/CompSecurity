.class public final Lcom/squareup/okhttp/internal/http/ResponseHeaders;
.super Ljava/lang/Object;
.source "ResponseHeaders.java"


# static fields
.field private static final RECEIVED_MILLIS:Ljava/lang/String;

.field static final RESPONSE_SOURCE:Ljava/lang/String;

.field static final SELECTED_TRANSPORT:Ljava/lang/String;

.field private static final SENT_MILLIS:Ljava/lang/String;


# instance fields
.field private ageSeconds:I

.field private connection:Ljava/lang/String;

.field private contentEncoding:Ljava/lang/String;

.field private contentLength:J

.field private contentType:Ljava/lang/String;

.field private etag:Ljava/lang/String;

.field private expires:Ljava/util/Date;

.field private final headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

.field private isPublic:Z

.field private lastModified:Ljava/util/Date;

.field private maxAgeSeconds:I

.field private mustRevalidate:Z

.field private noCache:Z

.field private noStore:Z

.field private receivedResponseMillis:J

.field private sMaxAgeSeconds:I

.field private sentRequestMillis:J

.field private servedDate:Ljava/util/Date;

.field private transferEncoding:Ljava/lang/String;

.field private final uri:Ljava/net/URI;

.field private varyFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/Platform;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-Sent-Millis"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->SENT_MILLIS:Ljava/lang/String;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/Platform;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-Received-Millis"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/Platform;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-Response-Source"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->RESPONSE_SOURCE:Ljava/lang/String;

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/Platform;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-Selected-Transport"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->SELECTED_TRANSPORT:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V
    .locals 10
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "headers"    # Lcom/squareup/okhttp/internal/http/RawHeaders;

    .prologue
    const/4 v5, -0x1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    .line 98
    iput v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sMaxAgeSeconds:I

    .line 110
    iput v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->ageSeconds:I

    .line 113
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v5

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    .line 117
    const-wide/16 v6, -0x1

    iput-wide v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentLength:J

    .line 122
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->uri:Ljava/net/URI;

    .line 123
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 125
    new-instance v1, Lcom/squareup/okhttp/internal/http/ResponseHeaders$1;

    invoke-direct {v1, p0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders$1;-><init>(Lcom/squareup/okhttp/internal/http/ResponseHeaders;)V

    .line 143
    .local v1, "handler":Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v5

    if-ge v2, v5, :cond_10

    .line 144
    invoke-virtual {p2, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v0

    .line 145
    .local v0, "fieldName":Ljava/lang/String;
    invoke-virtual {p2, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;

    move-result-object v3

    .line 146
    .local v3, "value":Ljava/lang/String;
    const-string v5, "Cache-Control"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 147
    invoke-static {v3, v1}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseCacheControl(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;)V

    .line 143
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 148
    :cond_1
    const-string v5, "Date"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 149
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    goto :goto_1

    .line 150
    :cond_2
    const-string v5, "Expires"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 151
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->expires:Ljava/util/Date;

    goto :goto_1

    .line 152
    :cond_3
    const-string v5, "Last-Modified"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 153
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    goto :goto_1

    .line 154
    :cond_4
    const-string v5, "ETag"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 155
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->etag:Ljava/lang/String;

    goto :goto_1

    .line 156
    :cond_5
    const-string v5, "Pragma"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 157
    const-string v5, "no-cache"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 158
    const/4 v5, 0x1

    iput-boolean v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noCache:Z

    goto :goto_1

    .line 160
    :cond_6
    const-string v5, "Age"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 161
    invoke-static {v3}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->ageSeconds:I

    goto :goto_1

    .line 162
    :cond_7
    const-string v5, "Vary"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 164
    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 165
    new-instance v5, Ljava/util/TreeSet;

    sget-object v6, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v5, v6}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    .line 167
    :cond_8
    const-string v5, ","

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v7, :cond_0

    aget-object v4, v6, v5

    .line 168
    .local v4, "varyField":Ljava/lang/String;
    iget-object v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 167
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 170
    .end local v4    # "varyField":Ljava/lang/String;
    :cond_9
    const-string v5, "Content-Encoding"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 171
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentEncoding:Ljava/lang/String;

    goto/16 :goto_1

    .line 172
    :cond_a
    const-string v5, "Transfer-Encoding"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 173
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->transferEncoding:Ljava/lang/String;

    goto/16 :goto_1

    .line 174
    :cond_b
    const-string v5, "Content-Length"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 176
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentLength:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 177
    :catch_0
    move-exception v5

    goto/16 :goto_1

    .line 179
    :cond_c
    const-string v5, "Content-Type"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 180
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentType:Ljava/lang/String;

    goto/16 :goto_1

    .line 181
    :cond_d
    const-string v5, "Connection"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 182
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->connection:Ljava/lang/String;

    goto/16 :goto_1

    .line 183
    :cond_e
    sget-object v5, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->SENT_MILLIS:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 184
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sentRequestMillis:J

    goto/16 :goto_1

    .line 185
    :cond_f
    sget-object v5, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 186
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    goto/16 :goto_1

    .line 189
    .end local v0    # "fieldName":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/String;
    :cond_10
    return-void
.end method

.method static synthetic access$002(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # Z

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noCache:Z

    return p1
.end method

.method static synthetic access$102(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # Z

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noStore:Z

    return p1
.end method

.method static synthetic access$202(Lcom/squareup/okhttp/internal/http/ResponseHeaders;I)I
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # I

    .prologue
    .line 35
    iput p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    return p1
.end method

.method static synthetic access$302(Lcom/squareup/okhttp/internal/http/ResponseHeaders;I)I
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # I

    .prologue
    .line 35
    iput p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sMaxAgeSeconds:I

    return p1
.end method

.method static synthetic access$402(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # Z

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isPublic:Z

    return p1
.end method

.method static synthetic access$502(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p1, "x1"    # Z

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->mustRevalidate:Z

    return p1
.end method

.method private computeAge(J)J
    .locals 13
    .param p1, "nowMillis"    # J

    .prologue
    const-wide/16 v0, 0x0

    .line 301
    iget-object v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    if-eqz v8, :cond_0

    iget-wide v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    iget-object v10, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    .line 302
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 303
    .local v0, "apparentReceivedAge":J
    :cond_0
    iget v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->ageSeconds:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v9, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->ageSeconds:I

    int-to-long v10, v9

    .line 304
    invoke-virtual {v8, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 306
    .local v2, "receivedAge":J
    :goto_0
    iget-wide v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    iget-wide v10, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sentRequestMillis:J

    sub-long v6, v8, v10

    .line 307
    .local v6, "responseDuration":J
    iget-wide v8, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    sub-long v4, p1, v8

    .line 308
    .local v4, "residentDuration":J
    add-long v8, v2, v6

    add-long/2addr v8, v4

    return-wide v8

    .end local v2    # "receivedAge":J
    .end local v4    # "residentDuration":J
    .end local v6    # "responseDuration":J
    :cond_1
    move-wide v2, v0

    .line 304
    goto :goto_0
.end method

.method private computeFreshnessLifetime()J
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    .line 316
    iget v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1

    .line 317
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    int-to-long v6, v5

    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    .line 331
    :cond_0
    :goto_0
    return-wide v4

    .line 318
    :cond_1
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->expires:Ljava/util/Date;

    if-eqz v6, :cond_4

    .line 319
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 320
    .local v2, "servedMillis":J
    :goto_1
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->expires:Ljava/util/Date;

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long v0, v6, v2

    .line 321
    .local v0, "delta":J
    cmp-long v6, v0, v4

    if-lez v6, :cond_3

    .end local v0    # "delta":J
    :goto_2
    move-wide v4, v0

    goto :goto_0

    .line 319
    .end local v2    # "servedMillis":J
    :cond_2
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    goto :goto_1

    .restart local v0    # "delta":J
    .restart local v2    # "servedMillis":J
    :cond_3
    move-wide v0, v4

    .line 321
    goto :goto_2

    .line 322
    .end local v0    # "delta":J
    .end local v2    # "servedMillis":J
    :cond_4
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->uri:Ljava/net/URI;

    invoke-virtual {v6}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_0

    .line 327
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 328
    .restart local v2    # "servedMillis":J
    :goto_3
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long v0, v2, v6

    .line 329
    .restart local v0    # "delta":J
    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    const-wide/16 v4, 0xa

    div-long v4, v0, v4

    goto :goto_0

    .line 327
    .end local v0    # "delta":J
    .end local v2    # "servedMillis":J
    :cond_5
    iget-wide v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sentRequestMillis:J

    goto :goto_3
.end method

.method private static isEndToEnd(Ljava/lang/String;)Z
    .locals 1
    .param p0, "fieldName"    # Ljava/lang/String;

    .prologue
    .line 503
    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    .line 504
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    .line 505
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    .line 506
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    .line 507
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    .line 508
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    .line 509
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    .line 510
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isFreshnessLifetimeHeuristic()Z
    .locals 2

    .prologue
    .line 340
    iget v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->expires:Ljava/util/Date;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public chooseResponseSource(JLcom/squareup/okhttp/internal/http/RequestHeaders;)Lcom/squareup/okhttp/ResponseSource;
    .locals 17
    .param p1, "nowMillis"    # J
    .param p3, "request"    # Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .prologue
    .line 399
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isCacheable(Lcom/squareup/okhttp/internal/http/RequestHeaders;)Z

    move-result v12

    if-nez v12, :cond_0

    .line 400
    sget-object v12, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    .line 445
    :goto_0
    return-object v12

    .line 403
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->isNoCache()Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->hasConditions()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 404
    :cond_1
    sget-object v12, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    goto :goto_0

    .line 407
    :cond_2
    invoke-direct/range {p0 .. p2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->computeAge(J)J

    move-result-wide v2

    .line 408
    .local v2, "ageMillis":J
    invoke-direct/range {p0 .. p0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->computeFreshnessLifetime()J

    move-result-wide v4

    .line 410
    .local v4, "freshMillis":J
    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMaxAgeSeconds()I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_3

    .line 411
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMaxAgeSeconds()I

    move-result v13

    int-to-long v14, v13

    invoke-virtual {v12, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 414
    :cond_3
    const-wide/16 v8, 0x0

    .line 415
    .local v8, "minFreshMillis":J
    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMinFreshSeconds()I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_4

    .line 416
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMinFreshSeconds()I

    move-result v13

    int-to-long v14, v13

    invoke-virtual {v12, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    .line 419
    :cond_4
    const-wide/16 v6, 0x0

    .line 420
    .local v6, "maxStaleMillis":J
    move-object/from16 v0, p0

    iget-boolean v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->mustRevalidate:Z

    if-nez v12, :cond_5

    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMaxStaleSeconds()I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_5

    .line 421
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getMaxStaleSeconds()I

    move-result v13

    int-to-long v14, v13

    invoke-virtual {v12, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    .line 424
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noCache:Z

    if-nez v12, :cond_8

    add-long v12, v2, v8

    add-long v14, v4, v6

    cmp-long v12, v12, v14

    if-gez v12, :cond_8

    .line 425
    add-long v12, v2, v8

    cmp-long v12, v12, v4

    if-ltz v12, :cond_6

    .line 426
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const-string v13, "Warning"

    const-string v14, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v12, v13, v14}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    :cond_6
    const-wide/32 v10, 0x5265c00

    .line 429
    .local v10, "oneDayMillis":J
    cmp-long v12, v2, v10

    if-lez v12, :cond_7

    invoke-direct/range {p0 .. p0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isFreshnessLifetimeHeuristic()Z

    move-result v12

    if-eqz v12, :cond_7

    .line 430
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const-string v13, "Warning"

    const-string v14, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v12, v13, v14}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    :cond_7
    sget-object v12, Lcom/squareup/okhttp/ResponseSource;->CACHE:Lcom/squareup/okhttp/ResponseSource;

    goto/16 :goto_0

    .line 435
    .end local v10    # "oneDayMillis":J
    :cond_8
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    if-eqz v12, :cond_b

    .line 436
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setIfModifiedSince(Ljava/util/Date;)V

    .line 441
    :cond_9
    :goto_1
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->etag:Ljava/lang/String;

    if-eqz v12, :cond_a

    .line 442
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->etag:Ljava/lang/String;

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setIfNoneMatch(Ljava/lang/String;)V

    .line 445
    :cond_a
    invoke-virtual/range {p3 .. p3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->hasConditions()Z

    move-result v12

    if-eqz v12, :cond_c

    sget-object v12, Lcom/squareup/okhttp/ResponseSource;->CONDITIONAL_CACHE:Lcom/squareup/okhttp/ResponseSource;

    goto/16 :goto_0

    .line 437
    :cond_b
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    if-eqz v12, :cond_9

    .line 438
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setIfModifiedSince(Ljava/util/Date;)V

    goto :goto_1

    .line 445
    :cond_c
    sget-object v12, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    goto/16 :goto_0
.end method

.method public combine(Lcom/squareup/okhttp/internal/http/ResponseHeaders;)Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .locals 6
    .param p1, "network"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 474
    new-instance v2, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 475
    .local v2, "result":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getStatusLine()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setStatusLine(Ljava/lang/String;)V

    .line 477
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v4

    if-ge v1, v4, :cond_3

    .line 478
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v0

    .line 479
    .local v0, "fieldName":Ljava/lang/String;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;

    move-result-object v3

    .line 480
    .local v3, "value":Ljava/lang/String;
    const-string v4, "Warning"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "1"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 477
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 483
    :cond_1
    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4, v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    .line 484
    :cond_2
    invoke-virtual {v2, v0, v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 488
    .end local v0    # "fieldName":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/String;
    :cond_3
    const/4 v1, 0x0

    :goto_2
    iget-object v4, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->length()I

    move-result v4

    if-ge v1, v4, :cond_5

    .line 489
    iget-object v4, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;

    move-result-object v0

    .line 490
    .restart local v0    # "fieldName":Ljava/lang/String;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isEndToEnd(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 491
    iget-object v4, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v4, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 495
    .end local v0    # "fieldName":Ljava/lang/String;
    :cond_5
    new-instance v4, Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->uri:Ljava/net/URI;

    invoke-direct {v4, v5, v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    return-object v4
.end method

.method public getConnection()Ljava/lang/String;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->connection:Ljava/lang/String;

    return-object v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentEncoding:Ljava/lang/String;

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    .prologue
    .line 270
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentLength:J

    return-wide v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public getEtag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->etag:Ljava/lang/String;

    return-object v0
.end method

.method public getExpires()Ljava/util/Date;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->expires:Ljava/util/Date;

    return-object v0
.end method

.method public getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    return-object v0
.end method

.method public getLastModified()Ljava/util/Date;
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    return-object v0
.end method

.method public getMaxAgeSeconds()I
    .locals 1

    .prologue
    .line 242
    iget v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->maxAgeSeconds:I

    return v0
.end method

.method public getSMaxAgeSeconds()I
    .locals 1

    .prologue
    .line 246
    iget v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sMaxAgeSeconds:I

    return v0
.end method

.method public getServedDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->servedDate:Ljava/util/Date;

    return-object v0
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->uri:Ljava/net/URI;

    return-object v0
.end method

.method public getVaryFields()Ljava/util/Set;
    .locals 1
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
    .line 262
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    return-object v0
.end method

.method public hasConnectionClose()Z
    .locals 2

    .prologue
    .line 210
    const-string v0, "close"

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->connection:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public hasVaryAll()Z
    .locals 2

    .prologue
    .line 377
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    const-string v1, "*"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isCacheable(Lcom/squareup/okhttp/internal/http/RequestHeaders;)Z
    .locals 4
    .param p1, "request"    # Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .prologue
    const/4 v1, 0x0

    .line 350
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v0

    .line 351
    .local v0, "responseCode":I
    const/16 v2, 0xc8

    if-eq v0, v2, :cond_1

    const/16 v2, 0xcb

    if-eq v0, v2, :cond_1

    const/16 v2, 0x12c

    if-eq v0, v2, :cond_1

    const/16 v2, 0x12d

    if-eq v0, v2, :cond_1

    const/16 v2, 0x19a

    if-eq v0, v2, :cond_1

    .line 369
    :cond_0
    :goto_0
    return v1

    .line 361
    :cond_1
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->hasAuthorization()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isPublic:Z

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->mustRevalidate:Z

    if-nez v2, :cond_2

    iget v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sMaxAgeSeconds:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 365
    :cond_2
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noStore:Z

    if-nez v2, :cond_0

    .line 369
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public isChunked()Z
    .locals 2

    .prologue
    .line 206
    const-string v0, "chunked"

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->transferEncoding:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isContentEncodingGzip()Z
    .locals 2

    .prologue
    .line 192
    const-string v0, "gzip"

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentEncoding:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isMustRevalidate()Z
    .locals 1

    .prologue
    .line 254
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->mustRevalidate:Z

    return v0
.end method

.method public isNoCache()Z
    .locals 1

    .prologue
    .line 234
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noCache:Z

    return v0
.end method

.method public isNoStore()Z
    .locals 1

    .prologue
    .line 238
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->noStore:Z

    return v0
.end method

.method public isPublic()Z
    .locals 1

    .prologue
    .line 250
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isPublic:Z

    return v0
.end method

.method public setLocalTimestamps(JJ)V
    .locals 3
    .param p1, "sentRequestMillis"    # J
    .param p3, "receivedResponseMillis"    # J

    .prologue
    .line 282
    iput-wide p1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->sentRequestMillis:J

    .line 283
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    sget-object v1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->SENT_MILLIS:Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    iput-wide p3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->receivedResponseMillis:J

    .line 285
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    sget-object v1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    return-void
.end method

.method public setResponseSource(Lcom/squareup/okhttp/ResponseSource;)V
    .locals 4
    .param p1, "responseSource"    # Lcom/squareup/okhttp/ResponseSource;

    .prologue
    .line 289
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    sget-object v1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->RESPONSE_SOURCE:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/squareup/okhttp/ResponseSource;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    return-void
.end method

.method public setTransport(Ljava/lang/String;)V
    .locals 2
    .param p1, "transport"    # Ljava/lang/String;

    .prologue
    .line 293
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    sget-object v1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->SELECTED_TRANSPORT:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    return-void
.end method

.method public stripContentEncoding()V
    .locals 2

    .prologue
    .line 196
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentEncoding:Ljava/lang/String;

    .line 197
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const-string v1, "Content-Encoding"

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->removeAll(Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method public stripContentLength()V
    .locals 2

    .prologue
    .line 201
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->contentLength:J

    .line 202
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->removeAll(Ljava/lang/String;)V

    .line 203
    return-void
.end method

.method public validate(Lcom/squareup/okhttp/internal/http/ResponseHeaders;)Z
    .locals 6
    .param p1, "networkResponse"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .prologue
    const/4 v0, 0x1

    .line 453
    iget-object v1, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->headers:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v1

    const/16 v2, 0x130

    if-ne v1, v2, :cond_1

    .line 466
    :cond_0
    :goto_0
    return v0

    .line 460
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    .line 462
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->lastModified:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    .line 466
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public varyMatches(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)Z"
        }
    .end annotation

    .prologue
    .line 386
    .local p1, "cachedRequest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .local p2, "newRequest":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->varyFields:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 387
    .local v0, "field":Ljava/lang/String;
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/Util;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 388
    const/4 v1, 0x0

    .line 391
    .end local v0    # "field":Ljava/lang/String;
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x1

    goto :goto_0
.end method
