.class Lcom/flurry/sdk/iy$9$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/iy$9;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy$9;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/flurry/sdk/iy$9$1;->a:Lcom/flurry/sdk/iy$9;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 192
    iget-object v0, p0, Lcom/flurry/sdk/iy$9$1;->a:Lcom/flurry/sdk/iy$9;

    iget-object v0, v0, Lcom/flurry/sdk/iy$9;->a:Lcom/flurry/sdk/iy;

    const/4 v1, 0x1

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/iy;ZJ)V

    .line 193
    return-void
.end method
