.class final Lcom/kik/g/ad;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/g/as;


# direct methods
.method constructor <init>(Lcom/kik/g/p;Lcom/kik/g/as;)V
    .locals 0

    .prologue
    .line 636
    iput-object p1, p0, Lcom/kik/g/ad;->a:Lcom/kik/g/p;

    iput-object p2, p0, Lcom/kik/g/ad;->b:Lcom/kik/g/as;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 651
    const/4 v0, 0x0

    .line 654
    :try_start_0
    iget-object v1, p0, Lcom/kik/g/ad;->b:Lcom/kik/g/as;

    invoke-interface {v1, p1}, Lcom/kik/g/as;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 660
    :goto_0
    iget-object v1, p0, Lcom/kik/g/ad;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 661
    return-void

    .line 656
    :catch_0
    move-exception v1

    .line 657
    iget-object v2, p0, Lcom/kik/g/ad;->a:Lcom/kik/g/p;

    invoke-virtual {v2, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 646
    iget-object v0, p0, Lcom/kik/g/ad;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 647
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 640
    iget-object v0, p0, Lcom/kik/g/ad;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 641
    return-void
.end method
