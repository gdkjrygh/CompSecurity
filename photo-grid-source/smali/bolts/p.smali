.class final Lbolts/p;
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
    .line 449
    iput-object p1, p0, Lbolts/p;->a:Lbolts/i;

    iput-object p2, p0, Lbolts/p;->b:Lbolts/j;

    iput-object p3, p0, Lbolts/p;->c:Lbolts/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 453
    :try_start_0
    iget-object v0, p0, Lbolts/p;->a:Lbolts/i;

    iget-object v1, p0, Lbolts/p;->b:Lbolts/j;

    invoke-interface {v0, v1}, Lbolts/i;->then(Lbolts/j;)Ljava/lang/Object;

    move-result-object v0

    .line 454
    iget-object v1, p0, Lbolts/p;->c:Lbolts/q;

    invoke-virtual {v1, v0}, Lbolts/q;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 458
    :goto_0
    return-void

    .line 455
    :catch_0
    move-exception v0

    .line 456
    iget-object v1, p0, Lbolts/p;->c:Lbolts/q;

    invoke-virtual {v1, v0}, Lbolts/q;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method
