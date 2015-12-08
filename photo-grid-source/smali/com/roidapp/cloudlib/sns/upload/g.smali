.class final Lcom/roidapp/cloudlib/sns/upload/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/roidapp/cloudlib/sns/upload/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/upload/e;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/g;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 115
    check-cast p1, Lcom/roidapp/cloudlib/sns/upload/i;

    check-cast p2, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 1118
    iget-wide v0, p1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    iget-wide v2, p2, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-wide v0, p1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    iget-wide v2, p2, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 115
    goto :goto_0
.end method
