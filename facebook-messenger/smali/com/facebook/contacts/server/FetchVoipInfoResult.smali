.class public Lcom/facebook/contacts/server/FetchVoipInfoResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchVoipInfoResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/server/FetchVoipInfoResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/contacts/server/FetchVoipInfoResult;


# instance fields
.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 19
    new-instance v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/contacts/server/FetchVoipInfoResult;-><init>(ZLjava/lang/String;J)V

    sput-object v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->a:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    .line 45
    new-instance v0, Lcom/facebook/contacts/server/v;

    invoke-direct {v0}, Lcom/facebook/contacts/server/v;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->b:Z

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->c:Ljava/lang/String;

    .line 35
    return-void

    .line 33
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/v;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchVoipInfoResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;J)V
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-direct {p0, v0, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 27
    iput-boolean p1, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->b:Z

    .line 28
    iput-object p2, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->c:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->b:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 63
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 64
    iget-boolean v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    return-void

    .line 64
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
