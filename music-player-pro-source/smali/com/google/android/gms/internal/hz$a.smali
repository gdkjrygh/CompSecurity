.class final Lcom/google/android/gms/internal/hz$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/appindexing/AppIndexApi$ActionResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private DE:Lcom/google/android/gms/internal/hz;

.field private DF:Lcom/google/android/gms/common/api/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private DG:Lcom/google/android/gms/appindexing/Action;

.field private DH:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hz;Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/appindexing/Action;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/hz;",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/appindexing/Action;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hz$a;->DE:Lcom/google/android/gms/internal/hz;

    iput-object p2, p0, Lcom/google/android/gms/internal/hz$a;->DF:Lcom/google/android/gms/common/api/PendingResult;

    iput-object p3, p0, Lcom/google/android/gms/internal/hz$a;->DG:Lcom/google/android/gms/appindexing/Action;

    iput-object p4, p0, Lcom/google/android/gms/internal/hz$a;->DH:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public end(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hc;->CG:Lcom/google/android/gms/common/api/Api$c;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/hz$a;->DG:Lcom/google/android/gms/appindexing/Action;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz$a;->DH:Ljava/lang/String;

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/hy;->a(Lcom/google/android/gms/appindexing/Action;Ljava/lang/String;JLjava/lang/String;I)Lcom/google/android/gms/internal/hr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hz$a;->DE:Lcom/google/android/gms/internal/hz;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/hr;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/hz;->a(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/hr;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public getPendingResult()Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hz$a;->DF:Lcom/google/android/gms/common/api/PendingResult;

    return-object v0
.end method
