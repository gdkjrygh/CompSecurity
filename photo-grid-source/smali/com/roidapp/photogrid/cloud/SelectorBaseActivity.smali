.class public abstract Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ae;
.implements Lcom/roidapp/cloudlib/af;
.implements Lcom/roidapp/cloudlib/ai;


# static fields
.field private static y:I


# instance fields
.field private A:Z

.field private B:Z

.field private C:Ljava/lang/String;

.field private D:Z

.field private final a:Ljava/lang/String;

.field protected b:Lcom/roidapp/cloudlib/t;

.field protected c:Landroid/widget/ProgressBar;

.field protected d:Landroid/widget/ImageButton;

.field protected e:Landroid/widget/LinearLayout;

.field protected f:Landroid/widget/TextView;

.field protected g:Landroid/widget/TextView;

.field protected h:Landroid/widget/HorizontalScrollView;

.field protected i:Landroid/widget/TextView;

.field protected j:Landroid/widget/TextView;

.field protected k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field protected l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ig;",
            ">;"
        }
    .end annotation
.end field

.field protected m:I

.field protected n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected o:I

.field protected p:Lcom/roidapp/photogrid/common/al;

.field protected q:Landroid/widget/LinearLayout;

.field protected r:Landroid/view/View$OnTouchListener;

.field protected s:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x7

    sput v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 69
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 70
    const-string v0, "PhotoGrid_SelectorBaseActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->a:Ljava/lang/String;

    .line 74
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->n:Ljava/util/List;

    .line 90
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->p:Lcom/roidapp/photogrid/common/al;

    .line 93
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    .line 95
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    .line 99
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->D:Z

    .line 167
    new-instance v0, Lcom/roidapp/photogrid/cloud/bi;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/bi;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->r:Landroid/view/View$OnTouchListener;

    .line 356
    new-instance v0, Lcom/roidapp/photogrid/cloud/bn;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/bn;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->s:Landroid/os/Handler;

    return-void
.end method

.method private a(Lcom/roidapp/photogrid/release/ig;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 437
    .line 439
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 446
    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 447
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f030121

    invoke-virtual {v0, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 449
    const v0, 0x7f0d04bb

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 450
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->m:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 451
    iget v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->m:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->m:I

    .line 452
    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 454
    new-instance v4, Lcom/roidapp/photogrid/cloud/bo;

    invoke-direct {v4, p0, p1}, Lcom/roidapp/photogrid/cloud/bo;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;Lcom/roidapp/photogrid/release/ig;)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 472
    const v0, 0x7f0d04ba

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 473
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 474
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 475
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 477
    new-instance v1, Lcom/roidapp/photogrid/cloud/bp;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/cloud/bp;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;Lcom/roidapp/photogrid/release/ig;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 502
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v0, v5, :cond_2

    .line 504
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 505
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 506
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 507
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 508
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 509
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 510
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 511
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 512
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    .line 441
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v2

    .line 445
    goto/16 :goto_0

    .line 443
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v2

    goto/16 :goto_0

    .line 518
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 519
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g()V

    .line 521
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 522
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i()V

    .line 538
    :goto_2
    return-void

    .line 524
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g()V

    .line 525
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1585
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->h:Landroid/widget/HorizontalScrollView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/bq;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 530
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    .line 531
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 533
    const v0, 0x7f070170

    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)Z
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V
    .locals 1

    .prologue
    .line 69
    .line 1762
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    if-eqz v0, :cond_0

    .line 1763
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->g()V

    .line 69
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    return v0
.end method

.method static synthetic k()I
    .locals 1

    .prologue
    .line 69
    sget v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->y:I

    return v0
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 299
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1100

    if-ne v0, v1, :cond_1

    .line 300
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    .line 316
    :cond_0
    :goto_0
    return-void

    .line 301
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1101

    if-ne v0, v1, :cond_2

    .line 302
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 303
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1102

    if-ne v0, v1, :cond_3

    .line 304
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 305
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2109

    if-eq v0, v1, :cond_0

    .line 306
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2108

    if-eq v0, v1, :cond_0

    .line 307
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2120

    if-ne v0, v1, :cond_4

    .line 308
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 310
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2121

    if-ne v0, v1, :cond_0

    .line 311
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->f()I

    move-result v0

    if-nez v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 353
    .line 1409
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1413
    const/4 v0, 0x0

    .line 1414
    iget v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v2, v1, :cond_2

    .line 1415
    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    if-eqz v2, :cond_0

    move v0, v1

    .line 1423
    :cond_0
    :goto_0
    if-eqz v0, :cond_3

    .line 1424
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1425
    sget v1, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->y:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1426
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->s:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1427
    :cond_1
    :goto_1
    return-void

    .line 1419
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-lt v2, v3, :cond_0

    move v0, v1

    .line 1420
    goto :goto_0

    .line 1429
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 1430
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1431
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->n:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1432
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    .line 1433
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->a(Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_1
.end method

.method protected final a([Lcom/roidapp/photogrid/release/ig;)V
    .locals 4

    .prologue
    .line 387
    array-length v0, p1

    .line 388
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    .line 389
    iget v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    .line 391
    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 392
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    aget-object v3, p1, v1

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 393
    aget-object v2, p1, v1

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 391
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 395
    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 322
    .line 323
    iget v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v2, v1, :cond_0

    .line 324
    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->B:Z

    if-eqz v2, :cond_3

    move v2, v1

    .line 332
    :goto_0
    if-eqz v2, :cond_1

    .line 333
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 334
    sget v2, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->y:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 335
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->s:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 342
    :goto_1
    return v0

    .line 328
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-lt v2, v3, :cond_3

    move v2, v1

    .line 329
    goto :goto_0

    .line 338
    :cond_1
    iget v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-nez v2, :cond_2

    .line 339
    const-string v1, "350"

    invoke-static {v1, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_1

    :cond_2
    move v0, v1

    .line 342
    goto :goto_1

    :cond_3
    move v2, v0

    goto :goto_0
.end method

.method protected abstract b()Lcom/roidapp/cloudlib/t;
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    const-string v0, "CloudCartPage"

    return-object v0
.end method

.method protected final d()V
    .locals 2

    .prologue
    .line 155
    const v0, 0x7f0d008b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->c:Landroid/widget/ProgressBar;

    .line 156
    const v0, 0x7f0d008c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 158
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b()Lcom/roidapp/cloudlib/t;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    .line 161
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->e()Lcom/roidapp/cloudlib/ah;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/ah;->a(Lcom/roidapp/cloudlib/ai;)V

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/t;->a(Lcom/roidapp/cloudlib/af;)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/t;->a(Lcom/roidapp/cloudlib/ae;)V

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->r:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 166
    :cond_0
    return-void
.end method

.method protected final e()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 178
    const v0, 0x7f0d00b3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    .line 179
    const v0, 0x7f0d00af

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    .line 180
    const v0, 0x7f0d00b0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g:Landroid/widget/TextView;

    .line 181
    const v0, 0x7f0d00b2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->h:Landroid/widget/HorizontalScrollView;

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    .line 183
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    .line 184
    const v0, 0x7f0d00b1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    .line 185
    const v0, 0x7f0d00b4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    .line 186
    const v0, 0x7f0d00ab

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->q:Landroid/widget/LinearLayout;

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->q:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->r:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 188
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->h:Landroid/widget/HorizontalScrollView;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->r:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 189
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v0, v3, :cond_0

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701f1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bj;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/bj;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bk;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/bk;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->d:Landroid/widget/ImageButton;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bl;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/bl;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    const v0, 0x7f0d00ad

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    const v1, 0x7f0d00ae

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 232
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 233
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setClickable(Z)V

    .line 234
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bm;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/bm;-><init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g()V

    .line 262
    return-void

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701f0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 196
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v0, v3, :cond_2

    .line 197
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701f3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 199
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701f2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method protected final f()V
    .locals 3

    .prologue
    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 400
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 401
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 403
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 405
    :cond_1
    return-void
.end method

.method protected final g()V
    .locals 8

    .prologue
    const v7, 0x7f0c0043

    const v6, 0x7f0200bc

    const/16 v1, 0x8

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 541
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 542
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 543
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 544
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    const v1, -0xa9a9aa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 549
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "( "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701b8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 574
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    if-nez v0, :cond_0

    .line 575
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 576
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    .line 582
    :cond_0
    :goto_2
    return-void

    .line 546
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 547
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0062

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 553
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    .line 554
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    .line 555
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "( "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070268

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ge v0, v1, :cond_3

    .line 558
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 559
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    goto :goto_2

    .line 562
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    if-nez v0, :cond_0

    .line 563
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 564
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    goto/16 :goto_2

    .line 569
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f07022d

    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f07022c

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 578
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 580
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->A:Z

    goto/16 :goto_2
.end method

.method protected final i()V
    .locals 8

    .prologue
    const/4 v1, 0x5

    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 728
    :cond_0
    :goto_0
    return-void

    .line 596
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    new-array v3, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    .line 597
    if-eqz v0, :cond_0

    .line 601
    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->D:Z

    if-nez v3, :cond_0

    .line 604
    iput-boolean v7, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->D:Z

    .line 606
    sget-boolean v3, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 607
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 609
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    .line 645
    if-nez v3, :cond_9

    .line 646
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v5, :cond_2

    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v5, v1, :cond_4

    .line 647
    :cond_2
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v7, :cond_3

    move v1, v2

    :cond_3
    sput v1, Lcom/roidapp/photogrid/common/az;->q:I

    .line 649
    :cond_4
    invoke-virtual {v4, v7}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 656
    :goto_1
    const-string v1, "FaceClip"

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 657
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v6, 0x4

    if-eq v5, v6, :cond_5

    .line 658
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    const-string v6, "needFaceClip"

    invoke-interface {v5, v6, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 660
    :cond_5
    const-string v5, "needFaceClip"

    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 661
    if-eqz v3, :cond_e

    .line 666
    :goto_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 668
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v5, :pswitch_data_0

    .line 693
    :cond_6
    :goto_3
    :pswitch_0
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v6, 0x6

    if-ne v5, v6, :cond_a

    .line 694
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "first_in"

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 695
    invoke-virtual {v4, v7}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 696
    const-class v2, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 714
    :goto_4
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 715
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 716
    iget v3, v2, Landroid/graphics/Rect;->top:I

    if-lez v3, :cond_7

    .line 717
    iget v2, v2, Landroid/graphics/Rect;->top:I

    sput v2, Lcom/roidapp/photogrid/common/az;->g:I

    .line 719
    :cond_7
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->u:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_8

    .line 720
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 722
    :cond_8
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 723
    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 726
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 727
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->finish()V

    goto/16 :goto_0

    .line 651
    :cond_9
    invoke-virtual {v4, v2}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    goto :goto_1

    .line 672
    :pswitch_1
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->Y()Ljava/lang/String;

    move-result-object v5

    .line 673
    if-eqz v5, :cond_6

    .line 674
    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    goto :goto_3

    .line 678
    :pswitch_2
    if-nez v3, :cond_6

    .line 679
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->Y()Ljava/lang/String;

    move-result-object v5

    .line 680
    if-eqz v5, :cond_6

    .line 681
    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    goto :goto_3

    .line 698
    :cond_a
    if-eqz v2, :cond_b

    .line 699
    const-class v2, Lcom/roidapp/photogrid/release/FaceDetectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 700
    const-string v2, "entryFrom"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 701
    const-string v2, "entryType"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_4

    .line 702
    :cond_b
    if-eqz v3, :cond_c

    .line 703
    const-class v2, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_4

    .line 705
    :cond_c
    if-eqz v2, :cond_d

    .line 706
    const-string v2, "entryFrom"

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 707
    const-string v2, "entryType"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 710
    :cond_d
    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_4

    :cond_e
    move v2, v1

    goto/16 :goto_2

    .line 668
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final j()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 732
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-eqz v0, :cond_1

    .line 733
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 739
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 740
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 741
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 742
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    .line 750
    :cond_0
    :goto_0
    const-string v0, "MainPage_View"

    const-string v1, "Cloud_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 752
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->A(Landroid/content/Context;)V

    .line 753
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 754
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 755
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->finish()V

    .line 756
    return-void

    .line 745
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 746
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 103
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 104
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    .line 105
    iget v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-nez v0, :cond_0

    .line 106
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    .line 108
    :cond_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 140
    :goto_0
    :pswitch_0
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-eqz v0, :cond_1

    .line 141
    const-string v0, "FreeCrop"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    .line 143
    :cond_1
    return-void

    .line 110
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 113
    :pswitch_2
    const-string v0, "GridActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 116
    :pswitch_3
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 119
    :pswitch_4
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 122
    :pswitch_5
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 125
    :pswitch_6
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 128
    :pswitch_7
    const-string v0, "VideoActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 131
    :pswitch_8
    const-string v0, "WideActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 134
    :pswitch_9
    const-string v0, "HighActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 137
    :pswitch_a
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->C:Ljava/lang/String;

    goto :goto_0

    .line 108
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_6
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_7
        :pswitch_0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->p:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->p:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->c()V

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 289
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f()V

    .line 290
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 291
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 267
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 268
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 269
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 272
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 273
    const-string v0, "ImageSelector/Cloud"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 274
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 278
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 279
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 146
    const-string v0, "image_selector_cloud"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->t:Ljava/lang/String;

    .line 147
    return-void
.end method
