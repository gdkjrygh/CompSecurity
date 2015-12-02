.class Lcom/qihoo/security/floatview/a/a$2;
.super Lcom/qihoo/security/service/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/floatview/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/a/a;)V
    .locals 0

    .prologue
    .line 399
    iput-object p1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-direct {p0}, Lcom/qihoo/security/service/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZZLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 409
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 413
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->g()V

    .line 479
    :cond_0
    :goto_0
    return-void

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->i(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-ne v0, p1, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->j(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-ne v0, p2, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->k(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-ne v0, p3, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->l(Lcom/qihoo/security/floatview/a/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    :cond_2
    const/4 v0, 0x0

    .line 423
    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->k(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 429
    const/4 v0, 0x1

    .line 432
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1, p1}, Lcom/qihoo/security/floatview/a/a;->b(Lcom/qihoo/security/floatview/a/a;Z)Z

    .line 433
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1, p2}, Lcom/qihoo/security/floatview/a/a;->c(Lcom/qihoo/security/floatview/a/a;Z)Z

    .line 434
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1, p3}, Lcom/qihoo/security/floatview/a/a;->d(Lcom/qihoo/security/floatview/a/a;Z)Z

    .line 435
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1, p4}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;Ljava/lang/String;)Ljava/lang/String;

    .line 437
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->m(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 438
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->n(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 439
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->i(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 448
    :cond_4
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->f(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 449
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->f()Z

    .line 450
    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->b()V

    .line 452
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->a()V

    goto/16 :goto_0

    .line 442
    :cond_5
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 443
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->l()V

    goto :goto_1

    .line 466
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$2;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->g()V

    goto/16 :goto_0
.end method
