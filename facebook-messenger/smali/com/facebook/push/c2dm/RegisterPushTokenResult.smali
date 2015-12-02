.class public Lcom/facebook/push/c2dm/RegisterPushTokenResult;
.super Lcom/facebook/fbservice/c/a;
.source "RegisterPushTokenResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/push/c2dm/RegisterPushTokenResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Z

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/push/c2dm/ac;

    invoke-direct {v0}, Lcom/facebook/push/c2dm/ac;-><init>()V

    sput-object v0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->a:Z

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->b:Z

    .line 32
    return-void

    :cond_0
    move v0, v2

    .line 30
    goto :goto_0

    :cond_1
    move v1, v2

    .line 31
    goto :goto_1
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/push/c2dm/ac;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/RegisterPushTokenResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(ZZJ)V
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-direct {p0, v0, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 24
    iput-boolean p1, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->a:Z

    .line 25
    iput-boolean p2, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->b:Z

    .line 26
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->a:Z

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->b:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 60
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 61
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->a:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->b:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    return-void

    :cond_0
    move v0, v2

    .line 61
    goto :goto_0

    :cond_1
    move v1, v2

    .line 62
    goto :goto_1
.end method
