.class final Lcom/kik/view/adapters/bk;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 759
    iput-object p1, p0, Lcom/kik/view/adapters/bk;->b:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bk;->a:Lkik/a/d/s;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 763
    iget-object v0, p0, Lcom/kik/view/adapters/bk;->b:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->i:Lkik/a/e/i;

    iget-object v1, p0, Lcom/kik/view/adapters/bk;->a:Lkik/a/d/s;

    invoke-interface {v0, v1}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 764
    return-void
.end method
