.class final Lcom/b/a/c/ac;
.super Ljava/lang/Object;
.source "SourceFile"

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
.field final synthetic a:Lcom/b/a/c/aa;


# direct methods
.method constructor <init>(Lcom/b/a/c/aa;)V
    .locals 0

    .prologue
    .line 503
    iput-object p1, p0, Lcom/b/a/c/ac;->a:Lcom/b/a/c/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 503
    .line 1506
    iget-object v0, p0, Lcom/b/a/c/ac;->a:Lcom/b/a/c/aa;

    invoke-static {v0}, Lcom/b/a/c/aa;->b(Lcom/b/a/c/aa;)V

    .line 1507
    const/4 v0, 0x0

    .line 503
    return-object v0
.end method
