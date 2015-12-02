.class Lcom/facebook/orca/emoji/ap;
.super Landroid/support/v4/view/x;
.source "TabbedPageView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/TabbedPageView;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/FrameLayout;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/TabbedPageView;)V
    .locals 1

    .prologue
    .line 461
    iput-object p1, p0, Lcom/facebook/orca/emoji/ap;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-direct {p0}, Landroid/support/v4/view/x;-><init>()V

    .line 462
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/orca/emoji/ap;->b:Ljava/lang/String;

    .line 463
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/emoji/ap;->c:Ljava/util/List;

    .line 464
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/emoji/ap;->d:Ljava/util/List;

    .line 465
    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/widget/FrameLayout;",
            ">;",
            "Ljava/util/List",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 467
    iput-object p1, p0, Lcom/facebook/orca/emoji/ap;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-direct {p0}, Landroid/support/v4/view/x;-><init>()V

    .line 468
    iput-object p2, p0, Lcom/facebook/orca/emoji/ap;->b:Ljava/lang/String;

    .line 469
    iput-object p3, p0, Lcom/facebook/orca/emoji/ap;->c:Ljava/util/List;

    .line 470
    iput-object p4, p0, Lcom/facebook/orca/emoji/ap;->d:Ljava/util/List;

    .line 471
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Lcom/facebook/orca/emoji/ap;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6

    .prologue
    .line 480
    iget-object v0, p0, Lcom/facebook/orca/emoji/ap;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 481
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 482
    iget-object v1, p0, Lcom/facebook/orca/emoji/ap;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/emoji/ap;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/orca/emoji/ap;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-static {v4, p2}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/TabbedPageView;I)I

    move-result v4

    iget-object v5, p0, Lcom/facebook/orca/emoji/ap;->b:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4, v5}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/TabbedPageView;Landroid/content/Context;Ljava/util/List;ILjava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 488
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 490
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 491
    return-object v0
.end method

.method public a(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 496
    check-cast p1, Landroid/support/v4/view/ViewPager;

    check-cast p3, Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    .line 497
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 501
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
