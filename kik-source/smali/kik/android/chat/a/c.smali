.class final Lkik/android/chat/a/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/a/a;


# direct methods
.method constructor <init>(Lkik/android/chat/a/a;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lkik/android/chat/a/c;->a:Lkik/android/chat/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 90
    check-cast p1, Lcom/kik/n/a/k/a;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/a/c;->a:Lkik/android/chat/a/a;

    invoke-virtual {p1}, Lcom/kik/n/a/k/a;->c()Lcom/kik/n/a/k/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/a/a;->a(Lcom/kik/n/a/k/a$a;)V

    iget-object v0, p0, Lkik/android/chat/a/c;->a:Lkik/android/chat/a/a;

    invoke-virtual {p1}, Lcom/kik/n/a/k/a;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/chat/a/a;->a(Z)V

    iget-object v0, p0, Lkik/android/chat/a/c;->a:Lkik/android/chat/a/a;

    invoke-static {v0}, Lkik/android/chat/a/a;->a(Lkik/android/chat/a/a;)V

    iget-object v0, p0, Lkik/android/chat/a/c;->a:Lkik/android/chat/a/a;

    invoke-static {v0}, Lkik/android/chat/a/a;->b(Lkik/android/chat/a/a;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/n/a/k/a;->c()Lcom/kik/n/a/k/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
