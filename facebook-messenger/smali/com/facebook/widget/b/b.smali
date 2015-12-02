.class public Lcom/facebook/widget/b/b;
.super Ljava/lang/Object;
.source "BetterViewOnScrollListener.java"


# instance fields
.field private final a:Lcom/facebook/common/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/a",
            "<",
            "Landroid/widget/AbsListView$OnScrollListener;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/widget/AbsListView$OnScrollListener;

.field private c:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lcom/facebook/common/b/a;

    invoke-direct {v0}, Lcom/facebook/common/b/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    .line 25
    new-instance v0, Lcom/facebook/widget/b/c;

    invoke-direct {v0, p0}, Lcom/facebook/widget/b/c;-><init>(Lcom/facebook/widget/b/b;)V

    iput-object v0, p0, Lcom/facebook/widget/b/b;->b:Landroid/widget/AbsListView$OnScrollListener;

    .line 38
    return-void
.end method

.method private a(Landroid/widget/AbsListView;I)V
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/widget/b/b;->c:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/facebook/widget/b/b;->c:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 44
    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v1}, Lcom/facebook/common/b/a;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 45
    iget-object v0, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/common/b/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 44
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method private a(Landroid/widget/AbsListView;III)V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/widget/b/b;->c:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/facebook/widget/b/b;->c:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 54
    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v1}, Lcom/facebook/common/b/a;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 55
    iget-object v0, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/common/b/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 54
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/b/b;Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/b/b;->a(Landroid/widget/AbsListView;I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/b/b;Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/widget/b/b;->a(Landroid/widget/AbsListView;III)V

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/AbsListView$OnScrollListener;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/widget/b/b;->b:Landroid/widget/AbsListView$OnScrollListener;

    return-object v0
.end method

.method public a(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/widget/b/b;->c:Landroid/widget/AbsListView$OnScrollListener;

    .line 73
    return-void
.end method

.method public b(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/common/b/a;->add(Ljava/lang/Object;)Z

    .line 81
    return-void
.end method

.method public c(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/widget/b/b;->a:Lcom/facebook/common/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/common/b/a;->remove(Ljava/lang/Object;)Z

    .line 89
    return-void
.end method
