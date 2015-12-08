.class final Lcom/kik/view/adapters/bo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lkik/a/d/a/a;

.field final synthetic d:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 284
    iput-object p1, p0, Lcom/kik/view/adapters/bo;->d:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bo;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/bo;->b:Lkik/a/d/s;

    iput-object p4, p0, Lcom/kik/view/adapters/bo;->c:Lkik/a/d/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 288
    iget-object v0, p0, Lcom/kik/view/adapters/bo;->a:Lcom/kik/view/adapters/bf$b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    .line 289
    iget-object v0, p0, Lcom/kik/view/adapters/bo;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bo;->b:Lkik/a/d/s;

    iget-object v2, p0, Lcom/kik/view/adapters/bo;->c:Lkik/a/d/a/a;

    iget-object v3, p0, Lcom/kik/view/adapters/bo;->a:Lcom/kik/view/adapters/bf$b;

    invoke-static {v0, v1, v2, v3}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf;Lkik/a/d/s;Lkik/a/d/a/a;Lcom/kik/view/adapters/bf$b;)V

    .line 290
    return-void
.end method
