.class public final Lcom/qihoo/security/locale/LocaleInfo;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final PKG_MATCHED:I = 0x0

.field public static final PKG_NEED_UPDATE:I = 0x1

.field public static final PKG_NOT_INSTALLED:I = 0x2

.field public static final PKG_NOT_MATCHED:I = 0x3


# instance fields
.field public allVersion:Ljava/lang/String;

.field public buildin:Z

.field public cfgMatched:Z

.field public locale:Ljava/lang/String;

.field public md5:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public pkg:Ljava/lang/String;

.field public pkgVersion:I

.field public size:J

.field public state:I

.field public support:Z

.field public translator:Ljava/lang/String;

.field public url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 88
    new-instance v0, Lcom/qihoo/security/locale/LocaleInfo$1;

    invoke-direct {v0}, Lcom/qihoo/security/locale/LocaleInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/locale/LocaleInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 25
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 26
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 27
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 29
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 31
    iput v5, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 33
    iput-boolean v4, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 36
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 37
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 38
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 40
    iput v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 153
    const-string/jumbo v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 154
    array-length v1, v0

    const/4 v2, 0x7

    if-ge v1, v2, :cond_0

    .line 158
    iput-boolean v4, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    .line 192
    :goto_0
    return-void

    .line 162
    :cond_0
    aget-object v1, v0, v4

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 163
    aget-object v1, v0, v3

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 164
    aget-object v1, v0, v5

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 166
    const/4 v1, 0x3

    :try_start_0
    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    const/4 v1, 0x4

    aget-object v1, v0, v1

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 176
    const/4 v1, 0x5

    :try_start_1
    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 184
    const/4 v1, 0x6

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 186
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LocaleInfo;->isAppVersionMatch()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    goto :goto_0

    .line 167
    :catch_0
    move-exception v0

    .line 171
    iput-boolean v4, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    goto :goto_0

    .line 177
    :catch_1
    move-exception v0

    .line 181
    iput-boolean v4, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    goto :goto_0
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 25
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 26
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 27
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 29
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 31
    iput v4, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 33
    iput-boolean v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 36
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 37
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 38
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 40
    iput v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->createBooleanArray()[Z

    move-result-object v0

    .line 78
    aget-boolean v1, v0, v2

    iput-boolean v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 79
    aget-boolean v1, v0, v3

    iput-boolean v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    .line 80
    aget-boolean v0, v0, v4

    iput-boolean v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 86
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/qihoo/security/locale/LocaleInfo$1;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 25
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 26
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 27
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 29
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 31
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 36
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 37
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 38
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 40
    iput v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 108
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 109
    iput-boolean v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 110
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 25
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 26
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 27
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 29
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 31
    const/4 v1, 0x2

    iput v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 33
    iput-boolean v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 36
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 37
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 38
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 40
    const/4 v1, 0x1

    iput v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 44
    const-string/jumbo v1, ""

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 129
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 130
    iput-object p2, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 131
    iput p3, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 132
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LocaleInfo;->isAppVersionMatch()Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    .line 133
    iget-boolean v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    if-eqz v1, :cond_0

    :goto_0
    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 134
    iput-object p4, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 135
    iput-object p5, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 136
    iput-object p6, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 137
    return-void

    .line 133
    :cond_0
    const/4 v0, 0x3

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 25
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    .line 26
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    .line 27
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    .line 29
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    .line 31
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    .line 36
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    .line 37
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    .line 38
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    .line 40
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 102
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    .line 103
    iput-boolean p2, p0, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    .line 104
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public isAllVersionMatch()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 254
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 280
    :cond_0
    :goto_0
    return v0

    .line 258
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    const-string/jumbo v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 259
    if-eqz v2, :cond_0

    array-length v3, v2

    const/4 v4, 0x3

    if-lt v3, v4, :cond_0

    .line 263
    const-string/jumbo v3, "1.0.8"

    aget-object v4, v2, v0

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 268
    :try_start_0
    const-string/jumbo v3, "3742"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 269
    const/4 v4, 0x1

    aget-object v4, v2, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 270
    const/4 v5, 0x2

    aget-object v2, v2, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 271
    if-gt v4, v3, :cond_0

    if-lt v2, v3, :cond_0

    move v0, v1

    .line 272
    goto :goto_0

    .line 274
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public isAppBuildMatch()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 222
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 240
    :cond_0
    :goto_0
    return v0

    .line 225
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    const-string/jumbo v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 226
    if-eqz v2, :cond_0

    array-length v3, v2

    const/4 v4, 0x3

    if-lt v3, v4, :cond_0

    .line 230
    :try_start_0
    const-string/jumbo v3, "3742"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 231
    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 232
    if-gt v2, v3, :cond_0

    move v0, v1

    .line 233
    goto :goto_0

    .line 235
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public isAppVersionMatch()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 200
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 213
    :cond_0
    :goto_0
    return v0

    .line 204
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    const-string/jumbo v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 205
    if-eqz v1, :cond_0

    array-length v2, v1

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    .line 209
    const-string/jumbo v2, "1.0.8"

    aget-object v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 210
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 285
    const-string/jumbo v0, "%s %s %s %s %s %s"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-boolean v3, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->md5:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    iget-wide v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->size:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 59
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->translator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    const/4 v0, 0x3

    new-array v0, v0, [Z

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    aput-boolean v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->cfgMatched:Z

    aput-boolean v2, v0, v1

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    aput-boolean v2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->path:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->allVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->pkgVersion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 68
    return-void
.end method
