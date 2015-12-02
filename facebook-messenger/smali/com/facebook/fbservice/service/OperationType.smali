.class public Lcom/facebook/fbservice/service/OperationType;
.super Ljava/lang/Object;
.source "OperationType.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/fbservice/service/OperationType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 115
    new-instance v0, Lcom/facebook/fbservice/service/ag;

    invoke-direct {v0}, Lcom/facebook/fbservice/service/ag;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/service/OperationType;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    .line 34
    invoke-static {p1}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/fbservice/service/ag;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;Z)V

    .line 25
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    .line 29
    iput-boolean p2, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    .line 30
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 64
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    return v0
.end method

.method public c()Lcom/facebook/fbservice/service/OperationType;
    .locals 2

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    iget-object v1, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public d()Lcom/facebook/fbservice/service/OperationType;
    .locals 3

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    iget-object v1, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;Z)V

    move-object p0, v0

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 98
    if-ne p0, p1, :cond_1

    .line 105
    :cond_0
    :goto_0
    return v0

    .line 101
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 102
    goto :goto_0

    .line 104
    :cond_3
    check-cast p1, Lcom/facebook/fbservice/service/OperationType;

    .line 105
    iget-object v2, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    iget-boolean v3, p1, Lcom/facebook/fbservice/service/OperationType;->b:Z

    if-eq v2, v3, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 110
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 111
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    .line 112
    return v0

    :cond_1
    move v0, v1

    .line 110
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 39
    const-class v0, Lcom/facebook/fbservice/service/OperationType;

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Class;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "Operation Name"

    iget-object v2, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "forRemote"

    iget-boolean v2, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/fbservice/service/OperationType;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/OperationType;->b:Z

    invoke-static {p1, v0}, Lcom/facebook/common/parcels/a;->a(Landroid/os/Parcel;Z)V

    .line 94
    return-void
.end method
