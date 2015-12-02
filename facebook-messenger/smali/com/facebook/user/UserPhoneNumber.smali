.class public Lcom/facebook/user/UserPhoneNumber;
.super Lcom/facebook/user/UserIdentifier;
.source "UserPhoneNumber.java"

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
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserIdentifierKey;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Lcom/facebook/common/w/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/user/ab;

    invoke-direct {v0}, Lcom/facebook/user/ab;-><init>()V

    sput-object v0, Lcom/facebook/user/UserPhoneNumber;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 45
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Ljava/lang/String;)Lcom/facebook/common/w/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    .line 50
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/ab;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/user/UserPhoneNumber;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/user/UserPhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/common/w/q;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/common/w/q;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 37
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    invoke-direct {v0, v1, p2}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 39
    iput-object p1, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    .line 40
    iput p3, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    .line 41
    iput-object p4, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    .line 42
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->getTypeLabel(Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 82
    sget-object v0, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 117
    if-ne p0, p1, :cond_1

    .line 131
    :cond_0
    :goto_0
    return v0

    .line 118
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

    .line 120
    :cond_3
    check-cast p1, Lcom/facebook/user/UserPhoneNumber;

    .line 122
    iget v2, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    iget v3, p1, Lcom/facebook/user/UserPhoneNumber;->c:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 123
    :cond_4
    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_5
    move v0, v1

    .line 125
    goto :goto_0

    .line 123
    :cond_6
    iget-object v2, p1, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 126
    :cond_7
    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    iget-object v3, p1, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    if-eq v2, v3, :cond_8

    move v0, v1

    goto :goto_0

    .line 127
    :cond_8
    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v3, p1, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    invoke-virtual {v2, v3}, Lcom/facebook/user/UserIdentifierKey;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 129
    goto :goto_0

    .line 127
    :cond_9
    iget-object v2, p1, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public f()I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    return v0
.end method

.method public g()Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 136
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->a:Lcom/facebook/user/UserIdentifierKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifierKey;->hashCode()I

    move-result v0

    .line 137
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 138
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    add-int/2addr v0, v2

    .line 139
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    invoke-virtual {v1}, Lcom/facebook/common/w/q;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 140
    return v0

    :cond_1
    move v0, v1

    .line 136
    goto :goto_0

    :cond_2
    move v0, v1

    .line 137
    goto :goto_1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/facebook/user/UserPhoneNumber;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget v0, p0, Lcom/facebook/user/UserPhoneNumber;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 153
    iget-object v0, p0, Lcom/facebook/user/UserPhoneNumber;->d:Lcom/facebook/common/w/q;

    invoke-virtual {v0}, Lcom/facebook/common/w/q;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 154
    return-void
.end method
