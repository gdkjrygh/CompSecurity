.class Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;
.super Ljava/lang/Object;
.source "XWalkJavascriptResultHandlerInternal.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->cancel()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$000(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$000(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    move-result-object v0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    # getter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mId:I
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$100(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->cancelJsResult(I)V

    .line 55
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;->this$0:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    const/4 v1, 0x0

    # setter for: Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->access$002(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 56
    return-void
.end method
