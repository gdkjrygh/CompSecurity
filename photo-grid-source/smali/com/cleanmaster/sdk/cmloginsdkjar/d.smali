.class final Lcom/cleanmaster/sdk/cmloginsdkjar/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/c;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/c;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/c;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 55
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/c;

    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->a(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    move-result-object v1

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/c;

    invoke-static {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->b(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/d;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/c;

    invoke-static {v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;->c(Lcom/cleanmaster/sdk/cmloginsdkjar/c;)J

    move-result-wide v4

    invoke-interface/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;->onBatchProgress(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;JJ)V

    .line 56
    return-void
.end method
