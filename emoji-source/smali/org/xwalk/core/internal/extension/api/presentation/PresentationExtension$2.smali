.class Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;
.super Ljava/lang/Object;
.source "PresentationExtension.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->handleRequestShow(IILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

.field final synthetic val$baseUrl:Ljava/lang/String;

.field final synthetic val$instanceId:I

.field final synthetic val$requestId:I

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 237
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    iput p2, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$instanceId:I

    iput p3, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$requestId:I

    iput-object p4, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$url:Ljava/lang/String;

    iput-object p5, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$baseUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    .line 240
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->getPreferredDisplay()Landroid/view/Display;
    invoke-static {v6}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$300(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)Landroid/view/Display;

    move-result-object v2

    .line 243
    .local v2, "preferredDisplay":Landroid/view/Display;
    if-nez v2, :cond_0

    .line 244
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    iget v7, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$instanceId:I

    iget v8, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$requestId:I

    const-string v9, "NotFoundError"

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->notifyRequestShowFail(IILjava/lang/String;)V
    invoke-static {v6, v7, v8, v9}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$400(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;IILjava/lang/String;)V

    .line 296
    :goto_0
    return-void

    .line 250
    :cond_0
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mPresentationContent:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;
    invoke-static {v6}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$500(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 251
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    iget v7, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$instanceId:I

    iget v8, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$requestId:I

    const-string v9, "InvalidAccessError"

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->notifyRequestShowFail(IILjava/lang/String;)V
    invoke-static {v6, v7, v8, v9}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$400(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;IILjava/lang/String;)V

    goto :goto_0

    .line 258
    :cond_1
    iget-object v5, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$url:Ljava/lang/String;

    .line 259
    .local v5, "targetUrl":Ljava/lang/String;
    const/4 v3, 0x0

    .line 261
    .local v3, "targetUri":Ljava/net/URI;
    :try_start_0
    new-instance v4, Ljava/net/URI;

    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$url:Ljava/lang/String;

    invoke-direct {v4, v6}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    .end local v3    # "targetUri":Ljava/net/URI;
    .local v4, "targetUri":Ljava/net/URI;
    :try_start_1
    invoke-virtual {v4}, Ljava/net/URI;->isAbsolute()Z

    move-result v6

    if-nez v6, :cond_2

    .line 263
    new-instance v0, Ljava/net/URI;

    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$baseUrl:Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 264
    .local v0, "baseUri":Ljava/net/URI;
    invoke-virtual {v0, v4}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v6

    invoke-virtual {v6}, Ljava/net/URI;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v5

    .line 272
    .end local v0    # "baseUri":Ljava/net/URI;
    :cond_2
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    new-instance v7, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mContext:Landroid/content/Context;
    invoke-static {v8}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$600(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)Landroid/content/Context;

    move-result-object v8

    iget-object v9, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mActivity:Ljava/lang/ref/WeakReference;
    invoke-static {v9}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$700(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)Ljava/lang/ref/WeakReference;

    move-result-object v9

    new-instance v10, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2$1;

    invoke-direct {v10, p0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2$1;-><init>(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;)V

    invoke-direct {v7, v8, v9, v10}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;)V

    # setter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mPresentationContent:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;
    invoke-static {v6, v7}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$502(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    .line 291
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mPresentationContent:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;
    invoke-static {v6}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$500(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    move-result-object v6

    invoke-virtual {v6, v5}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->load(Ljava/lang/String;)V

    .line 295
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->updatePresentationView(Landroid/view/Display;)V
    invoke-static {v6, v2}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$1000(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;Landroid/view/Display;)V

    goto :goto_0

    .line 266
    .end local v4    # "targetUri":Ljava/net/URI;
    .restart local v3    # "targetUri":Ljava/net/URI;
    :catch_0
    move-exception v1

    .line 267
    .local v1, "e":Ljava/net/URISyntaxException;
    :goto_1
    const-string v6, "PresentationExtension"

    const-string v7, "Invalid url passed to requestShow"

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    iget-object v6, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    iget v7, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$instanceId:I

    iget v8, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$2;->val$requestId:I

    const-string v9, "InvalidParameterError"

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->notifyRequestShowFail(IILjava/lang/String;)V
    invoke-static {v6, v7, v8, v9}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$400(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;IILjava/lang/String;)V

    goto :goto_0

    .line 266
    .end local v1    # "e":Ljava/net/URISyntaxException;
    .end local v3    # "targetUri":Ljava/net/URI;
    .restart local v4    # "targetUri":Ljava/net/URI;
    :catch_1
    move-exception v1

    move-object v3, v4

    .end local v4    # "targetUri":Ljava/net/URI;
    .restart local v3    # "targetUri":Ljava/net/URI;
    goto :goto_1
.end method
