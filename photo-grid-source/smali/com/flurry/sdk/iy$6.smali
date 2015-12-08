.class Lcom/flurry/sdk/iy$6;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;J)V
    .locals 0

    .prologue
    .line 396
    iput-object p1, p0, Lcom/flurry/sdk/iy$6;->b:Lcom/flurry/sdk/iy;

    iput-wide p2, p0, Lcom/flurry/sdk/iy$6;->a:J

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 399
    iget-object v0, p0, Lcom/flurry/sdk/iy$6;->b:Lcom/flurry/sdk/iy;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/flurry/sdk/iy$6;->a:J

    invoke-static {v0, v1, v2, v3}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/iy;ZJ)V

    .line 400
    return-void
.end method
