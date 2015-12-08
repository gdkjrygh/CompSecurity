.class final Lbolts/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lbolts/i;

.field final synthetic b:Lbolts/j;

.field final synthetic c:Lbolts/q;


# direct methods
.method constructor <init>(Lbolts/i;Lbolts/j;Lbolts/q;)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lbolts/k;->a:Lbolts/i;

    iput-object p2, p0, Lbolts/k;->b:Lbolts/j;

    iput-object p3, p0, Lbolts/k;->c:Lbolts/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 486
    :try_start_0
    iget-object v0, p0, Lbolts/k;->a:Lbolts/i;

    iget-object v1, p0, Lbolts/k;->b:Lbolts/j;

    invoke-interface {v0, v1}, Lbolts/i;->then(Lbolts/j;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbolts/j;

    .line 487
    if-nez v0, :cond_0

    .line 488
    iget-object v0, p0, Lbolts/k;->c:Lbolts/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbolts/q;->a(Ljava/lang/Object;)V

    .line 507
    :goto_0
    return-void

    .line 490
    :cond_0
    new-instance v1, Lbolts/l;

    invoke-direct {v1, p0}, Lbolts/l;-><init>(Lbolts/k;)V

    invoke-virtual {v0, v1}, Lbolts/j;->a(Lbolts/i;)Lbolts/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 504
    :catch_0
    move-exception v0

    .line 505
    iget-object v1, p0, Lbolts/k;->c:Lbolts/q;

    invoke-virtual {v1, v0}, Lbolts/q;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method
