.class final Lkik/android/f/a/w;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;Landroid/app/Activity;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 977
    iput-object p1, p0, Lkik/android/f/a/w;->d:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/w;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/f/a/w;->b:Landroid/app/Activity;

    iput-object p4, p0, Lkik/android/f/a/w;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 977
    iget-object v0, p0, Lkik/android/f/a/w;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lkik/android/f/a/w;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lkik/android/f/a/w;->b:Landroid/app/Activity;

    const v2, 0x7f090148

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lkik/android/f/a/w;->b:Landroid/app/Activity;

    new-instance v2, Lkik/android/f/a/x;

    invoke-direct {v2, p0, v0}, Lkik/android/f/a/x;-><init>(Lkik/android/f/a/w;Landroid/app/ProgressDialog;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lkik/android/f/a/w;->a:Lcom/kik/g/p;

    new-instance v2, Lkik/android/f/a/y;

    invoke-direct {v2, p0, v0}, Lkik/android/f/a/y;-><init>(Lkik/android/f/a/w;Landroid/app/ProgressDialog;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    iget-object v0, p0, Lkik/android/f/a/w;->a:Lcom/kik/g/p;

    const-wide/16 v2, 0x3a98

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1006
    iget-object v0, p0, Lkik/android/f/a/w;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1007
    iget-object v0, p0, Lkik/android/f/a/w;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 1009
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 1014
    iget-object v0, p0, Lkik/android/f/a/w;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1015
    iget-object v0, p0, Lkik/android/f/a/w;->c:Lcom/kik/g/p;

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

    .line 1017
    iget-object v0, p0, Lkik/android/f/a/w;->b:Landroid/app/Activity;

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/app/Activity;)V

    .line 1019
    :cond_0
    return-void
.end method
