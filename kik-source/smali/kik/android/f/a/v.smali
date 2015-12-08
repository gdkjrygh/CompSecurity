.class final Lkik/android/f/a/v;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/f/a/u;


# direct methods
.method constructor <init>(Lkik/android/f/a/u;)V
    .locals 0

    .prologue
    .line 949
    iput-object p1, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 949
    check-cast p1, Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    iget-object v0, v0, Lkik/android/f/a/u;->d:Lkik/android/f/a/f;

    iget-object v1, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    iget-object v1, v1, Lkik/android/f/a/u;->c:Landroid/app/Activity;

    invoke-static {v0, p1, v1}, Lkik/android/f/a/f;->a(Lkik/android/f/a/f;Lkik/a/d/a/a;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    iget-object v0, v0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    iget-object v0, v0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Failed to prepare local video URI"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 965
    iget-object v0, p0, Lkik/android/f/a/v;->a:Lkik/android/f/a/u;

    iget-object v0, v0, Lkik/android/f/a/u;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 966
    return-void
.end method
