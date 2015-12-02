.class Lcom/google/common/a/cg;
.super Lcom/google/common/a/bm;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/bm",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field a:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field b:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/a/cf;


# direct methods
.method constructor <init>(Lcom/google/common/a/cf;)V
    .locals 0

    .prologue
    .line 3285
    iput-object p1, p0, Lcom/google/common/a/cg;->c:Lcom/google/common/a/cf;

    invoke-direct {p0}, Lcom/google/common/a/bm;-><init>()V

    .line 3295
    iput-object p0, p0, Lcom/google/common/a/cg;->a:Lcom/google/common/a/cm;

    .line 3307
    iput-object p0, p0, Lcom/google/common/a/cg;->b:Lcom/google/common/a/cm;

    return-void
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 2

    .prologue
    .line 3289
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method

.method public getNextExpirable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3299
    iget-object v0, p0, Lcom/google/common/a/cg;->a:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public getPreviousExpirable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3311
    iget-object v0, p0, Lcom/google/common/a/cg;->b:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 0

    .prologue
    .line 3293
    return-void
.end method

.method public setNextExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 3304
    iput-object p1, p0, Lcom/google/common/a/cg;->a:Lcom/google/common/a/cm;

    .line 3305
    return-void
.end method

.method public setPreviousExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 3316
    iput-object p1, p0, Lcom/google/common/a/cg;->b:Lcom/google/common/a/cm;

    .line 3317
    return-void
.end method
