.class Lcom/facebook/orca/d/ba;
.super Ljava/lang/Object;
.source "FetchAudioExecutor.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/bc;

.field final synthetic b:Lcom/facebook/orca/d/az;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/az;Lcom/facebook/orca/d/bc;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/orca/d/ba;->b:Lcom/facebook/orca/d/az;

    iput-object p2, p0, Lcom/facebook/orca/d/ba;->a:Lcom/facebook/orca/d/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/d/ba;->b:Lcom/facebook/orca/d/az;

    iget-object v1, p0, Lcom/facebook/orca/d/ba;->a:Lcom/facebook/orca/d/bc;

    invoke-static {v0, v1}, Lcom/facebook/orca/d/az;->a(Lcom/facebook/orca/d/az;Lcom/facebook/orca/d/bc;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/facebook/orca/d/ba;->a()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
