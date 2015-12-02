.class public Lcom/facebook/reflex/view/p;
.super Landroid/widget/ScrollView;
.source "ScrollView.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/h;
.implements Lcom/facebook/reflex/view/b/i;
.implements Lcom/facebook/reflex/view/b/r;


# instance fields
.field protected a:Lcom/facebook/reflex/view/b/a;

.field private b:Lcom/facebook/reflex/Scroller;

.field private c:Lcom/facebook/reflex/view/b/m;

.field private d:F

.field private e:Landroid/graphics/Canvas;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->e:Landroid/graphics/Canvas;

    .line 47
    invoke-direct {p0}, Lcom/facebook/reflex/view/p;->a()V

    .line 48
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p2}, Lcom/facebook/reflex/view/b/a;->a(Landroid/util/AttributeSet;)V

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/p;F)F
    .locals 0

    .prologue
    .line 30
    iput p1, p0, Lcom/facebook/reflex/view/p;->d:F

    return p1
.end method

.method private a()V
    .locals 2

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/reflex/view/b/a;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/b/a;-><init>(Lcom/facebook/reflex/view/b/i;Lcom/facebook/reflex/view/b/h;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    .line 59
    new-instance v0, Lcom/facebook/reflex/Scroller;

    invoke-direct {v0}, Lcom/facebook/reflex/Scroller;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    .line 60
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    iget-object v1, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/Widget;)V

    .line 61
    new-instance v0, Lcom/facebook/reflex/view/q;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/q;-><init>(Lcom/facebook/reflex/view/p;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->c:Lcom/facebook/reflex/view/b/m;

    .line 69
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    iget-object v1, p0, Lcom/facebook/reflex/view/p;->c:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/d;)V

    .line 70
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    new-instance v1, Lcom/facebook/reflex/view/r;

    invoke-direct {v1, p0}, Lcom/facebook/reflex/view/r;-><init>(Lcom/facebook/reflex/view/p;)V

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/ah;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(F)V

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/p;Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/p;->b(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 119
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->e:Landroid/graphics/Canvas;

    .line 120
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->draw(Landroid/graphics/Canvas;)V

    .line 122
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/reflex/view/p;->e:Landroid/graphics/Canvas;

    .line 104
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->draw(Landroid/graphics/Canvas;)V

    .line 105
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 223
    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 228
    :goto_0
    return v0

    .line 227
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 228
    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public b()Landroid/view/ViewGroup;
    .locals 0

    .prologue
    .line 109
    return-object p0
.end method

.method public c()Lcom/facebook/reflex/view/b/r;
    .locals 0

    .prologue
    .line 114
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 218
    const/4 v0, 0x1

    return v0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->e:Landroid/graphics/Canvas;

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 127
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x1

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 191
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/p;->e:Landroid/graphics/Canvas;

    .line 192
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->draw(Landroid/graphics/Canvas;)V

    .line 193
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->f()V

    .line 198
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->c:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->f()V

    .line 199
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 203
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->c:Lcom/facebook/reflex/view/b/m;

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/facebook/reflex/view/p;->d:F

    float-to-int v0, v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->e()Z

    .line 181
    :cond_0
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/view/b/a;->a(IIII)Z

    .line 173
    :cond_0
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Rect;)Z

    .line 166
    :cond_0
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/b/a;->a([ILandroid/graphics/Rect;)Z

    .line 186
    const/4 v0, 0x0

    return-object v0
.end method

.method public isHorizontalScrollBarEnabled()Z
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    return v0
.end method

.method public isVerticalScrollBarEnabled()Z
    .locals 1

    .prologue
    .line 134
    const/4 v0, 0x0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 147
    invoke-super/range {p0 .. p5}, Landroid/widget/ScrollView;->onLayout(ZIIII)V

    .line 148
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Scroller;->a(II)V

    .line 149
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->c:Lcom/facebook/reflex/view/b/m;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/m;->a(II)V

    .line 150
    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {p0, v4}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v4}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/a;->a(II)V

    .line 154
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->b:Lcom/facebook/reflex/Scroller;

    const/4 v1, 0x0

    invoke-virtual {p0, v4}, Lcom/facebook/reflex/view/p;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/reflex/view/p;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Scroller;->a(FF)V

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->g()V

    .line 159
    return-void
.end method

.method public scrollTo(II)V
    .locals 1

    .prologue
    .line 98
    int-to-float v0, p2

    iput v0, p0, Lcom/facebook/reflex/view/p;->d:F

    .line 99
    return-void
.end method

.method public setAndroidTouchMode(Ljava/util/EnumSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Ljava/util/EnumSet;)V

    .line 249
    return-void
.end method

.method public setCompatibilityDrawEnabled(Z)V
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->b(Z)V

    .line 259
    return-void
.end method

.method public setDispatchAndroidTouchEventsEnabled(Z)V
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/reflex/view/p;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Z)V

    .line 239
    return-void
.end method
