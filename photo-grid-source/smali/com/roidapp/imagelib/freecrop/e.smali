.class public final Lcom/roidapp/imagelib/freecrop/e;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/freecrop/p;


# instance fields
.field private A:Landroid/os/Handler;

.field public a:I

.field protected b:Ljava/lang/String;

.field protected c:Landroid/view/View;

.field private final d:I

.field private final e:I

.field private f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

.field private g:Lcom/roidapp/imagelib/freecrop/Magnifier;

.field private h:Landroid/widget/RelativeLayout;

.field private i:[Ljava/lang/Integer;

.field private j:Lcom/roidapp/imagelib/filter/av;

.field private final k:I

.field private final l:I

.field private m:Landroid/graphics/Bitmap;

.field private n:Lcom/roidapp/imagelib/freecrop/n;

.field private o:Lcom/roidapp/imagelib/freecrop/d;

.field private volatile p:Z

.field private q:Z

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

.field private v:Landroid/widget/FrameLayout;

.field private w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 53
    const/16 v0, 0x400

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/e;->d:I

    .line 54
    const/16 v0, 0x401

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/e;->e:I

    .line 56
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/e;->a:I

    .line 68
    iput v2, p0, Lcom/roidapp/imagelib/freecrop/e;->k:I

    .line 69
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/e;->l:I

    .line 74
    iput-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    .line 75
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/e;->q:Z

    .line 80
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/e;->w:I

    .line 83
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/e;->z:Z

    .line 90
    new-instance v0, Lcom/roidapp/imagelib/freecrop/f;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/freecrop/f;-><init>(Lcom/roidapp/imagelib/freecrop/e;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->A:Landroid/os/Handler;

    .line 490
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/e;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/e;->x:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/e;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->j:Lcom/roidapp/imagelib/filter/av;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/e;Lcom/roidapp/imagelib/freecrop/d;)Lcom/roidapp/imagelib/freecrop/d;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/e;->o:Lcom/roidapp/imagelib/freecrop/d;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 45
    .line 2400
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->A:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/freecrop/h;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/freecrop/h;-><init>(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    return-void
.end method

.method static synthetic b(Lcom/roidapp/imagelib/freecrop/e;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/e;->y:I

    return p1
.end method

.method private b(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 295
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->v:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 299
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    if-nez v0, :cond_1

    .line 300
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/e;->c()V

    .line 301
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/e;->q:Z

    .line 302
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Lcom/roidapp/imagelib/freecrop/l;)V

    .line 303
    sget v0, Lcom/roidapp/imagelib/freecrop/i;->a:I

    if-ne v0, p1, :cond_3

    .line 304
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(I)V

    .line 308
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    .line 309
    return-void

    .line 305
    :cond_3
    sget v0, Lcom/roidapp/imagelib/freecrop/i;->b:I

    if-ne v0, p1, :cond_2

    .line 306
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/freecrop/e;)Z
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    return v0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 393
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/e;->x:I

    .line 394
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/e;->y:I

    .line 395
    new-instance v2, Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/roidapp/imagelib/freecrop/n;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V

    iput-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    .line 396
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/n;->a(Lcom/roidapp/imagelib/freecrop/FreeCropView;)V

    .line 397
    return-void
.end method

.method static synthetic c(Lcom/roidapp/imagelib/freecrop/e;)V
    .locals 2

    .prologue
    .line 45
    .line 2370
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 2371
    new-instance v1, Lcom/roidapp/imagelib/freecrop/g;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/freecrop/g;-><init>(Lcom/roidapp/imagelib/freecrop/e;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 45
    return-void
.end method

.method static synthetic d(Lcom/roidapp/imagelib/freecrop/e;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->q:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/freecrop/e;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/e;->x:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/imagelib/freecrop/e;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/e;->y:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/d;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->o:Lcom/roidapp/imagelib/freecrop/d;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/Magnifier;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->g:Lcom/roidapp/imagelib/freecrop/Magnifier;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->i:[Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->A:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/n;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    .line 557
    .line 2327
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/setClipImage"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2328
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v0, :cond_0

    .line 2329
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/n;->a(Landroid/graphics/Path;)V

    .line 2330
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    .line 2331
    :goto_0
    return-void

    .line 2333
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Landroid/content/res/Resources;I)Lcom/roidapp/imagelib/f/b;

    move-result-object v0

    .line 2335
    invoke-virtual {v0}, Lcom/roidapp/imagelib/f/b;->a()Landroid/graphics/Picture;

    move-result-object v1

    .line 2337
    invoke-virtual {v0}, Lcom/roidapp/imagelib/f/b;->b()Landroid/graphics/Path;

    move-result-object v0

    .line 2339
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    if-nez v2, :cond_1

    .line 2340
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/e;->c()V

    .line 2341
    :cond_1
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v2, :cond_3

    if-eqz v0, :cond_3

    .line 2344
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 2345
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 2349
    invoke-virtual {v1}, Landroid/graphics/Picture;->getWidth()I

    move-result v4

    .line 2350
    invoke-virtual {v1}, Landroid/graphics/Picture;->getHeight()I

    move-result v1

    .line 2351
    int-to-float v5, v2

    int-to-float v6, v4

    div-float/2addr v5, v6

    int-to-float v6, v3

    int-to-float v7, v1

    div-float/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    div-float/2addr v5, v8

    .line 2352
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    int-to-float v2, v2

    div-float/2addr v2, v8

    int-to-float v7, v4

    mul-float/2addr v7, v5

    div-float/2addr v7, v8

    sub-float/2addr v2, v7

    int-to-float v3, v3

    div-float/2addr v3, v8

    int-to-float v7, v1

    mul-float/2addr v7, v5

    div-float/2addr v7, v8

    sub-float/2addr v3, v7

    invoke-virtual {v6, v2, v3, v5}, Lcom/roidapp/imagelib/freecrop/n;->b(FFF)V

    .line 2353
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/e;->w:I

    if-ne p1, v2, :cond_2

    .line 2354
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/n;->a()V

    .line 2356
    :cond_2
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/n;->j()Landroid/graphics/Matrix;

    move-result-object v2

    .line 2357
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 2358
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v2, v4, v1}, Lcom/roidapp/imagelib/freecrop/n;->a(II)V

    .line 2361
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/freecrop/n;->a(Landroid/graphics/Path;)V

    .line 2362
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->n:Lcom/roidapp/imagelib/freecrop/n;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Lcom/roidapp/imagelib/freecrop/l;)V

    .line 2363
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->q:Z

    .line 2365
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    .line 2366
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/e;->w:I

    goto :goto_0
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 259
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/saveImage"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 260
    iput-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    .line 261
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a()V

    .line 262
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->setVisibility(I)V

    .line 263
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/saveBtn"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->A:Landroid/os/Handler;

    const/16 v1, 0x400

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 265
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->A:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 266
    return v2
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 562
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    return v0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 153
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 154
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 158
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 159
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/av;

    if-eqz v0, :cond_0

    .line 160
    check-cast p1, Lcom/roidapp/imagelib/filter/av;

    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/e;->j:Lcom/roidapp/imagelib/filter/av;

    return-void

    .line 162
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImageEditCropFragment.OnImageEditCropListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 182
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    if-eqz v0, :cond_1

    .line 217
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 185
    sget v1, Lcom/roidapp/imagelib/g;->N:I

    if-eq v0, v1, :cond_3

    .line 186
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 187
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 188
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/e;->z:Z

    if-eqz v1, :cond_3

    .line 189
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget v2, Lcom/roidapp/imagelib/j;->j:I

    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/freecrop/e;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 191
    iput-boolean v3, p0, Lcom/roidapp/imagelib/freecrop/e;->z:Z

    .line 194
    :cond_3
    sget v1, Lcom/roidapp/imagelib/g;->N:I

    if-ne v0, v1, :cond_5

    .line 195
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iget-boolean v0, v0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->b:Z

    if-eqz v0, :cond_4

    .line 196
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 197
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->o:Lcom/roidapp/imagelib/freecrop/d;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Lcom/roidapp/imagelib/freecrop/l;)V

    .line 198
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    .line 199
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b()V

    .line 200
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a()V

    .line 201
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/e;->q:Z

    .line 202
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 203
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 204
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 206
    :cond_5
    sget v1, Lcom/roidapp/imagelib/g;->Q:I

    if-ne v0, v1, :cond_6

    .line 207
    sget v0, Lcom/roidapp/imagelib/freecrop/i;->a:I

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/freecrop/e;->b(I)V

    .line 208
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 209
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 211
    :cond_6
    sget v1, Lcom/roidapp/imagelib/g;->O:I

    if-ne v0, v1, :cond_0

    .line 212
    sget v0, Lcom/roidapp/imagelib/freecrop/i;->b:I

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/freecrop/e;->b(I)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 214
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 215
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 126
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 127
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/onCreate"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 130
    if-eqz v0, :cond_0

    .line 131
    const-string v1, "edit_image_path"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->b:Ljava/lang/String;

    .line 134
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    const/high16 v8, 0x42000000    # 32.0f

    const/16 v7, 0x280

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 140
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/onCreateView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 142
    sget v0, Lcom/roidapp/imagelib/h;->j:I

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->c:Landroid/view/View;

    .line 144
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->c:Landroid/view/View;

    .line 1270
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "FreeCropFrag/initView"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1272
    sget v0, Lcom/roidapp/imagelib/g;->aB:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    .line 1273
    sget v0, Lcom/roidapp/imagelib/g;->aG:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    .line 1275
    sget v0, Lcom/roidapp/imagelib/g;->aH:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/freecrop/Magnifier;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->g:Lcom/roidapp/imagelib/freecrop/Magnifier;

    .line 1276
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->g:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/e;->g:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a()I

    move-result v3

    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1277
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1279
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->f:Lcom/roidapp/imagelib/freecrop/FreeCropView;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->g:Lcom/roidapp/imagelib/freecrop/Magnifier;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/e;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Lcom/roidapp/imagelib/freecrop/Magnifier;Landroid/widget/RelativeLayout;)V

    .line 1281
    sget v0, Lcom/roidapp/imagelib/g;->az:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->v:Landroid/widget/FrameLayout;

    .line 1283
    new-instance v0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    .line 1284
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->setHorizontalScrollBarEnabled(Z)V

    .line 1285
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->u:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(Landroid/support/v4/app/Fragment;)V

    .line 1287
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->b:Ljava/lang/String;

    .line 2222
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2226
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    .line 2227
    const/high16 v3, 0x42c00000    # 96.0f

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_1

    .line 2228
    const/16 v2, 0x67c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2229
    const/16 v2, 0x3c0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2230
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2245
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/Integer;

    .line 2246
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2247
    invoke-static {v0, v2}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;[Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    .line 2250
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Load min length is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1287
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->i:[Ljava/lang/Integer;

    .line 1288
    iput-boolean v5, p0, Lcom/roidapp/imagelib/freecrop/e;->p:Z

    .line 1289
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/freecrop/j;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/e;->b:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v4}, Lcom/roidapp/imagelib/freecrop/j;-><init>(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 146
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/e;->c:Landroid/view/View;

    .line 2312
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "FreeCropFrag/initControls"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2314
    sget v0, Lcom/roidapp/imagelib/g;->N:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    .line 2315
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2316
    sget v0, Lcom/roidapp/imagelib/g;->Q:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    .line 2317
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2318
    sget v0, Lcom/roidapp/imagelib/g;->O:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    .line 2319
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2321
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->r:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 2322
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->s:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 2323
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->t:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 148
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->c:Landroid/view/View;

    return-object v0

    .line 2231
    :cond_1
    const/high16 v3, 0x42c00000    # 96.0f

    cmpg-float v3, v2, v3

    if-gez v3, :cond_2

    const/high16 v3, 0x42800000    # 64.0f

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_2

    .line 2232
    const/16 v2, 0x500

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2233
    const/16 v2, 0x3c0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2234
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 2235
    :cond_2
    const/high16 v3, 0x42800000    # 64.0f

    cmpg-float v3, v2, v3

    if-gez v3, :cond_3

    cmpl-float v3, v2, v8

    if-ltz v3, :cond_3

    .line 2236
    const/16 v2, 0x400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2237
    const/16 v2, 0x2d0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2238
    const/16 v2, 0x1e0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 2239
    :cond_3
    cmpg-float v2, v2, v8

    if-gez v2, :cond_0

    .line 2240
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2241
    const/16 v2, 0x1e0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2242
    const/16 v2, 0x140

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->m:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 176
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 177
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 169
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 170
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/e;->j:Lcom/roidapp/imagelib/filter/av;

    .line 171
    return-void
.end method
