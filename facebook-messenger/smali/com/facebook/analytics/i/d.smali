.class public Lcom/facebook/analytics/i/d;
.super Ljava/lang/Object;
.source "NetworkDataLogUtils.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/facebook/analytics/i/d;

    sput-object v0, Lcom/facebook/analytics/i/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/http/HttpMessage;)J
    .locals 5

    .prologue
    .line 80
    const-wide/16 v0, 0x0

    .line 81
    invoke-interface {p1}, Lorg/apache/http/HttpMessage;->headerIterator()Lorg/apache/http/HeaderIterator;

    move-result-object v2

    .line 82
    :goto_0
    invoke-interface {v2}, Lorg/apache/http/HeaderIterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    invoke-interface {v2}, Lorg/apache/http/HeaderIterator;->nextHeader()Lorg/apache/http/Header;

    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    return-wide v0
.end method

.method public a(Lorg/apache/http/HttpRequest;)J
    .locals 7

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/i/d;->a(Lorg/apache/http/HttpMessage;)J

    move-result-wide v1

    .line 31
    instance-of v0, p1, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 32
    check-cast v0, Lorg/apache/http/HttpEntityEnclosingRequest;

    invoke-interface {v0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v3

    .line 35
    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    .line 37
    add-long v0, v1, v3

    .line 42
    :goto_0
    invoke-interface {p1}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 47
    :cond_0
    return-wide v0

    :cond_1
    move-wide v0, v1

    goto :goto_0
.end method

.method public a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 57
    const/4 v0, 0x0

    .line 60
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 61
    if-eqz v1, :cond_0

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 62
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 65
    :cond_0
    if-nez v0, :cond_1

    .line 66
    const-string v1, "Content-Type"

    invoke-interface {p1, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 72
    :cond_1
    return-object v0
.end method

.method public b(Lorg/apache/http/HttpMessage;)J
    .locals 10

    .prologue
    const-wide/16 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 95
    const-wide/16 v3, -0x1

    .line 96
    const-string v0, "Content-Length"

    invoke-interface {p1, v0}, Lorg/apache/http/HttpMessage;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v7

    .line 97
    if-eqz v7, :cond_1

    move v0, v1

    :goto_0
    array-length v8, v7

    if-lez v8, :cond_2

    :goto_1
    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    .line 99
    array-length v3, v7

    move-wide v0, v5

    :goto_2
    if-ge v2, v3, :cond_4

    aget-object v4, v7, v2

    .line 100
    invoke-interface {v4}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v4

    .line 102
    if-eqz v4, :cond_0

    .line 104
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v8

    .line 105
    cmp-long v4, v8, v5

    if-lez v4, :cond_0

    .line 106
    add-long/2addr v0, v8

    .line 99
    :cond_0
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    move v0, v2

    .line 97
    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    .line 108
    :catch_0
    move-exception v4

    .line 109
    sget-object v8, Lcom/facebook/analytics/i/d;->a:Ljava/lang/Class;

    const-string v9, "Failure in getting content length from the header"

    invoke-static {v8, v9, v4}, Lcom/facebook/debug/log/f;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_3
    move-wide v0, v3

    .line 114
    :cond_4
    return-wide v0
.end method
