.class final Lcom/kik/g/aa;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)V
    .locals 0

    .prologue
    .line 553
    iput-object p1, p0, Lcom/kik/g/aa;->a:Lcom/kik/g/p;

    iput-object p2, p0, Lcom/kik/g/aa;->b:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 558
    iget-object v0, p0, Lcom/kik/g/aa;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 559
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 565
    :try_start_0
    iget-object v0, p0, Lcom/kik/g/aa;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    .line 567
    iget-object v1, p0, Lcom/kik/g/aa;->a:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 572
    :goto_0
    return-void

    .line 569
    :catch_0
    move-exception v0

    .line 570
    iget-object v1, p0, Lcom/kik/g/aa;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
