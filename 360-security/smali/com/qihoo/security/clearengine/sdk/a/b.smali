.class public Lcom/qihoo/security/clearengine/sdk/a/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/v1/main/pt/IPtManager;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Lcom/qihoo360/mobilesafe/support/a/b;

.field private d:Lcom/qihoo360/mobilesafe/support/a/f;

.field private e:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->b:Z

    .line 30
    iput-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->c:Lcom/qihoo360/mobilesafe/support/a/b;

    .line 31
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/f;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/support/a/f;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->d:Lcom/qihoo360/mobilesafe/support/a/f;

    .line 33
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/b$1;-><init>(Lcom/qihoo/security/clearengine/sdk/a/b;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->e:Landroid/content/ServiceConnection;

    .line 57
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    .line 59
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/f;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->d:Lcom/qihoo360/mobilesafe/support/a/f;

    return-object v0
.end method

.method private a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 141
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->d:Lcom/qihoo360/mobilesafe/support/a/f;

    monitor-enter v1

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->c:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_0

    .line 145
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->b:Z

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->d:Lcom/qihoo360/mobilesafe/support/a/f;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 141
    :cond_0
    monitor-exit v1

    .line 149
    return-void

    .line 141
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/sdk/a/b;Lcom/qihoo360/mobilesafe/support/a/b;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->c:Lcom/qihoo360/mobilesafe/support/a/b;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/sdk/a/b;Z)V
    .locals 0

    .prologue
    .line 28
    iput-boolean p1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->b:Z

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/b;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->c:Lcom/qihoo360/mobilesafe/support/a/b;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/clearengine/sdk/a/b;)Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->b:Z

    return v0
.end method


# virtual methods
.method public bindRtService(Landroid/content/Context;Landroid/content/ServiceConnection;)Z
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)Z

    move-result v0

    return v0
.end method

.method public dismissConn(Landroid/content/Context;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;Landroid/content/ServiceConnection;)Z

    .line 74
    return-void
.end method

.method public exec(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 78
    const/4 v1, 0x0

    .line 80
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    const-wide/16 v4, 0x0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    .line 85
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public execp(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/ArrayList;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 90
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    const-wide/16 v2, 0x0

    invoke-static {v0, p2, p3, v2, v3}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)[B

    move-result-object v0

    .line 95
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public execve(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 100
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    .line 101
    if-eqz v0, :cond_0

    .line 102
    const-wide/16 v4, 0x0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I

    move-result v0

    .line 105
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public execvp(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 110
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    .line 111
    if-eqz v0, :cond_0

    .line 112
    const-wide/16 v2, 0x0

    invoke-static {v0, p2, p3, v2, v3}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    move-result v0

    .line 115
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getRtConn(Landroid/content/Context;)Landroid/os/IBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 121
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;)V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->d:Lcom/qihoo360/mobilesafe/support/a/f;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/f;->d()Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/support/a/b;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return-object v0
.end method

.method public isPhoneRted()Z
    .locals 1

    .prologue
    .line 133
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a;->a()Z

    move-result v0

    return v0
.end method

.method public isRtServiceRunning()Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {p0, v1, v1}, Lcom/qihoo/security/clearengine/sdk/a/b;->bindRtService(Landroid/content/Context;Landroid/content/ServiceConnection;)Z

    .line 155
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/b;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->c:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x1

    .line 165
    :goto_1
    return v0

    .line 156
    :catch_0
    move-exception v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 165
    :cond_0
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public requestRtAuth(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 177
    return-void
.end method

.method public unBindRtService(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 2

    .prologue
    .line 181
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;Landroid/content/ServiceConnection;)Z

    .line 182
    return-void
.end method
