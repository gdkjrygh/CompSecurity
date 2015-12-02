.class Lcom/facebook/common/m/b;
.super Ljava/lang/Object;
.source "DNSResolver.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/net/InetAddress;

.field private c:Lcom/facebook/common/m/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/common/m/b;->a:Ljava/lang/String;

    .line 27
    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/common/m/c;)V
    .locals 1

    .prologue
    .line 51
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/common/m/b;->c:Lcom/facebook/common/m/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit p0

    return-void

    .line 51
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Ljava/net/InetAddress;)V
    .locals 1

    .prologue
    .line 43
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/common/m/b;->b:Ljava/net/InetAddress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit p0

    return-void

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a()Ljava/net/InetAddress;
    .locals 1

    .prologue
    .line 47
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/m/b;->b:Ljava/net/InetAddress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Lcom/facebook/common/m/c;
    .locals 1

    .prologue
    .line 55
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/m/b;->c:Lcom/facebook/common/m/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lcom/facebook/common/m/c;->TimedOut:Lcom/facebook/common/m/c;

    invoke-direct {p0, v0}, Lcom/facebook/common/m/b;->a(Lcom/facebook/common/m/c;)V

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/m/b;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    .line 33
    invoke-direct {p0, v0}, Lcom/facebook/common/m/b;->a(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 39
    :goto_0
    sget-object v0, Lcom/facebook/common/m/c;->Success:Lcom/facebook/common/m/c;

    invoke-direct {p0, v0}, Lcom/facebook/common/m/b;->a(Lcom/facebook/common/m/c;)V

    .line 40
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    sget-object v0, Lcom/facebook/common/m/c;->UnknownHost:Lcom/facebook/common/m/c;

    invoke-direct {p0, v0}, Lcom/facebook/common/m/b;->a(Lcom/facebook/common/m/c;)V

    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    sget-object v0, Lcom/facebook/common/m/c;->SecurityException:Lcom/facebook/common/m/c;

    invoke-direct {p0, v0}, Lcom/facebook/common/m/b;->a(Lcom/facebook/common/m/c;)V

    goto :goto_0
.end method
