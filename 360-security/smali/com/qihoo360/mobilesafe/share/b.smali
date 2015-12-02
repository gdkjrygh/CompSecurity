.class public Lcom/qihoo360/mobilesafe/share/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/v1/main/IIpcPrefManager;


# static fields
.field private static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo360/i/v1/main/IIpcPref;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Ljava/io/File;

.field private static c:Ljava/io/File;

.field private static d:Ljava/lang/String;

.field private static e:Lcom/qihoo360/mobilesafe/share/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/share/b;->a:Ljava/util/HashMap;

    .line 48
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    new-instance v1, Lcom/qihoo360/mobilesafe/share/b;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/share/b;-><init>()V

    sput-object v1, Lcom/qihoo360/mobilesafe/share/b;->e:Lcom/qihoo360/mobilesafe/share/b;

    .line 53
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/b;->a(Landroid/content/Context;)V

    .line 54
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/b;->c(Landroid/content/Context;)V

    .line 55
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    return-void
.end method

.method private static a(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;
    .locals 3

    .prologue
    .line 158
    .line 159
    sget-object v1, Lcom/qihoo360/mobilesafe/share/b;->a:Ljava/util/HashMap;

    monitor-enter v1

    .line 160
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/i/v1/main/IIpcPref;

    .line 161
    if-nez v0, :cond_0

    .line 162
    new-instance v0, Lcom/qihoo360/mobilesafe/share/a;

    sget-object v2, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-direct {v0, v2, p0}, Lcom/qihoo360/mobilesafe/share/a;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 163
    sget-object v2, Lcom/qihoo360/mobilesafe/share/b;->a:Ljava/util/HashMap;

    invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    :cond_0
    monitor-exit v1

    .line 166
    return-object v0

    .line 165
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a()Lcom/qihoo360/mobilesafe/share/b;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->e:Lcom/qihoo360/mobilesafe/share/b;

    return-object v0
.end method

.method private static declared-synchronized a(Landroid/content/Context;)V
    .locals 6

    .prologue
    .line 65
    const-class v2, Lcom/qihoo360/mobilesafe/share/b;

    monitor-enter v2

    :try_start_0
    new-instance v3, Lcom/qihoo360/mobilesafe/share/e;

    const-string/jumbo v0, "com.qihoo360.mobilesafe.lite.share.IpcPrefManager.socklock_security"

    invoke-direct {v3, v0}, Lcom/qihoo360/mobilesafe/share/e;-><init>(Ljava/lang/String;)V

    .line 66
    const/16 v0, 0x3a98

    invoke-virtual {v3, v0}, Lcom/qihoo360/mobilesafe/share/e;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    const-string/jumbo v0, "IpcPrefManager"

    const-string/jumbo v1, "failed to lock: can\'t wait ipc pref ready"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "IpcPref: get lock failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    .line 72
    :cond_0
    const/4 v1, 0x0

    .line 74
    :try_start_1
    const-string/jumbo v0, "ipc_pref.525.1"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 78
    :try_start_2
    invoke-virtual {v3}, Lcom/qihoo360/mobilesafe/share/e;->b()V

    .line 81
    :goto_0
    if-nez v0, :cond_1

    .line 82
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "NativeLoader.load ipc_pref.525.1 failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    :catch_0
    move-exception v0

    .line 76
    :try_start_3
    const-string/jumbo v4, "IpcPrefManager"

    const-string/jumbo v5, "NativeLoader.load"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    :try_start_4
    invoke-virtual {v3}, Lcom/qihoo360/mobilesafe/share/e;->b()V

    move v0, v1

    .line 79
    goto :goto_0

    .line 78
    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Lcom/qihoo360/mobilesafe/share/e;->b()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 84
    :cond_1
    monitor-exit v2

    return-void
.end method

.method private static b(Landroid/content/Context;)Ljava/io/File;
    .locals 7

    .prologue
    .line 87
    const/4 v1, 0x0

    .line 89
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 90
    const-string/jumbo v2, "getSharedPrefsFile"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    const-string/jumbo v2, "test"

    .line 94
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    .line 95
    if-eqz v0, :cond_0

    .line 96
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 107
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 108
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/qihoo360/mobilesafe/share/b;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "shared_prefs"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 110
    :cond_1
    return-object v0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    :goto_1
    const-string/jumbo v2, "IpcPrefManager"

    const-string/jumbo v3, "getSharedPrefsFile failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    .line 105
    goto :goto_0

    .line 101
    :catch_1
    move-exception v0

    .line 102
    :goto_2
    const-string/jumbo v2, "IpcPrefManager"

    const-string/jumbo v3, "getSharedPrefsFile failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    .line 105
    goto :goto_0

    .line 103
    :catch_2
    move-exception v0

    .line 104
    :goto_3
    const-string/jumbo v2, "IpcPrefManager"

    const-string/jumbo v3, "getSharedPrefsFile failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    goto :goto_0

    .line 103
    :catch_3
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    .line 101
    :catch_4
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2

    .line 99
    :catch_5
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/16 v4, 0x1f9

    const/4 v3, -0x1

    .line 114
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/share/b;->c:Ljava/io/File;

    .line 115
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->c:Ljava/io/File;

    if-nez v0, :cond_0

    .line 116
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "context.getFilesDir() failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/share/b;->d:Ljava/lang/String;

    .line 119
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 120
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "context.getPackageName() failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_1
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/b;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    .line 124
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_2

    .line 130
    const-string/jumbo v0, "dummy"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 132
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 133
    const-string/jumbo v1, "dummy"

    const-string/jumbo v2, "dummy"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 134
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 135
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 136
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " mkdir failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_2
    sget-object v0, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v3, v3}, Landroid/os/FileUtils;->setPermissions(Ljava/lang/String;III)I

    .line 143
    :cond_3
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/qihoo360/mobilesafe/share/b;->b:Ljava/io/File;

    const-string/jumbo v2, "ipc_pref"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 145
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_5

    .line 146
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v2

    if-nez v2, :cond_4

    .line 147
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, " mkdir failed"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 149
    :cond_4
    invoke-static {v1, v4, v3, v3}, Landroid/os/FileUtils;->setPermissions(Ljava/lang/String;III)I

    .line 152
    :cond_5
    invoke-static {v1}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefInit(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 153
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ipc pref init failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :cond_6
    return-void
.end method


# virtual methods
.method public getDefaultSharedPreferences()Lcom/qihoo360/i/v1/main/IIpcPref;
    .locals 2

    .prologue
    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/qihoo360/mobilesafe/share/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "_preferences"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/share/b;->getSharedPreferences(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    return-object v0
.end method

.method public getSharedPreferences(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;
    .locals 1

    .prologue
    .line 171
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/share/b;->a(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    return-object v0
.end method

.method public varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 181
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
