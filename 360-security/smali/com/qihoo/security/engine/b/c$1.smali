.class Lcom/qihoo/security/engine/b/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/b/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/b;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c$1;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->b()V

    goto :goto_0
.end method
