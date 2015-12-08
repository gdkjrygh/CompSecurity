.class public final Lcom/google/android/gms/maps/model/internal/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/internal/d;


# instance fields
.field private final CK:I

.field private amK:Landroid/os/Bundle;

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/internal/d;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/internal/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/internal/c;->CREATOR:Lcom/google/android/gms/maps/model/internal/d;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/model/internal/c;->CK:I

    iput p2, p0, Lcom/google/android/gms/maps/model/internal/c;->type:I

    iput-object p3, p0, Lcom/google/android/gms/maps/model/internal/c;->amK:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/c;->type:I

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/c;->CK:I

    return v0
.end method

.method public oi()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/c;->amK:Landroid/os/Bundle;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/internal/d;->a(Lcom/google/android/gms/maps/model/internal/c;Landroid/os/Parcel;I)V

    return-void
.end method
