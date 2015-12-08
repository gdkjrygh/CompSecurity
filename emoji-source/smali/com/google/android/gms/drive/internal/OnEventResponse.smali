.class public Lcom/google/android/gms/drive/internal/OnEventResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OnEventResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final Iq:I

.field final Jy:Lcom/google/android/gms/drive/events/ChangeEvent;

.field final Jz:Lcom/google/android/gms/drive/events/FileConflictEvent;

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/aj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/aj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OnEventResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/drive/events/ChangeEvent;Lcom/google/android/gms/drive/events/FileConflictEvent;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "eventType"    # I
    .param p3, "changeEvent"    # Lcom/google/android/gms/drive/events/ChangeEvent;
    .param p4, "conflictEvent"    # Lcom/google/android/gms/drive/events/FileConflictEvent;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->xM:I

    iput p2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Iq:I

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Jy:Lcom/google/android/gms/drive/events/ChangeEvent;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Jz:Lcom/google/android/gms/drive/events/FileConflictEvent;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getEventType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Iq:I

    return v0
.end method

.method public gw()Lcom/google/android/gms/drive/events/ChangeEvent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Jy:Lcom/google/android/gms/drive/events/ChangeEvent;

    return-object v0
.end method

.method public gx()Lcom/google/android/gms/drive/events/FileConflictEvent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Jz:Lcom/google/android/gms/drive/events/FileConflictEvent;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/aj;->a(Lcom/google/android/gms/drive/internal/OnEventResponse;Landroid/os/Parcel;I)V

    return-void
.end method
