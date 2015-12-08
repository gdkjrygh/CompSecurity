.class final Lkik/android/gifs/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lkik/android/gifs/a/f$a;

.field final synthetic d:Lcom/kik/g/p;

.field final synthetic e:Lkik/android/gifs/view/GifView;

.field final synthetic f:Lkik/android/gifs/b;


# direct methods
.method constructor <init>(Lkik/android/gifs/b;Ljava/lang/String;Lkik/android/gifs/a/f$a;Lcom/kik/g/p;Lkik/android/gifs/view/GifView;)V
    .locals 1

    .prologue
    .line 119
    iput-object p1, p0, Lkik/android/gifs/d;->f:Lkik/android/gifs/b;

    iput-object p2, p0, Lkik/android/gifs/d;->a:Ljava/lang/String;

    const/16 v0, 0xc8

    iput v0, p0, Lkik/android/gifs/d;->b:I

    iput-object p3, p0, Lkik/android/gifs/d;->c:Lkik/android/gifs/a/f$a;

    iput-object p4, p0, Lkik/android/gifs/d;->d:Lcom/kik/g/p;

    iput-object p5, p0, Lkik/android/gifs/d;->e:Lkik/android/gifs/view/GifView;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lkik/android/gifs/d;->f:Lkik/android/gifs/b;

    invoke-static {v0}, Lkik/android/gifs/b;->a(Lkik/android/gifs/b;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/gifs/d;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    .line 119
    move-object v2, p1

    check-cast v2, Ljava/io/File;

    iget-object v0, p0, Lkik/android/gifs/d;->f:Lkik/android/gifs/b;

    iget-object v1, p0, Lkik/android/gifs/d;->a:Ljava/lang/String;

    iget v3, p0, Lkik/android/gifs/d;->b:I

    iget-object v4, p0, Lkik/android/gifs/d;->c:Lkik/android/gifs/a/f$a;

    iget-object v5, p0, Lkik/android/gifs/d;->d:Lcom/kik/g/p;

    iget-object v6, p0, Lkik/android/gifs/d;->e:Lkik/android/gifs/view/GifView;

    invoke-static/range {v0 .. v6}, Lkik/android/gifs/b;->a(Lkik/android/gifs/b;Ljava/lang/String;Ljava/io/File;ILkik/android/gifs/a/f$a;Lcom/kik/g/p;Lkik/android/gifs/view/GifView;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lkik/android/gifs/d;->d:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 136
    return-void
.end method
