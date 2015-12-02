.class public Lcom/facebook/contacts/server/PrivacyParam;
.super Ljava/lang/Object;
.source "PrivacyParam.java"

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
            "Lcom/facebook/contacts/server/PrivacyParam;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/contacts/server/PrivacyParam;

.field public static final b:Lcom/facebook/contacts/server/PrivacyParam;


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    new-instance v0, Lcom/facebook/contacts/server/PrivacyParam;

    const-string v1, "MUTUAL_FRIENDS"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/server/PrivacyParam;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/PrivacyParam;->a:Lcom/facebook/contacts/server/PrivacyParam;

    .line 19
    new-instance v0, Lcom/facebook/contacts/server/PrivacyParam;

    const-string v1, "SELF"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/server/PrivacyParam;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/PrivacyParam;->b:Lcom/facebook/contacts/server/PrivacyParam;

    .line 43
    new-instance v0, Lcom/facebook/contacts/server/z;

    invoke-direct {v0}, Lcom/facebook/contacts/server/z;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/PrivacyParam;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/PrivacyParam;->c:Ljava/lang/String;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/z;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/PrivacyParam;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/contacts/server/PrivacyParam;->c:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    const-string v1, "{\'value\':\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    iget-object v1, p0, Lcom/facebook/contacts/server/PrivacyParam;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    const-string v1, "\'}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

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
    iget-object v0, p0, Lcom/facebook/contacts/server/PrivacyParam;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    return-void
.end method
