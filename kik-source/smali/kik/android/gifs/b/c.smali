.class public abstract Lkik/android/gifs/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:I

.field private c:Lcom/kik/g/p;

.field private d:Z


# direct methods
.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/gifs/b/c;->c:Lcom/kik/g/p;

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/gifs/b/c;->d:Z

    .line 21
    iput-object p1, p0, Lkik/android/gifs/b/c;->a:Ljava/lang/String;

    .line 22
    iput p2, p0, Lkik/android/gifs/b/c;->b:I

    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/gifs/b/c;->c:Lcom/kik/g/p;

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/gifs/b/c;->d:Z

    .line 33
    iget-object v0, p0, Lkik/android/gifs/b/c;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 34
    return-void
.end method

.method protected final c()Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lkik/android/gifs/b/c;->d:Z

    return v0
.end method

.method protected abstract d()Lkik/android/gifs/b/b;
.end method

.method public run()V
    .locals 3

    .prologue
    .line 39
    iget-boolean v0, p0, Lkik/android/gifs/b/c;->d:Z

    if-eqz v0, :cond_0

    .line 51
    :goto_0
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, Lkik/android/gifs/b/c;->d()Lkik/android/gifs/b/b;

    move-result-object v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    iget-object v0, p0, Lkik/android/gifs/b/c;->c:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Failed to decode"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p0, Lkik/android/gifs/b/c;->c:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
