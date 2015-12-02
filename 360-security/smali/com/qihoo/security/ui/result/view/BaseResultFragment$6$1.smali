.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->b(Lcom/nineoldandroids/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;)V
    .locals 0

    .prologue
    .line 639
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 645
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->g(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 646
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->e(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    .line 650
    :goto_0
    return-void

    .line 648
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0
.end method
