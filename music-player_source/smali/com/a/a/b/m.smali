.class final Lcom/a/a/b/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/a/a/b/l;


# direct methods
.method constructor <init>(Lcom/a/a/b/l;II)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/m;->c:Lcom/a/a/b/l;

    iput p2, p0, Lcom/a/a/b/m;->a:I

    iput p3, p0, Lcom/a/a/b/m;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/m;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->e:Lcom/a/a/b/f/b;

    iget-object v0, p0, Lcom/a/a/b/m;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/b/m;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    iget v0, p0, Lcom/a/a/b/m;->a:I

    iget v0, p0, Lcom/a/a/b/m;->b:I

    return-void
.end method
