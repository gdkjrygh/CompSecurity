.class public Lcom/facebook/orca/emoji/TabbedPageView;
.super Lcom/facebook/widget/f;
.source "TabbedPageView.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/FrameLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/FrameLayout;

.field private g:Landroid/widget/HorizontalScrollView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/FrameLayout;

.field private k:Landroid/view/View;

.field private l:Landroid/support/v4/view/ViewPager;

.field private m:Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

.field private n:Lcom/facebook/orca/emoji/ag;

.field private o:Lcom/facebook/orca/emoji/aq;

.field private p:Lcom/facebook/orca/emoji/an;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<*>;>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation
.end field

.field private s:Z

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/emoji/TabbedPageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 128
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/emoji/TabbedPageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 132
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 135
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 137
    sget v0, Lcom/facebook/k;->orca_tabbed_page_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->setContentView(I)V

    .line 138
    sget v0, Lcom/facebook/i;->tab_loading_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->a:Landroid/view/View;

    .line 139
    sget v0, Lcom/facebook/i;->tab_loading_indicator_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->b:Landroid/widget/TextView;

    .line 140
    sget v0, Lcom/facebook/i;->empty_message:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->c:Landroid/widget/TextView;

    .line 141
    sget v0, Lcom/facebook/i;->tabbed_page_view_tab_content:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->d:Landroid/widget/FrameLayout;

    .line 142
    sget v0, Lcom/facebook/i;->tabbed_page_view_tab_bar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->e:Landroid/widget/LinearLayout;

    .line 143
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_ellipsis_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->f:Landroid/widget/FrameLayout;

    .line 144
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_scroll:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->g:Landroid/widget/HorizontalScrollView;

    .line 145
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_scroll_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->h:Landroid/widget/LinearLayout;

    .line 146
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    .line 147
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_backspace_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->j:Landroid/widget/FrameLayout;

    .line 148
    sget v0, Lcom/facebook/i;->tabbed_page_view_tabs_backspace:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->k:Landroid/view/View;

    .line 149
    sget v0, Lcom/facebook/i;->view_pager:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    .line 150
    sget v0, Lcom/facebook/i;->view_pager_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

    iput-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->m:Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/facebook/orca/emoji/ap;

    invoke-direct {v1, p0}, Lcom/facebook/orca/emoji/ap;-><init>(Lcom/facebook/orca/emoji/TabbedPageView;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/x;)V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->m:Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 157
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->TabbedPageView:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 158
    sget v1, Lcom/facebook/q;->TabbedPageView_emptyMessage:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 159
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/q;->TabbedPageView_emptyMessage:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 162
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/TabbedPageView;I)I
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/TabbedPageView;->b(I)I

    move-result v0

    return v0
.end method

.method private a(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;)I"
        }
    .end annotation

    .prologue
    .line 447
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->c()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method private a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<*>;I",
            "Ljava/lang/String;",
            ")",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    .prologue
    .line 415
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    .line 416
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->b()I

    move-result v3

    .line 417
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->a()I

    move-result v4

    .line 420
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 421
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 422
    const/4 v0, 0x0

    move v1, p3

    :goto_0
    if-ge v0, v3, :cond_0

    if-ge v1, v2, :cond_0

    .line 423
    invoke-direct {p0, p1, p2, v1, p4}, Lcom/facebook/orca/emoji/TabbedPageView;->b(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 424
    invoke-virtual {v5, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 425
    add-int/lit8 v1, v0, 0x1

    mul-int/2addr v1, v4

    add-int/2addr v1, p3

    .line 422
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 427
    :cond_0
    return-object v5
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/TabbedPageView;Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/TabbedPageView;)Lcom/facebook/orca/emoji/an;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->p:Lcom/facebook/orca/emoji/an;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 354
    iget v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    if-ne v0, p2, :cond_0

    .line 367
    :goto_0
    return-void

    .line 359
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 360
    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setSelected(Z)V

    goto :goto_1

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setSelected(Z)V

    .line 363
    iput p2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    .line 366
    invoke-direct {p0, p1, p2, v2}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/lang/String;II)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;II)V
    .locals 6

    .prologue
    .line 370
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->removeAllViews()V

    .line 371
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->q:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 372
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 375
    invoke-direct {p0, v0}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/util/List;)I

    move-result v3

    .line 376
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 377
    new-instance v4, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 376
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 381
    :cond_0
    new-instance v1, Lcom/facebook/orca/emoji/ap;

    invoke-direct {v1, p0, p1, v2, v0}, Lcom/facebook/orca/emoji/ap;-><init>(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/x;)V

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->m:Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

    invoke-virtual {v0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a()V

    .line 384
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->m:Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;

    new-instance v1, Lcom/facebook/orca/emoji/al;

    invoke-direct {v1, p0}, Lcom/facebook/orca/emoji/al;-><init>(Lcom/facebook/orca/emoji/TabbedPageView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->setOnPageChangeListener(Landroid/support/v4/view/bb;)V

    .line 402
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 404
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->p:Lcom/facebook/orca/emoji/an;

    if-eqz v0, :cond_1

    .line 405
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->p:Lcom/facebook/orca/emoji/an;

    invoke-interface {v0, p1}, Lcom/facebook/orca/emoji/an;->a(Ljava/lang/String;)V

    .line 406
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->p:Lcom/facebook/orca/emoji/an;

    invoke-interface {v0, p3}, Lcom/facebook/orca/emoji/an;->a(I)V

    .line 408
    :cond_1
    return-void
.end method

.method private b(I)I
    .locals 1

    .prologue
    .line 452
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->c()I

    move-result v0

    mul-int/2addr v0, p1

    return v0
.end method

.method private b(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<*>;I",
            "Ljava/lang/String;",
            ")",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    .prologue
    .line 435
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->a()I

    move-result v0

    add-int/2addr v0, p3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 437
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->c()I

    move-result v1

    div-int v1, p3, v1

    .line 439
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 440
    invoke-interface {p2, p3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 441
    iget-object v4, p0, Lcom/facebook/orca/emoji/TabbedPageView;->o:Lcom/facebook/orca/emoji/aq;

    invoke-interface {v4, p1, v3, p4, v1}, Lcom/facebook/orca/emoji/aq;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 443
    :cond_0
    return-object v2
.end method


# virtual methods
.method protected a(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Z)Landroid/widget/FrameLayout;
    .locals 5

    .prologue
    const/4 v4, -0x2

    .line 325
    sget v0, Lcom/facebook/k;->orca_tabbed_page_view_tab:I

    const/4 v1, 0x0

    invoke-virtual {p5, v0, p4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 327
    if-eqz p6, :cond_0

    .line 328
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x42500000    # 52.0f

    invoke-static {v2, v3}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 331
    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 332
    sget v1, Lcom/facebook/i;->tab_image:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    .line 333
    if-eqz p2, :cond_1

    .line 334
    invoke-virtual {v1, p2}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 336
    :cond_1
    if-eqz p1, :cond_2

    .line 337
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderResourceId(I)V

    .line 339
    :cond_2
    if-eqz p3, :cond_3

    .line 340
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 341
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 344
    const/16 v3, 0x35

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 345
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 347
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 349
    :cond_3
    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 296
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 297
    return-void
.end method

.method public a(Lcom/facebook/orca/emoji/ao;)V
    .locals 8

    .prologue
    .line 277
    iget-boolean v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->h:Landroid/widget/LinearLayout;

    move-object v7, v0

    .line 278
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    .line 279
    iget-object v1, p1, Lcom/facebook/orca/emoji/ao;->a:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/facebook/orca/emoji/ao;->b:Landroid/net/Uri;

    iget-object v3, p1, Lcom/facebook/orca/emoji/ao;->c:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    iget-boolean v6, p0, Lcom/facebook/orca/emoji/TabbedPageView;->s:Z

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Z)Landroid/widget/FrameLayout;

    move-result-object v0

    .line 286
    iget-object v1, p1, Lcom/facebook/orca/emoji/ao;->d:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    iget v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->t:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->t:I

    invoke-virtual {v7, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 288
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->b()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->t:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->t:I

    invoke-virtual {v7, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 289
    return-void

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    move-object v7, v0

    goto :goto_0
.end method

.method public a(Ljava/util/List;Ljava/util/List;Lcom/facebook/orca/emoji/ag;Lcom/facebook/orca/emoji/aq;Lcom/facebook/orca/emoji/an;ZLjava/lang/String;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/emoji/ao;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/emoji/am;",
            ">;",
            "Lcom/facebook/orca/emoji/ag;",
            "Lcom/facebook/orca/emoji/aq;",
            "Lcom/facebook/orca/emoji/an;",
            "Z",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 199
    iput-object p3, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    .line 200
    iput-object p4, p0, Lcom/facebook/orca/emoji/TabbedPageView;->o:Lcom/facebook/orca/emoji/aq;

    .line 201
    iput-object p5, p0, Lcom/facebook/orca/emoji/TabbedPageView;->p:Lcom/facebook/orca/emoji/an;

    .line 203
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->q:Ljava/util/List;

    .line 204
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    .line 207
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->e:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 208
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 209
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 210
    iget-object v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->g:Landroid/widget/HorizontalScrollView;

    if-eqz p6, :cond_0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 211
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->g:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz p6, :cond_1

    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 213
    iget-object v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    if-eqz p6, :cond_2

    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 214
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz p6, :cond_3

    const/4 v2, 0x0

    :goto_3
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 216
    move/from16 v0, p6

    iput-boolean v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->s:Z

    .line 217
    if-eqz p6, :cond_4

    iget-object v5, p0, Lcom/facebook/orca/emoji/TabbedPageView;->h:Landroid/widget/LinearLayout;

    .line 219
    :goto_4
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    .line 222
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->t:I

    .line 223
    const/4 v1, 0x0

    move v2, v1

    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    .line 224
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/ao;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/ao;)V

    .line 223
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    .line 210
    :cond_0
    const/16 v1, 0x8

    goto :goto_0

    .line 211
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 213
    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    .line 214
    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_3

    .line 217
    :cond_4
    iget-object v5, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    goto :goto_4

    .line 228
    :cond_5
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    .line 229
    const/4 v2, 0x0

    .line 230
    const/4 v1, 0x0

    move v8, v1

    move v9, v2

    :goto_6
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v8, v1, :cond_6

    .line 231
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/am;

    iget-object v2, v1, Lcom/facebook/orca/emoji/am;->b:Ljava/lang/Integer;

    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/am;

    iget-object v3, v1, Lcom/facebook/orca/emoji/am;->c:Landroid/net/Uri;

    const/4 v4, 0x0

    move-object v1, p0

    move/from16 v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Z)Landroid/widget/FrameLayout;

    move-result-object v2

    .line 239
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/am;

    iget-object v3, v1, Lcom/facebook/orca/emoji/am;->a:Ljava/lang/String;

    .line 241
    new-instance v1, Lcom/facebook/orca/emoji/ak;

    invoke-direct {v1, p0, v3, v8}, Lcom/facebook/orca/emoji/ak;-><init>(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;I)V

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    invoke-virtual {v5, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 248
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 249
    iget-object v4, p0, Lcom/facebook/orca/emoji/TabbedPageView;->q:Ljava/util/List;

    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/am;

    iget-object v1, v1, Lcom/facebook/orca/emoji/am;->d:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    move-object/from16 v0, p7

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 252
    iput v8, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    move/from16 v2, p8

    .line 230
    :goto_7
    add-int/lit8 v1, v8, 0x1

    move v8, v1

    move v9, v2

    goto :goto_6

    .line 258
    :cond_6
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->a:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 259
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    .line 260
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->c:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 261
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->d:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 262
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 263
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->r:Ljava/util/List;

    iget v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setSelected(Z)V

    .line 264
    iget v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/emoji/am;

    iget-object v1, v1, Lcom/facebook/orca/emoji/am;->a:Ljava/lang/String;

    iget v2, p0, Lcom/facebook/orca/emoji/TabbedPageView;->u:I

    invoke-direct {p0, v1, v2, v9}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/lang/String;II)V

    .line 274
    :goto_8
    return-void

    .line 270
    :cond_7
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->d:Landroid/widget/FrameLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 271
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->c:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 272
    iget-object v1, p0, Lcom/facebook/orca/emoji/TabbedPageView;->i:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_8

    :cond_8
    move v2, v9

    goto :goto_7
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->q:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->n:Lcom/facebook/orca/emoji/ag;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->o:Lcom/facebook/orca/emoji/aq;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b()Landroid/view/View;
    .locals 4

    .prologue
    .line 300
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 301
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/g;->divider_width:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 304
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 305
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/TabbedPageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/f;->emoji_attachment_popup_background_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 307
    return-object v0
.end method

.method public getBackspaceButtonContainer()Landroid/view/View;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->j:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public setBackspaceTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 2

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->j:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 172
    return-void
.end method

.method public setEllipsisClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->f:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 167
    return-void
.end method

.method public setEmptyMessage(I)V
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/orca/emoji/TabbedPageView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 188
    return-void
.end method
