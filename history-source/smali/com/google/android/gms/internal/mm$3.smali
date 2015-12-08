.class Lcom/google/android/gms/internal/mm$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/mm$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/mm;->remove(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Vp:Lcom/google/android/gms/internal/mm;

.field final synthetic Vr:Lcom/google/android/gms/fitness/request/OnDataPointListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mm;Lcom/google/android/gms/fitness/request/OnDataPointListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mm$3;->Vp:Lcom/google/android/gms/internal/mm;

    iput-object p2, p0, Lcom/google/android/gms/internal/mm$3;->Vr:Lcom/google/android/gms/fitness/request/OnDataPointListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public jO()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/fitness/data/l$a;->jG()Lcom/google/android/gms/fitness/data/l$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mm$3;->Vr:Lcom/google/android/gms/fitness/request/OnDataPointListener;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/l$a;->c(Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/fitness/data/l;

    return-void
.end method
