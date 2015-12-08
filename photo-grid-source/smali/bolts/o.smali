.class final Lbolts/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbolts/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/i",
        "<TTResult;",
        "Lbolts/j",
        "<TTContinuationResult;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbolts/i;

.field final synthetic b:Lbolts/j;


# direct methods
.method constructor <init>(Lbolts/j;Lbolts/i;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lbolts/o;->b:Lbolts/j;

    iput-object p2, p0, Lbolts/o;->a:Lbolts/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lbolts/j;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 378
    .line 1381
    invoke-virtual {p1}, Lbolts/j;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1382
    invoke-virtual {p1}, Lbolts/j;->e()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lbolts/j;->a(Ljava/lang/Exception;)Lbolts/j;

    move-result-object v0

    .line 1384
    :goto_0
    return-object v0

    .line 1383
    :cond_0
    invoke-virtual {p1}, Lbolts/j;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1384
    invoke-static {}, Lbolts/j;->f()Lbolts/j;

    move-result-object v0

    goto :goto_0

    .line 1386
    :cond_1
    iget-object v0, p0, Lbolts/o;->a:Lbolts/i;

    invoke-virtual {p1, v0}, Lbolts/j;->a(Lbolts/i;)Lbolts/j;

    move-result-object v0

    goto :goto_0
.end method
