.class Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;
.super Ljava/lang/Object;
.source "XWalkContent.java"

# interfaces
.implements Lorg/xwalk/core/internal/XWalkContentsIoThreadClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "XWalkIoThreadClientImpl"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContent;


# direct methods
.method private constructor <init>(Lorg/xwalk/core/internal/XWalkContent;)V
    .locals 0

    .prologue
    .line 589
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/xwalk/core/internal/XWalkContent;Lorg/xwalk/core/internal/XWalkContent$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/xwalk/core/internal/XWalkContent;
    .param p2, "x1"    # Lorg/xwalk/core/internal/XWalkContent$1;

    .prologue
    .line 589
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;-><init>(Lorg/xwalk/core/internal/XWalkContent;)V

    return-void
.end method


# virtual methods
.method public getCacheMode()I
    .locals 1

    .prologue
    .line 594
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mSettings:Lorg/xwalk/core/internal/XWalkSettings;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$300(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkSettings;->getCacheMode()I

    move-result v0

    return v0
.end method

.method public newLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "realm"    # Ljava/lang/String;
    .param p2, "account"    # Ljava/lang/String;
    .param p3, "args"    # Ljava/lang/String;

    .prologue
    .line 649
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnReceivedLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 9
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "userAgent"    # Ljava/lang/String;
    .param p3, "contentDisposition"    # Ljava/lang/String;
    .param p4, "mimeType"    # Ljava/lang/String;
    .param p5, "contentLength"    # J

    .prologue
    .line 643
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 645
    return-void
.end method

.method public shouldBlockContentUrls()Z
    .locals 1

    .prologue
    .line 624
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mSettings:Lorg/xwalk/core/internal/XWalkSettings;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$300(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkSettings;->getAllowContentAccess()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public shouldBlockFileUrls()Z
    .locals 1

    .prologue
    .line 629
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mSettings:Lorg/xwalk/core/internal/XWalkSettings;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$300(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkSettings;->getAllowFileAccess()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public shouldBlockNetworkLoads()Z
    .locals 1

    .prologue
    .line 634
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mSettings:Lorg/xwalk/core/internal/XWalkSettings;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$300(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkSettings;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkSettings;->getBlockNetworkLoads()Z

    move-result v0

    return v0
.end method

.method public shouldInterceptRequest(Ljava/lang/String;Z)Lorg/xwalk/core/internal/InterceptedRequestData;
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "isMainFrame"    # Z

    .prologue
    .line 603
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v2

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnResourceLoadStarted(Ljava/lang/String;)V

    .line 605
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->shouldInterceptRequest(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v1

    .line 606
    .local v1, "webResourceResponse":Landroid/webkit/WebResourceResponse;
    const/4 v0, 0x0

    .line 608
    .local v0, "interceptedRequestData":Lorg/xwalk/core/internal/InterceptedRequestData;
    if-nez v1, :cond_0

    .line 609
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v2

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnLoadResource(Ljava/lang/String;)V

    .line 619
    :goto_0
    return-object v0

    .line 611
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {v1}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object v2

    if-nez v2, :cond_1

    .line 612
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkIoThreadClientImpl;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mContentsClientBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContent;->access$400(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v2

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->getCallbackHelper()Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, p1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->postOnReceivedError(ILjava/lang/String;Ljava/lang/String;)V

    .line 615
    :cond_1
    new-instance v0, Lorg/xwalk/core/internal/InterceptedRequestData;

    .end local v0    # "interceptedRequestData":Lorg/xwalk/core/internal/InterceptedRequestData;
    invoke-virtual {v1}, Landroid/webkit/WebResourceResponse;->getMimeType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/webkit/WebResourceResponse;->getEncoding()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/webkit/WebResourceResponse;->getData()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lorg/xwalk/core/internal/InterceptedRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    .restart local v0    # "interceptedRequestData":Lorg/xwalk/core/internal/InterceptedRequestData;
    goto :goto_0
.end method
