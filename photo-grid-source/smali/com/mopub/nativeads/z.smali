.class final Lcom/mopub/nativeads/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/MoPubStreamAdPlacer;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lcom/mopub/nativeads/z;->a:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/mopub/nativeads/z;->a:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    :goto_0
    return-void

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/z;->a:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V

    .line 162
    iget-object v0, p0, Lcom/mopub/nativeads/z;->a:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)Z

    goto :goto_0
.end method
