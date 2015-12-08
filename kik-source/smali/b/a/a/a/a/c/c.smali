.class final Lb/a/a/a/a/c/c;
.super Lb/a/a/a/a/c/a$e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lb/a/a/a/a/c/a;


# direct methods
.method constructor <init>(Lb/a/a/a/a/c/a;)V
    .locals 1

    .prologue
    .line 305
    iput-object p1, p0, Lb/a/a/a/a/c/c;->a:Lb/a/a/a/a/c/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/a/a/a/a/c/a$e;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 307
    iget-object v0, p0, Lb/a/a/a/a/c/c;->a:Lb/a/a/a/a/c/a;

    invoke-static {v0}, Lb/a/a/a/a/c/a;->a(Lb/a/a/a/a/c/a;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 309
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 311
    iget-object v0, p0, Lb/a/a/a/a/c/c;->a:Lb/a/a/a/a/c/a;

    iget-object v1, p0, Lb/a/a/a/a/c/c;->a:Lb/a/a/a/a/c/a;

    invoke-virtual {v1}, Lb/a/a/a/a/c/a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lb/a/a/a/a/c/a;->a(Lb/a/a/a/a/c/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
