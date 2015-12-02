.class final Lcom/facebook/orca/phonenumber/identification/e;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;

    invoke-direct {v0, p1}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;
    .locals 1

    .prologue
    .line 35
    new-array v0, p1, [Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/orca/phonenumber/identification/e;->a(Landroid/os/Parcel;)Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/orca/phonenumber/identification/e;->a(I)[Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;

    move-result-object v0

    return-object v0
.end method
