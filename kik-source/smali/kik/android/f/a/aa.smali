.class final Lkik/android/f/a/aa;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/f/a/z;


# direct methods
.method constructor <init>(Lkik/android/f/a/z;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 1029
    iput-object p1, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iput-object p2, p0, Lkik/android/f/a/aa;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 1029
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/f/a/aa;->a:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v2, v2, Lkik/android/f/a/z;->g:Lkik/android/f/a/f;

    iget-object v3, p0, Lkik/android/f/a/aa;->a:Lkik/a/d/a/a;

    iget-object v4, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v4, v4, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    iget-object v5, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v5, v5, Lkik/android/f/a/z;->c:Lkik/a/e/v;

    invoke-static {v2, v0, v3, v4, v5}, Lkik/android/f/a/f;->a(Lkik/android/f/a/f;Ljava/lang/String;Lkik/a/d/a/a;Landroid/content/Context;Lkik/a/e/v;)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Not enough free memory on device"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/app/Activity;)V

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->g:Lkik/android/f/a/f;

    iget-object v2, p0, Lkik/android/f/a/aa;->a:Lkik/a/d/a/a;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    sget v1, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    iget-object v2, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-boolean v2, v2, Lkik/android/f/a/z;->e:Z

    iget-object v3, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v3, v3, Lkik/android/f/a/z;->f:Lkik/a/e/r;

    invoke-static {p1, v0, v1, v2, v3}, Lkik/android/f/a/f;->a(Ljava/lang/String;Landroid/app/Activity;IZLkik/a/e/r;)V

    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/android/f/a/aa;->a:Lkik/a/d/a/a;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1056
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1057
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 1059
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 1064
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1065
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Pick user failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1066
    iget-object v0, p0, Lkik/android/f/a/aa;->b:Lkik/android/f/a/z;

    iget-object v0, v0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/app/Activity;)V

    .line 1068
    :cond_0
    return-void
.end method
