.class public Lcom/facebook/orca/attachments/ImageAttachmentData;
.super Ljava/lang/Object;
.source "ImageAttachmentData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/net/Uri;

.field private final c:Landroid/net/Uri;

.field private final d:I

.field private final e:I

.field private final f:Landroid/net/Uri;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/attachments/ImageAttachmentData;->a:Ljava/lang/String;

    .line 115
    new-instance v0, Lcom/facebook/orca/attachments/e;

    invoke-direct {v0}, Lcom/facebook/orca/attachments/e;-><init>()V

    sput-object v0, Lcom/facebook/orca/attachments/ImageAttachmentData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->b:Landroid/net/Uri;

    .line 44
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->c:Landroid/net/Uri;

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    .line 47
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->f:Landroid/net/Uri;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->g:Ljava/lang/String;

    .line 49
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/attachments/e;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/ImageAttachmentData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/attachments/g;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->a()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->b:Landroid/net/Uri;

    .line 35
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->b()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->c:Landroid/net/Uri;

    .line 36
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->c()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    .line 37
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    .line 38
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->e()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->f:Landroid/net/Uri;

    .line 39
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/g;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->g:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 78
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 87
    sget-object v0, Lcom/facebook/orca/attachments/ImageAttachmentData;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No mime type for image "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->c:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, ""

    .line 91
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Lcom/facebook/orca/attachments/f;
    .locals 2

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    sget-object v0, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    .line 102
    :goto_0
    return-object v0

    .line 97
    :cond_0
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    iget v1, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    if-ne v0, v1, :cond_1

    .line 98
    sget-object v0, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    goto :goto_0

    .line 99
    :cond_1
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    iget v1, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    if-ge v0, v1, :cond_2

    .line 100
    sget-object v0, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    goto :goto_0

    .line 102
    :cond_2
    sget-object v0, Lcom/facebook/orca/attachments/f;->LANDSCAPE:Lcom/facebook/orca/attachments/f;

    goto :goto_0
.end method

.method public h()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->f:Landroid/net/Uri;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->b:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->c:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 135
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    iget v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->f:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/attachments/ImageAttachmentData;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    return-void
.end method
