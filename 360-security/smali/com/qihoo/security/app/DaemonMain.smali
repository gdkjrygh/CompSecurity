.class public Lcom/qihoo/security/app/DaemonMain;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 31
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string/jumbo v1, "/data/data/com.qihoo.security/files/stopped"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 38
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Z)V

    .line 39
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :cond_0
    :goto_0
    return-void

    .line 41
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Z)V
    .locals 2

    .prologue
    .line 210
    if-nez p0, :cond_0

    .line 212
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string/jumbo v1, "/data/data/com.qihoo.security/files/stopped"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 217
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 219
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 49
    sget-boolean v0, Lcom/qihoo/security/app/DaemonMain;->a:Z

    return v0
.end method

.method private static a(Ljava/lang/String;Ljava/io/File;)Z
    .locals 3

    .prologue
    .line 120
    const/4 v2, 0x0

    .line 123
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/FileReader;

    invoke-direct {v0, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 125
    const-string/jumbo v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 126
    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 128
    if-eqz v1, :cond_0

    .line 129
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 137
    :cond_0
    :goto_0
    return v0

    .line 128
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_1

    .line 129
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    :cond_1
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 132
    :catch_0
    move-exception v0

    .line 137
    const/4 v0, 0x0

    goto :goto_0

    .line 128
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method private static final b()Landroid/content/pm/ApplicationInfo;
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 176
    :try_start_0
    const-string/jumbo v2, "package"

    invoke-static {v2}, Landroid/os/ServiceManager;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    .line 177
    invoke-static {v2}, Landroid/content/pm/IPackageManager$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageManager;

    move-result-object v3

    .line 179
    const-class v2, Landroid/content/pm/IPackageManager;

    .line 180
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    .line 181
    array-length v5, v4

    move v2, v0

    :goto_0
    if-ge v2, v5, :cond_3

    aget-object v0, v4, v2

    .line 182
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v7, "getApplicationInfo"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 187
    :goto_1
    if-nez v0, :cond_1

    move-object v0, v1

    .line 203
    :goto_2
    return-object v0

    .line 181
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 193
    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    if-ne v2, v8, :cond_2

    .line 194
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string/jumbo v5, "com.qihoo.security"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    goto :goto_2

    .line 196
    :cond_2
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string/jumbo v5, "com.qihoo.security"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 198
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 203
    goto :goto_2

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 55
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/app/DaemonMain$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/app/DaemonMain$1;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 61
    return-void
.end method

.method static synthetic c(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 22
    invoke-static {p0}, Lcom/qihoo/security/app/DaemonMain;->d(Landroid/content/Context;)V

    return-void
.end method

.method private static d(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 68
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 71
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 72
    const-class v2, Lcom/qihoo/security/app/DaemonService;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 73
    invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 75
    new-instance v1, Ljava/io/File;

    const-string/jumbo v2, "/data/data/com.qihoo.security/files/stopped"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    .line 77
    invoke-static {p0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Z)V

    .line 78
    if-nez v1, :cond_0

    .line 79
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    .line 82
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 83
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 84
    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "d"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    invoke-static {v1, v3}, Lcom/qihoo/security/app/DaemonMain;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/app/DaemonMain;->a:Z

    .line 117
    :goto_0
    return-void

    .line 93
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 96
    :cond_2
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 98
    const-string/jumbo v4, "export CLASSPATH=%s\nexec app_process %s %s"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    const-class v2, Lcom/qihoo/security/app/DaemonMain;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 103
    const-string/jumbo v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 104
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 105
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-le v0, v1, :cond_3

    .line 106
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/io/File;->setExecutable(Z)Z

    .line 107
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/io/File;->setReadable(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :cond_3
    :goto_1
    sput-boolean v7, Lcom/qihoo/security/app/DaemonMain;->a:Z

    goto :goto_0

    .line 110
    :catch_0
    move-exception v0

    .line 111
    const-string/jumbo v1, "DaemonMain"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public static main([Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 144
    :try_start_0
    invoke-static {}, Lcom/qihoo/security/app/DaemonMain;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 145
    if-nez v1, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 152
    :cond_1
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v2, 0x200000

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 156
    :goto_1
    if-eqz v0, :cond_0

    .line 157
    new-instance v0, Ljava/io/File;

    const-string/jumbo v1, "/data/data/com.qihoo.security/files/stopped"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 163
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write(I)V

    .line 164
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 167
    :catch_0
    move-exception v0

    goto :goto_0

    .line 152
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
