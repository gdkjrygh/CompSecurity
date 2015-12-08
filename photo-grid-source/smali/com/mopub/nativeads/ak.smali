.class final Lcom/mopub/nativeads/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/c;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/NativeResponse;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/mopub/nativeads/ak;->a:Lcom/mopub/nativeads/NativeResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/mopub/nativeads/ak;->a:Lcom/mopub/nativeads/NativeResponse;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/NativeResponse;->handleClick(Landroid/view/View;)V

    .line 118
    return-void
.end method

.method public final onAdImpressed()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/mopub/nativeads/ak;->a:Lcom/mopub/nativeads/NativeResponse;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/NativeResponse;->recordImpression(Landroid/view/View;)V

    .line 113
    return-void
.end method
