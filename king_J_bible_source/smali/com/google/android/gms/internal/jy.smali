.class public final Lcom/google/android/gms/internal/jy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/internal/jy;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field adn:Ljava/lang/String;

.field adr:Lcom/google/android/gms/internal/ju;

.field ads:Lcom/google/android/gms/internal/jw;

.field adt:Lcom/google/android/gms/internal/jw;

.field pm:Ljava/lang/String;

.field private final xH:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/jz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jy;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/jy;->xH:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/jw;Lcom/google/android/gms/internal/jw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/jy;->xH:I

    iput-object p2, p0, Lcom/google/android/gms/internal/jy;->adn:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/jy;->pm:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/jy;->adr:Lcom/google/android/gms/internal/ju;

    iput-object p5, p0, Lcom/google/android/gms/internal/jy;->ads:Lcom/google/android/gms/internal/jw;

    iput-object p6, p0, Lcom/google/android/gms/internal/jy;->adt:Lcom/google/android/gms/internal/jw;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/jy;->xH:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jz;->a(Lcom/google/android/gms/internal/jy;Landroid/os/Parcel;I)V

    return-void
.end method
