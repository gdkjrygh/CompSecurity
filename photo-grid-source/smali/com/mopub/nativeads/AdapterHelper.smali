.class public final Lcom/mopub/nativeads/AdapterHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const-string v0, "Context cannot be null."

    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    instance-of v0, p1, Landroid/app/Activity;

    const-string v3, "Context must be an Activity."

    invoke-static {v0, v3}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    .line 33
    if-ltz p2, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "start position must be non-negative"

    invoke-static {v0, v3}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    .line 34
    const/4 v0, 0x2

    if-lt p3, v0, :cond_1

    :goto_1
    const-string v0, "interval must be at least 2"

    invoke-static {v1, v0}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    .line 36
    new-instance v1, Ljava/lang/ref/WeakReference;

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/mopub/nativeads/AdapterHelper;->a:Ljava/lang/ref/WeakReference;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/AdapterHelper;->b:Landroid/content/Context;

    .line 38
    iput p2, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    .line 39
    iput p3, p0, Lcom/mopub/nativeads/AdapterHelper;->d:I

    .line 40
    return-void

    :cond_0
    move v0, v2

    .line 33
    goto :goto_0

    :cond_1
    move v1, v2

    .line 34
    goto :goto_1
.end method


# virtual methods
.method public final getAdView(Landroid/view/View;Landroid/view/ViewGroup;Lcom/mopub/nativeads/NativeResponse;Lcom/mopub/nativeads/ViewBinder;Lcom/mopub/nativeads/MoPubNative$MoPubNativeListener;)Landroid/view/View;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/mopub/nativeads/AdapterHelper;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 50
    if-nez v0, :cond_0

    .line 51
    const-string v0, "Weak reference to Activity Context in AdapterHelper became null. Returning empty view."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    .line 53
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/mopub/nativeads/AdapterHelper;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 56
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1, p2, v0, p3, p4}, Lcom/mopub/nativeads/ai;->a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/content/Context;Lcom/mopub/nativeads/NativeResponse;Lcom/mopub/nativeads/ViewBinder;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final isAdPosition(I)Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 79
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    if-ge p1, v1, :cond_1

    .line 83
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    sub-int v1, p1, v1

    iget v2, p0, Lcom/mopub/nativeads/AdapterHelper;->d:I

    rem-int/2addr v1, v2

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final shiftedCount(I)I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 68
    .line 1102
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    if-gt p1, v0, :cond_0

    .line 1103
    const/4 v0, 0x0

    .line 68
    :goto_0
    add-int/2addr v0, p1

    return v0

    .line 1106
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->d:I

    add-int/lit8 v0, v0, -0x1

    .line 1107
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    sub-int v1, p1, v1

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 1109
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    sub-int v1, p1, v1

    div-int v0, v1, v0

    goto :goto_0

    .line 1112
    :cond_1
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    sub-int v1, p1, v1

    int-to-double v2, v1

    int-to-double v0, v0

    div-double v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final shiftedPosition(I)I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 74
    .line 2090
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    if-gt p1, v0, :cond_0

    .line 2091
    const/4 v0, 0x0

    .line 74
    :goto_0
    sub-int v0, p1, v0

    return v0

    .line 2095
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->c:I

    sub-int v0, p1, v0

    int-to-double v0, v0

    iget v2, p0, Lcom/mopub/nativeads/AdapterHelper;->d:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
