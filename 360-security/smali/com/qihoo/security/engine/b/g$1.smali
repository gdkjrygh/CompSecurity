.class Lcom/qihoo/security/engine/b/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/b/g;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/b/g$1;->a:Lcom/qihoo/security/engine/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$1;->a:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$1;->a:Lcom/qihoo/security/engine/b/g;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/g;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$1;->a:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g;->b()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$1;->a:Lcom/qihoo/security/engine/b/g;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/qihoo/security/engine/b/g;->f:Z

    :cond_0
    return-void
.end method
