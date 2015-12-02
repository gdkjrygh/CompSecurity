.class Lcom/qihoo/security/widget/a$3$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/a$3;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/a$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/a$3;)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Lcom/qihoo/security/widget/a$3$1;->a:Lcom/qihoo/security/widget/a$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 438
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3$1;->a:Lcom/qihoo/security/widget/a$3;

    iget-object v0, v0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->c(Lcom/qihoo/security/widget/a;)V

    .line 439
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3$1;->a:Lcom/qihoo/security/widget/a$3;

    iget-object v0, v0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3$1;->a:Lcom/qihoo/security/widget/a$3;

    iget-object v0, v0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/a$a;->b(Z)V

    .line 442
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3$1;->a:Lcom/qihoo/security/widget/a$3;

    iget-object v0, v0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;Z)Z

    .line 443
    return-void
.end method
