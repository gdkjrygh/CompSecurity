.class public Lcom/qihoo/security/opti/trashclear/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/opti/trashclear/b;

.field private static b:Landroid/content/Context;


# instance fields
.field private final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/b;->a:Lcom/qihoo/security/opti/trashclear/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    new-instance v0, Lcom/qihoo/security/opti/trashclear/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/b$1;-><init>(Lcom/qihoo/security/opti/trashclear/b;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/b;->c:Ljava/util/Comparator;

    .line 46
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    .line 47
    return-void
.end method

.method private a(Landroid/app/ActivityManager;I)I
    .locals 2

    .prologue
    .line 402
    if-eqz p1, :cond_0

    .line 404
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    invoke-virtual {p1, v0}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    move-result-object v0

    .line 405
    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 406
    if-eqz v0, :cond_0

    .line 407
    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 415
    :goto_0
    return v0

    .line 409
    :catch_0
    move-exception v0

    .line 415
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a()Lcom/qihoo/security/opti/trashclear/b;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->a:Lcom/qihoo/security/opti/trashclear/b;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lcom/qihoo/security/opti/trashclear/b;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/b;->a:Lcom/qihoo/security/opti/trashclear/b;

    .line 53
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->a:Lcom/qihoo/security/opti/trashclear/b;

    return-object v0
.end method

.method private a(Ljava/lang/String;I)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 419
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 420
    const-string/jumbo v1, "pkgName"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    const-string/jumbo v1, "pkgMemorySize"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 462
    monitor-enter p1

    .line 463
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/b;->c:Ljava/util/Comparator;

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 464
    monitor-exit p1

    .line 465
    return-void

    .line 464
    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private i()Z
    .locals 2

    .prologue
    .line 325
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/b;->h()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 326
    const/4 v0, 0x1

    .line 328
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 336
    const-string/jumbo v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 338
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 340
    :try_start_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v1

    .line 341
    if-eqz v1, :cond_1

    .line 343
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 345
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 346
    const/4 v2, 0x0

    .line 347
    iget-object v5, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    if-eqz v5, :cond_6

    .line 349
    iget-object v5, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    .line 350
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/b;->a(Landroid/app/ActivityManager;I)I

    move-result v1

    .line 351
    const/4 v6, -0x1

    if-eq v1, v6, :cond_6

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 352
    invoke-direct {p0, v5, v1}, Lcom/qihoo/security/opti/trashclear/b;->a(Ljava/lang/String;I)Ljava/util/HashMap;

    move-result-object v1

    .line 363
    :goto_1
    if-eqz v1, :cond_0

    .line 364
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 369
    :catch_0
    move-exception v0

    .line 374
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 375
    invoke-direct {p0, v3}, Lcom/qihoo/security/opti/trashclear/b;->b(Ljava/util/List;)V

    .line 380
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 381
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 382
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 383
    const-string/jumbo v3, "pkgName"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 384
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 385
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_3

    .line 399
    :cond_5
    return-object v1

    :cond_6
    move-object v1, v2

    goto :goto_1
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 132
    const-string/jumbo v0, ""

    .line 133
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 134
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 135
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 136
    if-le v3, v1, :cond_0

    .line 137
    :goto_0
    if-ge v1, v3, :cond_0

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 137
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move-object v0, v2

    goto :goto_0

    .line 141
    :cond_0
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_pre_pkg_data"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    :goto_1
    return-void

    .line 143
    :cond_1
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_pre_pkg_data"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 64
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "o_c_pre.dat"

    invoke-static {v1, v2}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 71
    :goto_0
    if-nez v0, :cond_0

    .line 73
    :try_start_1
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v2, "o_c_pre.dat"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9

    move-result-object v0

    .line 84
    :cond_0
    :goto_1
    const-string/jumbo v1, ""

    .line 86
    :try_start_2
    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v5, Ljava/util/zip/InflaterInputStream;

    invoke-direct {v5, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string/jumbo v6, "UTF-8"

    invoke-direct {v2, v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    :try_start_3
    new-instance v5, Ljava/io/BufferedReader;

    invoke-direct {v5, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 90
    :goto_2
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 91
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v1, v3

    .line 96
    :goto_3
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    .line 98
    :catch_0
    move-exception v3

    .line 104
    :goto_4
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 105
    invoke-virtual {v2}, Ljava/io/InputStreamReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    move-object v0, v1

    .line 116
    :goto_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 117
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_default_pre_pkg_data"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_1
    return-object v4

    .line 69
    :catch_1
    move-exception v0

    move-object v0, v3

    goto :goto_0

    .line 94
    :cond_2
    :try_start_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, ";"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v1

    goto :goto_3

    .line 104
    :cond_3
    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 105
    invoke-virtual {v2}, Ljava/io/InputStreamReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    move-object v0, v1

    .line 114
    goto :goto_5

    .line 106
    :catch_2
    move-exception v0

    move-object v0, v1

    .line 114
    goto :goto_5

    .line 110
    :catch_3
    move-exception v0

    move-object v0, v1

    .line 115
    goto :goto_5

    .line 106
    :catch_4
    move-exception v0

    move-object v0, v1

    .line 114
    goto :goto_5

    .line 110
    :catch_5
    move-exception v0

    move-object v0, v1

    .line 115
    goto :goto_5

    .line 103
    :catchall_0
    move-exception v1

    move-object v2, v3

    .line 104
    :goto_6
    :try_start_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 105
    invoke-virtual {v2}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 114
    :goto_7
    throw v1

    .line 110
    :catch_6
    move-exception v0

    goto :goto_7

    .line 106
    :catch_7
    move-exception v0

    goto :goto_7

    .line 103
    :catchall_1
    move-exception v1

    goto :goto_6

    .line 98
    :catch_8
    move-exception v2

    move-object v2, v3

    goto :goto_4

    .line 77
    :catch_9
    move-exception v1

    goto :goto_1
.end method

.method public c()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 154
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_pre_pkg_data"

    const-string/jumbo v3, ""

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 156
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "clear_default_pre_pkg_data"

    const-string/jumbo v4, ""

    invoke-static {v0, v3, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 162
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/b;->b()Ljava/util/List;

    move-result-object v0

    .line 163
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 173
    :goto_0
    const/4 v0, 0x0

    .line 174
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 175
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/b;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 187
    :cond_0
    :goto_1
    if-eqz v0, :cond_4

    .line 188
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 189
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 190
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 165
    :cond_2
    const-string/jumbo v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 181
    :cond_3
    const-string/jumbo v3, ";"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 182
    if-eqz v2, :cond_0

    array-length v3, v2

    if-lez v3, :cond_0

    .line 183
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 199
    :cond_4
    return-object v1
.end method

.method public d()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 211
    .line 213
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/b;->e()Z

    move-result v2

    if-nez v2, :cond_2

    .line 216
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/b;->f()Z

    move-result v2

    if-nez v2, :cond_1

    .line 217
    sget-object v2, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "clear_pre_num"

    invoke-static {v2, v3, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 241
    :cond_0
    :goto_0
    return v0

    .line 223
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/b;->i()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public e()Z
    .locals 10

    .prologue
    .line 251
    const/4 v0, 0x1

    .line 253
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 254
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v4, "last_trash_clear_time"

    const-wide/16 v6, 0x0

    invoke-static {v1, v4, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v4

    .line 255
    sub-long v6, v2, v4

    const-wide/32 v8, 0x3dcc500

    cmp-long v1, v6, v8

    if-gtz v1, :cond_0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    .line 256
    :cond_0
    const/4 v0, 0x0

    .line 264
    :cond_1
    return v0
.end method

.method public f()Z
    .locals 6

    .prologue
    .line 274
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 275
    sget-object v2, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "clear_default_pre_last_time"

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 277
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x3dcc500

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 278
    const/4 v0, 0x0

    .line 280
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public g()V
    .locals 3

    .prologue
    .line 298
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "clear_pre_num"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 299
    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 300
    sget-object v1, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_pre_num"

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 302
    :cond_0
    return-void
.end method

.method public h()I
    .locals 3

    .prologue
    .line 311
    sget-object v0, Lcom/qihoo/security/opti/trashclear/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "clear_pre_num"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method
