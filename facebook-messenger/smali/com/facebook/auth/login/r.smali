.class Lcom/facebook/auth/login/r;
.super Ljava/lang/Object;
.source "AuthOperations.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/o;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/o;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/facebook/auth/login/r;->a:Lcom/facebook/auth/login/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/auth/login/r;->a:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->f(Lcom/facebook/auth/login/o;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 141
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->e()V

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/r;->a:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->g(Lcom/facebook/auth/login/o;)Lcom/facebook/auth/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->e()V

    .line 144
    iget-object v0, p0, Lcom/facebook/auth/login/r;->a:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->a(Lcom/facebook/auth/login/o;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 147
    return-void
.end method
