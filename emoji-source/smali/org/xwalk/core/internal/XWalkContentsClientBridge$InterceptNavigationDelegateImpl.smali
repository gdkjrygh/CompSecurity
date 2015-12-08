.class Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;
.super Ljava/lang/Object;
.source "XWalkContentsClientBridge.java"

# interfaces
.implements Lorg/chromium/components/navigation_interception/InterceptNavigationDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContentsClientBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InterceptNavigationDelegateImpl"
.end annotation


# instance fields
.field private mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;Lorg/xwalk/core/internal/XWalkContentsClient;)V
    .locals 0
    .param p2, "client"    # Lorg/xwalk/core/internal/XWalkContentsClient;

    .prologue
    .line 74
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    .line 76
    return-void
.end method


# virtual methods
.method public shouldIgnoreNavigation(Lorg/chromium/components/navigation_interception/NavigationParams;)Z
    .locals 3
    .param p1, "navigationParams"    # Lorg/chromium/components/navigation_interception/NavigationParams;

    .prologue
    .line 79
    iget-object v1, p1, Lorg/chromium/components/navigation_interception/NavigationParams;->url:Ljava/lang/String;

    .line 80
    .local v1, "url":Ljava/lang/String;
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {v2, v1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->shouldOverrideUrlLoading(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNavigationHandler:Lorg/xwalk/core/internal/XWalkNavigationHandler;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkNavigationHandler;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNavigationHandler:Lorg/xwalk/core/internal/XWalkNavigationHandler;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkNavigationHandler;

    move-result-object v2

    invoke-interface {v2, p1}, Lorg/xwalk/core/internal/XWalkNavigationHandler;->handleNavigation(Lorg/chromium/components/navigation_interception/NavigationParams;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 84
    .local v0, "ignoreNavigation":Z
    :goto_0
    if-nez v0, :cond_1

    .line 86
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$InterceptNavigationDelegateImpl;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkContentsClient;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnPageStarted(Ljava/lang/String;)V

    .line 89
    :cond_1
    return v0

    .line 80
    .end local v0    # "ignoreNavigation":Z
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
