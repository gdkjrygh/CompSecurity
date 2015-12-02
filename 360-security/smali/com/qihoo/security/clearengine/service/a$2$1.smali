.class Lcom/qihoo/security/clearengine/service/a$2$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/clearengine/service/a$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/service/a$2;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/service/a$2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a$2$1;->a:Lcom/qihoo/security/clearengine/service/a$2;

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2$1;->a:Lcom/qihoo/security/clearengine/service/a$2;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a$2;->a(Lcom/qihoo/security/clearengine/service/a$2;)Lcom/qihoo/security/clearengine/service/a;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->b(Lcom/qihoo/security/clearengine/service/a;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2$1;->a:Lcom/qihoo/security/clearengine/service/a$2;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a$2;->a(Lcom/qihoo/security/clearengine/service/a$2;)Lcom/qihoo/security/clearengine/service/a;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->c(Lcom/qihoo/security/clearengine/service/a;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2$1;->a:Lcom/qihoo/security/clearengine/service/a$2;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a$2;->a(Lcom/qihoo/security/clearengine/service/a$2;)Lcom/qihoo/security/clearengine/service/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/a;->a()V

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2$1;->a:Lcom/qihoo/security/clearengine/service/a$2;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a$2;->a(Lcom/qihoo/security/clearengine/service/a$2;)Lcom/qihoo/security/clearengine/service/a;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->c(Lcom/qihoo/security/clearengine/service/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 166
    return-void
.end method
