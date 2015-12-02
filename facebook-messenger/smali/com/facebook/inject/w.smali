.class Lcom/facebook/inject/w;
.super Ljava/lang/Object;
.source "FbInjectorImpl.java"

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
.field final synthetic a:Ljava/lang/reflect/Constructor;

.field final synthetic b:Lcom/facebook/inject/u;


# direct methods
.method constructor <init>(Lcom/facebook/inject/u;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/inject/w;->b:Lcom/facebook/inject/u;

    iput-object p2, p0, Lcom/facebook/inject/w;->a:Ljava/lang/reflect/Constructor;

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
    .line 186
    :try_start_0
    iget-object v1, p0, Lcom/facebook/inject/w;->a:Ljava/lang/reflect/Constructor;

    const/4 v0, 0x0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    .line 187
    :catch_0
    move-exception v0

    .line 188
    new-instance v1, Lcom/facebook/inject/aq;

    invoke-direct {v1, v0}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 189
    :catch_1
    move-exception v0

    .line 190
    new-instance v1, Lcom/facebook/inject/aq;

    invoke-direct {v1, v0}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 191
    :catch_2
    move-exception v0

    .line 192
    new-instance v1, Lcom/facebook/inject/aq;

    invoke-direct {v1, v0}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
