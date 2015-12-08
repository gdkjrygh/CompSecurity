.class final Lcom/kik/view/adapters/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/ak;

.field final synthetic b:Lcom/kik/view/adapters/bp;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bp;Lcom/kik/view/adapters/ak;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/kik/view/adapters/bq;->b:Lcom/kik/view/adapters/bp;

    iput-object p2, p0, Lcom/kik/view/adapters/bq;->a:Lcom/kik/view/adapters/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 318
    iget-object v0, p0, Lcom/kik/view/adapters/bq;->b:Lcom/kik/view/adapters/bp;

    iget-object v0, v0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bq;->b:Lcom/kik/view/adapters/bp;

    iget-object v1, v1, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/bq;->a:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lcom/kik/view/adapters/ak;)V

    .line 319
    return-void
.end method
