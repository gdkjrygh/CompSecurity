.class final Lcom/mopub/mraid/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;


# instance fields
.field final synthetic a:Lcom/mopub/mraid/MraidController;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidController;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClose()V
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->d()V

    .line 220
    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->a(Landroid/webkit/ConsoleMessage;)Z

    move-result v0

    return v0
.end method

.method public final onExpand(Ljava/net/URI;Z)V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->a(Ljava/net/URI;Z)V

    .line 232
    return-void
.end method

.method public final onJsAlert(Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->a(Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0
.end method

.method public final onOpen(Ljava/net/URI;)V
    .locals 2

    .prologue
    .line 247
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->b(Ljava/lang/String;)V

    .line 248
    return-void
.end method

.method public final onPageFailedToLoad()V
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->a(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidController$MraidListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->a(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidController$MraidListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mraid/MraidController$MraidListener;->onFailedToLoad()V

    .line 197
    :cond_0
    return-void
.end method

.method public final onPageLoaded()V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->a()V

    .line 190
    return-void
.end method

.method public final onPlayVideo(Ljava/net/URI;)V
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->a(Ljava/lang/String;)V

    .line 253
    return-void
.end method

.method public final onResize(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V
    .locals 7

    .prologue
    .line 226
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/mopub/mraid/MraidController;->a(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V

    .line 227
    return-void
.end method

.method public final onSetOrientationProperties(ZLcom/mopub/mraid/ag;)V
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->a(ZLcom/mopub/mraid/ag;)V

    .line 243
    return-void
.end method

.method public final onUseCustomClose(Z)V
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->a(Z)V

    .line 237
    return-void
.end method

.method public final onVisibilityChanged(Z)V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->b(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/mopub/mraid/k;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->c(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidBridge;->a(Z)V

    .line 205
    :cond_0
    return-void
.end method
