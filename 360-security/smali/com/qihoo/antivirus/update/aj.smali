.class public Lcom/qihoo/antivirus/update/aj;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method private static a(Landroid/content/Context;Ljava/lang/String;I)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 103
    const-string/jumbo v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    .line 110
    :goto_0
    const/4 v2, 0x2

    if-ne p2, v2, :cond_2

    .line 111
    if-nez v1, :cond_3

    .line 119
    :cond_0
    :goto_1
    return v0

    .line 107
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    goto :goto_0

    .line 115
    :cond_2
    if-nez v1, :cond_0

    .line 119
    :cond_3
    const/4 v0, -0x3

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 8

    .prologue
    const/16 v7, 0xe

    const/16 v6, 0xd

    const/4 v3, 0x0

    const/4 v0, -0x3

    const/4 v1, 0x1

    .line 123
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 124
    if-nez v4, :cond_1

    .line 171
    :cond_0
    :goto_0
    return v0

    .line 132
    :cond_1
    const/4 v2, 0x0

    .line 134
    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v4, p1, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 136
    iget-object v2, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v1

    .line 146
    :goto_1
    const/4 v4, 0x2

    if-ne p3, v4, :cond_2

    .line 147
    if-nez v3, :cond_0

    move v0, v1

    .line 148
    goto :goto_0

    .line 151
    :cond_2
    if-eqz v3, :cond_0

    .line 152
    if-ne p3, v1, :cond_3

    move v0, v1

    .line 153
    goto :goto_0

    .line 155
    :cond_3
    invoke-virtual {p2, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    .line 159
    if-nez v2, :cond_5

    const/16 v3, 0xa

    if-eq p3, v3, :cond_4

    if-eq p3, v6, :cond_4

    if-ne p3, v7, :cond_5

    :cond_4
    move v0, v1

    .line 160
    goto :goto_0

    .line 162
    :cond_5
    if-lez v2, :cond_7

    const/16 v3, 0xc

    if-eq p3, v3, :cond_6

    if-eq p3, v7, :cond_6

    const/16 v3, 0xf

    if-ne p3, v3, :cond_7

    :cond_6
    move v0, v1

    .line 163
    goto :goto_0

    .line 165
    :cond_7
    if-gez v2, :cond_0

    const/16 v2, 0xb

    if-eq p3, v2, :cond_8

    if-eq p3, v6, :cond_8

    const/16 v2, 0xf

    if-ne p3, v2, :cond_0

    :cond_8
    move v0, v1

    .line 166
    goto :goto_0

    .line 139
    :catch_0
    move-exception v1

    goto :goto_0

    .line 137
    :catch_1
    move-exception v4

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 179
    invoke-static {p1, p4}, Lcom/qihoo/antivirus/update/aj;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 180
    if-gez v1, :cond_1

    .line 209
    :cond_0
    :goto_0
    return v0

    .line 186
    :cond_1
    invoke-static {p2, p5, p3, p6}, Lcom/qihoo/antivirus/update/aj;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 187
    if-ltz v2, :cond_0

    .line 193
    if-nez v1, :cond_2

    if-nez v2, :cond_2

    .line 194
    const/4 v0, 0x0

    goto :goto_0

    .line 197
    :cond_2
    if-lez v1, :cond_3

    .line 198
    invoke-static {p0, p1, v1}, Lcom/qihoo/antivirus/update/aj;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 199
    if-ltz v0, :cond_0

    .line 203
    :cond_3
    if-lez v2, :cond_4

    .line 204
    invoke-static {p0, p2, p3, v2}, Lcom/qihoo/antivirus/update/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 205
    if-ltz v0, :cond_0

    .line 209
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 36
    .line 38
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    const/4 v0, 0x2

    .line 48
    :goto_0
    return v0

    .line 42
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 48
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 75
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 76
    const/4 v0, 0x0

    .line 81
    :goto_0
    return v0

    .line 78
    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    .line 79
    invoke-static {p1}, Lcom/qihoo/antivirus/update/aj;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 81
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 85
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    .line 86
    const/4 v0, 0x0

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 88
    :cond_1
    if-eqz p0, :cond_2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    .line 89
    invoke-static {p1}, Lcom/qihoo/antivirus/update/aj;->a(Ljava/lang/String;)I

    move-result v1

    .line 90
    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 93
    invoke-static {p3}, Lcom/qihoo/antivirus/update/aj;->b(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 95
    :cond_2
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 96
    invoke-static {p1}, Lcom/qihoo/antivirus/update/aj;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 53
    const-string/jumbo v0, "=="

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const/16 v0, 0xa

    .line 71
    :goto_0
    return v0

    .line 56
    :cond_0
    const-string/jumbo v0, "<"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    const/16 v0, 0xb

    goto :goto_0

    .line 59
    :cond_1
    const-string/jumbo v0, ">"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 60
    const/16 v0, 0xc

    goto :goto_0

    .line 62
    :cond_2
    const-string/jumbo v0, "<="

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    const/16 v0, 0xd

    goto :goto_0

    .line 65
    :cond_3
    const-string/jumbo v0, ">="

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    const/16 v0, 0xe

    goto :goto_0

    .line 68
    :cond_4
    const-string/jumbo v0, "!="

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 69
    const/16 v0, 0xf

    goto :goto_0

    .line 71
    :cond_5
    const/4 v0, -0x1

    goto :goto_0
.end method
