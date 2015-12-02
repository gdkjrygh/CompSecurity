.class final Lcom/google/common/a/da;
.super Lcom/google/common/a/cx;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Lcom/google/common/a/cm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/cx",
        "<TK;TV;>;",
        "Lcom/google/common/a/cm",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field volatile e:J

.field f:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field

.field g:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field

.field h:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field

.field i:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;ILcom/google/common/a/cm;)V
    .locals 2
    .param p3    # Lcom/google/common/a/cm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1148
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/cx;-><init>(Ljava/lang/Object;ILcom/google/common/a/cm;)V

    .line 1153
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/common/a/da;->e:J

    .line 1165
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/da;->f:Lcom/google/common/a/cm;

    .line 1178
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/da;->g:Lcom/google/common/a/cm;

    .line 1193
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/da;->h:Lcom/google/common/a/cm;

    .line 1206
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/da;->i:Lcom/google/common/a/cm;

    .line 1149
    return-void
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 2

    .prologue
    .line 1157
    iget-wide v0, p0, Lcom/google/common/a/da;->e:J

    return-wide v0
.end method

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
    .line 1198
    iget-object v0, p0, Lcom/google/common/a/da;->h:Lcom/google/common/a/cm;

    return-object v0
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
    .line 1170
    iget-object v0, p0, Lcom/google/common/a/da;->f:Lcom/google/common/a/cm;

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
    .line 1211
    iget-object v0, p0, Lcom/google/common/a/da;->i:Lcom/google/common/a/cm;

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
    .line 1183
    iget-object v0, p0, Lcom/google/common/a/da;->g:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 0

    .prologue
    .line 1162
    iput-wide p1, p0, Lcom/google/common/a/da;->e:J

    .line 1163
    return-void
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
    .line 1203
    iput-object p1, p0, Lcom/google/common/a/da;->h:Lcom/google/common/a/cm;

    .line 1204
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
    .line 1175
    iput-object p1, p0, Lcom/google/common/a/da;->f:Lcom/google/common/a/cm;

    .line 1176
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
    .line 1216
    iput-object p1, p0, Lcom/google/common/a/da;->i:Lcom/google/common/a/cm;

    .line 1217
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
    .line 1188
    iput-object p1, p0, Lcom/google/common/a/da;->g:Lcom/google/common/a/cm;

    .line 1189
    return-void
.end method
