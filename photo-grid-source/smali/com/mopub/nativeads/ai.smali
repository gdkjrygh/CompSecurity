.class final Lcom/mopub/nativeads/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field static final a:Ljava/util/WeakHashMap;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/content/Context;",
            "Lcom/mopub/nativeads/h;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/ai;->a:Ljava/util/WeakHashMap;

    .line 37
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/ai;->b:Ljava/util/WeakHashMap;

    return-void
.end method

.method static a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/content/Context;Lcom/mopub/nativeads/NativeResponse;Lcom/mopub/nativeads/ViewBinder;)Landroid/view/View;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 48
    const-string v0, "ViewBinder is null."

    invoke-static {p4, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 50
    if-eqz p0, :cond_0

    .line 1078
    invoke-static {p2}, Lcom/mopub/nativeads/ai;->a(Landroid/content/Context;)Lcom/mopub/nativeads/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;)V

    .line 1079
    sget-object v0, Lcom/mopub/nativeads/ai;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/NativeResponse;

    .line 1080
    if-eqz v0, :cond_0

    .line 1081
    invoke-virtual {v0, p0}, Lcom/mopub/nativeads/NativeResponse;->clear(Landroid/view/View;)V

    .line 54
    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p4, :cond_4

    .line 55
    :cond_1
    const-string v0, "nativeResponse or viewBinder null or invalid. Returning empty view"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 57
    if-eqz p0, :cond_2

    sget-object v0, Lcom/mopub/nativeads/aj;->EMPTY:Lcom/mopub/nativeads/aj;

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/aj;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 58
    :cond_2
    new-instance p0, Landroid/view/View;

    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 59
    sget-object v0, Lcom/mopub/nativeads/aj;->EMPTY:Lcom/mopub/nativeads/aj;

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 60
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 73
    :cond_3
    :goto_0
    return-object p0

    .line 63
    :cond_4
    new-instance v0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;

    invoke-direct {v0, p4}, Lcom/mopub/nativeads/MoPubNativeAdRenderer;-><init>(Lcom/mopub/nativeads/ViewBinder;)V

    .line 65
    if-eqz p0, :cond_5

    sget-object v1, Lcom/mopub/nativeads/aj;->AD:Lcom/mopub/nativeads/aj;

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mopub/nativeads/aj;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 66
    :cond_5
    invoke-virtual {v0, p2, p1}, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->createAdView(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    .line 67
    sget-object v1, Lcom/mopub/nativeads/aj;->AD:Lcom/mopub/nativeads/aj;

    invoke-virtual {p0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1088
    :cond_6
    sget-object v1, Lcom/mopub/nativeads/ai;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, p3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    invoke-virtual {p3}, Lcom/mopub/nativeads/NativeResponse;->isOverridingImpressionTracker()Z

    move-result v1

    if-nez v1, :cond_7

    .line 1090
    invoke-static {p2}, Lcom/mopub/nativeads/ai;->a(Landroid/content/Context;)Lcom/mopub/nativeads/h;

    move-result-object v1

    invoke-virtual {v1, p0, p3}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V

    .line 1092
    :cond_7
    invoke-virtual {p3, p0}, Lcom/mopub/nativeads/NativeResponse;->prepare(Landroid/view/View;)V

    .line 70
    invoke-virtual {v0, p0, p3}, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->renderAdView(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Lcom/mopub/nativeads/h;
    .locals 2

    .prologue
    .line 96
    sget-object v0, Lcom/mopub/nativeads/ai;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/h;

    .line 97
    if-nez v0, :cond_0

    .line 98
    new-instance v0, Lcom/mopub/nativeads/h;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/h;-><init>(Landroid/content/Context;)V

    .line 99
    sget-object v1, Lcom/mopub/nativeads/ai;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_0
    return-object v0
.end method
