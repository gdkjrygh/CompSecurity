.class Lcom/flurry/sdk/id$2$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Lcom/flurry/sdk/id$2;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id$2;[B)V
    .locals 0

    .prologue
    .line 478
    iput-object p1, p0, Lcom/flurry/sdk/id$2$1;->b:Lcom/flurry/sdk/id$2;

    iput-object p2, p0, Lcom/flurry/sdk/id$2$1;->a:[B

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 481
    iget-object v0, p0, Lcom/flurry/sdk/id$2$1;->b:Lcom/flurry/sdk/id$2;

    iget-object v0, v0, Lcom/flurry/sdk/id$2;->c:Lcom/flurry/sdk/id;

    iget-object v1, p0, Lcom/flurry/sdk/id$2$1;->b:Lcom/flurry/sdk/id$2;

    iget-wide v2, v1, Lcom/flurry/sdk/id$2;->a:J

    iget-object v1, p0, Lcom/flurry/sdk/id$2$1;->b:Lcom/flurry/sdk/id$2;

    iget-boolean v1, v1, Lcom/flurry/sdk/id$2;->b:Z

    iget-object v4, p0, Lcom/flurry/sdk/id$2$1;->a:[B

    invoke-static {v0, v2, v3, v1, v4}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/id;JZ[B)V

    .line 482
    return-void
.end method
