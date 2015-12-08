.class public final Lcom/roidapp/cloudlib/sns/n;
.super Lcom/roidapp/cloudlib/sns/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/roidapp/cloudlib/sns/b/v;",
        ">",
        "Lcom/roidapp/cloudlib/sns/o",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/i;",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0, p1, p2, p4}, Lcom/roidapp/cloudlib/sns/o;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 21
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/n;->e:Ljava/lang/Class;

    .line 22
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 16
    sget-object v0, Lcom/roidapp/baselib/e/i;->a:Lcom/roidapp/baselib/e/i;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 11
    .line 1026
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1027
    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1028
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/n;->e:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/v;

    .line 1029
    invoke-interface {v0, v1, p2}, Lcom/roidapp/cloudlib/sns/b/v;->a(Lorg/json/JSONObject;Z)V

    .line 1030
    if-eqz p2, :cond_0

    .line 1031
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/n;->b(Ljava/lang/String;)V

    .line 1033
    :cond_0
    return-object v0

    .line 1036
    :cond_1
    new-instance v0, Lcom/roidapp/cloudlib/sns/z;

    const-string v2, "code"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/z;-><init>(I)V

    throw v0
.end method
