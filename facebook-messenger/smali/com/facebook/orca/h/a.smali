.class public Lcom/facebook/orca/h/a;
.super Ljava/lang/Object;
.source "LogReportFetcher.java"


# instance fields
.field private final a:Lcom/facebook/common/c/a;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/common/c/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/c/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/h/a;->a:Lcom/facebook/common/c/a;

    .line 24
    iput-object p2, p0, Lcom/facebook/orca/h/a;->b:Ljavax/inject/a;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/c/f;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 28
    iget-object v0, p0, Lcom/facebook/orca/h/a;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 36
    :goto_0
    return-object v0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/h/a;->a:Lcom/facebook/common/c/a;

    invoke-virtual {v0}, Lcom/facebook/common/c/a;->b()Ljava/util/List;

    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    .line 34
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/c/f;

    goto :goto_0
.end method
