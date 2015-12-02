.class public final Lcom/qihoo/security/app/d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/app/d$1;,
        Lcom/qihoo/security/app/d$a;,
        Lcom/qihoo/security/app/d$b;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/app/d;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/os/IInterface;",
            ">;",
            "Lcom/qihoo/security/app/d$b",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/app/d;->b:Ljava/util/Map;

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/d;->c:Landroid/content/Context;

    .line 45
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/qihoo/security/app/d;
    .locals 3

    .prologue
    .line 31
    const-class v1, Lcom/qihoo/security/app/d;

    monitor-enter v1

    .line 32
    :try_start_0
    sget-object v0, Lcom/qihoo/security/app/d;->a:Lcom/qihoo/security/app/d;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lcom/qihoo/security/app/d;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/app/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/app/d;->a:Lcom/qihoo/security/app/d;

    .line 35
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    sget-object v0, Lcom/qihoo/security/app/d;->a:Lcom/qihoo/security/app/d;

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;Landroid/content/Intent;ZLcom/qihoo/security/app/d$a;)Landroid/os/IInterface;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/IInterface;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Landroid/content/Intent;",
            "Z",
            "Lcom/qihoo/security/app/d$a",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 167
    new-instance v1, Lcom/qihoo/security/app/d$b;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/qihoo/security/app/d$b;-><init>(Lcom/qihoo/security/app/d$1;)V

    .line 168
    iput-boolean p3, v1, Lcom/qihoo/security/app/d$b;->d:Z

    .line 169
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    iput-object v0, v1, Lcom/qihoo/security/app/d$b;->e:Landroid/content/Intent;

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/app/d;->c:Landroid/content/Context;

    iput-object v0, v1, Lcom/qihoo/security/app/d$b;->f:Landroid/content/Context;

    .line 171
    iput-object p1, v1, Lcom/qihoo/security/app/d$b;->a:Ljava/lang/Class;

    .line 172
    iput-object p4, v1, Lcom/qihoo/security/app/d$b;->h:Lcom/qihoo/security/app/d$a;

    .line 173
    const-class v0, Lcom/qihoo/security/app/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    .line 175
    check-cast v0, Landroid/os/IInterface;

    .line 176
    iput-object v0, v1, Lcom/qihoo/security/app/d$b;->b:Landroid/os/IInterface;

    .line 179
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/app/d;->c:Landroid/content/Context;

    iget-object v3, v1, Lcom/qihoo/security/app/d$b;->e:Landroid/content/Intent;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/app/d;->b:Ljava/util/Map;

    monitor-enter v2

    .line 186
    :try_start_1
    iget-object v3, p0, Lcom/qihoo/security/app/d;->b:Ljava/util/Map;

    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    monitor-exit v2

    .line 188
    return-object v0

    .line 187
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 180
    :catch_0
    move-exception v2

    goto :goto_0
.end method
