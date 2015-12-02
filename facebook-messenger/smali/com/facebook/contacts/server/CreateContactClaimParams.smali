.class public Lcom/facebook/contacts/server/CreateContactClaimParams;
.super Ljava/lang/Object;
.source "CreateContactClaimParams.java"

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
            "Lcom/facebook/contacts/server/CreateContactClaimParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/contacts/server/PrivacyParam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/contacts/server/e;

    invoke-direct {v0}, Lcom/facebook/contacts/server/e;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/CreateContactClaimParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->a:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->b:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->c:Ljava/lang/String;

    .line 36
    const-class v0, Lcom/facebook/contacts/server/PrivacyParam;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/PrivacyParam;

    iput-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->d:Lcom/facebook/contacts/server/PrivacyParam;

    .line 37
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/e;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/CreateContactClaimParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/contacts/server/PrivacyParam;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->a:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->b:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->c:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->d:Lcom/facebook/contacts/server/PrivacyParam;

    .line 30
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/facebook/contacts/server/PrivacyParam;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->d:Lcom/facebook/contacts/server/PrivacyParam;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/contacts/server/CreateContactClaimParams;->d:Lcom/facebook/contacts/server/PrivacyParam;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 77
    return-void
.end method
