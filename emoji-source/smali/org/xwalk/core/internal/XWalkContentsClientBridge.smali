.class Lorg/xwalk/core/internal/XWalkContentsClientBridge;
.super Lorg/xwalk/core/internal/XWalkContentsClient;
.source "XWalkContentsClientBridge.java"

# interfaces
.implements Lorg/chromium/content/browser/ContentViewDownloadDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# static fields
.field private static final NEW_ICON_DOWNLOAD:I = 0x65

.field private static final NEW_XWALKVIEW_CREATED:I = 0x64

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mDownloadListener:Lorg/xwalk/core/internal/DownloadListener;

.field private mFavicon:Landroid/graphics/Bitmap;

.field private mInterceptNavigationDelegate:Lorg/chromium/components/navigation_interception/InterceptNavigationDelegate;

.field private mIsFullscreen:Z

.field private mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

.field private mLoadingUrl:Ljava/lang/String;

.field private mNativeContentsClientBridge:J

.field private mNavigationHandler:Lorg/xwalk/core/internal/XWalkNavigationHandler;

.field private mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

.field private mPageLoadListener:Lorg/xwalk/core/internal/PageLoadListener;

.field private mPageScaleFactor:F

.field private mUiThreadHandler:Landroid/os/Handler;

.field private mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

.field private mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

.field private mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

.field private mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

.field private mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 1
    .param p1, "xwView"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 93
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClient;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mIsFullscreen:Z

    .line 63
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    .line 94
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 96
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;

    invoke-direct {v0, p0, p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;Lorg/xwalk/core/internal/XWalkContentsClient;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mInterceptNavigationDelegate:Lorg/chromium/components/navigation_interception/InterceptNavigationDelegate;

    .line 98
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mUiThreadHandler:Landroid/os/Handler;

    .line 124
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkNavigationHandler;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNavigationHandler:Lorg/xwalk/core/internal/XWalkNavigationHandler;

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkViewInternal;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    return-object v0
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)J
    .locals 2
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 40
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    return-wide v0
.end method

.method static synthetic access$300(Lorg/xwalk/core/internal/XWalkContentsClientBridge;JLjava/lang/String;)V
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .param p1, "x1"    # J
    .param p3, "x2"    # Ljava/lang/String;

    .prologue
    .line 40
    invoke-direct {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeDownloadIcon(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Landroid/os/Handler;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mUiThreadHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$500(Lorg/xwalk/core/internal/XWalkContentsClientBridge;JIII)V
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .param p1, "x1"    # J
    .param p3, "x2"    # I
    .param p4, "x3"    # I
    .param p5, "x4"    # I

    .prologue
    .line 40
    invoke-direct/range {p0 .. p5}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeOnFilesNotSelected(JIII)V

    return-void
.end method

.method static synthetic access$600(Lorg/xwalk/core/internal/XWalkContentsClientBridge;JIIILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .param p1, "x1"    # J
    .param p3, "x2"    # I
    .param p4, "x3"    # I
    .param p5, "x4"    # I
    .param p6, "x5"    # Ljava/lang/String;
    .param p7, "x6"    # Ljava/lang/String;

    .prologue
    .line 40
    invoke-direct/range {p0 .. p7}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeOnFilesSelected(JIIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700(Lorg/xwalk/core/internal/XWalkContentsClientBridge;ZI)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .param p1, "x1"    # Z
    .param p2, "x2"    # I

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->proceedSslError(ZI)V

    return-void
.end method

.method private allowCertificateError(I[BLjava/lang/String;I)Z
    .locals 4
    .param p1, "certError"    # I
    .param p2, "derBytes"    # [B
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 578
    invoke-static {p2}, Lorg/xwalk/core/internal/SslUtil;->getCertificateFromDerBytes([B)Landroid/net/http/SslCertificate;

    move-result-object v1

    .line 579
    .local v1, "cert":Landroid/net/http/SslCertificate;
    if-nez v1, :cond_0

    .line 581
    const/4 v3, 0x0

    .line 591
    :goto_0
    return v3

    .line 583
    :cond_0
    invoke-static {p1, v1, p3}, Lorg/xwalk/core/internal/SslUtil;->sslErrorFromNetErrorCode(ILandroid/net/http/SslCertificate;Ljava/lang/String;)Landroid/net/http/SslError;

    move-result-object v2

    .line 584
    .local v2, "sslError":Landroid/net/http/SslError;
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;

    invoke-direct {v0, p0, p4}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V

    .line 590
    .local v0, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    invoke-virtual {p0, v0, v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->onReceivedSslError(Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V

    .line 591
    const/4 v3, 0x1

    goto :goto_0
.end method

.method private cancelNotification(I)V
    .locals 1
    .param p1, "notificationId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 657
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0, p1}, Lorg/xwalk/core/internal/XWalkNotificationService;->cancelNotification(I)V

    .line 658
    return-void
.end method

.method private handleJsAlert(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 601
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 602
    new-instance v6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-direct {v6, p0, p3}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V

    .line 604
    .local v6, "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    sget-object v2, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_ALERT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v5, ""

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    .line 608
    .end local v6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    :cond_0
    return-void
.end method

.method private handleJsBeforeUnload(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 634
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 635
    new-instance v6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-direct {v6, p0, p3}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V

    .line 637
    .local v6, "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    sget-object v2, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_BEFOREUNLOAD:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v5, ""

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    .line 641
    .end local v6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    :cond_0
    return-void
.end method

.method private handleJsConfirm(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 612
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    new-instance v6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-direct {v6, p0, p3}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V

    .line 615
    .local v6, "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    sget-object v2, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_CONFIRM:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v5, ""

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    .line 619
    .end local v6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    :cond_0
    return-void
.end method

.method private handleJsPrompt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "defaultValue"    # Ljava/lang/String;
    .param p4, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 623
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 624
    new-instance v6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-direct {v6, p0, p4}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V

    .line 626
    .local v6, "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    sget-object v2, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_PROMPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    .line 630
    .end local v6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    :cond_0
    return-void
.end method

.method private isOwnerActivityRunning()Z
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    const/4 v0, 0x1

    .line 186
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private native nativeCancelJsResult(JI)V
.end method

.method private native nativeConfirmJsResult(JILjava/lang/String;)V
.end method

.method private native nativeDownloadIcon(JLjava/lang/String;)V
.end method

.method private native nativeExitFullscreen(JJ)V
.end method

.method private native nativeNotificationClicked(JI)V
.end method

.method private native nativeNotificationClosed(JIZ)V
.end method

.method private native nativeNotificationDisplayed(JI)V
.end method

.method private native nativeNotificationError(JI)V
.end method

.method private native nativeOnFilesNotSelected(JIII)V
.end method

.method private native nativeOnFilesSelected(JIIILjava/lang/String;Ljava/lang/String;)V
.end method

.method private native nativeProceedSslError(JZI)V
.end method

.method private proceedSslError(ZI)V
    .locals 4
    .param p1, "proceed"    # Z
    .param p2, "id"    # I

    .prologue
    .line 595
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 597
    :goto_0
    return-void

    .line 596
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeProceedSslError(JZI)V

    goto :goto_0
.end method

.method private setNativeContentsClientBridge(J)V
    .locals 1
    .param p1, "nativeContentsClientBridge"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 566
    iput-wide p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    .line 567
    return-void
.end method

.method private showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "replaceId"    # Ljava/lang/String;
    .param p4, "notificationId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 651
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkNotificationService;->showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 653
    return-void
.end method

.method private updateNotificationIcon(ILandroid/graphics/Bitmap;)V
    .locals 1
    .param p1, "notificationId"    # I
    .param p2, "icon"    # Landroid/graphics/Bitmap;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 645
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkNotificationService;->updateNotificationIcon(ILandroid/graphics/Bitmap;)V

    .line 646
    return-void
.end method


# virtual methods
.method cancelJsResult(I)V
    .locals 4
    .param p1, "id"    # I

    .prologue
    .line 666
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 668
    :goto_0
    return-void

    .line 667
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeCancelJsResult(JI)V

    goto :goto_0
.end method

.method confirmJsResult(ILjava/lang/String;)V
    .locals 4
    .param p1, "id"    # I
    .param p2, "prompt"    # Ljava/lang/String;

    .prologue
    .line 661
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 663
    :goto_0
    return-void

    .line 662
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeConfirmJsResult(JILjava/lang/String;)V

    goto :goto_0
.end method

.method public didFinishLoad(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 444
    return-void
.end method

.method public doUpdateVisitedHistory(Ljava/lang/String;Z)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "isReload"    # Z

    .prologue
    .line 223
    return-void
.end method

.method exitFullscreen(J)V
    .locals 5
    .param p1, "nativeWebContents"    # J

    .prologue
    .line 671
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 673
    :goto_0
    return-void

    .line 672
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeExitFullscreen(JJ)V

    goto :goto_0
.end method

.method public getContentVideoViewClient()Lorg/chromium/content/browser/ContentVideoViewClient;
    .locals 3

    .prologue
    .line 560
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-direct {v0, p0, v1, v2}, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;-><init>(Lorg/xwalk/core/internal/XWalkContentsClient;Landroid/app/Activity;Lorg/xwalk/core/internal/XWalkViewInternal;)V

    return-object v0
.end method

.method public getInterceptNavigationDelegate()Lorg/chromium/components/navigation_interception/InterceptNavigationDelegate;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mInterceptNavigationDelegate:Lorg/chromium/components/navigation_interception/InterceptNavigationDelegate;

    return-object v0
.end method

.method public getVisitedHistory(Landroid/webkit/ValueCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback",
            "<[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 219
    .local p1, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<[Ljava/lang/String;>;"
    return-void
.end method

.method public getXWalkWebChromeClient()Lorg/xwalk/core/internal/XWalkWebChromeClient;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    return-object v0
.end method

.method public hasEnteredFullscreen()Z
    .locals 1

    .prologue
    .line 463
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mIsFullscreen:Z

    return v0
.end method

.method public notificationClicked(I)V
    .locals 4
    .param p1, "id"    # I

    .prologue
    .line 686
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 688
    :goto_0
    return-void

    .line 687
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeNotificationClicked(JI)V

    goto :goto_0
.end method

.method public notificationClosed(IZ)V
    .locals 4
    .param p1, "id"    # I
    .param p2, "byUser"    # Z

    .prologue
    .line 691
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 693
    :goto_0
    return-void

    .line 692
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeNotificationClosed(JIZ)V

    goto :goto_0
.end method

.method public notificationDisplayed(I)V
    .locals 4
    .param p1, "id"    # I

    .prologue
    .line 676
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 678
    :goto_0
    return-void

    .line 677
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeNotificationDisplayed(JI)V

    goto :goto_0
.end method

.method public notificationError(I)V
    .locals 4
    .param p1, "id"    # I

    .prologue
    .line 681
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 683
    :goto_0
    return-void

    .line 682
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J

    invoke-direct {p0, v0, v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeNotificationError(JI)V

    goto :goto_0
.end method

.method public onCloseWindow()V
    .locals 2

    .prologue
    .line 408
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 411
    :cond_0
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1
    .param p1, "consoleMessage"    # Landroid/webkit/ConsoleMessage;

    .prologue
    .line 263
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateWindow(ZZ)Z
    .locals 4
    .param p1, "isDialog"    # Z
    .param p2, "isUserGesture"    # Z

    .prologue
    .line 380
    if-eqz p1, :cond_0

    const/4 v2, 0x0

    .line 396
    :goto_0
    return v2

    .line 382
    :cond_0
    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_JAVASCRIPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    .line 384
    .local v1, "initiator":Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    if-eqz p2, :cond_1

    .line 385
    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_USER_GESTURE:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    .line 388
    :cond_1
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V

    .line 396
    .local v0, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/internal/XWalkViewInternal;>;"
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v2, v3, v1, v0}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z

    move-result v2

    goto :goto_0
.end method

.method public onDangerousDownload(Ljava/lang/String;I)V
    .locals 0
    .param p1, "filename"    # Ljava/lang/String;
    .param p2, "downloadId"    # I

    .prologue
    .line 711
    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "userAgent"    # Ljava/lang/String;
    .param p3, "contentDisposition"    # Ljava/lang/String;
    .param p4, "mimeType"    # Ljava/lang/String;
    .param p5, "contentLength"    # J

    .prologue
    .line 376
    return-void
.end method

.method public onDownloadStarted(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "filename"    # Ljava/lang/String;
    .param p2, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 708
    return-void
.end method

.method public onFindResultReceived(IIZ)V
    .locals 0
    .param p1, "activeMatchOrdinal"    # I
    .param p2, "numberOfMatches"    # I
    .param p3, "isDoneCounting"    # Z

    .prologue
    .line 302
    return-void
.end method

.method public onFormResubmission(Landroid/os/Message;Landroid/os/Message;)V
    .locals 0
    .param p1, "dontResend"    # Landroid/os/Message;
    .param p2, "resend"    # Landroid/os/Message;

    .prologue
    .line 367
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 368
    return-void
.end method

.method public onGeolocationPermissionsHidePrompt()V
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onGeolocationPermissionsHidePrompt()V

    .line 297
    :cond_0
    return-void
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;)V
    .locals 1
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "callback"    # Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;

    .prologue
    .line 287
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;)V

    .line 290
    :cond_0
    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onHideCustomView()V

    .line 433
    :cond_0
    return-void
.end method

.method public onIconAvailable(Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 724
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mUiThreadHandler:Landroid/os/Handler;

    const/16 v2, 0x65

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 725
    .local v0, "m":Landroid/os/Message;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v1, v2, p1, v0}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onIconAvailable(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/os/Message;)V

    .line 726
    return-void
.end method

.method public onLoadResource(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 256
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkClient;->onLoadResource(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 259
    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)Z
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 175
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0, p1}, Lorg/xwalk/core/internal/XWalkNotificationService;->maybeHandleIntent(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method

.method public onNewPicture(Landroid/graphics/Picture;)V
    .locals 0
    .param p1, "picture"    # Landroid/graphics/Picture;

    .prologue
    .line 306
    return-void
.end method

.method public onPageFinished(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 319
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    :goto_0
    return-void

    .line 320
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageLoadListener:Lorg/xwalk/core/internal/PageLoadListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageLoadListener:Lorg/xwalk/core/internal/PageLoadListener;

    invoke-interface {v0, p1}, Lorg/xwalk/core/internal/PageLoadListener;->onPageFinished(Ljava/lang/String;)V

    .line 321
    :cond_1
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    if-eqz v0, :cond_2

    .line 322
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->CANCELLED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 323
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    invoke-virtual {v0, v1, v2, v3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V

    .line 327
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    .line 333
    :cond_2
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->onResourceLoadFinished(Ljava/lang/String;)V

    goto :goto_0

    .line 325
    :cond_3
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    invoke-virtual {v0, v1, p1, v2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V

    goto :goto_1
.end method

.method public onPageStarted(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 310
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    .line 312
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 313
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 315
    :cond_0
    return-void
.end method

.method public onProgressChanged(I)V
    .locals 2
    .param p1, "progress"    # I

    .prologue
    .line 227
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onProgressChanged(Lorg/xwalk/core/internal/XWalkViewInternal;I)V

    .line 230
    :cond_0
    return-void
.end method

.method public onReceivedError(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "errorCode"    # I
    .param p2, "description"    # Ljava/lang/String;
    .param p3, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 343
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadingUrl:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FAILED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 347
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V

    .line 349
    :cond_1
    return-void
.end method

.method public onReceivedHttpAuthRequest(Lorg/xwalk/core/internal/XWalkHttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "handler"    # Lorg/xwalk/core/internal/XWalkHttpAuthHandler;
    .param p2, "host"    # Ljava/lang/String;
    .param p3, "realm"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 268
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkClient;->onReceivedHttpAuthRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    :cond_0
    return-void
.end method

.method public onReceivedIcon(Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 415
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/graphics/Bitmap;)V

    .line 418
    :cond_0
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mFavicon:Landroid/graphics/Bitmap;

    .line 419
    return-void
.end method

.method public onReceivedIcon(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "icon"    # Landroid/graphics/Bitmap;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 730
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 731
    return-void
.end method

.method public onReceivedLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "realm"    # Ljava/lang/String;
    .param p2, "account"    # Ljava/lang/String;
    .param p3, "args"    # Ljava/lang/String;

    .prologue
    .line 282
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 2
    .param p2, "error"    # Landroid/net/http/SslError;
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

    .prologue
    .line 275
    .local p1, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V

    .line 278
    :cond_0
    return-void
.end method

.method public onRendererResponsive()V
    .locals 2

    .prologue
    .line 360
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkClient;->onRendererResponsive(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 363
    :cond_0
    return-void
.end method

.method public onRendererUnresponsive()V
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkClient;->onRendererUnresponsive(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 356
    :cond_0
    return-void
.end method

.method public onRequestFocus()V
    .locals 2

    .prologue
    .line 401
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onRequestFocus(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 404
    :cond_0
    return-void
.end method

.method public onResourceLoadFinished(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 249
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadFinished(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 252
    :cond_0
    return-void
.end method

.method public onResourceLoadStarted(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 242
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 245
    :cond_0
    return-void
.end method

.method public onScaleChangedScaled(FF)V
    .locals 2
    .param p1, "oldScale"    # F
    .param p2, "newScale"    # F

    .prologue
    .line 437
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onScaleChanged(Lorg/xwalk/core/internal/XWalkViewInternal;FF)V

    .line 440
    :cond_0
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "callback"    # Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .prologue
    .line 423
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onShowCustomView(Landroid/view/View;Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V

    .line 426
    :cond_0
    return-void
.end method

.method protected onStopLoading()V
    .locals 1

    .prologue
    .line 338
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->CANCELLED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mLoadStatus:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 339
    return-void
.end method

.method public onTitleChanged(Ljava/lang/String;)V
    .locals 2
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 448
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 451
    :cond_0
    return-void
.end method

.method public onToggleFullscreen(Z)V
    .locals 2
    .param p1, "enterFullscreen"    # Z

    .prologue
    .line 455
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mIsFullscreen:Z

    .line 457
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewInternal;Z)V

    .line 459
    :cond_0
    return-void
.end method

.method public onUnhandledKeyEvent(Landroid/view/KeyEvent;)V
    .locals 2
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 212
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)V

    .line 215
    :cond_0
    return-void
.end method

.method public onWebLayoutPageScaleFactorChanged(F)V
    .locals 2
    .param p1, "pageScaleFactor"    # F
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 715
    iget v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageScaleFactor:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    .line 720
    :goto_0
    return-void

    .line 717
    :cond_0
    iget v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageScaleFactor:F

    .line 718
    .local v0, "oldPageScaleFactor":F
    iput p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageScaleFactor:F

    .line 719
    iget v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageScaleFactor:F

    invoke-virtual {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->onScaleChanged(FF)V

    goto :goto_0
.end method

.method registerPageLoadListener(Lorg/xwalk/core/internal/PageLoadListener;)V
    .locals 0
    .param p1, "listener"    # Lorg/xwalk/core/internal/PageLoadListener;

    .prologue
    .line 165
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mPageLoadListener:Lorg/xwalk/core/internal/PageLoadListener;

    .line 166
    return-void
.end method

.method public requestHttpGetDownload(Lorg/chromium/content/browser/DownloadInfo;)V
    .locals 8
    .param p1, "downloadInfo"    # Lorg/chromium/content/browser/DownloadInfo;

    .prologue
    .line 701
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mDownloadListener:Lorg/xwalk/core/internal/DownloadListener;

    if-eqz v0, :cond_0

    .line 702
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mDownloadListener:Lorg/xwalk/core/internal/DownloadListener;

    invoke-virtual {p1}, Lorg/chromium/content/browser/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lorg/chromium/content/browser/DownloadInfo;->getUserAgent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lorg/chromium/content/browser/DownloadInfo;->getContentDisposition()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lorg/chromium/content/browser/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lorg/chromium/content/browser/DownloadInfo;->getContentLength()J

    move-result-wide v6

    invoke-interface/range {v1 .. v7}, Lorg/xwalk/core/internal/DownloadListener;->onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 705
    :cond_0
    return-void
.end method

.method setDownloadListener(Lorg/xwalk/core/internal/DownloadListener;)V
    .locals 0
    .param p1, "listener"    # Lorg/xwalk/core/internal/DownloadListener;

    .prologue
    .line 696
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mDownloadListener:Lorg/xwalk/core/internal/DownloadListener;

    .line 697
    return-void
.end method

.method public setNavigationHandler(Lorg/xwalk/core/internal/XWalkNavigationHandler;)V
    .locals 0
    .param p1, "handler"    # Lorg/xwalk/core/internal/XWalkNavigationHandler;

    .prologue
    .line 161
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNavigationHandler:Lorg/xwalk/core/internal/XWalkNavigationHandler;

    .line 162
    return-void
.end method

.method public setNotificationService(Lorg/xwalk/core/internal/XWalkNotificationService;)V
    .locals 1
    .param p1, "service"    # Lorg/xwalk/core/internal/XWalkNotificationService;

    .prologue
    .line 169
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0}, Lorg/xwalk/core/internal/XWalkNotificationService;->shutdown()V

    .line 170
    :cond_0
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    .line 171
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNotificationService:Lorg/xwalk/core/internal/XWalkNotificationService;

    invoke-interface {v0, p0}, Lorg/xwalk/core/internal/XWalkNotificationService;->setBridge(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V

    .line 172
    :cond_1
    return-void
.end method

.method public setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V
    .locals 2
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    .prologue
    .line 137
    if-eqz p1, :cond_0

    .line 138
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    .line 142
    :goto_0
    return-void

    .line 141
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-direct {v0, v1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    goto :goto_0
.end method

.method public setUIClient(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V
    .locals 2
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkUIClientInternal;

    .prologue
    .line 128
    if-eqz p1, :cond_0

    .line 129
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    .line 133
    :goto_0
    return-void

    .line 132
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-direct {v0, v1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    goto :goto_0
.end method

.method public setXWalkClient(Lorg/xwalk/core/internal/XWalkClient;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkClient;

    .prologue
    .line 157
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkClient:Lorg/xwalk/core/internal/XWalkClient;

    .line 158
    return-void
.end method

.method public setXWalkWebChromeClient(Lorg/xwalk/core/internal/XWalkWebChromeClient;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkWebChromeClient;

    .prologue
    .line 147
    if-nez p1, :cond_0

    .line 150
    :goto_0
    return-void

    .line 148
    :cond_0
    invoke-virtual {p1, p0}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->setContentsClient(Lorg/xwalk/core/internal/XWalkContentsClient;)V

    .line 149
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkWebChromeClient:Lorg/xwalk/core/internal/XWalkWebChromeClient;

    goto :goto_0
.end method

.method public shouldInterceptRequest(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 234
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 237
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public shouldOpenWithDefaultBrowser(Ljava/lang/String;)Z
    .locals 5
    .param p1, "contentUrl"    # Ljava/lang/String;

    .prologue
    .line 468
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 469
    .local v1, "intent":Landroid/content/Intent;
    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 470
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 471
    .local v2, "url":Landroid/net/Uri;
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 473
    :try_start_0
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 479
    const/4 v3, 0x1

    :goto_0
    return v3

    .line 474
    :catch_0
    move-exception v0

    .line 475
    .local v0, "exception":Landroid/content/ActivityNotFoundException;
    sget-object v3, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->TAG:Ljava/lang/String;

    const-string v4, "Activity not found for Intent:"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 476
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public shouldOverrideKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 200
    const/4 v0, 0x0

    .line 201
    .local v0, "overridden":Z
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-eqz v1, :cond_0

    .line 202
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v1, v2, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)Z

    move-result v0

    .line 204
    :cond_0
    if-nez v0, :cond_1

    .line 205
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClient;->shouldOverrideKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    .line 207
    .end local v0    # "overridden":Z
    :cond_1
    return v0
.end method

.method public shouldOverrideRunFileChooser(IIILjava/lang/String;Z)Z
    .locals 6
    .param p1, "processId"    # I
    .param p2, "renderId"    # I
    .param p3, "modeFlags"    # I
    .param p4, "acceptTypes"    # Ljava/lang/String;
    .param p5, "capture"    # Z

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 486
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->isOwnerActivityRunning()Z

    move-result v3

    if-nez v3, :cond_0

    .line 555
    :goto_0
    return v2

    .line 511
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$3;-><init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;III)V

    .line 546
    .local v0, "uploadFile":Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkUIClient:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-static {p5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v0, p4, v5}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->openFileChooser(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    iput-boolean v1, v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->syncCallFinished:Z

    .line 552
    iget-boolean v3, v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->syncNullReceived:Z

    if-eqz v3, :cond_1

    .line 553
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-static {p5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, p4, v2}, Lorg/xwalk/core/internal/XWalkViewInternal;->showFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    .line 555
    :cond_1
    iget-boolean v3, v0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1UriCallback;->syncNullReceived:Z

    if-nez v3, :cond_2

    :goto_1
    move v2, v1

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method public shouldOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 192
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkResourceClient:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0, v1, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Z

    move-result v0

    .line 195
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
