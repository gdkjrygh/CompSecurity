.class final Lcom/c/b/bh$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/c/b/ar;


# direct methods
.method constructor <init>(Lcom/c/b/ar;)V
    .locals 0

    .prologue
    .line 541
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 542
    iput-object p1, p0, Lcom/c/b/bh$b;->a:Lcom/c/b/ar;

    .line 543
    return-void
.end method

.method private c(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 551
    iget-object v0, p0, Lcom/c/b/bh$b;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 598
    sget v0, Lcom/c/b/bh$c$a;->b:I

    return v0
.end method

.method public final a(Lcom/c/b/ap;Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;
    .locals 1

    .prologue
    .line 609
    invoke-virtual {p1, p2, p3}, Lcom/c/b/ap;->a(Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;
    .locals 1

    .prologue
    .line 560
    iget-object v0, p0, Lcom/c/b/bh$b;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1, p2}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    .line 561
    return-object p0
.end method

.method public final a(Lcom/c/b/f;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 646
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v1

    .line 647
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 648
    invoke-direct {p0, p3}, Lcom/c/b/bh$b;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 649
    if-eqz v0, :cond_0

    .line 650
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 653
    :cond_0
    invoke-interface {v1, p1, p2}, Lcom/c/b/bd$a;->b(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/bd$a;

    .line 654
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 616
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v1

    .line 618
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    invoke-direct {p0, p3}, Lcom/c/b/bh$b;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 620
    if-eqz v0, :cond_0

    .line 621
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 624
    :cond_0
    invoke-virtual {p3}, Lcom/c/b/ak$f;->e()I

    move-result v0

    invoke-virtual {p1, v0, v1, p2}, Lcom/c/b/g;->a(ILcom/c/b/be$a;Lcom/c/b/aq;)V

    .line 625
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 555
    iget-object v0, p0, Lcom/c/b/bh$b;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;)Z

    move-result v0

    return v0
.end method

.method public final b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Lcom/c/b/bh$b;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1, p2}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    .line 578
    return-object p0
.end method

.method public final b(Lcom/c/b/ak$f;)Lcom/c/b/cd$c;
    .locals 1

    .prologue
    .line 665
    invoke-virtual {p1}, Lcom/c/b/ak$f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 666
    sget-object v0, Lcom/c/b/cd$c;->b:Lcom/c/b/cd$c;

    .line 669
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/c/b/cd$c;->a:Lcom/c/b/cd$c;

    goto :goto_0
.end method

.method public final b(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 631
    invoke-interface {p4}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v1

    .line 633
    invoke-virtual {p3}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 634
    invoke-direct {p0, p3}, Lcom/c/b/bh$b;->c(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 635
    if-eqz v0, :cond_0

    .line 636
    invoke-interface {v1, v0}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    .line 639
    :cond_0
    invoke-virtual {p1, v1, p2}, Lcom/c/b/g;->a(Lcom/c/b/be$a;Lcom/c/b/aq;)V

    .line 640
    invoke-interface {v1}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object v0

    return-object v0
.end method
