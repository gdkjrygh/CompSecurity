.class Lcom/hmobile/swipeview/SwipeView$1;
.super Ljava/lang/Object;
.source "SwipeView.java"

# interfaces
.implements Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/swipeview/SwipeView;->setPageControl(Lcom/hmobile/swipeview/PageControl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/swipeview/SwipeView;


# direct methods
.method constructor <init>(Lcom/hmobile/swipeview/SwipeView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView$1;->this$0:Lcom/hmobile/swipeview/SwipeView;

    .line 347
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public goBackwards()V
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView$1;->this$0:Lcom/hmobile/swipeview/SwipeView;

    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView$1;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v1}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/hmobile/swipeview/SwipeView;->smoothScrollToPage(I)V

    .line 354
    return-void
.end method

.method public goForwards()V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView$1;->this$0:Lcom/hmobile/swipeview/SwipeView;

    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView$1;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v1}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/hmobile/swipeview/SwipeView;->smoothScrollToPage(I)V

    .line 350
    return-void
.end method
