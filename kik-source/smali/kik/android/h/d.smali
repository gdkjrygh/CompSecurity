.class final Lkik/android/h/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/h/a;


# direct methods
.method constructor <init>(Lkik/android/h/a;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lkik/android/h/d;->b:Lkik/android/h/a;

    iput-object p2, p0, Lkik/android/h/d;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 167
    check-cast p1, Lkik/a/d/c;

    invoke-virtual {p1}, Lkik/a/d/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/h/d;->a:Lcom/kik/g/p;

    invoke-virtual {p1}, Lkik/a/d/c;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/h/d;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 190
    iget-object v0, p0, Lkik/android/h/d;->b:Lkik/android/h/a;

    new-instance v1, Lkik/a/d/c;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    invoke-static {v0, v1}, Lkik/android/h/a;->a(Lkik/android/h/a;Lkik/a/d/c;)Lkik/a/d/c;

    .line 191
    iget-object v0, p0, Lkik/android/h/d;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 192
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 193
    return-void
.end method
