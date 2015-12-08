.class public final Lcom/google/android/gms/maps/model/internal/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/internal/b;


# instance fields
.field private final CK:I

.field private amJ:B

.field private amK:Landroid/os/Bundle;

.field private amL:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/internal/b;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/internal/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/internal/a;->CREATOR:Lcom/google/android/gms/maps/model/internal/b;

    return-void
.end method

.method constructor <init>(IBLandroid/os/Bundle;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/model/internal/a;->CK:I

    iput-byte p2, p0, Lcom/google/android/gms/maps/model/internal/a;->amJ:B

    iput-object p3, p0, Lcom/google/android/gms/maps/model/internal/a;->amK:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/maps/model/internal/a;->amL:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/a;->amL:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/a;->CK:I

    return v0
.end method

.method public oh()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/maps/model/internal/a;->amJ:B

    return v0
.end method

.method public oi()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/a;->amK:Landroid/os/Bundle;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/internal/b;->a(Lcom/google/android/gms/maps/model/internal/a;Landroid/os/Parcel;I)V

    return-void
.end method
