.class public Lcom/facebook/orca/server/DeliveredReceiptParams;
.super Ljava/lang/Object;
.source "DeliveredReceiptParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/DeliveredReceiptParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/UserKey;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/orca/server/h;

    invoke-direct {v0}, Lcom/facebook/orca/server/h;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/DeliveredReceiptParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->a:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->b:Lcom/facebook/user/UserKey;

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->c:Ljava/lang/String;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/h;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/DeliveredReceiptParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/user/UserKey;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->a:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->b:Lcom/facebook/user/UserKey;

    .line 22
    iput-object p3, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->c:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->b:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->b:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/facebook/orca/server/DeliveredReceiptParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    return-void
.end method
