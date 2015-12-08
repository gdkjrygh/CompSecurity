.class abstract Lorg/xwalk/core/internal/XWalkContentsClient;
.super Lorg/chromium/content/browser/ContentViewClient;
.source "XWalkContentsClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "XWalkContentsClient"


# instance fields
.field private final mCallbackHelper:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

.field private mDIPScale:D

.field private mWebContentsObserver:Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Lorg/chromium/content/browser/ContentViewClient;-><init>()V

    .line 41
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;-><init>(Lorg/xwalk/core/internal/XWalkContentsClient;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mCallbackHelper:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    .line 48
    return-void
.end method


# virtual methods
.method public abstract didFinishLoad(Ljava/lang/String;)V
.end method

.method public abstract doUpdateVisitedHistory(Ljava/lang/String;Z)V
.end method

.method final getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mCallbackHelper:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    return-object v0
.end method

.method public abstract getVisitedHistory(Landroid/webkit/ValueCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback",
            "<[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract hasEnteredFullscreen()Z
.end method

.method installWebContentsObserver(Lorg/chromium/content_public/browser/WebContents;)V
    .locals 1
    .param p1, "webContents"    # Lorg/chromium/content_public/browser/WebContents;

    .prologue
    .line 102
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mWebContentsObserver:Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mWebContentsObserver:Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;->detachFromWebContents()V

    .line 105
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;

    invoke-direct {v0, p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;-><init>(Lorg/xwalk/core/internal/XWalkContentsClient;Lorg/chromium/content_public/browser/WebContents;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mWebContentsObserver:Lorg/xwalk/core/internal/XWalkContentsClient$XWalkWebContentsObserver;

    .line 106
    return-void
.end method

.method protected abstract onCloseWindow()V
.end method

.method public abstract onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
.end method

.method protected abstract onCreateWindow(ZZ)Z
.end method

.method public abstract onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract onFindResultReceived(IIZ)V
.end method

.method public abstract onFormResubmission(Landroid/os/Message;Landroid/os/Message;)V
.end method

.method public abstract onGeolocationPermissionsHidePrompt()V
.end method

.method public abstract onGeolocationPermissionsShowPrompt(Ljava/lang/String;Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;)V
.end method

.method public abstract onHideCustomView()V
.end method

.method public abstract onLoadResource(Ljava/lang/String;)V
.end method

.method public abstract onNewPicture(Landroid/graphics/Picture;)V
.end method

.method public abstract onPageFinished(Ljava/lang/String;)V
.end method

.method public abstract onPageStarted(Ljava/lang/String;)V
.end method

.method public abstract onProgressChanged(I)V
.end method

.method public abstract onReceivedError(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReceivedHttpAuthRequest(Lorg/xwalk/core/internal/XWalkHttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReceivedIcon(Landroid/graphics/Bitmap;)V
.end method

.method public abstract onReceivedLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReceivedSslError(Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onRendererResponsive()V
.end method

.method public abstract onRendererUnresponsive()V
.end method

.method protected abstract onRequestFocus()V
.end method

.method public abstract onResourceLoadFinished(Ljava/lang/String;)V
.end method

.method public abstract onResourceLoadStarted(Ljava/lang/String;)V
.end method

.method public final onScaleChanged(FF)V
    .locals 6
    .param p1, "oldScaleFactor"    # F
    .param p2, "newScaleFactor"    # F

    .prologue
    .line 158
    float-to-double v0, p1

    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mDIPScale:D

    mul-double/2addr v0, v2

    double-to-float v0, v0

    float-to-double v2, p2

    iget-wide v4, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mDIPScale:D

    mul-double/2addr v2, v4

    double-to-float v1, v2

    invoke-virtual {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkContentsClient;->onScaleChangedScaled(FF)V

    .line 159
    return-void
.end method

.method public abstract onScaleChangedScaled(FF)V
.end method

.method public onShowCustomView(Landroid/view/View;ILorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V
    .locals 0
    .param p1, "view"    # Landroid/view/View;
    .param p2, "requestedOrientation"    # I
    .param p3, "callback"    # Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .prologue
    .line 196
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "callback"    # Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .prologue
    .line 201
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Lorg/xwalk/core/internal/XWalkContentsClient;->onShowCustomView(Landroid/view/View;ILorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V

    .line 202
    return-void
.end method

.method protected abstract onStopLoading()V
.end method

.method public abstract onTitleChanged(Ljava/lang/String;)V
.end method

.method public abstract onToggleFullscreen(Z)V
.end method

.method public abstract onUnhandledKeyEvent(Landroid/view/KeyEvent;)V
.end method

.method public final onUpdateTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 93
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->onTitleChanged(Ljava/lang/String;)V

    .line 94
    return-void
.end method

.method setDIPScale(D)V
    .locals 1
    .param p1, "dipScale"    # D

    .prologue
    .line 109
    iput-wide p1, p0, Lorg/xwalk/core/internal/XWalkContentsClient;->mDIPScale:D

    .line 110
    return-void
.end method

.method public abstract shouldInterceptRequest(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
.end method

.method public abstract shouldOpenWithDefaultBrowser(Ljava/lang/String;)Z
.end method

.method public shouldOverrideKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 98
    invoke-super {p0, p1}, Lorg/chromium/content/browser/ContentViewClient;->shouldOverrideKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public abstract shouldOverrideRunFileChooser(IIILjava/lang/String;Z)Z
.end method

.method public abstract shouldOverrideUrlLoading(Ljava/lang/String;)Z
.end method
