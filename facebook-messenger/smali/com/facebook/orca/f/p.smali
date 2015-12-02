.class public Lcom/facebook/orca/f/p;
.super Ljava/lang/Object;
.source "SaveDraftManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/fbservice/ops/k;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/compose/MessageDraft;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/ops/k;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/orca/f/p;->a:Lcom/facebook/fbservice/ops/k;

    .line 34
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/p;->b:Ljava/util/Map;

    .line 35
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/p;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/f/p;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/f/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 41
    const-string v1, "threadId"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v1, "draft"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 43
    iget-object v1, p0, Lcom/facebook/orca/f/p;->a:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->t:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 46
    new-instance v1, Lcom/facebook/orca/f/q;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/f/q;-><init>(Lcom/facebook/orca/f/p;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 57
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/f/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/orca/compose/MessageDraft;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/f/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/MessageDraft;

    return-object v0
.end method
