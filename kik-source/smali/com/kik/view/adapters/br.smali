.class final Lcom/kik/view/adapters/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 357
    iput-object p1, p0, Lcom/kik/view/adapters/br;->c:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/br;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/br;->b:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 361
    iget-object v0, p0, Lcom/kik/view/adapters/br;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ak;->c()V

    .line 362
    iget-object v0, p0, Lcom/kik/view/adapters/br;->c:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/br;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/br;->b:Lkik/a/d/s;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V

    .line 364
    iget-object v0, p0, Lcom/kik/view/adapters/br;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ak;->a(Z)V

    .line 365
    return-void
.end method
