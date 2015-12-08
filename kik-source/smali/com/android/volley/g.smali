.class final Lcom/android/volley/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic b:Lcom/android/volley/f;


# direct methods
.method constructor <init>(Lcom/android/volley/f;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/android/volley/g;->b:Lcom/android/volley/f;

    iput-object p2, p0, Lcom/android/volley/g;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/android/volley/g;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    return-void
.end method
