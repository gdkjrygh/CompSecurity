.class final Lcom/roidapp/cloudlib/sns/t;
.super Lcom/roidapp/cloudlib/sns/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/x",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/w;)V
    .locals 0

    .prologue
    .line 526
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 526
    check-cast p1, Lorg/json/JSONObject;

    .line 1530
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1533
    :goto_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/x;->a(Ljava/lang/Object;)V

    .line 526
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
