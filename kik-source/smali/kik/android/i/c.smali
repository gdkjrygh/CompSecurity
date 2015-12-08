.class final Lkik/android/i/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/i/a;

.field final synthetic c:Lkik/android/i/b;


# direct methods
.method constructor <init>(Lkik/android/i/b;ILkik/android/i/a;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    iput p2, p0, Lkik/android/i/c;->a:I

    iput-object p3, p0, Lkik/android/i/c;->b:Lkik/android/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 159
    iget-object v0, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    invoke-static {v0}, Lkik/android/i/b;->b(Lkik/android/i/b;)Ljava/util/TreeSet;

    move-result-object v0

    iget-object v1, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    invoke-static {v1}, Lkik/android/i/b;->a(Lkik/android/i/b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    invoke-static {v0}, Lkik/android/i/b;->a(Lkik/android/i/b;)I

    move-result v0

    iget v1, p0, Lkik/android/i/c;->a:I

    if-le v0, v1, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 163
    :cond_1
    iget-object v0, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    invoke-static {v0}, Lkik/android/i/b;->b(Lkik/android/i/b;)Ljava/util/TreeSet;

    move-result-object v0

    iget v1, p0, Lkik/android/i/c;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lkik/android/i/c;->b:Lkik/android/i/a;

    iget v1, p0, Lkik/android/i/c;->a:I

    invoke-interface {v0, v1}, Lkik/android/i/a;->a(I)V

    .line 165
    monitor-enter p0

    .line 166
    :try_start_0
    iget-object v0, p0, Lkik/android/i/c;->c:Lkik/android/i/b;

    iget v1, p0, Lkik/android/i/c;->a:I

    invoke-static {v0, v1}, Lkik/android/i/b;->a(Lkik/android/i/b;I)I

    .line 167
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
