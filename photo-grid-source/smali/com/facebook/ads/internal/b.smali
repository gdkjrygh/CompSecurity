.class public Lcom/facebook/ads/internal/b;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/facebook/ads/internal/AdErrorType;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/ads/internal/AdErrorType;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/facebook/ads/internal/util/s;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/ads/internal/AdErrorType;->getDefaultErrorMessage()Ljava/lang/String;

    move-result-object p2

    :cond_0
    iput-object p1, p0, Lcom/facebook/ads/internal/b;->a:Lcom/facebook/ads/internal/AdErrorType;

    iput-object p2, p0, Lcom/facebook/ads/internal/b;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error code ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/ads/internal/AdErrorType;->getErrorCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->d(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ads/internal/AdErrorType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/b;->a:Lcom/facebook/ads/internal/AdErrorType;

    return-object v0
.end method

.method public b()Lcom/facebook/ads/AdError;
    .locals 3

    iget-object v0, p0, Lcom/facebook/ads/internal/b;->a:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/AdErrorType;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/ads/AdError;

    iget-object v1, p0, Lcom/facebook/ads/internal/b;->a:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/AdErrorType;->getErrorCode()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/ads/internal/b;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/AdError;-><init>(ILjava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/ads/AdError;

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->UNKNOWN_ERROR:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/AdErrorType;->getErrorCode()I

    move-result v1

    sget-object v2, Lcom/facebook/ads/internal/AdErrorType;->UNKNOWN_ERROR:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v2}, Lcom/facebook/ads/internal/AdErrorType;->getDefaultErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/AdError;-><init>(ILjava/lang/String;)V

    goto :goto_0
.end method
