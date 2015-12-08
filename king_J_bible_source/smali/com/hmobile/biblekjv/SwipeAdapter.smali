.class public Lcom/hmobile/biblekjv/SwipeAdapter;
.super Ljava/lang/Object;
.source "SwipeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;
    }
.end annotation


# instance fields
.field act:Landroid/app/Activity;

.field book:Ljava/lang/String;

.field c:Landroid/content/Context;

.field mPageControl:Lcom/hmobile/swipeview/PageControl;

.field mSwipeImageLoader:Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;

.field mSwipeView:Lcom/hmobile/swipeview/SwipeView;

.field m_currentIndex:I

.field m_details:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;Lcom/hmobile/swipeview/SwipeView;Lcom/hmobile/swipeview/PageControl;Landroid/content/Context;)V
    .locals 2
    .param p1, "m_activity"    # Landroid/app/Activity;
    .param p3, "m_swipe"    # Lcom/hmobile/swipeview/SwipeView;
    .param p4, "mPage"    # Lcom/hmobile/swipeview/PageControl;
    .param p5, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/hmobile/swipeview/SwipeView;",
            "Lcom/hmobile/swipeview/PageControl;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->act:Landroid/app/Activity;

    .line 18
    iput-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    .line 19
    iput-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_currentIndex:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->book:Ljava/lang/String;

    .line 24
    iput-object v1, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->c:Landroid/content/Context;

    .line 28
    iput-object p1, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->act:Landroid/app/Activity;

    .line 29
    iput-object p2, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    .line 30
    iput-object p3, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    .line 31
    iput-object p4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    .line 32
    iput-object p5, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->c:Landroid/content/Context;

    .line 33
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/SwipeAdapter;Ljava/lang/String;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 69
    invoke-direct {p0, p1, p2}, Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private getNewView(Ljava/lang/String;I)Landroid/view/View;
    .locals 2
    .param p1, "info"    # Ljava/lang/String;
    .param p2, "currentIndex"    # I

    .prologue
    .line 70
    const/4 v0, 0x0

    .line 105
    .local v0, "view":Landroid/view/View;
    const/4 v1, 0x0

    return-object v1
.end method


# virtual methods
.method public loadData()V
    .locals 7

    .prologue
    .line 37
    :try_start_0
    new-instance v4, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;-><init>(Lcom/hmobile/biblekjv/SwipeAdapter;Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;)V

    iput-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeImageLoader:Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;

    .line 38
    const/4 v2, 0x0

    .line 39
    .local v2, "index":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v1, v4, :cond_2

    .line 44
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 45
    .local v3, "info":Ljava/lang/String;
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    .line 46
    invoke-direct {p0, v3, v2}, Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 48
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v2, v4, :cond_0

    .line 50
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "info":Ljava/lang/String;
    check-cast v3, Ljava/lang/String;

    .line 51
    .restart local v3    # "info":Ljava/lang/String;
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v4

    .line 52
    const/4 v5, 0x1

    .line 51
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    .line 52
    const/4 v5, 0x1

    invoke-direct {p0, v3, v5}, Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 54
    :cond_0
    if-eqz v2, :cond_1

    .line 55
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->m_details:Ljava/util/ArrayList;

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "info":Ljava/lang/String;
    check-cast v3, Ljava/lang/String;

    .line 56
    .restart local v3    # "info":Ljava/lang/String;
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/SwipeView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v4

    .line 57
    const/4 v5, -0x1

    .line 56
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    .line 57
    const/4 v5, -0x1

    invoke-direct {p0, v3, v5}, Lcom/hmobile/biblekjv/SwipeAdapter;->getNewView(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 60
    :cond_1
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    iget-object v5, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeImageLoader:Lcom/hmobile/biblekjv/SwipeAdapter$SwipeImageLoader;

    invoke-virtual {v4, v5}, Lcom/hmobile/swipeview/SwipeView;->setOnPageChangedListener(Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;)V

    .line 61
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    iget-object v5, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    invoke-virtual {v4, v5}, Lcom/hmobile/swipeview/SwipeView;->setPageControl(Lcom/hmobile/swipeview/PageControl;)V

    .line 62
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v4, v2}, Lcom/hmobile/swipeview/SwipeView;->scrollToPage(I)V

    .line 67
    .end local v1    # "i":I
    .end local v2    # "index":I
    .end local v3    # "info":Ljava/lang/String;
    :goto_1
    return-void

    .line 40
    .restart local v1    # "i":I
    .restart local v2    # "index":I
    :cond_2
    iget-object v4, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->mSwipeView:Lcom/hmobile/swipeview/SwipeView;

    new-instance v5, Landroid/widget/FrameLayout;

    iget-object v6, p0, Lcom/hmobile/biblekjv/SwipeAdapter;->act:Landroid/app/Activity;

    invoke-direct {v5, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5}, Lcom/hmobile/swipeview/SwipeView;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 64
    .end local v1    # "i":I
    .end local v2    # "index":I
    :catch_0
    move-exception v0

    .line 65
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method
