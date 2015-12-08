.class final Lcom/kik/view/adapters/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lcom/kik/view/adapters/z;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/z;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/kik/view/adapters/ab;->b:Lcom/kik/view/adapters/z;

    iput-object p2, p0, Lcom/kik/view/adapters/ab;->a:Lkik/a/d/s;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/kik/view/adapters/ab;->b:Lcom/kik/view/adapters/z;

    iget-object v0, v0, Lcom/kik/view/adapters/z;->i:Lkik/a/e/i;

    iget-object v1, p0, Lcom/kik/view/adapters/ab;->a:Lkik/a/d/s;

    invoke-interface {v0, v1}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 138
    return-void
.end method
