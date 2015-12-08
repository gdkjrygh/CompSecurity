.class public Lcom/mopub/mraid/MraidBridge$MraidWebView;
.super Lcom/mopub/mobileads/BaseWebView;
.source "SourceFile"


# instance fields
.field private b:Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 242
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/BaseWebView;-><init>(Landroid/content/Context;)V

    .line 243
    invoke-virtual {p0}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->c:Z

    .line 244
    return-void

    .line 243
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a(Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->b:Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;

    .line 248
    return-void
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 263
    iget-boolean v0, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->c:Z

    return v0
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 252
    invoke-super {p0, p1, p2}, Lcom/mopub/mobileads/BaseWebView;->onVisibilityChanged(Landroid/view/View;I)V

    .line 253
    if-nez p2, :cond_1

    const/4 v0, 0x1

    .line 254
    :goto_0
    iget-boolean v1, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->c:Z

    if-eq v0, v1, :cond_0

    .line 255
    iput-boolean v0, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->c:Z

    .line 256
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->b:Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->b:Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;

    iget-boolean v1, p0, Lcom/mopub/mraid/MraidBridge$MraidWebView;->c:Z

    invoke-interface {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;->onVisibilityChanged(Z)V

    .line 260
    :cond_0
    return-void

    .line 253
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
