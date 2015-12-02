.class Lcom/qihoo/a/a/a/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Ldalvik/system/DexClassLoader;

.field private static c:Landroid/content/Context;

.field private static d:Lcom/qihoo/a/a/a/b;


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/qihoo/a/a/a/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/a/a/a/b;->a:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/a/a/a/b;->b:Ldalvik/system/DexClassLoader;

    .line 26
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V
    .locals 5

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/qihoo/a/a/a/b;->e:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Lcom/qihoo/a/a/a/b;->f:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    .line 62
    const-string/jumbo v0, "on"

    sget-object v1, Lcom/qihoo/a/a/a/b;->c:Landroid/content/Context;

    const-string/jumbo v2, "clear_sdk_config"

    const-string/jumbo v3, "Item"

    const-string/jumbo v4, "clear_sdk_update"

    invoke-static {v1, v2, v3, v4}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    new-instance v0, Lcom/qihoo/a/a/a/d;

    sget-object v1, Lcom/qihoo/a/a/a/b;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/a/a/a/b;->f:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/a/a/a/d;-><init>(Landroid/content/Context;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V

    invoke-virtual {v0}, Lcom/qihoo/a/a/a/d;->a()V

    .line 65
    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)Lcom/qihoo/a/a/a/b;
    .locals 2

    .prologue
    .line 35
    const-class v1, Lcom/qihoo/a/a/a/b;

    monitor-enter v1

    :try_start_0
    sput-object p0, Lcom/qihoo/a/a/a/b;->c:Landroid/content/Context;

    .line 36
    sget-object v0, Lcom/qihoo/a/a/a/b;->d:Lcom/qihoo/a/a/a/b;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Lcom/qihoo/a/a/a/b;

    invoke-direct {v0, p1, p2}, Lcom/qihoo/a/a/a/b;-><init>(Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V

    sput-object v0, Lcom/qihoo/a/a/a/b;->d:Lcom/qihoo/a/a/a/b;

    .line 39
    :cond_0
    sget-object v0, Lcom/qihoo/a/a/a/b;->d:Lcom/qihoo/a/a/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static b(Landroid/content/Context;)Ldalvik/system/DexClassLoader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 68
    sget-object v0, Lcom/qihoo/a/a/a/b;->b:Ldalvik/system/DexClassLoader;

    if-nez v0, :cond_0

    .line 69
    const-string/jumbo v0, "oclt.jar"

    const-string/jumbo v1, "oclt.dex"

    invoke-static {p0, v0, v1}, Lcom/qihoo/a/a/a/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ldalvik/system/DexClassLoader;

    move-result-object v0

    sput-object v0, Lcom/qihoo/a/a/a/b;->b:Ldalvik/system/DexClassLoader;

    .line 71
    :cond_0
    sget-object v0, Lcom/qihoo/a/a/a/b;->b:Ldalvik/system/DexClassLoader;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 46
    sget-object v0, Lcom/qihoo/a/a/a/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/a/a/a/b;->b(Landroid/content/Context;)Ldalvik/system/DexClassLoader;

    move-result-object v0

    .line 48
    const-string/jumbo v1, "com.qihoo360.plugin.clear.Entry"

    new-array v2, v6, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/qihoo/a/a/a/e;->a(Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/qihoo/a/a/a/e;->a(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 51
    const-string/jumbo v2, "com.qihoo360.plugin.clear.Entry"

    const-string/jumbo v3, "getModule"

    new-array v4, v9, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v6

    const-class v5, Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    aput-object v5, v4, v7

    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-static {v0, v2, v3, v4}, Lcom/qihoo/a/a/a/e;->a(Ldalvik/system/DexClassLoader;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v9, [Ljava/lang/Object;

    sget-object v3, Lcom/qihoo/a/a/a/b;->c:Landroid/content/Context;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/qihoo/a/a/a/b;->f:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    aput-object v3, v2, v7

    .line 52
    iget-object v3, p0, Lcom/qihoo/a/a/a/b;->e:Ljava/lang/String;

    aput-object v3, v2, v8

    .line 50
    invoke-static {v1, v0, v2}, Lcom/qihoo/a/a/a/e;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    .line 54
    return-object v0
.end method
