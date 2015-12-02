.class Lcom/qihoo/security/notify/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/notify/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/a;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/notify/a$2;->a:Lcom/qihoo/security/notify/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 117
    const/4 v0, 0x0

    .line 119
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/notify/a$2;->a:Lcom/qihoo/security/notify/a;

    invoke-static {v1}, Lcom/qihoo/security/notify/a;->c(Lcom/qihoo/security/notify/a;)Lcom/qihoo/security/service/a;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/service/a;->c()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 122
    :goto_0
    const/16 v1, 0x55

    if-lt v0, v1, :cond_0

    .line 123
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 124
    const/4 v2, 0x2

    iput v2, v1, Landroid/os/Message;->what:I

    .line 125
    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/notify/a$2;->a:Lcom/qihoo/security/notify/a;

    invoke-static {v0}, Lcom/qihoo/security/notify/a;->d(Lcom/qihoo/security/notify/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 128
    :cond_0
    return-void

    .line 120
    :catch_0
    move-exception v1

    goto :goto_0
.end method
