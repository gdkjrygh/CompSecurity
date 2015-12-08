.class Lcom/flurry/sdk/iy$14;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/flurry/sdk/iy$14;->a:Lcom/flurry/sdk/iy;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 271
    iget-object v0, p0, Lcom/flurry/sdk/iy$14;->a:Lcom/flurry/sdk/iy;

    const/4 v1, 0x1

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/flurry/sdk/iy;->a(Lcom/flurry/sdk/iy;ZJ)V

    .line 272
    return-void
.end method
