.class Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;
.super Lorg/xwalk/core/internal/XWalkUIClientInternal;
.source "XWalkPresentationContent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->load(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 0
    .param p2, "x0"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 44
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    return-void
.end method


# virtual methods
.method public onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 2
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 49
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    const/4 v1, -0x1

    # setter for: Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->access$002(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;I)I

    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->onContentClosed()V
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->access$100(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V

    .line 51
    return-void
.end method

.method public onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V
    .locals 2
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .prologue
    .line 56
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    if-ne p3, v0, :cond_0

    .line 57
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-static {v1}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->access$200(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)Lorg/xwalk/core/internal/XWalkViewInternal;

    move-result-object v1

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getContentID()I

    move-result v1

    # setter for: Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->access$002(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;I)I

    .line 58
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->onContentLoaded()V
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->access$300(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V

    .line 60
    :cond_0
    return-void
.end method
