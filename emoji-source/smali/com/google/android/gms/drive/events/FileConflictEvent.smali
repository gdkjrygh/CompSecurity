.class public final Lcom/google/android/gms/drive/events/FileConflictEvent;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/drive/events/DriveEvent;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/events/FileConflictEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final Hz:Lcom/google/android/gms/drive/DriveId;

.field final Ij:Landroid/os/ParcelFileDescriptor;

.field final Ik:Landroid/os/ParcelFileDescriptor;

.field final Il:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field final Im:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private In:Z

.field private Io:Z

.field private Ip:Z

.field final xM:I

.field final yQ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/events/c;

    invoke-direct {v0}, Lcom/google/android/gms/drive/events/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/events/FileConflictEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/os/ParcelFileDescriptor;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "driveId"    # Lcom/google/android/gms/drive/DriveId;
    .param p3, "accountName"    # Ljava/lang/String;
    .param p4, "baseParcelFileDescriptor"    # Landroid/os/ParcelFileDescriptor;
    .param p5, "modifiedParcelFileDescriptor"    # Landroid/os/ParcelFileDescriptor;
    .param p6, "modifiedMetadataBundle"    # Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/lang/String;",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/os/ParcelFileDescriptor;",
            "Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p7, "operationTags":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->In:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Io:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Ip:Z

    iput p1, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->xM:I

    iput-object p2, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Hz:Lcom/google/android/gms/drive/DriveId;

    iput-object p3, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->yQ:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Ij:Landroid/os/ParcelFileDescriptor;

    iput-object p5, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Ik:Landroid/os/ParcelFileDescriptor;

    iput-object p6, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Il:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iput-object p7, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Im:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDriveId()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Hz:Lcom/google/android/gms/drive/DriveId;

    return-object v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "FileConflictEvent [id=%s]"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/drive/events/FileConflictEvent;->Hz:Lcom/google/android/gms/drive/DriveId;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/events/c;->a(Lcom/google/android/gms/drive/events/FileConflictEvent;Landroid/os/Parcel;I)V

    return-void
.end method
