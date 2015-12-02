.class Lcom/google/common/a/cd;
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

.field final synthetic c:Lcom/google/common/a/cc;


# direct methods
.method constructor <init>(Lcom/google/common/a/cc;)V
    .locals 0

    .prologue
    .line 3157
    iput-object p1, p0, Lcom/google/common/a/cd;->c:Lcom/google/common/a/cc;

    invoke-direct {p0}, Lcom/google/common/a/bm;-><init>()V

    .line 3159
    iput-object p0, p0, Lcom/google/common/a/cd;->a:Lcom/google/common/a/cm;

    .line 3171
    iput-object p0, p0, Lcom/google/common/a/cd;->b:Lcom/google/common/a/cm;

    return-void
.end method


# virtual methods
.method public getNextEvictable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3163
    iget-object v0, p0, Lcom/google/common/a/cd;->a:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public getPreviousEvictable()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3175
    iget-object v0, p0, Lcom/google/common/a/cd;->b:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setNextEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 3168
    iput-object p1, p0, Lcom/google/common/a/cd;->a:Lcom/google/common/a/cm;

    .line 3169
    return-void
.end method

.method public setPreviousEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 3180
    iput-object p1, p0, Lcom/google/common/a/cd;->b:Lcom/google/common/a/cm;

    .line 3181
    return-void
.end method
