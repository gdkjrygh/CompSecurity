.class public Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;
.super Lcom/facebook/fbservice/c/a;
.source "ConfirmPhoneAndRegisterPartialAccountResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/orca/server/d;

    invoke-direct {v0}, Lcom/facebook/orca/server/d;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->a:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->b:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->c:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->d:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->e:Z

    .line 45
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/d;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p7, p8}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->a:Ljava/lang/String;

    .line 32
    iput-object p3, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->b:Ljava/lang/String;

    .line 33
    iput-object p4, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->c:Ljava/lang/String;

    .line 34
    iput-object p5, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->d:Ljava/lang/String;

    .line 35
    iput-boolean p6, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->e:Z

    .line 36
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 94
    iget-boolean v0, p0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    return-void

    .line 94
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
