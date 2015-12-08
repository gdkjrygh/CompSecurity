.class final Lcom/a/a/b/o;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/a/a/b/l;


# direct methods
.method constructor <init>(Lcom/a/a/b/l;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/o;->a:Lcom/a/a/b/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/o;->a:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->d:Lcom/a/a/b/f/a;

    iget-object v0, p0, Lcom/a/a/b/o;->a:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/b/o;->a:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    return-void
.end method
