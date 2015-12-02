.class public Lcom/facebook/orca/server/FetchStickerPacksParams;
.super Ljava/lang/Object;
.source "FetchStickerPacksParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchStickerPacksParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/server/v;

.field private final b:Z

.field private final c:Lcom/facebook/fbservice/service/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/orca/server/u;

    invoke-direct {v0}, Lcom/facebook/orca/server/u;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchStickerPacksParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/server/v;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/server/v;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->a:Lcom/facebook/orca/server/v;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->b:Z

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->c:Lcom/facebook/fbservice/service/s;

    .line 56
    return-void

    .line 54
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/u;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Lcom/facebook/orca/server/v;ZLcom/facebook/fbservice/service/s;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/server/v;ZLcom/facebook/fbservice/service/s;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->a:Lcom/facebook/orca/server/v;

    .line 48
    iput-boolean p2, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->b:Z

    .line 49
    iput-object p3, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->c:Lcom/facebook/fbservice/service/s;

    .line 50
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/server/v;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->a:Lcom/facebook/orca/server/v;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->b:Z

    return v0
.end method

.method public c()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->c:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->a:Lcom/facebook/orca/server/v;

    invoke-virtual {v0}, Lcom/facebook/orca/server/v;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 95
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksParams;->c:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
