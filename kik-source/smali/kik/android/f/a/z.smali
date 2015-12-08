.class final Lkik/android/f/a/z;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lkik/a/e/v;

.field final synthetic d:Lcom/kik/g/p;

.field final synthetic e:Z

.field final synthetic f:Lkik/a/e/r;

.field final synthetic g:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;Landroid/app/Activity;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/r;)V
    .locals 1

    .prologue
    .line 1025
    iput-object p1, p0, Lkik/android/f/a/z;->g:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/z;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/f/a/z;->b:Landroid/app/Activity;

    iput-object p4, p0, Lkik/android/f/a/z;->c:Lkik/a/e/v;

    iput-object p5, p0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/f/a/z;->e:Z

    iput-object p6, p0, Lkik/android/f/a/z;->f:Lkik/a/e/r;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1025
    check-cast p1, Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/f/a/z;->a:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/aa;

    invoke-direct {v1, p0, p1}, Lkik/android/f/a/aa;-><init>(Lkik/android/f/a/z;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 1076
    iget-object v0, p0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1077
    iget-object v0, p0, Lkik/android/f/a/z;->d:Lcom/kik/g/p;

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

    .line 1079
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/z;->a:Lcom/kik/g/p;

    new-instance v1, Lkik/android/f/a/ab;

    invoke-direct {v1, p0, p1}, Lkik/android/f/a/ab;-><init>(Lkik/android/f/a/z;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1099
    return-void
.end method
