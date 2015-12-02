.class public Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/d;

    invoke-direct {v0}, Lcom/facebook/orca/phonenumber/identification/d;-><init>()V

    sput-object v0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a(Ljava/lang/String;)V

    .line 20
    invoke-direct {p0, p2}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b(Ljava/lang/String;)V

    .line 21
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a:Ljava/lang/String;

    .line 34
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b:Ljava/lang/String;

    .line 66
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    return-void
.end method
