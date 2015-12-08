.class final Lcom/roidapp/imagelib/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/concurrent/Semaphore;

.field final synthetic b:Lcom/roidapp/imagelib/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/a;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/roidapp/imagelib/a/c;->b:Lcom/roidapp/imagelib/a/a;

    iput-object p2, p0, Lcom/roidapp/imagelib/a/c;->a:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/roidapp/imagelib/a/c;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 275
    return-void
.end method
