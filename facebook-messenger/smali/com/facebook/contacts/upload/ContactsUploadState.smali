.class public final Lcom/facebook/contacts/upload/ContactsUploadState;
.super Ljava/lang/Object;
.source "ContactsUploadState.java"

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
            "Lcom/facebook/contacts/upload/ContactsUploadState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/contacts/upload/k;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lcom/facebook/fbservice/service/OperationResult;

.field private final f:Lcom/facebook/fbservice/service/ServiceException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 186
    new-instance v0, Lcom/facebook/contacts/upload/j;

    invoke-direct {v0}, Lcom/facebook/contacts/upload/j;-><init>()V

    sput-object v0, Lcom/facebook/contacts/upload/ContactsUploadState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const-class v0, Lcom/facebook/contacts/upload/k;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/k;

    iput-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->a:Lcom/facebook/contacts/upload/k;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->b:I

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->c:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->d:I

    .line 55
    const-class v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    iput-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->e:Lcom/facebook/fbservice/service/OperationResult;

    .line 56
    const-class v0, Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/ServiceException;

    iput-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->f:Lcom/facebook/fbservice/service/ServiceException;

    .line 57
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/upload/j;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1
    .param p5    # Lcom/facebook/fbservice/service/OperationResult;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/facebook/fbservice/service/ServiceException;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 42
    iput-object p1, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->a:Lcom/facebook/contacts/upload/k;

    .line 43
    iput p2, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->b:I

    .line 44
    iput p3, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->c:I

    .line 45
    iput p4, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->d:I

    .line 46
    iput-object p5, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->e:Lcom/facebook/fbservice/service/OperationResult;

    .line 47
    iput-object p6, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->f:Lcom/facebook/fbservice/service/ServiceException;

    .line 48
    return-void

    .line 41
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(III)Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 134
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->RUNNING:Lcom/facebook/contacts/upload/k;

    move v2, p0

    move v3, p1

    move v4, p2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    .line 149
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->SUCCEEDED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->b()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v4

    const/4 v6, 0x0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    .line 177
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->b()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v4

    const/4 v5, 0x0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method

.method public static e()Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 108
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->NOT_STARTED:Lcom/facebook/contacts/upload/k;

    move v3, v2

    move v4, v2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method

.method public static f()Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 121
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->STARTED:Lcom/facebook/contacts/upload/k;

    move v3, v2

    move v4, v2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method

.method public static g()Lcom/facebook/contacts/upload/ContactsUploadState;
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 162
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    sget-object v1, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    move v3, v2

    move v4, v2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/upload/ContactsUploadState;-><init>(Lcom/facebook/contacts/upload/k;IIILcom/facebook/fbservice/service/OperationResult;Lcom/facebook/fbservice/service/ServiceException;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/upload/k;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->a:Lcom/facebook/contacts/upload/k;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 78
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->d:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 199
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContactsUploadState ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->a:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") (processed/matched/total): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 204
    iget-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->a:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/k;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 205
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 206
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 207
    iget v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 208
    iget-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->e:Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 209
    iget-object v0, p0, Lcom/facebook/contacts/upload/ContactsUploadState;->f:Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 210
    return-void
.end method
