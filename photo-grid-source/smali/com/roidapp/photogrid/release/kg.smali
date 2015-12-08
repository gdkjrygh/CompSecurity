.class public Lcom/roidapp/photogrid/release/kg;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/ImageSelector;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/ProgressBar;

.field private i:Lcom/roidapp/photogrid/release/ig;

.field private j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/release/ig;",
            ">;"
        }
    .end annotation
.end field

.field private k:Landroid/graphics/Bitmap;

.field private l:Landroid/view/GestureDetector;

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:I

.field private s:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->j:Ljava/util/HashMap;

    .line 320
    new-instance v0, Lcom/roidapp/photogrid/release/kk;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/kk;-><init>(Lcom/roidapp/photogrid/release/kg;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->s:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;I)I
    .locals 0

    .prologue
    .line 53
    iput p1, p0, Lcom/roidapp/photogrid/release/kg;->o:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;)Lcom/roidapp/photogrid/release/ig;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kg;->q:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/roidapp/photogrid/release/ig;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 519
    if-nez p1, :cond_0

    .line 586
    :goto_0
    return-void

    .line 522
    :cond_0
    const-string v0, "start load bitmap"

    const-string v1, "start..................."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 524
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 526
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 527
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 529
    :cond_2
    iput-object v2, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    .line 530
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->h:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_3

    .line 531
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->h:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 533
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/kl;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/kl;-><init>(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;II)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;II)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/ig;II)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/kg;->p:Z

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kg;Z)Z
    .locals 0

    .prologue
    .line 53
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/kg;->p:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/kg;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->o:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/kg;I)I
    .locals 0

    .prologue
    .line 53
    iput p1, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/kg;I)I
    .locals 0

    .prologue
    .line 53
    iput p1, p0, Lcom/roidapp/photogrid/release/kg;->m:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b()Ljava/util/List;

    move-result-object v0

    .line 167
    if-eqz v0, :cond_0

    .line 168
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ig;

    .line 169
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->j:Ljava/util/HashMap;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 173
    :cond_0
    return-void
.end method

.method private d()I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 397
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v1, :cond_0

    .line 398
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 400
    :cond_0
    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/kg;I)I
    .locals 0

    .prologue
    .line 53
    iput p1, p0, Lcom/roidapp/photogrid/release/kg;->n:I

    return p1
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/kg;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->m:I

    return v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    iget v1, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 415
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    if-lez v0, :cond_2

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 417
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 425
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    :cond_0
    :goto_1
    return-void

    .line 411
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a()V

    goto :goto_1

    .line 420
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 421
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/kg;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->n:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/kg;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/kg;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->s:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/16 v1, 0x8

    .line 463
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    .line 464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 468
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 435
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 456
    :cond_1
    :goto_0
    return-void

    .line 443
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_1

    .line 444
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    iget v1, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    iget v0, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    if-lez v0, :cond_3

    .line 446
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 447
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 450
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 83
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 84
    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    .line 85
    iput p2, p0, Lcom/roidapp/photogrid/release/kg;->o:I

    .line 86
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kg;->q:Ljava/lang/String;

    .line 87
    iput p3, p0, Lcom/roidapp/photogrid/release/kg;->r:I

    .line 88
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 676
    const-string v0, "FragmentImagePreview/onDestroyByUser"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 677
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 678
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 680
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 683
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/release/kg;->k:Landroid/graphics/Bitmap;

    .line 684
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 78
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/ImageSelector;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    .line 79
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 80
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 688
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 723
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 690
    :sswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/kg;->p:Z

    if-eqz v0, :cond_0

    .line 693
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->e()V

    goto :goto_0

    .line 699
    :sswitch_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/kg;->p:Z

    if-eqz v0, :cond_0

    .line 703
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->e()V

    goto :goto_0

    .line 717
    :sswitch_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->b()V

    .line 718
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Z)Z

    goto :goto_0

    .line 688
    :sswitch_data_0
    .sparse-switch
        0x7f0d002a -> :sswitch_3
        0x7f0d02c9 -> :sswitch_0
        0x7f0d02ca -> :sswitch_2
        0x7f0d02cd -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 95
    const v0, 0x7f0300b5

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 110
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/kg;->c()V

    .line 1176
    const v0, 0x7f0d02ca

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->d:Landroid/widget/TextView;

    .line 1177
    const v0, 0x7f0d002a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    .line 1178
    const v0, 0x7f0d02ce

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->b:Landroid/widget/ImageView;

    .line 1179
    const v0, 0x7f0d02cf

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->c:Landroid/widget/ImageView;

    .line 1180
    const v0, 0x7f0d02d0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->f:Landroid/widget/TextView;

    .line 1181
    const v0, 0x7f0d02cd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->g:Landroid/widget/RelativeLayout;

    .line 1182
    const v0, 0x7f0d0094

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->h:Landroid/widget/ProgressBar;

    .line 1188
    const v0, 0x7f0d02c9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_1

    .line 1225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b()Ljava/util/List;

    move-result-object v0

    .line 1226
    if-eqz v0, :cond_0

    .line 1227
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->e:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget v3, v3, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1231
    :cond_0
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    new-instance v3, Lcom/roidapp/photogrid/release/ki;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/ki;-><init>(Lcom/roidapp/photogrid/release/kg;)V

    invoke-direct {v0, v2, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kg;->l:Landroid/view/GestureDetector;

    .line 1290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1291
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->g:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/roidapp/photogrid/release/kj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/kj;-><init>(Lcom/roidapp/photogrid/release/kg;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1298
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 112
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/kg;->m:I

    .line 115
    sget v0, Lcom/roidapp/photogrid/common/az;->g:I

    if-nez v0, :cond_2

    .line 116
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 118
    iget v2, v0, Landroid/graphics/Rect;->top:I

    if-lez v2, :cond_2

    .line 119
    iget v0, v0, Landroid/graphics/Rect;->top:I

    sput v0, Lcom/roidapp/photogrid/common/az;->g:I

    .line 124
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    sget v2, Lcom/roidapp/photogrid/common/az;->g:I

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900ee

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/kg;->n:I

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_3

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    iget v2, p0, Lcom/roidapp/photogrid/release/kg;->m:I

    iget v3, p0, Lcom/roidapp/photogrid/release/kg;->n:I

    invoke-direct {p0, v0, v2, v3}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/ig;II)V

    .line 2140
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2141
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2142
    const-class v2, Lcom/roidapp/photogrid/release/kg;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 2143
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_3

    .line 2144
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2145
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x7f0b001d

    invoke-direct {v0, v2, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2147
    const v2, 0x7f0300f1

    :try_start_1
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 2155
    const v2, 0x7f0d0279

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/release/kh;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/photogrid/release/kh;-><init>(Lcom/roidapp/photogrid/release/kg;Landroid/app/Dialog;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2161
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 136
    :cond_3
    :goto_1
    return-object v1

    .line 97
    :catch_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 98
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 100
    const v0, 0x7f0300b5

    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_2
    .catch Landroid/view/InflateException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 108
    goto/16 :goto_0

    .line 102
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 103
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    .line 105
    new-instance v1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 106
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 2149
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 2152
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 668
    const-string v0, "FragmentImagePreview/onDestroy"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 669
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 670
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 589
    const-string v0, "FragmentImagePreview/onResume"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 590
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->i:Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    if-eqz v0, :cond_0

    .line 591
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kg;->b()V

    .line 592
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Z)Z

    .line 594
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 595
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 657
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->l:Landroid/view/GestureDetector;

    if-eqz v0, :cond_0

    .line 658
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kg;->l:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 661
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
