.class final Lcom/google/android/gms/internal/ei$c;
.super Lcom/google/android/gms/internal/eh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field private final wH:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/appstate/AppStateManager$StateListResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic wI:Lcom/google/android/gms/internal/ei;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ei;Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/appstate/AppStateManager$StateListResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ei$c;->wI:Lcom/google/android/gms/internal/ei;

    invoke-direct {p0}, Lcom/google/android/gms/internal/eh;-><init>()V

    const-string v0, "Result holder must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$d;

    iput-object v0, p0, Lcom/google/android/gms/internal/ei$c;->wH:Lcom/google/android/gms/common/api/a$d;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ei$c;->wI:Lcom/google/android/gms/internal/ei;

    new-instance v2, Lcom/google/android/gms/internal/ei$d;

    iget-object v3, p0, Lcom/google/android/gms/internal/ei$c;->wI:Lcom/google/android/gms/internal/ei;

    iget-object v4, p0, Lcom/google/android/gms/internal/ei$c;->wH:Lcom/google/android/gms/common/api/a$d;

    invoke-direct {v2, v3, v4, v0, p1}, Lcom/google/android/gms/internal/ei$d;-><init>(Lcom/google/android/gms/internal/ei;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ei;->a(Lcom/google/android/gms/internal/ff$b;)V

    return-void
.end method
