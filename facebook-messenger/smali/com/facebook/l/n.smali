.class Lcom/facebook/l/n;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
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
    .line 322
    iput-object p1, p0, Lcom/facebook/l/n;->a:Lcom/facebook/l/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/l/n;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->c(Lcom/facebook/l/k;)V

    .line 326
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 322
    invoke-virtual {p0}, Lcom/facebook/l/n;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
