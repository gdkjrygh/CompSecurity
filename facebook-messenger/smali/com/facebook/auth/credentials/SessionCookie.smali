.class public Lcom/facebook/auth/credentials/SessionCookie;
.super Ljava/lang/Object;
.source "SessionCookie.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/auth/credentials/SessionCookie;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "name"
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "value"
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "expires"
    .end annotation
.end field

.field private final d:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "domain"
    .end annotation
.end field

.field private e:Z
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "secure"
    .end annotation
.end field

.field private f:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "path"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 113
    new-instance v0, Lcom/facebook/auth/credentials/d;

    invoke-direct {v0}, Lcom/facebook/auth/credentials/d;-><init>()V

    sput-object v0, Lcom/facebook/auth/credentials/SessionCookie;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object v1, p0, Lcom/facebook/auth/credentials/SessionCookie;->a:Ljava/lang/String;

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->b:Ljava/lang/String;

    .line 53
    iput-object v1, p0, Lcom/facebook/auth/credentials/SessionCookie;->c:Ljava/lang/String;

    .line 54
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->d:Ljava/lang/String;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->e:Z

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->f:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->a:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->b:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->c:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->d:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->e:Z

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->f:Ljava/lang/String;

    .line 66
    return-void

    .line 64
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 98
    const/4 v0, 0x0

    .line 110
    :goto_0
    return-object v0

    .line 101
    :cond_0
    new-instance v0, Lcom/facebook/auth/credentials/e;

    invoke-direct {v0, p0}, Lcom/facebook/auth/credentials/e;-><init>(Lcom/facebook/auth/credentials/SessionCookie;)V

    iget-object v1, p0, Lcom/facebook/auth/credentials/SessionCookie;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/auth/credentials/SessionCookie;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/auth/credentials/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/auth/credentials/e;

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/facebook/auth/credentials/SessionCookie;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 103
    const-string v1, "Expires"

    iget-object v2, p0, Lcom/facebook/auth/credentials/SessionCookie;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/auth/credentials/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/auth/credentials/e;

    .line 105
    :cond_1
    const-string v1, "Domain"

    iget-object v2, p0, Lcom/facebook/auth/credentials/SessionCookie;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/auth/credentials/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/auth/credentials/e;

    move-result-object v1

    const-string v2, "Path"

    iget-object v3, p0, Lcom/facebook/auth/credentials/SessionCookie;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/auth/credentials/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/auth/credentials/e;

    .line 107
    iget-boolean v1, p0, Lcom/facebook/auth/credentials/SessionCookie;->e:Z

    if-eqz v1, :cond_2

    .line 108
    const-string v1, "secure"

    invoke-virtual {v0, v1}, Lcom/facebook/auth/credentials/e;->a(Ljava/lang/String;)Lcom/facebook/auth/credentials/e;

    .line 110
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/auth/credentials/e;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget-boolean v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 139
    iget-object v0, p0, Lcom/facebook/auth/credentials/SessionCookie;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 140
    return-void

    .line 138
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
