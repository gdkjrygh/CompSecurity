.class public Lcom/google/android/gms/internal/kb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/a;


# instance fields
.field private LF:I

.field private adC:Lcom/google/android/gms/wearable/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/wearable/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/wearable/a;->getType()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/kb;->LF:I

    invoke-interface {p1}, Lcom/google/android/gms/wearable/a;->lZ()Lcom/google/android/gms/wearable/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/c;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/c;

    iput-object v0, p0, Lcom/google/android/gms/internal/kb;->adC:Lcom/google/android/gms/wearable/c;

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kb;->me()Lcom/google/android/gms/wearable/a;

    move-result-object v0

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kb;->LF:I

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public lZ()Lcom/google/android/gms/wearable/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->adC:Lcom/google/android/gms/wearable/c;

    return-object v0
.end method

.method public me()Lcom/google/android/gms/wearable/a;
    .locals 0

    return-object p0
.end method
