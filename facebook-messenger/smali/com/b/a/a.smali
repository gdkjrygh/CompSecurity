.class Lcom/b/a/a;
.super Ljava/lang/Object;
.source "ActivityManagerProxifier.java"


# static fields
.field private static final GLOBAL_DEFAULT_INSTANCE:Ljava/lang/String; = "gDefault"

.field private static final SINGLETON_CLASSNAME:Ljava/lang/String; = "android.util.Singleton"

.field private static final SINGLETON_INSTANCE:Ljava/lang/String; = "mInstance"

.field private static final TAG:Ljava/lang/String;

.field private static job:Lcom/b/a/c;

.field private static sOldActivityManager:Landroid/app/IActivityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/b/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createActivityManagerProxy(Landroid/app/IActivityManager;)Landroid/app/IActivityManager;
    .locals 4

    .prologue
    .line 92
    invoke-static {}, Lcom/b/a/a;->createDataProxy()Lcom/b/a/b;

    move-result-object v0

    .line 93
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    packed-switch v1, :pswitch_data_0

    .line 111
    new-instance v0, Lcom/b/a/d;

    const-string v1, "IActivityManagerProxy"

    invoke-direct {v0, v1}, Lcom/b/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :pswitch_0
    new-instance v1, Landroid/a/a;

    invoke-direct {v1, p0, v0}, Landroid/a/a;-><init>(Landroid/app/IActivityManager;Lcom/b/a/b;)V

    .line 104
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Landroid/app/IActivityManager;

    aput-object v3, v0, v2

    .line 105
    const-class v2, Landroid/app/IActivityManager;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/IActivityManager;

    .line 109
    return-object v0

    .line 93
    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static createDataProxy()Lcom/b/a/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/b/a/b",
            "<",
            "Landroid/os/StrictMode$ViolationInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 69
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    packed-switch v0, :pswitch_data_0

    .line 84
    new-instance v0, Lcom/b/a/d;

    const-string v1, "ViolationInfoProxy"

    invoke-direct {v0, v1}, Lcom/b/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :pswitch_0
    new-instance v0, Lcom/b/a/g;

    sget-object v1, Lcom/b/a/a;->job:Lcom/b/a/c;

    invoke-direct {v0, v1}, Lcom/b/a/g;-><init>(Lcom/b/a/c;)V

    .line 86
    :goto_0
    return-object v0

    .line 81
    :pswitch_1
    new-instance v0, Lcom/b/a/h;

    sget-object v1, Lcom/b/a/a;->job:Lcom/b/a/c;

    invoke-direct {v0, v1}, Lcom/b/a/h;-><init>(Lcom/b/a/c;)V

    goto :goto_0

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static enableUniqueViolations(ZLcom/b/a/c;)V
    .locals 4

    .prologue
    .line 117
    sput-object p1, Lcom/b/a/a;->job:Lcom/b/a/c;

    .line 119
    const-class v1, Lcom/b/a/a;

    monitor-enter v1

    .line 120
    if-eqz p0, :cond_0

    :try_start_0
    sget-object v0, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    if-nez v0, :cond_0

    .line 121
    invoke-static {}, Landroid/app/ActivityManagerNative;->getDefault()Landroid/app/IActivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 125
    :try_start_1
    invoke-static {v0}, Lcom/b/a/a;->createActivityManagerProxy(Landroid/app/IActivityManager;)Landroid/app/IActivityManager;
    :try_end_1
    .catch Lcom/b/a/d; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 132
    :try_start_2
    invoke-static {v0}, Lcom/b/a/a;->replaceActivityManager(Landroid/app/IActivityManager;)Landroid/app/IActivityManager;

    move-result-object v0

    sput-object v0, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    .line 133
    sget-object v0, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    if-nez v0, :cond_1

    .line 134
    new-instance v0, Lcom/b/a/d;

    const-string v2, "replaceActivityManager"

    invoke-direct {v0, v2}, Lcom/b/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 143
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 126
    :catch_0
    move-exception v0

    .line 127
    :try_start_3
    sget-object v2, Lcom/b/a/a;->TAG:Ljava/lang/String;

    const-string v3, "This is likely a new version of Android not yet supported. To add support, look at //android-prebuilt/readme.md"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 129
    monitor-exit v1

    .line 144
    :goto_0
    return-void

    .line 136
    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    if-eqz v0, :cond_1

    .line 137
    sget-object v0, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    invoke-static {v0}, Lcom/b/a/a;->replaceActivityManager(Landroid/app/IActivityManager;)Landroid/app/IActivityManager;

    move-result-object v0

    .line 138
    const/4 v2, 0x0

    sput-object v2, Lcom/b/a/a;->sOldActivityManager:Landroid/app/IActivityManager;

    .line 139
    if-nez v0, :cond_1

    .line 140
    new-instance v0, Lcom/b/a/d;

    const-string v2, "replaceActivityManager"

    invoke-direct {v0, v2}, Lcom/b/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 143
    :cond_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method

.method private static replaceActivityManager(Landroid/app/IActivityManager;)Landroid/app/IActivityManager;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 30
    invoke-static {}, Landroid/app/ActivityManagerNative;->getDefault()Landroid/app/IActivityManager;

    .line 34
    :try_start_0
    const-class v0, Landroid/app/ActivityManagerNative;

    .line 35
    const-string v2, "gDefault"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 36
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 38
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 42
    const-class v4, Landroid/app/IActivityManager;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 44
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/IActivityManager;

    .line 45
    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    :goto_0
    return-object v0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "android.util.Singleton"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    .line 51
    goto :goto_0

    .line 54
    :cond_1
    const-string v2, "mInstance"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 55
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/IActivityManager;

    .line 58
    invoke-virtual {v2, v3, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    sget-object v2, Lcom/b/a/a;->TAG:Ljava/lang/String;

    const-string v3, "Failed to replace activity manager."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    .line 63
    goto :goto_0
.end method
