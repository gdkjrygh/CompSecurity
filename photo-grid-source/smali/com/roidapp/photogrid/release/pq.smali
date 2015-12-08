.class final Lcom/roidapp/photogrid/release/pq;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field a:I

.field b:Z

.field c:Lcom/roidapp/photogrid/release/id;

.field d:[F

.field final synthetic e:Lcom/roidapp/photogrid/release/PhotoView;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoView;)V
    .locals 1

    .prologue
    .line 1542
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pq;->e:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 1544
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    .line 1546
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/pq;->b:Z

    .line 1550
    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pq;->d:[F

    return-void

    :array_0
    .array-data 4
        0x3f333333    # 0.7f
        0x3f4ccccd    # 0.8f
        0x3f666666    # 0.9f
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
        0x3f99999a    # 1.2f
        0x3fa66666    # 1.3f
    .end array-data
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1563
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pq;->c:Lcom/roidapp/photogrid/release/id;

    if-eqz v0, :cond_1

    .line 1564
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pq;->c:Lcom/roidapp/photogrid/release/id;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pq;->d:[F

    iget v2, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/id;->a(F)V

    .line 1569
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pq;->b:Z

    if-eqz v0, :cond_2

    .line 1570
    iget v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    .line 1574
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pq;->d:[F

    array-length v1, v1

    if-ne v0, v1, :cond_3

    .line 1575
    iget v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    add-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    .line 1576
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/pq;->b:Z

    .line 1582
    :cond_0
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pq;->e:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->postInvalidate()V

    .line 1583
    return-void

    .line 1566
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/pq;->cancel()Z

    goto :goto_0

    .line 1572
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    goto :goto_1

    .line 1577
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    if-gez v0, :cond_0

    .line 1578
    iput v3, p0, Lcom/roidapp/photogrid/release/pq;->a:I

    .line 1579
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/pq;->b:Z

    goto :goto_2
.end method
