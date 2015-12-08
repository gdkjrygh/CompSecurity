.class final Lkik/android/f/a/u;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/d/a/a;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/a/d/a/a;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 934
    iput-object p1, p0, Lkik/android/f/a/u;->d:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/f/a/u;->b:Lkik/a/d/a/a;

    iput-object p4, p0, Lkik/android/f/a/u;->c:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 946
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 947
    iget-object v0, p0, Lkik/android/f/a/u;->b:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 949
    iget-object v0, p0, Lkik/android/f/a/u;->c:Landroid/app/Activity;

    iget-object v1, p0, Lkik/android/f/a/u;->b:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/f/a/u;->d:Lkik/android/f/a/f;

    invoke-static {v2}, Lkik/android/f/a/f;->a(Lkik/android/f/a/f;)Lcom/kik/cache/ad;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkik/android/f/a/ae;->a(Landroid/app/Activity;Lkik/a/d/a/a;Lcom/kik/cache/ad;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/f/a/v;

    invoke-direct {v1, p0}, Lkik/android/f/a/v;-><init>(Lkik/android/f/a/u;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 973
    :goto_0
    return-void

    .line 971
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/u;->c:Landroid/app/Activity;

    iget-object v1, p0, Lkik/android/f/a/u;->b:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/f/a/u;->d:Lkik/android/f/a/f;

    invoke-static {v2}, Lkik/android/f/a/f;->a(Lkik/android/f/a/f;)Lcom/kik/cache/ad;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkik/android/f/a/ae;->a(Landroid/app/Activity;Lkik/a/d/a/a;Lcom/kik/cache/ad;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 938
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 939
    iget-object v0, p0, Lkik/android/f/a/u;->d:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->b()V

    .line 940
    iget-object v0, p0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 941
    return-void
.end method
