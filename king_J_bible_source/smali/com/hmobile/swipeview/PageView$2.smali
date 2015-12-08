.class Lcom/hmobile/swipeview/PageView$2;
.super Ljava/lang/Object;
.source "PageView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/swipeview/PageView;->rearrangePages(IIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/swipeview/PageView;

.field private final synthetic val$pageToScrollTo:I

.field private final synthetic val$smooth:Z


# direct methods
.method constructor <init>(Lcom/hmobile/swipeview/PageView;ZI)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/swipeview/PageView$2;->this$0:Lcom/hmobile/swipeview/PageView;

    iput-boolean p2, p0, Lcom/hmobile/swipeview/PageView$2;->val$smooth:Z

    iput p3, p0, Lcom/hmobile/swipeview/PageView$2;->val$pageToScrollTo:I

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 336
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView$2;->val$smooth:Z

    if-eqz v0, :cond_0

    .line 338
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$2;->this$0:Lcom/hmobile/swipeview/PageView;

    iget v1, p0, Lcom/hmobile/swipeview/PageView$2;->val$pageToScrollTo:I

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->smoothScrollToPage(I)V
    invoke-static {v0, v1}, Lcom/hmobile/swipeview/PageView;->access$3(Lcom/hmobile/swipeview/PageView;I)V

    .line 344
    :goto_0
    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$2;->this$0:Lcom/hmobile/swipeview/PageView;

    iget v1, p0, Lcom/hmobile/swipeview/PageView$2;->val$pageToScrollTo:I

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->scrollToPage(I)V
    invoke-static {v0, v1}, Lcom/hmobile/swipeview/PageView;->access$1(Lcom/hmobile/swipeview/PageView;I)V

    goto :goto_0
.end method
