.class public Lcom/facebook/contacts/server/UploadBulkContactChangeResult;
.super Ljava/lang/Object;
.source "UploadBulkContactChangeResult.java"

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
            "Lcom/facebook/contacts/server/UploadBulkContactChangeResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/contacts/server/ag;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/contacts/server/af;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 95
    new-instance v0, Lcom/facebook/contacts/server/ae;

    invoke-direct {v0}, Lcom/facebook/contacts/server/ae;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const-class v0, Lcom/facebook/contacts/server/ag;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ag;

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a:Lcom/facebook/contacts/server/ag;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c:Ljava/lang/String;

    .line 55
    const-class v0, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->d:Lcom/google/common/a/es;

    .line 57
    const-class v0, Lcom/facebook/contacts/server/af;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/af;

    iput-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->e:Lcom/facebook/contacts/server/af;

    .line 58
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/ae;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/server/ag;Ljava/lang/String;Ljava/lang/String;Lcom/google/common/a/es;Lcom/facebook/contacts/server/af;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/server/ag;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;",
            ">;",
            "Lcom/facebook/contacts/server/af;",
            ")V"
        }
    .end annotation

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a:Lcom/facebook/contacts/server/ag;

    .line 45
    iput-object p2, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c:Ljava/lang/String;

    .line 47
    iput-object p4, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->d:Lcom/google/common/a/es;

    .line 48
    iput-object p5, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->e:Lcom/facebook/contacts/server/af;

    .line 49
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/server/ag;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a:Lcom/facebook/contacts/server/ag;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/facebook/contacts/server/af;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->e:Lcom/facebook/contacts/server/af;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UploadBulkContactChangeResult ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") confidence: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->e:Lcom/facebook/contacts/server/af;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " local id: ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] -> remote id: ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/ag;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->e:Lcom/facebook/contacts/server/af;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/af;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 118
    return-void
.end method
