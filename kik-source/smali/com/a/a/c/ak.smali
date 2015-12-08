.class final Lcom/a/a/c/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lcom/a/a/c/ak;->c:Lcom/a/a/c/x;

    iput-wide p2, p0, Lcom/a/a/c/ak;->a:J

    iput-object p4, p0, Lcom/a/a/c/ak;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 345
    iget-object v0, p0, Lcom/a/a/c/ak;->c:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/ak;->c:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->b(Lcom/a/a/c/x;)Lcom/a/a/c/ar;

    move-result-object v0

    iget-wide v2, p0, Lcom/a/a/c/ak;->a:J

    iget-object v1, p0, Lcom/a/a/c/ak;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v1}, Lcom/a/a/c/ar;->a(JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
