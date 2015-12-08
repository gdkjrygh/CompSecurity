.class public Lcom/dropbox/client2/DropboxAPI$TeamInfo;
.super Lcom/dropbox/client2/VersionedSerializable;
.source "SourceFile"


# static fields
.field private static MY_VERSION:I = 0x0

.field private static final serialVersionUID:J = 0x1d1be5b63d0357f5L


# instance fields
.field public final name:Ljava/lang/String;

.field public final teamId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 115
    const/4 v0, 0x1

    sput v0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->MY_VERSION:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 142
    iput-object p1, p0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->teamId:Ljava/lang/String;

    .line 143
    iput-object p2, p0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->name:Ljava/lang/String;

    .line 144
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
    .line 133
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 134
    const-string v0, "name"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->name:Ljava/lang/String;

    .line 135
    const-string v0, "team_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->teamId:Ljava/lang/String;

    .line 136
    return-void
.end method


# virtual methods
.method public getLatestVersion()I
    .locals 1

    .prologue
    .line 148
    sget v0, Lcom/dropbox/client2/DropboxAPI$TeamInfo;->MY_VERSION:I

    return v0
.end method
