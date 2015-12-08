.class public Lcom/google/android/gms/internal/hj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hk;


# instance fields
.field final CK:I

.field final Db:Landroid/os/Bundle;

.field public final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hj;->CREATOR:Lcom/google/android/gms/internal/hk;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hj;->CK:I

    iput p2, p0, Lcom/google/android/gms/internal/hj;->id:I

    iput-object p3, p0, Lcom/google/android/gms/internal/hj;->Db:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hj;->CREATOR:Lcom/google/android/gms/internal/hk;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hj;->CREATOR:Lcom/google/android/gms/internal/hk;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hk;->a(Lcom/google/android/gms/internal/hj;Landroid/os/Parcel;I)V

    return-void
.end method
