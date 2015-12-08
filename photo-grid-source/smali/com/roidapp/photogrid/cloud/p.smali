.class final Lcom/roidapp/photogrid/cloud/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/roidapp/photogrid/cloud/p;",
        ">;"
    }
.end annotation


# instance fields
.field a:I

.field b:I

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field private e:J


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1504
    iput p1, p0, Lcom/roidapp/photogrid/cloud/p;->b:I

    .line 1505
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    .line 1506
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    .line 1507
    return-void
.end method

.method constructor <init>(JIILjava/lang/String;)V
    .locals 1

    .prologue
    .line 1517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1518
    iput-wide p1, p0, Lcom/roidapp/photogrid/cloud/p;->e:J

    .line 1519
    iput p4, p0, Lcom/roidapp/photogrid/cloud/p;->a:I

    .line 1520
    iput p3, p0, Lcom/roidapp/photogrid/cloud/p;->b:I

    .line 1521
    iput-object p5, p0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    .line 1522
    return-void
.end method

.method constructor <init>(Lcom/roidapp/photogrid/cloud/p;JI)V
    .locals 2

    .prologue
    .line 1509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1510
    iput-wide p2, p0, Lcom/roidapp/photogrid/cloud/p;->e:J

    .line 1511
    iput p4, p0, Lcom/roidapp/photogrid/cloud/p;->a:I

    .line 1512
    iget v0, p1, Lcom/roidapp/photogrid/cloud/p;->b:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/p;->b:I

    .line 1513
    iget-object v0, p1, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    .line 1514
    iget-object v0, p1, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    .line 1515
    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 1496
    check-cast p1, Lcom/roidapp/photogrid/cloud/p;

    .line 2530
    iget-wide v0, p1, Lcom/roidapp/photogrid/cloud/p;->e:J

    iget-wide v2, p0, Lcom/roidapp/photogrid/cloud/p;->e:J

    .line 3525
    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 1496
    goto :goto_0
.end method
