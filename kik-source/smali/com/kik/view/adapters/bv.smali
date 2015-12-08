.class final Lcom/kik/view/adapters/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bu;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bu;)V
    .locals 0

    .prologue
    .line 442
    iput-object p1, p0, Lcom/kik/view/adapters/bv;->a:Lcom/kik/view/adapters/bu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 446
    iget-object v0, p0, Lcom/kik/view/adapters/bv;->a:Lcom/kik/view/adapters/bu;

    iget-object v0, v0, Lcom/kik/view/adapters/bu;->c:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bv;->a:Lcom/kik/view/adapters/bu;

    iget-object v1, v1, Lcom/kik/view/adapters/bu;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/bv;->a:Lcom/kik/view/adapters/bu;

    iget-object v2, v2, Lcom/kik/view/adapters/bu;->b:Lkik/a/d/s;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V

    .line 447
    return-void
.end method
