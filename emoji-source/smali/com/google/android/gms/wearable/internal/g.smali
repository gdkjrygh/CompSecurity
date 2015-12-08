.class public Lcom/google/android/gms/wearable/internal/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/DataEvent;


# instance fields
.field private AT:I

.field private alH:Lcom/google/android/gms/wearable/DataItem;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/wearable/DataEvent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/wearable/internal/g;->AT:I

    invoke-interface {p1}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataItem;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/DataItem;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/g;->alH:Lcom/google/android/gms/wearable/DataItem;

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/g;->np()Lcom/google/android/gms/wearable/DataEvent;

    move-result-object v0

    return-object v0
.end method

.method public getDataItem()Lcom/google/android/gms/wearable/DataItem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/g;->alH:Lcom/google/android/gms/wearable/DataItem;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/internal/g;->AT:I

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public np()Lcom/google/android/gms/wearable/DataEvent;
    .locals 0

    return-object p0
.end method
