.class final Lcom/kik/g/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/g/as;


# direct methods
.method constructor <init>(Lcom/kik/g/p;Lcom/kik/g/as;)V
    .locals 0

    .prologue
    .line 595
    iput-object p1, p0, Lcom/kik/g/ab;->a:Lcom/kik/g/p;

    iput-object p2, p0, Lcom/kik/g/ab;->b:Lcom/kik/g/as;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 611
    :try_start_0
    iget-object v0, p0, Lcom/kik/g/ab;->b:Lcom/kik/g/as;

    invoke-interface {v0, p1}, Lcom/kik/g/as;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/g/ab;->a:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 616
    :goto_0
    return-void

    .line 613
    :catch_0
    move-exception v0

    .line 614
    iget-object v1, p0, Lcom/kik/g/ab;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 605
    iget-object v0, p0, Lcom/kik/g/ab;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 606
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 599
    iget-object v0, p0, Lcom/kik/g/ab;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 600
    return-void
.end method
