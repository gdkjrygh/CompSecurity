.class public Lcom/facebook/push/c2dm/RegisterPushTokenParams;
.super Ljava/lang/Object;
.source "RegisterPushTokenParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/push/c2dm/RegisterPushTokenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/push/c2dm/z;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:I

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 68
    new-instance v0, Lcom/facebook/push/c2dm/ab;

    invoke-direct {v0}, Lcom/facebook/push/c2dm/ab;-><init>()V

    sput-object v0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/z;

    iput-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->a:Lcom/facebook/push/c2dm/z;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->b:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->c:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->d:Z

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->e:I

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->f:I

    .line 42
    return-void

    .line 39
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/push/c2dm/ab;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/push/c2dm/z;Ljava/lang/String;Ljava/lang/String;ZII)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->a:Lcom/facebook/push/c2dm/z;

    .line 28
    iput-object p2, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->b:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->c:Ljava/lang/String;

    .line 30
    iput-boolean p4, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->d:Z

    .line 31
    iput p5, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->e:I

    .line 32
    iput p6, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->f:I

    .line 33
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/z;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->a:Lcom/facebook/push/c2dm/z;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->d:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 65
    iget v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->f:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->a:Lcom/facebook/push/c2dm/z;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 87
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    iget v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    iget v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    return-void

    .line 89
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
