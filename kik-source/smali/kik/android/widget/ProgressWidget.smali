.class public Lkik/android/widget/ProgressWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field private static final d:I


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private e:Lkik/android/widget/ProgressWheel;

.field private f:Landroid/widget/ImageView;

.field private g:Ljava/lang/ref/WeakReference;

.field private h:[Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:Lcom/kik/cache/MaskedContentPreviewImage;

.field private m:Landroid/widget/TextView;

.field private final n:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const v0, 0x7f0c004e

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    sput v0, Lkik/android/widget/ProgressWidget;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 94
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    const/16 v0, 0xa

    iput v0, p0, Lkik/android/widget/ProgressWidget;->a:I

    .line 28
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/widget/ProgressWidget;->b:I

    .line 29
    iput v4, p0, Lkik/android/widget/ProgressWidget;->c:I

    .line 42
    new-instance v0, Lkik/android/widget/db;

    invoke-direct {v0, p0}, Lkik/android/widget/db;-><init>(Lkik/android/widget/ProgressWidget;)V

    iput-object v0, p0, Lkik/android/widget/ProgressWidget;->n:Landroid/os/Handler;

    .line 95
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030060

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 96
    const v0, 0x7f0e013f

    invoke-virtual {p0, v0}, Lkik/android/widget/ProgressWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    .line 97
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 98
    const v0, 0x7f0e013e

    invoke-virtual {p0, v0}, Lkik/android/widget/ProgressWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lkik/android/widget/ProgressWidget;->f:Landroid/widget/ImageView;

    .line 99
    const v0, 0x7f0e013d

    invoke-virtual {p0, v0}, Lkik/android/widget/ProgressWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 101
    return-void
.end method

.method static synthetic a(Lkik/android/widget/ProgressWidget;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->g:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 295
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    if-eqz v0, :cond_0

    .line 296
    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 297
    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    .line 298
    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    invoke-virtual {v1}, Lkik/android/widget/ProgressWheel;->b()F

    move-result v1

    cmpl-float v1, v0, v1

    if-lez v1, :cond_0

    .line 299
    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    invoke-virtual {v1, v0}, Lkik/android/widget/ProgressWheel;->a(F)V

    .line 302
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/widget/ProgressWidget;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lkik/android/widget/ProgressWidget;->a(I)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    if-eqz v0, :cond_0

    .line 179
    if-eqz p1, :cond_1

    .line 180
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    sget v1, Lkik/android/widget/ProgressWidget;->d:I

    invoke-virtual {v0, v1}, Lcom/kik/cache/MaskedContentPreviewImage;->c(I)V

    .line 186
    :cond_0
    :goto_0
    return-void

    .line 183
    :cond_1
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    invoke-virtual {v0}, Lcom/kik/cache/MaskedContentPreviewImage;->a()V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/ProgressWidget;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 25
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    const/16 v1, 0xc8

    new-instance v2, Lkik/android/widget/dd;

    invoke-direct {v2, p0}, Lkik/android/widget/dd;-><init>(Lkik/android/widget/ProgressWidget;)V

    invoke-static {v0, v1, v2}, Lkik/android/util/av;->a(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    invoke-direct {p0, v3}, Lkik/android/widget/ProgressWidget;->a(Z)V

    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 245
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 247
    invoke-virtual {p0, v2}, Lkik/android/widget/ProgressWidget;->setVisibility(I)V

    .line 249
    :cond_0
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 250
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->f:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 252
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->j:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 253
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 255
    :cond_1
    invoke-direct {p0, v3}, Lkik/android/widget/ProgressWidget;->a(Z)V

    .line 256
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lkik/android/widget/ProgressWidget;->a(I)V

    .line 257
    return-void
.end method

.method static synthetic c(Lkik/android/widget/ProgressWidget;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->c()V

    return-void
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 261
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 262
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 263
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->f:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 264
    invoke-direct {p0, v2}, Lkik/android/widget/ProgressWidget;->a(Z)V

    .line 265
    return-void
.end method

.method static synthetic d(Lkik/android/widget/ProgressWidget;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->d()V

    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    const v1, 0x7f0c0086

    invoke-virtual {v0, v1}, Lkik/android/widget/ProgressWheel;->setBackgroundResource(I)V

    .line 291
    :cond_0
    return-void
.end method

.method static synthetic e(Lkik/android/widget/ProgressWidget;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->e()V

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lkik/android/widget/ProgressWidget;->a(I)V

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->f:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    invoke-direct {p0, v2}, Lkik/android/widget/ProgressWidget;->a(Z)V

    return-void
.end method

.method static synthetic f(Lkik/android/widget/ProgressWidget;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->e()V

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->f:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->m:Landroid/widget/TextView;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    invoke-direct {p0, v2}, Lkik/android/widget/ProgressWidget;->a(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->n:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 145
    return-void
.end method

.method public final a(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->j:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->j:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    .line 227
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 196
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    .line 197
    iput-object p2, p0, Lkik/android/widget/ProgressWidget;->j:Landroid/view/View;

    .line 198
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    if-nez v0, :cond_1

    .line 222
    :cond_0
    :goto_0
    return-void

    .line 202
    :cond_1
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->g:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/e/e;

    .line 204
    if-eqz v0, :cond_4

    .line 205
    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v1

    if-ne v1, v4, :cond_3

    .line 206
    :cond_2
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 207
    invoke-direct {p0, v4}, Lkik/android/widget/ProgressWidget;->a(Z)V

    .line 208
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 209
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0

    .line 211
    :cond_3
    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 212
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 213
    invoke-direct {p0, v3}, Lkik/android/widget/ProgressWidget;->a(Z)V

    .line 214
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 215
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0

    .line 219
    :cond_4
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->i:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Lcom/kik/cache/MaskedContentPreviewImage;)V
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    invoke-virtual {v0}, Lcom/kik/cache/MaskedContentPreviewImage;->a()V

    .line 173
    :cond_0
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->l:Lcom/kik/cache/MaskedContentPreviewImage;

    .line 174
    return-void
.end method

.method public final a(Ljava/lang/ref/WeakReference;)V
    .locals 3

    .prologue
    .line 105
    if-nez p1, :cond_0

    .line 137
    :goto_0
    return-void

    .line 109
    :cond_0
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->g:Ljava/lang/ref/WeakReference;

    .line 110
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    if-eqz v0, :cond_3

    .line 111
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/e/e;

    .line 112
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    .line 113
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lkik/android/widget/ProgressWidget;->setVisibility(I)V

    .line 114
    new-instance v1, Lkik/android/widget/dc;

    invoke-direct {v1, p0}, Lkik/android/widget/dc;-><init>(Lkik/android/widget/ProgressWidget;)V

    invoke-interface {v0, v1}, Lkik/android/e/e;->a(Lkik/android/e/e$a;)V

    .line 122
    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 123
    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->c()V

    goto :goto_0

    .line 126
    :cond_1
    invoke-interface {v0}, Lkik/android/e/e;->b()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 127
    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->d()V

    .line 128
    invoke-interface {v0}, Lkik/android/e/e;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lkik/android/widget/ProgressWidget;->a(I)V

    goto :goto_0

    .line 133
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lkik/android/widget/ProgressWidget;->setVisibility(I)V

    .line 136
    :cond_3
    invoke-virtual {p0}, Lkik/android/widget/ProgressWidget;->a()V

    goto :goto_0
.end method

.method public final a(Lkik/android/widget/ProgressWheel;)V
    .locals 1

    .prologue
    .line 159
    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    if-ne v0, p1, :cond_1

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 162
    :cond_1
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    .line 163
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->e:Lkik/android/widget/ProgressWheel;

    invoke-virtual {v0}, Lkik/android/widget/ProgressWheel;->a()V

    .line 164
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lkik/android/widget/ProgressWidget;->a(I)V

    goto :goto_0
.end method

.method public final a([Landroid/view/View;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lkik/android/widget/ProgressWidget;->h:[Landroid/view/View;

    .line 155
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 332
    invoke-direct {p0}, Lkik/android/widget/ProgressWidget;->d()V

    .line 333
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->n:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 334
    return-void
.end method

.method public final b(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lkik/android/widget/ProgressWidget;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    :cond_0
    return-void
.end method
