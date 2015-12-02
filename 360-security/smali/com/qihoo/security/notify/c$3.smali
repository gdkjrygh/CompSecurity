.class Lcom/qihoo/security/notify/c$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/notify/c;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/c;)V
    .locals 0

    .prologue
    .line 357
    iput-object p1, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 361
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0}, Lcom/qihoo/security/notify/c;->b(Lcom/qihoo/security/notify/c;)Lcom/qihoo/security/widget/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0}, Lcom/qihoo/security/notify/c;->b(Lcom/qihoo/security/notify/c;)Lcom/qihoo/security/widget/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/a;->b()V

    .line 363
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a;

    .line 364
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;Z)Z

    .line 365
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/c;->c()V

    .line 367
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 374
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 386
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    iget-object v0, v0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->b(Landroid/content/Context;)V

    .line 387
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0179

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 388
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0}, Lcom/qihoo/security/notify/c;->b(Lcom/qihoo/security/notify/c;)Lcom/qihoo/security/widget/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0}, Lcom/qihoo/security/notify/c;->b(Lcom/qihoo/security/notify/c;)Lcom/qihoo/security/widget/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/a;->b()V

    .line 390
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a;

    .line 391
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;Z)Z

    .line 393
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 1

    .prologue
    .line 381
    iget-object v0, p0, Lcom/qihoo/security/notify/c$3;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0, p1}, Lcom/qihoo/security/notify/c;->b(Lcom/qihoo/security/notify/c;Z)Z

    .line 382
    return-void
.end method
