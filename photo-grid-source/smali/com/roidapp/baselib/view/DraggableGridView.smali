.class public Lcom/roidapp/baselib/view/DraggableGridView;
.super Landroid/widget/GridView;
.source "SourceFile"


# instance fields
.field private A:Landroid/view/WindowManager$LayoutParams;

.field private B:Lcom/roidapp/baselib/view/d;

.field private C:Landroid/os/Vibrator;

.field private D:Landroid/widget/Scroller;

.field private E:Ljava/lang/Runnable;

.field private F:Ljava/lang/Runnable;

.field private G:Landroid/graphics/Matrix;

.field private H:Ljava/lang/Runnable;

.field a:[I

.field b:[I

.field c:F

.field private d:Z

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Landroid/graphics/Rect;

.field private v:Landroid/os/Handler;

.field private w:Landroid/graphics/Bitmap;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/view/View;

.field private z:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 226
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/view/DraggableGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 227
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 230
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/view/DraggableGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 231
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 234
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 71
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    .line 94
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    .line 96
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    .line 114
    new-instance v0, Lcom/roidapp/baselib/view/a;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/a;-><init>(Lcom/roidapp/baselib/view/DraggableGridView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->E:Ljava/lang/Runnable;

    .line 134
    new-instance v0, Lcom/roidapp/baselib/view/b;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/b;-><init>(Lcom/roidapp/baselib/view/DraggableGridView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    .line 175
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->G:Landroid/graphics/Matrix;

    .line 176
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    .line 177
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->b:[I

    .line 178
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    .line 179
    new-instance v0, Lcom/roidapp/baselib/view/c;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/c;-><init>(Lcom/roidapp/baselib/view/DraggableGridView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->H:Ljava/lang/Runnable;

    .line 235
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->C:Landroid/os/Vibrator;

    .line 236
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->z:Landroid/view/WindowManager;

    .line 237
    invoke-static {p1}, Lcom/roidapp/baselib/view/DraggableGridView;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->l:I

    .line 238
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->D:Landroid/widget/Scroller;

    .line 239
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->e:I

    .line 240
    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 4

    .prologue
    .line 249
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    move-object v0, p0

    .line 250
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 251
    iget v0, v1, Landroid/graphics/Rect;->top:I

    .line 252
    if-gtz v0, :cond_0

    .line 255
    :try_start_0
    const-string v1, "com.android.internal.R$dimen"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    .line 257
    const-string v3, "status_bar_height"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 258
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 263
    :cond_0
    :goto_0
    return v0

    .line 260
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private a(II)V
    .locals 10

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v9, -0x1

    .line 337
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/baselib/view/DraggableGridView;->pointToPosition(II)I

    move-result v3

    .line 338
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getFirstVisiblePosition()I

    move-result v5

    .line 339
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getLastVisiblePosition()I

    move-result v4

    .line 340
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getHeight()I

    move-result v6

    .line 341
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v7, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->top:I

    sub-int v7, v0, v7

    .line 342
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    div-int/lit8 v8, v7, 0x2

    add-int/2addr v0, v8

    .line 345
    if-le v0, v6, :cond_0

    .line 346
    div-int/lit8 v0, v7, 0x2

    sub-int v0, v6, v0

    .line 350
    :cond_0
    iget v6, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    if-eq v3, v6, :cond_5

    if-eq v3, v9, :cond_5

    .line 351
    sub-int v0, v3, v5

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 352
    if-eqz v0, :cond_4

    .line 353
    iget-object v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    invoke-virtual {v0, v4}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 354
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 355
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 361
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    :goto_0
    move v2, v0

    move v0, v3

    .line 378
    :goto_1
    if-eqz v2, :cond_3

    .line 380
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    if-eqz v1, :cond_1

    .line 381
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    invoke-interface {v1, v2, v0}, Lcom/roidapp/baselib/view/d;->a(II)V

    .line 384
    :cond_1
    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    .line 385
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    if-ltz v0, :cond_2

    .line 386
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    .line 389
    :cond_2
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    sub-int/2addr v0, v5

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 390
    if-eqz v0, :cond_3

    .line 391
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 394
    :cond_3
    return-void

    :cond_4
    move v0, v3

    .line 368
    goto :goto_1

    .line 370
    :cond_5
    if-ne v3, v9, :cond_6

    iget v6, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    if-eq v6, v4, :cond_6

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ne v4, v6, :cond_6

    if-lez v0, :cond_6

    iget v6, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    if-le v6, v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-nez v0, :cond_6

    move v2, v1

    move v0, v4

    .line 375
    goto :goto_1

    :cond_6
    move v0, v3

    goto :goto_1

    :cond_7
    move v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/DraggableGridView;II)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/view/DraggableGridView;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/DraggableGridView;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    return v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v5, -0x2

    const/4 v2, 0x1

    .line 267
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 268
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/roidapp/baselib/view/d;->a(Landroid/view/View;)V

    .line 272
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->f:I

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->p:I

    .line 273
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->o:I

    .line 275
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->j:I

    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->f:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->r:I

    .line 276
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->k:I

    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->q:I

    .line 278
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->t:I

    .line 279
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->q:I

    iput v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->s:I

    .line 281
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 283
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 284
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 285
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 286
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 287
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 291
    :cond_2
    if-eqz v0, :cond_4

    .line 292
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->w:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 301
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->w:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 303
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->w:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->f:I

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    .line 1316
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v3}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    .line 1317
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->p:I

    sub-int/2addr v1, v4

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->r:I

    add-int/2addr v1, v4

    add-int/lit8 v1, v1, 0xa

    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 1318
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iget v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->o:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->q:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->l:I

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0xa

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 1319
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    const/16 v2, 0x33

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 1320
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    const/4 v2, -0x3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 1321
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 1322
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iput v5, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1323
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iput v5, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 1324
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    const/16 v2, 0x18

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 1326
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    .line 1327
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1330
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->z:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1333
    :cond_3
    :goto_1
    return-void

    .line 295
    :cond_4
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->w:Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 298
    :catch_0
    move-exception v0

    iput-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->w:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 1332
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/baselib/view/DraggableGridView;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Vibrator;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->C:Landroid/os/Vibrator;

    return-object v0
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 409
    .line 410
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    if-ltz v0, :cond_3

    .line 411
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getFirstVisiblePosition()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 412
    const/high16 v2, -0x80000000

    iput v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    .line 417
    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_0

    .line 418
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 421
    :cond_0
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    if-eqz v2, :cond_2

    .line 422
    new-array v2, v3, [I

    .line 423
    new-array v3, v3, [I

    .line 424
    iget-object v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    if-eqz v4, :cond_1

    .line 425
    iget-object v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->getLocationOnScreen([I)V

    .line 426
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/view/DraggableGridView;->getLocationOnScreen([I)V

    .line 427
    aget v4, v2, v6

    aget v5, v3, v6

    sub-int/2addr v4, v5

    aput v4, v2, v6

    .line 428
    aget v4, v2, v7

    aget v3, v3, v7

    sub-int v3, v4, v3

    aput v3, v2, v7

    .line 430
    :cond_1
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    invoke-interface {v3, v0, v4, v2}, Lcom/roidapp/baselib/view/d;->a(Landroid/view/View;I[I)[I

    move-result-object v0

    .line 431
    if-eqz v0, :cond_4

    .line 432
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v2, v0, v6

    aput v2, v1, v6

    .line 433
    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v0, v0, v7

    aput v0, v1, v7

    .line 434
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->H:Ljava/lang/Runnable;

    const-wide/16 v2, 0x19

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 449
    :cond_2
    :goto_1
    return-void

    .line 414
    :cond_3
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    if-ltz v0, :cond_5

    .line 415
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getFirstVisiblePosition()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 436
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 439
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->z:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 443
    :goto_2
    iput-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    goto :goto_1

    .line 441
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/baselib/view/DraggableGridView;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->b()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->t:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->e:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->s:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->D:Landroid/widget/Scroller;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->u:Landroid/graphics/Rect;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/baselib/view/DraggableGridView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    return v0
.end method

.method static synthetic p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->G:Landroid/graphics/Matrix;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->z:Landroid/view/WindowManager;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->H:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic u(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic v(Lcom/roidapp/baselib/view/DraggableGridView;)Lcom/roidapp/baselib/view/d;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 534
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->E:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 535
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 537
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    if-eqz v0, :cond_0

    .line 538
    invoke-direct {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->c()V

    .line 539
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    .line 541
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 548
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    .line 549
    iput p1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    .line 550
    return-void
.end method

.method public final a(Lcom/roidapp/baselib/view/d;)V
    .locals 0

    .prologue
    .line 527
    iput-object p1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    .line 528
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 453
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 454
    packed-switch v2, :pswitch_data_0

    .line 523
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/GridView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    :cond_1
    :goto_1
    return v1

    .line 457
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->f:I

    .line 458
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    .line 459
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->j:I

    .line 460
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->k:I

    .line 462
    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->f:I

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->g:I

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/baselib/view/DraggableGridView;->pointToPosition(II)I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    .line 463
    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    if-ltz v1, :cond_4

    iget v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->n:I

    if-eq v1, v2, :cond_4

    .line 464
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    if-eqz v1, :cond_3

    .line 465
    invoke-direct {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->c()V

    .line 466
    iput-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    .line 468
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/GridView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    goto :goto_1

    .line 471
    :cond_4
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->m:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    .line 472
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    if-eqz v0, :cond_5

    .line 473
    invoke-direct {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->b()V

    goto :goto_0

    .line 476
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/baselib/view/DraggableGridView;->E:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 481
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    .line 482
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    .line 484
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    if-nez v2, :cond_6

    move v0, v1

    .line 486
    :cond_6
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    if-eqz v2, :cond_8

    .line 487
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 488
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    .line 490
    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    if-lt v4, v2, :cond_7

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    iget-object v5, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v2, v5

    if-le v4, v2, :cond_a

    :cond_7
    move v0, v1

    .line 498
    :cond_8
    :goto_2
    if-eqz v0, :cond_9

    .line 499
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->E:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 502
    :cond_9
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 503
    iget v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    .line 1397
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->p:I

    sub-int v4, v0, v4

    iget v5, p0, Lcom/roidapp/baselib/view/DraggableGridView;->r:I

    add-int/2addr v4, v5

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 1398
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    iget v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->o:I

    sub-int v4, v2, v4

    iget v5, p0, Lcom/roidapp/baselib/view/DraggableGridView;->q:I

    add-int/2addr v4, v5

    iget v5, p0, Lcom/roidapp/baselib/view/DraggableGridView;->l:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 1400
    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->z:Landroid/view/WindowManager;

    iget-object v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/roidapp/baselib/view/DraggableGridView;->A:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v3, v4, v5}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1402
    invoke-direct {p0, v0, v2}, Lcom/roidapp/baselib/view/DraggableGridView;->a(II)V

    .line 1404
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 504
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->B:Lcom/roidapp/baselib/view/d;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->x:Landroid/widget/ImageView;

    iget v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->h:I

    invoke-interface {v0, v2, v3}, Lcom/roidapp/baselib/view/d;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 505
    iget-object v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 493
    :cond_a
    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    if-lt v2, v3, :cond_b

    iget v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->i:I

    iget-object v4, p0, Lcom/roidapp/baselib/view/DraggableGridView;->y:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    if-le v2, v3, :cond_8

    :cond_b
    move v0, v1

    .line 494
    goto :goto_2

    .line 513
    :pswitch_2
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->E:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 514
    iget-object v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->v:Landroid/os/Handler;

    iget-object v3, p0, Lcom/roidapp/baselib/view/DraggableGridView;->F:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 516
    iget-boolean v2, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    if-eqz v2, :cond_0

    .line 517
    invoke-direct {p0}, Lcom/roidapp/baselib/view/DraggableGridView;->c()V

    .line 518
    iput-boolean v0, p0, Lcom/roidapp/baselib/view/DraggableGridView;->d:Z

    goto/16 :goto_1

    .line 454
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
