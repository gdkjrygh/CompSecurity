.class final Lcom/a/a/c/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/util/Date;

.field final synthetic b:Ljava/lang/Thread;

.field final synthetic c:Ljava/lang/Throwable;

.field final synthetic d:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/a/a/c/aj;->d:Lcom/a/a/c/x;

    iput-object p2, p0, Lcom/a/a/c/aj;->a:Ljava/util/Date;

    iput-object p3, p0, Lcom/a/a/c/aj;->b:Ljava/lang/Thread;

    iput-object p4, p0, Lcom/a/a/c/aj;->c:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 274
    iget-object v0, p0, Lcom/a/a/c/aj;->d:Lcom/a/a/c/x;

    iget-object v1, p0, Lcom/a/a/c/aj;->a:Ljava/util/Date;

    iget-object v2, p0, Lcom/a/a/c/aj;->b:Ljava/lang/Thread;

    iget-object v3, p0, Lcom/a/a/c/aj;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method
