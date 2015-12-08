.class public Lcom/mopub/nativeads/MoPubNativeAdRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/MoPubAdRenderer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mopub/nativeads/MoPubAdRenderer",
        "<",
        "Lcom/mopub/nativeads/NativeResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/WeakHashMap;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/ap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/mopub/nativeads/ViewBinder;


# direct methods
.method public constructor <init>(Lcom/mopub/nativeads/ViewBinder;)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->b:Lcom/mopub/nativeads/ViewBinder;

    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->a:Ljava/util/WeakHashMap;

    .line 34
    return-void
.end method


# virtual methods
.method public createAdView(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 39
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->b:Lcom/mopub/nativeads/ViewBinder;

    iget v1, v1, Lcom/mopub/nativeads/ViewBinder;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public renderAdView(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/ap;

    .line 48
    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->b:Lcom/mopub/nativeads/ViewBinder;

    invoke-static {p1, v0}, Lcom/mopub/nativeads/ap;->a(Landroid/view/View;Lcom/mopub/nativeads/ViewBinder;)Lcom/mopub/nativeads/ap;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_0
    invoke-virtual {v0, p2}, Lcom/mopub/nativeads/ap;->a(Lcom/mopub/nativeads/NativeResponse;)V

    .line 53
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->b:Lcom/mopub/nativeads/ViewBinder;

    invoke-static {p1, p2, v0}, Lcom/mopub/nativeads/ap;->a(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;Lcom/mopub/nativeads/ViewBinder;)V

    .line 54
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 55
    return-void
.end method

.method public bridge synthetic renderAdView(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 19
    check-cast p2, Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {p0, p1, p2}, Lcom/mopub/nativeads/MoPubNativeAdRenderer;->renderAdView(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V

    return-void
.end method
