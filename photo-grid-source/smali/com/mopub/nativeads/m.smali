.class final Lcom/mopub/nativeads/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/MoPubAdAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/mopub/nativeads/m;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdLoaded(I)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/mopub/nativeads/m;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->a(I)V

    .line 124
    return-void
.end method

.method public final onAdRemoved(I)V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/mopub/nativeads/m;->a:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->b(I)V

    .line 129
    return-void
.end method
