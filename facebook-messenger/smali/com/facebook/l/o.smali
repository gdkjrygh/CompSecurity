.class Lcom/facebook/l/o;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 329
    iput-object p1, p0, Lcom/facebook/l/o;->a:Lcom/facebook/l/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 329
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/l/o;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/l/o;->a:Lcom/facebook/l/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;Z)Z

    .line 338
    invoke-static {}, Lcom/facebook/l/k;->j()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Failed to load facebook users"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 339
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/facebook/l/o;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->d(Lcom/facebook/l/k;)V

    .line 333
    return-void
.end method
