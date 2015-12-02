.class Lcom/qihoo/security/opti/trashclear/service/e$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/service/e;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/service/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/service/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 275
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/service/a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/qihoo/security/opti/trashclear/service/a;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;Lcom/qihoo/security/opti/trashclear/service/c;)Lcom/qihoo/security/opti/trashclear/service/c;

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    if-nez v0, :cond_1

    .line 294
    :cond_0
    :goto_0
    return-void

    .line 279
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;Ljava/util/List;)Ljava/util/List;

    .line 282
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/c;->a(Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->a()V

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->e(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 293
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$2;->b:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->e(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
