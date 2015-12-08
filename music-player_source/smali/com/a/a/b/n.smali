.class final Lcom/a/a/b/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/a/a/b/a/c;

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Lcom/a/a/b/l;


# direct methods
.method constructor <init>(Lcom/a/a/b/l;Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iput-object p2, p0, Lcom/a/a/b/n;->a:Lcom/a/a/b/a/c;

    iput-object p3, p0, Lcom/a/a/b/n;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    iget-object v1, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v1, v1, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    iget-object v2, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    invoke-static {v2}, Lcom/a/a/b/l;->a(Lcom/a/a/b/l;)Lcom/a/a/b/g;

    move-result-object v2

    iget-object v2, v2, Lcom/a/a/b/g;->a:Landroid/content/res/Resources;

    invoke-virtual {v1, v2}, Lcom/a/a/b/d;->c(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/a/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->d:Lcom/a/a/b/f/a;

    iget-object v0, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/b/n;->c:Lcom/a/a/b/l;

    iget-object v0, v0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    new-instance v0, Lcom/a/a/b/a/b;

    iget-object v1, p0, Lcom/a/a/b/n;->a:Lcom/a/a/b/a/c;

    iget-object v2, p0, Lcom/a/a/b/n;->b:Ljava/lang/Throwable;

    invoke-direct {v0, v1, v2}, Lcom/a/a/b/a/b;-><init>(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    return-void
.end method
