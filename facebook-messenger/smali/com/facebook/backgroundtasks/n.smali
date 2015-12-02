.class Lcom/facebook/backgroundtasks/n;
.super Ljava/lang/Object;
.source "BackgroundTaskRunner.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/backgroundtasks/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/backgroundtasks/j;


# direct methods
.method constructor <init>(Lcom/facebook/backgroundtasks/j;)V
    .locals 0

    .prologue
    .line 328
    iput-object p1, p0, Lcom/facebook/backgroundtasks/n;->a:Lcom/facebook/backgroundtasks/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/backgroundtasks/b;)V
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/facebook/backgroundtasks/n;->a:Lcom/facebook/backgroundtasks/j;

    invoke-static {v0, p1}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/j;Lcom/facebook/backgroundtasks/b;)V

    .line 332
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 328
    check-cast p1, Lcom/facebook/backgroundtasks/b;

    invoke-virtual {p0, p1}, Lcom/facebook/backgroundtasks/n;->a(Lcom/facebook/backgroundtasks/b;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Lcom/facebook/backgroundtasks/n;->a:Lcom/facebook/backgroundtasks/j;

    invoke-static {v0, p1}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/j;Ljava/lang/Throwable;)V

    .line 337
    return-void
.end method
