.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field final a:Ljava/io/OutputStream;

.field final b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;)V
    .locals 0

    .prologue
    .line 418
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 419
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    .line 420
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;

    .line 421
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .prologue
    .line 426
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 428
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;->a()V

    .line 429
    return-void

    .line 428
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;

    invoke-interface {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;->a()V

    throw v0
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 434
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 435
    return-void
.end method

.method public final write(I)V
    .locals 1

    .prologue
    .line 449
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 450
    return-void
.end method

.method public final write([B)V
    .locals 1

    .prologue
    .line 444
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 445
    return-void
.end method

.method public final write([BII)V
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 440
    return-void
.end method
