.class Lcom/flurry/sdk/iy$4;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:I

.field final synthetic e:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;JJJI)V
    .locals 0

    .prologue
    .line 342
    iput-object p1, p0, Lcom/flurry/sdk/iy$4;->e:Lcom/flurry/sdk/iy;

    iput-wide p2, p0, Lcom/flurry/sdk/iy$4;->a:J

    iput-wide p4, p0, Lcom/flurry/sdk/iy$4;->b:J

    iput-wide p6, p0, Lcom/flurry/sdk/iy$4;->c:J

    iput p8, p0, Lcom/flurry/sdk/iy$4;->d:I

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    .prologue
    .line 345
    iget-object v1, p0, Lcom/flurry/sdk/iy$4;->e:Lcom/flurry/sdk/iy;

    iget-wide v2, p0, Lcom/flurry/sdk/iy$4;->a:J

    iget-wide v4, p0, Lcom/flurry/sdk/iy$4;->b:J

    iget-wide v6, p0, Lcom/flurry/sdk/iy$4;->c:J

    iget v8, p0, Lcom/flurry/sdk/iy$4;->d:I

    invoke-virtual/range {v1 .. v8}, Lcom/flurry/sdk/iy;->a(JJJI)Lcom/flurry/sdk/iw;

    move-result-object v0

    .line 351
    iget-object v1, p0, Lcom/flurry/sdk/iy$4;->e:Lcom/flurry/sdk/iy;

    invoke-static {v1}, Lcom/flurry/sdk/iy;->f(Lcom/flurry/sdk/iy;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 353
    iget-object v1, p0, Lcom/flurry/sdk/iy$4;->e:Lcom/flurry/sdk/iy;

    invoke-static {v1}, Lcom/flurry/sdk/iy;->f(Lcom/flurry/sdk/iy;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    iget-object v0, p0, Lcom/flurry/sdk/iy$4;->e:Lcom/flurry/sdk/iy;

    invoke-virtual {v0}, Lcom/flurry/sdk/iy;->c()V

    .line 356
    return-void
.end method
