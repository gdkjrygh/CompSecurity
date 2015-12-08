.class public Lcom/a/a/a;
.super Lcom/roidapp/amf/AMFNative;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private c:I

.field private d:Lcom/a/b/a;

.field private e:[B

.field private f:[B

.field private g:I

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:Lcom/a/b/a;

.field private m:[B

.field private n:I

.field private o:D

.field private p:J

.field private q:J

.field private r:I

.field private s:I

.field private t:[B

.field private u:[B

.field private v:J

.field private w:Z

.field private x:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/a/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 13
    invoke-direct {p0}, Lcom/roidapp/amf/AMFNative;-><init>()V

    .line 16
    iput v2, p0, Lcom/a/a/a;->c:I

    .line 20
    iput-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    .line 21
    iput-object v3, p0, Lcom/a/a/a;->e:[B

    .line 22
    iput-object v3, p0, Lcom/a/a/a;->f:[B

    .line 23
    iput v2, p0, Lcom/a/a/a;->g:I

    .line 24
    iput-boolean v2, p0, Lcom/a/a/a;->h:Z

    .line 25
    iput v2, p0, Lcom/a/a/a;->i:I

    .line 26
    iput v2, p0, Lcom/a/a/a;->j:I

    .line 27
    iput v2, p0, Lcom/a/a/a;->k:I

    .line 30
    iput-object v3, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 31
    iput-object v3, p0, Lcom/a/a/a;->m:[B

    .line 32
    iput v2, p0, Lcom/a/a/a;->n:I

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/a/a/a;->o:D

    .line 34
    iput-wide v4, p0, Lcom/a/a/a;->p:J

    .line 35
    iput-wide v4, p0, Lcom/a/a/a;->q:J

    .line 36
    const/4 v0, 0x2

    iput v0, p0, Lcom/a/a/a;->r:I

    .line 37
    iput v2, p0, Lcom/a/a/a;->s:I

    .line 454
    iput-object v3, p0, Lcom/a/a/a;->t:[B

    .line 455
    iput-object v3, p0, Lcom/a/a/a;->u:[B

    .line 456
    iput-wide v4, p0, Lcom/a/a/a;->v:J

    .line 458
    iput-boolean v2, p0, Lcom/a/a/a;->w:Z

    .line 537
    iput v2, p0, Lcom/a/a/a;->x:I

    .line 13
    return-void
.end method

.method private a(J)I
    .locals 19

    .prologue
    .line 461
    const/4 v3, 0x0

    .line 462
    const/16 v8, 0x64

    .line 467
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    .line 468
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeActualTimestampA(I)J

    move-result-wide v4

    .line 469
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeEncodeGetDurationV(I)J

    move-result-wide v6

    .line 470
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "fillAudioBuffer nativeEncodeGetDurationV = "

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ", lAudioDuration = "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v0, p1

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 473
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeGetAudioBufferSize(I)I

    move-result v2

    .line 474
    if-gtz v2, :cond_11

    .line 475
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->r:I

    mul-int/lit16 v2, v2, 0x400

    .line 476
    move-object/from16 v0, p0

    iget v6, v0, Lcom/a/a/a;->s:I

    invoke-static {v6}, Lcom/a/c/d;->a(I)I

    move-result v6

    .line 475
    mul-int/2addr v2, v6

    move v9, v2

    .line 478
    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/a;->t:[B

    if-nez v2, :cond_0

    .line 479
    new-array v2, v9, [B

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/a/a/a;->t:[B

    .line 482
    :cond_0
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeEncodeGetDurationA(I)J

    move-result-wide v12

    move v2, v3

    .line 483
    :goto_1
    cmp-long v3, v12, p1

    if-ltz v3, :cond_1

    .line 534
    :goto_2
    return v2

    .line 484
    :cond_1
    const-wide/16 v6, 0x0

    cmp-long v3, v12, v6

    if-gez v3, :cond_2

    .line 485
    sget-object v3, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 486
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "error happens for get current encoded audio duration : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 486
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 485
    invoke-static {v3, v4}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 490
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "fillAudioBuffer, lAEncodedDuration "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 491
    const-string v3, ", mEncodeDuration = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/a/a/a;->q:J

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 492
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/a/a/a;->q:J

    cmp-long v2, v2, v12

    if-lez v2, :cond_7

    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/a/a/a;->q:J

    .line 493
    sub-long/2addr v2, v12

    .line 494
    :goto_3
    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/a/a/a;->q:J

    const-wide/32 v10, 0x5b8d80

    cmp-long v6, v6, v10

    if-ltz v6, :cond_3

    const-wide/32 v6, 0x2dc6c0

    cmp-long v6, v2, v6

    if-gtz v6, :cond_3

    .line 495
    const-wide/16 v6, 0x7530

    div-long/2addr v2, v6

    long-to-int v8, v2

    .line 497
    :cond_3
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/a/a/a;->w:Z

    if-nez v2, :cond_8

    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    move-result v2

    if-nez v2, :cond_8

    const/16 v18, 0x0

    .line 498
    :goto_4
    if-nez v18, :cond_9

    .line 499
    move-object/from16 v0, p0

    iget v3, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/a/a/a;->t:[B

    .line 500
    const/4 v7, 0x0

    move-object/from16 v2, p0

    .line 499
    invoke-virtual/range {v2 .. v8}, Lcom/a/a/a;->nativeDecodeFrameA(IJ[BII)I

    move-result v3

    .line 502
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeGetAudioBufferSize(I)I

    move-result v16

    .line 514
    :goto_5
    if-nez v3, :cond_5

    .line 515
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "fillAudioBuffer, iABufferSize  = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 516
    const-string v3, ", ldecodedDuration = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 517
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/a/a/a;->t:[B

    .line 2668
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/a;->l:Lcom/a/b/a;

    if-eqz v2, :cond_d

    .line 2669
    new-instance v3, Lcom/a/c/a;

    invoke-direct {v3}, Lcom/a/c/a;-><init>()V

    .line 2670
    new-instance v6, Lcom/a/c/a;

    invoke-direct {v6}, Lcom/a/c/a;-><init>()V

    .line 2672
    const-wide/16 v10, 0x0

    iput-wide v10, v3, Lcom/a/c/a;->c:J

    .line 2673
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->n:I

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    iput v2, v0, Lcom/a/a/a;->n:I

    .line 2674
    const/4 v2, 0x0

    iput v2, v3, Lcom/a/c/a;->b:I

    .line 2675
    move/from16 v0, v16

    iput v0, v3, Lcom/a/c/a;->d:I

    .line 2676
    iput-wide v12, v3, Lcom/a/c/a;->c:J

    .line 2678
    const/4 v2, 0x0

    .line 2679
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 2680
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/a/a/a;->m:[B

    invoke-virtual {v7, v14, v3, v10, v6}, Lcom/a/b/a;->a([BLcom/a/c/a;[BLcom/a/c/a;)I

    move-result v3

    .line 2685
    iget v7, v6, Lcom/a/c/a;->d:I

    if-eqz v7, :cond_4

    .line 2686
    iget v2, v6, Lcom/a/c/a;->a:I

    const/4 v7, 0x2

    if-ne v2, v7, :cond_b

    .line 2687
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/a/a/a;->m:[B

    .line 2688
    iget v10, v6, Lcom/a/c/a;->b:I

    iget v6, v6, Lcom/a/c/a;->d:I

    .line 2687
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v7, v10, v6}, Lcom/a/a/a;->nativeAddExtraDataA(I[BII)I

    move-result v2

    .line 2697
    :cond_4
    :goto_6
    if-nez v3, :cond_c

    :goto_7
    move v3, v2

    .line 521
    :cond_5
    if-eqz v3, :cond_10

    .line 522
    if-nez v18, :cond_f

    .line 523
    move-object/from16 v0, p0

    iget v2, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    move-result v2

    if-nez v2, :cond_e

    const/4 v2, 0x0

    .line 525
    :goto_8
    if-nez v2, :cond_6

    .line 526
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Fill Audio Failed for :"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/a/a/a;->w:Z

    .line 529
    :cond_6
    const/4 v2, 0x0

    .line 531
    :goto_9
    move-object/from16 v0, p0

    iget v3, v0, Lcom/a/a/a;->c:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/a/a/a;->nativeEncodeGetDurationA(I)J

    move-result-wide v12

    goto/16 :goto_1

    .line 493
    :cond_7
    const-wide/16 v2, 0x0

    goto/16 :goto_3

    .line 497
    :cond_8
    const/16 v18, 0x1

    goto/16 :goto_4

    .line 506
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/a;->u:[B

    if-nez v2, :cond_a

    .line 507
    new-array v2, v9, [B

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/a/a/a;->u:[B

    .line 508
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/a/a/a;->t:[B

    .line 509
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/a/a/a;->u:[B

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/a/a/a;->t:[B

    .line 511
    :cond_a
    const/4 v3, 0x0

    move/from16 v16, v9

    goto/16 :goto_5

    .line 2691
    :cond_b
    move-object/from16 v0, p0

    iget v11, v0, Lcom/a/a/a;->c:I

    .line 2692
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/a/a/a;->m:[B

    iget v15, v6, Lcom/a/c/a;->b:I

    iget v0, v6, Lcom/a/c/a;->d:I

    move/from16 v16, v0

    iget v0, v6, Lcom/a/c/a;->a:I

    move/from16 v17, v0

    move-object/from16 v10, p0

    .line 2691
    invoke-virtual/range {v10 .. v17}, Lcom/a/a/a;->nativeAddCompressedFrameA(IJ[BIII)I

    move-result v2

    goto :goto_6

    :cond_c
    move v2, v3

    .line 2697
    goto :goto_7

    .line 2699
    :cond_d
    move-object/from16 v0, p0

    iget v11, v0, Lcom/a/a/a;->c:I

    const/4 v15, 0x0

    move-object/from16 v10, p0

    invoke-virtual/range {v10 .. v16}, Lcom/a/a/a;->nativeEncodeBufferA(IJ[BII)I

    move-result v2

    goto/16 :goto_7

    .line 523
    :cond_e
    const/4 v2, 0x1

    goto :goto_8

    :cond_f
    move/from16 v2, v18

    goto :goto_8

    :cond_10
    move v2, v3

    goto :goto_9

    :cond_11
    move v9, v2

    goto/16 :goto_0
.end method

.method private b(Landroid/graphics/Bitmap;Z)I
    .locals 13

    .prologue
    const/4 v10, 0x1

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    .line 600
    .line 601
    cmp-long v0, v2, v2

    if-nez v0, :cond_2

    iget v0, p0, Lcom/a/a/a;->k:I

    int-to-double v0, v0

    iget-wide v6, p0, Lcom/a/a/a;->o:D

    div-double/2addr v0, v6

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v6

    double-to-long v0, v0

    move-wide v8, v0

    .line 605
    :goto_0
    iget v0, p0, Lcom/a/a/a;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/a/a/a;->k:I

    .line 606
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "encode Video Frame Count = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/a/a/a;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lCurrentVideoTimeStam = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 607
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    if-eqz v0, :cond_6

    .line 608
    iget v0, p0, Lcom/a/a/a;->j:I

    packed-switch v0, :pswitch_data_0

    .line 618
    :goto_1
    new-instance v1, Lcom/a/c/a;

    invoke-direct {v1}, Lcom/a/c/a;-><init>()V

    .line 619
    new-instance v7, Lcom/a/c/a;

    invoke-direct {v7}, Lcom/a/c/a;-><init>()V

    .line 622
    iput-wide v8, v1, Lcom/a/c/a;->c:J

    .line 624
    iput v5, v1, Lcom/a/c/a;->b:I

    .line 625
    iget v0, p0, Lcom/a/a/a;->g:I

    iget v2, p0, Lcom/a/a/a;->g:I

    shr-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    iput v0, v1, Lcom/a/c/a;->d:I

    .line 626
    if-eqz p2, :cond_3

    move v0, v10

    :goto_2
    iput v0, v1, Lcom/a/c/a;->a:I

    .line 628
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    iget-object v2, p0, Lcom/a/a/a;->e:[B

    iget-object v3, p0, Lcom/a/a/a;->f:[B

    invoke-virtual {v0, v2, v1, v3, v7}, Lcom/a/b/a;->a([BLcom/a/c/a;[BLcom/a/c/a;)I

    move-result v11

    .line 630
    const/4 v0, -0x1

    if-ne v11, v0, :cond_0

    .line 631
    sget-object v0, Lcom/a/a/a;->a:Ljava/lang/String;

    const-string v1, "can\'t allocate input buffer now, try later"

    invoke-static {v0, v1}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    :cond_0
    iget v0, v7, Lcom/a/c/a;->d:I

    if-eqz v0, :cond_8

    .line 634
    iget v0, v7, Lcom/a/c/a;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 635
    iget v0, p0, Lcom/a/a/a;->c:I

    iget-object v1, p0, Lcom/a/a/a;->f:[B

    .line 636
    iget v2, v7, Lcom/a/c/a;->b:I

    iget v3, v7, Lcom/a/c/a;->d:I

    .line 635
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/a/a/a;->nativeAddExtraDataV(I[BII)I

    move-result v1

    .line 637
    invoke-direct {p0}, Lcom/a/a/a;->e()I

    move v10, v5

    .line 648
    :goto_3
    if-nez v11, :cond_5

    move v0, v1

    :goto_4
    move v12, v1

    move v1, v0

    move v0, v12

    .line 653
    :goto_5
    if-nez v1, :cond_1

    if-eqz v10, :cond_1

    .line 654
    invoke-direct {p0, v8, v9}, Lcom/a/a/a;->a(J)I

    move-result v0

    .line 656
    :cond_1
    if-nez v1, :cond_7

    :goto_6
    return v0

    :cond_2
    move-wide v8, v2

    .line 602
    goto :goto_0

    .line 612
    :pswitch_0
    iget-object v0, p0, Lcom/a/a/a;->e:[B

    iget v1, p0, Lcom/a/a/a;->j:I

    .line 2707
    iget v2, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v2, p1, v0, v1}, Lcom/a/a/a;->nativeRgbaBitmapToYuv(ILandroid/graphics/Bitmap;[BI)I

    goto :goto_1

    :cond_3
    move v0, v5

    .line 626
    goto :goto_2

    .line 639
    :cond_4
    iget v0, p0, Lcom/a/a/a;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/a/a/a;->x:I

    .line 640
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add compressed Video Frame Count = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    iget v1, p0, Lcom/a/a/a;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 642
    iget v1, p0, Lcom/a/a/a;->c:I

    iget-wide v2, v7, Lcom/a/c/a;->c:J

    .line 643
    iget-object v4, p0, Lcom/a/a/a;->f:[B

    iget v5, v7, Lcom/a/c/a;->b:I

    iget v6, v7, Lcom/a/c/a;->d:I

    iget v7, v7, Lcom/a/c/a;->a:I

    move-object v0, p0

    .line 642
    invoke-virtual/range {v0 .. v7}, Lcom/a/a/a;->nativeAddCompressedFrameV(IJ[BIII)I

    move-result v1

    goto :goto_3

    :cond_5
    move v0, v11

    .line 648
    goto :goto_4

    .line 650
    :cond_6
    iget v1, p0, Lcom/a/a/a;->c:I

    move-object v0, p0

    move-object v4, p1

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lcom/a/a/a;->nativeEncodeFrameV(IJLandroid/graphics/Bitmap;ZZ)I

    move-result v1

    move v0, v5

    .line 651
    goto :goto_5

    :cond_7
    move v0, v1

    .line 656
    goto :goto_6

    :cond_8
    move v10, v5

    move v1, v5

    goto :goto_3

    .line 608
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 55
    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v0

    return v0
.end method

.method private e()I
    .locals 12

    .prologue
    const-wide/16 v2, 0x0

    const/4 v9, 0x1

    const/4 v8, -0x1

    const/4 v5, 0x0

    .line 540
    iget-object v0, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    if-nez v0, :cond_1

    move v5, v8

    .line 595
    :cond_0
    return v5

    .line 546
    :cond_1
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    .line 547
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0}, Lcom/a/a/a;->nativeDecodeGetAudioBufferSize(I)I

    move-result v0

    .line 548
    if-gtz v0, :cond_a

    .line 549
    iget v0, p0, Lcom/a/a/a;->r:I

    mul-int/lit16 v0, v0, 0x400

    .line 550
    iget v1, p0, Lcom/a/a/a;->s:I

    invoke-static {v1}, Lcom/a/c/d;->a(I)I

    move-result v1

    .line 549
    mul-int/2addr v0, v1

    move v7, v0

    .line 552
    :goto_0
    iget-object v0, p0, Lcom/a/a/a;->t:[B

    if-nez v0, :cond_9

    .line 553
    new-array v0, v7, [B

    iput-object v0, p0, Lcom/a/a/a;->t:[B

    move v10, v5

    move v0, v5

    .line 555
    :cond_2
    :goto_1
    if-nez v10, :cond_0

    .line 556
    iget v1, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v1}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    move-result v1

    if-nez v1, :cond_5

    move v1, v5

    .line 557
    :goto_2
    if-nez v1, :cond_6

    .line 558
    iget v1, p0, Lcom/a/a/a;->c:I

    iget-object v4, p0, Lcom/a/a/a;->t:[B

    .line 559
    const/16 v6, 0x64

    move-object v0, p0

    .line 558
    invoke-virtual/range {v0 .. v6}, Lcom/a/a/a;->nativeDecodeFrameA(IJ[BII)I

    move-result v1

    .line 560
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0}, Lcom/a/a/a;->nativeDecodeGetAudioBufferSize(I)I

    move-result v0

    .line 571
    :goto_3
    if-nez v1, :cond_8

    .line 572
    new-instance v1, Lcom/a/c/a;

    invoke-direct {v1}, Lcom/a/c/a;-><init>()V

    .line 573
    new-instance v4, Lcom/a/c/a;

    invoke-direct {v4}, Lcom/a/c/a;-><init>()V

    .line 574
    iget v6, p0, Lcom/a/a/a;->n:I

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lcom/a/a/a;->n:I

    .line 575
    iput v5, v1, Lcom/a/c/a;->b:I

    .line 576
    iput v0, v1, Lcom/a/c/a;->d:I

    .line 577
    iput-wide v2, v1, Lcom/a/c/a;->c:J

    .line 578
    iget-object v0, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 579
    iget-object v6, p0, Lcom/a/a/a;->t:[B

    iget-object v11, p0, Lcom/a/a/a;->m:[B

    invoke-virtual {v0, v6, v1, v11, v4}, Lcom/a/b/a;->a([BLcom/a/c/a;[BLcom/a/c/a;)I

    move-result v0

    .line 581
    if-ne v0, v8, :cond_3

    .line 582
    sget-object v1, Lcom/a/a/a;->a:Ljava/lang/String;

    const-string v6, "can\'t allocate input buffer now, try later"

    invoke-static {v1, v6}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    :cond_3
    iget v1, v4, Lcom/a/c/a;->d:I

    if-eqz v1, :cond_2

    .line 585
    iget v1, v4, Lcom/a/c/a;->a:I

    const/4 v6, 0x2

    if-ne v1, v6, :cond_4

    .line 586
    iget v0, p0, Lcom/a/a/a;->c:I

    iget-object v1, p0, Lcom/a/a/a;->m:[B

    .line 587
    iget v6, v4, Lcom/a/c/a;->b:I

    iget v4, v4, Lcom/a/c/a;->d:I

    .line 586
    invoke-virtual {p0, v0, v1, v6, v4}, Lcom/a/a/a;->nativeAddExtraDataA(I[BII)I

    move-result v0

    :cond_4
    move v10, v9

    .line 590
    goto :goto_1

    :cond_5
    move v1, v9

    .line 556
    goto :goto_2

    .line 564
    :cond_6
    iget-object v1, p0, Lcom/a/a/a;->u:[B

    if-nez v1, :cond_7

    .line 565
    new-array v1, v7, [B

    iput-object v1, p0, Lcom/a/a/a;->u:[B

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/a/a/a;->t:[B

    .line 567
    iget-object v1, p0, Lcom/a/a/a;->u:[B

    iput-object v1, p0, Lcom/a/a/a;->t:[B

    :cond_7
    move v1, v0

    move v0, v7

    goto :goto_3

    :cond_8
    move v0, v1

    goto :goto_1

    :cond_9
    move v10, v5

    move v0, v5

    goto :goto_1

    :cond_a
    move v7, v0

    goto/16 :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/a/a/a;->c:I

    if-eqz v0, :cond_0

    .line 42
    const/4 v0, 0x1

    .line 51
    :goto_0
    return v0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/a/a/a;->nativeInit()I

    move-result v0

    iput v0, p0, Lcom/a/a/a;->c:I

    .line 46
    iget v0, p0, Lcom/a/a/a;->c:I

    if-nez v0, :cond_1

    .line 48
    const/16 v0, 0x9

    goto :goto_0

    .line 51
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(II)I
    .locals 1

    .prologue
    .line 374
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0, p1, p2}, Lcom/a/a/a;->nativeEncodeSetResolution(III)I

    move-result v0

    return v0
.end method

.method public final a(Landroid/graphics/Bitmap;)I
    .locals 1

    .prologue
    .line 447
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;Z)I

    move-result v0

    return v0
.end method

.method public final a(Landroid/graphics/Bitmap;Z)I
    .locals 1

    .prologue
    .line 451
    invoke-direct {p0, p1, p2}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;Z)I

    move-result v0

    return v0
.end method

.method public final a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0, p1}, Lcom/a/a/a;->nativeSetDecodeFrom(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;JIIDIJ)I
    .locals 9

    .prologue
    .line 175
    iget v2, p0, Lcom/a/a/a;->c:I

    if-eqz v2, :cond_1

    .line 176
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    const-string v3, "Did you forget to END the former AMF case?"

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v2, 0x1

    .line 290
    :cond_0
    :goto_0
    return v2

    .line 180
    :cond_1
    if-lez p5, :cond_2

    if-lez p6, :cond_2

    rem-int/lit8 v2, p5, 0x10

    if-eqz v2, :cond_3

    .line 182
    :cond_2
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 183
    const-string v3, "Width or Height is not available, please make sure the values are larger than 0 and width can be divided by 16."

    .line 181
    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const/4 v2, 0x3

    goto :goto_0

    .line 187
    :cond_3
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v2, p7, v2

    if-gtz v2, :cond_4

    const-wide/16 v2, 0x0

    cmpg-double v2, p7, v2

    if-gez v2, :cond_5

    .line 188
    :cond_4
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 189
    const-string v3, "FPS is not available, please make sure the FPS is in range of [0 - 100]."

    .line 188
    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const/4 v2, 0x4

    goto :goto_0

    .line 193
    :cond_5
    const/16 v2, 0x64

    move/from16 v0, p9

    if-gt v0, v2, :cond_6

    if-gez p9, :cond_7

    .line 195
    :cond_6
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 196
    const-string v3, "Video quality is not available, please make sure the it\'s in range of [0 - 100]."

    .line 194
    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const/4 v2, 0x5

    goto :goto_0

    .line 200
    :cond_7
    if-nez p1, :cond_8

    .line 204
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 205
    const-string v3, "FILE NAME is not available, please check the name and your application permission first"

    .line 203
    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const/4 v2, 0x6

    goto :goto_0

    .line 209
    :cond_8
    const-wide/16 v2, 0x0

    cmp-long v2, p3, v2

    if-gez v2, :cond_9

    .line 210
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    const-string v3, "Cannot start before 0..."

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const/4 v2, 0x7

    goto :goto_0

    .line 213
    :cond_9
    const-wide/16 v2, 0x0

    cmp-long v2, p10, v2

    if-gtz v2, :cond_a

    .line 214
    const/16 v2, 0x8

    goto :goto_0

    .line 217
    :cond_a
    if-eqz p2, :cond_b

    .line 226
    const-wide/32 v2, 0x30d40

    cmp-long v2, p10, v2

    if-gez v2, :cond_b

    .line 228
    sget-object v2, Lcom/a/a/a;->a:Ljava/lang/String;

    .line 229
    const-string v3, "When recording audio at the same time, the Duration must be  larger than 200000 (0.2S)."

    .line 227
    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    const/16 v2, 0x8

    goto :goto_0

    .line 234
    :cond_b
    invoke-virtual {p0}, Lcom/a/a/a;->nativeInit()I

    move-result v2

    iput v2, p0, Lcom/a/a/a;->c:I

    .line 235
    iget v2, p0, Lcom/a/a/a;->c:I

    if-nez v2, :cond_c

    .line 237
    const/16 v2, 0x9

    goto :goto_0

    .line 240
    :cond_c
    iget v2, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v2, p3, p4}, Lcom/a/a/a;->nativeSetAudioStartFrom(IJ)I

    move-result v2

    .line 241
    if-nez v2, :cond_0

    .line 244
    iput-wide p3, p0, Lcom/a/a/a;->p:J

    .line 246
    iget v2, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v2, p5, p6}, Lcom/a/a/a;->nativeEncodeSetResolution(III)I

    move-result v2

    .line 247
    if-nez v2, :cond_0

    .line 251
    iget v2, p0, Lcom/a/a/a;->c:I

    move-wide/from16 v0, p7

    invoke-virtual {p0, v2, v0, v1}, Lcom/a/a/a;->nativeEncodeSetFps(ID)I

    move-result v2

    .line 252
    if-nez v2, :cond_0

    .line 256
    iget v2, p0, Lcom/a/a/a;->c:I

    move/from16 v0, p9

    invoke-virtual {p0, v2, v0}, Lcom/a/a/a;->nativeEncodeSetVideoQuality(II)I

    move-result v2

    .line 257
    if-nez v2, :cond_0

    .line 261
    iget v2, p0, Lcom/a/a/a;->c:I

    move-wide/from16 v0, p10

    invoke-virtual {p0, v2, v0, v1}, Lcom/a/a/a;->nativeSetEncodeDuration(IJ)I

    move-result v2

    .line 263
    if-nez v2, :cond_0

    .line 266
    move-wide/from16 v0, p10

    iput-wide v0, p0, Lcom/a/a/a;->q:J

    .line 268
    iget v2, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v2, p1}, Lcom/a/a/a;->nativeSetEncodeTo(ILjava/lang/String;)I

    move-result v2

    .line 269
    if-eqz v2, :cond_d

    .line 270
    const/16 v2, 0xb

    goto/16 :goto_0

    .line 273
    :cond_d
    if-eqz p2, :cond_e

    .line 274
    iget v2, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v2, p2}, Lcom/a/a/a;->nativeSetDecodeFrom(ILjava/lang/String;)I

    move-result v2

    .line 275
    if-nez v2, :cond_0

    .line 279
    :cond_e
    iget-boolean v3, p0, Lcom/a/a/a;->h:Z

    if-eqz v3, :cond_14

    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 282
    int-to-double v4, p5

    int-to-double v6, p6

    mul-double/2addr v4, v6

    .line 283
    mul-double v4, v4, p7

    move/from16 v0, p9

    int-to-double v6, v0

    div-double/2addr v4, v6

    const-wide/high16 v6, 0x4032000000000000L    # 18.0

    mul-double/2addr v4, v6

    move/from16 v0, p9

    int-to-double v6, v0

    div-double/2addr v4, v6

    const-wide/high16 v6, 0x4060000000000000L    # 128.0

    mul-double/2addr v4, v6

    move/from16 v0, p9

    int-to-double v6, v0

    div-double/2addr v4, v6

    double-to-int v3, v4

    .line 1124
    iget-object v4, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    if-nez v4, :cond_12

    .line 1127
    new-instance v5, Lcom/a/c/c;

    invoke-direct {v5}, Lcom/a/c/c;-><init>()V

    .line 1128
    iput v3, v5, Lcom/a/c/c;->d:I

    .line 1129
    move-wide/from16 v0, p7

    double-to-int v3, v0

    iput v3, v5, Lcom/a/c/c;->e:I

    .line 1130
    iput p5, v5, Lcom/a/c/c;->b:I

    .line 1131
    iput p6, v5, Lcom/a/c/c;->c:I

    .line 1132
    const-string v3, "video/avc"

    iput-object v3, v5, Lcom/a/c/c;->a:Ljava/lang/String;

    .line 1133
    iget-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    if-nez v3, :cond_10

    .line 1134
    new-instance v3, Lcom/a/b/a;

    invoke-direct {v3}, Lcom/a/b/a;-><init>()V

    iput-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    .line 1135
    iget-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    .line 1136
    iget-object v4, v5, Lcom/a/c/c;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/a/b/a;->a(Ljava/lang/String;)[I

    move-result-object v6

    .line 2069
    if-eqz v6, :cond_f

    array-length v3, v6

    if-nez v3, :cond_15

    .line 2070
    :cond_f
    const/4 v3, 0x0

    .line 1135
    :goto_1
    iput v3, v5, Lcom/a/c/c;->f:I

    .line 1139
    :cond_10
    iget v3, v5, Lcom/a/c/c;->f:I

    if-eqz v3, :cond_11

    .line 1140
    iget-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    invoke-virtual {v3, v5}, Lcom/a/b/a;->a(Lcom/a/c/c;)Z

    move-result v3

    if-nez v3, :cond_19

    .line 1141
    :cond_11
    iget-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    invoke-virtual {v3}, Lcom/a/b/a;->a()V

    .line 1142
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    .line 2092
    :cond_12
    :goto_2
    iget-object v3, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    if-nez v3, :cond_14

    .line 2094
    new-instance v3, Lcom/a/c/c;

    invoke-direct {v3}, Lcom/a/c/c;-><init>()V

    .line 2095
    const v4, 0xfa00

    iput v4, v3, Lcom/a/c/c;->d:I

    .line 2096
    const/4 v4, 0x2

    iput v4, v3, Lcom/a/c/c;->g:I

    .line 2097
    const v4, 0xbb80

    iput v4, v3, Lcom/a/c/c;->h:I

    .line 2098
    const-string v4, "audio/mp4a-latm"

    iput-object v4, v3, Lcom/a/c/c;->a:Ljava/lang/String;

    .line 2099
    const/4 v4, 0x0

    iput v4, p0, Lcom/a/a/a;->n:I

    .line 2100
    iget-object v4, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    if-nez v4, :cond_13

    .line 2101
    new-instance v4, Lcom/a/b/a;

    invoke-direct {v4}, Lcom/a/b/a;-><init>()V

    iput-object v4, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 2102
    :cond_13
    iget-object v4, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    invoke-virtual {v4, v3}, Lcom/a/b/a;->a(Lcom/a/c/c;)Z

    move-result v3

    if-nez v3, :cond_1a

    .line 2103
    iget-object v3, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    invoke-virtual {v3}, Lcom/a/b/a;->a()V

    .line 2104
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 286
    :cond_14
    :goto_3
    const/4 v3, 0x0

    iput v3, p0, Lcom/a/a/a;->k:I

    .line 287
    move-wide/from16 v0, p7

    iput-wide v0, p0, Lcom/a/a/a;->o:D

    .line 288
    const/4 v3, 0x2

    iput v3, p0, Lcom/a/a/a;->r:I

    .line 289
    const/4 v3, 0x0

    iput v3, p0, Lcom/a/a/a;->s:I

    goto/16 :goto_0

    .line 2071
    :cond_15
    const/4 v4, 0x0

    .line 2072
    const/4 v3, 0x0

    :goto_4
    array-length v7, v6

    if-lt v3, v7, :cond_16

    move v3, v4

    goto :goto_1

    .line 2073
    :cond_16
    aget v7, v6, v3

    const/16 v8, 0x13

    if-ne v7, v8, :cond_17

    .line 2074
    aget v3, v6, v3

    goto :goto_1

    .line 2077
    :cond_17
    aget v7, v6, v3

    const/16 v8, 0x15

    if-ne v7, v8, :cond_18

    .line 2078
    aget v3, v6, v3

    goto :goto_1

    .line 2072
    :cond_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 1146
    :cond_19
    mul-int v3, p5, p6

    iput v3, p0, Lcom/a/a/a;->g:I

    .line 1147
    iget v3, v5, Lcom/a/c/c;->f:I

    iput v3, p0, Lcom/a/a/a;->i:I

    .line 1148
    iget v3, p0, Lcom/a/a/a;->i:I

    invoke-static {v3}, Lcom/a/c/d;->b(I)I

    move-result v3

    iput v3, p0, Lcom/a/a/a;->j:I

    .line 1152
    iget v3, p0, Lcom/a/a/a;->g:I

    iget v4, p0, Lcom/a/a/a;->g:I

    shr-int/lit8 v4, v4, 0x1

    add-int/2addr v3, v4

    new-array v3, v3, [B

    iput-object v3, p0, Lcom/a/a/a;->e:[B

    .line 1154
    iget v3, p0, Lcom/a/a/a;->g:I

    add-int/lit8 v3, v3, 0x20

    new-array v3, v3, [B

    iput-object v3, p0, Lcom/a/a/a;->f:[B

    goto/16 :goto_2

    .line 2108
    :cond_1a
    const/16 v3, 0x400

    new-array v3, v3, [B

    iput-object v3, p0, Lcom/a/a/a;->m:[B

    goto :goto_3
.end method

.method public final a([BII)I
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 397
    iget v0, p0, Lcom/a/a/a;->c:I

    if-nez v0, :cond_0

    .line 398
    const/4 v0, 0x2

    .line 401
    :goto_0
    return v0

    :cond_0
    iget v1, p0, Lcom/a/a/a;->c:I

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-object v4, p1

    move v6, p2

    move v7, p3

    move v8, v5

    invoke-virtual/range {v0 .. v8}, Lcom/a/a/a;->nativeDecodeFrameV(IJ[BIIII)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 59
    iput-boolean p1, p0, Lcom/a/a/a;->h:Z

    .line 60
    return-void
.end method

.method public final b(Z)V
    .locals 13

    .prologue
    const/4 v12, -0x1

    const/4 v11, 0x0

    const/4 v10, 0x0

    .line 776
    iget v0, p0, Lcom/a/a/a;->c:I

    if-eqz v0, :cond_6

    .line 777
    if-nez p1, :cond_3

    .line 2716
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    if-eqz v0, :cond_2

    .line 2717
    new-instance v8, Lcom/a/c/a;

    invoke-direct {v8}, Lcom/a/c/a;-><init>()V

    .line 2718
    iput v11, v8, Lcom/a/c/a;->d:I

    .line 2719
    iput v12, v8, Lcom/a/c/a;->a:I

    .line 2720
    new-instance v9, Lcom/a/c/a;

    invoke-direct {v9}, Lcom/a/c/a;-><init>()V

    .line 2723
    :cond_0
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    iget-object v1, p0, Lcom/a/a/a;->f:[B

    invoke-virtual {v0, v10, v8, v1, v9}, Lcom/a/b/a;->a([BLcom/a/c/a;[BLcom/a/c/a;)I

    .line 2724
    iget v0, v9, Lcom/a/c/a;->d:I

    if-eqz v0, :cond_1

    .line 2725
    iget v0, v9, Lcom/a/c/a;->a:I

    if-eq v0, v12, :cond_1

    .line 2726
    iget v0, v9, Lcom/a/c/a;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 2727
    iget v0, p0, Lcom/a/a/a;->c:I

    iget-object v1, p0, Lcom/a/a/a;->f:[B

    .line 2728
    iget v2, v9, Lcom/a/c/a;->b:I

    iget v3, v9, Lcom/a/c/a;->d:I

    .line 2727
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/a/a/a;->nativeAddExtraDataV(I[BII)I

    move-result v0

    .line 2735
    :goto_0
    if-nez v0, :cond_2

    .line 2739
    :cond_1
    iget v0, v9, Lcom/a/c/a;->a:I

    if-ne v0, v12, :cond_0

    .line 2740
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "outputAllBufferedVFrame in, Input Video Count = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2741
    iget v1, p0, Lcom/a/a/a;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Output Video Count = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2742
    iget v1, p0, Lcom/a/a/a;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 779
    :cond_2
    iget-wide v0, p0, Lcom/a/a/a;->q:J

    invoke-direct {p0, v0, v1}, Lcom/a/a/a;->a(J)I

    .line 781
    :cond_3
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0}, Lcom/a/a/a;->nativeRelease(I)V

    .line 3159
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    if-eqz v0, :cond_4

    .line 3161
    iget-object v0, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    invoke-virtual {v0}, Lcom/a/b/a;->a()V

    .line 3162
    iput-object v10, p0, Lcom/a/a/a;->d:Lcom/a/b/a;

    .line 3164
    iput-object v10, p0, Lcom/a/a/a;->e:[B

    .line 3165
    iput-object v10, p0, Lcom/a/a/a;->f:[B

    .line 3166
    iput v11, p0, Lcom/a/a/a;->k:I

    .line 3167
    iput v11, p0, Lcom/a/a/a;->g:I

    .line 4114
    :cond_4
    iget-object v0, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    if-eqz v0, :cond_5

    .line 4116
    iget-object v0, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    invoke-virtual {v0}, Lcom/a/b/a;->a()V

    .line 4117
    iput-object v10, p0, Lcom/a/a/a;->l:Lcom/a/b/a;

    .line 4118
    iput v11, p0, Lcom/a/a/a;->n:I

    .line 4119
    iput-object v10, p0, Lcom/a/a/a;->m:[B

    .line 784
    :cond_5
    iput v11, p0, Lcom/a/a/a;->c:I

    .line 786
    :cond_6
    return-void

    .line 2730
    :cond_7
    iget v0, p0, Lcom/a/a/a;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/a/a/a;->x:I

    .line 2731
    iget v1, p0, Lcom/a/a/a;->c:I

    .line 2732
    iget-wide v2, v9, Lcom/a/c/a;->c:J

    iget-object v4, p0, Lcom/a/a/a;->f:[B

    iget v5, v9, Lcom/a/c/a;->b:I

    .line 2733
    iget v6, v9, Lcom/a/c/a;->d:I

    iget v7, v9, Lcom/a/c/a;->a:I

    move-object v0, p0

    .line 2731
    invoke-virtual/range {v0 .. v7}, Lcom/a/a/a;->nativeAddCompressedFrameV(IJ[BIII)I

    move-result v0

    goto :goto_0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 415
    iget v0, p0, Lcom/a/a/a;->c:I

    if-nez v0, :cond_0

    .line 416
    const-wide/16 v0, 0x2

    .line 419
    :goto_0
    return-wide v0

    :cond_0
    iget v0, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v0}, Lcom/a/a/a;->nativeDecodeActualTimestampV(I)J

    move-result-wide v0

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 431
    iget v1, p0, Lcom/a/a/a;->c:I

    if-nez v1, :cond_1

    .line 435
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/a/a/a;->c:I

    invoke-virtual {p0, v1}, Lcom/a/a/a;->nativeDecodeEoF(I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method
