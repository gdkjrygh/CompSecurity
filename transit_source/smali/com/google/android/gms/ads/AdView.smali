.class public final Lcom/google/android/gms/ads/AdView;
.super Landroid/view/ViewGroup;


# instance fields
.field private c:Lcom/google/android/gms/ads/AdSize;

.field private final dS:Lcom/google/android/gms/internal/av;

.field private dT:Lcom/google/android/gms/ads/AdListener;

.field private dU:Lcom/google/android/gms/internal/ac;

.field private dV:Ljava/lang/String;

.field private dW:Lcom/google/android/gms/ads/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/av;

    invoke-direct {v0}, Lcom/google/android/gms/internal/av;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/AdView;->dS:Lcom/google/android/gms/internal/av;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/google/android/gms/internal/av;

    invoke-direct {v0}, Lcom/google/android/gms/internal/av;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/AdView;->dS:Lcom/google/android/gms/internal/av;

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/aa;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/aa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aa;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aa;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/x;

    iget-object v1, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/x;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    const-string v1, "Ads by Google"

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/cm;->b(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/x;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/x;

    sget-object v2, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/x;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/cm;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/x;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/AdView;->d(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/x;

    iget-object v2, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/x;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/AdView;->dS:Lcom/google/android/gms/internal/av;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/u;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/av;)Lcom/google/android/gms/internal/ac;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dT:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/t;

    iget-object v2, p0, Lcom/google/android/gms/ads/AdView;->dT:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/t;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ab;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dW:Lcom/google/android/gms/ads/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/z;

    iget-object v2, p0, Lcom/google/android/gms/ads/AdView;->dW:Lcom/google/android/gms/ads/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/z;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ae;)V

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdView;->x()V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The ad size and ad unit ID must be set on AdView before "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private x()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ac;->z()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/dynamic/c;->b(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdView;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public destroy()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ac;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to destroy AdView."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dT:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public getAdSize()Lcom/google/android/gms/ads/AdSize;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;

    return-object v0
.end method

.method public loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 3
    .param p1, "adRequest"    # Lcom/google/android/gms/ads/AdRequest;

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/AdView;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/v;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/v;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdRequest;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dS:Lcom/google/android/gms/internal/av;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->v()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/av;->c(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 5
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    sub-int v3, p4, p2

    sub-int/2addr v3, v1

    div-int/lit8 v3, v3, 0x2

    sub-int v4, p5, p3

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v3

    add-int/2addr v2, v4

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_0

    invoke-virtual {p0, v2, p1, p2}, Lcom/google/android/gms/ads/AdView;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, p1}, Lcom/google/android/gms/ads/AdView;->resolveSize(II)I

    move-result v1

    invoke-static {v0, p2}, Lcom/google/android/gms/ads/AdView;->resolveSize(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/ads/AdView;->setMeasuredDimension(II)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method public pause()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ac;->pause()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call pause."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public resume()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ac;->resume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call resume."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/AdView;->dT:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/AdView;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/t;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/t;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ab;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setAdSize(Lcom/google/android/gms/ads/AdSize;)V
    .locals 2
    .param p1, "adSize"    # Lcom/google/android/gms/ads/AdSize;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/AdView;->c:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->requestLayout()V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/AdView;->dV:Ljava/lang/String;

    return-void
.end method
