.class final Lcom/kik/view/adapters/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lcom/kik/view/adapters/au;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/au;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/kik/view/adapters/ax;->b:Lcom/kik/view/adapters/au;

    iput-object p2, p0, Lcom/kik/view/adapters/ax;->a:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Lcom/kik/view/adapters/ax;->b:Lcom/kik/view/adapters/au;

    iget-object v1, p0, Lcom/kik/view/adapters/ax;->a:Lkik/a/d/s;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/au;->b(Lkik/a/d/s;)V

    .line 212
    return-void
.end method
