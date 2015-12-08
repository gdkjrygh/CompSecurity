.class final Lkik/android/gifs/b/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/gifs/b/e;


# direct methods
.method constructor <init>(Lkik/android/gifs/b/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lkik/android/gifs/b/f;->b:Lkik/android/gifs/b/e;

    iput-object p2, p0, Lkik/android/gifs/b/f;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lkik/android/gifs/b/f;->b:Lkik/android/gifs/b/e;

    invoke-static {v0}, Lkik/android/gifs/b/e;->a(Lkik/android/gifs/b/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/gifs/b/f;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    return-void
.end method
