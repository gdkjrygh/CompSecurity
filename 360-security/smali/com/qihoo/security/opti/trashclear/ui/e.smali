.class public Lcom/qihoo/security/opti/trashclear/ui/e;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:I

.field private static d:Lcom/qihoo/security/opti/trashclear/ui/f;

.field private static e:Lcom/qihoo/security/opti/trashclear/ui/d;

.field private static g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/qihoo/security/locale/d;

.field private c:Landroid/content/Context;

.field private f:Z

.field private h:Z

.field private i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 36
    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    .line 37
    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    .line 49
    const/4 v0, 0x1

    sput v0, Lcom/qihoo/security/opti/trashclear/ui/e;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->b:Lcom/qihoo/security/locale/d;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->c:Landroid/content/Context;

    .line 42
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->f:Z

    .line 56
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->h:Z

    .line 61
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->c:Landroid/content/Context;

    .line 62
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->b:Lcom/qihoo/security/locale/d;

    .line 63
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/f;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    .line 64
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/d;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->f:Z

    .line 69
    return-void
.end method

.method public static a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 160
    sput p0, Lcom/qihoo/security/opti/trashclear/ui/e;->a:I

    .line 161
    if-nez p0, :cond_0

    .line 162
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->a()Ljava/util/List;

    move-result-object v0

    .line 164
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 10

    .prologue
    const/4 v4, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 78
    const-wide/32 v0, 0x40000000

    .line 79
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v5

    const-string/jumbo v6, "lm.dat"

    invoke-static {v5, v6}, Lcom/qihoo360/common/utils/Utils;->openConfigFile(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 80
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_0

    .line 81
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x400

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->str2Int(Ljava/lang/String;I)I

    move-result v0

    const/high16 v1, 0x100000

    mul-int/2addr v0, v1

    int-to-long v0, v0

    .line 83
    :cond_0
    iget-wide v6, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    cmp-long v0, v6, v0

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    const/4 v1, 0x5

    .line 85
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-ne v0, v4, :cond_2

    move v0, v2

    .line 86
    :goto_0
    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    sparse-switch v3, :sswitch_data_0

    move v2, v1

    .line 117
    :goto_1
    :sswitch_0
    const/16 v3, 0x4660

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string/jumbo v1, ""

    :goto_2
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v6, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    const-wide/32 v8, 0x100000

    div-long/2addr v6, v8

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "; "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v5, "; "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v1, v4, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_1
    :sswitch_1
    return-void

    :cond_2
    move v0, v3

    .line 85
    goto :goto_0

    :sswitch_2
    move v2, v4

    .line 104
    goto :goto_1

    .line 106
    :sswitch_3
    const/4 v2, 0x3

    .line 107
    goto :goto_1

    .line 109
    :sswitch_4
    const/4 v2, 0x4

    .line 110
    goto :goto_1

    .line 117
    :cond_3
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    goto :goto_2

    .line 86
    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_2
        0x22 -> :sswitch_4
        0x23 -> :sswitch_3
        0x141 -> :sswitch_0
        0x142 -> :sswitch_1
        0x143 -> :sswitch_1
        0x169 -> :sswitch_1
        0x16a -> :sswitch_1
        0x16b -> :sswitch_1
        0x16c -> :sswitch_1
        0x16d -> :sswitch_1
        0x16e -> :sswitch_1
        0x16f -> :sswitch_1
        0x170 -> :sswitch_1
    .end sparse-switch
.end method

.method private declared-synchronized c()Z
    .locals 1

    .prologue
    .line 585
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 150
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->g:Ljava/util/Map;

    return-object v0
.end method

.method public a(II)V
    .locals 1

    .prologue
    .line 403
    if-nez p1, :cond_0

    .line 404
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(I)V

    .line 408
    :goto_0
    return-void

    .line 407
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->b(I)V

    goto :goto_0
.end method

.method public a(IIJ)V
    .locals 1

    .prologue
    .line 417
    if-nez p1, :cond_0

    .line 418
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(IJ)V

    .line 422
    :goto_0
    return-void

    .line 421
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(IJ)V

    goto :goto_0
.end method

.method public a(IILjava/lang/String;I)V
    .locals 1

    .prologue
    .line 369
    if-nez p1, :cond_0

    .line 370
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(ILjava/lang/String;I)V

    .line 374
    :goto_0
    return-void

    .line 373
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILjava/lang/String;I)V

    goto :goto_0
.end method

.method public a(IILjava/lang/String;J)V
    .locals 2

    .prologue
    .line 389
    if-nez p1, :cond_0

    .line 390
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(ILjava/lang/String;J)V

    .line 394
    :goto_0
    return-void

    .line 393
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILjava/lang/String;J)V

    goto :goto_0
.end method

.method public a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 1

    .prologue
    .line 282
    if-nez p1, :cond_0

    .line 283
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->b(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 287
    :goto_0
    return-void

    .line 286
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->b(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    goto :goto_0
.end method

.method public a(ILcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 1

    .prologue
    .line 310
    if-nez p1, :cond_0

    .line 311
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 315
    :goto_0
    return-void

    .line 314
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_0
.end method

.method public a(J)V
    .locals 1

    .prologue
    .line 577
    iput-wide p1, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->i:J

    .line 578
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 132
    sput-object p1, Lcom/qihoo/security/opti/trashclear/ui/e;->g:Ljava/util/Map;

    .line 133
    return-void
.end method

.method public a(ILcom/qihoo/security/opti/trashclear/ui/i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 228
    if-nez p1, :cond_0

    .line 229
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)Z

    move-result v0

    .line 231
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)Z

    move-result v0

    goto :goto_0
.end method

.method public a(ILjava/lang/Object;)Z
    .locals 1

    .prologue
    .line 187
    if-nez p1, :cond_0

    .line 188
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Ljava/lang/Object;)Z

    move-result v0

    .line 190
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 581
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->i:J

    return-wide v0
.end method

.method public b(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 174
    if-nez p1, :cond_0

    .line 175
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->b()Ljava/util/List;

    move-result-object v0

    .line 177
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->b()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public b(IIJ)V
    .locals 1

    .prologue
    .line 431
    if-nez p1, :cond_0

    .line 432
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/f;->b(IJ)V

    .line 436
    :goto_0
    return-void

    .line 435
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/d;->b(IJ)V

    goto :goto_0
.end method

.method public b(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 1

    .prologue
    .line 296
    if-nez p1, :cond_0

    .line 297
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 301
    :goto_0
    return-void

    .line 300
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    goto :goto_0
.end method

.method public b(ILcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 241
    if-nez p1, :cond_0

    .line 242
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 246
    :goto_0
    return-void

    .line 245
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0
.end method

.method public b(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 200
    if-nez p1, :cond_0

    .line 201
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->b(Ljava/lang/Object;)V

    .line 205
    :goto_0
    return-void

    .line 204
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public declared-synchronized b(Ljava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 446
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/e;->c()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 574
    :goto_0
    monitor-exit p0

    return-void

    .line 452
    :cond_0
    if-nez p1, :cond_1

    .line 453
    :try_start_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 455
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 456
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 457
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 458
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/TrashType;

    .line 459
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 461
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 462
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 466
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    move v4, v5

    .line 467
    :goto_2
    if-ge v4, v9, :cond_10

    .line 468
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 469
    if-nez v2, :cond_4

    .line 467
    :cond_3
    :goto_3
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_2

    .line 477
    :cond_4
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v10, "subList"

    invoke-virtual {v3, v10}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    .line 478
    iget v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    const/4 v10, 0x2

    if-ne v3, v10, :cond_9

    .line 479
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v3, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v3

    .line 480
    if-eqz v3, :cond_3

    .line 481
    sget-object v10, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v10}, Lcom/qihoo/security/opti/trashclear/ui/d;->g()Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v10

    .line 482
    sget-object v11, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v11, :cond_5

    sget-object v11, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v11, :cond_5

    sget-object v11, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    if-ne v0, v11, :cond_6

    .line 484
    :cond_5
    if-eqz v10, :cond_6

    invoke-interface {v7, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 485
    invoke-interface {v7, v10}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 488
    :cond_6
    sget-object v10, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    if-ne v0, v10, :cond_7

    .line 489
    iget-object v10, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v11, "dbType"

    invoke-virtual {v10, v11}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 490
    iget-object v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v10, "dbType"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 491
    sget-object v10, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v10, v2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 492
    sget-object v11, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v11, v10, v3}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 493
    sget-object v10, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v10, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 500
    :cond_7
    :goto_4
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 446
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 495
    :cond_8
    :try_start_2
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->b:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0248

    invoke-virtual {v2, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 496
    sget-object v10, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v10, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 497
    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    const/4 v10, 0x0

    invoke-virtual {v2, v10, v3}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    goto :goto_4

    .line 503
    :cond_9
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v3, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v2

    .line 504
    if-eqz v2, :cond_3

    .line 505
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v3}, Lcom/qihoo/security/opti/trashclear/ui/f;->f()Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v3

    .line 506
    sget-object v10, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v10, :cond_a

    sget-object v10, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v10, :cond_a

    sget-object v10, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    if-ne v0, v10, :cond_b

    .line 508
    :cond_a
    if-eqz v3, :cond_b

    invoke-interface {v6, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 509
    invoke-interface {v6, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 512
    :cond_b
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 516
    :cond_c
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v3, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v10

    .line 517
    if-eqz v10, :cond_e

    .line 518
    sget-object v3, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    if-ne v0, v3, :cond_d

    .line 519
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v11, "dbType"

    invoke-virtual {v3, v11}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 520
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v11, "dbType"

    invoke-virtual {v3, v11}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 521
    sget-object v11, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v11, v3}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 522
    sget-object v12, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v12, v11, v10}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 523
    sget-object v11, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v11, v3, v10}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 538
    :cond_d
    :goto_5
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 540
    :cond_e
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v3, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v2

    .line 541
    if-eqz v2, :cond_3

    .line 542
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 532
    :cond_f
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->b:Lcom/qihoo/security/locale/d;

    const v11, 0x7f0c0248

    invoke-virtual {v3, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 533
    sget-object v11, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v11, v3, v10}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 534
    sget-object v3, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v10}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    goto :goto_5

    .line 548
    :cond_10
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v1, :cond_11

    .line 549
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Lcom/qihoo/security/clearengine/TrashType;I)Ljava/lang/String;

    move-result-object v1

    .line 550
    if-eqz v7, :cond_11

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_11

    .line 551
    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v2, v1, v7}, Lcom/qihoo/security/opti/trashclear/ui/d;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 557
    :cond_11
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v1, :cond_12

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_APP_SYSTEM_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v1, :cond_12

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    if-eq v0, v1, :cond_12

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    if-ne v0, v1, :cond_12

    .line 564
    :cond_12
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Lcom/qihoo/security/clearengine/TrashType;I)Ljava/lang/String;

    move-result-object v0

    .line 565
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 566
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v1, v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/f;->a(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_1

    .line 570
    :cond_13
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->g()V

    .line 571
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->h()V

    .line 572
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->f()V

    .line 573
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/e;->h:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method public c(I)J
    .locals 2

    .prologue
    .line 324
    if-nez p1, :cond_0

    .line 325
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->c()J

    move-result-wide v0

    .line 327
    :goto_0
    return-wide v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->c()J

    move-result-wide v0

    goto :goto_0
.end method

.method public c(ILcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 255
    if-nez p1, :cond_0

    .line 256
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 260
    :goto_0
    return-void

    .line 259
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 214
    if-nez p1, :cond_0

    .line 215
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/f;->c(Ljava/lang/Object;)V

    .line 219
    :goto_0
    return-void

    .line 218
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/d;->c(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public d(I)J
    .locals 2

    .prologue
    .line 337
    if-nez p1, :cond_0

    .line 338
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->d()J

    move-result-wide v0

    .line 340
    :goto_0
    return-wide v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->d()J

    move-result-wide v0

    goto :goto_0
.end method

.method public e(I)J
    .locals 2

    .prologue
    .line 350
    if-nez p1, :cond_0

    .line 351
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->e()J

    move-result-wide v0

    .line 353
    :goto_0
    return-wide v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->e()J

    move-result-wide v0

    goto :goto_0
.end method

.method public f(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 595
    if-nez p1, :cond_0

    .line 596
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->d:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/f;->h()Ljava/util/List;

    move-result-object v0

    .line 598
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/e;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/d;->i()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method
