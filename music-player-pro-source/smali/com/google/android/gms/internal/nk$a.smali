.class final Lcom/google/android/gms/internal/nk$a;
.super Lcom/google/android/gms/internal/jl$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/nk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/internal/ni;",
        ">.b<",
        "Lcom/google/android/gms/location/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final Iv:I

.field private final aha:[Ljava/lang/String;

.field final synthetic ahb:Lcom/google/android/gms/internal/nk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/nk;Lcom/google/android/gms/location/c$a;I[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/nk$a;->ahb:Lcom/google/android/gms/internal/nk;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/jl$b;-><init>(Lcom/google/android/gms/internal/jl;Ljava/lang/Object;)V

    invoke-static {p3}, Lcom/google/android/gms/location/LocationStatusCodes;->eC(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/nk$a;->Iv:I

    iput-object p4, p0, Lcom/google/android/gms/internal/nk$a;->aha:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/location/c$a;)V
    .locals 2

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/nk$a;->Iv:I

    iget-object v1, p0, Lcom/google/android/gms/internal/nk$a;->aha:[Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/c$a;->a(I[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/c$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/nk$a;->a(Lcom/google/android/gms/location/c$a;)V

    return-void
.end method

.method protected hx()V
    .locals 0

    return-void
.end method
