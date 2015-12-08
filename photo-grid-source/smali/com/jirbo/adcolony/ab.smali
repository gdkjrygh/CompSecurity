.class Lcom/jirbo/adcolony/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[B

.field static b:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/16 v0, 0x400

    new-array v0, v0, [B

    sput-object v0, Lcom/jirbo/adcolony/ab;->a:[B

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/ab;->b:Ljava/lang/StringBuilder;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    return-void
.end method

.method static a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 41
    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 42
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :goto_0
    return-object v0

    .line 46
    :catch_0
    move-exception v0

    const-string v0, "Failed to retrieve package info."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->e(Ljava/lang/String;)V

    .line 47
    const-string v0, "1.0"

    goto :goto_0
.end method

.method static a(DI)Ljava/lang/String;
    .locals 2

    .prologue
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    invoke-static {p0, p1, p2, v0}, Lcom/jirbo/adcolony/ab;->a(DILjava/lang/StringBuilder;)V

    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 138
    if-eqz p0, :cond_2

    .line 142
    :try_start_0
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Loading "

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 143
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 144
    sget-object v4, Lcom/jirbo/adcolony/ab;->a:[B

    monitor-enter v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :try_start_1
    sget-object v0, Lcom/jirbo/adcolony/ab;->b:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 147
    sget-object v0, Lcom/jirbo/adcolony/ab;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    sget-object v0, Lcom/jirbo/adcolony/ab;->a:[B

    const/4 v2, 0x0

    sget-object v5, Lcom/jirbo/adcolony/ab;->a:[B

    array-length v5, v5

    invoke-virtual {v3, v0, v2, v5}, Ljava/io/FileInputStream;->read([BII)I

    move-result v0

    move v2, v0

    .line 149
    :goto_0
    const/4 v0, -0x1

    if-eq v2, v0, :cond_1

    move v0, v1

    .line 151
    :goto_1
    if-ge v0, v2, :cond_0

    .line 153
    sget-object v5, Lcom/jirbo/adcolony/ab;->b:Ljava/lang/StringBuilder;

    sget-object v6, Lcom/jirbo/adcolony/ab;->a:[B

    aget-byte v6, v6, v0

    int-to-char v6, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 155
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/ab;->a:[B

    const/4 v2, 0x0

    sget-object v5, Lcom/jirbo/adcolony/ab;->a:[B

    array-length v5, v5

    invoke-virtual {v3, v0, v2, v5}, Ljava/io/FileInputStream;->read([BII)I

    move-result v0

    move v2, v0

    goto :goto_0

    .line 157
    :cond_1
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 159
    sget-object v0, Lcom/jirbo/adcolony/ab;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    monitor-exit v4

    .line 168
    :goto_2
    return-object v0

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 164
    :catch_0
    move-exception v0

    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "Unable to load "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 165
    const-string v0, ""

    goto :goto_2

    .line 168
    :cond_2
    const-string v0, ""

    goto :goto_2
.end method

.method static a(DILjava/lang/StringBuilder;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0xa

    const/16 v7, 0x30

    .line 82
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 84
    :cond_0
    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 122
    :cond_1
    :goto_0
    return-void

    .line 88
    :cond_2
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_3

    .line 90
    neg-double p0, p0

    .line 91
    const/16 v0, 0x2d

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    :cond_3
    if-nez p2, :cond_4

    .line 96
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_4
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    int-to-double v2, p2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-long v2, v0

    .line 101
    long-to-double v0, v2

    mul-double/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    .line 102
    div-long v4, v0, v2

    invoke-virtual {p3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 103
    const/16 v4, 0x2e

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    rem-long v4, v0, v2

    .line 105
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_5

    .line 107
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_1

    .line 109
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 114
    :cond_5
    mul-long v0, v4, v8

    :goto_2
    cmp-long v6, v0, v2

    if-gez v6, :cond_6

    .line 116
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    mul-long/2addr v0, v8

    goto :goto_2

    .line 118
    :cond_6
    invoke-virtual {p3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method static a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 27
    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 28
    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    const/4 v0, 0x1

    .line 33
    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    :try_start_0
    invoke-static {p0}, Lcom/jirbo/adcolony/ai;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 59
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static c()D
    .locals 4

    .prologue
    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 133
    const-string v0, ""

    invoke-static {p0, v0}, Lcom/jirbo/adcolony/ab;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static d()Z
    .locals 3

    .prologue
    .line 126
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCStorage;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/../lib/libImmEndpointWarpJ.so"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 128
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static e()Z
    .locals 2

    .prologue
    .line 173
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.VIBRATE"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
