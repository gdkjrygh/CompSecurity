.class public Lcom/facebook/push/c2dm/r;
.super Ljava/lang/Object;
.source "C2DMRegistrationHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field public static final a:Lcom/facebook/fbservice/service/OperationType;

.field public static final b:Lcom/facebook/fbservice/service/OperationType;


# instance fields
.field private final c:Lcom/facebook/push/c2dm/aa;

.field private final d:Lcom/facebook/push/c2dm/ae;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "register_push"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/push/c2dm/r;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 39
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "unregister_push"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/push/c2dm/r;->b:Lcom/facebook/fbservice/service/OperationType;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/push/c2dm/aa;Lcom/facebook/push/c2dm/ae;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/push/c2dm/aa;",
            "Lcom/facebook/push/c2dm/ae;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/facebook/push/c2dm/r;->c:Lcom/facebook/push/c2dm/aa;

    .line 50
    iput-object p2, p0, Lcom/facebook/push/c2dm/r;->d:Lcom/facebook/push/c2dm/ae;

    .line 51
    iput-object p3, p0, Lcom/facebook/push/c2dm/r;->e:Ljavax/inject/a;

    .line 52
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 68
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 69
    const-string v1, "registerPushTokenParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;

    .line 71
    iget-object v1, p0, Lcom/facebook/push/c2dm/r;->e:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 72
    iget-object v2, p0, Lcom/facebook/push/c2dm/r;->c:Lcom/facebook/push/c2dm/aa;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;

    .line 74
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 79
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 80
    const-string v1, "unregisterPushTokenParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;

    .line 82
    iget-object v1, p0, Lcom/facebook/push/c2dm/r;->e:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 83
    iget-object v2, p0, Lcom/facebook/push/c2dm/r;->d:Lcom/facebook/push/c2dm/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 56
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 57
    sget-object v1, Lcom/facebook/push/c2dm/r;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/r;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 60
    :goto_0
    return-object v0

    .line 59
    :cond_0
    sget-object v1, Lcom/facebook/push/c2dm/r;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/r;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 62
    :cond_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Unknown type"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
