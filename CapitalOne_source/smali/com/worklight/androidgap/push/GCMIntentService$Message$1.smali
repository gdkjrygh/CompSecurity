.class Lcom/worklight/androidgap/push/GCMIntentService$Message$1;
.super Ljava/lang/Object;
.source "GCMIntentService.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/androidgap/push/GCMIntentService$Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/worklight/androidgap/push/GCMIntentService$Message;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/worklight/androidgap/push/GCMIntentService$Message;
    .locals 2
    .param p1, "source"    # Landroid/os/Parcel;

    .prologue
    .line 246
    new-instance v0, Lcom/worklight/androidgap/push/GCMIntentService$Message;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/worklight/androidgap/push/GCMIntentService$Message;-><init>(Landroid/os/Parcel;Lcom/worklight/androidgap/push/GCMIntentService$Message;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/push/GCMIntentService$Message$1;->createFromParcel(Landroid/os/Parcel;)Lcom/worklight/androidgap/push/GCMIntentService$Message;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/worklight/androidgap/push/GCMIntentService$Message;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 241
    new-array v0, p1, [Lcom/worklight/androidgap/push/GCMIntentService$Message;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/push/GCMIntentService$Message$1;->newArray(I)[Lcom/worklight/androidgap/push/GCMIntentService$Message;

    move-result-object v0

    return-object v0
.end method
