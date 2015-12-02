.class public Lcom/facebook/nux/service/a;
.super Ljava/lang/Object;
.source "NuxServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field public static final a:Lcom/facebook/fbservice/service/OperationType;

.field public static final b:Lcom/facebook/fbservice/service/OperationType;


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/nux/status/l;

.field private final e:Lcom/facebook/nux/status/a;

.field private final f:Lcom/facebook/nux/status/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 29
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "update_nux_status"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/nux/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 30
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_nux_status"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/nux/service/a;->b:Lcom/facebook/fbservice/service/OperationType;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/nux/status/l;Lcom/facebook/nux/status/a;Lcom/facebook/nux/status/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/nux/status/l;",
            "Lcom/facebook/nux/status/a;",
            "Lcom/facebook/nux/status/j;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/nux/service/a;->c:Ljavax/inject/a;

    .line 46
    iput-object p2, p0, Lcom/facebook/nux/service/a;->d:Lcom/facebook/nux/status/l;

    .line 47
    iput-object p3, p0, Lcom/facebook/nux/service/a;->e:Lcom/facebook/nux/status/a;

    .line 48
    iput-object p4, p0, Lcom/facebook/nux/service/a;->f:Lcom/facebook/nux/status/j;

    .line 49
    return-void
.end method

.method private a(Lcom/facebook/nux/status/FetchNuxStatusesParams;)Lcom/facebook/nux/status/FetchNuxStatusesResult;
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/nux/service/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 88
    iget-object v1, p0, Lcom/facebook/nux/service/a;->e:Lcom/facebook/nux/status/a;

    invoke-interface {v0, v1, p1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/FetchNuxStatusesResult;

    .line 89
    iget-object v1, p0, Lcom/facebook/nux/service/a;->f:Lcom/facebook/nux/status/j;

    invoke-virtual {v1, v0}, Lcom/facebook/nux/status/j;->a(Lcom/facebook/nux/status/FetchNuxStatusesResult;)V

    .line 90
    return-object v0
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 64
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 65
    const-string v1, "updateNuxStatusParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/UpdateNuxStatusParams;

    .line 67
    iget-object v1, p0, Lcom/facebook/nux/service/a;->c:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 68
    iget-object v2, p0, Lcom/facebook/nux/service/a;->d:Lcom/facebook/nux/status/l;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 69
    if-nez v1, :cond_0

    .line 70
    sget-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 75
    :goto_0
    return-object v0

    .line 74
    :cond_0
    new-instance v1, Lcom/facebook/nux/status/FetchNuxStatusesParams;

    invoke-virtual {v0}, Lcom/facebook/nux/status/UpdateNuxStatusParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/nux/status/FetchNuxStatusesParams;-><init>(Lcom/google/common/a/es;)V

    invoke-direct {p0, v1}, Lcom/facebook/nux/service/a;->a(Lcom/facebook/nux/status/FetchNuxStatusesParams;)Lcom/facebook/nux/status/FetchNuxStatusesResult;

    .line 75
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 79
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 80
    const-string v1, "fetchNuxStatusParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/FetchNuxStatusesParams;

    .line 81
    invoke-direct {p0, v0}, Lcom/facebook/nux/service/a;->a(Lcom/facebook/nux/status/FetchNuxStatusesParams;)Lcom/facebook/nux/status/FetchNuxStatusesResult;

    move-result-object v0

    .line 82
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 53
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 54
    sget-object v1, Lcom/facebook/nux/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/nux/service/a;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 57
    :goto_0
    return-object v0

    .line 56
    :cond_0
    sget-object v1, Lcom/facebook/nux/service/a;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/nux/service/a;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 59
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
