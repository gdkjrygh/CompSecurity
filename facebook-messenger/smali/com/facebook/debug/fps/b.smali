.class public Lcom/facebook/debug/fps/b;
.super Lcom/facebook/base/activity/a;
.source "FPSController.java"


# instance fields
.field final synthetic a:Lcom/facebook/debug/fps/a;


# direct methods
.method public constructor <init>(Lcom/facebook/debug/fps/a;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 201
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    :goto_0
    return-void

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0, p1}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;

    .line 206
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0, p1}, Lcom/facebook/debug/fps/a;->b(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;

    .line 209
    invoke-static {}, Lcom/facebook/common/annotations/a;->a()Lcom/facebook/common/annotations/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/facebook/debug/fps/FPSSupport;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/annotations/a;->b(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    iget-object v1, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;Lcom/google/common/a/fi;)Lcom/google/common/a/fi;

    .line 216
    :goto_1
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->b(Lcom/facebook/debug/fps/a;)Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/debug/fps/j;

    if-eqz v0, :cond_1

    .line 217
    iget-object v1, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->b(Lcom/facebook/debug/fps/a;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/fps/j;

    iget-object v2, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v2}, Lcom/facebook/debug/fps/a;->c(Lcom/facebook/debug/fps/a;)Lcom/google/common/a/fi;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/debug/fps/j;->a(Lcom/google/common/a/fi;)Lcom/google/common/a/fi;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;Lcom/google/common/a/fi;)Lcom/google/common/a/fi;

    .line 219
    :cond_1
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->d(Lcom/facebook/debug/fps/a;)V

    goto :goto_0

    .line 212
    :cond_2
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;Lcom/google/common/a/fi;)Lcom/google/common/a/fi;

    goto :goto_1
.end method

.method public c(Landroid/app/Activity;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 224
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    :goto_0
    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->e(Lcom/facebook/debug/fps/a;)Lcom/google/common/a/fi;

    move-result-object v0

    .line 230
    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_FLUSH_DATA_ON_PAUSE:Lcom/facebook/debug/fps/k;

    invoke-virtual {v0, v1}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-virtual {v0, v2}, Lcom/facebook/debug/fps/a;->a(Ljava/lang/String;)V

    .line 233
    :cond_1
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0, v2}, Lcom/facebook/debug/fps/a;->a(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;

    .line 234
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->d(Lcom/facebook/debug/fps/a;)V

    .line 235
    iget-object v0, p0, Lcom/facebook/debug/fps/b;->a:Lcom/facebook/debug/fps/a;

    invoke-static {v0, v2}, Lcom/facebook/debug/fps/a;->b(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;

    goto :goto_0
.end method
