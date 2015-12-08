.class Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;
.super Lorg/xwalk/core/internal/XWalkWebContentsDelegate;
.source "XWalkWebContentsDelegateAdapter.java"


# instance fields
.field private mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClient;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkContentsClient;

    .prologue
    .line 17
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkWebContentsDelegate;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    .line 19
    return-void
.end method


# virtual methods
.method public activateContents()V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onRequestFocus()V

    .line 47
    :cond_0
    return-void
.end method

.method public addNewContents(ZZ)Z
    .locals 1
    .param p1, "isDialog"    # Z
    .param p2, "isUserGesture"    # Z

    .prologue
    .line 36
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClient;->onCreateWindow(ZZ)Z

    move-result v0

    return v0
.end method

.method public closeContents()V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onCloseWindow()V

    .line 42
    :cond_0
    return-void
.end method

.method public handleKeyboardEvent(Landroid/view/KeyEvent;)V
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 62
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->onUnhandledKeyEvent(Landroid/view/KeyEvent;)V

    .line 63
    :cond_0
    return-void
.end method

.method public isFullscreen()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->hasEnteredFullscreen()Z

    move-result v0

    .line 78
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onLoadProgressChanged(I)V
    .locals 1
    .param p1, "progress"    # I

    .prologue
    .line 31
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->onProgressChanged(I)V

    .line 32
    :cond_0
    return-void
.end method

.method public rendererResponsive()V
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onRendererResponsive()V

    .line 57
    :cond_0
    return-void
.end method

.method public rendererUnresponsive()V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onRendererUnresponsive()V

    .line 52
    :cond_0
    return-void
.end method

.method public shouldOpenWithDefaultBrowser(Ljava/lang/String;)Z
    .locals 1
    .param p1, "contentUrl"    # Ljava/lang/String;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->shouldOpenWithDefaultBrowser(Ljava/lang/String;)Z

    move-result v0

    .line 26
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public shouldOverrideRunFileChooser(IIILjava/lang/String;Z)Z
    .locals 6
    .param p1, "processId"    # I
    .param p2, "renderId"    # I
    .param p3, "mode"    # I
    .param p4, "acceptTypes"    # Ljava/lang/String;
    .param p5, "capture"    # Z

    .prologue
    .line 84
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/xwalk/core/internal/XWalkContentsClient;->shouldOverrideRunFileChooser(IIILjava/lang/String;Z)Z

    move-result v0

    .line 88
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toggleFullscreen(Z)V
    .locals 2
    .param p1, "enterFullscreen"    # Z

    .prologue
    .line 67
    if-nez p1, :cond_0

    .line 68
    invoke-static {}, Lorg/chromium/content/browser/ContentVideoView;->getContentVideoView()Lorg/chromium/content/browser/ContentVideoView;

    move-result-object v0

    .line 69
    .local v0, "videoView":Lorg/chromium/content/browser/ContentVideoView;
    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->exitFullscreen(Z)V

    .line 71
    .end local v0    # "videoView":Lorg/chromium/content/browser/ContentVideoView;
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebContentsDelegateAdapter;->mXWalkContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->onToggleFullscreen(Z)V

    .line 72
    :cond_1
    return-void
.end method
