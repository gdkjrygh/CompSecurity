.class final Lkik/android/gifs/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/gifs/b$a;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/gifs/b;


# direct methods
.method constructor <init>(Lkik/android/gifs/b;Lkik/android/gifs/b$a;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lkik/android/gifs/f;->c:Lkik/android/gifs/b;

    iput-object p2, p0, Lkik/android/gifs/f;->a:Lkik/android/gifs/b$a;

    iput-object p3, p0, Lkik/android/gifs/f;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lkik/android/gifs/f;->c:Lkik/android/gifs/b;

    invoke-static {v0}, Lkik/android/gifs/b;->b(Lkik/android/gifs/b;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/gifs/f;->a:Lkik/android/gifs/b$a;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 172
    check-cast p1, Lkik/android/gifs/view/a;

    iget-object v0, p0, Lkik/android/gifs/f;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lkik/android/gifs/f;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 189
    return-void
.end method
