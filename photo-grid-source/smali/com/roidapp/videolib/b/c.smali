.class public Lcom/roidapp/videolib/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/videolib/b/v;",
            ">;"
        }
    .end annotation
.end field

.field private B:[Lcom/roidapp/videolib/b/u;

.field private C:[Lcom/roidapp/videolib/b/u;

.field private D:I

.field private E:Lcom/roidapp/videolib/gl/e;

.field private F:J

.field protected a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;>;"
        }
    .end annotation
.end field

.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Landroid/content/Context;

.field protected h:Ljp/co/cyberagent/android/a/h;

.field protected i:Ljp/co/cyberagent/android/a/h;

.field protected j:Ljp/co/cyberagent/android/a/h;

.field protected k:Ljp/co/cyberagent/android/a/k;

.field protected l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field protected m:Ljp/co/cyberagent/android/a/ag;

.field protected n:I

.field protected o:Lcom/roidapp/videolib/gl/e;

.field p:[Lcom/roidapp/videolib/b/x;

.field q:[Lcom/roidapp/videolib/b/l;

.field protected r:Lcom/roidapp/videolib/b/k;

.field protected s:Lcom/roidapp/videolib/b/k;

.field protected t:Lcom/roidapp/videolib/b/k;

.field protected u:J

.field protected v:J

.field protected w:[Lcom/roidapp/videolib/b/l;

.field private x:Lcom/roidapp/videolib/b/u;

.field private y:J

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->d:Ljava/util/List;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    .line 38
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    .line 41
    const/16 v0, 0x280

    iput v0, p0, Lcom/roidapp/videolib/b/c;->n:I

    .line 44
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->p:[Lcom/roidapp/videolib/b/x;

    .line 46
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    .line 48
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    .line 49
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    .line 50
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    .line 51
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/roidapp/videolib/b/c;->u:J

    .line 53
    iput-wide v4, p0, Lcom/roidapp/videolib/b/c;->v:J

    .line 55
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    .line 56
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/roidapp/videolib/b/c;->y:J

    .line 57
    iput v3, p0, Lcom/roidapp/videolib/b/c;->z:I

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    .line 60
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->B:[Lcom/roidapp/videolib/b/u;

    .line 61
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    .line 62
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->w:[Lcom/roidapp/videolib/b/l;

    .line 65
    iput v3, p0, Lcom/roidapp/videolib/b/c;->D:I

    .line 82
    new-instance v0, Lcom/roidapp/videolib/b/d;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/b/d;-><init>(Lcom/roidapp/videolib/b/c;)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->E:Lcom/roidapp/videolib/gl/e;

    .line 288
    iput-wide v4, p0, Lcom/roidapp/videolib/b/c;->F:J

    .line 192
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->g:Landroid/content/Context;

    .line 194
    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/b/c;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/roidapp/videolib/b/c;->D:I

    return v0
.end method


# virtual methods
.method public final a(JZ)I
    .locals 5

    .prologue
    .line 664
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v0, v0

    if-gtz v0, :cond_3

    .line 665
    :cond_0
    if-eqz p3, :cond_2

    const-wide/16 v0, 0x0

    :goto_0
    add-long/2addr v0, p1

    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->y:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 666
    iget v1, p0, Lcom/roidapp/videolib/b/c;->z:I

    if-lt v0, v1, :cond_1

    .line 667
    iget v0, p0, Lcom/roidapp/videolib/b/c;->z:I

    add-int/lit8 v0, v0, -0x1

    .line 681
    :cond_1
    :goto_1
    return v0

    .line 665
    :cond_2
    iget-wide v0, p0, Lcom/roidapp/videolib/b/c;->F:J

    goto :goto_0

    .line 670
    :cond_3
    const/4 v0, 0x0

    :goto_2
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v1, v1

    if-ge v0, v1, :cond_6

    .line 671
    if-eqz p3, :cond_4

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->w:[Lcom/roidapp/videolib/b/l;

    if-eqz v1, :cond_4

    .line 672
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->w:[Lcom/roidapp/videolib/b/l;

    aget-object v1, v1, v0

    iget-wide v2, v1, Lcom/roidapp/videolib/b/l;->b:J

    cmp-long v1, p1, v2

    if-ltz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->w:[Lcom/roidapp/videolib/b/l;

    aget-object v1, v1, v0

    iget-wide v2, v1, Lcom/roidapp/videolib/b/l;->c:J

    cmp-long v1, p1, v2

    if-gtz v1, :cond_5

    .line 673
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->w:[Lcom/roidapp/videolib/b/l;

    aget-object v0, v1, v0

    iget v0, v0, Lcom/roidapp/videolib/b/l;->a:I

    goto :goto_1

    .line 675
    :cond_4
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    aget-object v1, v1, v0

    iget-wide v2, v1, Lcom/roidapp/videolib/b/l;->b:J

    cmp-long v1, p1, v2

    if-ltz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    aget-object v1, v1, v0

    iget-wide v2, v1, Lcom/roidapp/videolib/b/l;->c:J

    cmp-long v1, p1, v2

    if-gez v1, :cond_5

    .line 676
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    aget-object v0, v1, v0

    iget v0, v0, Lcom/roidapp/videolib/b/l;->a:I

    goto :goto_1

    .line 670
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 679
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    iget-wide v0, v0, Lcom/roidapp/videolib/b/l;->c:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_7

    .line 680
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 681
    :cond_7
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final a(I)J
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 652
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 653
    :cond_0
    int-to-long v0, p1

    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v0, v4

    sub-long/2addr v0, v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 659
    :goto_0
    return-wide v0

    .line 655
    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 656
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/roidapp/videolib/b/l;->a:I

    if-ne p1, v1, :cond_2

    .line 657
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    aget-object v0, v1, v0

    iget-wide v0, v0, Lcom/roidapp/videolib/b/l;->b:J

    goto :goto_0

    .line 655
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move-wide v0, v2

    .line 659
    goto :goto_0
.end method

.method public a(J)Ljp/co/cyberagent/android/a/h;
    .locals 9

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 573
    .line 574
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    sget-object v4, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-eq v0, v4, :cond_2

    .line 575
    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->v:J

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->u:J

    sub-long/2addr v4, v6

    cmp-long v0, p1, v4

    if-ltz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_6

    .line 577
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    move v0, v1

    .line 588
    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 589
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v2, v4

    if-eqz v0, :cond_0

    move v1, v3

    :cond_0
    sub-int v0, v2, v1

    iput v0, p0, Lcom/roidapp/videolib/b/c;->D:I

    .line 591
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 593
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_3

    .line 594
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 595
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_4

    .line 596
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 597
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_5

    .line 598
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 599
    :cond_5
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    return-object v0

    .line 1546
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    sget-object v4, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    if-eq v0, v4, :cond_8

    .line 1549
    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->y:J

    iget v0, p0, Lcom/roidapp/videolib/b/c;->z:I

    add-int/lit8 v0, v0, -0x1

    int-to-long v6, v0

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v4, v6

    cmp-long v0, p1, v4

    if-gez v0, :cond_8

    .line 1554
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/b/v;

    .line 1555
    iget-wide v6, v0, Lcom/roidapp/videolib/b/v;->a:J

    cmp-long v5, p1, v6

    if-ltz v5, :cond_7

    iget-wide v6, v0, Lcom/roidapp/videolib/b/v;->b:J

    cmp-long v0, p1, v6

    if-gez v0, :cond_7

    move v0, v1

    .line 580
    :goto_1
    if-eqz v0, :cond_9

    .line 582
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    move v0, v2

    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 1558
    goto :goto_1

    .line 586
    :cond_9
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    const/4 v4, 0x3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->l:Ljava/util/List;

    move v0, v2

    goto/16 :goto_0
.end method

.method protected a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 198
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v1, :cond_0

    .line 199
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    :cond_0
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    .line 201
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v1, :cond_2

    .line 203
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    :cond_2
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v1, :cond_3

    .line 205
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 208
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_4

    .line 209
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_4
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_5

    .line 211
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    :cond_5
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_6

    .line 213
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 216
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v3, :cond_7

    .line 217
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_7
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_8

    .line 219
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    :cond_8
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v3, :cond_9

    .line 221
    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_9
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 225
    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v4, :cond_a

    .line 226
    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_a
    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v4, :cond_b

    .line 228
    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_b
    iget-object v4, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 609
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->p()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 610
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 611
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/a/k;->a(II)V

    .line 612
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/b/u;)V
    .locals 0

    .prologue
    .line 701
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    .line 702
    return-void
.end method

.method public a(Lcom/roidapp/videolib/gl/e;)V
    .locals 4

    .prologue
    .line 518
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->o:Lcom/roidapp/videolib/gl/e;

    .line 524
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->o:Lcom/roidapp/videolib/gl/e;

    sget v1, Ljp/co/cyberagent/android/a/ag;->y:I

    invoke-interface {v0, v1}, Lcom/roidapp/videolib/gl/e;->a(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 525
    new-instance v0, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    .line 526
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->o:Lcom/roidapp/videolib/gl/e;

    sget v3, Ljp/co/cyberagent/android/a/ag;->y:I

    invoke-interface {v2, v3}, Lcom/roidapp/videolib/gl/e;->a(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 534
    :cond_0
    return-void
.end method

.method public final a(Ljp/co/cyberagent/android/a/h;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    .line 69
    return-void
.end method

.method public final a([Lcom/roidapp/videolib/b/u;)V
    .locals 0

    .prologue
    .line 697
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->B:[Lcom/roidapp/videolib/b/u;

    .line 698
    return-void
.end method

.method public final varargs a([Ljp/co/cyberagent/android/a/h;)V
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 75
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    aget-object v2, p1, v0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 79
    :cond_0
    return-void
.end method

.method protected b()V
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 239
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 705
    iput p1, p0, Lcom/roidapp/videolib/b/c;->z:I

    .line 706
    return-void
.end method

.method public final b(J)V
    .locals 1

    .prologue
    .line 693
    iput-wide p1, p0, Lcom/roidapp/videolib/b/c;->v:J

    .line 694
    return-void
.end method

.method public final b(Ljp/co/cyberagent/android/a/h;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    .line 158
    return-void
.end method

.method protected c()V
    .locals 3

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 244
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_2

    .line 249
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_3

    .line 251
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    if-eqz v0, :cond_4

    .line 253
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    :cond_4
    return-void
.end method

.method public final c(Ljp/co/cyberagent/android/a/h;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    .line 162
    return-void
.end method

.method protected d()V
    .locals 4

    .prologue
    .line 257
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 259
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 261
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 262
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 264
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    .line 266
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 267
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 268
    if-eqz v2, :cond_0

    .line 269
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 273
    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 275
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/c;->b()V

    .line 276
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/c;->c()V

    .line 277
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/c;->f()V

    .line 278
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/c;->a()V

    .line 279
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/c;->d()V

    .line 281
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    if-nez v0, :cond_0

    .line 282
    new-instance v0, Ljp/co/cyberagent/android/a/k;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 284
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->h()V

    .line 285
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 286
    return-void
.end method

.method protected f()V
    .locals 12

    .prologue
    .line 300
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 515
    :cond_0
    :goto_0
    return-void

    .line 302
    :cond_1
    iget-wide v0, p0, Lcom/roidapp/videolib/b/c;->v:J

    .line 303
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_2

    .line 304
    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->u:J

    sub-long/2addr v0, v2

    .line 306
    :cond_2
    iget v2, p0, Lcom/roidapp/videolib/b/c;->z:I

    if-eqz v2, :cond_3

    .line 307
    iget v2, p0, Lcom/roidapp/videolib/b/c;->z:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/roidapp/videolib/b/c;->y:J

    .line 312
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    if-ne v0, v1, :cond_7

    .line 313
    const-wide/16 v0, 0x0

    move-object v2, p0

    .line 315
    :goto_1
    iput-wide v0, v2, Lcom/roidapp/videolib/b/c;->F:J

    .line 318
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_4

    .line 319
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    .line 321
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 322
    new-instance v0, Lcom/roidapp/videolib/b/x;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 323
    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->v:J

    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->u:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/roidapp/videolib/b/x;->b:J

    .line 325
    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->v:J

    iput-wide v2, v0, Lcom/roidapp/videolib/b/x;->c:J

    .line 326
    const/16 v1, 0x8

    iput v1, v0, Lcom/roidapp/videolib/b/x;->a:I

    .line 327
    const/4 v1, 0x0

    iput v1, v0, Lcom/roidapp/videolib/b/x;->d:F

    .line 328
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/roidapp/videolib/b/x;->e:F

    .line 329
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v0}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 331
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_5

    .line 332
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    .line 334
    :cond_5
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    if-nez v0, :cond_6

    .line 335
    new-instance v0, Lcom/roidapp/videolib/b/k;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/k;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    .line 337
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 338
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 339
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 340
    iget v0, p0, Lcom/roidapp/videolib/b/c;->z:I

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Lcom/roidapp/videolib/b/u;

    iput-object v0, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    .line 341
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    sget-object v1, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-eq v0, v1, :cond_16

    .line 342
    const/4 v0, 0x0

    :goto_2
    iget v1, p0, Lcom/roidapp/videolib/b/c;->z:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_17

    .line 343
    new-instance v4, Lcom/roidapp/videolib/b/x;

    invoke-direct {v4}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 344
    new-instance v5, Lcom/roidapp/videolib/b/x;

    invoke-direct {v5}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 345
    new-instance v6, Lcom/roidapp/videolib/b/x;

    invoke-direct {v6}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 346
    new-instance v1, Lcom/roidapp/videolib/b/x;

    invoke-direct {v1}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 347
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    .line 348
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    sget-object v3, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    if-ne v2, v3, :cond_c

    .line 349
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->B:[Lcom/roidapp/videolib/b/u;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->B:[Lcom/roidapp/videolib/b/u;

    array-length v1, v1

    add-int/lit8 v2, v0, 0x1

    if-lt v1, v2, :cond_9

    .line 350
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->B:[Lcom/roidapp/videolib/b/u;

    aget-object v1, v1, v0

    move-object v3, v2

    move v2, v0

    .line 353
    :goto_3
    aput-object v1, v3, v2

    .line 355
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    aget-object v1, v1, v0

    .line 361
    :goto_4
    sget-object v2, Lcom/roidapp/videolib/b/e;->a:[I

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 342
    :goto_5
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 315
    :cond_7
    iget-wide v0, p0, Lcom/roidapp/videolib/b/c;->y:J

    const-wide/16 v2, 0x190

    cmp-long v0, v0, v2

    if-lez v0, :cond_8

    iget-wide v0, p0, Lcom/roidapp/videolib/b/c;->y:J

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    move-object v2, p0

    goto/16 :goto_1

    :cond_8
    iget-wide v0, p0, Lcom/roidapp/videolib/b/c;->y:J

    const-wide/16 v2, 0x4

    div-long/2addr v0, v2

    move-object v2, p0

    goto/16 :goto_1

    .line 353
    :cond_9
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    .line 1291
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v8

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    mul-double/2addr v8, v10

    const-wide/high16 v10, 0x4018000000000000L    # 6.0

    rem-double/2addr v8, v10

    const-wide/high16 v10, 0x4008000000000000L    # 3.0

    add-double/2addr v8, v10

    double-to-int v3, v8

    .line 1292
    const/4 v1, 0x0

    :goto_6
    sget-object v7, Lcom/roidapp/videolib/b/u;->k:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v7}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v7

    if-ge v1, v7, :cond_b

    .line 1293
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v7

    aget-object v7, v7, v1

    invoke-virtual {v7}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v7

    if-ne v3, v7, :cond_a

    .line 1294
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v3

    aget-object v1, v3, v1

    move-object v3, v2

    move v2, v0

    goto :goto_3

    .line 1292
    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 1296
    :cond_b
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    const/4 v3, 0x0

    aget-object v1, v1, v3

    move-object v3, v2

    move v2, v0

    goto :goto_3

    .line 358
    :cond_c
    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->C:[Lcom/roidapp/videolib/b/u;

    iget-object v3, p0, Lcom/roidapp/videolib/b/c;->x:Lcom/roidapp/videolib/b/u;

    aput-object v3, v2, v0

    goto :goto_4

    .line 365
    :pswitch_1
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v8

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 366
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v8

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 367
    const/4 v1, 0x0

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 368
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->e:F

    .line 369
    const/4 v1, 0x3

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 370
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 372
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v8

    iput-wide v2, v6, Lcom/roidapp/videolib/b/x;->b:J

    .line 373
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v8

    iput-wide v2, v6, Lcom/roidapp/videolib/b/x;->c:J

    .line 374
    const/4 v1, 0x0

    iput v1, v6, Lcom/roidapp/videolib/b/x;->d:F

    .line 375
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v6, Lcom/roidapp/videolib/b/x;->e:F

    .line 376
    const/16 v1, 0x8

    iput v1, v6, Lcom/roidapp/videolib/b/x;->a:I

    .line 377
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v6}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 379
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->b:J

    .line 380
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->c:J

    .line 381
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 382
    const/4 v1, 0x0

    iput v1, v5, Lcom/roidapp/videolib/b/x;->e:F

    .line 383
    const/4 v1, 0x3

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 384
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v5}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 385
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 390
    :pswitch_2
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 391
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 392
    const/high16 v1, 0x40000000    # 2.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 393
    const/4 v1, 0x0

    iput v1, v4, Lcom/roidapp/videolib/b/x;->e:F

    .line 394
    const/4 v1, 0x4

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 395
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 397
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->b:J

    .line 398
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->c:J

    .line 399
    const/4 v1, 0x0

    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 400
    const/high16 v1, -0x40000000    # -2.0f

    iput v1, v5, Lcom/roidapp/videolib/b/x;->e:F

    .line 401
    const/4 v1, 0x4

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 402
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v5}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 403
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 407
    :pswitch_3
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->b:J

    .line 408
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->c:J

    .line 409
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 410
    const/4 v1, 0x0

    iput v1, v5, Lcom/roidapp/videolib/b/x;->e:F

    .line 411
    const/4 v1, 0x3

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 412
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v5}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 414
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 415
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 416
    const/high16 v1, 0x40000000    # 2.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 417
    const/4 v1, 0x0

    iput v1, v4, Lcom/roidapp/videolib/b/x;->e:F

    .line 418
    const/4 v1, 0x4

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 419
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 420
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 424
    :pswitch_4
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->b:J

    .line 425
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v5, Lcom/roidapp/videolib/b/x;->c:J

    .line 426
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 427
    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v5, Lcom/roidapp/videolib/b/x;->e:F

    .line 428
    const/16 v1, 0x8

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 429
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v5}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 431
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 432
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 433
    const/high16 v1, 0x40000000    # 2.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 434
    const/4 v1, 0x0

    iput v1, v4, Lcom/roidapp/videolib/b/x;->e:F

    .line 435
    const/4 v1, 0x4

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 436
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 437
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 441
    :pswitch_5
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 442
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v6

    iput-wide v2, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 443
    const/4 v1, 0x0

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 444
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->e:F

    .line 445
    const/16 v1, 0x8

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 446
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 448
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 452
    :pswitch_6
    const v1, 0x3e99999a    # 0.3f

    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->y:J

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    add-long/2addr v2, v8

    long-to-float v2, v2

    div-float/2addr v1, v2

    .line 454
    iget-wide v2, p0, Lcom/roidapp/videolib/b/c;->F:J

    long-to-float v2, v2

    mul-float v3, v1, v2

    .line 456
    if-nez v0, :cond_e

    .line 457
    const-wide/16 v8, 0x0

    iput-wide v8, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 458
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 459
    const v1, 0x3fa66666    # 1.3f

    sub-float/2addr v1, v3

    move-object v2, v4

    .line 464
    :goto_7
    iput v1, v2, Lcom/roidapp/videolib/b/x;->e:F

    .line 466
    add-int/lit8 v1, v0, 0x1

    int-to-long v8, v1

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v8, v10

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v8, v10

    iput-wide v8, v4, Lcom/roidapp/videolib/b/x;->c:J

    .line 467
    const/4 v1, 0x3

    iput v1, v4, Lcom/roidapp/videolib/b/x;->a:I

    .line 468
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v4}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 470
    add-int/lit8 v1, v0, 0x1

    int-to-long v8, v1

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v8, v10

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v8, v10

    iput-wide v8, v5, Lcom/roidapp/videolib/b/x;->b:J

    .line 471
    add-int/lit8 v1, v0, 0x1

    int-to-long v8, v1

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v8, v10

    iput-wide v8, v5, Lcom/roidapp/videolib/b/x;->c:J

    .line 472
    const/4 v1, 0x3

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 473
    if-nez v0, :cond_11

    .line 474
    const v1, 0x3fa66666    # 1.3f

    sub-float/2addr v1, v3

    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 475
    const v1, 0x3fa66666    # 1.3f

    move-object v2, v5

    .line 478
    :goto_8
    iput v1, v2, Lcom/roidapp/videolib/b/x;->e:F

    .line 480
    const/4 v1, 0x3

    iput v1, v5, Lcom/roidapp/videolib/b/x;->a:I

    .line 481
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v5}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 483
    iget v1, p0, Lcom/roidapp/videolib/b/c;->z:I

    add-int/lit8 v1, v1, -0x2

    if-ne v0, v1, :cond_d

    .line 484
    new-instance v2, Lcom/roidapp/videolib/b/x;

    invoke-direct {v2}, Lcom/roidapp/videolib/b/x;-><init>()V

    .line 485
    add-int/lit8 v1, v0, 0x1

    int-to-long v4, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v8

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v8

    iput-wide v4, v2, Lcom/roidapp/videolib/b/x;->b:J

    .line 486
    add-int/lit8 v1, v0, 0x2

    int-to-long v4, v1

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v8

    iput-wide v4, v2, Lcom/roidapp/videolib/b/x;->c:J

    .line 487
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_14

    const v1, 0x3fa66666    # 1.3f

    :goto_9
    iput v1, v2, Lcom/roidapp/videolib/b/x;->d:F

    .line 488
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_15

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_a
    iput v1, v2, Lcom/roidapp/videolib/b/x;->e:F

    .line 489
    const/4 v1, 0x3

    iput v1, v2, Lcom/roidapp/videolib/b/x;->a:I

    .line 490
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v2}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 493
    :cond_d
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v4

    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v2, v4

    iput-wide v2, v6, Lcom/roidapp/videolib/b/x;->b:J

    .line 494
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v2, v4

    iput-wide v2, v6, Lcom/roidapp/videolib/b/x;->c:J

    .line 495
    const/4 v1, 0x0

    iput v1, v6, Lcom/roidapp/videolib/b/x;->d:F

    .line 496
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v6, Lcom/roidapp/videolib/b/x;->e:F

    .line 497
    const/16 v1, 0x8

    iput v1, v6, Lcom/roidapp/videolib/b/x;->a:I

    .line 498
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v1, v6}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 499
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->A:Ljava/util/List;

    new-instance v2, Lcom/roidapp/videolib/b/v;

    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v4, v6

    iget-wide v6, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x1

    int-to-long v6, v3

    iget-wide v8, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v6, v8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/roidapp/videolib/b/v;-><init>(JJ)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 462
    :cond_e
    int-to-long v8, v0

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->y:J

    mul-long/2addr v8, v10

    iget-wide v10, p0, Lcom/roidapp/videolib/b/c;->F:J

    sub-long/2addr v8, v10

    iput-wide v8, v4, Lcom/roidapp/videolib/b/x;->b:J

    .line 463
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_f

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_b
    iput v1, v4, Lcom/roidapp/videolib/b/x;->d:F

    .line 464
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_10

    const v1, 0x3fa66666    # 1.3f

    sub-float/2addr v1, v3

    move-object v2, v4

    goto/16 :goto_7

    .line 463
    :cond_f
    const v1, 0x3fa66666    # 1.3f

    goto :goto_b

    .line 464
    :cond_10
    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v3

    move-object v2, v4

    goto/16 :goto_7

    .line 477
    :cond_11
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_12

    const v1, 0x3fa66666    # 1.3f

    sub-float/2addr v1, v3

    :goto_c
    iput v1, v5, Lcom/roidapp/videolib/b/x;->d:F

    .line 478
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_13

    const v1, 0x3fa66666    # 1.3f

    move-object v2, v5

    goto/16 :goto_8

    .line 477
    :cond_12
    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v3

    goto :goto_c

    .line 478
    :cond_13
    const/high16 v1, 0x3f800000    # 1.0f

    move-object v2, v5

    goto/16 :goto_8

    .line 487
    :cond_14
    const/high16 v1, 0x3f800000    # 1.0f

    goto/16 :goto_9

    .line 488
    :cond_15
    const v1, 0x3fa66666    # 1.3f

    goto/16 :goto_a

    .line 505
    :cond_16
    const/4 v0, 0x0

    :goto_d
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->p:[Lcom/roidapp/videolib/b/x;

    array-length v1, v1

    if-ge v0, v1, :cond_17

    .line 506
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    iget-object v2, p0, Lcom/roidapp/videolib/b/c;->p:[Lcom/roidapp/videolib/b/x;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lcom/roidapp/videolib/b/k;->a(Lcom/roidapp/videolib/b/x;)V

    .line 505
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    .line 509
    :cond_17
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_18

    .line 510
    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v1, v0}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 511
    :cond_18
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_19

    .line 512
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 513
    :cond_19
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_0

    .line 514
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/k;->a(Ljp/co/cyberagent/android/a/h;)V

    goto/16 :goto_0

    .line 361
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public g()I
    .locals 1

    .prologue
    .line 615
    const/4 v0, 0x0

    return v0
.end method

.method public h()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 685
    .line 1618
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1619
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1620
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    if-eqz v0, :cond_0

    .line 1621
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 1622
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->i()V

    .line 1624
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1625
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->m:Ljp/co/cyberagent/android/a/ag;

    .line 1627
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 1628
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1629
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_2

    .line 1630
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1631
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_3

    .line 1632
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1633
    :cond_3
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->s:Lcom/roidapp/videolib/b/k;

    .line 1634
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->t:Lcom/roidapp/videolib/b/k;

    .line 1635
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->r:Lcom/roidapp/videolib/b/k;

    .line 1636
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    .line 1637
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->h:Ljp/co/cyberagent/android/a/h;

    .line 1638
    iget-object v0, p0, Lcom/roidapp/videolib/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1639
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->j:Ljp/co/cyberagent/android/a/h;

    .line 1640
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->i:Ljp/co/cyberagent/android/a/h;

    .line 686
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    .line 687
    iput-object v2, p0, Lcom/roidapp/videolib/b/c;->p:[Lcom/roidapp/videolib/b/x;

    .line 689
    return-void
.end method
