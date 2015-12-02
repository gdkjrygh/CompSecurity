.class public Lcom/facebook/auth/credentials/FacebookCredentials;
.super Ljava/lang/Object;
.source "FacebookCredentials.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/auth/credentials/FacebookCredentials;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 85
    new-instance v0, Lcom/facebook/auth/credentials/a;

    invoke-direct {v0}, Lcom/facebook/auth/credentials/a;-><init>()V

    sput-object v0, Lcom/facebook/auth/credentials/FacebookCredentials;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->a:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->b:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->c:J

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->d:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->e:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->f:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->g:Ljava/lang/String;

    .line 55
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/auth/credentials/a;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/auth/credentials/FacebookCredentials;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->a:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->b:Ljava/lang/String;

    .line 23
    iput-wide p3, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->c:J

    .line 24
    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->d:Ljava/lang/String;

    .line 25
    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->e:Ljava/lang/String;

    .line 26
    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->f:Ljava/lang/String;

    .line 27
    iput-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->g:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->a:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->b:Ljava/lang/String;

    .line 40
    iput-wide p3, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->c:J

    .line 41
    iput-object p5, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->d:Ljava/lang/String;

    .line 42
    iput-object p6, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->e:Ljava/lang/String;

    .line 43
    iput-object p7, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->f:Ljava/lang/String;

    .line 44
    iput-object p8, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->g:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 66
    iget-wide v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->c:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->e:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->g:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 105
    iget-wide v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 106
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/auth/credentials/FacebookCredentials;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    return-void
.end method
