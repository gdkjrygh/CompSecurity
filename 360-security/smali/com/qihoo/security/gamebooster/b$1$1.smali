.class Lcom/qihoo/security/gamebooster/b$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/b$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b$1;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$1$1;->a:Lcom/qihoo/security/gamebooster/b$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1$1;->a:Lcom/qihoo/security/gamebooster/b$1;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/b;Z)V

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$1$1;->a:Lcom/qihoo/security/gamebooster/b$1;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/b$1;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->i(Lcom/qihoo/security/gamebooster/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 238
    return-void
.end method
