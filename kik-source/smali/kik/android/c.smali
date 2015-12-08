.class final Lkik/android/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a;


# direct methods
.method constructor <init>(Lkik/android/a;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->b(Lkik/android/a;)Lkik/a/e/w;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->b(Lkik/android/a;)Lkik/a/e/w;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-static {v1}, Lkik/android/a;->c(Lkik/android/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/c;->a:Lkik/android/a;

    iget-object v1, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-static {v1}, Lkik/android/a;->b(Lkik/android/a;)Lkik/a/e/w;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/android/a;->a(Lkik/android/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-virtual {v0}, Lkik/android/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/c;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->d(Lkik/android/a;)V

    :cond_0
    return-void
.end method
