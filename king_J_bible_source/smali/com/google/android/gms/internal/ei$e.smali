.class final Lcom/google/android/gms/internal/ei$e;
.super Lcom/google/android/gms/internal/eh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field private final wH:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
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
            "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ei$e;->wI:Lcom/google/android/gms/internal/ei;

    invoke-direct {p0}, Lcom/google/android/gms/internal/eh;-><init>()V

    const-string v0, "Result holder must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$d;

    iput-object v0, p0, Lcom/google/android/gms/internal/ei$e;->wH:Lcom/google/android/gms/common/api/a$d;

    return-void
.end method


# virtual methods
.method public a(ILcom/google/android/gms/common/data/DataHolder;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ei$e;->wI:Lcom/google/android/gms/internal/ei;

    new-instance v1, Lcom/google/android/gms/internal/ei$f;

    iget-object v2, p0, Lcom/google/android/gms/internal/ei$e;->wI:Lcom/google/android/gms/internal/ei;

    iget-object v3, p0, Lcom/google/android/gms/internal/ei$e;->wH:Lcom/google/android/gms/common/api/a$d;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/ei$f;-><init>(Lcom/google/android/gms/internal/ei;Lcom/google/android/gms/common/api/a$d;ILcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ei;->a(Lcom/google/android/gms/internal/ff$b;)V

    return-void
.end method
