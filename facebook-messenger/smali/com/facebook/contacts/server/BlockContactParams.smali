.class public Lcom/facebook/contacts/server/BlockContactParams;
.super Ljava/lang/Object;
.source "BlockContactParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/server/BlockContactParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/facebook/contacts/server/a;

    invoke-direct {v0}, Lcom/facebook/contacts/server/a;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/BlockContactParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/BlockContactParams;->a:Lcom/facebook/user/UserKey;

    .line 28
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/a;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/BlockContactParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/user/UserKey;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/contacts/server/BlockContactParams;->a:Lcom/facebook/user/UserKey;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/contacts/server/BlockContactParams;->a:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/contacts/server/BlockContactParams;->a:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    return-void
.end method
