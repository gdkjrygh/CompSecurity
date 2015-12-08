.class public abstract Lcom/mopub/network/BackoffPolicy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract backoff(Lcom/mopub/volley/VolleyError;)V
.end method

.method public getBackoffMs()I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->a:I

    return v0
.end method

.method public getRetryCount()I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->d:I

    return v0
.end method

.method public hasAttemptRemaining()Z
    .locals 2

    .prologue
    .line 41
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->d:I

    iget v1, p0, Lcom/mopub/network/BackoffPolicy;->e:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
