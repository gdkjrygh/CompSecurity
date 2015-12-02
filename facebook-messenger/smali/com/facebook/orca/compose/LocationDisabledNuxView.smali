.class public Lcom/facebook/orca/compose/LocationDisabledNuxView;
.super Lcom/facebook/widget/f;
.source "LocationDisabledNuxView.java"


# instance fields
.field private a:Lcom/facebook/orca/prefs/az;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageButton;

.field private d:Lcom/facebook/messages/ipc/k;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a()V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a()V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a()V

    .line 54
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    iput-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a:Lcom/facebook/orca/prefs/az;

    .line 59
    const-class v0, Lcom/facebook/messages/ipc/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/ipc/k;

    iput-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->d:Lcom/facebook/messages/ipc/k;

    .line 62
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setVisibility(I)V

    .line 65
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setClickable(Z)V

    .line 66
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->e()V

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->f:Z

    if-eqz v0, :cond_0

    .line 102
    :goto_0
    return-void

    .line 72
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->f:Z

    .line 74
    sget v0, Lcom/facebook/k;->orca_location_disabled_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setContentView(I)V

    .line 75
    sget v0, Lcom/facebook/i;->compose_location_nux_close_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->c:Landroid/widget/ImageButton;

    .line 76
    sget v0, Lcom/facebook/i;->compose_location_nux_text2:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->b:Landroid/widget/TextView;

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->b:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 79
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 80
    new-instance v1, Lcom/facebook/orca/compose/as;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/as;-><init>(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 87
    invoke-virtual {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 88
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 89
    sget v3, Lcom/facebook/o;->compose_location_disabled_nux_text:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 90
    const-string v3, "[[link]]"

    sget v4, Lcom/facebook/o;->compose_location_disabled_nux_link:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x21

    invoke-virtual {v2, v3, v1, v0, v4}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->b:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->c:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/compose/at;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/at;-><init>(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->d()V

    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 138
    iget-boolean v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->e:Z

    if-nez v0, :cond_0

    .line 147
    :goto_0
    return-void

    .line 141
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setVisibility(I)V

    .line 142
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 143
    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 144
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillEnabled(Z)V

    .line 145
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 146
    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->b()V

    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "dismissed_location_disabled_nux"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;)V

    .line 151
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setVisibility(I)V

    .line 152
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->c()V

    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 155
    invoke-virtual {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 156
    iget-object v1, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->d:Lcom/facebook/messages/ipc/k;

    invoke-interface {v1, v0}, Lcom/facebook/messages/ipc/k;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 158
    return-void
.end method


# virtual methods
.method a(Z)V
    .locals 3

    .prologue
    .line 123
    iput-boolean p1, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->e:Z

    .line 124
    if-nez p1, :cond_0

    .line 125
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setVisibility(I)V

    .line 135
    :goto_0
    return-void

    .line 127
    :cond_0
    new-instance v0, Lcom/facebook/orca/compose/au;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/au;-><init>(Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .prologue
    .line 107
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->onLayout(ZIIII)V

    .line 109
    if-eqz p1, :cond_0

    .line 110
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 111
    iget-object v1, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->c:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->getHitRect(Landroid/graphics/Rect;)V

    .line 112
    invoke-virtual {p0}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 113
    iget v2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 114
    iget v2, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 115
    iget v2, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 116
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 117
    new-instance v1, Landroid/view/TouchDelegate;

    iget-object v2, p0, Lcom/facebook/orca/compose/LocationDisabledNuxView;->c:Landroid/widget/ImageButton;

    invoke-direct {v1, v0, v2}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 118
    invoke-virtual {p0, v1}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 120
    :cond_0
    return-void
.end method
