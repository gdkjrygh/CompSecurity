.class public Lcom/facebook/reflex/view/c/l;
.super Ljava/lang/Object;
.source "RefreshController.java"

# interfaces
.implements Lcom/facebook/widget/refreshablelistview/b;


# instance fields
.field private final a:Lcom/facebook/reflex/view/h;

.field private final b:Lcom/facebook/reflex/view/c/n;

.field private final c:Lcom/facebook/reflex/Scroller;

.field private d:Lcom/facebook/widget/refreshablelistview/c;

.field private e:I


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/Scroller;Lcom/facebook/reflex/view/c/n;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/reflex/view/c/l;->e:I

    .line 31
    iput-object p1, p0, Lcom/facebook/reflex/view/c/l;->a:Lcom/facebook/reflex/view/h;

    .line 32
    iput-object p3, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    .line 33
    iput-object p2, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    .line 34
    return-void
.end method

.method private a(Lcom/facebook/reflex/view/c/m;)V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getState()Lcom/facebook/reflex/view/c/m;

    move-result-object v0

    if-eq p1, v0, :cond_1

    .line 80
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/n;->setState(Lcom/facebook/reflex/view/c/m;)V

    .line 81
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->d:Lcom/facebook/widget/refreshablelistview/c;

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->d:Lcom/facebook/widget/refreshablelistview/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/refreshablelistview/c;->a(Z)V

    .line 84
    :cond_0
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/l;->e()V

    .line 86
    :cond_1
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getState()Lcom/facebook/reflex/view/c/m;

    move-result-object v1

    .line 90
    const/4 v0, 0x0

    .line 91
    sget-object v2, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    if-ne v1, v2, :cond_1

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getHeight()I

    move-result v0

    .line 94
    :cond_1
    iget v1, p0, Lcom/facebook/reflex/view/c/l;->e:I

    sub-int v1, v0, v1

    .line 95
    iput v0, p0, Lcom/facebook/reflex/view/c/l;->e:I

    .line 96
    iget-object v2, p0, Lcom/facebook/reflex/view/c/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v2, v0}, Lcom/facebook/reflex/view/h;->setPaddingTop(I)V

    .line 98
    if-eqz v1, :cond_2

    .line 99
    iget-object v2, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    iget-object v3, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v3}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v3

    int-to-float v1, v1

    sub-float v1, v3, v1

    iget-object v3, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v3}, Lcom/facebook/reflex/Scroller;->d()F

    move-result v3

    invoke-virtual {v2, v1, v3}, Lcom/facebook/reflex/Scroller;->a(FF)V

    .line 101
    :cond_2
    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v0}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/c/n;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    .line 104
    :goto_0
    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getOverflowListOverlap()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    .line 105
    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/c/n;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/Widget;->e()F

    move-result v1

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_3

    .line 106
    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/c/n;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/reflex/Widget;->b(FF)V

    .line 108
    :cond_3
    return-void

    .line 101
    :cond_4
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v0}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/l;->a(Lcom/facebook/reflex/view/c/m;)V

    .line 123
    return-void
.end method

.method public a(Lcom/facebook/reflex/aj;F)V
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getHeight()I

    move-result v0

    .line 51
    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/c/n;->getState()Lcom/facebook/reflex/view/c/m;

    move-result-object v1

    sget-object v2, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    if-ne v1, v2, :cond_0

    .line 52
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    .line 69
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/l;->a(Lcom/facebook/reflex/view/c/m;)V

    .line 70
    return-void

    .line 53
    :cond_0
    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v1}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v1

    int-to-float v0, v0

    sub-float v0, v1, v0

    iget v1, p0, Lcom/facebook/reflex/view/c/l;->e:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_1

    sget-object v0, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    if-ne p1, v0, :cond_1

    .line 56
    sget-object v0, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->c:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v0}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_2

    sget-object v0, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    if-ne p1, v0, :cond_2

    .line 60
    sget-object v0, Lcom/facebook/reflex/view/c/m;->PullToRefresh:Lcom/facebook/reflex/view/c/m;

    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getState()Lcom/facebook/reflex/view/c/m;

    move-result-object v0

    sget-object v1, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    if-eq p1, v0, :cond_3

    .line 64
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    goto :goto_0

    .line 66
    :cond_3
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Normal:Lcom/facebook/reflex/view/c/m;

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 117
    sget-object v0, Lcom/facebook/reflex/view/c/m;->Normal:Lcom/facebook/reflex/view/c/m;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/l;->a(Lcom/facebook/reflex/view/c/m;)V

    .line 118
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 41
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v2}, Lcom/facebook/reflex/view/c/n;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Lcom/facebook/reflex/view/c/n;->layout(IIII)V

    .line 45
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/l;->e()V

    .line 46
    return-void
.end method

.method public d()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 73
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getMeasuredWidth()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/c/n;->measure(II)V

    .line 76
    return-void
.end method

.method public setLastLoadedTime(J)V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/reflex/view/c/l;->b:Lcom/facebook/reflex/view/c/n;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/c/n;->setLastLoadedTime(J)V

    .line 128
    return-void
.end method

.method public setOnRefreshListener(Lcom/facebook/widget/refreshablelistview/c;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/reflex/view/c/l;->d:Lcom/facebook/widget/refreshablelistview/c;

    .line 113
    return-void
.end method
