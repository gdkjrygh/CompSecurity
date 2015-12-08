.class public final Lkik/android/chat/fragment/rl;
.super Landroid/support/v7/widget/RecyclerView$a;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/rl$1;,
        Lkik/android/chat/fragment/rl$a;
    }
.end annotation


# instance fields
.field private final a:D

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:J

.field private n:Lkik/android/chat/fragment/rl$a;

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:J

.field private u:Ljava/util/List;

.field private v:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/16 v3, 0xa

    const/4 v2, 0x0

    .line 37
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$a;-><init>()V

    .line 40
    const-wide v0, 0x4063200000000000L    # 153.0

    iput-wide v0, p0, Lkik/android/chat/fragment/rl;->a:D

    .line 42
    const v0, 0x7f0c0087

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->b:I

    .line 43
    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->c:I

    .line 44
    const/16 v0, 0x14

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->d:I

    .line 45
    const/16 v0, 0x1a

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->e:I

    .line 46
    const/16 v0, 0xd

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->f:I

    .line 47
    const/4 v0, 0x6

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->g:I

    .line 48
    const/16 v0, 0x10

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->h:I

    .line 49
    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->i:I

    .line 50
    const/16 v0, 0x30

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->j:I

    .line 51
    const/16 v0, 0x9

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->k:I

    .line 52
    iget v0, p0, Lkik/android/chat/fragment/rl;->f:I

    iget v1, p0, Lkik/android/chat/fragment/rl;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lkik/android/chat/fragment/rl;->l:I

    .line 53
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lkik/android/chat/fragment/rl;->m:J

    .line 56
    const v0, 0x7f0c003c

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->o:I

    .line 57
    iput v2, p0, Lkik/android/chat/fragment/rl;->p:I

    .line 58
    iput v2, p0, Lkik/android/chat/fragment/rl;->q:I

    .line 59
    iput v2, p0, Lkik/android/chat/fragment/rl;->r:I

    .line 60
    iput v2, p0, Lkik/android/chat/fragment/rl;->s:I

    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/chat/fragment/rl;->t:J

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/rl;->v:Ljava/util/List;

    .line 323
    return-void
.end method

.method private a(Landroid/graphics/Paint;I)I
    .locals 4

    .prologue
    .line 267
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/z;

    .line 269
    invoke-virtual {v0}, Lkik/a/d/z;->b()Lkik/a/d/z$a;

    move-result-object v1

    sget-object v2, Lkik/a/d/z$a;->a:Lkik/a/d/z$a;

    if-ne v1, v2, :cond_0

    .line 270
    invoke-virtual {v0}, Lkik/a/d/z;->c()Ljava/lang/CharSequence;

    move-result-object v0

    .line 271
    iget v1, p0, Lkik/android/chat/fragment/rl;->l:I

    mul-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v0

    float-to-int v0, v0

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/rl;->j:I

    iget v2, p0, Lkik/android/chat/fragment/rl;->g:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 275
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lkik/android/chat/fragment/rl;->c:I

    iget v1, p0, Lkik/android/chat/fragment/rl;->g:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/rl;)Lkik/android/chat/fragment/rl$a;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->n:Lkik/android/chat/fragment/rl$a;

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/rl;)Ljava/util/List;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final a(I)I
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/z;

    invoke-virtual {v0}, Lkik/a/d/z;->b()Lkik/a/d/z$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/z$a;->a()I

    move-result v0

    return v0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 7

    .prologue
    const v3, 0x7f0e013b

    const/4 v2, 0x0

    .line 36
    iget v0, p0, Lkik/android/chat/fragment/rl;->r:I

    if-gtz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/rl;->r:I

    :cond_0
    invoke-static {p2}, Lkik/a/d/z$a;->a(I)Lkik/a/d/z$a;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/rl$1;->a:[I

    invoke-virtual {v0}, Lkik/a/d/z$a;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03005f

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget v2, p0, Lkik/android/chat/fragment/rl;->b:I

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Landroid/graphics/drawable/Drawable;I)V

    new-instance v1, Lkik/android/chat/fragment/rq;

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/rq;-><init>(Landroid/view/View;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03005e

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const v1, 0x7f0e013c

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget v3, p0, Lkik/android/chat/fragment/rl;->o:I

    invoke-static {v2, v3}, Lkik/android/util/cv;->a(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/16 v3, 0x99

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v3

    iget v6, p0, Lkik/android/chat/fragment/rl;->q:I

    sub-int/2addr v3, v6

    iget v6, p0, Lkik/android/chat/fragment/rl;->c:I

    if-lt v3, v6, :cond_2

    iget v3, p0, Lkik/android/chat/fragment/rl;->q:I

    sub-int v3, v2, v3

    iget v2, p0, Lkik/android/chat/fragment/rl;->q:I

    sub-int v2, v5, v2

    :goto_1
    iget v5, p0, Lkik/android/chat/fragment/rl;->d:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v5

    iget v6, p0, Lkik/android/chat/fragment/rl;->d:I

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v6

    invoke-virtual {v1, v3, v5, v2, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    iget v2, p0, Lkik/android/chat/fragment/rl;->p:I

    if-eqz v2, :cond_1

    iget v2, p0, Lkik/android/chat/fragment/rl;->p:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    new-instance v2, Lkik/android/chat/fragment/rm;

    invoke-direct {v2, p0, v4, v1}, Lkik/android/chat/fragment/rm;-><init>(Lkik/android/chat/fragment/rl;Landroid/view/View;Landroid/widget/TextView;)V

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Lkik/android/chat/fragment/rp;

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/rp;-><init>(Landroid/view/View;)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    iget v3, p0, Lkik/android/chat/fragment/rl;->q:I

    add-int/2addr v3, v2

    iget v2, p0, Lkik/android/chat/fragment/rl;->q:I

    add-int/2addr v2, v5

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lkik/android/chat/fragment/rl$a;)Lkik/android/chat/fragment/rl;
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lkik/android/chat/fragment/rl;->n:Lkik/android/chat/fragment/rl$a;

    .line 188
    return-object p0
.end method

.method public final a(II)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 233
    iput v0, p0, Lkik/android/chat/fragment/rl;->q:I

    .line 234
    iput p2, p0, Lkik/android/chat/fragment/rl;->s:I

    .line 235
    iget v1, p0, Lkik/android/chat/fragment/rl;->l:I

    iget v2, p0, Lkik/android/chat/fragment/rl;->i:I

    add-int/2addr v1, v2

    .line 236
    sub-int v3, p1, v1

    .line 237
    new-instance v4, Landroid/text/TextPaint;

    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 239
    iget v1, p0, Lkik/android/chat/fragment/rl;->h:I

    int-to-float v1, v1

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 240
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 241
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 244
    invoke-virtual {p0}, Lkik/android/chat/fragment/rl;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v0

    :goto_0
    if-lt v1, p2, :cond_0

    .line 245
    invoke-direct {p0, v4, v1}, Lkik/android/chat/fragment/rl;->a(Landroid/graphics/Paint;I)I

    move-result v5

    add-int/2addr v2, v5

    .line 244
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 249
    :cond_0
    if-le v2, v3, :cond_2

    if-gt v2, p1, :cond_2

    .line 250
    sub-int v0, v2, v3

    .line 256
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/rl;->a()I

    move-result v1

    sub-int/2addr v1, p2

    div-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lkik/android/chat/fragment/rl;->q:I

    .line 257
    return-void

    .line 252
    :cond_2
    if-le v2, p1, :cond_1

    sub-int v1, v2, p1

    iget v3, p0, Lkik/android/chat/fragment/rl;->i:I

    if-ge v1, v3, :cond_1

    .line 253
    sub-int v0, v2, p1

    iget v1, p0, Lkik/android/chat/fragment/rl;->i:I

    sub-int/2addr v0, v1

    goto :goto_1
.end method

.method public final synthetic a(Landroid/support/v7/widget/RecyclerView$t;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 36
    check-cast p1, Lkik/android/chat/fragment/rr;

    invoke-virtual {p0}, Lkik/android/chat/fragment/rl;->a()I

    move-result v0

    if-ge p2, v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p1, Lkik/android/chat/fragment/rr;->a:Landroid/view/View;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Lkik/android/chat/fragment/rr;->a:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/rn;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/rn;-><init>(Lkik/android/chat/fragment/rl;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    if-nez p2, :cond_2

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v1

    iget v2, p0, Lkik/android/chat/fragment/rl;->k:I

    invoke-virtual {v1, v2}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    :cond_2
    instance-of v1, p1, Lkik/android/chat/fragment/rp;

    if-eqz v1, :cond_4

    move-object v0, p1

    check-cast v0, Lkik/android/chat/fragment/rp;

    iget-object v1, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/z;

    invoke-virtual {v1}, Lkik/a/d/z;->c()Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/rp;->j:Ljava/lang/CharSequence;

    iget-object v1, v0, Lkik/android/chat/fragment/rp;->k:Landroid/widget/TextView;

    iget-object v0, v0, Lkik/android/chat/fragment/rp;->j:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object v0, p1

    check-cast v0, Lkik/android/chat/fragment/rp;

    iget-object v0, v0, Lkik/android/chat/fragment/rp;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v5}, Landroid/widget/TextView;->measure(II)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    iget v2, p0, Lkik/android/chat/fragment/rl;->j:I

    if-gt v1, v2, :cond_3

    iget v1, p0, Lkik/android/chat/fragment/rl;->d:I

    iget v2, p0, Lkik/android/chat/fragment/rl;->q:I

    add-int/2addr v1, v2

    iget v2, p0, Lkik/android/chat/fragment/rl;->e:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, Lkik/android/chat/fragment/rl;->d:I

    iget v3, p0, Lkik/android/chat/fragment/rl;->q:I

    add-int/2addr v2, v3

    iget v3, p0, Lkik/android/chat/fragment/rl;->e:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_3
    :goto_1
    iget v0, p0, Lkik/android/chat/fragment/rl;->s:I

    if-lt p2, v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/rl;->v:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/rl;->v:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lkik/android/chat/fragment/rr;->a:Landroid/view/View;

    iget v1, p0, Lkik/android/chat/fragment/rl;->r:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, p1, Lkik/android/chat/fragment/rr;->a:Landroid/view/View;

    sget-object v1, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    iget v3, p0, Lkik/android/chat/fragment/rl;->r:I

    int-to-float v3, v3

    aput v3, v2, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-wide v2, p0, Lkik/android/chat/fragment/rl;->t:J

    invoke-virtual {v0, v2, v3}, Landroid/animation/Animator;->setStartDelay(J)V

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto/16 :goto_0

    :cond_4
    instance-of v1, p1, Lkik/android/chat/fragment/rq;

    if-eqz v1, :cond_3

    new-instance v1, Lkik/android/chat/fragment/ro;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/ro;-><init>(Lkik/android/chat/fragment/rl;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1
.end method

.method public final a(Ljava/util/List;Landroid/content/Context;Lkik/android/e/f;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 203
    iget-object v0, p0, Lkik/android/chat/fragment/rl;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 206
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 209
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    move v7, v4

    .line 210
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 211
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkik/a/d/z;

    .line 212
    invoke-virtual {v6}, Lkik/a/d/z;->b()Lkik/a/d/z$a;

    move-result-object v0

    sget-object v1, Lkik/a/d/z$a;->a:Lkik/a/d/z$a;

    if-ne v0, v1, :cond_0

    .line 213
    invoke-virtual {v6}, Lkik/a/d/z;->c()Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x15

    move-object v0, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 214
    invoke-virtual {v6, v0}, Lkik/a/d/z;->a(Ljava/lang/CharSequence;)V

    .line 215
    invoke-interface {v8, v7, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 210
    :cond_0
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    .line 220
    :cond_1
    invoke-static {v8}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 222
    :cond_2
    iput-object v8, p0, Lkik/android/chat/fragment/rl;->u:Ljava/util/List;

    .line 223
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 193
    iput p1, p0, Lkik/android/chat/fragment/rl;->o:I

    .line 194
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 198
    iput p1, p0, Lkik/android/chat/fragment/rl;->p:I

    .line 199
    return-void
.end method

.method public final d(I)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 293
    iput v1, p0, Lkik/android/chat/fragment/rl;->q:I

    .line 295
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 297
    iget v0, p0, Lkik/android/chat/fragment/rl;->h:I

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 298
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 299
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 302
    invoke-virtual {p0}, Lkik/android/chat/fragment/rl;->a()I

    move-result v0

    .line 304
    if-gtz v0, :cond_1

    .line 305
    const/4 v0, -0x1

    .line 315
    :cond_0
    :goto_0
    return v0

    .line 308
    :cond_1
    add-int/lit8 v0, v0, -0x1

    move v2, v1

    :goto_1
    if-ltz v0, :cond_2

    .line 309
    invoke-direct {p0, v3, v0}, Lkik/android/chat/fragment/rl;->a(Landroid/graphics/Paint;I)I

    move-result v4

    add-int/2addr v2, v4

    .line 311
    if-ge v2, p1, :cond_0

    .line 308
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 315
    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 320
    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Lkik/android/chat/fragment/rl;->t:J

    .line 321
    return-void
.end method
