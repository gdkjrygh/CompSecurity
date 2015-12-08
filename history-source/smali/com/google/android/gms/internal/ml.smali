.class public Lcom/google/android/gms/internal/ml;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/RecordingApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ml$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/m;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/request/m;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ml$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ml$1;-><init>(Lcom/google/android/gms/internal/ml;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/m;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/request/af;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ml$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ml$2;-><init>(Lcom/google/android/gms/internal/ml;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/aj;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/request/aj;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ml$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ml$3;-><init>(Lcom/google/android/gms/internal/ml;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/aj;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;

    move-result-object v0

    return-object v0
.end method

.method public listSubscriptions(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/m$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/m$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/m$a;->ka()Lcom/google/android/gms/fitness/request/m;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/m;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public listSubscriptions(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/m$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/m$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/request/m$a;->c(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/m$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/m$a;->ka()Lcom/google/android/gms/fitness/request/m;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/m;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public subscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/af$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/af$a;-><init>()V

    new-instance v1, Lcom/google/android/gms/fitness/data/Subscription$a;

    invoke-direct {v1}, Lcom/google/android/gms/fitness/data/Subscription$a;-><init>()V

    invoke-virtual {v1, p2}, Lcom/google/android/gms/fitness/data/Subscription$a;->b(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/Subscription$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Subscription$a;->jK()Lcom/google/android/gms/fitness/data/Subscription;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/af$a;->b(Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/fitness/request/af$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/af$a;->kp()Lcom/google/android/gms/fitness/request/af;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public subscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/af$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/af$a;-><init>()V

    new-instance v1, Lcom/google/android/gms/fitness/data/Subscription$a;

    invoke-direct {v1}, Lcom/google/android/gms/fitness/data/Subscription$a;-><init>()V

    invoke-virtual {v1, p2}, Lcom/google/android/gms/fitness/data/Subscription$a;->b(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/Subscription$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Subscription$a;->jK()Lcom/google/android/gms/fitness/data/Subscription;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/af$a;->b(Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/fitness/request/af$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/af$a;->kp()Lcom/google/android/gms/fitness/request/af;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/aj$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/aj$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/request/aj$a;->d(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/aj$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/aj$a;->kq()Lcom/google/android/gms/fitness/request/aj;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/aj;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/fitness/request/aj$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/aj$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/request/aj$a;->d(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/aj$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/aj$a;->kq()Lcom/google/android/gms/fitness/request/aj;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/aj;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "subscription"    # Lcom/google/android/gms/fitness/data/Subscription;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/fitness/data/Subscription;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ml;->unsubscribe(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    goto :goto_0
.end method
