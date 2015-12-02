.class public Lcom/facebook/contacts/server/FetchLastActiveParams;
.super Ljava/lang/Object;
.source "FetchLastActiveParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/server/FetchLastActiveParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/contacts/server/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/contacts/server/q;

    invoke-direct {v0}, Lcom/facebook/contacts/server/q;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchLastActiveParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/EnumSet;

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->a:Ljava/util/EnumSet;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->b:I

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/q;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchLastActiveParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumSet;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/contacts/server/x;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->a:Ljava/util/EnumSet;

    .line 36
    iput p2, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->b:I

    .line 37
    return-void
.end method

.method public static a()Lcom/facebook/contacts/server/FetchLastActiveParams;
    .locals 3

    .prologue
    .line 29
    new-instance v0, Lcom/facebook/contacts/server/FetchLastActiveParams;

    sget-object v1, Lcom/facebook/contacts/server/x;->ALL:Lcom/facebook/contacts/server/x;

    invoke-static {v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/FetchLastActiveParams;-><init>(Ljava/util/EnumSet;I)V

    return-object v0
.end method

.method public static a(I)Lcom/facebook/contacts/server/FetchLastActiveParams;
    .locals 3

    .prologue
    .line 24
    new-instance v0, Lcom/facebook/contacts/server/FetchLastActiveParams;

    sget-object v1, Lcom/facebook/contacts/server/x;->TOP_FRIENDS:Lcom/facebook/contacts/server/x;

    sget-object v2, Lcom/facebook/contacts/server/x;->FAVORITE_FRIENDS:Lcom/facebook/contacts/server/x;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/facebook/contacts/server/FetchLastActiveParams;-><init>(Ljava/util/EnumSet;I)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/contacts/server/x;",
            ">;"
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->a:Ljava/util/EnumSet;

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->b:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->a:Ljava/util/EnumSet;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 71
    iget v0, p0, Lcom/facebook/contacts/server/FetchLastActiveParams;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    return-void
.end method
