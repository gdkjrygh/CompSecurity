.class final Lcom/a/a/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Landroid/graphics/Bitmap;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/a/a/b/e/a;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/a/a/b/c/a;

.field private final f:Lcom/a/a/b/f/a;

.field private final g:Lcom/a/a/b/i;

.field private final h:Lcom/a/a/b/a/g;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/a/a/b/k;Lcom/a/a/b/i;Lcom/a/a/b/a/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/b/c;->a:Landroid/graphics/Bitmap;

    iget-object v0, p2, Lcom/a/a/b/k;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/b/c;->b:Ljava/lang/String;

    iget-object v0, p2, Lcom/a/a/b/k;->c:Lcom/a/a/b/e/a;

    iput-object v0, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    iget-object v0, p2, Lcom/a/a/b/k;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/b/c;->d:Ljava/lang/String;

    iget-object v0, p2, Lcom/a/a/b/k;->e:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->q()Lcom/a/a/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/c;->e:Lcom/a/a/b/c/a;

    iget-object v0, p2, Lcom/a/a/b/k;->f:Lcom/a/a/b/f/a;

    iput-object v0, p0, Lcom/a/a/b/c;->f:Lcom/a/a/b/f/a;

    iput-object p3, p0, Lcom/a/a/b/c;->g:Lcom/a/a/b/i;

    iput-object p4, p0, Lcom/a/a/b/c;->h:Lcom/a/a/b/a/g;

    return-void
.end method


# virtual methods
.method final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/a/a/b/c;->i:Z

    return-void
.end method

.method public final run()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/a/a/b/c;->i:Z

    if-eqz v0, :cond_0

    const-string v0, "ImageAware was collected by GC. Task is cancelled. [%s]"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/a/a/b/c;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/c;->f:Lcom/a/a/b/f/a;

    iget-object v0, p0, Lcom/a/a/b/c;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/a/a/b/c;->g:Lcom/a/a/b/i;

    iget-object v3, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-virtual {v0, v3}, Lcom/a/a/b/i;->a(Lcom/a/a/b/e/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/a/a/b/c;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/a/a/b/c;->i:Z

    if-eqz v0, :cond_2

    const-string v0, "ImageAware is reused for another image. Task is cancelled. [%s]"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/a/a/b/c;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/a/a/b/c;->f:Lcom/a/a/b/f/a;

    iget-object v0, p0, Lcom/a/a/b/c;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    iget-boolean v0, p0, Lcom/a/a/b/c;->i:Z

    if-eqz v0, :cond_5

    const-string v0, "Display image in ImageAware (loaded from %1$s) [%2$s]"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/a/a/b/c;->h:Lcom/a/a/b/a/g;

    aput-object v4, v3, v2

    iget-object v2, p0, Lcom/a/a/b/c;->d:Ljava/lang/String;

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Lcom/a/a/b/c;->e:Lcom/a/a/b/c/a;

    iget-object v1, p0, Lcom/a/a/b/c;->a:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    iget-object v3, p0, Lcom/a/a/b/c;->h:Lcom/a/a/b/a/g;

    invoke-interface {v0, v1, v2}, Lcom/a/a/b/c/a;->a(Landroid/graphics/Bitmap;Lcom/a/a/b/e/a;)V

    iget-object v0, p0, Lcom/a/a/b/c;->f:Lcom/a/a/b/f/a;

    iget-object v1, p0, Lcom/a/a/b/c;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-interface {v1}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    iget-object v1, p0, Lcom/a/a/b/c;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0}, Lcom/a/a/b/f/a;->b()V

    iget-object v0, p0, Lcom/a/a/b/c;->g:Lcom/a/a/b/i;

    iget-object v1, p0, Lcom/a/a/b/c;->c:Lcom/a/a/b/e/a;

    invoke-virtual {v0, v1}, Lcom/a/a/b/i;->b(Lcom/a/a/b/e/a;)V

    goto :goto_0
.end method
