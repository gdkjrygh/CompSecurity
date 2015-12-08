.class final Lcom/roidapp/baselib/g/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/b;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/baselib/g/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/g/c;)V
    .locals 1

    .prologue
    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 216
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/baselib/g/d;->a:Ljava/lang/ref/WeakReference;

    .line 217
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/g/c;B)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/g/d;-><init>(Lcom/roidapp/baselib/g/c;)V

    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/roidapp/baselib/g/d;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 221
    :goto_0
    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/g/c;->sendMessage(Landroid/os/Message;)Z

    .line 223
    :cond_0
    return-void

    .line 220
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/g/d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/g/c;

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 237
    const/4 v0, 0x0

    const v1, 0xcbc3

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/g/d;->a(Landroid/os/Message;)V

    .line 238
    return-void
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 232
    const/4 v0, 0x0

    const v1, 0xcbc2

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/g/d;->a(Landroid/os/Message;)V

    .line 233
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 211
    check-cast p1, Ljava/lang/String;

    .line 1227
    const/4 v0, 0x0

    const v1, 0xcbc1

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/g/d;->a(Landroid/os/Message;)V

    .line 211
    return-void
.end method
