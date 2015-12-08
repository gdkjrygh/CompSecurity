.class public Lkik/android/widget/VideoController;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/VideoController$b;,
        Lkik/android/widget/VideoController$a;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View$OnClickListener;

.field a:Ljava/lang/StringBuilder;

.field b:Ljava/util/Formatter;

.field private c:Lkik/android/widget/VideoController$a;

.field private d:Landroid/content/Context;

.field private e:Landroid/view/ViewGroup;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ProgressBar;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Landroid/view/View$OnClickListener;

.field private p:Landroid/view/View$OnClickListener;

.field private q:Landroid/widget/ImageButton;

.field private r:Landroid/widget/ImageButton;

.field private s:Landroid/widget/ImageButton;

.field private t:Landroid/widget/ImageButton;

.field private u:Landroid/widget/ImageButton;

.field private v:Landroid/os/Handler;

.field private w:Landroid/view/View$OnClickListener;

.field private x:Landroid/view/View$OnClickListener;

.field private y:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private z:Landroid/view/View$OnClickListener;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 115
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 101
    new-instance v0, Lkik/android/widget/VideoController$b;

    invoke-direct {v0, p0}, Lkik/android/widget/VideoController$b;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    .line 450
    new-instance v0, Lkik/android/widget/ej;

    invoke-direct {v0, p0}, Lkik/android/widget/ej;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->w:Landroid/view/View$OnClickListener;

    .line 458
    new-instance v0, Lkik/android/widget/ek;

    invoke-direct {v0, p0}, Lkik/android/widget/ek;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->x:Landroid/view/View$OnClickListener;

    .line 514
    new-instance v0, Lkik/android/widget/el;

    invoke-direct {v0, p0}, Lkik/android/widget/el;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->y:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 583
    new-instance v0, Lkik/android/widget/em;

    invoke-direct {v0, p0}, Lkik/android/widget/em;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->z:Landroid/view/View$OnClickListener;

    .line 599
    new-instance v0, Lkik/android/widget/en;

    invoke-direct {v0, p0}, Lkik/android/widget/en;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->A:Landroid/view/View$OnClickListener;

    .line 116
    iput-object p1, p0, Lkik/android/widget/VideoController;->d:Landroid/content/Context;

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/VideoController;->l:Z

    .line 119
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1}, Lkik/android/widget/VideoController;-><init>(Landroid/content/Context;)V

    .line 125
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 105
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 101
    new-instance v0, Lkik/android/widget/VideoController$b;

    invoke-direct {v0, p0}, Lkik/android/widget/VideoController$b;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    .line 450
    new-instance v0, Lkik/android/widget/ej;

    invoke-direct {v0, p0}, Lkik/android/widget/ej;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->w:Landroid/view/View$OnClickListener;

    .line 458
    new-instance v0, Lkik/android/widget/ek;

    invoke-direct {v0, p0}, Lkik/android/widget/ek;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->x:Landroid/view/View$OnClickListener;

    .line 514
    new-instance v0, Lkik/android/widget/el;

    invoke-direct {v0, p0}, Lkik/android/widget/el;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->y:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 583
    new-instance v0, Lkik/android/widget/em;

    invoke-direct {v0, p0}, Lkik/android/widget/em;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->z:Landroid/view/View$OnClickListener;

    .line 599
    new-instance v0, Lkik/android/widget/en;

    invoke-direct {v0, p0}, Lkik/android/widget/en;-><init>(Lkik/android/widget/VideoController;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->A:Landroid/view/View$OnClickListener;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    .line 107
    iput-object p1, p0, Lkik/android/widget/VideoController;->d:Landroid/content/Context;

    .line 108
    iput-boolean v1, p0, Lkik/android/widget/VideoController;->l:Z

    .line 109
    iput-boolean v1, p0, Lkik/android/widget/VideoController;->m:Z

    .line 111
    return-void
.end method

.method static synthetic a(Lkik/android/widget/VideoController;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lkik/android/widget/VideoController;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/16 v6, 0xff

    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 179
    const v0, 0x7f0e01a0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    .line 180
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->requestFocus()Z

    .line 182
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    iget-object v4, p0, Lkik/android/widget/VideoController;->w:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    :cond_0
    const v0, 0x7f0e019d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    .line 186
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    .line 187
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    iget-object v4, p0, Lkik/android/widget/VideoController;->A:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->m:Z

    if-nez v0, :cond_1

    .line 189
    iget-object v4, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->l:Z

    if-eqz v0, :cond_9

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 193
    :cond_1
    const v0, 0x7f0e019c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    .line 194
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    .line 195
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    iget-object v4, p0, Lkik/android/widget/VideoController;->z:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->m:Z

    if-nez v0, :cond_2

    .line 197
    iget-object v4, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->l:Z

    if-eqz v0, :cond_a

    move v0, v1

    :goto_1
    invoke-virtual {v4, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 202
    :cond_2
    const v0, 0x7f0e019e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    .line 203
    iget-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->m:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->n:Z

    if-nez v0, :cond_3

    .line 204
    iget-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 206
    :cond_3
    const v0, 0x7f0e019b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    .line 207
    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->m:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->n:Z

    if-nez v0, :cond_4

    .line 208
    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 211
    :cond_4
    const v0, 0x7f0e01a1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    .line 212
    iget-object v0, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_6

    .line 213
    iget-object v0, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    instance-of v0, v0, Landroid/widget/SeekBar;

    if-eqz v0, :cond_5

    .line 214
    iget-object v0, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    check-cast v0, Landroid/widget/SeekBar;

    .line 215
    new-instance v2, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v4, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v4}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v4, -0x50

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;->setIntrinsicHeight(I)V

    const/16 v4, 0x1e

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;->setIntrinsicWidth(I)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 216
    iget-object v2, p0, Lkik/android/widget/VideoController;->y:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 217
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 219
    :cond_5
    iget-object v0, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 222
    :cond_6
    const v0, 0x7f0e01a2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/widget/VideoController;->h:Landroid/widget/TextView;

    .line 223
    const v0, 0x7f0e019f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/widget/VideoController;->i:Landroid/widget/TextView;

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lkik/android/widget/VideoController;->a:Ljava/lang/StringBuilder;

    .line 225
    new-instance v0, Ljava/util/Formatter;

    iget-object v2, p0, Lkik/android/widget/VideoController;->a:Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v0, p0, Lkik/android/widget/VideoController;->b:Ljava/util/Formatter;

    .line 227
    iget-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    iget-object v2, p0, Lkik/android/widget/VideoController;->o:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    iget-object v0, p0, Lkik/android/widget/VideoController;->o:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_b

    move v0, v3

    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_7
    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    iget-object v2, p0, Lkik/android/widget/VideoController;->p:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    iget-object v2, p0, Lkik/android/widget/VideoController;->p:Landroid/view/View$OnClickListener;

    if-eqz v2, :cond_c

    :goto_3
    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 228
    :cond_8
    return-void

    :cond_9
    move v0, v2

    .line 189
    goto/16 :goto_0

    :cond_a
    move v0, v2

    .line 197
    goto/16 :goto_1

    :cond_b
    move v0, v1

    .line 227
    goto :goto_2

    :cond_c
    move v3, v1

    goto :goto_3
.end method

.method static synthetic a(Lkik/android/widget/VideoController;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Lkik/android/widget/VideoController;->g()V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/VideoController;Z)Z
    .locals 0

    .prologue
    .line 74
    iput-boolean p1, p0, Lkik/android/widget/VideoController;->k:Z

    return p1
.end method

.method static synthetic b(Lkik/android/widget/VideoController;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    return-object v0
.end method

.method private b(I)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 341
    div-int/lit16 v0, p1, 0x3e8

    .line 343
    rem-int/lit8 v1, v0, 0x3c

    .line 344
    div-int/lit8 v2, v0, 0x3c

    rem-int/lit8 v2, v2, 0x3c

    .line 345
    div-int/lit16 v0, v0, 0xe10

    .line 347
    iget-object v3, p0, Lkik/android/widget/VideoController;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 348
    if-lez v0, :cond_0

    .line 349
    iget-object v3, p0, Lkik/android/widget/VideoController;->b:Ljava/util/Formatter;

    const-string v4, "%d:%02d:%02d"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v8

    invoke-virtual {v3, v4, v5}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0

    .line 352
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/widget/VideoController;->b:Ljava/util/Formatter;

    const-string v3, "%02d:%02d"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v7

    invoke-virtual {v0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/widget/VideoController;)Lkik/android/widget/VideoController$a;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    return-object v0
.end method

.method static synthetic d(Lkik/android/widget/VideoController;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/widget/VideoController;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lkik/android/widget/VideoController;)Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->k:Z

    return v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 255
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    if-nez v0, :cond_1

    .line 277
    :cond_0
    :goto_0
    return-void

    .line 260
    :cond_1
    :try_start_0
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 261
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 263
    :cond_2
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->g()Z

    move-result v0

    if-nez v0, :cond_3

    .line 264
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 267
    :cond_3
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/IncompatibleClassChangeError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 277
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic f(Lkik/android/widget/VideoController;)Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->j:Z

    return v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 482
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    if-nez v0, :cond_0

    .line 493
    :goto_0
    return-void

    .line 486
    :cond_0
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->b()V

    .line 492
    :goto_1
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->e()V

    goto :goto_0

    .line 490
    :cond_1
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->a()V

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 246
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/VideoController;->a(I)V

    .line 247
    return-void
.end method

.method public final a(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 287
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/VideoController;->e:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 288
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->d()I

    .line 289
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->requestFocus()Z

    .line 292
    :cond_0
    invoke-direct {p0}, Lkik/android/widget/VideoController;->f()V

    .line 294
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    const/16 v3, 0x50

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 299
    iget-object v1, p0, Lkik/android/widget/VideoController;->e:Landroid/view/ViewGroup;

    invoke-virtual {v1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 300
    iput-boolean v4, p0, Lkik/android/widget/VideoController;->j:Z

    .line 302
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->e()V

    .line 307
    iget-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 309
    iget-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 310
    if-eqz p1, :cond_2

    .line 311
    iget-object v1, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 312
    iget-object v1, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 314
    :cond_2
    return-void
.end method

.method public final a(Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    const/4 v0, -0x1

    .line 148
    iput-object p1, p0, Lkik/android/widget/VideoController;->e:Landroid/view/ViewGroup;

    .line 150
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 155
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->removeAllViews()V

    .line 156
    iget-object v0, p0, Lkik/android/widget/VideoController;->d:Landroid/content/Context;

    const-string v2, "layout_inflater"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v2, 0x7f03007e

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    iget-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    invoke-direct {p0, v0}, Lkik/android/widget/VideoController;->a(Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    .line 157
    invoke-virtual {p0, v0, v1}, Lkik/android/widget/VideoController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    return-void
.end method

.method public final a(Lkik/android/widget/VideoController$a;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    .line 138
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->e()V

    .line 139
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 318
    iget-boolean v0, p0, Lkik/android/widget/VideoController;->j:Z

    return v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 326
    iget-object v0, p0, Lkik/android/widget/VideoController;->e:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 337
    :goto_0
    return-void

    .line 331
    :cond_0
    :try_start_0
    iget-object v0, p0, Lkik/android/widget/VideoController;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 332
    iget-object v0, p0, Lkik/android/widget/VideoController;->v:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/VideoController;->j:Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final d()I
    .locals 6

    .prologue
    .line 358
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/VideoController;->k:Z

    if-eqz v0, :cond_2

    .line 359
    :cond_0
    const/4 v0, 0x0

    .line 377
    :cond_1
    :goto_0
    return v0

    .line 362
    :cond_2
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->d()I

    move-result v0

    .line 363
    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v1}, Lkik/android/widget/VideoController$a;->c()I

    move-result v1

    .line 364
    iget-object v2, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    if-eqz v2, :cond_3

    .line 365
    if-lez v1, :cond_3

    .line 367
    const-wide/16 v2, 0x3e8

    int-to-long v4, v0

    mul-long/2addr v2, v4

    int-to-long v4, v1

    div-long/2addr v2, v4

    .line 368
    iget-object v4, p0, Lkik/android/widget/VideoController;->g:Landroid/widget/ProgressBar;

    long-to-int v2, v2

    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 372
    :cond_3
    iget-object v2, p0, Lkik/android/widget/VideoController;->h:Landroid/widget/TextView;

    if-eqz v2, :cond_4

    .line 373
    iget-object v2, p0, Lkik/android/widget/VideoController;->h:Landroid/widget/TextView;

    invoke-direct {p0, v1}, Lkik/android/widget/VideoController;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 374
    :cond_4
    iget-object v1, p0, Lkik/android/widget/VideoController;->i:Landroid/widget/TextView;

    if-eqz v1, :cond_1

    .line 375
    iget-object v1, p0, Lkik/android/widget/VideoController;->i:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lkik/android/widget/VideoController;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    .line 397
    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    if-nez v1, :cond_1

    .line 447
    :cond_0
    :goto_0
    return v0

    .line 401
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    .line 402
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    move v1, v0

    .line 404
    :goto_1
    const/16 v4, 0x4f

    if-eq v3, v4, :cond_2

    const/16 v4, 0x55

    if-eq v3, v4, :cond_2

    const/16 v4, 0x3e

    if-ne v3, v4, :cond_4

    .line 407
    :cond_2
    if-eqz v1, :cond_0

    .line 408
    invoke-direct {p0}, Lkik/android/widget/VideoController;->g()V

    .line 409
    invoke-virtual {p0, v2}, Lkik/android/widget/VideoController;->a(I)V

    .line 410
    iget-object v1, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v1, :cond_0

    .line 411
    iget-object v1, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->requestFocus()Z

    goto :goto_0

    :cond_3
    move v1, v2

    .line 402
    goto :goto_1

    .line 416
    :cond_4
    const/16 v4, 0x7e

    if-ne v3, v4, :cond_5

    .line 417
    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v1}, Lkik/android/widget/VideoController$a;->e()Z

    move-result v1

    if-nez v1, :cond_0

    .line 418
    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v1}, Lkik/android/widget/VideoController$a;->a()V

    .line 419
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->e()V

    .line 420
    invoke-virtual {p0, v2}, Lkik/android/widget/VideoController;->a(I)V

    goto :goto_0

    .line 424
    :cond_5
    const/16 v4, 0x56

    if-eq v3, v4, :cond_6

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_7

    .line 426
    :cond_6
    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v1}, Lkik/android/widget/VideoController$a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 427
    iget-object v1, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v1}, Lkik/android/widget/VideoController$a;->b()V

    .line 428
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->e()V

    .line 429
    invoke-virtual {p0, v2}, Lkik/android/widget/VideoController;->a(I)V

    goto :goto_0

    .line 433
    :cond_7
    const/16 v4, 0x19

    if-eq v3, v4, :cond_8

    const/16 v4, 0x18

    if-eq v3, v4, :cond_8

    const/16 v4, 0xa4

    if-ne v3, v4, :cond_9

    .line 437
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 439
    :cond_9
    const/4 v4, 0x4

    if-eq v3, v4, :cond_a

    const/16 v4, 0x52

    if-ne v3, v4, :cond_b

    .line 440
    :cond_a
    if-eqz v1, :cond_0

    .line 441
    invoke-virtual {p0}, Lkik/android/widget/VideoController;->c()V

    goto/16 :goto_0

    .line 446
    :cond_b
    invoke-virtual {p0, v2}, Lkik/android/widget/VideoController;->a(I)V

    .line 447
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 468
    iget-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    if-nez v0, :cond_1

    .line 478
    :cond_0
    :goto_0
    return-void

    .line 472
    :cond_1
    iget-object v0, p0, Lkik/android/widget/VideoController;->c:Lkik/android/widget/VideoController$a;

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 473
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    const v1, 0x7f020143

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 476
    :cond_2
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    const v1, 0x7f020144

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method

.method public onFinishInflate()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lkik/android/widget/VideoController;->f:Landroid/view/View;

    invoke-direct {p0, v0}, Lkik/android/widget/VideoController;->a(Landroid/view/View;)V

    .line 133
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 383
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/VideoController;->a(I)V

    .line 384
    const/4 v0, 0x1

    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 390
    invoke-virtual {p0, v0}, Lkik/android/widget/VideoController;->a(I)V

    .line 391
    return v0
.end method

.method public setEnabled(Z)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 564
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 565
    iget-object v0, p0, Lkik/android/widget/VideoController;->q:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 567
    :cond_0
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    .line 568
    iget-object v0, p0, Lkik/android/widget/VideoController;->r:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 570
    :cond_1
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    .line 571
    iget-object v0, p0, Lkik/android/widget/VideoController;->s:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 573
    :cond_2
    iget-object v0, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    if-eqz v0, :cond_3

    .line 574
    iget-object v3, p0, Lkik/android/widget/VideoController;->t:Landroid/widget/ImageButton;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lkik/android/widget/VideoController;->o:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_5

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 576
    :cond_3
    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    if-eqz v0, :cond_4

    .line 577
    iget-object v0, p0, Lkik/android/widget/VideoController;->u:Landroid/widget/ImageButton;

    if-eqz p1, :cond_6

    iget-object v3, p0, Lkik/android/widget/VideoController;->p:Landroid/view/View$OnClickListener;

    if-eqz v3, :cond_6

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 579
    :cond_4
    invoke-direct {p0}, Lkik/android/widget/VideoController;->f()V

    .line 580
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 581
    return-void

    :cond_5
    move v0, v2

    .line 574
    goto :goto_0

    :cond_6
    move v1, v2

    .line 577
    goto :goto_1
.end method
