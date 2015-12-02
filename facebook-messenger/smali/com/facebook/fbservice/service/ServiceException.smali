.class public Lcom/facebook/fbservice/service/ServiceException;
.super Ljava/lang/Exception;
.source "ServiceException.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/fbservice/service/ServiceException;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/fbservice/service/t;

.field private final b:Lcom/facebook/fbservice/service/OperationResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/fbservice/service/ah;

    invoke-direct {v0}, Lcom/facebook/fbservice/service/ah;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/service/ServiceException;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/t;

    iput-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->a:Lcom/facebook/fbservice/service/t;

    .line 32
    const-class v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    iput-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->b:Lcom/facebook/fbservice/service/OperationResult;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/fbservice/service/ah;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/ServiceException;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->d()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->d()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->a:Lcom/facebook/fbservice/service/t;

    .line 27
    iput-object p1, p0, Lcom/facebook/fbservice/service/ServiceException;->b:Lcom/facebook/fbservice/service/OperationResult;

    .line 28
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/ServiceException;
    .locals 2

    .prologue
    .line 17
    invoke-static {p0}, Lcom/facebook/fbservice/service/u;->a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/t;

    move-result-object v0

    invoke-static {p0}, Lcom/facebook/fbservice/service/u;->b(Ljava/lang/Throwable;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 21
    new-instance v1, Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {v1, v0}, Lcom/facebook/fbservice/service/ServiceException;-><init>(Lcom/facebook/fbservice/service/OperationResult;)V

    return-object v1
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/t;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->a:Lcom/facebook/fbservice/service/t;

    return-object v0
.end method

.method public b()Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->b:Lcom/facebook/fbservice/service/OperationResult;

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
    iget-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->a:Lcom/facebook/fbservice/service/t;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/fbservice/service/ServiceException;->b:Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 63
    return-void
.end method
