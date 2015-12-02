.class public Lcom/facebook/contacts/models/entry/PhoneEntry;
.super Ljava/lang/Object;
.source "PhoneEntry.java"

# interfaces
.implements Lcom/facebook/contacts/models/entry/Entry;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/models/entry/PhoneEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:Ljava/lang/String;

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 118
    new-instance v0, Lcom/facebook/contacts/models/entry/e;

    invoke-direct {v0}, Lcom/facebook/contacts/models/entry/e;-><init>()V

    sput-object v0, Lcom/facebook/contacts/models/entry/PhoneEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    .line 54
    return-void

    .line 49
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "graphApiWriteId"
        .end annotation

        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "isVerified"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "source"
        .end annotation

        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # J
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "creationTime"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "number"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "type"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    .line 40
    iput-boolean p2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    .line 41
    iput-object p3, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    .line 42
    iput-wide p4, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    .line 43
    iput-object p6, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    .line 44
    iput p7, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    .line 45
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/models/entry/d;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/facebook/contacts/models/entry/d;->PHONE_NUMBER:Lcom/facebook/contacts/models/entry/d;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 93
    if-ne p0, p1, :cond_1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 94
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 96
    :cond_3
    check-cast p1, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 98
    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getIsVerified()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getCreationTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getType()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public getCreationTime()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "creationTime"
    .end annotation

    .prologue
    .line 78
    iget-wide v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    return-wide v0
.end method

.method public getGraphApiWriteId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "graphApiWriteId"
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getIsVerified()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "isVerified"
    .end annotation

    .prologue
    .line 68
    iget-boolean v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    return v0
.end method

.method public getNumber()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "number"
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source"
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .prologue
    .line 88
    iget v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 108
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-boolean v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 138
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    iget-wide v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 140
    iget-object v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    iget v0, p0, Lcom/facebook/contacts/models/entry/PhoneEntry;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    return-void

    .line 137
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
