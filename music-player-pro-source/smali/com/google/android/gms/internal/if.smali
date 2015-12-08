.class public Lcom/google/android/gms/internal/if;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/ig;


# instance fields
.field final Ep:Landroid/os/Bundle;

.field final Eq:[B

.field final responseCode:I

.field final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ig;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ig;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/if;->CREATOR:Lcom/google/android/gms/internal/ig;

    return-void
.end method

.method public constructor <init>(IILandroid/os/Bundle;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/if;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/internal/if;->responseCode:I

    iput-object p3, p0, Lcom/google/android/gms/internal/if;->Ep:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/if;->Eq:[B

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
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ig;->a(Lcom/google/android/gms/internal/if;Landroid/os/Parcel;I)V

    return-void
.end method
