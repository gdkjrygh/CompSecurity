.class public final Lkik/android/g/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 131
    if-nez p0, :cond_0

    .line 132
    const-string p0, "0"

    .line 134
    :cond_0
    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public static a(Landroid/content/Context;Lkik/a/e/r;Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x1

    .line 144
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 145
    :cond_0
    const-string v0, ""

    .line 163
    :goto_0
    return-object v0

    .line 147
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v5, :cond_3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 149
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 150
    if-eqz v0, :cond_2

    .line 151
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 154
    const/4 v3, -0x1

    invoke-static {p0, p1, v0, v4, v3}, Lkik/android/g/c;->a(Landroid/content/Context;Lkik/a/e/r;Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 157
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-le v0, v4, :cond_4

    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, ""

    invoke-virtual {v2, v0, v1, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    :cond_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_5

    .line 161
    const-string v0, "..."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lkik/a/e/r;Lkik/a/d/k;ZI)Ljava/lang/String;
    .locals 3

    .prologue
    const v2, 0x7f090202

    .line 173
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 174
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lkik/a/d/k;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 175
    instance-of v0, p2, Lkik/a/d/n;

    if-eqz v0, :cond_2

    move-object v0, p2

    .line 178
    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    .line 180
    invoke-virtual {p2}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0, p1, p4}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;I)Ljava/lang/String;

    move-result-object v0

    .line 189
    :cond_0
    :goto_0
    return-object v0

    .line 180
    :cond_1
    invoke-virtual {p2}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 183
    :cond_2
    invoke-virtual {p2}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 184
    :goto_1
    if-eqz p3, :cond_0

    .line 185
    invoke-static {v0}, Lkik/android/util/cq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 183
    :cond_3
    invoke-virtual {p2}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Lkik/a/d/s;Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v4, 0x1

    const/4 v7, -0x1

    const/4 v3, 0x0

    .line 61
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 65
    if-eqz v0, :cond_7

    .line 66
    const-string v1, "com.kik.ext.camera"

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "com.kik.ext.gallery"

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_0
    move v2, v4

    .line 71
    :goto_0
    const-string v5, ""

    .line 72
    if-eqz p0, :cond_6

    .line 73
    invoke-virtual {p0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 74
    invoke-virtual {p0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v1

    :goto_1
    move v6, v3

    move v5, v7

    .line 85
    :goto_2
    const/16 v8, 0xa

    if-ge v6, v8, :cond_2

    .line 86
    if-eqz v1, :cond_2

    .line 87
    const/16 v8, 0x20

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v1, v8, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 91
    if-eq v5, v7, :cond_2

    .line 92
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 76
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 77
    const-class v1, Lkik/a/d/a/d;

    invoke-static {p0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/d;

    .line 78
    if-eqz v1, :cond_6

    .line 79
    invoke-virtual {v1}, Lkik/a/d/a/d;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 95
    :cond_2
    if-eq v5, v7, :cond_3

    .line 96
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "..."

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 99
    :cond_3
    if-eqz v2, :cond_4

    .line 100
    const v0, 0x7f090188

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 105
    :goto_3
    return-object v0

    .line 102
    :cond_4
    if-eqz v0, :cond_5

    .line 103
    const v1, 0x7f090186

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_3

    :cond_6
    move-object v1, v5

    goto :goto_1

    :cond_7
    move v2, v3

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 25
    if-nez p0, :cond_0

    .line 33
    :goto_0
    return v0

    .line 29
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.google.android.wearable.app"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    const/4 v0, 0x1

    goto :goto_0

    .line 33
    :catch_0
    move-exception v1

    goto :goto_0
.end method
