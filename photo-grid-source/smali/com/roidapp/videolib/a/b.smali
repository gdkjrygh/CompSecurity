.class final Lcom/roidapp/videolib/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/core/a/c;


# instance fields
.field private a:Lcom/roidapp/videolib/core/a/a;

.field private b:Lcom/roidapp/videolib/core/a/b;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Landroid/os/Messenger;

.field private g:Landroid/os/Messenger;

.field private h:Landroid/os/Handler;

.field private i:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v0, Lcom/roidapp/videolib/a/c;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/a/c;-><init>(Lcom/roidapp/videolib/a/b;)V

    iput-object v0, p0, Lcom/roidapp/videolib/a/b;->h:Landroid/os/Handler;

    .line 160
    new-instance v0, Lcom/roidapp/videolib/a/d;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/a/d;-><init>(Lcom/roidapp/videolib/a/b;)V

    iput-object v0, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    .line 50
    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/a/b;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/videolib/a/b;->g:Landroid/os/Messenger;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->b:Lcom/roidapp/videolib/core/a/b;

    return-object v0
.end method

.method private a(ILjava/lang/Exception;)V
    .locals 6

    .prologue
    .line 193
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->b:Lcom/roidapp/videolib/core/a/b;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->b:Lcom/roidapp/videolib/core/a/b;

    const/4 v2, 0x0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move v1, p1

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/videolib/core/a/b;->a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->g:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->f:Landroid/os/Messenger;

    iput-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 205
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->g:Landroid/os/Messenger;

    invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 208
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/videolib/a/b;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/roidapp/videolib/a/b;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/videolib/a/b;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/videolib/a/b;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/videolib/a/b;->f:Landroid/os/Messenger;

    return-object p1
.end method

.method static synthetic c(Lcom/roidapp/videolib/a/b;)Z
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/videolib/a/b;->d:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/videolib/a/b;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 28
    .line 1179
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 1180
    :goto_0
    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    if-eqz v2, :cond_0

    .line 1182
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1187
    :goto_1
    iput-object v1, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    .line 1189
    :cond_0
    iput-object v1, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    .line 28
    return-void

    :cond_1
    move-object v0, v1

    .line 1179
    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method static synthetic e(Lcom/roidapp/videolib/a/b;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/videolib/a/b;)Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/roidapp/videolib/a/b;->d:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/videolib/a/b;)Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/roidapp/videolib/a/b;->e:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/a;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->a:Lcom/roidapp/videolib/core/a/a;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/a/b;->d:Z

    .line 89
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->h:Landroid/os/Handler;

    const v1, 0xabcde

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 90
    const/4 v0, 0x0

    const v1, 0xaa01

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/a/b;->a(Landroid/os/Message;)V

    .line 91
    return-void
.end method

.method public final a(ZLcom/roidapp/videolib/core/a/a;Lcom/roidapp/videolib/core/a/b;)V
    .locals 4

    .prologue
    const v2, 0xee01

    .line 62
    iput-object p2, p0, Lcom/roidapp/videolib/a/b;->a:Lcom/roidapp/videolib/core/a/a;

    .line 63
    iput-object p3, p0, Lcom/roidapp/videolib/a/b;->b:Lcom/roidapp/videolib/core/a/b;

    .line 64
    iput-boolean p1, p0, Lcom/roidapp/videolib/a/b;->e:Z

    .line 65
    if-eqz p2, :cond_2

    .line 66
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 67
    :goto_0
    if-nez v0, :cond_1

    .line 68
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "context is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2, v0}, Lcom/roidapp/videolib/a/b;->a(ILjava/lang/Exception;)V

    .line 83
    :goto_1
    return-void

    .line 66
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 71
    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    const v1, 0xee04

    invoke-direct {p0, v1, v0}, Lcom/roidapp/videolib/a/b;->a(ILjava/lang/Exception;)V

    goto :goto_1

    .line 82
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "videoEncodeInfo is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2, v0}, Lcom/roidapp/videolib/a/b;->a(ILjava/lang/Exception;)V

    goto :goto_1
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 214
    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 215
    :goto_0
    if-eqz v0, :cond_1

    .line 216
    iget-object v2, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    if-eqz v2, :cond_0

    .line 218
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 224
    :cond_0
    :goto_1
    :try_start_1
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 229
    :goto_2
    iput-object v1, p0, Lcom/roidapp/videolib/a/b;->c:Ljava/lang/ref/WeakReference;

    .line 231
    :cond_1
    iput-object v1, p0, Lcom/roidapp/videolib/a/b;->i:Landroid/content/ServiceConnection;

    .line 232
    return-void

    :cond_2
    move-object v0, v1

    .line 214
    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_1
.end method
