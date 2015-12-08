.class public Lcom/dropbox/client2/DropboxAPI$NameDetails;
.super Lcom/dropbox/client2/VersionedSerializable;
.source "SourceFile"


# static fields
.field private static MY_VERSION:I = 0x0

.field private static final serialVersionUID:J = 0x1d1be5b63d0357f6L


# instance fields
.field public final familiarName:Ljava/lang/String;

.field public final givenName:Ljava/lang/String;

.field public final surname:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x1

    sput v0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->MY_VERSION:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 183
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 184
    iput-object p1, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->givenName:Ljava/lang/String;

    .line 185
    iput-object p2, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->surname:Ljava/lang/String;

    .line 186
    iput-object p3, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->familiarName:Ljava/lang/String;

    .line 187
    return-void
.end method

.method protected constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 174
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 175
    const-string v0, "given_name"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->givenName:Ljava/lang/String;

    .line 176
    const-string v0, "surname"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->surname:Ljava/lang/String;

    .line 177
    const-string v0, "familiar_name"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->familiarName:Ljava/lang/String;

    .line 178
    return-void
.end method


# virtual methods
.method public getLatestVersion()I
    .locals 1

    .prologue
    .line 191
    sget v0, Lcom/dropbox/client2/DropboxAPI$NameDetails;->MY_VERSION:I

    return v0
.end method
