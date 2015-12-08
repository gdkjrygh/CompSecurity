.class public final Lkik/android/net/a/c;
.super Lkik/android/net/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/net/a/c$a;
    }
.end annotation


# static fields
.field private static final B:Lorg/c/b;


# instance fields
.field private A:I

.field private C:Ljava/lang/String;

.field private D:Lcom/kik/android/a;

.field private E:Lkik/a/f/k;

.field private F:Lkik/a/e/n;

.field private G:Lkik/a/e/v;

.field private H:Lkik/a/e/i;

.field private I:Lkik/a/e/t;

.field private J:Lcom/kik/g/p;

.field private K:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:[B

.field private final j:Z

.field private k:Lkik/a/d/a/a;

.field private l:Ljava/util/ArrayList;

.field private m:J

.field private n:Ljava/io/File;

.field private o:Ljava/lang/String;

.field private p:J

.field private q:I

.field private r:Lkik/android/e/e$a;

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:J

.field private y:I

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 84
    const-string v0, "ContentUploadItem"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/a/c;->B:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V
    .locals 12

    .prologue
    .line 102
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;ZLkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    .line 103
    return-void
.end method

.method public constructor <init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;ZLkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 106
    invoke-direct {p0}, Lkik/android/net/a/b;-><init>()V

    .line 67
    iput v0, p0, Lkik/android/net/a/c;->q:I

    .line 70
    const/16 v1, -0x190

    iput v1, p0, Lkik/android/net/a/c;->s:I

    .line 71
    const/16 v1, -0x1f4

    iput v1, p0, Lkik/android/net/a/c;->t:I

    .line 72
    const/16 v1, -0x258

    iput v1, p0, Lkik/android/net/a/c;->u:I

    .line 73
    const/16 v1, -0x2bc

    iput v1, p0, Lkik/android/net/a/c;->v:I

    .line 74
    const/16 v1, -0x320

    iput v1, p0, Lkik/android/net/a/c;->w:I

    .line 76
    const-wide/32 v2, 0x96000

    iput-wide v2, p0, Lkik/android/net/a/c;->x:J

    .line 78
    iput v0, p0, Lkik/android/net/a/c;->y:I

    .line 80
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkik/android/net/a/c;->z:J

    .line 82
    iput v0, p0, Lkik/android/net/a/c;->A:I

    .line 97
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    iput-object v1, p0, Lkik/android/net/a/c;->J:Lcom/kik/g/p;

    .line 98
    sget v1, Lkik/android/net/a/c$a;->a:I

    iput v1, p0, Lkik/android/net/a/c;->K:I

    .line 107
    iput-object p5, p0, Lkik/android/net/a/c;->D:Lcom/kik/android/a;

    .line 108
    iput-object p1, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    .line 109
    iput-boolean p6, p0, Lkik/android/net/a/c;->j:Z

    .line 110
    iput-object p8, p0, Lkik/android/net/a/c;->F:Lkik/a/e/n;

    .line 111
    iput-object p7, p0, Lkik/android/net/a/c;->E:Lkik/a/f/k;

    .line 112
    iput-object p9, p0, Lkik/android/net/a/c;->G:Lkik/a/e/v;

    .line 113
    iput-object p11, p0, Lkik/android/net/a/c;->I:Lkik/a/e/t;

    .line 114
    iput-object p10, p0, Lkik/android/net/a/c;->H:Lkik/a/e/i;

    .line 117
    const-string v1, "int-chunk-progress"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 121
    :cond_0
    int-to-long v0, v0

    iput-wide v0, p0, Lkik/android/net/a/c;->z:J

    .line 123
    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    .line 124
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    .line 125
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    .line 126
    const-string v0, "file-name"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    .line 127
    const-string v0, "file-content-type"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/c;->e:Ljava/lang/String;

    .line 129
    iput-object p4, p0, Lkik/android/net/a/c;->i:[B

    .line 132
    iput-object p2, p0, Lkik/android/net/a/c;->f:Ljava/lang/String;

    .line 133
    iput-object p3, p0, Lkik/android/net/a/c;->g:Ljava/lang/String;

    .line 135
    const-string v0, "app-pkg"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 136
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    iput-object v0, p0, Lkik/android/net/a/c;->h:Ljava/lang/String;

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/net/a/c;->l:Ljava/util/ArrayList;

    .line 139
    invoke-direct {p0}, Lkik/android/net/a/c;->n()V

    .line 140
    return-void
.end method

.method static synthetic a(Lkik/android/net/a/c;I)I
    .locals 0

    .prologue
    .line 49
    iput p1, p0, Lkik/android/net/a/c;->K:I

    return p1
.end method

.method static synthetic a(Lkik/android/net/a/c;Ljava/io/File;)Ljava/io/File;
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/a/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    return-object p1
.end method

.method private static a(Lkik/android/net/a/h;JJ)Ljava/lang/String;
    .locals 9

    .prologue
    const/16 v1, 0x1000

    .line 553
    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 559
    new-array v3, v1, [B

    .line 563
    invoke-interface {p0, p1, p2}, Lkik/android/net/a/h;->a(J)V

    .line 565
    :goto_0
    cmp-long v0, p1, p3

    if-gez v0, :cond_0

    .line 567
    sub-long v4, p3, p1

    const-wide/16 v6, 0x1000

    cmp-long v0, v4, v6

    if-gez v0, :cond_1

    .line 568
    sub-long v4, p3, p1

    long-to-int v0, v4

    .line 571
    :goto_1
    invoke-interface {p0, v3, v0}, Lkik/android/net/a/h;->a([BI)I

    move-result v0

    .line 573
    if-ltz v0, :cond_0

    .line 574
    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v0}, Ljava/security/MessageDigest;->update([BII)V

    .line 578
    int-to-long v4, v0

    add-long/2addr p1, v4

    .line 579
    goto :goto_0

    .line 556
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no md5?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 581
    :cond_0
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/net/a/c;)Z
    .locals 2

    .prologue
    .line 49
    invoke-direct {p0}, Lkik/android/net/a/c;->o()Lkik/a/d/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/net/a/c;->G:Lkik/a/e/v;

    invoke-interface {v1, v0}, Lkik/a/e/v;->c(Lkik/a/d/s;)Z

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/net/a/c;)Ljava/io/File;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    return-object v0
.end method

.method static synthetic c(Lkik/android/net/a/c;)Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    return-object v0
.end method

.method static synthetic d(Lkik/android/net/a/c;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/net/a/c;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d(I)Z
    .locals 5

    .prologue
    .line 668
    iget-object v0, p0, Lkik/android/net/a/c;->f:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/net/a/c;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 669
    iget-object v0, p0, Lkik/android/net/a/c;->H:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/net/a/c;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    .line 670
    if-eqz v0, :cond_2

    .line 673
    iget-object v1, p0, Lkik/android/net/a/c;->g:Ljava/lang/String;

    const-string v2, "int-file-state"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/net/a/c;->G:Lkik/a/e/v;

    invoke-virtual {v0, v1, v2, v3, v4}, Lkik/a/d/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkik/a/e/v;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 674
    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    const-string v1, "int-file-state"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    :cond_0
    iget-object v0, p0, Lkik/android/net/a/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 677
    const-string v2, "int-file-state"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 679
    :cond_1
    const/4 v0, 0x1

    .line 682
    :goto_1
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic e(Lkik/android/net/a/c;)I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lkik/android/net/a/c;->A:I

    return v0
.end method

.method private n()V
    .locals 4

    .prologue
    .line 165
    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    invoke-direct {p0}, Lkik/android/net/a/c;->o()Lkik/a/d/s;

    move-result-object v0

    .line 168
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v1, -0x64

    if-ne v0, v1, :cond_1

    .line 242
    :cond_0
    :goto_0
    return-void

    .line 172
    :cond_1
    sget v0, Lkik/android/net/a/c$a;->b:I

    iput v0, p0, Lkik/android/net/a/c;->K:I

    .line 173
    invoke-static {}, Lkik/android/i/i;->a()Lkik/android/i/i;

    move-result-object v0

    .line 174
    iget-object v1, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/ak;->b(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v3}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/i/i;->a(Ljava/lang/String;ILjava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 175
    new-instance v1, Lkik/android/net/a/d;

    invoke-direct {v1, p0}, Lkik/android/net/a/d;-><init>(Lkik/android/net/a/c;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 240
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/net/a/c;->A:I

    goto :goto_0
.end method

.method private o()Lkik/a/d/s;
    .locals 2

    .prologue
    .line 697
    iget-object v0, p0, Lkik/android/net/a/c;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/net/a/c;->H:Lkik/a/e/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/net/a/c;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 698
    iget-object v0, p0, Lkik/android/net/a/c;->H:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/net/a/c;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    .line 699
    if-eqz v0, :cond_0

    .line 700
    iget-object v1, p0, Lkik/android/net/a/c;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/a/d/f;->a(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v0

    .line 703
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 603
    iget v1, p0, Lkik/android/net/a/c;->A:I

    if-nez v1, :cond_0

    .line 609
    :goto_0
    return v0

    .line 607
    :cond_0
    iget-wide v2, p0, Lkik/android/net/a/c;->p:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-nez v1, :cond_1

    .line 608
    :goto_1
    iget v1, p0, Lkik/android/net/a/c;->q:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lkik/android/net/a/c;->q:I

    .line 609
    iget v0, p0, Lkik/android/net/a/c;->q:I

    goto :goto_0

    .line 607
    :cond_1
    iget v0, p0, Lkik/android/net/a/c;->y:I

    int-to-long v0, v0

    const-wide/32 v2, 0x96000

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lkik/android/net/a/c;->z:J

    add-long/2addr v0, v2

    long-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lkik/android/net/a/c;->p:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/16 v1, 0x64

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1
.end method

.method public final a(Lkik/a/d/a/a;)V
    .locals 1

    .prologue
    .line 710
    iget-object v0, p0, Lkik/android/net/a/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    return-void
.end method

.method public final a(Lkik/android/e/e$a;)V
    .locals 0

    .prologue
    .line 716
    iput-object p1, p0, Lkik/android/net/a/c;->r:Lkik/android/e/e$a;

    .line 717
    return-void
.end method

.method protected final a(I)Z
    .locals 1

    .prologue
    .line 587
    sparse-switch p1, :sswitch_data_0

    .line 596
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 592
    :sswitch_0
    const/4 v0, 0x0

    goto :goto_0

    .line 587
    nop

    :sswitch_data_0
    .sparse-switch
        -0x2bc -> :sswitch_0
        0x191 -> :sswitch_0
        0x19c -> :sswitch_0
        0x19d -> :sswitch_0
    .end sparse-switch
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 617
    iget v0, p0, Lkik/android/net/a/c;->K:I

    sget v1, Lkik/android/net/a/c$a;->b:I

    if-ne v0, v1, :cond_0

    .line 618
    const/4 v0, 0x2

    .line 620
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lkik/android/net/a/c;->A:I

    goto :goto_0
.end method

.method final c()I
    .locals 39

    .prologue
    .line 247
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->n:Ljava/io/File;

    if-eqz v6, :cond_0

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_0

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->canRead()Z

    move-result v6

    if-nez v6, :cond_1

    .line 248
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lkik/android/net/a/c;->i()V

    .line 249
    const/16 v6, -0x190

    .line 521
    :goto_0
    return v6

    .line 252
    :cond_1
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/net/a/c;->K:I

    sget v7, Lkik/android/net/a/c$a;->b:I

    if-ne v6, v7, :cond_2

    .line 253
    const/4 v6, 0x2

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 254
    const/16 v6, -0x320

    goto :goto_0

    .line 256
    :cond_2
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v6}, Lkik/a/d/a/a;->l()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 257
    invoke-direct/range {p0 .. p0}, Lkik/android/net/a/c;->n()V

    .line 258
    const/16 v6, -0x320

    goto :goto_0

    .line 263
    :cond_3
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/net/a/c;->K:I

    sget v7, Lkik/android/net/a/c$a;->a:I

    if-ne v6, v7, :cond_4

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v6}, Lkik/a/d/a/a;->l()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 264
    invoke-direct/range {p0 .. p0}, Lkik/android/net/a/c;->n()V

    .line 265
    const/16 v6, -0x320

    goto :goto_0

    .line 269
    :cond_4
    :try_start_0
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->i:[B

    if-eqz v6, :cond_5

    .line 272
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 274
    new-instance v6, Lkik/android/net/a/a;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->n:Ljava/io/File;

    const-string v8, "r"

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/net/a/c;->i:[B

    const/16 v10, 0x10

    new-array v10, v10, [B

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v11}, Lkik/android/net/a/a;-><init>(Ljava/io/File;Ljava/lang/String;[B[BZ)V

    .line 276
    move-object/from16 v0, p0

    iget-wide v8, v0, Lkik/android/net/a/c;->m:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v12

    add-long/2addr v8, v10

    move-object/from16 v0, p0

    iput-wide v8, v0, Lkik/android/net/a/c;->m:J

    move-object/from16 v20, v6

    .line 282
    :goto_1
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->a()J

    move-result-wide v6

    move-object/from16 v0, p0

    iput-wide v6, v0, Lkik/android/net/a/c;->p:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    move-object/from16 v0, p0

    iget-wide v6, v0, Lkik/android/net/a/c;->p:J

    const-wide/32 v8, 0x96000

    div-long v8, v6, v8

    .line 293
    move-object/from16 v0, p0

    iget-wide v6, v0, Lkik/android/net/a/c;->p:J

    const-wide/32 v10, 0x96000

    rem-long/2addr v6, v10

    const-wide/16 v10, 0x0

    cmp-long v6, v6, v10

    if-nez v6, :cond_6

    const-wide/16 v6, 0x0

    :goto_2
    add-long v22, v8, v6

    .line 295
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/net/a/c;->A:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_7

    .line 297
    const/16 v6, -0x1f4

    goto/16 :goto_0

    .line 279
    :cond_5
    :try_start_1
    new-instance v6, Lkik/android/net/a/n;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->n:Ljava/io/File;

    const-string v8, "r"

    invoke-direct {v6, v7, v8}, Lkik/android/net/a/n;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v20, v6

    goto :goto_1

    .line 286
    :catch_0
    move-exception v6

    .line 287
    sget-object v7, Lkik/android/net/a/c;->B:Lorg/c/b;

    const-string v8, "Unable to create random access file: "

    invoke-interface {v7, v8, v6}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 288
    invoke-virtual/range {p0 .. p0}, Lkik/android/net/a/c;->i()V

    .line 289
    const/16 v6, -0x190

    goto/16 :goto_0

    .line 293
    :cond_6
    const-wide/16 v6, 0x1

    goto :goto_2

    .line 299
    :cond_7
    const/4 v6, 0x3

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 301
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->E:Lkik/a/f/k;

    invoke-interface {v7}, Lkik/a/f/k;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 302
    const/4 v6, 0x0

    .line 304
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    if-eqz v7, :cond_8

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 305
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 308
    :cond_8
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->r:Lkik/android/e/e$a;

    if-eqz v7, :cond_9

    .line 309
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->r:Lkik/android/e/e$a;

    invoke-virtual {v7}, Lkik/android/e/e$a;->a()V

    .line 312
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v24

    .line 313
    const-wide/16 v14, 0x0

    .line 316
    :try_start_2
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->G:Lkik/a/e/v;

    invoke-static {v7}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v26

    .line 327
    if-nez v26, :cond_a

    .line 328
    :try_start_3
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 521
    const/16 v6, -0x258

    goto/16 :goto_0

    .line 519
    :catch_1
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 331
    :cond_a
    :try_start_4
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->C:Ljava/lang/String;

    if-nez v7, :cond_b

    .line 332
    const-wide/16 v8, 0x0

    move-object/from16 v0, p0

    iget-wide v10, v0, Lkik/android/net/a/c;->p:J

    move-object/from16 v0, v20

    invoke-static {v0, v8, v9, v10, v11}, Lkik/android/net/a/c;->a(Lkik/android/net/a/h;JJ)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, p0

    iput-object v7, v0, Lkik/android/net/a/c;->C:Ljava/lang/String;

    .line 335
    :cond_b
    const/16 v7, 0x1000

    new-array v0, v7, [B

    move-object/from16 v27, v0

    .line 337
    move-object/from16 v0, p0

    iget-wide v8, v0, Lkik/android/net/a/c;->p:J

    long-to-int v0, v8

    move/from16 v28, v0

    .line 339
    const/4 v8, 0x0

    .line 341
    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/net/a/c;->y:I

    move v13, v7

    :goto_3
    int-to-long v10, v13

    cmp-long v7, v10, v22

    if-gez v7, :cond_19

    .line 342
    const-wide/16 v10, 0x0

    move-object/from16 v0, p0

    iput-wide v10, v0, Lkik/android/net/a/c;->z:J

    .line 344
    const-wide/32 v10, 0x96000

    int-to-long v0, v13

    move-wide/from16 v16, v0

    mul-long v18, v10, v16

    .line 345
    move-object/from16 v0, p0

    iget-wide v10, v0, Lkik/android/net/a/c;->p:J

    const-wide/32 v16, 0x96000

    add-int/lit8 v7, v13, 0x1

    int-to-long v0, v7

    move-wide/from16 v30, v0

    mul-long v16, v16, v30

    move-wide/from16 v0, v16

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v30

    .line 347
    const/4 v10, -0x1

    .line 349
    new-instance v11, Lkik/android/net/a/l;

    invoke-direct {v11}, Lkik/android/net/a/l;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 351
    :try_start_5
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->I:Lkik/a/e/t;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "YA=57aSA!ztajE5"

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 353
    move-object/from16 v0, v20

    move-wide/from16 v1, v18

    invoke-interface {v0, v1, v2}, Lkik/android/net/a/h;->a(J)V

    .line 354
    move-object/from16 v0, v20

    move-wide/from16 v1, v18

    move-wide/from16 v3, v30

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/net/a/c;->a(Lkik/android/net/a/h;JJ)Ljava/lang/String;

    move-result-object v9

    .line 355
    move-object/from16 v0, v20

    move-wide/from16 v1, v18

    invoke-interface {v0, v1, v2}, Lkik/android/net/a/h;->a(J)V

    .line 357
    sub-long v16, v30, v18

    .line 359
    const-string v12, "Content-Length"

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v11, v12, v0}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    const-string v12, "User-Agent"

    const-string v16, "Content"

    invoke-static/range {v16 .. v16}, Lkik/android/util/DeviceUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v11, v12, v0}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    const-string v12, "x-kik-jid"

    invoke-virtual/range {v26 .. v26}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v11, v12, v0}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const-string v12, "x-kik-password"

    invoke-virtual/range {v26 .. v26}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v11, v12, v0}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const-string v12, "x-kik-verification"

    invoke-virtual {v11, v12, v7}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    const-string v7, "x-kik-app-id"

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    invoke-virtual {v11, v7, v12}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const-string v7, "x-kik-content-chunks"

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v7, v12}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    const-string v7, "x-kik-content-size"

    move/from16 v0, v28

    int-to-long v0, v0

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v7, v12}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    const-string v7, "x-kik-content-md5"

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/net/a/c;->C:Ljava/lang/String;

    invoke-virtual {v11, v7, v12}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    const-string v7, "x-kik-chunk-number"

    int-to-long v0, v13

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v7, v12}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    const-string v7, "x-kik-chunk-md5"

    invoke-virtual {v11, v7, v9}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->i:[B

    if-eqz v7, :cond_c

    .line 372
    const-string v7, "x-kik-encrypted"

    const-string v9, "1"

    invoke-virtual {v11, v7, v9}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    :cond_c
    const-string v7, "com.kik.ext.video-camera"

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "com.kik.ext.video-gallery"

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 376
    :cond_d
    const-string v7, "Content-Type"

    const-string v9, "video/mp4"

    invoke-virtual {v11, v7, v9}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    :cond_e
    :goto_4
    if-eqz v6, :cond_f

    .line 383
    const-string v7, "x-kik-content-extension"

    invoke-virtual {v11, v7, v6}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    :cond_f
    const-string v7, "PUT"

    move-object/from16 v0, v21

    invoke-virtual {v11, v0, v7, v8}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;Lkik/android/net/a/l;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lkik/a/f/g; {:try_start_5 .. :try_end_5} :catch_d
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 388
    const/4 v12, 0x0

    .line 390
    :try_start_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v32

    move-wide/from16 v16, v18

    .line 393
    :goto_5
    cmp-long v7, v16, v30

    if-gez v7, :cond_14

    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/net/a/c;->A:I

    const/4 v8, 0x1

    if-eq v7, v8, :cond_14

    .line 395
    const/16 v7, 0x1000

    sub-long v8, v30, v16

    long-to-int v8, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 396
    move-object/from16 v0, v20

    move-object/from16 v1, v27

    invoke-interface {v0, v1, v7}, Lkik/android/net/a/h;->a([BI)I

    move-result v8

    .line 397
    if-ltz v8, :cond_13

    .line 398
    const/4 v7, 0x0

    move-object/from16 v0, v27

    invoke-virtual {v11, v0, v7, v8}, Lkik/android/net/a/l;->write([BII)V

    .line 399
    int-to-long v8, v8

    add-long v8, v8, v16

    .line 405
    const-wide/16 v16, 0x0

    sub-long v34, v8, v18

    const-wide/16 v36, 0x1000

    sub-long v34, v34, v36

    move-wide/from16 v0, v16

    move-wide/from16 v2, v34

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v16

    move-wide/from16 v0, v16

    move-object/from16 v2, p0

    iput-wide v0, v2, Lkik/android/net/a/c;->z:J
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lkik/a/f/g; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-wide/from16 v16, v8

    .line 406
    goto :goto_5

    .line 378
    :cond_10
    :try_start_7
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->o:Ljava/lang/String;

    invoke-static {v7}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->e:Ljava/lang/String;

    invoke-static {v7}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    .line 379
    const-string v7, "Content-Type"

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/net/a/c;->e:Ljava/lang/String;

    invoke-virtual {v11, v7, v9}, Lkik/android/net/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lkik/a/f/g; {:try_start_7 .. :try_end_7} :catch_d
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_4

    .line 441
    :catch_2
    move-exception v7

    move-object v8, v11

    .line 442
    :try_start_8
    instance-of v6, v7, Lorg/apache/http/client/HttpResponseException;

    if-eqz v6, :cond_11

    .line 443
    move-object v0, v7

    check-cast v0, Lorg/apache/http/client/HttpResponseException;

    move-object v6, v0

    invoke-virtual {v6}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v6

    .line 444
    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/net/a/c;->b:Ljava/util/List;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    .line 445
    const/4 v6, -0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 450
    :cond_11
    const-wide/16 v12, 0x1f4

    :try_start_9
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 456
    :goto_6
    :try_start_a
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "Failed after "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget v9, v0, Lkik/android/net/a/c;->y:I

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v9, " successful chunks with code "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 457
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "status text = "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lkik/android/net/a/l;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "error body = "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lkik/android/net/a/l;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    throw v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 468
    :catchall_0
    move-exception v6

    move-object v11, v8

    :goto_7
    if-eqz v11, :cond_12

    .line 469
    :try_start_b
    invoke-virtual {v11}, Lkik/android/net/a/l;->c()V

    :cond_12
    throw v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 514
    :catchall_1
    move-exception v6

    .line 516
    :try_start_c
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a

    .line 521
    throw v6

    .line 402
    :cond_13
    :try_start_d
    new-instance v9, Ljava/lang/Exception;

    new-instance v29, Ljava/lang/StringBuilder;

    const-string v30, "bytesRead was negative: "

    invoke-direct/range {v29 .. v30}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v29

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v29, ". bytesToRead: "

    move-object/from16 v0, v29

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v9, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 409
    :cond_14
    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/net/a/c;->A:I
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2
    .catch Lkik/a/f/g; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    const/4 v8, 0x1

    if-ne v7, v8, :cond_15

    .line 410
    :try_start_e
    invoke-virtual {v11}, Lkik/android/net/a/l;->c()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 514
    :try_start_f
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_3

    .line 521
    const/16 v6, -0x2bc

    goto/16 :goto_0

    .line 519
    :catch_3
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 413
    :cond_15
    :try_start_10
    invoke-virtual {v11}, Lkik/android/net/a/l;->flush()V

    .line 415
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Lkik/a/f/g; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    move-result-wide v8

    sub-long v8, v8, v32

    add-long/2addr v8, v14

    .line 417
    :try_start_11
    invoke-virtual {v11}, Lkik/android/net/a/l;->a()I

    move-result v10

    .line 419
    const/16 v7, 0xc8

    if-eq v10, v7, :cond_17

    .line 420
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v14, "Failed after "

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget v14, v0, Lkik/android/net/a/c;->y:I

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v14, " successful chunks with code "

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 421
    sget-object v7, Lkik/android/net/a/c;->B:Lorg/c/b;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "status text = "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Lkik/android/net/a/l;->d()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v7, v14}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 422
    sget-object v7, Lkik/android/net/a/c;->B:Lorg/c/b;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "error body = "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Lkik/android/net/a/l;->b()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v7, v14}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 423
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->b:Ljava/util/List;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v7, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 424
    invoke-virtual/range {p0 .. p0}, Lkik/android/net/a/c;->j()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_2
    .catch Lkik/a/f/g; {:try_start_11 .. :try_end_11} :catch_b
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 468
    :cond_16
    :try_start_12
    invoke-virtual {v11}, Lkik/android/net/a/l;->c()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 514
    :try_start_13
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_4

    move v6, v10

    .line 521
    goto/16 :goto_0

    .line 519
    :catch_4
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 429
    :cond_17
    :try_start_14
    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/net/a/c;->y:I

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    iput v7, v0, Lkik/android/net/a/c;->y:I

    .line 430
    sub-long v14, v16, v18

    move-object/from16 v0, p0

    iput-wide v14, v0, Lkik/android/net/a/c;->z:J

    .line 431
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->F:Lkik/a/e/n;

    move-object/from16 v0, p0

    iget-object v14, v0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    move-object/from16 v0, p0

    iget v15, v0, Lkik/android/net/a/c;->y:I

    invoke-interface {v7, v14, v15}, Lkik/a/e/n;->a(Ljava/lang/String;I)V

    .line 433
    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/net/a/c;->y:I
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2
    .catch Lkik/a/f/g; {:try_start_14 .. :try_end_14} :catch_b
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    int-to-long v14, v7

    cmp-long v7, v14, v22

    if-eqz v7, :cond_1f

    .line 435
    const/4 v7, 0x0

    move-object/from16 v38, v7

    move-object v7, v11

    move-object/from16 v11, v38

    .line 437
    :goto_8
    :try_start_15
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, "Done "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget v14, v0, Lkik/android/net/a/c;->y:I

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Lkik/a/f/g; {:try_start_15 .. :try_end_15} :catch_c
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 468
    if-eqz v11, :cond_18

    .line 469
    :try_start_16
    invoke-virtual {v11}, Lkik/android/net/a/l;->c()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 341
    :cond_18
    :goto_9
    add-int/lit8 v10, v13, 0x1

    move v13, v10

    move-wide v14, v8

    move-object v8, v7

    goto/16 :goto_3

    .line 452
    :catch_5
    move-exception v6

    :try_start_17
    invoke-virtual {v6}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    goto/16 :goto_6

    .line 461
    :catch_6
    move-exception v7

    move-object v10, v7

    move-wide v8, v14

    move-object v7, v12

    .line 462
    :goto_a
    :try_start_18
    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/net/a/c;->D:Lcom/kik/android/a;

    const-string v14, "Content Encryption Failure"

    invoke-virtual {v12, v14}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v12

    const-string v14, "Encryption Time"

    move-object/from16 v0, p0

    iget-wide v0, v0, Lkik/android/net/a/c;->m:J

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    long-to-double v0, v0

    move-wide/from16 v16, v0

    const-wide v18, 0x408f400000000000L    # 1000.0

    div-double v16, v16, v18

    move-wide/from16 v0, v16

    invoke-virtual {v12, v14, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v12

    invoke-virtual {v12}, Lcom/kik/android/a$f;->b()V

    .line 465
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v14, "Failed on chunk "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget v14, v0, Lkik/android/net/a/c;->y:I

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v14, " with error "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 468
    if-eqz v11, :cond_18

    .line 469
    :try_start_19
    invoke-virtual {v11}, Lkik/android/net/a/l;->c()V

    goto :goto_9

    .line 475
    :cond_19
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/net/a/c;->y:I

    int-to-long v6, v6

    cmp-long v6, v6, v22

    if-nez v6, :cond_1e

    .line 476
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->D:Lcom/kik/android/a;

    const-string v7, "Content Uploaded"

    invoke-virtual {v6, v7}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Is Encrypted"

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->i:[B

    if-eqz v6, :cond_1c

    const/4 v6, 0x1

    :goto_b
    invoke-virtual {v7, v8, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v6

    const-string v7, "Content Size"

    move-object/from16 v0, p0

    iget-wide v8, v0, Lkik/android/net/a/c;->p:J

    invoke-virtual {v6, v7, v8, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v6

    const-string v7, "App ID"

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/net/a/c;->d:Ljava/lang/String;

    invoke-virtual {v6, v7, v8}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v6

    const-string v7, "Is Content Encryption Reupload"

    move-object/from16 v0, p0

    iget-boolean v8, v0, Lkik/android/net/a/c;->j:Z

    invoke-virtual {v6, v7, v8}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v6

    .line 482
    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->i:[B

    if-eqz v7, :cond_1a

    .line 483
    const-string v7, "Encryption Time"

    move-object/from16 v0, p0

    iget-wide v8, v0, Lkik/android/net/a/c;->m:J

    long-to-double v8, v8

    const-wide v10, 0x408f400000000000L    # 1000.0

    div-double/2addr v8, v10

    invoke-virtual {v6, v7, v8, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    .line 486
    :cond_1a
    invoke-virtual {v6}, Lcom/kik/android/a$f;->b()V

    .line 488
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v6, v6, v24

    .line 489
    long-to-double v8, v14

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v8, v10

    long-to-double v10, v6

    div-double/2addr v8, v10

    .line 490
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Chunk time = "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " total time = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " efficiency = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 492
    const/4 v6, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lkik/android/net/a/c;->d(I)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 494
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->F:Lkik/a/e/n;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    invoke-interface {v6, v7}, Lkik/a/e/n;->a(Ljava/lang/String;)V

    .line 498
    :cond_1b
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/net/a/c;->A:I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1d

    .line 499
    :try_start_1a
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_7

    .line 521
    const/16 v6, -0x2bc

    goto/16 :goto_0

    .line 476
    :cond_1c
    const/4 v6, 0x0

    goto/16 :goto_b

    .line 519
    :catch_7
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 502
    :cond_1d
    :try_start_1b
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/a/c;->J:Lcom/kik/g/p;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 503
    const/4 v6, 0x4

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    .line 505
    :try_start_1c
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_8

    .line 521
    const/16 v6, 0xc8

    goto/16 :goto_0

    .line 519
    :catch_8
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 508
    :cond_1e
    const/4 v6, 0x1

    :try_start_1d
    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1

    .line 510
    :try_start_1e
    invoke-interface/range {v20 .. v20}, Lkik/android/net/a/h;->close()V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_9

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 519
    :catch_9
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 519
    :catch_a
    move-exception v6

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lkik/android/net/a/c;->A:I

    .line 521
    const/4 v6, -0x1

    goto/16 :goto_0

    .line 468
    :catchall_2
    move-exception v6

    goto/16 :goto_7

    .line 461
    :catch_b
    move-exception v7

    move-object v10, v7

    move-object v7, v12

    goto/16 :goto_a

    :catch_c
    move-exception v10

    goto/16 :goto_a

    :catch_d
    move-exception v7

    move-object v10, v7

    move-object v7, v8

    move-wide v8, v14

    goto/16 :goto_a

    :cond_1f
    move-object v7, v12

    goto/16 :goto_8
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 626
    iget-object v0, p0, Lkik/android/net/a/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 530
    iput v2, p0, Lkik/android/net/a/c;->y:I

    .line 531
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/net/a/c;->z:J

    .line 532
    iput v2, p0, Lkik/android/net/a/c;->A:I

    .line 533
    return-void
.end method

.method final g()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 538
    iget v1, p0, Lkik/android/net/a/c;->a:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    .line 539
    :goto_0
    if-eqz v1, :cond_1

    .line 542
    iput v0, p0, Lkik/android/net/a/c;->a:I

    .line 545
    :goto_1
    return v0

    :cond_0
    move v1, v0

    .line 538
    goto :goto_0

    .line 545
    :cond_1
    invoke-super {p0}, Lkik/android/net/a/b;->g()Z

    move-result v0

    goto :goto_1
.end method

.method final h()V
    .locals 2

    .prologue
    .line 655
    invoke-super {p0}, Lkik/android/net/a/b;->h()V

    .line 656
    iget v0, p0, Lkik/android/net/a/c;->K:I

    sget v1, Lkik/android/net/a/c$a;->b:I

    if-ne v0, v1, :cond_0

    .line 657
    invoke-static {}, Lkik/android/i/i;->a()Lkik/android/i/i;

    move-result-object v0

    iget-object v1, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/i/i;->b(Ljava/lang/String;)V

    .line 659
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 640
    iget v0, p0, Lkik/android/net/a/c;->A:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 641
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/net/a/c;->A:I

    .line 643
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 648
    iput v0, p0, Lkik/android/net/a/c;->A:I

    .line 649
    invoke-direct {p0, v0}, Lkik/android/net/a/c;->d(I)Z

    .line 650
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    .line 632
    iget v0, p0, Lkik/android/net/a/c;->A:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 633
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/net/a/c;->A:I

    .line 635
    :cond_0
    return-void
.end method

.method public final l()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lkik/android/net/a/c;->J:Lcom/kik/g/p;

    return-object v0
.end method

.method public final m()J
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    if-nez v0, :cond_0

    .line 152
    const-wide/16 v0, 0x0

    .line 160
    :goto_0
    return-wide v0

    .line 154
    :cond_0
    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    iget-object v0, p0, Lkik/android/net/a/c;->k:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    .line 156
    if-eqz v0, :cond_1

    .line 157
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/ak;->a(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lkik/android/net/a/c;->n:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_0
.end method
