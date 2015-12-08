.class final Lkik/android/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/d;


# direct methods
.method constructor <init>(Lkik/android/d;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lkik/android/e;->a:Lkik/android/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->e(Lkik/android/a;)Lkik/a/e/v;

    move-result-object v0

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->f(Lkik/android/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->g(Lkik/android/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    :cond_0
    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->h(Lkik/android/a;)V

    .line 252
    :cond_1
    :goto_0
    return-void

    .line 248
    :cond_2
    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->i(Lkik/android/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lkik/android/e;->a:Lkik/android/d;

    iget-object v0, v0, Lkik/android/d;->a:Lkik/android/a;

    invoke-static {v0}, Lkik/android/a;->j(Lkik/android/a;)V

    goto :goto_0
.end method
