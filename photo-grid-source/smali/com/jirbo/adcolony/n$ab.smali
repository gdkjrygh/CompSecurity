.class Lcom/jirbo/adcolony/n$ab;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field d:I

.field e:Z

.field f:Z

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field h:Lcom/jirbo/adcolony/n$ac;

.field i:Lcom/jirbo/adcolony/n$d;

.field j:Lcom/jirbo/adcolony/n$ad;

.field k:Lcom/jirbo/adcolony/ag;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(II)I
    .locals 1

    .prologue
    .line 569
    if-gtz p2, :cond_1

    const/4 p2, 0x0

    .line 573
    :cond_0
    :goto_0
    return p2

    .line 571
    :cond_1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 573
    if-ge p1, p2, :cond_0

    move p2, p1

    goto :goto_0
.end method

.method declared-synchronized a(Lcom/jirbo/adcolony/n$a;)I
    .locals 10

    .prologue
    const/4 v0, -0x1

    .line 591
    monitor-enter p0

    :try_start_0
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/t;->b(Ljava/lang/String;)I

    move-result v1

    .line 596
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->g:I

    .line 597
    if-eqz v2, :cond_1

    sget-wide v4, Lcom/jirbo/adcolony/a;->ab:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-eqz v3, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v6, Lcom/jirbo/adcolony/a;->ab:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    int-to-long v2, v2

    cmp-long v2, v4, v2

    if-ltz v2, :cond_1

    .line 599
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 600
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 601
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "The volatile expiration for this ad has been hit."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 694
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 605
    :cond_1
    :try_start_1
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->h:I

    .line 606
    if-lez v2, :cond_2

    const/4 v0, -0x1

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget v4, p1, Lcom/jirbo/adcolony/n$a;->d:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-wide v8, Lcom/jirbo/adcolony/a;->ab:J

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    long-to-double v6, v6

    invoke-virtual {v3, v4, v6, v7}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v3

    sub-int v3, v2, v3

    invoke-virtual {p0, v0, v3}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 607
    :cond_2
    if-nez v0, :cond_3

    if-eqz v2, :cond_3

    .line 609
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 610
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 611
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the volatile play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 615
    :cond_3
    iget v2, p0, Lcom/jirbo/adcolony/n$ab;->c:I

    .line 616
    if-lez v2, :cond_4

    sub-int/2addr v2, v1

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 617
    :cond_4
    if-nez v0, :cond_5

    .line 619
    const/4 v0, 0x5

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 620
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready to be played due to the daily play cap for zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 623
    :cond_5
    iget v2, p0, Lcom/jirbo/adcolony/n$ab;->d:I

    .line 624
    if-lez v2, :cond_6

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v4, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 625
    :cond_6
    if-nez v0, :cond_7

    .line 627
    const/4 v0, 0x3

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 628
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready to be played due to the session play cap for zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 632
    :cond_7
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/n$ad;->a:Z

    if-eqz v2, :cond_b

    .line 634
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    iget v2, v2, Lcom/jirbo/adcolony/n$z;->a:I

    .line 635
    if-lez v2, :cond_8

    sub-int v1, v2, v1

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 636
    :cond_8
    if-nez v0, :cond_9

    .line 638
    const/4 v0, 0x4

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 639
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the V4VC daily play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 642
    :cond_9
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v1, v1, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    iget v1, v1, Lcom/jirbo/adcolony/n$z;->c:I

    .line 643
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    iget v2, v2, Lcom/jirbo/adcolony/n$z;->b:I

    .line 644
    if-lez v2, :cond_a

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v4, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    int-to-double v6, v1

    invoke-virtual {v3, v4, v6, v7}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;D)I

    move-result v1

    sub-int v1, v2, v1

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 645
    :cond_a
    if-nez v0, :cond_b

    .line 647
    const/4 v0, 0x4

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 648
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the V4VC custom play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 653
    :cond_b
    iget v1, p1, Lcom/jirbo/adcolony/n$a;->d:I

    .line 654
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->a:I

    .line 655
    if-lez v2, :cond_c

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v3, v1}, Lcom/jirbo/adcolony/t;->a(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 656
    :cond_c
    if-nez v0, :cond_d

    .line 658
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 659
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 660
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the daily play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 663
    :cond_d
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->f:I

    .line 664
    if-lez v2, :cond_e

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v3, v1}, Lcom/jirbo/adcolony/t;->b(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 665
    :cond_e
    if-nez v0, :cond_f

    .line 667
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 668
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 669
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the weekly play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 672
    :cond_f
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->e:I

    .line 673
    if-lez v2, :cond_10

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v3, v1}, Lcom/jirbo/adcolony/t;->c(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 674
    :cond_10
    if-nez v0, :cond_11

    .line 676
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 677
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 678
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the monthly play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 681
    :cond_11
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->d:I

    .line 682
    if-lez v2, :cond_12

    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, v3, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v3, v1}, Lcom/jirbo/adcolony/t;->d(I)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/n$ab;->a(II)I

    move-result v0

    .line 683
    :cond_12
    if-nez v0, :cond_13

    .line 685
    const/4 v0, 0x7

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 686
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->c()V

    .line 687
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to the half-year play cap."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_0

    .line 690
    :cond_13
    iget-object v2, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v2, v2, Lcom/jirbo/adcolony/n$n;->c:I

    .line 691
    iget-object v3, p1, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    iget v3, v3, Lcom/jirbo/adcolony/n$n;->b:I

    .line 692
    if-lez v3, :cond_0

    sget-object v4, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v4, v4, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    int-to-double v6, v2

    invoke-virtual {v4, v1, v6, v7}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v1

    sub-int v1, v3, v1

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/n$ab;->a(II)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto/16 :goto_0

    .line 591
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a()Z
    .locals 2

    .prologue
    .line 482
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/n$ab;->a(ZZ)Z

    move-result v0

    return v0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 803
    if-nez p1, :cond_1

    .line 832
    :cond_0
    :goto_0
    return v0

    .line 804
    :cond_1
    const-string v2, "uuid"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    .line 807
    const-string v2, "enabled"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    .line 808
    const-string v2, "active"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    .line 809
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 811
    :cond_3
    const-string v2, "play_interval"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$ab;->b:I

    .line 812
    const-string v2, "daily_play_cap"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$ab;->c:I

    .line 813
    const-string v2, "session_play_cap"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$ab;->d:I

    .line 815
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    .line 816
    const-string v2, "play_order"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 818
    new-instance v2, Lcom/jirbo/adcolony/n$ac;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$ac;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    .line 819
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    const-string v3, "tracking"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$ac;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 822
    new-instance v2, Lcom/jirbo/adcolony/n$d;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$d;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    .line 823
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    const-string v3, "ads"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$d;->a(Lcom/jirbo/adcolony/ADCData$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 825
    new-instance v2, Lcom/jirbo/adcolony/n$ad;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$ad;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    .line 826
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    const-string v3, "v4vc"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$ad;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 828
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->g:Lcom/jirbo/adcolony/ah;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ah;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    move v0, v1

    .line 832
    goto/16 :goto_0
.end method

.method a(Z)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 525
    if-nez p1, :cond_0

    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 527
    :cond_0
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v1, :cond_2

    .line 547
    :cond_1
    :goto_0
    return v0

    .line 529
    :cond_2
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    .line 531
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 532
    const/4 v2, 0x0

    move v3, v0

    .line 533
    :goto_1
    if-ge v3, v4, :cond_4

    .line 535
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->i()Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    .line 536
    if-eqz v1, :cond_1

    .line 537
    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$a;->a()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 545
    :goto_2
    if-eqz v1, :cond_1

    .line 547
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/n$ab;->a(Lcom/jirbo/adcolony/n$a;)I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 542
    :cond_3
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->k()V

    .line 533
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    :cond_4
    move-object v1, v2

    goto :goto_2
.end method

.method a(ZZ)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 486
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/n$ab;->a(Z)Z

    move-result v0

    .line 520
    :cond_0
    :goto_0
    return v0

    .line 488
    :cond_1
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v2, :cond_3

    .line 490
    :cond_2
    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 491
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready to be played, as zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is disabled or inactive."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 494
    :cond_3
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_5

    .line 496
    :cond_4
    const/4 v0, 0x5

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 497
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready to be played, as AdColony currently has no videos available to be played in zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 500
    :cond_5
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 501
    const/4 v3, 0x0

    move v4, v1

    .line 502
    :goto_1
    if-ge v4, v5, :cond_9

    .line 504
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->i()Lcom/jirbo/adcolony/n$a;

    move-result-object v2

    .line 505
    if-nez v2, :cond_6

    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played due to an unknown error."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 506
    :cond_6
    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$a;->a()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 514
    :goto_2
    if-nez v2, :cond_8

    .line 516
    const/4 v0, 0x6

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 517
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad is not ready to be played as required assets are still downloading or otherwise missing."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto/16 :goto_0

    .line 511
    :cond_7
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->k()V

    .line 502
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_1

    .line 520
    :cond_8
    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/n$ab;->a(Lcom/jirbo/adcolony/n$a;)I

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto/16 :goto_0

    :cond_9
    move-object v2, v3

    goto :goto_2
.end method

.method b()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 552
    iget v2, p0, Lcom/jirbo/adcolony/n$ab;->b:I

    if-gt v2, v1, :cond_1

    .line 564
    :cond_0
    :goto_0
    return v0

    .line 557
    :cond_1
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->g:Lcom/jirbo/adcolony/ah;

    iput-boolean v1, v2, Lcom/jirbo/adcolony/ah;->b:Z

    .line 558
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v3, v2, Lcom/jirbo/adcolony/ag;->b:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v2, Lcom/jirbo/adcolony/ag;->b:I

    if-eqz v3, :cond_0

    .line 563
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v2, Lcom/jirbo/adcolony/ag;->b:I

    iget v3, p0, Lcom/jirbo/adcolony/n$ab;->b:I

    if-lt v2, v3, :cond_2

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iput v0, v2, Lcom/jirbo/adcolony/ag;->b:I

    :cond_2
    move v0, v1

    .line 564
    goto :goto_0
.end method

.method b(Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 704
    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->f()Z

    move-result v0

    .line 722
    :cond_0
    :goto_0
    return v0

    .line 705
    :cond_1
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v1, :cond_3

    .line 707
    :cond_2
    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 708
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is disabled or inactive."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 710
    :cond_3
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-nez v1, :cond_4

    .line 712
    const/4 v0, 0x5

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 713
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as there are currently no ads to play in zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 715
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->b()Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    iget-object v1, v1, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$c;->a:Z

    if-eqz v1, :cond_0

    .line 717
    const/16 v0, 0xe

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 718
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is V4VC enabled and must be played using an AdColonyV4VCAd object."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method c()V
    .locals 1

    .prologue
    .line 578
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->e()V

    .line 579
    return-void
.end method

.method c(Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 746
    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->h()Z

    move-result v0

    .line 764
    :cond_0
    :goto_0
    return v0

    .line 747
    :cond_1
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v1, :cond_3

    .line 749
    :cond_2
    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 750
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is disabled or inactive."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 752
    :cond_3
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-nez v1, :cond_4

    .line 754
    const/4 v0, 0x5

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 755
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as there are currently no ads to play in zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 757
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->b()Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    iget-object v1, v1, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$c;->a:Z

    if-nez v1, :cond_0

    .line 763
    const/16 v0, 0xf

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 764
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ad is not ready, as zone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not V4VC enabled and must be played using an AdColonyVideoAd object."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method declared-synchronized d()I
    .locals 1

    .prologue
    .line 583
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/n$ab;->i()Lcom/jirbo/adcolony/n$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/n$ab;->a(Lcom/jirbo/adcolony/n$a;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method e()Z
    .locals 1

    .prologue
    .line 699
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/n$ab;->b(Z)Z

    move-result v0

    return v0
.end method

.method f()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 727
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v1, :cond_1

    .line 735
    :cond_0
    :goto_0
    return v0

    .line 728
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-eqz v1, :cond_0

    .line 729
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->b()Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    iget-object v1, v1, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$c;->a:Z

    if-nez v1, :cond_0

    .line 735
    const/4 v0, 0x1

    goto :goto_0
.end method

.method g()Z
    .locals 1

    .prologue
    .line 741
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/n$ab;->c(Z)Z

    move-result v0

    return v0
.end method

.method h()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 769
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v1, :cond_1

    .line 777
    :cond_0
    :goto_0
    return v0

    .line 770
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-eqz v1, :cond_0

    .line 771
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->b()Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    iget-object v1, v1, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$c;->a:Z

    if-eqz v1, :cond_0

    .line 773
    const/4 v0, 0x1

    goto :goto_0
.end method

.method i()Lcom/jirbo/adcolony/n$a;
    .locals 4

    .prologue
    .line 783
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v2, Lcom/jirbo/adcolony/ag;->c:I

    iget-object v3, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    rem-int/2addr v2, v3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/n$d;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$a;

    move-result-object v0

    .line 784
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method j()Lcom/jirbo/adcolony/n$a;
    .locals 3

    .prologue
    .line 789
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v1, v1, Lcom/jirbo/adcolony/ag;->c:I

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/n$d;->b(I)Lcom/jirbo/adcolony/n$a;

    move-result-object v0

    .line 790
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method k()V
    .locals 3

    .prologue
    .line 795
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 797
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v1, v1, Lcom/jirbo/adcolony/ag;->c:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/jirbo/adcolony/n$ab;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    rem-int/2addr v1, v2

    iput v1, v0, Lcom/jirbo/adcolony/ag;->c:I

    .line 799
    :cond_0
    return-void
.end method

.method l()V
    .locals 2

    .prologue
    .line 837
    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-nez v0, :cond_1

    .line 843
    :cond_0
    return-void

    .line 839
    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$d;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 841
    iget-object v1, p0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/n$d;->a(I)Lcom/jirbo/adcolony/n$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$a;->b()V

    .line 839
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
