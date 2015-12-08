.class final Lcom/kik/g/z;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/kik/g/aq;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/kik/g/aq;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lcom/kik/g/z;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/kik/g/z;->b:Lcom/kik/g/aq;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 522
    iget-object v0, p0, Lcom/kik/g/z;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 524
    iget-object v0, p0, Lcom/kik/g/z;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 525
    iget-object v0, p0, Lcom/kik/g/z;->b:Lcom/kik/g/aq;

    invoke-virtual {v0, p1}, Lcom/kik/g/aq;->a(Ljava/lang/Object;)V

    .line 527
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 538
    iget-object v0, p0, Lcom/kik/g/z;->b:Lcom/kik/g/aq;

    invoke-virtual {v0}, Lcom/kik/g/aq;->e()V

    .line 539
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 532
    iget-object v0, p0, Lcom/kik/g/z;->b:Lcom/kik/g/aq;

    invoke-virtual {v0, p1}, Lcom/kik/g/aq;->a(Ljava/lang/Throwable;)V

    .line 533
    return-void
.end method
