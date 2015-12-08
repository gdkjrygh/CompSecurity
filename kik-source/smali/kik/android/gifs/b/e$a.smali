.class final Lkik/android/gifs/b/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/gifs/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/gifs/b/e;

.field private b:Lkik/android/gifs/b/c;


# direct methods
.method private constructor <init>(Lkik/android/gifs/b/e;Lkik/android/gifs/b/c;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lkik/android/gifs/b/e$a;->a:Lkik/android/gifs/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p2, p0, Lkik/android/gifs/b/e$a;->b:Lkik/android/gifs/b/c;

    .line 95
    return-void
.end method

.method synthetic constructor <init>(Lkik/android/gifs/b/e;Lkik/android/gifs/b/c;B)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lkik/android/gifs/b/e$a;-><init>(Lkik/android/gifs/b/e;Lkik/android/gifs/b/c;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lkik/android/gifs/b/e$a;->b:Lkik/android/gifs/b/c;

    invoke-virtual {v0}, Lkik/android/gifs/b/c;->a()Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Lkik/android/gifs/b/e$a;->b:Lkik/android/gifs/b/c;

    invoke-virtual {v0}, Lkik/android/gifs/b/c;->b()V

    .line 102
    iget-object v0, p0, Lkik/android/gifs/b/e$a;->a:Lkik/android/gifs/b/e;

    invoke-static {v0}, Lkik/android/gifs/b/e;->a(Lkik/android/gifs/b/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/gifs/b/e$a;->b:Lkik/android/gifs/b/c;

    iget-object v1, v1, Lkik/android/gifs/b/c;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    :cond_0
    return-void
.end method
