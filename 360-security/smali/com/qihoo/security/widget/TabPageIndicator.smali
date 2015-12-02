.class public Lcom/qihoo/security/widget/TabPageIndicator;
.super Landroid/widget/HorizontalScrollView;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/TabPageIndicator$SavedState;,
        Lcom/qihoo/security/widget/TabPageIndicator$b;,
        Lcom/qihoo/security/widget/TabPageIndicator$c;,
        Lcom/qihoo/security/widget/TabPageIndicator$a;
    }
.end annotation


# static fields
.field private static final b:[I


# instance fields
.field private A:Landroid/graphics/Typeface;

.field private B:I

.field private C:I

.field private D:I

.field private final E:Z

.field private F:Z

.field private G:Lcom/qihoo/security/widget/TabPageIndicator$b;

.field private H:Z

.field private I:Z

.field private J:Ljava/util/Locale;

.field public a:Landroid/support/v4/view/ViewPager$e;

.field private final c:Landroid/widget/LinearLayout$LayoutParams;

.field private final d:Landroid/widget/LinearLayout$LayoutParams;

.field private final e:Landroid/widget/LinearLayout;

.field private f:Landroid/support/v4/view/ViewPager;

.field private g:I

.field private h:I

.field private i:F

.field private final j:Landroid/graphics/Paint;

.field private final k:Landroid/graphics/Paint;

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/qihoo/security/widget/TabPageIndicator;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1010095
        0x1010098
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 126
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/TabPageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 130
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .prologue
    const/16 v6, 0xa

    const/4 v2, 0x2

    const/4 v5, -0x1

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 133
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    iput v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    .line 64
    const/16 v0, -0x73

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    .line 65
    iput v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    .line 66
    const/high16 v0, 0x1a000000

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    .line 69
    iput-boolean v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->o:Z

    .line 71
    iput-boolean v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    .line 75
    iput-boolean v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    .line 77
    const/16 v0, 0x34

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    .line 78
    iput v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    .line 79
    iput v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    .line 80
    const/16 v0, 0xc

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    .line 81
    iput v6, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    .line 82
    iput v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->w:I

    .line 84
    const/16 v0, 0xe

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    .line 85
    iput v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    .line 86
    const v0, -0x79000001

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->z:I

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->A:Landroid/graphics/Typeface;

    .line 88
    iput v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->B:I

    .line 90
    iput v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->C:I

    .line 92
    const v0, 0x7f020105

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->D:I

    .line 94
    iput-boolean v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->E:Z

    .line 98
    iput-boolean v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->F:Z

    .line 108
    iput-boolean v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->H:Z

    .line 113
    iput-boolean v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->I:Z

    .line 135
    invoke-virtual {p0, v3}, Lcom/qihoo/security/widget/TabPageIndicator;->setFillViewport(Z)V

    .line 136
    invoke-virtual {p0, v4}, Lcom/qihoo/security/widget/TabPageIndicator;->setWillNotDraw(Z)V

    .line 138
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->addView(Landroid/view/View;)V

    .line 144
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 146
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    .line 147
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    .line 148
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    .line 149
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    .line 150
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    .line 151
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->w:I

    int-to-float v1, v1

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->w:I

    .line 152
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    int-to-float v1, v1

    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    .line 156
    sget-object v0, Lcom/qihoo/security/widget/TabPageIndicator;->b:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 158
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    .line 159
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    .line 161
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 165
    sget-object v0, Lcom/qihoo/security/lite/a$a;->TabPageIndicator:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 167
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    .line 168
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    .line 169
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    .line 170
    const/4 v1, 0x3

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    .line 171
    const/4 v1, 0x4

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    .line 172
    const/4 v1, 0x5

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    .line 173
    const/4 v1, 0x6

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    .line 174
    const/16 v1, 0x8

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->D:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->D:I

    .line 176
    const/16 v1, 0x9

    iget-boolean v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    .line 177
    const/4 v1, 0x7

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    .line 178
    iget-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    invoke-virtual {v0, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    .line 179
    const/16 v1, 0xb

    iget-boolean v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->F:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->F:Z

    .line 180
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 182
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    .line 183
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 186
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->k:Landroid/graphics/Paint;

    .line 187
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->k:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->w:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 190
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->c:Landroid/widget/LinearLayout$LayoutParams;

    .line 192
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v4, v5, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->d:Landroid/widget/LinearLayout$LayoutParams;

    .line 195
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->J:Ljava/util/Locale;

    if-nez v0, :cond_0

    .line 196
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->J:Ljava/util/Locale;

    .line 198
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/TabPageIndicator;I)I
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/widget/TabPageIndicator;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private a(II)V
    .locals 2

    .prologue
    .line 385
    new-instance v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 386
    invoke-virtual {v0, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 387
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILandroid/view/View;)V

    .line 389
    return-void
.end method

.method private a(ILandroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 392
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 393
    new-instance v0, Lcom/qihoo/security/widget/TabPageIndicator$2;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/widget/TabPageIndicator$2;-><init>(Lcom/qihoo/security/widget/TabPageIndicator;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 407
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    invoke-virtual {p2, v0, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 408
    iget-object v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->d:Landroid/widget/LinearLayout$LayoutParams;

    :goto_0
    invoke-virtual {v1, p2, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 409
    return-void

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->c:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0
.end method

.method private a(ILjava/lang/String;)V
    .locals 5

    .prologue
    const/16 v4, 0x11

    const/4 v2, -0x1

    .line 363
    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->o:Z

    if-eqz v0, :cond_0

    .line 364
    new-instance v0, Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;-><init>(Landroid/content/Context;)V

    .line 365
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setAvoidTwiceTouch(Z)V

    .line 366
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 368
    new-instance v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;)V

    .line 369
    invoke-virtual {v2, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 370
    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setGravity(I)V

    .line 371
    invoke-virtual {v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setSingleLine()V

    .line 372
    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 373
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILandroid/view/View;)V

    .line 381
    :goto_0
    return-void

    .line 375
    :cond_0
    new-instance v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;)V

    .line 376
    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 377
    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setGravity(I)V

    .line 378
    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setSingleLine()V

    .line 379
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILandroid/view/View;)V

    goto :goto_0
.end method

.method private a(ILjava/lang/String;I)V
    .locals 4

    .prologue
    .line 340
    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 341
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILjava/lang/String;)V

    .line 360
    :goto_0
    return-void

    .line 345
    :cond_0
    new-instance v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;)V

    .line 346
    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 347
    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setGravity(I)V

    .line 348
    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setSingleLine()V

    .line 350
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 351
    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 353
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 354
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 356
    iget-object v3, p0, Lcom/qihoo/security/widget/TabPageIndicator;->c:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2, v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->c:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 359
    invoke-direct {p0, p1, v2}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILandroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/TabPageIndicator;II)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/TabPageIndicator;->b(II)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/widget/TabPageIndicator;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    return v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 413
    move v2, v3

    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    if-ge v2, v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 417
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->D:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 419
    instance-of v1, v0, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_3

    .line 420
    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 423
    :goto_1
    instance-of v0, v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 425
    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 426
    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    int-to-float v4, v4

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextSize(IF)V

    .line 427
    iget-object v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->A:Landroid/graphics/Typeface;

    iget v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->B:I

    invoke-virtual {v0, v4, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 428
    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 431
    iget-boolean v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    if-eqz v4, :cond_0

    .line 432
    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->J:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 436
    :cond_0
    instance-of v0, v1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 437
    check-cast v1, Landroid/widget/FrameLayout;

    .line 438
    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 439
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    int-to-float v1, v1

    invoke-virtual {v0, v3, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextSize(IF)V

    .line 440
    iget-object v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->A:Landroid/graphics/Typeface;

    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->B:I

    invoke-virtual {v0, v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 441
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 444
    iget-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    if-eqz v1, :cond_1

    .line 445
    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->J:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 413
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 450
    :cond_2
    return-void

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method private b(II)V
    .locals 2

    .prologue
    .line 453
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    if-nez v0, :cond_1

    .line 467
    :cond_0
    :goto_0
    return-void

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/2addr v0, p2

    .line 459
    if-gtz p1, :cond_2

    if-lez p2, :cond_3

    .line 460
    :cond_2
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    sub-int/2addr v0, v1

    .line 463
    :cond_3
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->C:I

    if-eq v0, v1, :cond_0

    .line 464
    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->C:I

    .line 465
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->scrollTo(II)V

    goto :goto_0
.end method

.method private c(I)V
    .locals 6

    .prologue
    const v5, -0x79000001

    const/4 v3, 0x0

    .line 234
    move v2, v3

    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    if-ge v2, v0, :cond_4

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 236
    instance-of v1, v0, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_5

    .line 237
    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 240
    :goto_1
    instance-of v0, v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 241
    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 242
    if-ne v2, p1, :cond_2

    .line 243
    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 250
    :cond_0
    :goto_2
    instance-of v0, v1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 251
    check-cast v1, Landroid/widget/FrameLayout;

    .line 252
    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 253
    if-ne v2, p1, :cond_3

    .line 254
    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 259
    :goto_3
    iget-boolean v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    if-eqz v1, :cond_1

    .line 260
    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->J:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 234
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 245
    :cond_2
    invoke-virtual {v0, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    goto :goto_2

    .line 256
    :cond_3
    invoke-virtual {v0, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    goto :goto_3

    .line 264
    :cond_4
    return-void

    :cond_5
    move-object v1, v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/widget/TabPageIndicator;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->H:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/widget/TabPageIndicator;)Lcom/qihoo/security/widget/TabPageIndicator$b;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->G:Lcom/qihoo/security/widget/TabPageIndicator$b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 302
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 304
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/o;->b()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    .line 306
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    if-ge v1, v0, :cond_2

    .line 308
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    instance-of v0, v0, Lcom/qihoo/security/widget/TabPageIndicator$c;

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/o;->c(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/TabPageIndicator$c;

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator$c;->a(I)I

    move-result v0

    invoke-direct {p0, v1, v2, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILjava/lang/String;I)V

    .line 306
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    instance-of v0, v0, Lcom/qihoo/security/widget/TabPageIndicator$a;

    if-eqz v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/TabPageIndicator$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator$a;->a(I)I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(II)V

    goto :goto_1

    .line 314
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/o;->c(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(ILjava/lang/String;)V

    goto :goto_1

    .line 319
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->b()V

    .line 321
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/widget/TabPageIndicator$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/TabPageIndicator$1;-><init>(Lcom/qihoo/security/widget/TabPageIndicator;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 336
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$e;->a(I)V

    .line 293
    :cond_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/TabPageIndicator;->c(I)V

    .line 294
    return-void
.end method

.method public a(IFI)V
    .locals 1

    .prologue
    .line 268
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    .line 269
    iput p2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    .line 270
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/TabPageIndicator;->b(II)V

    .line 271
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$e;->a(IFI)V

    .line 275
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/view/ViewPager;Lcom/qihoo/security/widget/c;I)V
    .locals 2

    .prologue
    .line 202
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 215
    :cond_0
    :goto_0
    return-void

    .line 205
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/o;

    move-result-object v0

    .line 206
    if-nez v0, :cond_2

    .line 207
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_2
    iput-object p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    .line 210
    invoke-virtual {p1, p2}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$e;)V

    .line 211
    invoke-virtual {p2, p0}, Lcom/qihoo/security/widget/c;->a(Landroid/support/v4/view/ViewPager$e;)V

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 213
    invoke-virtual {p0, p3}, Lcom/qihoo/security/widget/TabPageIndicator;->setCurrentItem(I)V

    .line 214
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->a()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 279
    if-nez p1, :cond_0

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->b(II)V

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    if-eqz v0, :cond_1

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$e;->b(I)V

    .line 286
    :cond_1
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 743
    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->I:Z

    if-eqz v0, :cond_0

    .line 744
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 746
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDividerColor()I
    .locals 1

    .prologue
    .line 565
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    return v0
.end method

.method public getDividerPadding()I
    .locals 1

    .prologue
    .line 583
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    return v0
.end method

.method public getIndicatorColor()I
    .locals 1

    .prologue
    .line 528
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    return v0
.end method

.method public getIndicatorHeight()I
    .locals 1

    .prologue
    .line 537
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    return v0
.end method

.method public getScrollOffset()I
    .locals 1

    .prologue
    .line 592
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    return v0
.end method

.method public getShouldExpand()Z
    .locals 1

    .prologue
    .line 601
    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    return v0
.end method

.method public getTabPaddingLeftRight()I
    .locals 1

    .prologue
    .line 680
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    return v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 632
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    return v0
.end method

.method public getTextSize()I
    .locals 1

    .prologue
    .line 618
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    return v0
.end method

.method public getUnderlineColor()I
    .locals 1

    .prologue
    .line 551
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    return v0
.end method

.method public getUnderlineHeight()I
    .locals 1

    .prologue
    .line 574
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 471
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onDraw(Landroid/graphics/Canvas;)V

    .line 473
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    if-nez v0, :cond_1

    .line 515
    :cond_0
    return-void

    .line 477
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getHeight()I

    move-result v7

    .line 481
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 484
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 485
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    .line 486
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v3, v0

    .line 489
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    cmpl-float v0, v0, v6

    if-lez v0, :cond_2

    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_2

    .line 491
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 492
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    .line 493
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    .line 495
    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    mul-float/2addr v2, v4

    iget v4, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    sub-float v4, v5, v4

    mul-float/2addr v1, v4

    add-float/2addr v1, v2

    .line 496
    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->i:F

    sub-float v2, v5, v2

    mul-float/2addr v2, v3

    add-float v3, v0, v2

    .line 499
    :cond_2
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    sub-int v0, v7, v0

    int-to-float v2, v0

    int-to-float v4, v7

    iget-object v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 503
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 504
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    sub-int v0, v7, v0

    int-to-float v2, v0

    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    int-to-float v3, v0

    int-to-float v4, v7

    iget-object v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->j:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 508
    iget-boolean v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->F:Z

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 510
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->g:I

    add-int/lit8 v0, v0, -0x1

    if-ge v6, v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v3, v0

    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    sub-int v0, v7, v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/qihoo/security/widget/TabPageIndicator;->k:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 510
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 685
    check-cast p1, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;

    .line 686
    invoke-virtual {p1}, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 687
    iget v0, p1, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;->a:I

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    .line 688
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->requestLayout()V

    .line 689
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 693
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 694
    new-instance v1, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;

    invoke-direct {v1, v0}, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 695
    iget v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->h:I

    iput v0, v1, Lcom/qihoo/security/widget/TabPageIndicator$SavedState;->a:I

    .line 696
    return-object v1
.end method

.method public setAllCaps(Z)V
    .locals 0

    .prologue
    .line 609
    iput-boolean p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->q:Z

    .line 610
    return-void
.end method

.method public setCanClick(Z)V
    .locals 0

    .prologue
    .line 738
    iput-boolean p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->I:Z

    .line 739
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 2

    .prologue
    .line 219
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->f:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_0

    .line 220
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ViewPager has not been bound."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 226
    :cond_0
    return-void
.end method

.method public setDividerColor(I)V
    .locals 0

    .prologue
    .line 555
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    .line 556
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 557
    return-void
.end method

.method public setDividerColorResource(I)V
    .locals 1

    .prologue
    .line 560
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->n:I

    .line 561
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 562
    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .prologue
    .line 578
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->u:I

    .line 579
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 580
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .prologue
    .line 518
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    .line 519
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 520
    return-void
.end method

.method public setIndicatorColorResource(I)V
    .locals 1

    .prologue
    .line 523
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->l:I

    .line 524
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 525
    return-void
.end method

.method public setIndicatorHeight(I)V
    .locals 0

    .prologue
    .line 532
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->s:I

    .line 533
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 534
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$e;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->a:Landroid/support/v4/view/ViewPager$e;

    .line 298
    return-void
.end method

.method public setOnTabItemClickListener(Lcom/qihoo/security/widget/TabPageIndicator$b;)V
    .locals 0

    .prologue
    .line 667
    iput-object p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->G:Lcom/qihoo/security/widget/TabPageIndicator$b;

    .line 668
    return-void
.end method

.method public setScrollOffset(I)V
    .locals 0

    .prologue
    .line 587
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->r:I

    .line 588
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 589
    return-void
.end method

.method public setShouldExpand(Z)V
    .locals 0

    .prologue
    .line 596
    iput-boolean p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->p:Z

    .line 597
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->requestLayout()V

    .line 598
    return-void
.end method

.method public setTabDefualtBackground(I)V
    .locals 0

    .prologue
    .line 671
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->D:I

    .line 672
    return-void
.end method

.method public setTabPaddingLeftRight(I)V
    .locals 0

    .prologue
    .line 675
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->v:I

    .line 676
    invoke-direct {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->b()V

    .line 677
    return-void
.end method

.method public setTabSmoothScroll(Z)V
    .locals 0

    .prologue
    .line 658
    iput-boolean p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->H:Z

    .line 659
    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .prologue
    .line 622
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    .line 623
    invoke-direct {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->b()V

    .line 624
    return-void
.end method

.method public setTextColorResource(I)V
    .locals 1

    .prologue
    .line 627
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->y:I

    .line 628
    invoke-direct {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->b()V

    .line 629
    return-void
.end method

.method public setTextSize(I)V
    .locals 0

    .prologue
    .line 613
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->x:I

    .line 614
    invoke-direct {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->b()V

    .line 615
    return-void
.end method

.method public setUnderlineColor(I)V
    .locals 0

    .prologue
    .line 541
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    .line 542
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 543
    return-void
.end method

.method public setUnderlineColorResource(I)V
    .locals 1

    .prologue
    .line 546
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/TabPageIndicator;->m:I

    .line 547
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 548
    return-void
.end method

.method public setUnderlineHeight(I)V
    .locals 0

    .prologue
    .line 569
    iput p1, p0, Lcom/qihoo/security/widget/TabPageIndicator;->t:I

    .line 570
    invoke-virtual {p0}, Lcom/qihoo/security/widget/TabPageIndicator;->invalidate()V

    .line 571
    return-void
.end method
