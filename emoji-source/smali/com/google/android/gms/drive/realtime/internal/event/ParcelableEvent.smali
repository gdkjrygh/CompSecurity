.class public Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final LA:Lcom/google/android/gms/drive/realtime/internal/event/ReferenceShiftedDetails;

.field final Lm:Ljava/lang/String;

.field final Lq:Ljava/lang/String;

.field final Ls:Z

.field final Lt:Ljava/lang/String;

.field final Lu:Lcom/google/android/gms/drive/realtime/internal/event/TextInsertedDetails;

.field final Lv:Lcom/google/android/gms/drive/realtime/internal/event/TextDeletedDetails;

.field final Lw:Lcom/google/android/gms/drive/realtime/internal/event/ValuesAddedDetails;

.field final Lx:Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;

.field final Ly:Lcom/google/android/gms/drive/realtime/internal/event/ValuesSetDetails;

.field final Lz:Lcom/google/android/gms/drive/realtime/internal/event/ValueChangedDetails;

.field final rR:Ljava/lang/String;

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/realtime/internal/event/a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/realtime/internal/event/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/drive/realtime/internal/event/TextInsertedDetails;Lcom/google/android/gms/drive/realtime/internal/event/TextDeletedDetails;Lcom/google/android/gms/drive/realtime/internal/event/ValuesAddedDetails;Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;Lcom/google/android/gms/drive/realtime/internal/event/ValuesSetDetails;Lcom/google/android/gms/drive/realtime/internal/event/ValueChangedDetails;Lcom/google/android/gms/drive/realtime/internal/event/ReferenceShiftedDetails;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "sessionId"    # Ljava/lang/String;
    .param p3, "userId"    # Ljava/lang/String;
    .param p4, "isLocal"    # Z
    .param p5, "objectId"    # Ljava/lang/String;
    .param p6, "objectType"    # Ljava/lang/String;
    .param p7, "textInsertedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/TextInsertedDetails;
    .param p8, "textDeletedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/TextDeletedDetails;
    .param p9, "valuesAddedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/ValuesAddedDetails;
    .param p10, "valuesRemovedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    .param p11, "valuesSetDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/ValuesSetDetails;
    .param p12, "valueChangedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/ValueChangedDetails;
    .param p13, "referenceShiftedDetails"    # Lcom/google/android/gms/drive/realtime/internal/event/ReferenceShiftedDetails;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->xM:I

    iput-object p2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->rR:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lm:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Ls:Z

    iput-object p5, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lq:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lt:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lu:Lcom/google/android/gms/drive/realtime/internal/event/TextInsertedDetails;

    iput-object p8, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lv:Lcom/google/android/gms/drive/realtime/internal/event/TextDeletedDetails;

    iput-object p9, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lw:Lcom/google/android/gms/drive/realtime/internal/event/ValuesAddedDetails;

    iput-object p10, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lx:Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;

    iput-object p11, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Ly:Lcom/google/android/gms/drive/realtime/internal/event/ValuesSetDetails;

    iput-object p12, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->Lz:Lcom/google/android/gms/drive/realtime/internal/event/ValueChangedDetails;

    iput-object p13, p0, Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;->LA:Lcom/google/android/gms/drive/realtime/internal/event/ReferenceShiftedDetails;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/a;->a(Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;Landroid/os/Parcel;I)V

    return-void
.end method
