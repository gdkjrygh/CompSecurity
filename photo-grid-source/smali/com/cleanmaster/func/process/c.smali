.class public Lcom/cleanmaster/func/process/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J

.field private static b:Ljava/lang/reflect/Method;

.field private static c:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 113
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/cleanmaster/func/process/c;->a:J

    .line 178
    sput-object v2, Lcom/cleanmaster/func/process/c;->b:Ljava/lang/reflect/Method;

    .line 223
    sput-object v2, Lcom/cleanmaster/func/process/c;->c:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static a()J
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 39
    new-instance v2, Lcom/cleanmaster/util/o;

    invoke-direct {v2}, Lcom/cleanmaster/util/o;-><init>()V

    .line 40
    invoke-virtual {v2}, Lcom/cleanmaster/util/o;->a()V

    .line 42
    invoke-virtual {v2}, Lcom/cleanmaster/util/o;->c()J

    move-result-wide v0

    invoke-virtual {v2}, Lcom/cleanmaster/util/o;->d()J

    move-result-wide v4

    add-long/2addr v0, v4

    .line 46
    invoke-virtual {v2}, Lcom/cleanmaster/util/o;->b()J

    move-result-wide v4

    .line 48
    cmp-long v3, v8, v4

    if-gez v3, :cond_0

    sget-wide v6, Lcom/cleanmaster/func/process/c;->a:J

    cmp-long v3, v6, v4

    if-gez v3, :cond_0

    const-wide v6, 0x1900000000L

    cmp-long v3, v4, v6

    if-gez v3, :cond_0

    .line 50
    invoke-virtual {v2}, Lcom/cleanmaster/util/o;->b()J

    move-result-wide v2

    sput-wide v2, Lcom/cleanmaster/func/process/c;->a:J

    .line 54
    :cond_0
    cmp-long v2, v0, v8

    if-lez v2, :cond_1

    sget-wide v2, Lcom/cleanmaster/func/process/c;->a:J

    cmp-long v2, v2, v0

    if-gtz v2, :cond_2

    .line 58
    :cond_1
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 59
    invoke-static {v0}, Lcom/cleanmaster/func/process/c;->a(Landroid/content/Context;)Landroid/app/ActivityManager$MemoryInfo;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    iget-wide v2, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    cmp-long v1, v8, v2

    if-gez v1, :cond_3

    iget-wide v2, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    sget-wide v4, Lcom/cleanmaster/func/process/c;->a:J

    cmp-long v1, v2, v4

    if-gez v1, :cond_3

    .line 61
    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 70
    :cond_2
    :goto_0
    return-wide v0

    .line 63
    :cond_3
    sget-wide v0, Lcom/cleanmaster/func/process/c;->a:J

    long-to-float v0, v0

    const v1, 0x3e19999a    # 0.15f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Landroid/app/ActivityManager$MemoryInfo;
    .locals 2

    .prologue
    .line 120
    if-nez p0, :cond_0

    .line 121
    const/4 v0, 0x0

    .line 132
    :goto_0
    return-object v0

    .line 123
    :cond_0
    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 126
    :try_start_0
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 127
    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 132
    goto :goto_0

    .line 129
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method public static b()J
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 81
    const-string v0, "/proc/meminfo"

    .line 86
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 87
    new-instance v0, Ljava/io/BufferedReader;

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 88
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 89
    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    const-string v3, "kB"

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v2, v1

    .line 91
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 92
    const-wide/16 v0, 0x400

    mul-long/2addr v0, v2

    .line 94
    cmp-long v2, v4, v0

    if-gez v2, :cond_0

    sget-wide v2, Lcom/cleanmaster/func/process/c;->a:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    const-wide v2, 0x1900000000L

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    .line 95
    sput-wide v0, Lcom/cleanmaster/func/process/c;->a:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    :cond_0
    :goto_0
    return-wide v0

    .line 105
    :catch_0
    move-exception v0

    sget-wide v0, Lcom/cleanmaster/func/process/c;->a:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_1

    .line 106
    const-wide/16 v0, 0x1

    goto :goto_0

    .line 108
    :cond_1
    sget-wide v0, Lcom/cleanmaster/func/process/c;->a:J

    goto :goto_0
.end method
