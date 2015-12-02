.class public abstract Lcom/facebook/widget/text/m;
.super Landroid/view/View;
.source "VariableTextLayoutView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/view/View;"
    }
.end annotation


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
.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:I

.field private f:Landroid/graphics/Typeface;

.field private g:I

.field private h:Landroid/text/Layout$Alignment;

.field private i:I

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/text/TextPaint;",
            ">;"
        }
    .end annotation
.end field

.field private k:Landroid/text/Layout;

.field private l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/text/Layout;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Landroid/view/ViewTreeObserver$OnPreDrawListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/widget/text/m;

    sput-object v0, Lcom/facebook/widget/text/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 82
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 61
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    .line 62
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/widget/text/m;->g:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/text/m;->m:I

    .line 73
    new-instance v0, Lcom/facebook/widget/text/n;

    invoke-direct {v0, p0}, Lcom/facebook/widget/text/n;-><init>(Lcom/facebook/widget/text/m;)V

    iput-object v0, p0, Lcom/facebook/widget/text/m;->n:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 83
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/text/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 84
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 87
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 61
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    .line 62
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/widget/text/m;->g:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/text/m;->m:I

    .line 73
    new-instance v0, Lcom/facebook/widget/text/n;

    invoke-direct {v0, p0}, Lcom/facebook/widget/text/n;-><init>(Lcom/facebook/widget/text/m;)V

    iput-object v0, p0, Lcom/facebook/widget/text/m;->n:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 88
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    .line 62
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/widget/text/m;->g:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/text/m;->m:I

    .line 73
    new-instance v0, Lcom/facebook/widget/text/n;

    invoke-direct {v0, p0}, Lcom/facebook/widget/text/n;-><init>(Lcom/facebook/widget/text/m;)V

    iput-object v0, p0, Lcom/facebook/widget/text/m;->n:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 93
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 94
    return-void
.end method

.method private a(Landroid/text/Layout;I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 346
    move v1, v0

    .line 347
    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 348
    invoke-virtual {p1, v0}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v2

    float-to-int v2, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 347
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 350
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v2

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    .line 352
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 353
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 355
    sparse-switch v2, :sswitch_data_0

    move v0, v1

    .line 367
    :goto_1
    :sswitch_0
    return v0

    .line 360
    :sswitch_1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 355
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method private a(I)Landroid/text/Layout$Alignment;
    .locals 3

    .prologue
    .line 132
    packed-switch p1, :pswitch_data_0

    .line 140
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid alignment: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :pswitch_0
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 138
    :goto_0
    return-object v0

    .line 136
    :pswitch_1
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 138
    :pswitch_2
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 132
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    .line 99
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    const-wide/16 v1, 0x78

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->c(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->l:Ljava/util/Map;

    .line 104
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->VariableTextLayoutView:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 105
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_textColor:I

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/text/m;->c:I

    .line 106
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_minScaledTextSize:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/text/m;->d:I

    .line 107
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_maxScaledTextSize:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/text/m;->e:I

    .line 108
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_alignment:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/facebook/widget/text/m;->a(I)Landroid/text/Layout$Alignment;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/text/m;->h:Landroid/text/Layout$Alignment;

    .line 110
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_maxLines:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/text/m;->i:I

    .line 111
    sget v1, Lcom/facebook/q;->VariableTextLayoutView_textStyle:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    .line 112
    sget v2, Lcom/facebook/q;->VariableTextLayoutView_typeface:I

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 113
    invoke-direct {p0, v2, v1}, Lcom/facebook/widget/text/m;->b(II)V

    .line 116
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getTypefaceFamily()Landroid/graphics/Typeface;

    move-result-object v1

    .line 117
    sget v2, Lcom/facebook/q;->VariableTextLayoutView_fontFamily:I

    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 118
    invoke-static {v2}, Lcom/facebook/widget/text/d;->fromIndex(I)Lcom/facebook/widget/text/d;

    move-result-object v2

    .line 119
    invoke-static {p1, v2, v1}, Lcom/facebook/widget/text/c;->a(Landroid/content/Context;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 120
    if-eq v1, v2, :cond_0

    .line 121
    invoke-virtual {p0, v2, v4}, Lcom/facebook/widget/text/m;->a(Landroid/graphics/Typeface;I)V

    .line 124
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    iget v0, p0, Lcom/facebook/widget/text/m;->e:I

    iget v1, p0, Lcom/facebook/widget/text/m;->d:I

    if-ge v0, v1, :cond_1

    .line 127
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid text sizes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/text/m;)Z
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->d()Z

    move-result v0

    return v0
.end method

.method private b(I)F
    .locals 3

    .prologue
    .line 267
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 268
    const/high16 v0, -0x40800000    # -1.0f

    .line 270
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x2

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_0
.end method

.method private b(Landroid/text/Layout;I)I
    .locals 4

    .prologue
    .line 378
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 379
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 382
    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingBottom()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingTop()I

    move-result v3

    add-int/2addr v0, v3

    .line 383
    sparse-switch v2, :sswitch_data_0

    move v0, v1

    .line 397
    :goto_0
    :sswitch_0
    return v0

    .line 389
    :sswitch_1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    .line 383
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method private b()V
    .locals 3

    .prologue
    .line 278
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 279
    iget v0, p0, Lcom/facebook/widget/text/m;->e:I

    :goto_0
    iget v1, p0, Lcom/facebook/widget/text/m;->d:I

    if-lt v0, v1, :cond_0

    .line 280
    iget-object v1, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/facebook/widget/text/m;->c(I)Landroid/text/TextPaint;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 282
    :cond_0
    return-void
.end method

.method private b(II)V
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x0

    .line 179
    packed-switch p1, :pswitch_data_0

    .line 193
    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/facebook/widget/text/m;->a(Landroid/graphics/Typeface;I)V

    .line 194
    return-void

    .line 181
    :pswitch_0
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    .line 185
    :pswitch_1
    sget-object v0, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    .line 189
    :pswitch_2
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    .line 179
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(I)Landroid/text/TextPaint;
    .locals 3

    .prologue
    .line 285
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 286
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, v0, Landroid/text/TextPaint;->density:F

    .line 287
    invoke-direct {p0, p1}, Lcom/facebook/widget/text/m;->b(I)F

    move-result v1

    .line 288
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 289
    iget-object v1, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    iget v2, p0, Lcom/facebook/widget/text/m;->g:I

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 290
    iget v1, p0, Lcom/facebook/widget/text/m;->c:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 291
    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 462
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 463
    if-nez v0, :cond_1

    .line 475
    :cond_0
    :goto_0
    return-void

    .line 467
    :cond_1
    iget v1, p0, Lcom/facebook/widget/text/m;->m:I

    if-nez v1, :cond_2

    .line 468
    iget-object v1, p0, Lcom/facebook/widget/text/m;->n:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 469
    iput v2, p0, Lcom/facebook/widget/text/m;->m:I

    goto :goto_0

    .line 470
    :cond_2
    iget v0, p0, Lcom/facebook/widget/text/m;->m:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 471
    iput v2, p0, Lcom/facebook/widget/text/m;->m:I

    goto :goto_0
.end method

.method private d(I)Landroid/text/Layout;
    .locals 7

    .prologue
    .line 401
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getVariableTextLayoutComputer()Lcom/facebook/widget/text/l;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/text/m;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/widget/text/m;->h:Landroid/text/Layout$Alignment;

    iget v5, p0, Lcom/facebook/widget/text/m;->i:I

    const/4 v6, -0x1

    move v3, p1

    invoke-interface/range {v0 .. v6}, Lcom/facebook/widget/text/l;->a(Ljava/lang/Object;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;

    move-result-object v0

    return-object v0
.end method

.method private d()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 479
    iget v1, p0, Lcom/facebook/widget/text/m;->m:I

    if-eq v1, v0, :cond_1

    .line 489
    :cond_0
    :goto_0
    return v0

    .line 483
    :cond_1
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->g()V

    .line 484
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->f()V

    .line 486
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->e()Z

    move-result v1

    .line 488
    const/4 v2, 0x2

    iput v2, p0, Lcom/facebook/widget/text/m;->m:I

    .line 489
    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 496
    .line 497
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    move-result-object v0

    .line 498
    iget-object v2, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v2, v1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v2

    .line 499
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    sub-int/2addr v3, v4

    .line 503
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    if-ne v0, v4, :cond_2

    .line 509
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    invoke-static {v0}, Landroid/util/FloatMath;->floor(F)F

    move-result v0

    float-to-int v0, v0

    .line 510
    iget-object v4, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v4, v1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v4

    invoke-static {v4}, Landroid/util/FloatMath;->ceil(F)F

    move-result v4

    float-to-int v4, v4

    .line 512
    sub-int v5, v4, v0

    if-ge v5, v3, :cond_1

    .line 513
    add-int/2addr v0, v4

    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v2, v3, 0x2

    sub-int/2addr v0, v2

    .line 545
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getScrollX()I

    move-result v2

    if-eq v0, v2, :cond_6

    .line 546
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/text/m;->scrollTo(II)V

    .line 547
    const/4 v0, 0x1

    .line 549
    :goto_1
    return v0

    .line 515
    :cond_1
    if-gez v2, :cond_0

    .line 516
    sub-int v0, v4, v3

    goto :goto_0

    .line 521
    :cond_2
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    if-ne v0, v4, :cond_4

    .line 526
    if-gez v2, :cond_3

    .line 527
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v0

    invoke-static {v0}, Landroid/util/FloatMath;->ceil(F)F

    move-result v0

    float-to-int v0, v0

    .line 528
    sub-int/2addr v0, v3

    .line 529
    goto :goto_0

    .line 530
    :cond_3
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    invoke-static {v0}, Landroid/util/FloatMath;->floor(F)F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    .line 537
    :cond_4
    if-gez v2, :cond_5

    .line 538
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    invoke-static {v0}, Landroid/util/FloatMath;->floor(F)F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    .line 540
    :cond_5
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v0

    invoke-static {v0}, Landroid/util/FloatMath;->ceil(F)F

    move-result v0

    float-to-int v0, v0

    .line 541
    sub-int/2addr v0, v3

    goto :goto_0

    :cond_6
    move v0, v1

    .line 549
    goto :goto_1
.end method

.method private f()V
    .locals 7

    .prologue
    .line 555
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    if-nez v0, :cond_0

    .line 556
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getVariableTextLayoutComputer()Lcom/facebook/widget/text/l;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/text/m;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/facebook/widget/text/m;->h:Landroid/text/Layout$Alignment;

    iget v5, p0, Lcom/facebook/widget/text/m;->i:I

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getHeight()I

    move-result v6

    invoke-interface/range {v0 .. v6}, Lcom/facebook/widget/text/l;->a(Ljava/lang/Object;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    .line 565
    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    if-nez v0, :cond_0

    .line 569
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->b()V

    .line 571
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 301
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    .line 302
    iget-object v0, p0, Lcom/facebook/widget/text/m;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 303
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->requestLayout()V

    .line 304
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 305
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->c()V

    .line 306
    return-void
.end method

.method public a(II)V
    .locals 2

    .prologue
    .line 163
    if-ge p2, p1, :cond_0

    .line 164
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid text sizes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_0
    iput p1, p0, Lcom/facebook/widget/text/m;->d:I

    .line 167
    iput p2, p0, Lcom/facebook/widget/text/m;->e:I

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 169
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 170
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 171
    return-void
.end method

.method public a(Landroid/graphics/Typeface;I)V
    .locals 1

    .prologue
    .line 203
    if-lez p2, :cond_0

    .line 204
    if-nez p1, :cond_1

    .line 205
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 210
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    .line 211
    iput p2, p0, Lcom/facebook/widget/text/m;->g:I

    .line 212
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 213
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 214
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 215
    return-void

    .line 207
    :cond_1
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0
.end method

.method public getAlignment()Landroid/text/Layout$Alignment;
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/widget/text/m;->h:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/widget/text/m;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public getMaxLines()I
    .locals 1

    .prologue
    .line 257
    iget v0, p0, Lcom/facebook/widget/text/m;->i:I

    return v0
.end method

.method public getMaxScaledTextSize()F
    .locals 1

    .prologue
    .line 159
    iget v0, p0, Lcom/facebook/widget/text/m;->e:I

    int-to-float v0, v0

    return v0
.end method

.method public getMinScaledTextSize()F
    .locals 1

    .prologue
    .line 155
    iget v0, p0, Lcom/facebook/widget/text/m;->d:I

    int-to-float v0, v0

    return v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lcom/facebook/widget/text/m;->c:I

    return v0
.end method

.method public getTypefaceFamily()Landroid/graphics/Typeface;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public getTypefaceStyle()I
    .locals 1

    .prologue
    .line 225
    iget v0, p0, Lcom/facebook/widget/text/m;->g:I

    return v0
.end method

.method protected abstract getVariableTextLayoutComputer()Lcom/facebook/widget/text/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/widget/text/l",
            "<TT;>;"
        }
    .end annotation
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 446
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 448
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 449
    if-eqz v0, :cond_0

    .line 450
    iget v1, p0, Lcom/facebook/widget/text/m;->m:I

    if-eqz v1, :cond_0

    .line 451
    iget-object v1, p0, Lcom/facebook/widget/text/m;->n:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 452
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/text/m;->m:I

    .line 455
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/4 v2, 0x0

    .line 413
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 415
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->g()V

    .line 416
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->f()V

    .line 417
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 419
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingTop()I

    move-result v3

    .line 420
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v4

    .line 421
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingBottom()I

    move-result v1

    .line 422
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getScrollX()I

    move-result v5

    .line 423
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getScrollY()I

    move-result v6

    .line 424
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getHeight()I

    move-result v0

    sub-int/2addr v0, v1

    sub-int v7, v0, v3

    .line 425
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    sub-int v8, v0, v7

    .line 426
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v0

    add-int/2addr v0, v5

    int-to-float v9, v0

    .line 427
    if-nez v6, :cond_1

    const/4 v0, 0x0

    .line 428
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getWidth()I

    move-result v10

    sub-int v4, v10, v4

    add-int/2addr v4, v5

    int-to-float v4, v4

    .line 429
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getHeight()I

    move-result v5

    add-int/2addr v5, v6

    if-ne v6, v8, :cond_0

    move v1, v2

    :cond_0
    sub-int v1, v5, v1

    int-to-float v1, v1

    .line 431
    invoke-virtual {p1, v9, v0, v4, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 434
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    .line 435
    sub-int v0, v7, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 436
    div-int/lit8 v0, v0, 0x2

    .line 437
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v1

    .line 438
    int-to-float v1, v1

    add-int/2addr v0, v3

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 440
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 441
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 442
    return-void

    .line 427
    :cond_1
    add-int v0, v3, v6

    int-to-float v0, v0

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    .line 310
    const-string v0, "ThreadNameView.onMeasure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 311
    invoke-direct {p0}, Lcom/facebook/widget/text/m;->g()V

    .line 313
    const/16 v0, 0x4000

    invoke-static {v0, p1}, Lcom/facebook/widget/text/m;->getDefaultSize(II)I

    move-result v1

    .line 314
    iget-object v0, p0, Lcom/facebook/widget/text/m;->l:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/Layout;

    .line 315
    if-nez v0, :cond_0

    .line 316
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v3

    add-int/2addr v0, v3

    sub-int v0, v1, v0

    .line 317
    invoke-direct {p0, v0}, Lcom/facebook/widget/text/m;->d(I)Landroid/text/Layout;

    move-result-object v0

    .line 318
    iget-object v3, p0, Lcom/facebook/widget/text/m;->l:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/facebook/widget/text/m;->a(Landroid/text/Layout;I)I

    move-result v3

    .line 324
    if-ne v3, v1, :cond_1

    .line 325
    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/text/m;->b(Landroid/text/Layout;I)I

    move-result v1

    .line 326
    iput-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    move v0, v1

    .line 333
    :goto_0
    invoke-virtual {p0, v3, v0}, Lcom/facebook/widget/text/m;->setMeasuredDimension(II)V

    .line 334
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 335
    return-void

    .line 328
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    sub-int v0, v3, v0

    .line 329
    invoke-direct {p0, v0}, Lcom/facebook/widget/text/m;->d(I)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    .line 330
    iget-object v0, p0, Lcom/facebook/widget/text/m;->k:Landroid/text/Layout;

    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/text/m;->b(Landroid/text/Layout;I)I

    move-result v0

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 296
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 297
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 298
    return-void
.end method

.method public setAlignment(Landroid/text/Layout$Alignment;)V
    .locals 1

    .prologue
    .line 250
    iput-object p1, p0, Lcom/facebook/widget/text/m;->h:Landroid/text/Layout$Alignment;

    .line 251
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 252
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 253
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 254
    return-void
.end method

.method public setData(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 240
    iput-object p1, p0, Lcom/facebook/widget/text/m;->b:Ljava/lang/Object;

    .line 241
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 242
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 243
    return-void
.end method

.method public setMaxLines(I)V
    .locals 0

    .prologue
    .line 261
    iput p1, p0, Lcom/facebook/widget/text/m;->i:I

    .line 262
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 263
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 264
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .prologue
    .line 149
    iput p1, p0, Lcom/facebook/widget/text/m;->c:I

    .line 150
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 151
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 152
    return-void
.end method

.method public setTypefaceFamily(Landroid/graphics/Typeface;)V
    .locals 1

    .prologue
    .line 218
    iput-object p1, p0, Lcom/facebook/widget/text/m;->f:Landroid/graphics/Typeface;

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 220
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 221
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 222
    return-void
.end method

.method public setTypefaceStyle(I)V
    .locals 1

    .prologue
    .line 229
    iput p1, p0, Lcom/facebook/widget/text/m;->g:I

    .line 230
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/m;->j:Ljava/util/List;

    .line 231
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->a()V

    .line 232
    invoke-virtual {p0}, Lcom/facebook/widget/text/m;->invalidate()V

    .line 233
    return-void
.end method
