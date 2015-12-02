.class public Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;
.super Ljava/lang/Object;
.source "UploadBulkContactFieldMatch.java"

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
            "Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/contacts/server/ai;

.field private final b:Lcom/facebook/contacts/server/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/facebook/contacts/server/ah;

    invoke-direct {v0}, Lcom/facebook/contacts/server/ah;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const-class v0, Lcom/facebook/contacts/server/ai;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ai;

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->a:Lcom/facebook/contacts/server/ai;

    .line 43
    const-class v0, Lcom/facebook/contacts/server/aj;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/aj;

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->b:Lcom/facebook/contacts/server/aj;

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/ah;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/server/ai;Lcom/facebook/contacts/server/aj;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->a:Lcom/facebook/contacts/server/ai;

    .line 38
    iput-object p2, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->b:Lcom/facebook/contacts/server/aj;

    .line 39
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " match type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->a:Lcom/facebook/contacts/server/ai;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " value type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->b:Lcom/facebook/contacts/server/aj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->a:Lcom/facebook/contacts/server/ai;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/ai;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;->b:Lcom/facebook/contacts/server/aj;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/aj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    return-void
.end method
