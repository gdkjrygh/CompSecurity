.class final Lcom/mopub/mraid/l;
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
    .line 257
    iput-object p1, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClose()V
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->d()V

    .line 300
    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->a(Landroid/webkit/ConsoleMessage;)Z

    move-result v0

    return v0
.end method

.method public final onExpand(Ljava/net/URI;Z)V
    .locals 0

    .prologue
    .line 295
    return-void
.end method

.method public final onJsAlert(Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->a(Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0
.end method

.method public final onOpen(Ljava/net/URI;)V
    .locals 2

    .prologue
    .line 315
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->b(Ljava/lang/String;)V

    .line 316
    return-void
.end method

.method public final onPageFailedToLoad()V
    .locals 0

    .prologue
    .line 266
    return-void
.end method

.method public final onPageLoaded()V
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->b()V

    .line 261
    return-void
.end method

.method public final onPlayVideo(Ljava/net/URI;)V
    .locals 2

    .prologue
    .line 320
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->a(Ljava/lang/String;)V

    .line 321
    return-void
.end method

.method public final onResize(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V
    .locals 2

    .prologue
    .line 289
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Not allowed to resize from an expanded state"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onSetOrientationProperties(ZLcom/mopub/mraid/ag;)V
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/mraid/MraidController;->a(ZLcom/mopub/mraid/ag;)V

    .line 311
    return-void
.end method

.method public final onUseCustomClose(Z)V
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->a(Z)V

    .line 305
    return-void
.end method

.method public final onVisibilityChanged(Z)V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->c(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidBridge;->a(Z)V

    .line 272
    iget-object v0, p0, Lcom/mopub/mraid/l;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->b(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidBridge;->a(Z)V

    .line 273
    return-void
.end method
