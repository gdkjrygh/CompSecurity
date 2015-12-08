.class public Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
.super Landroid/widget/ScrollView;
.source "ParallaxScrollView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;,
        Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_ALPHA_FACTOR:F = -1.0f

.field private static final DEFAULT_INNER_PARALLAX_FACTOR:F = 1.9f

.field private static final DEFAULT_PARALLAX_FACTOR:F = 1.9f

.field private static final DEFAULT_PARALLAX_VIEWS:I = 0x1


# instance fields
.field private final TAG:Ljava/lang/String;

.field private allowSwiping:Z

.field private alphaFactor:F

.field private innerParallaxFactor:F

.field private mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

.field private numOfParallaxViews:I

.field private parallaxFactor:F

.field private parallaxedViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nirhart/parallaxscroll/views/ParallaxedView;",
            ">;"
        }
    .end annotation
.end field

.field private reachedEnd:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x1

    const v1, 0x3ff33333    # 1.9f

    .line 48
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->TAG:Ljava/lang/String;

    .line 23
    iput v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->numOfParallaxViews:I

    .line 24
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->innerParallaxFactor:F

    .line 25
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxFactor:F

    .line 26
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxedViews:Ljava/util/ArrayList;

    .line 29
    iput-boolean v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v2, 0x1

    const v1, 0x3ff33333    # 1.9f

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->TAG:Ljava/lang/String;

    .line 23
    iput v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->numOfParallaxViews:I

    .line 24
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->innerParallaxFactor:F

    .line 25
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxFactor:F

    .line 26
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxedViews:Ljava/util/ArrayList;

    .line 29
    iput-boolean v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    .line 44
    invoke-virtual {p0, p1, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v2, 0x1

    const v1, 0x3ff33333    # 1.9f

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->TAG:Ljava/lang/String;

    .line 23
    iput v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->numOfParallaxViews:I

    .line 24
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->innerParallaxFactor:F

    .line 25
    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxFactor:F

    .line 26
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxedViews:Ljava/util/ArrayList;

    .line 29
    iput-boolean v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    return-void
.end method

.method private makeViewsParallax()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 67
    invoke-virtual {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getChildCount()I

    move-result v4

    if-lez v4, :cond_0

    invoke-virtual {p0, v5}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v4, v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_0

    .line 68
    invoke-virtual {p0, v5}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 69
    .local v3, "viewsHolder":Landroid/view/ViewGroup;
    iget v4, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->numOfParallaxViews:I

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 70
    .local v1, "numOfParallaxViews":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v1, :cond_0

    .line 71
    new-instance v2, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-direct {v2, p0, v4}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;-><init>(Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;Landroid/view/View;)V

    .line 72
    .local v2, "parallaxedView":Lcom/nirhart/parallaxscroll/views/ParallaxedView;
    iget-object v4, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxedViews:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 75
    .end local v0    # "i":I
    .end local v1    # "numOfParallaxViews":I
    .end local v2    # "parallaxedView":Lcom/nirhart/parallaxscroll/views/ParallaxedView;
    .end local v3    # "viewsHolder":Landroid/view/ViewGroup;
    :cond_0
    return-void
.end method


# virtual methods
.method public allowSwiping(Z)V
    .locals 0
    .param p1, "tf"    # Z

    .prologue
    .line 154
    iput-boolean p1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    .line 155
    return-void
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v3, 0x1

    const v2, 0x3ff33333    # 1.9f

    .line 52
    sget-object v1, Lcom/aetn/history/android/historyhere/R$styleable;->ParallaxScroll:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 53
    .local v0, "typeArray":Landroid/content/res/TypedArray;
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxFactor:F

    .line 54
    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    .line 55
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->innerParallaxFactor:F

    .line 56
    const/4 v1, 0x3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->numOfParallaxViews:I

    .line 57
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 58
    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Landroid/widget/ScrollView;->onFinishInflate()V

    .line 63
    invoke-direct {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->makeViewsParallax()V

    .line 64
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 129
    const-string v0, "swiper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onInterceptTouchEvent:allowSwiping:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 134
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onScrollChanged(IIII)V
    .locals 11
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "oldl"    # I
    .param p4, "oldt"    # I

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 79
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 80
    iget v3, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxFactor:F

    .line 81
    .local v3, "parallax":F
    iget v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    .line 82
    .local v0, "alpha":F
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->parallaxedViews:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    .line 83
    .local v4, "parallaxedView":Lcom/nirhart/parallaxscroll/views/ParallaxedView;
    int-to-float v7, p2

    div-float/2addr v7, v3

    invoke-virtual {v4, v7}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setOffset(F)V

    .line 84
    iget v7, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->innerParallaxFactor:F

    mul-float/2addr v3, v7

    .line 85
    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v7, v0, v7

    if-eqz v7, :cond_0

    .line 86
    if-gtz p2, :cond_1

    const/high16 v2, 0x3f800000    # 1.0f

    .line 87
    .local v2, "fixedAlpha":F
    :goto_1
    invoke-virtual {v4, v2}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setAlpha(F)V

    .line 88
    iget v7, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->alphaFactor:F

    div-float/2addr v0, v7

    .line 90
    .end local v2    # "fixedAlpha":F
    :cond_0
    invoke-virtual {v4}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->animateNow()V

    goto :goto_0

    .line 86
    :cond_1
    const/high16 v7, 0x42c80000    # 100.0f

    int-to-float v8, p2

    mul-float/2addr v8, v0

    div-float v2, v7, v8

    goto :goto_1

    .line 92
    .end local v4    # "parallaxedView":Lcom/nirhart/parallaxscroll/views/ParallaxedView;
    :cond_2
    invoke-virtual {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getChildCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {p0, v6}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 93
    .local v5, "view":Landroid/view/View;
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-virtual {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getHeight()I

    move-result v7

    invoke-virtual {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->getScrollY()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    add-int/2addr v7, v8

    sub-int v1, v6, v7

    .line 94
    .local v1, "diff":I
    iget-boolean v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    if-nez v6, :cond_4

    .line 95
    if-nez v1, :cond_3

    .line 96
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->TAG:Ljava/lang/String;

    const-string v7, "MyScrollView: Bottom has been reached"

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    if-eqz v6, :cond_3

    .line 98
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    invoke-interface {v6, v10}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;->onScrollReachedEnd(Z)V

    .line 99
    iput-boolean v10, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    .line 111
    :cond_3
    :goto_2
    return-void

    .line 103
    :cond_4
    if-lez v1, :cond_3

    .line 104
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->TAG:Ljava/lang/String;

    const-string v7, "MyScrollView: no longer at bottom"

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    if-eqz v6, :cond_3

    .line 106
    iget-object v6, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    invoke-interface {v6, v9}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;->onScrollReachedEnd(Z)V

    .line 107
    iput-boolean v9, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->reachedEnd:Z

    goto :goto_2
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 140
    const-string v0, "swiper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onTouchEvent:allowSwiping:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    iget-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping:Z

    if-eqz v0, :cond_0

    .line 142
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 144
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOnScrollListener(Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    .prologue
    .line 148
    iput-object p1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->mOnScrollListener:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;

    .line 149
    return-void
.end method
