.class public Lcom/facebook/widget/animatablelistview/l;
.super Ljava/lang/Object;
.source "AnimatingListViewScrollStateController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/widget/listview/BetterListView;

.field private final b:Lcom/facebook/widget/animatablelistview/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/d",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/widget/listview/l;

.field private d:I

.field private final e:Lcom/a/a/ar;

.field private final f:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/listview/BetterListView;Lcom/facebook/widget/animatablelistview/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/listview/BetterListView;",
            "Lcom/facebook/widget/animatablelistview/d",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/animatablelistview/l;->d:I

    .line 23
    new-instance v0, Lcom/facebook/widget/animatablelistview/m;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/m;-><init>(Lcom/facebook/widget/animatablelistview/l;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->e:Lcom/a/a/ar;

    .line 31
    new-instance v0, Lcom/facebook/widget/animatablelistview/n;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/n;-><init>(Lcom/facebook/widget/animatablelistview/l;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->f:Landroid/widget/AbsListView$OnScrollListener;

    .line 63
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/l;->a:Lcom/facebook/widget/listview/BetterListView;

    .line 64
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/l;->b:Lcom/facebook/widget/animatablelistview/d;

    .line 65
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->b:Lcom/facebook/widget/animatablelistview/d;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/l;->e:Lcom/a/a/ar;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/a/a/ar;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->f:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p1, v0}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 67
    new-instance v0, Lcom/facebook/widget/listview/l;

    invoke-direct {v0}, Lcom/facebook/widget/listview/l;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->c:Lcom/facebook/widget/listview/l;

    .line 68
    return-void
.end method

.method public static a(Lcom/facebook/widget/listview/BetterListView;Lcom/facebook/widget/animatablelistview/d;)Lcom/facebook/widget/animatablelistview/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/widget/listview/BetterListView;",
            "Lcom/facebook/widget/animatablelistview/d",
            "<TT;>;)",
            "Lcom/facebook/widget/animatablelistview/l",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 57
    new-instance v0, Lcom/facebook/widget/animatablelistview/l;

    invoke-direct {v0, p0, p1}, Lcom/facebook/widget/animatablelistview/l;-><init>(Lcom/facebook/widget/listview/BetterListView;Lcom/facebook/widget/animatablelistview/d;)V

    return-object v0
.end method

.method private a(I)V
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/facebook/widget/animatablelistview/l;->d:I

    .line 83
    return-void
.end method

.method private a(Lcom/a/a/ak;)V
    .locals 2

    .prologue
    .line 71
    iget v0, p0, Lcom/facebook/widget/animatablelistview/l;->d:I

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->c:Lcom/facebook/widget/listview/l;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/l;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/l;->a(Landroid/widget/ListView;)Lcom/facebook/widget/listview/o;

    move-result-object v0

    .line 74
    sget-object v1, Lcom/facebook/widget/listview/o;->BOTTOM:Lcom/facebook/widget/listview/o;

    if-ne v0, v1, :cond_0

    .line 76
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/l;->a:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/l;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setSelection(I)V

    .line 79
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/animatablelistview/l;I)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/l;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/animatablelistview/l;Lcom/a/a/ak;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/l;->a(Lcom/a/a/ak;)V

    return-void
.end method
