.class final Lcom/google/a/b/a/ao;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/am;

.field final synthetic b:Lcom/google/a/b/a/an;


# direct methods
.method constructor <init>(Lcom/google/a/b/a/an;Lcom/google/a/am;)V
    .locals 0

    .prologue
    .line 515
    iput-object p1, p0, Lcom/google/a/b/a/ao;->b:Lcom/google/a/b/a/an;

    iput-object p2, p0, Lcom/google/a/b/a/ao;->a:Lcom/google/a/am;

    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 515
    .line 1517
    iget-object v0, p0, Lcom/google/a/b/a/ao;->a:Lcom/google/a/am;

    invoke-virtual {v0, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    .line 1518
    if-eqz v0, :cond_0

    new-instance v1, Ljava/sql/Timestamp;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/sql/Timestamp;-><init>(J)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 515
    goto :goto_0
.end method

.method public final bridge synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 515
    check-cast p2, Ljava/sql/Timestamp;

    .line 1522
    iget-object v0, p0, Lcom/google/a/b/a/ao;->a:Lcom/google/a/am;

    invoke-virtual {v0, p1, p2}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 515
    return-void
.end method
