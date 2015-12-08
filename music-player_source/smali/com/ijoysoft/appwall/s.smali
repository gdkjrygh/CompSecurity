.class public final Lcom/ijoysoft/appwall/s;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ijoysoft/appwall/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ijoysoft/appwall/t;-><init>(Lcom/ijoysoft/appwall/s;B)V

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/t;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/ijoysoft/appwall/s;->a:Ljava/util/ArrayList;

    return-void
.end method
