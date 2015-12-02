.class public final Lcom/facebook/user/tiles/e;
.super Ljava/lang/Object;
.source "UserTileViewParams.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/user/tiles/f;

.field private final c:Lcom/facebook/user/PicCropInfo;

.field private final d:Lcom/facebook/user/UserKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/user/tiles/e;

    sput-object v0, Lcom/facebook/user/tiles/e;->a:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>(Lcom/facebook/user/tiles/f;Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)V
    .locals 0
    .param p2    # Lcom/facebook/user/PicCropInfo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/user/UserKey;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/user/tiles/e;->b:Lcom/facebook/user/tiles/f;

    .line 45
    iput-object p2, p0, Lcom/facebook/user/tiles/e;->c:Lcom/facebook/user/PicCropInfo;

    .line 46
    iput-object p3, p0, Lcom/facebook/user/tiles/e;->d:Lcom/facebook/user/UserKey;

    .line 47
    return-void
.end method

.method public static a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/tiles/e;
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;
    .locals 2
    .param p1    # Lcom/facebook/user/UserKey;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/user/tiles/e;

    sget-object v1, Lcom/facebook/user/tiles/f;->PIC_CROP_INFO:Lcom/facebook/user/tiles/f;

    invoke-direct {v0, v1, p0, p1}, Lcom/facebook/user/tiles/e;-><init>(Lcom/facebook/user/tiles/f;Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/user/User;)Lcom/facebook/user/tiles/e;
    .locals 4

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    sget-object v1, Lcom/facebook/user/tiles/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using pic crop info for user ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    .line 69
    :cond_0
    sget-object v1, Lcom/facebook/user/tiles/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using user key for user ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;
    .locals 3

    .prologue
    .line 60
    new-instance v0, Lcom/facebook/user/tiles/e;

    sget-object v1, Lcom/facebook/user/tiles/f;->USER_KEY:Lcom/facebook/user/tiles/f;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, Lcom/facebook/user/tiles/e;-><init>(Lcom/facebook/user/tiles/f;Lcom/facebook/user/PicCropInfo;Lcom/facebook/user/UserKey;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/user/tiles/f;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/user/tiles/e;->b:Lcom/facebook/user/tiles/f;

    return-object v0
.end method

.method public b()Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/user/tiles/e;->c:Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public c()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/user/tiles/e;->d:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 87
    if-ne p0, p1, :cond_1

    .line 108
    :cond_0
    :goto_0
    return v0

    .line 91
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 92
    goto :goto_0

    .line 95
    :cond_3
    check-cast p1, Lcom/facebook/user/tiles/e;

    .line 96
    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->a()Lcom/facebook/user/tiles/f;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->a()Lcom/facebook/user/tiles/f;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/user/tiles/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    .line 97
    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->b()Lcom/facebook/user/PicCropInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->b()Lcom/facebook/user/PicCropInfo;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 101
    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->c()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 105
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 112
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->a()Lcom/facebook/user/tiles/f;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->b()Lcom/facebook/user/PicCropInfo;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/facebook/user/tiles/e;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
