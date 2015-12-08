.class public final Lcom/cm/kinfoc/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Z


# instance fields
.field public a:Lcom/cm/kinfoc/n;

.field b:Lcom/cm/kinfoc/d;

.field private d:Landroid/content/Context;

.field private e:Z

.field private f:J

.field private g:Z

.field private volatile h:Z

.field private final i:Ljava/lang/Object;

.field private j:Lcom/cm/kinfoc/j;

.field private k:Lcom/cm/kinfoc/m;

.field private l:I

.field private m:Landroid/content/IntentFilter;

.field private n:Landroid/content/IntentFilter;

.field private o:Landroid/content/Intent;

.field private p:Landroid/app/PendingIntent;

.field private q:Landroid/app/AlarmManager;

.field private r:Landroid/os/Handler;

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Landroid/content/BroadcastReceiver;

.field private u:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cm/kinfoc/z;->c:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/cm/kinfoc/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object v2, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    .line 42
    iput-boolean v3, p0, Lcom/cm/kinfoc/z;->e:Z

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/cm/kinfoc/z;->f:J

    .line 44
    iput-boolean v3, p0, Lcom/cm/kinfoc/z;->g:Z

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cm/kinfoc/z;->h:Z

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->i:Ljava/lang/Object;

    .line 49
    iput-object v2, p0, Lcom/cm/kinfoc/z;->a:Lcom/cm/kinfoc/n;

    .line 50
    iput-object v2, p0, Lcom/cm/kinfoc/z;->j:Lcom/cm/kinfoc/j;

    .line 52
    iput-object v2, p0, Lcom/cm/kinfoc/z;->k:Lcom/cm/kinfoc/m;

    .line 55
    new-instance v0, Lcom/cm/kinfoc/aa;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/aa;-><init>(Lcom/cm/kinfoc/z;)V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->b:Lcom/cm/kinfoc/d;

    .line 110
    const/16 v0, 0x4e20

    iput v0, p0, Lcom/cm/kinfoc/z;->l:I

    .line 112
    iput-object v2, p0, Lcom/cm/kinfoc/z;->m:Landroid/content/IntentFilter;

    .line 113
    iput-object v2, p0, Lcom/cm/kinfoc/z;->n:Landroid/content/IntentFilter;

    .line 114
    iput-object v2, p0, Lcom/cm/kinfoc/z;->o:Landroid/content/Intent;

    .line 115
    iput-object v2, p0, Lcom/cm/kinfoc/z;->p:Landroid/app/PendingIntent;

    .line 116
    iput-object v2, p0, Lcom/cm/kinfoc/z;->q:Landroid/app/AlarmManager;

    .line 117
    iput-object v2, p0, Lcom/cm/kinfoc/z;->r:Landroid/os/Handler;

    .line 120
    new-instance v0, Lcom/cm/kinfoc/ab;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/ab;-><init>(Lcom/cm/kinfoc/z;)V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->s:Landroid/content/BroadcastReceiver;

    .line 133
    new-instance v0, Lcom/cm/kinfoc/ac;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/ac;-><init>(Lcom/cm/kinfoc/z;)V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->t:Landroid/content/BroadcastReceiver;

    .line 149
    new-instance v0, Lcom/cm/kinfoc/ad;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/ad;-><init>(Lcom/cm/kinfoc/z;)V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->u:Ljava/lang/Runnable;

    .line 245
    if-eqz p2, :cond_0

    .line 246
    iput-object p2, p0, Lcom/cm/kinfoc/z;->a:Lcom/cm/kinfoc/n;

    .line 248
    :cond_0
    if-eqz p1, :cond_1

    .line 249
    iput-object p1, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    .line 250
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->r:Landroid/os/Handler;

    .line 253
    :cond_1
    new-instance v0, Lcom/cm/kinfoc/j;

    invoke-direct {v0}, Lcom/cm/kinfoc/j;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/z;->j:Lcom/cm/kinfoc/j;

    .line 256
    return-void
.end method

.method static synthetic a(Lcom/cm/kinfoc/z;I)V
    .locals 12

    .prologue
    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    .line 32
    .line 4445
    iget-object v1, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 4454
    :try_start_0
    iget-object v1, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/cm/kinfoc/ag;->b(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v1

    .line 4458
    if-nez v1, :cond_1

    .line 4508
    :cond_0
    :goto_0
    return-void

    .line 4462
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 4463
    if-eqz v1, :cond_0

    .line 4467
    :goto_1
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 4468
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Post cache "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 4470
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 4471
    aget-object v3, v1, v0

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, ".ich"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 4474
    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 4475
    const/4 v6, -0x1

    if-eq v3, v6, :cond_2

    .line 4478
    const/4 v6, 0x0

    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 4479
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x4

    invoke-virtual {v2, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 4482
    :try_start_1
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v2

    .line 4487
    :goto_2
    :try_start_2
    iget-boolean v7, p0, Lcom/cm/kinfoc/z;->g:Z

    if-nez v7, :cond_3

    .line 4488
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 4467
    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4484
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/NumberFormatException;->printStackTrace()V

    move-wide v2, v4

    goto :goto_2

    .line 4492
    :cond_3
    iget-wide v8, p0, Lcom/cm/kinfoc/z;->f:J

    cmp-long v7, v8, v4

    if-lez v7, :cond_4

    .line 4493
    invoke-static {v2, v3}, Lcom/cm/kinfoc/ag;->a(J)J

    move-result-wide v8

    iget-wide v10, p0, Lcom/cm/kinfoc/z;->f:J

    cmp-long v7, v8, v10

    if-ltz v7, :cond_4

    .line 4494
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 4507
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 4499
    :cond_4
    :try_start_3
    aget-object v7, v1, v0

    invoke-static {v7}, Lcom/cm/kinfoc/g;->a(Ljava/io/File;)[B

    move-result-object v7

    .line 4500
    if-eqz v7, :cond_5

    .line 4515
    iget-object v8, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    if-eqz v8, :cond_5

    if-eqz v6, :cond_5

    if-nez v7, :cond_6

    .line 4504
    :cond_5
    :goto_4
    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_3

    .line 4518
    :cond_6
    iget-object v8, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v8}, Lcom/cm/kinfoc/y;->b(Landroid/content/Context;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 4519
    new-instance v8, Lcom/cm/kinfoc/i;

    invoke-direct {v8}, Lcom/cm/kinfoc/i;-><init>()V

    .line 4520
    invoke-virtual {v8, v7}, Lcom/cm/kinfoc/i;->a([B)V

    .line 4521
    invoke-virtual {v8, v6}, Lcom/cm/kinfoc/i;->a(Ljava/lang/String;)V

    .line 4522
    invoke-virtual {v8}, Lcom/cm/kinfoc/i;->d()V

    .line 4523
    invoke-virtual {v8, v2, v3}, Lcom/cm/kinfoc/i;->a(J)V

    .line 4524
    invoke-virtual {v8}, Lcom/cm/kinfoc/i;->h()V

    .line 4528
    const-string v2, "Post data via network."

    invoke-static {v2}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 4530
    invoke-virtual {v8, p1}, Lcom/cm/kinfoc/i;->a(I)V

    .line 4539
    iget-object v2, p0, Lcom/cm/kinfoc/z;->a:Lcom/cm/kinfoc/n;

    invoke-virtual {v2, p1}, Lcom/cm/kinfoc/n;->a(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/cm/kinfoc/z;->b:Lcom/cm/kinfoc/d;

    invoke-static {v8, v2, v3}, Lcom/cm/kinfoc/j;->b(Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 843
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "act.log"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 844
    return-void
.end method

.method static synthetic a(Lcom/cm/kinfoc/z;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/cm/kinfoc/z;->e:Z

    return v0
.end method

.method static synthetic a(Lcom/cm/kinfoc/z;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/cm/kinfoc/z;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/cm/kinfoc/z;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/cm/kinfoc/z;->r:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/cm/kinfoc/z;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/cm/kinfoc/z;->u:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic d(Lcom/cm/kinfoc/z;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/cm/kinfoc/z;->i:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    .prologue
    .line 32
    sget-boolean v0, Lcom/cm/kinfoc/z;->c:Z

    return v0
.end method

.method static synthetic e(Lcom/cm/kinfoc/z;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/cm/kinfoc/z;->h:Z

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 177
    iget-boolean v0, p0, Lcom/cm/kinfoc/z;->h:Z

    if-eqz v0, :cond_1

    .line 218
    :cond_0
    :goto_0
    return-void

    .line 1766
    :cond_1
    iget-boolean v0, p0, Lcom/cm/kinfoc/z;->e:Z

    .line 181
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/cm/kinfoc/y;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Lcom/cm/kinfoc/a/g;->a()Lcom/cm/kinfoc/a/g;

    move-result-object v0

    new-instance v1, Lcom/cm/kinfoc/af;

    invoke-direct {v1, p0}, Lcom/cm/kinfoc/af;-><init>(Lcom/cm/kinfoc/z;)V

    invoke-virtual {v0, v1}, Lcom/cm/kinfoc/a/g;->a(Lcom/cm/kinfoc/a/j;)V

    goto :goto_0
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 790
    iput-wide p1, p0, Lcom/cm/kinfoc/z;->f:J

    .line 791
    return-void
.end method

.method public final a(Ljava/lang/String;ZJI)V
    .locals 3

    .prologue
    .line 679
    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 689
    :cond_0
    :goto_0
    return-void

    .line 681
    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/cm/kinfoc/ag;->b(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    .line 684
    :goto_1
    if-eqz v0, :cond_0

    .line 688
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-char v1, Ljava/io/File;->separatorChar:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ich"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4053
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4054
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4055
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 681
    :cond_2
    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0, p5}, Lcom/cm/kinfoc/ag;->a(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    goto :goto_1
.end method

.method public final a([BLjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    .line 311
    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 360
    :cond_0
    :goto_0
    return-void

    .line 314
    :cond_1
    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/cm/kinfoc/y;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    new-instance v0, Lcom/cm/kinfoc/i;

    invoke-direct {v0}, Lcom/cm/kinfoc/i;-><init>()V

    .line 316
    invoke-virtual {v0, p1}, Lcom/cm/kinfoc/i;->a([B)V

    .line 317
    invoke-virtual {v0, p2}, Lcom/cm/kinfoc/i;->a(Ljava/lang/String;)V

    .line 318
    invoke-virtual {v0}, Lcom/cm/kinfoc/i;->d()V

    .line 319
    invoke-virtual {v0, v4, v5}, Lcom/cm/kinfoc/i;->a(J)V

    .line 320
    invoke-virtual {v0}, Lcom/cm/kinfoc/i;->h()V

    .line 324
    const-string v1, "Post data via network."

    invoke-static {v1}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v0, v3}, Lcom/cm/kinfoc/i;->a(I)V

    .line 327
    iget-object v1, p0, Lcom/cm/kinfoc/z;->j:Lcom/cm/kinfoc/j;

    iget-object v2, p0, Lcom/cm/kinfoc/z;->a:Lcom/cm/kinfoc/n;

    invoke-virtual {v2, v3}, Lcom/cm/kinfoc/n;->a(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/cm/kinfoc/z;->b:Lcom/cm/kinfoc/d;

    invoke-virtual {v1, v0, v2, v3}, Lcom/cm/kinfoc/j;->a(Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)V

    goto :goto_0

    .line 356
    :cond_2
    cmp-long v0, v4, v4

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/cm/kinfoc/z;->e:Z

    if-eqz v0, :cond_0

    .line 357
    invoke-virtual {p0, p1, p2, v3, v3}, Lcom/cm/kinfoc/z;->a([BLjava/lang/String;ZI)Z

    goto :goto_0
.end method

.method public final a([BLjava/lang/String;ZI)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 421
    .line 423
    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/cm/kinfoc/ag;->c(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    .line 427
    :goto_0
    if-nez v0, :cond_1

    .line 437
    :goto_1
    return v1

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-static {v0, p4}, Lcom/cm/kinfoc/ag;->d(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 432
    :cond_1
    :try_start_0
    new-instance v2, Lcom/cm/kinfoc/g;

    iget-object v3, p0, Lcom/cm/kinfoc/z;->d:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/cm/kinfoc/g;-><init>(Landroid/content/Context;)V

    .line 433
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".ich"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3056
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3057
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 3058
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    .line 3059
    if-eqz v0, :cond_2

    .line 3060
    invoke-virtual {v2, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 3061
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V

    .line 3062
    const/4 v0, 0x1

    .line 3064
    :goto_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    move v1, v0

    .line 437
    goto :goto_1

    .line 435
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v1

    goto :goto_3

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 263
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cm/kinfoc/z;->g:Z

    .line 264
    return-void
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 859
    iget v0, p0, Lcom/cm/kinfoc/z;->l:I

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->i()I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    add-int/2addr v0, v1

    return v0
.end method
