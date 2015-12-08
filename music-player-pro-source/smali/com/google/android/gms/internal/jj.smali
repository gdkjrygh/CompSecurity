.class public Lcom/google/android/gms/internal/jj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/internal/jj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final MD:I

.field ME:I

.field MF:Ljava/lang/String;

.field MG:Landroid/os/IBinder;

.field MH:[Lcom/google/android/gms/common/api/Scope;

.field MI:Landroid/os/Bundle;

.field final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/jk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/jj;->version:I

    const v0, 0x648278

    iput v0, p0, Lcom/google/android/gms/internal/jj;->ME:I

    iput p1, p0, Lcom/google/android/gms/internal/jj;->MD:I

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/jj;->version:I

    iput p2, p0, Lcom/google/android/gms/internal/jj;->MD:I

    iput p3, p0, Lcom/google/android/gms/internal/jj;->ME:I

    iput-object p4, p0, Lcom/google/android/gms/internal/jj;->MF:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/jj;->MG:Landroid/os/IBinder;

    iput-object p6, p0, Lcom/google/android/gms/internal/jj;->MH:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lcom/google/android/gms/internal/jj;->MI:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/jq;)Lcom/google/android/gms/internal/jj;
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/jq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jj;->MG:Landroid/os/IBinder;

    :cond_0
    return-object p0
.end method

.method public a([Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/internal/jj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jj;->MH:[Lcom/google/android/gms/common/api/Scope;

    return-object p0
.end method

.method public aX(Ljava/lang/String;)Lcom/google/android/gms/internal/jj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jj;->MF:Ljava/lang/String;

    return-object p0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/os/Bundle;)Lcom/google/android/gms/internal/jj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jj;->MI:Landroid/os/Bundle;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jk;->a(Lcom/google/android/gms/internal/jj;Landroid/os/Parcel;I)V

    return-void
.end method
