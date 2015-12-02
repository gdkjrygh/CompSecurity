.class public Lcom/qihoo360/mobilesafe/core/d/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/d/a$a;
    }
.end annotation


# static fields
.field private static a:I

.field private static b:I

.field private static c:I

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    const/4 v0, -0x1

    sput v0, Lcom/qihoo360/mobilesafe/core/d/a;->a:I

    .line 75
    const/4 v0, 0x0

    sput v0, Lcom/qihoo360/mobilesafe/core/d/a;->b:I

    .line 76
    const/4 v0, 0x1

    sput v0, Lcom/qihoo360/mobilesafe/core/d/a;->c:I

    .line 77
    const/4 v0, 0x2

    sput v0, Lcom/qihoo360/mobilesafe/core/d/a;->d:I

    .line 78
    return-void
.end method

.method private static final a()I
    .locals 5

    .prologue
    .line 86
    sget v0, Lcom/qihoo360/mobilesafe/core/d/a;->a:I

    if-lez v0, :cond_0

    .line 87
    sget v0, Lcom/qihoo360/mobilesafe/core/d/a;->a:I

    .line 106
    :goto_0
    return v0

    .line 89
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 90
    new-instance v1, Ljava/io/File;

    const-string/jumbo v2, "/proc/%d/stat"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, v1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 94
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    const-string/jumbo v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aget-object v1, v1, v2

    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    sput v1, Lcom/qihoo360/mobilesafe/core/d/a;->a:I

    .line 99
    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :cond_2
    :goto_1
    sget v0, Lcom/qihoo360/mobilesafe/core/d/a;->a:I

    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 41
    const/4 v2, 0x0

    .line 43
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/FileReader;

    invoke-direct {v0, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 46
    if-eqz v1, :cond_0

    .line 47
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 53
    :cond_0
    :goto_0
    return v0

    .line 45
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 46
    :goto_1
    if-eqz v1, :cond_1

    .line 47
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 49
    :cond_1
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    :catch_0
    move-exception v0

    .line 53
    const/4 v0, -0x1

    goto :goto_0

    .line 45
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method private static a(Lcom/qihoo360/mobilesafe/core/d/a$a;)Landroid/app/ActivityManager$RunningAppProcessInfo;
    .locals 2

    .prologue
    .line 266
    const/4 v0, 0x0

    .line 267
    if-eqz p0, :cond_0

    .line 268
    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 269
    iget v1, p0, Lcom/qihoo360/mobilesafe/core/d/a$a;->a:I

    iput v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 270
    iget v1, p0, Lcom/qihoo360/mobilesafe/core/d/a$a;->b:I

    iput v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    .line 271
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/a$a;->d:Ljava/lang/String;

    iput-object v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 272
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/a$a;->c:[Ljava/lang/String;

    iput-object v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    .line 273
    iget v1, p0, Lcom/qihoo360/mobilesafe/core/d/a$a;->f:I

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/d/g;->a(I)I

    move-result v1

    iput v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 280
    :cond_0
    return-object v0
.end method

.method public static a(Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/ActivityManager;",
            "Landroid/content/pm/PackageManager;",
            ")",
            "Ljava/util/List",
            "<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 207
    const/4 v0, 0x0

    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 211
    :try_start_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/a;->a()I

    move-result v1

    .line 213
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    const-string/jumbo v5, "ps"

    invoke-virtual {v4, v5}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v4

    .line 214
    invoke-virtual {v4}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 215
    new-instance v5, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-direct {v6, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 216
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 217
    :cond_0
    :goto_0
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    .line 236
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 237
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v4

    .line 239
    :goto_1
    if-lt v2, v4, :cond_3

    move-object v0, v1

    .line 257
    :cond_1
    :goto_2
    return-object v0

    .line 218
    :cond_2
    const/4 v6, 0x0

    :try_start_2
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x75

    if-ne v6, v7, :cond_0

    .line 219
    const-string/jumbo v6, "\\s+"

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 220
    sget v6, Lcom/qihoo360/mobilesafe/core/d/a;->b:I

    aget-object v6, v4, v6

    const-string/jumbo v7, "u\\d*_a\\d+"

    invoke-virtual {v6, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 221
    new-instance v6, Lcom/qihoo360/mobilesafe/core/d/a$a;

    invoke-direct {v6}, Lcom/qihoo360/mobilesafe/core/d/a$a;-><init>()V

    .line 222
    sget v7, Lcom/qihoo360/mobilesafe/core/d/a;->d:I

    aget-object v7, v4, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 223
    if-ne v7, v1, :cond_0

    .line 226
    sget v7, Lcom/qihoo360/mobilesafe/core/d/a;->c:I

    aget-object v7, v4, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->a:I

    .line 227
    sget v7, Lcom/qihoo360/mobilesafe/core/d/a;->b:I

    aget-object v7, v4, v7

    invoke-static {v7}, Lcom/qihoo360/mobilesafe/core/d/a;->b(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->b:I

    .line 228
    array-length v7, v4

    add-int/lit8 v7, v7, -0x1

    aget-object v4, v4, v7

    iput-object v4, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->d:Ljava/lang/String;

    .line 229
    iget v4, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->b:I

    invoke-virtual {p1, v4}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->c:[Ljava/lang/String;

    .line 230
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v7, "/proc/"

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v7, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->a:I

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string/jumbo v7, "/oom_adj"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo360/mobilesafe/core/d/a;->a(Ljava/lang/String;)I

    move-result v4

    iput v4, v6, Lcom/qihoo360/mobilesafe/core/d/a$a;->f:I

    .line 231
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 246
    :catch_0
    move-exception v1

    goto :goto_2

    .line 240
    :cond_3
    :try_start_3
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/d/a$a;

    .line 241
    if-eqz v0, :cond_4

    .line 242
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/d/a;->a(Lcom/qihoo360/mobilesafe/core/d/a$a;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 239
    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    .line 246
    :catch_1
    move-exception v0

    move-object v0, v1

    goto/16 :goto_2
.end method

.method private static final b(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 261
    const/16 v0, 0x5f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 262
    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit16 v0, v0, 0x2710

    return v0
.end method
