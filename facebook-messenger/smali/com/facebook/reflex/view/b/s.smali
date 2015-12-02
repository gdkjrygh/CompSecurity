.class public Lcom/facebook/reflex/view/b/s;
.super Landroid/view/ViewGroup;
.source "WidgetLayoutRoot.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/r;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/reflex/view/b/p;

.field private final c:Landroid/view/View;

.field private final d:Lcom/facebook/reflex/Widget;

.field private e:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/reflex/view/b/s;

    sput-object v0, Lcom/facebook/reflex/view/b/s;->a:Ljava/lang/Class;

    return-void
.end method

.method private a(I)I
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 180
    if-ltz p1, :cond_0

    .line 181
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 183
    :goto_0
    return v0

    :cond_0
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 173
    iget v0, p0, Lcom/facebook/reflex/view/b/s;->e:I

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/b/s;->a(I)I

    move-result v0

    .line 174
    iget v1, p0, Lcom/facebook/reflex/view/b/s;->f:I

    invoke-direct {p0, v1}, Lcom/facebook/reflex/view/b/s;->a(I)I

    move-result v1

    .line 175
    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/view/b/s;->measure(II)V

    .line 176
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v2, v2, v0, v1}, Lcom/facebook/reflex/view/b/s;->layout(IIII)V

    .line 177
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 122
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->e()V

    .line 123
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->e()V

    .line 142
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 146
    return-object p0
.end method

.method public forceLayout()V
    .locals 1

    .prologue
    .line 166
    invoke-super {p0}, Landroid/view/ViewGroup;->forceLayout()V

    .line 167
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->b:Lcom/facebook/reflex/view/b/p;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->b:Lcom/facebook/reflex/view/b/p;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/view/b/p;->a(Lcom/facebook/reflex/view/b/s;)V

    .line 170
    :cond_0
    return-void
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->getBackingContent()Lcom/facebook/reflex/d;

    move-result-object v0

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->d:Lcom/facebook/reflex/Widget;

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getScrollX()I

    move-result v0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 90
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getScrollY()I

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 117
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/s;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 118
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 107
    iget v0, p0, Lcom/facebook/reflex/view/b/s;->e:I

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/b/s;->a(I)I

    move-result v0

    .line 108
    iget v1, p0, Lcom/facebook/reflex/view/b/s;->f:I

    invoke-direct {p0, v1}, Lcom/facebook/reflex/view/b/s;->a(I)I

    move-result v1

    .line 109
    iget-object v2, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 110
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/reflex/view/b/s;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/view/b/s;->setMeasuredDimension(II)V

    .line 111
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 163
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 151
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 155
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->b:Lcom/facebook/reflex/view/b/p;

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/facebook/reflex/view/b/s;->b:Lcom/facebook/reflex/view/b/p;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/view/b/p;->a(Lcom/facebook/reflex/view/b/s;)V

    .line 158
    :cond_0
    return-void
.end method
