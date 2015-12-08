.class public Lcom/mopub/volley/DefaultRetryPolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/RetryPolicy;


# static fields
.field public static final DEFAULT_BACKOFF_MULT:F = 1.0f

.field public static final DEFAULT_MAX_RETRIES:I = 0x1

.field public static final DEFAULT_TIMEOUT_MS:I = 0x9c4


# instance fields
.field private a:I

.field private b:I

.field private final c:I

.field private final d:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 48
    const/16 v0, 0x9c4

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/volley/DefaultRetryPolicy;-><init>(IIF)V

    .line 49
    return-void
.end method

.method public constructor <init>(IIF)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p1, p0, Lcom/mopub/volley/DefaultRetryPolicy;->a:I

    .line 59
    iput p2, p0, Lcom/mopub/volley/DefaultRetryPolicy;->c:I

    .line 60
    iput p3, p0, Lcom/mopub/volley/DefaultRetryPolicy;->d:F

    .line 61
    return-void
.end method


# virtual methods
.method public getBackoffMultiplier()F
    .locals 1

    .prologue
    .line 83
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->d:F

    return v0
.end method

.method public getCurrentRetryCount()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->b:I

    return v0
.end method

.method public getCurrentTimeout()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->a:I

    return v0
.end method

.method public retry(Lcom/mopub/volley/VolleyError;)V
    .locals 3

    .prologue
    .line 92
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->b:I

    .line 93
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->a:I

    int-to-float v0, v0

    iget v1, p0, Lcom/mopub/volley/DefaultRetryPolicy;->a:I

    int-to-float v1, v1

    iget v2, p0, Lcom/mopub/volley/DefaultRetryPolicy;->d:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->a:I

    .line 1103
    iget v0, p0, Lcom/mopub/volley/DefaultRetryPolicy;->b:I

    iget v1, p0, Lcom/mopub/volley/DefaultRetryPolicy;->c:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    .line 94
    :goto_0
    if-nez v0, :cond_1

    .line 95
    throw p1

    .line 1103
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 97
    :cond_1
    return-void
.end method
