.class Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;
.super Ljava/lang/Object;
.source "SwipeAdapter.java"

# interfaces
.implements Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SwipeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SwipeImageLoader"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SwipeAdapter;


# direct methods
.method private constructor <init>(Lcom/hmobile/biblekjv/SwipeAdapter;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/hmobile/biblekjv/SwipeAdapter;Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;)V
    .locals 0

    .prologue
    .line 108
    invoke-direct {p0, p1}, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;-><init>(Lcom/hmobile/biblekjv/SwipeAdapter;)V

    return-void
.end method


# virtual methods
.method public onPageChanged(II)V
    .locals 4
    .param p1, "oldPage"    # I
    .param p2, "newPage"    # I

    .prologue
    .line 111
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iput p2, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_currentIndex:I

    .line 112
    if-le p2, p1, :cond_2

    .line 114
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getPageCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p2, v0, :cond_0

    .line 115
    iget-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lcom/hmobile/biblekjv/SwipeAdapter;->book:Ljava/lang/String;

    .line 117
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    .line 118
    add-int/lit8 v1, p2, 0x1

    .line 117
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 118
    iget-object v2, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    .line 119
    iget-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v1, v1, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    add-int/lit8 v3, p2, 0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    add-int/lit8 v3, p2, 0x1

    .line 118
    # invokes: Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;
    invoke-static {v2, v1, v3}, Lcom/hmobile/biblekjv/SwipeAdapter;->access$0(Lcom/hmobile/biblekjv/SwipeAdapter;Ljava/lang/String;I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 122
    :cond_0
    if-eqz p1, :cond_1

    .line 123
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    .line 124
    add-int/lit8 v1, p1, -0x1

    .line 123
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 124
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 145
    :cond_1
    :goto_0
    return-void

    .line 130
    :cond_2
    if-eqz p2, :cond_3

    .line 131
    iget-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lcom/hmobile/biblekjv/SwipeAdapter;->book:Ljava/lang/String;

    .line 133
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    .line 134
    add-int/lit8 v1, p2, -0x1

    .line 133
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 134
    iget-object v2, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    .line 135
    iget-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v1, v1, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    add-int/lit8 v3, p2, -0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    add-int/lit8 v3, p2, -0x1

    .line 134
    # invokes: Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;
    invoke-static {v2, v1, v3}, Lcom/hmobile/biblekjv/SwipeAdapter;->access$0(Lcom/hmobile/biblekjv/SwipeAdapter;Ljava/lang/String;I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 138
    :cond_3
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getPageCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;->this$0:Lcom/hmobile/biblekjv/SwipeAdapter;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v0}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    .line 140
    add-int/lit8 v1, p1, 0x1

    .line 139
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 140
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    goto :goto_0
.end method
