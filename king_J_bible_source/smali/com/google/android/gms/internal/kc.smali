.class public final Lcom/google/android/gms/internal/kc;
.super Lcom/google/android/gms/common/data/b;

# interfaces
.implements Lcom/google/android/gms/wearable/a;


# instance fields
.field private final LE:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput p3, p0, Lcom/google/android/gms/internal/kc;->LE:I

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kc;->me()Lcom/google/android/gms/wearable/a;

    move-result-object v0

    return-object v0
.end method

.method public getType()I
    .locals 1

    const-string v0, "event_type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/kc;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public lZ()Lcom/google/android/gms/wearable/c;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/android/gms/internal/kc;->BB:Lcom/google/android/gms/common/data/DataHolder;

    iget v2, p0, Lcom/google/android/gms/internal/kc;->BD:I

    iget v3, p0, Lcom/google/android/gms/internal/kc;->LE:I

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/kg;-><init>(Lcom/google/android/gms/common/data/DataHolder;II)V

    return-object v0
.end method

.method public me()Lcom/google/android/gms/wearable/a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/kb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kb;-><init>(Lcom/google/android/gms/wearable/a;)V

    return-object v0
.end method
