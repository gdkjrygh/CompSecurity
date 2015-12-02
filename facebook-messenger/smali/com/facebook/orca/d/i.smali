.class Lcom/facebook/orca/d/i;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"

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
.field final synthetic a:Lcom/facebook/orca/d/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/facebook/orca/d/i;->a:Lcom/facebook/orca/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/orca/d/i;->a:Lcom/facebook/orca/d/e;

    invoke-static {v0}, Lcom/facebook/orca/d/e;->c(Lcom/facebook/orca/d/e;)V

    .line 121
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/d/i;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
