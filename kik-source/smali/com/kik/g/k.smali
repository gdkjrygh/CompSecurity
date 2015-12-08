.class public Lcom/kik/g/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/kik/g/e;

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/kik/g/k;->b:Ljava/lang/Object;

    .line 17
    new-instance v0, Lcom/kik/g/e;

    iget-object v1, p0, Lcom/kik/g/k;->b:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/kik/g/e;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/g/k;->a:Lcom/kik/g/e;

    .line 18
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/kik/g/k;->a:Lcom/kik/g/e;

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/g/k;->a:Lcom/kik/g/e;

    iget-object v0, v0, Lcom/kik/g/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/e$a;

    .line 41
    iget-object v0, v0, Lcom/kik/g/e$a;->a:Lcom/kik/g/i;

    iget-object v2, p0, Lcom/kik/g/k;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2, p1}, Lcom/kik/g/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method
