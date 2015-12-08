.class final Lkik/android/h/g;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/h/a;


# direct methods
.method constructor <init>(Lkik/android/h/a;)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 272
    check-cast p1, Lcom/kik/n/a/a/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/n/a/a/a;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Lkik/a/d/c;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    iget-object v2, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    invoke-static {v2, v1}, Lkik/android/h/a;->a(Lkik/android/h/a;Lkik/a/d/c;)Lkik/a/d/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    invoke-static {v0}, Lkik/android/h/a;->b(Lkik/android/h/a;)Lkik/a/e/v;

    move-result-object v0

    const-string v2, "AddressIntegration.MATCHING_OPT_IN_KEY"

    const-string v3, "true"

    invoke-interface {v0, v2, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    :goto_0
    iget-object v0, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    iget-object v0, v0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    invoke-static {v0}, Lkik/android/h/a;->b(Lkik/android/h/a;)Lkik/a/e/v;

    move-result-object v0

    const-string v2, "AddressIntegration.MATCHING_OPT_IN_KEY"

    const-string v3, "false"

    invoke-interface {v0, v2, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 302
    invoke-static {}, Lkik/android/h/a;->i()Lorg/c/b;

    move-result-object v0

    const-string v1, "Failed to load address book settings"

    invoke-interface {v0, v1, p1}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 303
    iget-object v0, p0, Lkik/android/h/g;->a:Lkik/android/h/a;

    iget-object v0, v0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 304
    return-void
.end method
