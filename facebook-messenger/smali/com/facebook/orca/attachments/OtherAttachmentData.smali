.class public Lcom/facebook/orca/attachments/OtherAttachmentData;
.super Ljava/lang/Object;
.source "OtherAttachmentData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/attachments/OtherAttachmentData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    new-instance v0, Lcom/facebook/orca/attachments/h;

    invoke-direct {v0}, Lcom/facebook/orca/attachments/h;-><init>()V

    sput-object v0, Lcom/facebook/orca/attachments/OtherAttachmentData;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->a:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->b:I

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->c:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->d:Landroid/net/Uri;

    .line 31
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/attachments/h;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/OtherAttachmentData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ILjava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->a:Ljava/lang/String;

    .line 21
    iput p2, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->b:I

    .line 22
    iput-object p3, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->c:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->d:Landroid/net/Uri;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->b:I

    return v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/attachments/OtherAttachmentData;->d:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 91
    return-void
.end method
