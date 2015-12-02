.class public Lcom/qihoo/security/opti/b/d;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 12

    .prologue
    const-wide/16 v4, 0x0

    .line 16
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-wide v2, v4

    move-wide v6, v4

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 21
    iget-wide v10, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    add-long/2addr v6, v10

    .line 22
    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c()J

    move-result-wide v0

    add-long/2addr v0, v2

    move-wide v2, v0

    .line 23
    goto :goto_0

    :cond_0
    move-wide v2, v4

    move-wide v6, v4

    .line 25
    :cond_1
    cmp-long v0, v6, v4

    if-lez v0, :cond_2

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    .line 26
    const-wide/16 v0, 0x64

    mul-long/2addr v0, v2

    div-long/2addr v0, v6

    long-to-int v0, v0

    .line 28
    :goto_1
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;J)Ljava/lang/String;
    .locals 5

    .prologue
    const/high16 v3, 0x44800000    # 1024.0f

    .line 92
    long-to-float v1, p1

    .line 93
    const v0, 0x7f0c01e5

    .line 94
    cmpl-float v2, v1, v3

    if-lez v2, :cond_0

    .line 95
    const v0, 0x7f0c01e6

    .line 96
    div-float/2addr v1, v3

    .line 98
    :cond_0
    cmpl-float v2, v1, v3

    if-lez v2, :cond_1

    .line 99
    const v0, 0x7f0c01e7

    .line 100
    div-float/2addr v1, v3

    .line 102
    :cond_1
    cmpl-float v2, v1, v3

    if-lez v2, :cond_2

    .line 103
    const v0, 0x7f0c01e8

    .line 104
    div-float/2addr v1, v3

    .line 106
    :cond_2
    cmpl-float v2, v1, v3

    if-lez v2, :cond_3

    .line 107
    const v0, 0x7f0c01e9

    .line 108
    div-float/2addr v1, v3

    .line 110
    :cond_3
    cmpl-float v2, v1, v3

    if-lez v2, :cond_4

    .line 111
    const v0, 0x7f0c01ea

    .line 112
    div-float/2addr v1, v3

    .line 114
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v1, v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;JZ)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v7, 0x2

    const/high16 v4, 0x44800000    # 1024.0f

    const/high16 v3, 0x44610000    # 900.0f

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 43
    if-eqz p0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    .line 44
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c01eb

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    const v3, 0x7f0c01e7

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 87
    :goto_0
    return-object v0

    .line 48
    :cond_1
    long-to-float v1, p1

    .line 49
    const v0, 0x7f0c01e5

    .line 50
    cmpl-float v2, v1, v3

    if-lez v2, :cond_2

    .line 51
    const v0, 0x7f0c01e6

    .line 52
    div-float/2addr v1, v4

    .line 54
    :cond_2
    cmpl-float v2, v1, v3

    if-lez v2, :cond_3

    .line 55
    const v0, 0x7f0c01e7

    .line 56
    div-float/2addr v1, v4

    .line 58
    :cond_3
    cmpl-float v2, v1, v3

    if-lez v2, :cond_4

    .line 59
    const v0, 0x7f0c01e8

    .line 60
    div-float/2addr v1, v4

    .line 62
    :cond_4
    cmpl-float v2, v1, v3

    if-lez v2, :cond_5

    .line 63
    const v0, 0x7f0c01e9

    .line 64
    div-float/2addr v1, v4

    .line 66
    :cond_5
    cmpl-float v2, v1, v3

    if-lez v2, :cond_a

    .line 67
    const v0, 0x7f0c01ea

    .line 68
    div-float/2addr v1, v4

    move v8, v0

    move v0, v1

    move v1, v8

    .line 71
    :goto_1
    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v2, v0, v2

    if-gez v2, :cond_7

    .line 72
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v3, "%.2f"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 83
    :goto_2
    if-eqz p3, :cond_6

    .line 84
    invoke-static {v0}, Lcom/qihoo/security/opti/b/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c01eb

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 73
    :cond_7
    const/high16 v2, 0x41200000    # 10.0f

    cmpg-float v2, v0, v2

    if-gez v2, :cond_8

    .line 74
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v3, "%.2f"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 76
    :cond_8
    const/high16 v2, 0x42c80000    # 100.0f

    cmpg-float v2, v0, v2

    if-gez v2, :cond_9

    .line 77
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v3, "%.1f"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 80
    :cond_9
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v3, "%.0f"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_a
    move v8, v0

    move v0, v1

    move v1, v8

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 118
    const-string/jumbo v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 119
    const-string/jumbo v0, "0+?$"

    const-string/jumbo v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 120
    const-string/jumbo v1, "[.]$"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 122
    :cond_0
    return-object p0
.end method

.method public static b(Landroid/content/Context;)J
    .locals 5

    .prologue
    .line 32
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 33
    const-wide/16 v0, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 36
    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c()J

    move-result-wide v0

    add-long/2addr v0, v2

    move-wide v2, v0

    .line 37
    goto :goto_0

    :cond_0
    move-wide v2, v0

    .line 39
    :cond_1
    return-wide v2
.end method
