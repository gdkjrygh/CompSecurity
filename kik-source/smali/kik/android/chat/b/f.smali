.class final Lkik/android/chat/b/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/b/d;


# direct methods
.method constructor <init>(Lkik/android/chat/b/d;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lkik/android/chat/b/f;->a:Lkik/android/chat/b/d;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 135
    check-cast p1, Lcom/kik/n/a/k/a$a;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/b/f;->a:Lkik/android/chat/b/d;

    iget-object v1, p0, Lkik/android/chat/b/f;->a:Lkik/android/chat/b/d;

    invoke-static {v1, p1}, Lkik/android/chat/b/d;->a(Lkik/android/chat/b/d;Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/b/d;->a(Lkik/android/chat/b/d;Lkik/android/chat/b/b;)Lkik/android/chat/b/b;

    :cond_0
    return-void
.end method
