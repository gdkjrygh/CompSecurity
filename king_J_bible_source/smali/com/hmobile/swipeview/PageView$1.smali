.class Lcom/hmobile/swipeview/PageView$1;
.super Ljava/lang/Object;
.source "PageView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/swipeview/PageView;->setAdapter(Landroid/widget/BaseAdapter;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/swipeview/PageView;

.field private final synthetic val$startPosition:I


# direct methods
.method constructor <init>(Lcom/hmobile/swipeview/PageView;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    iput p2, p0, Lcom/hmobile/swipeview/PageView$1;->val$startPosition:I

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    # getter for: Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z
    invoke-static {v0}, Lcom/hmobile/swipeview/PageView;->access$0(Lcom/hmobile/swipeview/PageView;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/hmobile/swipeview/PageView$1;->val$startPosition:I

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    const/4 v1, 0x0

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->scrollToPage(I)V
    invoke-static {v0, v1}, Lcom/hmobile/swipeview/PageView;->access$1(Lcom/hmobile/swipeview/PageView;I)V

    .line 99
    :goto_0
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    # getter for: Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z
    invoke-static {v0}, Lcom/hmobile/swipeview/PageView;->access$0(Lcom/hmobile/swipeview/PageView;)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/hmobile/swipeview/PageView$1;->val$startPosition:I

    iget-object v1, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    # getter for: Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;
    invoke-static {v1}, Lcom/hmobile/swipeview/PageView;->access$2(Lcom/hmobile/swipeview/PageView;)Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    .line 93
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    const/4 v1, 0x2

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->scrollToPage(I)V
    invoke-static {v0, v1}, Lcom/hmobile/swipeview/PageView;->access$1(Lcom/hmobile/swipeview/PageView;I)V

    goto :goto_0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView$1;->this$0:Lcom/hmobile/swipeview/PageView;

    const/4 v1, 0x1

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->scrollToPage(I)V
    invoke-static {v0, v1}, Lcom/hmobile/swipeview/PageView;->access$1(Lcom/hmobile/swipeview/PageView;I)V

    goto :goto_0
.end method
