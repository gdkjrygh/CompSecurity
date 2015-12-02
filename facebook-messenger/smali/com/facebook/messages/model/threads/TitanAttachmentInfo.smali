.class public Lcom/facebook/messages/model/threads/TitanAttachmentInfo;
.super Ljava/lang/Object;
.source "TitanAttachmentInfo.java"

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
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 110
    new-instance v0, Lcom/facebook/messages/model/threads/i;

    invoke-direct {v0}, Lcom/facebook/messages/model/threads/i;-><init>()V

    sput-object v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a:Ljava/lang/String;

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->b:I

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c:Ljava/lang/String;

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d:Ljava/lang/String;

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e:I

    .line 83
    const-class v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    .line 84
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/messages/model/threads/i;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/messages/model/threads/k;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->b()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->b:I

    .line 71
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->e()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e:I

    .line 74
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/k;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    .line 75
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->b:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 103
    iget v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e:I

    return v0
.end method

.method public f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 129
    iget v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 132
    iget v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget-object v0, p0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 134
    return-void
.end method
