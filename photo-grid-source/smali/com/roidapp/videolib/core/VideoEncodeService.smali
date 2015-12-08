.class public Lcom/roidapp/videolib/core/VideoEncodeService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Messenger;

.field private b:Landroid/os/Messenger;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/videolib/core/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/roidapp/videolib/core/a/b;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 38
    new-instance v0, Lcom/roidapp/videolib/core/j;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/core/j;-><init>(Lcom/roidapp/videolib/core/VideoEncodeService;)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->d:Lcom/roidapp/videolib/core/a/b;

    .line 96
    new-instance v0, Lcom/roidapp/videolib/core/k;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/core/k;-><init>(Lcom/roidapp/videolib/core/VideoEncodeService;)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->e:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->b:Landroid/os/Messenger;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/VideoEncodeService;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->c:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method private a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->b:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 173
    :cond_0
    :goto_0
    return-void

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->a:Landroid/os/Messenger;

    iput-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->b:Landroid/os/Messenger;

    invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 171
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/VideoEncodeService;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 25
    .line 1176
    const/4 v0, 0x0

    const v1, 0xbb03

    invoke-static {v0, v1, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1177
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1178
    const-string v2, "eclass"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1179
    const-string v2, "emsg"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1180
    const-string v2, "errorpath"

    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1182
    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Landroid/os/Message;)V

    .line 25
    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/videolib/core/VideoEncodeService;)Lcom/roidapp/videolib/core/a/b;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->d:Lcom/roidapp/videolib/core/a/b;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->a:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 128
    new-instance v0, Landroid/os/Messenger;

    iget-object v1, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->e:Landroid/os/Handler;

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->a:Landroid/os/Messenger;

    .line 129
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/videolib/e;->e(Landroid/content/Context;)V

    .line 130
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/VideoEncodeService;->b:Landroid/os/Messenger;

    .line 152
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 153
    return-void
.end method

.method public onRebind(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 146
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 134
    const/4 v0, 0x2

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 158
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
