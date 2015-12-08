.class public final Lkik/android/widget/au;
.super Landroid/support/v7/widget/RecyclerView$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/au$a;,
        Lkik/android/widget/au$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Landroid/content/Context;

.field private c:Lcom/kik/l/ab;

.field private d:Lcom/kik/android/a;

.field private e:Lkik/android/widget/by;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;Lkik/android/widget/by;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$a;-><init>()V

    .line 43
    iput-object p1, p0, Lkik/android/widget/au;->a:Ljava/util/List;

    .line 44
    iput-object p2, p0, Lkik/android/widget/au;->b:Landroid/content/Context;

    .line 45
    iput-object p3, p0, Lkik/android/widget/au;->c:Lcom/kik/l/ab;

    .line 46
    iput-object p4, p0, Lkik/android/widget/au;->d:Lcom/kik/android/a;

    .line 47
    iput-object p5, p0, Lkik/android/widget/au;->e:Lkik/android/widget/by;

    .line 48
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lkik/android/widget/au;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final a(I)I
    .locals 1

    .prologue
    .line 73
    if-gtz p1, :cond_0

    .line 74
    const/4 v0, 0x0

    .line 77
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 3

    .prologue
    .line 58
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 59
    new-instance v1, Lkik/android/gifs/view/ResultListGifView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/android/gifs/view/ResultListGifView;-><init>(Landroid/content/Context;)V

    .line 60
    const v0, -0x333334

    invoke-virtual {v1, v0}, Lkik/android/gifs/view/ResultListGifView;->setBackgroundColor(I)V

    .line 61
    new-instance v0, Lkik/android/widget/au$b;

    iget-object v2, p0, Lkik/android/widget/au;->e:Lkik/android/widget/by;

    invoke-direct {v0, v1, v2}, Lkik/android/widget/au$b;-><init>(Lkik/android/gifs/view/ResultListGifView;Lkik/android/widget/by;)V

    .line 66
    :goto_0
    return-object v0

    .line 64
    :cond_0
    new-instance v1, Landroid/widget/Space;

    iget-object v0, p0, Lkik/android/widget/au;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 65
    const/16 v0, 0x32

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Space;->setMinimumHeight(I)V

    .line 66
    new-instance v0, Lkik/android/widget/au$a;

    invoke-direct {v0, v1}, Lkik/android/widget/au$a;-><init>(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 3

    .prologue
    .line 94
    instance-of v0, p1, Lkik/android/widget/au$b;

    if-eqz v0, :cond_0

    .line 95
    check-cast p1, Lkik/android/widget/au$b;

    .line 96
    iget-object v0, p1, Lkik/android/widget/au$b;->l:Lkik/android/gifs/a/e;

    invoke-virtual {v0}, Lkik/android/gifs/a/e;->a()Ljava/lang/String;

    move-result-object v0

    .line 98
    iget-object v1, p1, Lkik/android/widget/au$b;->j:Lkik/android/gifs/view/ResultListGifView;

    sget-object v2, Lkik/android/gifs/a/f$a;->d:Lkik/android/gifs/a/f$a;

    invoke-virtual {v1, v0, v2}, Lkik/android/gifs/view/ResultListGifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/widget/av;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/av;-><init>(Lkik/android/widget/au;Lkik/android/widget/au$b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 106
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$t;I)V
    .locals 5

    .prologue
    const/4 v1, -0x1

    .line 111
    instance-of v0, p1, Lkik/android/widget/au$b;

    if-eqz v0, :cond_1

    .line 112
    iget-object v0, p0, Lkik/android/widget/au;->a:Ljava/util/List;

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/f;

    .line 113
    sget-object v1, Lkik/android/gifs/a/f$a;->d:Lkik/android/gifs/a/f$a;

    invoke-virtual {v0, v1}, Lkik/android/gifs/a/f;->a(Lkik/android/gifs/a/f$a;)Lkik/android/gifs/a/e;

    move-result-object v1

    .line 115
    invoke-virtual {v1}, Lkik/android/gifs/a/e;->b()Landroid/graphics/Point;

    move-result-object v2

    .line 116
    check-cast p1, Lkik/android/widget/au$b;

    .line 117
    iget-object v3, p1, Lkik/android/widget/au$b;->j:Lkik/android/gifs/view/ResultListGifView;

    iget v4, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v3, v4, v2}, Lkik/android/gifs/view/ResultListGifView;->c(II)V

    .line 119
    invoke-static {p1, v0}, Lkik/android/widget/au$b;->a(Lkik/android/widget/au$b;Lkik/android/gifs/a/f;)V

    .line 120
    invoke-static {p1, v1}, Lkik/android/widget/au$b;->a(Lkik/android/widget/au$b;Lkik/android/gifs/a/e;)V

    .line 121
    add-int/lit8 v0, p2, -0x1

    invoke-static {p1, v0}, Lkik/android/widget/au$b;->a(Lkik/android/widget/au$b;I)V

    .line 128
    :cond_0
    :goto_0
    return-void

    .line 123
    :cond_1
    instance-of v0, p1, Lkik/android/widget/au$a;

    if-eqz v0, :cond_0

    .line 124
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 125
    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->a()V

    .line 126
    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 2

    .prologue
    .line 84
    instance-of v0, p1, Lkik/android/widget/au$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 85
    check-cast v0, Lkik/android/widget/au$b;

    iget-object v0, v0, Lkik/android/widget/au$b;->j:Lkik/android/gifs/view/ResultListGifView;

    invoke-virtual {v0}, Lkik/android/gifs/view/ResultListGifView;->b()V

    move-object v0, p1

    .line 86
    check-cast v0, Lkik/android/widget/au$b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/au$b;->a(Lkik/android/widget/au$b;Z)V

    .line 88
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$a;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 89
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lkik/android/widget/au;->a:Ljava/util/List;

    return-object v0
.end method
