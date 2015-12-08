.class final Lcom/google/android/gms/internal/hc$a;
.super Lcom/google/android/gms/internal/ff$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/internal/ha;",
        ">.b<",
        "Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final Ah:I

.field private final Ot:[Ljava/lang/String;

.field final synthetic Ou:Lcom/google/android/gms/internal/hc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hc;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;I[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/hc$a;->Ou:Lcom/google/android/gms/internal/hc;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ff$b;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;)V

    invoke-static {p3}, Lcom/google/android/gms/location/LocationStatusCodes;->bz(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/hc$a;->Ah:I

    iput-object p4, p0, Lcom/google/android/gms/internal/hc$a;->Ot:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V
    .locals 2

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/hc$a;->Ah:I

    iget-object v1, p0, Lcom/google/android/gms/internal/hc$a;->Ot:[Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;->onAddGeofencesResult(I[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hc$a;->a(Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V

    return-void
.end method

.method protected dx()V
    .locals 0

    return-void
.end method
