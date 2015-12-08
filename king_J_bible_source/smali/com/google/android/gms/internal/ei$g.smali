.class final Lcom/google/android/gms/internal/ei$g;
.super Lcom/google/android/gms/internal/eh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field wH:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
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
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ei$g;->wI:Lcom/google/android/gms/internal/ei;

    invoke-direct {p0}, Lcom/google/android/gms/internal/eh;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$d;

    iput-object v0, p0, Lcom/google/android/gms/internal/ei$g;->wH:Lcom/google/android/gms/common/api/a$d;

    return-void
.end method


# virtual methods
.method public du()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ei$g;->wI:Lcom/google/android/gms/internal/ei;

    new-instance v2, Lcom/google/android/gms/internal/ei$h;

    iget-object v3, p0, Lcom/google/android/gms/internal/ei$g;->wI:Lcom/google/android/gms/internal/ei;

    iget-object v4, p0, Lcom/google/android/gms/internal/ei$g;->wH:Lcom/google/android/gms/common/api/a$d;

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/internal/ei$h;-><init>(Lcom/google/android/gms/internal/ei;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ei;->a(Lcom/google/android/gms/internal/ff$b;)V

    return-void
.end method
