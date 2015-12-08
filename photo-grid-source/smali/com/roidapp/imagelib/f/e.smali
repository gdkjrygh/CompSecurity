.class final Lcom/roidapp/imagelib/f/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Z

.field d:F

.field e:F

.field f:F

.field g:F

.field h:F

.field i:F

.field j:F

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field m:Landroid/graphics/Matrix;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 644
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 650
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    .line 651
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    .line 652
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 644
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/f/e;)Lcom/roidapp/imagelib/f/e;
    .locals 3

    .prologue
    .line 655
    new-instance v0, Lcom/roidapp/imagelib/f/e;

    invoke-direct {v0}, Lcom/roidapp/imagelib/f/e;-><init>()V

    .line 656
    iget-object v1, p1, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    .line 657
    iget-object v1, p0, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    .line 658
    iget-boolean v1, p1, Lcom/roidapp/imagelib/f/e;->c:Z

    iput-boolean v1, v0, Lcom/roidapp/imagelib/f/e;->c:Z

    .line 659
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->d:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->d:F

    .line 660
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->f:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->f:F

    .line 661
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->e:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->e:F

    .line 662
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->g:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->g:F

    .line 663
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->h:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->h:F

    .line 664
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->i:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->i:F

    .line 665
    iget v1, p1, Lcom/roidapp/imagelib/f/e;->j:F

    iput v1, v0, Lcom/roidapp/imagelib/f/e;->j:F

    .line 666
    iget-object v1, p0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    .line 667
    iget-object v1, p0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    .line 668
    iget-object v1, p0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    .line 669
    iget-object v1, p1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    if-eqz v1, :cond_0

    .line 670
    iget-object v1, p0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    if-nez v1, :cond_1

    .line 671
    iget-object v1, p1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    .line 678
    :cond_0
    :goto_0
    return-object v0

    .line 673
    :cond_1
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    invoke-direct {v1, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 674
    iget-object v2, p1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 675
    iput-object v1, v0, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    goto :goto_0
.end method
