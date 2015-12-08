.class Lcom/google/android/gms/internal/ab$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/bb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ab;->b(Lcom/google/android/gms/internal/ad;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lB:Lcom/google/android/gms/internal/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ab;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ab$3;->lB:Lcom/google/android/gms/internal/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/internal/dz;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/dz;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ab$3;->lB:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/dz;Ljava/util/Map;)V

    return-void
.end method
