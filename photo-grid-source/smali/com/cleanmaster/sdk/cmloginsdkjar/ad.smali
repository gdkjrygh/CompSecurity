.class final Lcom/cleanmaster/sdk/cmloginsdkjar/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/ac;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;JJ)V
    .locals 1

    .prologue
    .line 51
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

    iput-wide p3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->b:J

    iput-wide p5, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 54
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->b:J

    iget-wide v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/ad;->c:J

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;->onProgress(JJ)V

    .line 55
    return-void
.end method
