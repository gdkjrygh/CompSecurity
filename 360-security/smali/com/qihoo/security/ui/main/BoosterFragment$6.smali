.class Lcom/qihoo/security/ui/main/BoosterFragment$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/ui/main/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 1593
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 1597
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1632
    :cond_0
    :goto_0
    return-void

    .line 1600
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->p(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1601
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->p(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment$6;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
