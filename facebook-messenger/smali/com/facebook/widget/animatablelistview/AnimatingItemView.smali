.class public Lcom/facebook/widget/animatablelistview/AnimatingItemView;
.super Lcom/facebook/widget/f;
.source "AnimatingItemView.java"


# instance fields
.field private a:Lcom/facebook/widget/animatablelistview/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/a",
            "<*>;"
        }
    .end annotation
.end field

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private final g:Lcom/facebook/widget/s;

.field private h:Lcom/facebook/widget/animatablelistview/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 22
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    .line 23
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    .line 24
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    .line 25
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    .line 27
    new-instance v0, Lcom/facebook/widget/s;

    invoke-direct {v0, p0}, Lcom/facebook/widget/s;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    .line 29
    new-instance v0, Lcom/facebook/widget/animatablelistview/c;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/c;-><init>(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->h:Lcom/facebook/widget/animatablelistview/b;

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    .line 23
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    .line 24
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    .line 25
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    .line 27
    new-instance v0, Lcom/facebook/widget/s;

    invoke-direct {v0, p0}, Lcom/facebook/widget/s;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    .line 29
    new-instance v0, Lcom/facebook/widget/animatablelistview/c;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/c;-><init>(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->h:Lcom/facebook/widget/animatablelistview/b;

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    .line 23
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    .line 24
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    .line 25
    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    .line 27
    new-instance v0, Lcom/facebook/widget/s;

    invoke-direct {v0, p0}, Lcom/facebook/widget/s;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    .line 29
    new-instance v0, Lcom/facebook/widget/animatablelistview/c;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/c;-><init>(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->h:Lcom/facebook/widget/animatablelistview/b;

    .line 47
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 71
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    if-eqz v0, :cond_4

    .line 72
    iget v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v3}, Lcom/facebook/widget/animatablelistview/a;->a()F

    move-result v3

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_2

    move v0, v1

    .line 73
    :goto_0
    iget v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    iget-object v4, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v4}, Lcom/facebook/widget/animatablelistview/a;->e()I

    move-result v4

    if-eq v3, v4, :cond_3

    .line 75
    :goto_1
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/a;->a()F

    move-result v2

    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    .line 76
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/a;->e()I

    move-result v2

    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    .line 77
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/a;->b()F

    move-result v2

    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    .line 78
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/a;->c()F

    move-result v2

    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    .line 79
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/a;->d()F

    move-result v2

    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    .line 91
    :goto_2
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    iget v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    invoke-virtual {v2, v3}, Lcom/facebook/widget/s;->setScaleX(F)V

    .line 92
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    iget v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    invoke-virtual {v2, v3}, Lcom/facebook/widget/s;->setScaleY(F)V

    .line 93
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    iget v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    invoke-virtual {v2, v3}, Lcom/facebook/widget/s;->setAlpha(F)V

    .line 95
    if-eqz v1, :cond_0

    .line 96
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->g:Lcom/facebook/widget/s;

    iget v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    invoke-virtual {v1, v2}, Lcom/facebook/widget/s;->setVisibility(I)V

    .line 98
    :cond_0
    if-eqz v0, :cond_1

    .line 99
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->requestLayout()V

    .line 101
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 72
    goto :goto_0

    :cond_3
    move v1, v2

    .line 73
    goto :goto_1

    .line 81
    :cond_4
    iget v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    cmpl-float v0, v0, v4

    if-eqz v0, :cond_5

    move v0, v1

    .line 82
    :goto_3
    iget v3, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    if-eqz v3, :cond_6

    .line 84
    :goto_4
    iput v4, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    .line 85
    iput v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->f:I

    .line 86
    iput v4, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->c:F

    .line 87
    iput v4, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->d:F

    .line 88
    iput v4, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->e:F

    goto :goto_2

    :cond_5
    move v0, v2

    .line 81
    goto :goto_3

    :cond_6
    move v1, v2

    .line 82
    goto :goto_4
.end method

.method static synthetic a(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a()V

    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 9

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getChildCount()I

    move-result v7

    .line 139
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingLeft()I

    move-result v1

    .line 140
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingRight()I

    move-result v2

    sub-int v2, v0, v2

    .line 142
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingTop()I

    move-result v3

    .line 143
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getTop()I

    move-result v4

    sub-int/2addr v0, v4

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingBottom()I

    move-result v4

    sub-int v4, v0, v4

    .line 145
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    if-ge v6, v7, :cond_2

    .line 146
    invoke-virtual {p0, v6}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 147
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v8, 0x8

    if-eq v0, v8, :cond_1

    .line 148
    iget v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    const/4 v8, 0x0

    cmpg-float v0, v0, v8

    if-gez v0, :cond_0

    .line 149
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int v8, v4, v3

    sub-int/2addr v0, v8

    .line 150
    sub-int/2addr v3, v0

    .line 151
    sub-int/2addr v4, v0

    :cond_0
    move-object v0, p0

    .line 153
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->layoutChild(IIIILandroid/view/View;)V

    .line 145
    :cond_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 156
    :cond_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 105
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getChildCount()I

    move-result v9

    move v8, v3

    move v6, v3

    move v7, v3

    .line 111
    :goto_0
    if-ge v8, v9, :cond_0

    .line 112
    invoke-virtual {p0, v8}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 113
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    .line 114
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 115
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 111
    :goto_1
    add-int/lit8 v2, v8, 0x1

    move v8, v2

    move v6, v0

    move v7, v1

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, v6

    .line 122
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v7

    .line 124
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 125
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 129
    int-to-float v1, v1

    iget v2, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->b:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    .line 130
    invoke-static {v0, p1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setMeasuredDimension(II)V

    .line 133
    return-void

    :cond_1
    move v0, v6

    move v1, v7

    goto :goto_1
.end method

.method public setItemInfo(Lcom/facebook/widget/animatablelistview/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/a",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->h:Lcom/facebook/widget/animatablelistview/b;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->b(Lcom/facebook/widget/animatablelistview/b;)V

    .line 58
    :cond_0
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    .line 59
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a:Lcom/facebook/widget/animatablelistview/a;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->h:Lcom/facebook/widget/animatablelistview/b;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->a(Lcom/facebook/widget/animatablelistview/b;)V

    .line 62
    :cond_1
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->a()V

    .line 63
    return-void
.end method
