.class Lcom/facebook/inject/m;
.super Ljava/lang/Object;
.source "ContextAwareInjector.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljavax/inject/a;

.field final synthetic b:Lcom/facebook/inject/l;


# direct methods
.method constructor <init>(Lcom/facebook/inject/l;Ljavax/inject/a;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    iput-object p2, p0, Lcom/facebook/inject/m;->a:Ljavax/inject/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v0}, Lcom/facebook/inject/l;->b(Lcom/facebook/inject/l;)Lcom/facebook/inject/n;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v1}, Lcom/facebook/inject/l;->a(Lcom/facebook/inject/l;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/inject/n;->a(Landroid/content/Context;)V

    .line 43
    const/4 v0, 0x0

    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v1}, Lcom/facebook/inject/l;->c(Lcom/facebook/inject/l;)Lcom/facebook/inject/ab;

    move-result-object v1

    instance-of v1, v1, Lcom/facebook/inject/bd;

    if-eqz v1, :cond_2

    .line 45
    iget-object v0, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v0}, Lcom/facebook/inject/l;->c(Lcom/facebook/inject/l;)Lcom/facebook/inject/ab;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/bd;

    .line 46
    iget-object v1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-interface {v0, v1}, Lcom/facebook/inject/bd;->a(Lcom/facebook/inject/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v1, v0

    .line 49
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/inject/m;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 51
    if-eqz v1, :cond_0

    .line 52
    :try_start_2
    invoke-interface {v1}, Lcom/facebook/inject/bd;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    :cond_0
    iget-object v1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v1}, Lcom/facebook/inject/l;->b(Lcom/facebook/inject/l;)Lcom/facebook/inject/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/inject/n;->b()V

    return-object v0

    .line 51
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 52
    :try_start_3
    invoke-interface {v1}, Lcom/facebook/inject/bd;->a()V

    :cond_1
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/facebook/inject/m;->b:Lcom/facebook/inject/l;

    invoke-static {v1}, Lcom/facebook/inject/l;->b(Lcom/facebook/inject/l;)Lcom/facebook/inject/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/inject/n;->b()V

    throw v0

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method
