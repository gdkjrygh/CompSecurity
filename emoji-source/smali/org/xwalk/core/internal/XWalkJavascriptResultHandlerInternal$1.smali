.class Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;
.super Ljava/lang/Object;
.source "XWalkJavascriptResultHandlerInternal.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirmWithResult(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

.field final synthetic val$promptResult:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->val$promptResult:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$000(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$000(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mId:I
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$100(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)I

    move-result v1

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->val$promptResult:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->confirmJsResult(ILjava/lang/String;)V

    .line 41
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    const/4 v1, 0x0

    # setter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$002(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 42
    return-void
.end method
