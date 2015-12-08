.class final Lkik/android/f/a/l;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/e/r;

.field final synthetic c:Landroid/support/v4/app/Fragment;

.field final synthetic d:I

.field final synthetic e:Z

.field final synthetic f:Lcom/kik/g/p;

.field final synthetic g:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/a/e/r;Landroid/support/v4/app/Fragment;IZLcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1362
    iput-object p1, p0, Lkik/android/f/a/l;->g:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/l;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/f/a/l;->b:Lkik/a/e/r;

    iput-object p4, p0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    iput p5, p0, Lkik/android/f/a/l;->d:I

    iput-boolean p6, p0, Lkik/android/f/a/l;->e:Z

    iput-object p7, p0, Lkik/android/f/a/l;->f:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1362
    check-cast p1, Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/f/a/l;->a:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/m;

    invoke-direct {v1, p0, p1}, Lkik/android/f/a/m;-><init>(Lkik/android/f/a/l;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 1409
    iget-object v0, p0, Lkik/android/f/a/l;->f:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1410
    iget-object v0, p0, Lkik/android/f/a/l;->f:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Content message generation failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1412
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/l;->a:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/o;

    invoke-direct {v1, p0, p1}, Lkik/android/f/a/o;-><init>(Lkik/android/f/a/l;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1432
    return-void
.end method
