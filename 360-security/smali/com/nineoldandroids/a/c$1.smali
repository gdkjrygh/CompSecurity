.class Lcom/nineoldandroids/a/c$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nineoldandroids/a/c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/nineoldandroids/a/c;

.field private final synthetic c:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/nineoldandroids/a/c;Ljava/util/ArrayList;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nineoldandroids/a/c$1;->b:Lcom/nineoldandroids/a/c;

    iput-object p2, p0, Lcom/nineoldandroids/a/c$1;->c:Ljava/util/ArrayList;

    .line 508
    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    .line 509
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nineoldandroids/a/c$1;->a:Z

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    .line 514
    iget-boolean v0, p0, Lcom/nineoldandroids/a/c$1;->a:Z

    if-nez v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/nineoldandroids/a/c$1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 516
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_1

    .line 522
    :cond_0
    return-void

    .line 517
    :cond_1
    iget-object v0, p0, Lcom/nineoldandroids/a/c$1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/c$e;

    .line 518
    iget-object v3, v0, Lcom/nineoldandroids/a/c$e;->a:Lcom/nineoldandroids/a/a;

    invoke-virtual {v3}, Lcom/nineoldandroids/a/a;->a()V

    .line 519
    iget-object v3, p0, Lcom/nineoldandroids/a/c$1;->b:Lcom/nineoldandroids/a/c;

    invoke-static {v3}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/c;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v0, v0, Lcom/nineoldandroids/a/c$e;->a:Lcom/nineoldandroids/a/a;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 516
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 511
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nineoldandroids/a/c$1;->a:Z

    .line 512
    return-void
.end method
