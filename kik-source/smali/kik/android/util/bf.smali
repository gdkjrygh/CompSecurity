.class public abstract Lkik/android/util/bf;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs a([Ljava/lang/Object;)Landroid/os/AsyncTask;
    .locals 2

    .prologue
    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 23
    invoke-virtual {p0, p1}, Lkik/android/util/bf;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    .line 26
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lkik/android/util/bf;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    goto :goto_0
.end method
