.class public Lcom/hmobile/swipeview/PageView;
.super Lcom/hmobile/swipeview/BounceSwipeView;
.source "PageView.java"


# instance fields
.field private mAdapter:Landroid/widget/Adapter;

.field private mCarouselMode:Z

.field private mCurrentPage:I

.field private mOffset:I

.field private mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/BounceSwipeView;-><init>(Landroid/content/Context;)V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    .line 24
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->initView()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/hmobile/swipeview/BounceSwipeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    .line 30
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->initView()V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/hmobile/swipeview/BounceSwipeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    .line 36
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->initView()V

    .line 37
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/swipeview/PageView;)Z
    .locals 1

    .prologue
    .line 19
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    return v0
.end method

.method static synthetic access$1(Lcom/hmobile/swipeview/PageView;I)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/hmobile/swipeview/BounceSwipeView;->scrollToPage(I)V

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/swipeview/PageView;)Landroid/widget/Adapter;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/swipeview/PageView;I)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/hmobile/swipeview/BounceSwipeView;->smoothScrollToPage(I)V

    return-void
.end method

.method private backwardsMove()V
    .locals 1

    .prologue
    .line 372
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-lez v0, :cond_0

    .line 374
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 381
    :goto_0
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-lez v0, :cond_1

    .line 383
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->backwardsRearrange(I)V

    .line 389
    :goto_1
    return-void

    .line 378
    :cond_0
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    goto :goto_0

    .line 387
    :cond_1
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->backwardsRearrange(I)V

    goto :goto_1
.end method

.method private backwardsRearrange(I)V
    .locals 3
    .param p1, "backPageToLoad"    # I

    .prologue
    const/4 v2, 0x2

    .line 402
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 403
    .local v0, "convertView":Landroid/view/View;
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->removeViewAt(I)V

    .line 404
    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 405
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->resetMargins()V

    .line 406
    return-void
.end method

.method private emptyCarousel()V
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 137
    return-void
.end method

.method private fillCarousel(I)V
    .locals 5
    .param p1, "page"    # I

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 141
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->emptyCarousel()V

    .line 142
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 144
    invoke-direct {p0, v2, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-ne v0, v4, :cond_4

    .line 148
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_2

    .line 150
    invoke-direct {p0, v2, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 151
    invoke-direct {p0, v3, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_0

    .line 153
    :cond_2
    if-nez p1, :cond_3

    .line 155
    invoke-direct {p0, v3, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 156
    invoke-direct {p0, v2, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 157
    invoke-direct {p0, v3, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_0

    .line 161
    :cond_3
    invoke-direct {p0, v2, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 162
    invoke-direct {p0, v3, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 163
    invoke-direct {p0, v2, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_0

    .line 166
    :cond_4
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-le v0, v4, :cond_0

    .line 168
    if-nez p1, :cond_5

    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-eqz v0, :cond_5

    .line 170
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 171
    invoke-direct {p0, v2, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 172
    invoke-direct {p0, v3, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 198
    :goto_1
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->resetMargins()V

    goto :goto_0

    .line 174
    :cond_5
    if-nez p1, :cond_6

    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_6

    .line 176
    invoke-direct {p0, v2, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 177
    invoke-direct {p0, v3, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 178
    invoke-direct {p0, v4, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_1

    .line 180
    :cond_6
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_7

    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-eqz v0, :cond_7

    .line 182
    add-int/lit8 v0, p1, -0x1

    invoke-direct {p0, v0, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 183
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 184
    invoke-direct {p0, v2, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_1

    .line 186
    :cond_7
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_8

    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_8

    .line 188
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-direct {p0, v0, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 189
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-direct {p0, v0, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 190
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_1

    .line 194
    :cond_8
    add-int/lit8 v0, p1, -0x1

    invoke-direct {p0, v0, v2, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 195
    invoke-direct {p0, p1, v3, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 196
    add-int/lit8 v0, p1, 0x1

    invoke-direct {p0, v0, v4, v1}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    goto :goto_1
.end method

.method private forwardsMove()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 351
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 353
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 360
    :goto_0
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 362
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->forwardsRearrange(I)V

    .line 368
    :goto_1
    return-void

    .line 357
    :cond_0
    iput v2, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    goto :goto_0

    .line 366
    :cond_1
    invoke-direct {p0, v2}, Lcom/hmobile/swipeview/PageView;->forwardsRearrange(I)V

    goto :goto_1
.end method

.method private forwardsRearrange(I)V
    .locals 3
    .param p1, "frontPageToLoad"    # I

    .prologue
    const/4 v2, 0x0

    .line 394
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 395
    .local v0, "convertView":Landroid/view/View;
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->removeViewAt(I)V

    .line 396
    const/4 v1, 0x2

    invoke-direct {p0, p1, v1, v0}, Lcom/hmobile/swipeview/PageView;->loadPage(IILandroid/view/View;)V

    .line 397
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->resetMargins()V

    .line 398
    return-void
.end method

.method private getAdapterPageCount()I
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-eqz v0, :cond_0

    .line 121
    const/4 v0, 0x4

    .line 130
    :goto_0
    return v0

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    goto :goto_0

    .line 130
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private initView()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/PageView;->setBounceEnabled(Z)V

    .line 42
    return-void
.end method

.method private loadPage(IILandroid/view/View;)V
    .locals 2
    .param p1, "page"    # I
    .param p2, "position"    # I
    .param p3, "convertView"    # Landroid/view/View;

    .prologue
    .line 216
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 218
    add-int/lit8 p1, p1, -0x2

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-interface {v0, p1, p3, v1}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-super {p0, v0, p2}, Lcom/hmobile/swipeview/BounceSwipeView;->addView(Landroid/view/View;I)V

    .line 221
    return-void
.end method

.method private notifiyAssignedOnPageChangedListener(I)V
    .locals 5
    .param p1, "newPage"    # I

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 252
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    if-eqz v0, :cond_0

    .line 254
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-nez v0, :cond_1

    if-ne p1, v4, :cond_1

    .line 256
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    iget-object v1, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-interface {v0, v1, v2}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    .line 279
    :cond_0
    :goto_0
    return-void

    .line 258
    :cond_1
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    iget-object v1, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_2

    .line 260
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-interface {v0, v3, v1}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    goto :goto_0

    .line 262
    :cond_2
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_3

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-ne v0, v2, :cond_3

    if-ne p1, v2, :cond_3

    .line 264
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    invoke-interface {v0, v3, v2}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    goto :goto_0

    .line 266
    :cond_3
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    iget-object v1, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_4

    .line 268
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    iget-object v2, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v2}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-interface {v0, v1, v2}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    goto :goto_0

    .line 270
    :cond_4
    if-ne p1, v4, :cond_5

    .line 272
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-interface {v0, v1, v2}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    goto :goto_0

    .line 276
    :cond_5
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-interface {v0, v1, v2}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    goto :goto_0
.end method

.method private rearrangePages(IIZ)V
    .locals 5
    .param p1, "oldPage"    # I
    .param p2, "newPage"    # I
    .param p3, "smooth"    # Z

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 284
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    if-le v1, v4, :cond_1

    .line 287
    add-int/lit8 v1, p1, 0x1

    if-lt p2, v1, :cond_4

    .line 289
    iget-boolean v1, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v1, :cond_0

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    if-ge v1, v2, :cond_2

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-lez v1, :cond_2

    .line 291
    :cond_0
    iput-boolean v3, p0, Lcom/hmobile/swipeview/PageView;->mCallScrollToPageInOnLayout:Z

    .line 292
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getScrollX()I

    move-result v1

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getPageWidth()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0, v1, v3}, Lcom/hmobile/swipeview/PageView;->scrollTo(II)V

    .line 293
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->forwardsMove()V

    .line 294
    const/4 v0, 0x1

    .line 332
    .local v0, "pageToScrollTo":I
    :goto_0
    new-instance v1, Lcom/hmobile/swipeview/PageView$2;

    invoke-direct {v1, p0, p3, v0}, Lcom/hmobile/swipeview/PageView$2;-><init>(Lcom/hmobile/swipeview/PageView;ZI)V

    invoke-virtual {p0, v1}, Lcom/hmobile/swipeview/PageView;->post(Ljava/lang/Runnable;)Z

    .line 347
    .end local v0    # "pageToScrollTo":I
    :cond_1
    return-void

    .line 296
    :cond_2
    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-gtz v1, :cond_3

    .line 298
    iput v4, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 299
    const/4 v0, 0x1

    .line 300
    .restart local v0    # "pageToScrollTo":I
    goto :goto_0

    .line 303
    .end local v0    # "pageToScrollTo":I
    :cond_3
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 304
    const/4 v0, 0x2

    .line 306
    .restart local v0    # "pageToScrollTo":I
    goto :goto_0

    .line 307
    .end local v0    # "pageToScrollTo":I
    :cond_4
    add-int/lit8 v1, p1, -0x1

    if-gt p2, v1, :cond_8

    .line 309
    iget-boolean v1, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v1, :cond_5

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-le v1, v4, :cond_6

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_6

    .line 311
    :cond_5
    iput-boolean v3, p0, Lcom/hmobile/swipeview/PageView;->mCallScrollToPageInOnLayout:Z

    .line 312
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getScrollX()I

    move-result v1

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getPageWidth()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v1, v3}, Lcom/hmobile/swipeview/PageView;->scrollTo(II)V

    .line 313
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->backwardsMove()V

    .line 314
    const/4 v0, 0x1

    .line 315
    .restart local v0    # "pageToScrollTo":I
    goto :goto_0

    .line 316
    .end local v0    # "pageToScrollTo":I
    :cond_6
    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-lt v1, v2, :cond_7

    .line 318
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 319
    const/4 v0, 0x1

    .line 320
    .restart local v0    # "pageToScrollTo":I
    goto :goto_0

    .line 323
    .end local v0    # "pageToScrollTo":I
    :cond_7
    iput v3, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 324
    const/4 v0, 0x0

    .line 326
    .restart local v0    # "pageToScrollTo":I
    goto :goto_0

    .line 329
    .end local v0    # "pageToScrollTo":I
    :cond_8
    const/4 v0, 0x1

    .restart local v0    # "pageToScrollTo":I
    goto :goto_0
.end method

.method private refill(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 449
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-nez v0, :cond_2

    .line 451
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_0

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, 0x1

    if-gt p1, v0, :cond_1

    .line 453
    :cond_0
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->fillCarousel(I)V

    .line 470
    :cond_1
    :goto_0
    return-void

    .line 456
    :cond_2
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0}, Lcom/hmobile/swipeview/PageView;->getAdapterPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_4

    .line 458
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-ge p1, v0, :cond_3

    if-nez p1, :cond_1

    .line 460
    :cond_3
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->fillCarousel(I)V

    goto :goto_0

    .line 465
    :cond_4
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, -0x1

    if-lt p1, v0, :cond_1

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, 0x1

    if-gt p1, v0, :cond_1

    .line 467
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    invoke-direct {p0, v0}, Lcom/hmobile/swipeview/PageView;->fillCarousel(I)V

    goto :goto_0
.end method

.method private resetMargins()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 410
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mOffset:I

    if-lez v0, :cond_0

    .line 412
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mOffset:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 413
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 415
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 416
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 418
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 419
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getChildContainer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/hmobile/swipeview/PageView;->mOffset:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 421
    :cond_0
    return-void
.end method

.method private scrollToPage(IZ)V
    .locals 2
    .param p1, "page"    # I
    .param p2, "smooth"    # Z

    .prologue
    .line 237
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getCurrentPage()I

    move-result v0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getCurrentPage()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 238
    :cond_0
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getCurrentPage()I

    move-result v0

    if-nez v0, :cond_3

    if-gtz p1, :cond_3

    .line 240
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->doAtEdgeAnimation()V

    .line 247
    :cond_2
    :goto_0
    return-void

    .line 242
    :cond_3
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getCurrentPage()I

    move-result v0

    if-eq v0, p1, :cond_2

    .line 244
    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageView;->getCurrentPage()I

    move-result v0

    invoke-direct {p0, v0, p1, p2}, Lcom/hmobile/swipeview/PageView;->rearrangePages(IIZ)V

    .line 245
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/PageView;->notifiyAssignedOnPageChangedListener(I)V

    goto :goto_0
.end method


# virtual methods
.method public getAdapter()Landroid/widget/Adapter;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    return-object v0
.end method

.method public getCarouselEnabled()Z
    .locals 1

    .prologue
    .line 68
    iget-boolean v0, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    return v0
.end method

.method public getOnPageChangedListener()Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    return-object v0
.end method

.method public getRealCurrentPage()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    return v0
.end method

.method public itemAddedToAdapter(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 425
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-gt p1, v0, :cond_0

    .line 427
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 431
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/PageView;->setBounceEnabled(Z)V

    .line 434
    :cond_1
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/PageView;->refill(I)V

    .line 435
    return-void
.end method

.method public itemRemovedFromAdapter(I)V
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 439
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-gt p1, v0, :cond_0

    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    if-eqz v0, :cond_0

    .line 441
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 444
    :cond_0
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/PageView;->refill(I)V

    .line 445
    return-void
.end method

.method public scrollToPage(I)V
    .locals 1
    .param p1, "page"    # I

    .prologue
    .line 232
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/hmobile/swipeview/PageView;->scrollToPage(IZ)V

    .line 233
    return-void
.end method

.method public setAdapter(Landroid/widget/BaseAdapter;)V
    .locals 1
    .param p1, "adapter"    # Landroid/widget/BaseAdapter;

    .prologue
    .line 73
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/hmobile/swipeview/PageView;->setAdapter(Landroid/widget/BaseAdapter;I)V

    .line 74
    return-void
.end method

.method public setAdapter(Landroid/widget/BaseAdapter;I)V
    .locals 2
    .param p1, "adapter"    # Landroid/widget/BaseAdapter;
    .param p2, "startPosition"    # I

    .prologue
    const/4 v1, 0x1

    .line 78
    iput-object p1, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    .line 79
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    if-eqz v0, :cond_0

    .line 81
    iput p2, p0, Lcom/hmobile/swipeview/PageView;->mCurrentPage:I

    .line 82
    invoke-direct {p0, p2}, Lcom/hmobile/swipeview/PageView;->fillCarousel(I)V

    .line 83
    new-instance v0, Lcom/hmobile/swipeview/PageView$1;

    invoke-direct {v0, p0, p2}, Lcom/hmobile/swipeview/PageView$1;-><init>(Lcom/hmobile/swipeview/PageView;I)V

    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/PageView;->post(Ljava/lang/Runnable;)Z

    .line 102
    iget-object v0, p0, Lcom/hmobile/swipeview/PageView;->mAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-gt v0, v1, :cond_0

    .line 104
    invoke-virtual {p0, v1}, Lcom/hmobile/swipeview/PageView;->setBounceEnabled(Z)V

    .line 107
    :cond_0
    return-void
.end method

.method public setCarouselEnabled(Z)V
    .locals 1
    .param p1, "enabled"    # Z

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/hmobile/swipeview/PageView;->mCarouselMode:Z

    .line 63
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/PageView;->setBounceEnabled(Z)V

    .line 64
    return-void

    .line 63
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public setOnPageChangedListener(Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;)V
    .locals 0
    .param p1, "onPageChangedListener"    # Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .prologue
    .line 205
    iput-object p1, p0, Lcom/hmobile/swipeview/PageView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .line 206
    return-void
.end method

.method public setPageWidth(I)I
    .locals 1
    .param p1, "pageWidth"    # I

    .prologue
    .line 56
    invoke-super {p0, p1}, Lcom/hmobile/swipeview/BounceSwipeView;->setPageWidth(I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/swipeview/PageView;->mOffset:I

    .line 57
    iget v0, p0, Lcom/hmobile/swipeview/PageView;->mOffset:I

    return v0
.end method

.method public smoothScrollToPage(I)V
    .locals 1
    .param p1, "page"    # I

    .prologue
    .line 226
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/hmobile/swipeview/PageView;->scrollToPage(IZ)V

    .line 227
    return-void
.end method
