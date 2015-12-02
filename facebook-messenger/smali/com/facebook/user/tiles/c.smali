.class public Lcom/facebook/user/tiles/c;
.super Ljava/lang/Object;
.source "UserTileViewLogic.java"


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
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/p;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/user/tiles/c;

    sput-object v0, Lcom/facebook/user/tiles/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/p;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/user/tiles/c;->b:Ljavax/inject/a;

    .line 40
    iput-object p2, p0, Lcom/facebook/user/tiles/c;->c:Ljavax/inject/a;

    .line 41
    return-void
.end method

.method private a(Lcom/facebook/user/PicCropInfo;II)Lcom/facebook/ui/images/b/m;
    .locals 4

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/user/tiles/c;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetching tile data from crop info: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 72
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->b()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    sget-object v0, Lcom/facebook/widget/images/UrlImage;->a:Lcom/facebook/ui/images/b/m;

    .line 78
    :goto_0
    return-object v0

    .line 75
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/user/tiles/c;->b(Lcom/facebook/user/PicCropInfo;II)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    .line 78
    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v3

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/User;Lcom/facebook/user/UserKey;II)Lcom/facebook/ui/images/b/m;
    .locals 4

    .prologue
    .line 94
    const/4 v0, 0x0

    .line 95
    if-eqz p1, :cond_0

    .line 96
    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/PicCropInfo;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 97
    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    invoke-direct {p0, v0, p3, p4}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/PicCropInfo;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 113
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 114
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_3

    invoke-virtual {p2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 117
    iget-object v0, p0, Lcom/facebook/user/tiles/c;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->b()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "picture"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "large"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 121
    invoke-direct {p0, p3, p4}, Lcom/facebook/user/tiles/c;->a(II)Lcom/facebook/ui/images/d/h;

    move-result-object v1

    .line 122
    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v3

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v1

    invoke-virtual {v2, v3, v1}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 136
    :cond_1
    :goto_1
    return-object v0

    .line 98
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/User;->r()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 99
    invoke-direct {p0, p3, p4}, Lcom/facebook/user/tiles/c;->a(II)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    .line 100
    invoke-virtual {p1}, Lcom/facebook/user/User;->r()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v3

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    goto/16 :goto_0

    .line 133
    :cond_3
    sget-object v0, Lcom/facebook/widget/images/UrlImage;->a:Lcom/facebook/ui/images/b/m;

    goto :goto_1
.end method

.method private a(Lcom/facebook/user/UserKey;II)Lcom/facebook/ui/images/b/m;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/user/tiles/c;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/p;

    invoke-interface {v0, p1}, Lcom/facebook/user/p;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 64
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/User;Lcom/facebook/user/UserKey;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    return-object v0
.end method

.method private a(II)Lcom/facebook/ui/images/d/h;
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    .line 140
    new-instance v0, Lcom/facebook/ui/images/d/i;

    invoke-direct {v0}, Lcom/facebook/ui/images/d/i;-><init>()V

    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    int-to-float v2, p1

    int-to-float v3, p2

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p2, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/facebook/user/PicCropInfo;II)Lcom/facebook/ui/images/d/h;
    .locals 6

    .prologue
    const/high16 v5, 0x3f800000    # 1.0f

    .line 158
    new-instance v0, Lcom/facebook/ui/images/d/i;

    invoke-direct {v0}, Lcom/facebook/ui/images/d/i;-><init>()V

    new-instance v1, Lcom/facebook/ui/images/d/f;

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->j()Landroid/graphics/RectF;

    move-result-object v2

    int-to-float v3, p2

    int-to-float v4, p3

    div-float/2addr v3, v4

    invoke-direct {v1, v2, v3}, Lcom/facebook/ui/images/d/f;-><init>(Landroid/graphics/RectF;F)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/f;)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    int-to-float v2, p2

    int-to-float v3, p3

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(Lcom/facebook/ui/images/d/c;)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p2, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p3, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/user/tiles/e;II)Lcom/facebook/ui/images/b/m;
    .locals 2

    .prologue
    .line 47
    if-nez p1, :cond_0

    .line 48
    const/4 v0, 0x0

    .line 55
    :goto_0
    return-object v0

    .line 51
    :cond_0
    sget-object v0, Lcom/facebook/user/tiles/d;->a:[I

    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->a()Lcom/facebook/user/tiles/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/tiles/f;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not reached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->b()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/PicCropInfo;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    goto :goto_0

    .line 55
    :pswitch_1
    invoke-virtual {p1}, Lcom/facebook/user/tiles/e;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/UserKey;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    goto :goto_0

    .line 51
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
