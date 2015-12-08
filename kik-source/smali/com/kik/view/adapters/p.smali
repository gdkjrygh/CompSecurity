.class final Lcom/kik/view/adapters/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lcom/kik/view/adapters/n;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/n;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/kik/view/adapters/p;->b:Lcom/kik/view/adapters/n;

    iput-object p2, p0, Lcom/kik/view/adapters/p;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p0, Lcom/kik/view/adapters/p;->b:Lcom/kik/view/adapters/n;

    iget-object v1, p0, Lcom/kik/view/adapters/p;->a:Lkik/a/d/a/a;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/n;->d(Lkik/a/d/a/a;)V

    .line 214
    return-void
.end method
