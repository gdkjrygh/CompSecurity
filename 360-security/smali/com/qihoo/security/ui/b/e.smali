.class public Lcom/qihoo/security/ui/b/e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/app/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/b/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/app/d$a",
        "<",
        "Lcom/qihoo/security/ui/b/d;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lcom/qihoo/security/ui/b/e;


# instance fields
.field private final a:Landroid/os/Handler;

.field private c:Landroid/content/Context;

.field private d:Lcom/qihoo/security/ui/b/d;

.field private final e:Landroid/os/Binder;

.field private f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/ui/b/e$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/qihoo/security/ui/b/e$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/b/e$1;-><init>(Lcom/qihoo/security/ui/b/e;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/e;->a:Landroid/os/Handler;

    .line 123
    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/e;->e:Landroid/os/Binder;

    .line 124
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/e;->f:Landroid/util/SparseArray;

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/b/e;->c:Landroid/content/Context;

    .line 117
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.service.UIBARRIER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    iget-object v1, p0, Lcom/qihoo/security/ui/b/e;->c:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 119
    iget-object v1, p0, Lcom/qihoo/security/ui/b/e;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/app/d;->a(Landroid/content/Context;)Lcom/qihoo/security/app/d;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/ui/b/d;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3, p0}, Lcom/qihoo/security/app/d;->a(Ljava/lang/Class;Landroid/content/Intent;ZLcom/qihoo/security/app/d$a;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/d;

    iput-object v0, p0, Lcom/qihoo/security/ui/b/e;->d:Lcom/qihoo/security/ui/b/d;

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/e;)Landroid/os/Binder;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e;->e:Landroid/os/Binder;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/e;
    .locals 2

    .prologue
    .line 103
    const-class v1, Lcom/qihoo/security/ui/b/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/b/e;->b:Lcom/qihoo/security/ui/b/e;

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Lcom/qihoo/security/ui/b/e;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/ui/b/e;->b:Lcom/qihoo/security/ui/b/e;

    .line 106
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/b/e;->b:Lcom/qihoo/security/ui/b/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private final a(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 36
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 48
    :goto_0
    return-void

    .line 39
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e;->d:Lcom/qihoo/security/ui/b/d;

    iget-object v1, p0, Lcom/qihoo/security/ui/b/e;->e:Landroid/os/Binder;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/ui/b/d;->b(Landroid/os/IBinder;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    goto :goto_0

    .line 36
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/e;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/b/e;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/b/e;)Lcom/qihoo/security/ui/b/d;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e;->d:Lcom/qihoo/security/ui/b/d;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/b/e;->b(Landroid/os/IBinder;)Lcom/qihoo/security/ui/b/d;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Lcom/qihoo/security/ui/b/e$a;
    .locals 3

    .prologue
    .line 127
    .line 128
    iget-object v1, p0, Lcom/qihoo/security/ui/b/e;->f:Landroid/util/SparseArray;

    monitor-enter v1

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/e$a;

    .line 130
    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lcom/qihoo/security/ui/b/e$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/qihoo/security/ui/b/e$a;-><init>(Lcom/qihoo/security/ui/b/e;ILcom/qihoo/security/ui/b/e$1;)V

    .line 132
    iget-object v2, p0, Lcom/qihoo/security/ui/b/e;->f:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 134
    :cond_0
    monitor-exit v1

    .line 135
    return-object v0

    .line 134
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Landroid/os/IBinder;)Lcom/qihoo/security/ui/b/d;
    .locals 1

    .prologue
    .line 21
    invoke-static {p1}, Lcom/qihoo/security/ui/b/d$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/ui/b/d;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Z
    .locals 1

    .prologue
    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e;->d:Lcom/qihoo/security/ui/b/d;

    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/b/d;->a(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 146
    :goto_0
    return v0

    .line 141
    :catch_0
    move-exception v0

    .line 146
    const/4 v0, 0x0

    goto :goto_0
.end method
