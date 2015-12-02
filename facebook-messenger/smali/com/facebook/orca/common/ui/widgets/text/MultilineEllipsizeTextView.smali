.class public Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;
.super Landroid/view/View;
.source "MultilineEllipsizeTextView.java"


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
.field private b:I

.field private c:F

.field private d:Landroid/graphics/Typeface;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:F

.field private k:F

.field private l:F

.field private m:I

.field private n:Ljava/lang/CharSequence;

.field private o:Landroid/text/TextPaint;

.field private p:Lcom/facebook/orca/common/ui/widgets/text/c;

.field private q:I

.field private r:Lcom/facebook/orca/common/ui/widgets/text/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 114
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 118
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 121
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 109
    iput v5, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->q:I

    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->MultilineEllipsizeTextView:[I

    invoke-virtual {v0, p2, v1, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 125
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_textColor:I

    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b:I

    .line 126
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_textSize:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    .line 127
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_minLines:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->f:I

    .line 128
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_maxLines:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->g:I

    .line 129
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_maxWidth:I

    const v2, 0x7fffffff

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->h:I

    .line 133
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_includeFontPadding:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->i:Z

    .line 137
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_shadowDx:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->j:F

    .line 138
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_shadowDy:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->k:F

    .line 139
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_shadowRadius:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->l:F

    .line 140
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_shadowColor:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->m:I

    .line 141
    sget v1, Lcom/facebook/q;->MultilineEllipsizeTextView_textStyle:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    .line 142
    sget v2, Lcom/facebook/q;->MultilineEllipsizeTextView_typeface:I

    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 143
    invoke-direct {p0, v2, v1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(II)V

    .line 144
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 146
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 147
    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    .line 149
    :cond_0
    return-void
.end method

.method private a(Landroid/text/Layout;)I
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 504
    move v0, v1

    move v2, v3

    .line 506
    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 507
    invoke-virtual {p1, v0}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v4

    .line 508
    if-nez v0, :cond_1

    move v2, v4

    .line 506
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 510
    :cond_1
    if-eq v2, v4, :cond_0

    move v3, v1

    .line 515
    :cond_2
    if-eqz v3, :cond_3

    :goto_1
    return v2

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method private a(Landroid/text/Layout;I)I
    .locals 5

    .prologue
    .line 299
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 300
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 302
    const/4 v1, 0x0

    .line 303
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    move-result v4

    if-ge v0, v4, :cond_0

    .line 304
    invoke-virtual {p1, v0}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 303
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 307
    :cond_0
    float-to-int v0, v1

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    .line 309
    sparse-switch v3, :sswitch_data_0

    move v0, v2

    .line 323
    :goto_1
    :sswitch_0
    return v0

    .line 315
    :sswitch_1
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 309
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method private a(Lcom/facebook/orca/common/ui/widgets/text/d;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;
    .locals 12

    .prologue
    const/4 v2, 0x0

    .line 483
    if-nez p1, :cond_0

    .line 484
    const/4 v0, 0x0

    .line 497
    :goto_0
    return-object v0

    .line 486
    :cond_0
    const/4 v0, 0x1

    .line 487
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 488
    iget-object v3, p1, Lcom/facebook/orca/common/ui/widgets/text/d;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v3, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 489
    if-nez v3, :cond_1

    .line 490
    const-string v3, "\n"

    invoke-virtual {v1, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 492
    :cond_1
    invoke-static {v0}, Lcom/facebook/common/w/n;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 493
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move v3, v2

    .line 494
    goto :goto_1

    .line 496
    :cond_2
    iget v0, p1, Lcom/facebook/orca/common/ui/widgets/text/d;->b:I

    if-nez v0, :cond_3

    move v5, p3

    .line 497
    :goto_2
    new-instance v0, Landroid/text/StaticLayout;

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    iget-boolean v9, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->i:Z

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object v4, p2

    move v11, p3

    invoke-direct/range {v0 .. v11}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    goto :goto_0

    .line 496
    :cond_3
    const/16 v5, 0x4000

    goto :goto_2
.end method

.method private a(I)Lcom/facebook/orca/common/ui/widgets/text/c;
    .locals 6

    .prologue
    .line 406
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b()V

    .line 407
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    sub-int v3, p1, v0

    .line 408
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->n:Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    iget v4, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->g:I

    iget v5, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->f:I

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;III)Lcom/facebook/orca/common/ui/widgets/text/d;

    move-result-object v0

    .line 409
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    invoke-direct {p0, v0, v1, v3}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(Lcom/facebook/orca/common/ui/widgets/text/d;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;

    move-result-object v1

    .line 410
    new-instance v2, Lcom/facebook/orca/common/ui/widgets/text/c;

    iget v0, v0, Lcom/facebook/orca/common/ui/widgets/text/d;->b:I

    const/4 v3, 0x0

    invoke-direct {v2, v1, v0, v3}, Lcom/facebook/orca/common/ui/widgets/text/c;-><init>(Landroid/text/Layout;ILcom/facebook/orca/common/ui/widgets/text/b;)V

    return-object v2
.end method

.method private a(Ljava/lang/CharSequence;Landroid/text/TextPaint;III)Lcom/facebook/orca/common/ui/widgets/text/d;
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/16 v8, 0xa

    .line 429
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/text/d;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v9}, Lcom/facebook/orca/common/ui/widgets/text/d;-><init>(Ljava/util/List;ILcom/facebook/orca/common/ui/widgets/text/b;)V

    .line 468
    :goto_0
    return-object v0

    .line 432
    :cond_0
    new-instance v0, Landroid/text/StaticLayout;

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    iget-boolean v7, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->i:Z

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 434
    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(Landroid/text/Layout;)I

    move-result v5

    .line 437
    const/4 v1, 0x0

    .line 438
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v6

    move v3, v1

    move v4, p4

    .line 439
    :goto_1
    if-lez v4, :cond_4

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v1

    if-ge v3, v1, :cond_4

    .line 440
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout;->getLineStart(I)I

    move-result v2

    .line 442
    add-int/lit8 v1, p4, -0x1

    if-lt v3, v1, :cond_1

    if-nez v5, :cond_3

    .line 444
    :cond_1
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout;->getLineEnd(I)I

    move-result v1

    .line 445
    add-int/lit8 v7, v1, -0x1

    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v8, :cond_2

    .line 446
    add-int/lit8 v1, v1, -0x1

    .line 460
    :cond_2
    invoke-interface {p1, v2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 461
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    add-int/lit8 v1, v3, 0x1

    .line 463
    add-int/lit8 v2, v4, -0x1

    move v3, v1

    move v4, v2

    .line 464
    goto :goto_1

    :cond_3
    move v1, v2

    .line 452
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v1, v7, :cond_2

    .line 453
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v8, :cond_2

    .line 456
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 465
    :cond_4
    :goto_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p5, :cond_5

    .line 466
    const-string v0, ""

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 468
    :cond_5
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/text/d;

    invoke-direct {v0, v6, v5, v9}, Lcom/facebook/orca/common/ui/widgets/text/d;-><init>(Ljava/util/List;ILcom/facebook/orca/common/ui/widgets/text/b;)V

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 272
    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->p:Lcom/facebook/orca/common/ui/widgets/text/c;

    .line 273
    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->r:Lcom/facebook/orca/common/ui/widgets/text/c;

    .line 274
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->q:I

    .line 275
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->requestLayout()V

    .line 276
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->invalidate()V

    .line 277
    return-void
.end method

.method private a(II)V
    .locals 1

    .prologue
    .line 227
    const/4 v0, 0x0

    .line 228
    packed-switch p1, :pswitch_data_0

    .line 242
    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(Landroid/graphics/Typeface;I)V

    .line 243
    return-void

    .line 230
    :pswitch_0
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    .line 234
    :pswitch_1
    sget-object v0, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    .line 238
    :pswitch_2
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    .line 228
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(Landroid/text/Layout;I)I
    .locals 4

    .prologue
    .line 334
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 335
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 337
    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingTop()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingBottom()I

    move-result v3

    add-int/2addr v0, v3

    .line 339
    sparse-switch v2, :sswitch_data_0

    move v0, v1

    .line 353
    :goto_0
    :sswitch_0
    return v0

    .line 345
    :sswitch_1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    .line 339
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    if-nez v0, :cond_1

    .line 384
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v2}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    .line 385
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    iput v3, v0, Landroid/text/TextPaint;->density:F

    .line 386
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b:I

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setColor(I)V

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->d:Landroid/graphics/Typeface;

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->l:F

    iget v4, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->j:F

    iget v5, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->k:F

    iget v6, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->m:I

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 392
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->d:Landroid/graphics/Typeface;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->d:Landroid/graphics/Typeface;

    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    .line 393
    :goto_0
    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->e:I

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v3

    .line 394
    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v3, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 395
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_3

    const/high16 v0, -0x41800000    # -0.25f

    :goto_1
    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V

    .line 397
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 392
    goto :goto_0

    .line 395
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private c()V
    .locals 1

    .prologue
    .line 400
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->p:Lcom/facebook/orca/common/ui/widgets/text/c;

    if-nez v0, :cond_0

    .line 401
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getWidth()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(I)Lcom/facebook/orca/common/ui/widgets/text/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->p:Lcom/facebook/orca/common/ui/widgets/text/c;

    .line 403
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Typeface;I)V
    .locals 1

    .prologue
    .line 252
    if-lez p2, :cond_0

    .line 253
    if-nez p1, :cond_1

    .line 254
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 259
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->d:Landroid/graphics/Typeface;

    .line 260
    iput p2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->e:I

    .line 261
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    .line 262
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 263
    return-void

    .line 256
    :cond_1
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0
.end method

.method public getMaxLines()I
    .locals 1

    .prologue
    .line 170
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->g:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .prologue
    .line 188
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->h:I

    return v0
.end method

.method public getMinLines()I
    .locals 1

    .prologue
    .line 179
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->f:I

    return v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->n:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 152
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    .prologue
    .line 161
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 358
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 360
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b()V

    .line 361
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c()V

    .line 362
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 365
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getHeight()I

    move-result v0

    .line 366
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->p:Lcom/facebook/orca/common/ui/widgets/text/c;

    iget-object v1, v1, Lcom/facebook/orca/common/ui/widgets/text/c;->a:Landroid/text/Layout;

    .line 367
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v2

    .line 368
    const/4 v3, 0x0

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 369
    div-int/lit8 v0, v0, 0x2

    .line 371
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    int-to-float v0, v0

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->p:Lcom/facebook/orca/common/ui/widgets/text/c;

    iget v0, v0, Lcom/facebook/orca/common/ui/widgets/text/c;->b:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 374
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr v0, v2

    .line 375
    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result v2

    sub-int v0, v2, v0

    neg-int v0, v0

    int-to-float v0, v0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 378
    :cond_0
    invoke-virtual {v1, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 379
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 380
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 281
    const-string v0, "MultilineEllipsizeTextView.onMeasure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 282
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b()V

    .line 283
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v1, p1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getDefaultSize(II)I

    move-result v1

    .line 284
    iget v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->h:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 286
    iget v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->q:I

    if-ne v1, v2, :cond_0

    iget-object v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->r:Lcom/facebook/orca/common/ui/widgets/text/c;

    if-nez v2, :cond_1

    .line 287
    :cond_0
    invoke-direct {p0, v1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(I)Lcom/facebook/orca/common/ui/widgets/text/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->r:Lcom/facebook/orca/common/ui/widgets/text/c;

    .line 288
    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->q:I

    .line 291
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->r:Lcom/facebook/orca/common/ui/widgets/text/c;

    iget-object v1, v1, Lcom/facebook/orca/common/ui/widgets/text/c;->a:Landroid/text/Layout;

    invoke-direct {p0, v1, p1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a(Landroid/text/Layout;I)I

    move-result v1

    .line 292
    iget-object v2, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->r:Lcom/facebook/orca/common/ui/widgets/text/c;

    iget-object v2, v2, Lcom/facebook/orca/common/ui/widgets/text/c;->a:Landroid/text/Layout;

    invoke-direct {p0, v2, p2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b(Landroid/text/Layout;I)I

    move-result v2

    .line 294
    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setMeasuredDimension(II)V

    .line 295
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 296
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 267
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 268
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 269
    return-void
.end method

.method public setMaxLines(I)V
    .locals 0

    .prologue
    .line 174
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->g:I

    .line 175
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 176
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 0

    .prologue
    .line 192
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->h:I

    .line 193
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 194
    return-void
.end method

.method public setMinLines(I)V
    .locals 0

    .prologue
    .line 183
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->f:I

    .line 184
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 185
    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->n:Ljava/lang/CharSequence;

    .line 223
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->a()V

    .line 224
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .prologue
    .line 156
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->b:I

    .line 157
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    .line 158
    return-void
.end method

.method public setTextSize(F)V
    .locals 1

    .prologue
    .line 165
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->c:F

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->o:Landroid/text/TextPaint;

    .line 167
    return-void
.end method
