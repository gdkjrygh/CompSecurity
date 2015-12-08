.class public Lcom/mopub/network/ScribeBackoffPolicy;
.super Lcom/mopub/network/BackoffPolicy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mopub/network/ScribeBackoffPolicy;-><init>(B)V

    .line 18
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/mopub/network/BackoffPolicy;-><init>()V

    .line 22
    const v0, 0xea60

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->c:I

    .line 23
    const/4 v0, 0x5

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->e:I

    .line 24
    const/4 v0, 0x2

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->b:I

    .line 25
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 49
    iget v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->b:I

    int-to-double v0, v0

    iget v2, p0, Lcom/mopub/network/ScribeBackoffPolicy;->d:I

    int-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    .line 50
    iget v2, p0, Lcom/mopub/network/ScribeBackoffPolicy;->c:I

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->a:I

    .line 51
    iget v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->d:I

    .line 52
    return-void
.end method


# virtual methods
.method public backoff(Lcom/mopub/volley/VolleyError;)V
    .locals 3

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->hasAttemptRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    throw p1

    .line 33
    :cond_0
    instance-of v0, p1, Lcom/mopub/volley/NoConnectionError;

    if-eqz v0, :cond_1

    .line 34
    invoke-direct {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->a()V

    .line 42
    :goto_0
    return-void

    .line 38
    :cond_1
    iget-object v0, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    .line 39
    if-eqz v0, :cond_3

    iget v1, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v2, 0x1f7

    if-eq v1, v2, :cond_2

    iget v0, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v1, 0x1f8

    if-ne v0, v1, :cond_3

    .line 41
    :cond_2
    invoke-direct {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->a()V

    goto :goto_0

    .line 45
    :cond_3
    throw p1
.end method
