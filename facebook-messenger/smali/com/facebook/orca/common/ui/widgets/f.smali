.class public Lcom/facebook/orca/common/ui/widgets/f;
.super Lcom/facebook/widget/d;
.source "SlidingOutSuggestionViewBase.java"


# instance fields
.field private a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

.field private b:Z

.field private c:I

.field private d:Lcom/facebook/orca/common/ui/widgets/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/widgets/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/common/ui/widgets/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    sget-object v0, Lcom/facebook/q;->SlidingOutSuggestionView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 52
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    .line 53
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 54
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 55
    sget v4, Lcom/facebook/q;->SlidingOutSuggestionView_animateOutDirection:I

    if-ne v3, v4, :cond_0

    .line 56
    iget v4, p0, Lcom/facebook/orca/common/ui/widgets/f;->c:I

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/orca/common/ui/widgets/f;->c:I

    .line 53
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/widgets/f;)Lcom/facebook/widget/animatablelistview/AnimatingItemView;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    return-object v0
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 82
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->b:Z

    if-eqz v0, :cond_0

    .line 103
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 87
    :goto_1
    sget-object v2, Lcom/facebook/orca/common/ui/widgets/h;->a:[I

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/f;->d:Lcom/facebook/orca/common/ui/widgets/i;

    invoke-virtual {v3}, Lcom/facebook/orca/common/ui/widgets/i;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 102
    :cond_1
    :goto_2
    :pswitch_0
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/i;->WHATEVER:Lcom/facebook/orca/common/ui/widgets/i;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->d:Lcom/facebook/orca/common/ui/widgets/i;

    goto :goto_0

    :cond_2
    move v0, v1

    .line 86
    goto :goto_1

    .line 89
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setVisibility(I)V

    goto :goto_2

    .line 92
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setVisibility(I)V

    goto :goto_2

    .line 97
    :pswitch_3
    if-eqz v0, :cond_1

    .line 98
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/f;->b()V

    goto :goto_2

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/widgets/f;Z)Z
    .locals 0

    .prologue
    .line 24
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/widgets/f;->b:Z

    return p1
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 106
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->c:I

    if-ne v0, v5, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    .line 107
    :goto_0
    new-instance v1, Lcom/facebook/widget/animatablelistview/a;

    invoke-direct {v1}, Lcom/facebook/widget/animatablelistview/a;-><init>()V

    .line 108
    iget-object v2, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    invoke-virtual {v2, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setItemInfo(Lcom/facebook/widget/animatablelistview/a;)V

    .line 109
    const-string v2, "animationOffset"

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v0, v3, v4

    const/4 v0, 0x0

    aput v0, v3, v5

    invoke-static {v1, v2, v3}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    .line 110
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    .line 111
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Lcom/a/a/q;->a(Landroid/view/animation/Interpolator;)V

    .line 112
    new-instance v2, Lcom/facebook/orca/common/ui/widgets/g;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/common/ui/widgets/g;-><init>(Lcom/facebook/orca/common/ui/widgets/f;Lcom/facebook/widget/animatablelistview/a;)V

    invoke-virtual {v0, v2}, Lcom/a/a/q;->a(Lcom/a/a/b;)V

    .line 120
    invoke-virtual {v0}, Lcom/a/a/q;->a()V

    .line 121
    iput-boolean v5, p0, Lcom/facebook/orca/common/ui/widgets/f;->b:Z

    .line 122
    return-void

    .line 106
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0
.end method


# virtual methods
.method public d()V
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/i;->SHOW:Lcom/facebook/orca/common/ui/widgets/i;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->d:Lcom/facebook/orca/common/ui/widgets/i;

    .line 68
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/f;->a()V

    .line 69
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/i;->HIDE:Lcom/facebook/orca/common/ui/widgets/i;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->d:Lcom/facebook/orca/common/ui/widgets/i;

    .line 73
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/f;->a()V

    .line 74
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 77
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/i;->ANIMATE_OUT:Lcom/facebook/orca/common/ui/widgets/i;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->d:Lcom/facebook/orca/common/ui/widgets/i;

    .line 78
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/f;->a()V

    .line 79
    return-void
.end method

.method public getAnimateOutDirection()I
    .locals 1

    .prologue
    .line 129
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/f;->c:I

    return v0
.end method

.method public setAnimateOutDirection(I)V
    .locals 0

    .prologue
    .line 133
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/f;->c:I

    .line 134
    return-void
.end method

.method protected setContainer(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/f;->a:Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    .line 64
    return-void
.end method
