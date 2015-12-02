.class public Lcom/facebook/ui/media/attachments/MediaResource;
.super Ljava/lang/Object;
.source "MediaResource.java"

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
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:J

.field private final c:Lcom/facebook/ui/media/attachments/g;

.field private final d:Landroid/net/Uri;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:J

.field private final h:I

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/ui/media/attachments/MediaResource;

    sput-object v0, Lcom/facebook/ui/media/attachments/MediaResource;->a:Ljava/lang/Class;

    .line 298
    new-instance v0, Lcom/facebook/ui/media/attachments/e;

    invoke-direct {v0}, Lcom/facebook/ui/media/attachments/e;-><init>()V

    sput-object v0, Lcom/facebook/ui/media/attachments/MediaResource;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 309
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->b:J

    .line 310
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->d:Landroid/net/Uri;

    .line 311
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/g;->valueOf(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->c:Lcom/facebook/ui/media/attachments/g;

    .line 312
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->e:Ljava/lang/String;

    .line 313
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    .line 314
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->g:J

    .line 315
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->h:I

    .line 316
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->i:I

    .line 317
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/ui/media/attachments/e;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/attachments/MediaResource;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/ui/media/attachments/f;)V
    .locals 2

    .prologue
    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->b:J

    .line 149
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->b()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->c:Lcom/facebook/ui/media/attachments/g;

    .line 150
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->c()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->d:Landroid/net/Uri;

    .line 151
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->e:Ljava/lang/String;

    .line 152
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->g:J

    .line 154
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->g()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->h:I

    .line 155
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/f;->h()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->i:I

    .line 156
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/media/attachments/f;Lcom/facebook/ui/media/attachments/e;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/attachments/MediaResource;-><init>(Lcom/facebook/ui/media/attachments/f;)V

    return-void
.end method

.method public static a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 224
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Landroid/net/Uri;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/net/Uri;J)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 2

    .prologue
    .line 270
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/media/attachments/f;->b(J)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/net/Uri;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 2

    .prologue
    .line 216
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/f;->b(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 210
    invoke-static {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/f;->b(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 228
    const-wide/16 v0, 0x0

    invoke-static {p0, v2, v2, v0, v1}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;IIJ)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/File;IIJ)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 3

    .prologue
    .line 237
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 239
    :cond_0
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 240
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 241
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 242
    iget p1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 243
    iget p2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    :cond_1
    :goto_0
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Lcom/facebook/ui/media/attachments/f;->a(J)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/f;->a(I)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/media/attachments/f;->b(I)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0

    .line 244
    :catch_0
    move-exception v0

    .line 245
    sget-object v1, Lcom/facebook/ui/media/attachments/MediaResource;->a:Ljava/lang/Class;

    const-string v2, "Error when trying to load photo options: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a(Ljava/io/File;J)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 232
    invoke-static {p0, v0, v0, p1, p2}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;IIJ)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static a()Lcom/facebook/ui/media/attachments/f;
    .locals 1

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/ui/media/attachments/f;

    invoke-direct {v0}, Lcom/facebook/ui/media/attachments/f;-><init>()V

    return-object v0
.end method

.method public static a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/f;
    .locals 3

    .prologue
    .line 136
    new-instance v0, Lcom/facebook/ui/media/attachments/f;

    invoke-direct {v0}, Lcom/facebook/ui/media/attachments/f;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/media/attachments/f;->a(J)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->b(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/media/attachments/f;->b(J)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(I)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->b(I)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 2

    .prologue
    .line 259
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->VIDEO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 266
    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->b(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()J
    .locals 2

    .prologue
    .line 162
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->b:J

    return-wide v0
.end method

.method public c()Lcom/facebook/ui/media/attachments/g;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->c:Lcom/facebook/ui/media/attachments/g;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 283
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 195
    if-ne p0, p1, :cond_1

    .line 202
    :cond_0
    :goto_0
    return v0

    .line 198
    :cond_1
    instance-of v2, p1, Lcom/facebook/ui/media/attachments/MediaResource;

    if-nez v2, :cond_2

    move v0, v1

    .line 199
    goto :goto_0

    .line 201
    :cond_2
    check-cast p1, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 202
    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->h()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->h()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/MediaResource;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->i()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 182
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->g:J

    return-wide v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 186
    iget v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->h:I

    return v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 190
    iget v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->i:I

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .prologue
    .line 320
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const/4 v0, 0x0

    .line 324
    :goto_0
    return-object v0

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 324
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 288
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 289
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->d:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 290
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->c:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/g;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 291
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 292
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 293
    iget-wide v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->g:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 294
    iget v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 295
    iget v0, p0, Lcom/facebook/ui/media/attachments/MediaResource;->i:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 296
    return-void
.end method
