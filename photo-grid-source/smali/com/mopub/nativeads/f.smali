.class final Lcom/mopub/nativeads/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

.field final synthetic b:Lcom/mopub/nativeads/e;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/e;Lcom/mopub/nativeads/PositioningSource$PositioningListener;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/mopub/nativeads/f;->b:Lcom/mopub/nativeads/e;

    iput-object p2, p0, Lcom/mopub/nativeads/f;->a:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 25
    iget-object v0, p0, Lcom/mopub/nativeads/f;->a:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    iget-object v1, p0, Lcom/mopub/nativeads/f;->b:Lcom/mopub/nativeads/e;

    invoke-static {v1}, Lcom/mopub/nativeads/e;->a(Lcom/mopub/nativeads/e;)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/PositioningSource$PositioningListener;->onLoad(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    .line 26
    return-void
.end method
