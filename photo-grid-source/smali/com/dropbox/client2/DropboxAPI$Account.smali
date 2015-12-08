.class public Lcom/dropbox/client2/DropboxAPI$Account;
.super Lcom/dropbox/client2/VersionedSerializable;
.source "SourceFile"


# static fields
.field private static MY_VERSION:I = 0x0

.field private static final serialVersionUID:J = 0x1d1be5b63d0357f4L


# instance fields
.field public final country:Ljava/lang/String;

.field public final displayName:Ljava/lang/String;

.field public final email:Ljava/lang/String;

.field public final emailVerified:Z

.field public final isPaired:Z

.field public final locale:Ljava/lang/String;

.field public final nameDetails:Lcom/dropbox/client2/DropboxAPI$NameDetails;

.field public final quota:J

.field public final quotaNormal:J

.field public final quotaShared:J

.field public final referralLink:Ljava/lang/String;

.field public final teamInfo:Lcom/dropbox/client2/DropboxAPI$TeamInfo;

.field public final uid:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 203
    const/4 v0, 0x2

    sput v0, Lcom/dropbox/client2/DropboxAPI$Account;->MY_VERSION:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ZLjava/lang/String;Lcom/dropbox/client2/DropboxAPI$NameDetails;Lcom/dropbox/client2/DropboxAPI$TeamInfo;JJJ)V
    .locals 2

    .prologue
    .line 306
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 308
    iput-object p1, p0, Lcom/dropbox/client2/DropboxAPI$Account;->country:Ljava/lang/String;

    .line 309
    iput-object p2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->displayName:Ljava/lang/String;

    .line 310
    iput-object p3, p0, Lcom/dropbox/client2/DropboxAPI$Account;->email:Ljava/lang/String;

    .line 311
    iput-boolean p4, p0, Lcom/dropbox/client2/DropboxAPI$Account;->emailVerified:Z

    .line 312
    iput-wide p5, p0, Lcom/dropbox/client2/DropboxAPI$Account;->uid:J

    .line 313
    iput-object p7, p0, Lcom/dropbox/client2/DropboxAPI$Account;->referralLink:Ljava/lang/String;

    .line 314
    iput-boolean p8, p0, Lcom/dropbox/client2/DropboxAPI$Account;->isPaired:Z

    .line 315
    iput-object p9, p0, Lcom/dropbox/client2/DropboxAPI$Account;->locale:Ljava/lang/String;

    .line 316
    iput-object p10, p0, Lcom/dropbox/client2/DropboxAPI$Account;->nameDetails:Lcom/dropbox/client2/DropboxAPI$NameDetails;

    .line 317
    iput-object p11, p0, Lcom/dropbox/client2/DropboxAPI$Account;->teamInfo:Lcom/dropbox/client2/DropboxAPI$TeamInfo;

    .line 318
    iput-wide p12, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quota:J

    .line 319
    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaNormal:J

    .line 320
    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaShared:J

    .line 321
    return-void
.end method

.method protected constructor <init>(Ljava/util/Map;)V
    .locals 4
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
    const/4 v2, 0x0

    .line 263
    invoke-direct {p0}, Lcom/dropbox/client2/VersionedSerializable;-><init>()V

    .line 264
    const-string v0, "country"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->country:Ljava/lang/String;

    .line 265
    const-string v0, "display_name"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->displayName:Ljava/lang/String;

    .line 266
    const-string v0, "email"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->email:Ljava/lang/String;

    .line 267
    const-string v0, "email_verified"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->emailVerified:Z

    .line 269
    const-string v0, "uid"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->uid:J

    .line 270
    const-string v0, "referral_link"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->referralLink:Ljava/lang/String;

    .line 271
    const-string v0, "is_paired"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->isPaired:Z

    .line 272
    const-string v0, "locale"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->locale:Ljava/lang/String;

    .line 274
    const-string v0, "name_details"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 275
    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 277
    new-instance v1, Lcom/dropbox/client2/DropboxAPI$NameDetails;

    check-cast v0, Ljava/util/Map;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI$NameDetails;-><init>(Ljava/util/Map;)V

    .line 278
    iput-object v1, p0, Lcom/dropbox/client2/DropboxAPI$Account;->nameDetails:Lcom/dropbox/client2/DropboxAPI$NameDetails;

    .line 283
    :goto_0
    const-string v0, "team"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 284
    if-eqz v0, :cond_1

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_1

    .line 286
    new-instance v1, Lcom/dropbox/client2/DropboxAPI$TeamInfo;

    check-cast v0, Ljava/util/Map;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI$TeamInfo;-><init>(Ljava/util/Map;)V

    .line 287
    iput-object v1, p0, Lcom/dropbox/client2/DropboxAPI$Account;->teamInfo:Lcom/dropbox/client2/DropboxAPI$TeamInfo;

    .line 292
    :goto_1
    const-string v0, "quota_info"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 294
    check-cast v0, Ljava/util/Map;

    .line 295
    const-string v1, "quota"

    invoke-static {v0, v1}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quota:J

    .line 296
    const-string v1, "normal"

    invoke-static {v0, v1}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaNormal:J

    .line 297
    const-string v1, "shared"

    invoke-static {v0, v1}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaShared:J

    .line 298
    return-void

    .line 280
    :cond_0
    iput-object v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->nameDetails:Lcom/dropbox/client2/DropboxAPI$NameDetails;

    goto :goto_0

    .line 289
    :cond_1
    iput-object v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->teamInfo:Lcom/dropbox/client2/DropboxAPI$TeamInfo;

    goto :goto_1
.end method


# virtual methods
.method public getLatestVersion()I
    .locals 1

    .prologue
    .line 333
    sget v0, Lcom/dropbox/client2/DropboxAPI$Account;->MY_VERSION:I

    return v0
.end method

.method isOverQuota()Z
    .locals 4

    .prologue
    .line 328
    iget-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaNormal:J

    iget-wide v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quotaShared:J

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/dropbox/client2/DropboxAPI$Account;->quota:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
