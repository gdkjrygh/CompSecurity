.class final Lbolts/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbolts/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/i",
        "<TTContinuationResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbolts/k;


# direct methods
.method constructor <init>(Lbolts/k;)V
    .locals 0

    .prologue
    .line 490
    iput-object p1, p0, Lbolts/l;->a:Lbolts/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lbolts/j;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 490
    .line 1493
    invoke-virtual {p1}, Lbolts/j;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1494
    iget-object v0, p0, Lbolts/l;->a:Lbolts/k;

    iget-object v0, v0, Lbolts/k;->c:Lbolts/q;

    invoke-virtual {v0}, Lbolts/q;->b()V

    .line 1500
    :goto_0
    const/4 v0, 0x0

    .line 490
    return-object v0

    .line 1495
    :cond_0
    invoke-virtual {p1}, Lbolts/j;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1496
    iget-object v0, p0, Lbolts/l;->a:Lbolts/k;

    iget-object v0, v0, Lbolts/k;->c:Lbolts/q;

    invoke-virtual {p1}, Lbolts/j;->e()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbolts/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 1498
    :cond_1
    iget-object v0, p0, Lbolts/l;->a:Lbolts/k;

    iget-object v0, v0, Lbolts/k;->c:Lbolts/q;

    invoke-virtual {p1}, Lbolts/j;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbolts/q;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
