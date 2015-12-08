.class public Lkik/android/widget/PagerIconTabs;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/PagerIconTabs$a;
    }
.end annotation


# static fields
.field private static final a:[I

.field private static final g:I

.field private static final h:I

.field private static final i:I


# instance fields
.field private b:Landroid/support/v4/view/ViewPager;

.field private c:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:I

.field private final j:Lkik/android/widget/PagerIconTabs$a;

.field private k:I

.field private l:F

.field private m:Z

.field private n:Z

.field private o:Landroid/view/View$OnClickListener;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 25
    new-array v0, v3, [I

    const/4 v1, 0x0

    const v2, 0x7f010002

    aput v2, v0, v1

    sput-object v0, Lkik/android/widget/PagerIconTabs;->a:[I

    .line 35
    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/PagerIconTabs;->g:I

    .line 36
    const/4 v0, 0x4

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/PagerIconTabs;->h:I

    .line 37
    const/16 v0, 0xc

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/PagerIconTabs;->i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/PagerIconTabs;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/PagerIconTabs;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 68
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    new-instance v0, Lkik/android/widget/PagerIconTabs$a;

    invoke-direct {v0, p0, v2}, Lkik/android/widget/PagerIconTabs$a;-><init>(Lkik/android/widget/PagerIconTabs;B)V

    iput-object v0, p0, Lkik/android/widget/PagerIconTabs;->j:Lkik/android/widget/PagerIconTabs$a;

    .line 39
    iput v2, p0, Lkik/android/widget/PagerIconTabs;->k:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/widget/PagerIconTabs;->l:F

    .line 41
    iput-boolean v3, p0, Lkik/android/widget/PagerIconTabs;->m:Z

    .line 42
    iput-boolean v2, p0, Lkik/android/widget/PagerIconTabs;->n:Z

    .line 44
    new-instance v0, Lkik/android/widget/ct;

    invoke-direct {v0, p0}, Lkik/android/widget/ct;-><init>(Lkik/android/widget/PagerIconTabs;)V

    iput-object v0, p0, Lkik/android/widget/PagerIconTabs;->o:Landroid/view/View$OnClickListener;

    .line 70
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    .line 71
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 74
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/PagerIconTabs;->e:Landroid/graphics/Paint;

    .line 75
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 76
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 78
    const/16 v0, 0xb

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0, v2}, Lkik/android/widget/PagerIconTabs;->setMotionEventSplittingEnabled(Z)V

    .line 82
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/widget/PagerIconTabs;F)F
    .locals 0

    .prologue
    .line 23
    iput p1, p0, Lkik/android/widget/PagerIconTabs;->l:F

    return p1
.end method

.method static synthetic a(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic a(Lkik/android/widget/PagerIconTabs;I)V
    .locals 2

    .prologue
    .line 23
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->c:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-object v0
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 105
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->removeAllViews()V

    .line 106
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    .line 109
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    iget v2, p0, Lkik/android/widget/PagerIconTabs;->p:I

    if-lt v0, v2, :cond_0

    .line 110
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/android/widget/PagerIconTabs;->p:I

    .line 112
    :cond_0
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->p:I

    if-gez v0, :cond_1

    .line 113
    iput v1, p0, Lkik/android/widget/PagerIconTabs;->p:I

    .line 116
    :cond_1
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/ai;

    .line 117
    :goto_0
    iget v2, p0, Lkik/android/widget/PagerIconTabs;->f:I

    if-ge v1, v2, :cond_2

    .line 118
    invoke-interface {v0, v1, p0}, Lcom/kik/view/adapters/ai;->a(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    iget-object v3, p0, Lkik/android/widget/PagerIconTabs;->o:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    invoke-virtual {p0, v2}, Lkik/android/widget/PagerIconTabs;->addView(Landroid/view/View;)V

    .line 117
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 124
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lkik/android/widget/cu;

    invoke-direct {v1, p0}, Lkik/android/widget/cu;-><init>(Lkik/android/widget/PagerIconTabs;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 142
    return-void
.end method

.method static synthetic b(Lkik/android/widget/PagerIconTabs;I)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getChildCount()I

    move-result v4

    move v1, v2

    :goto_1
    if-ge v1, v4, :cond_3

    invoke-virtual {p0, v1}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    instance-of v5, v0, Lkik/android/widget/TabIconImageView;

    if-eqz v5, :cond_2

    check-cast v0, Lkik/android/widget/TabIconImageView;

    iget-boolean v5, p0, Lkik/android/widget/PagerIconTabs;->n:Z

    invoke-virtual {v0, v5}, Lkik/android/widget/TabIconImageView;->a(Z)V

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/widget/PagerIconTabs;I)I
    .locals 0

    .prologue
    .line 23
    iput p1, p0, Lkik/android/widget/PagerIconTabs;->k:I

    return p1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/PagerIconTabs;->m:Z

    .line 87
    return-void
.end method

.method public final a(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lkik/android/widget/PagerIconTabs;->c:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 223
    return-void
.end method

.method public final a(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .prologue
    .line 91
    iput-object p1, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    .line 92
    if-nez p1, :cond_0

    .line 101
    :goto_0
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    .line 96
    if-eqz v0, :cond_1

    instance-of v0, v0, Lcom/kik/view/adapters/ai;

    if-nez v0, :cond_2

    .line 97
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Adapter must not be null and must implement ImagePagerAdapter"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_2
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->b:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lkik/android/widget/PagerIconTabs;->j:Lkik/android/widget/PagerIconTabs$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 100
    invoke-direct {p0}, Lkik/android/widget/PagerIconTabs;->b()V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 161
    iget-boolean v0, p0, Lkik/android/widget/PagerIconTabs;->n:Z

    if-eq v0, p1, :cond_2

    .line 162
    iput-boolean p1, p0, Lkik/android/widget/PagerIconTabs;->n:Z

    .line 164
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    if-ge v1, v0, :cond_1

    .line 165
    invoke-virtual {p0, v1}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 166
    instance-of v2, v0, Lkik/android/widget/TabIconImageView;

    if-eqz v2, :cond_0

    .line 167
    check-cast v0, Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0, p1}, Lkik/android/widget/TabIconImageView;->a(Z)V

    .line 164
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 172
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->refreshDrawableState()V

    .line 174
    :cond_2
    return-void
.end method

.method protected onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 148
    iget-boolean v0, p0, Lkik/android/widget/PagerIconTabs;->n:Z

    if-eqz v0, :cond_0

    .line 150
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 151
    sget-object v1, Lkik/android/widget/PagerIconTabs;->a:[I

    invoke-static {v0, v1}, Lkik/android/widget/PagerIconTabs;->mergeDrawableStates([I[I)[I

    .line 155
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I

    move-result-object v0

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    const v8, 0x7f0c0032

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 179
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 181
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    if-nez v0, :cond_1

    .line 218
    :cond_0
    return-void

    .line 185
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getHeight()I

    move-result v7

    .line 188
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->k:I

    invoke-virtual {p0, v0}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 189
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v3, v0

    .line 193
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->l:F

    cmpl-float v0, v0, v6

    if-lez v0, :cond_2

    iget v0, p0, Lkik/android/widget/PagerIconTabs;->k:I

    iget v2, p0, Lkik/android/widget/PagerIconTabs;->f:I

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_2

    .line 194
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->k:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    .line 196
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    .line 198
    iget v4, p0, Lkik/android/widget/PagerIconTabs;->l:F

    mul-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/PagerIconTabs;->l:F

    sub-float v4, v5, v4

    mul-float/2addr v1, v4

    add-float/2addr v1, v2

    .line 199
    iget v2, p0, Lkik/android/widget/PagerIconTabs;->l:F

    mul-float/2addr v0, v2

    iget v2, p0, Lkik/android/widget/PagerIconTabs;->l:F

    sub-float v2, v5, v2

    mul-float/2addr v2, v3

    add-float v3, v0, v2

    .line 203
    :cond_2
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0c0068

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    sget v0, Lkik/android/widget/PagerIconTabs;->h:I

    sub-int v0, v7, v0

    int-to-float v2, v0

    int-to-float v4, v7

    iget-object v5, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 206
    iget-boolean v0, p0, Lkik/android/widget/PagerIconTabs;->m:Z

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 209
    int-to-float v2, v7

    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getWidth()I

    move-result v0

    int-to-float v3, v0

    int-to-float v4, v7

    iget-object v5, p0, Lkik/android/widget/PagerIconTabs;->d:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 212
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs;->e:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkik/android/widget/PagerIconTabs;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 213
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    iget v0, p0, Lkik/android/widget/PagerIconTabs;->f:I

    add-int/lit8 v0, v0, -0x1

    if-ge v6, v0, :cond_0

    .line 214
    invoke-virtual {p0, v6}, Lkik/android/widget/PagerIconTabs;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    sget v2, Lkik/android/widget/PagerIconTabs;->i:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    sget v3, Lkik/android/widget/PagerIconTabs;->g:I

    add-int/2addr v0, v3

    int-to-float v3, v0

    sget v0, Lkik/android/widget/PagerIconTabs;->i:I

    sub-int v0, v7, v0

    int-to-float v4, v0

    iget-object v5, p0, Lkik/android/widget/PagerIconTabs;->e:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 213
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0
.end method
