.class Lcom/qihoo/security/ui/main/BoosterFragment$6$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment$6;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/ui/main/BoosterFragment$6;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment$6;I)V
    .locals 0

    .prologue
    .line 1601
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iput p2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1604
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1627
    :cond_0
    :goto_0
    return-void

    .line 1607
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->z(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v0

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->a:I

    if-eq v0, v1, :cond_0

    .line 1608
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1609
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->A(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/main/BoosterFragment$e;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    if-eq v0, v1, :cond_2

    .line 1610
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->z(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->g(Lcom/qihoo/security/ui/main/BoosterFragment;I)V

    goto :goto_0

    .line 1612
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$6$1;->b:Lcom/qihoo/security/ui/main/BoosterFragment$6;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$6;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->z(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->g(Lcom/qihoo/security/ui/main/BoosterFragment;I)V

    goto :goto_0
.end method
