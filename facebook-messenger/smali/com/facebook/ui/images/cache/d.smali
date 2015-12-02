.class public Lcom/facebook/ui/images/cache/d;
.super Lcom/facebook/ui/media/cache/l;
.source "ImageCacheKey.java"


# static fields
.field public static final a:Lcom/facebook/ui/images/cache/e;

.field public static final b:Lcom/facebook/ui/images/cache/e;

.field public static final c:Lcom/facebook/ui/images/cache/e;


# instance fields
.field private final d:Landroid/net/Uri;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/facebook/ui/images/cache/e;

.field private volatile g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v2, 0x40

    .line 21
    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/g;->a(Z)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/images/cache/d;->a:Lcom/facebook/ui/images/cache/e;

    .line 23
    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Lcom/facebook/ui/images/cache/g;->a(II)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/images/cache/d;->b:Lcom/facebook/ui/images/cache/e;

    .line 25
    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/g;->a(Z)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/images/cache/d;->c:Lcom/facebook/ui/images/cache/e;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/facebook/ui/images/cache/e;)V
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/ui/images/cache/d;-><init>(Landroid/net/Uri;Lcom/facebook/ui/images/cache/e;Ljava/lang/String;)V

    .line 158
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/facebook/ui/images/cache/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 160
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/l;-><init>()V

    .line 161
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    iput-object p1, p0, Lcom/facebook/ui/images/cache/d;->d:Landroid/net/Uri;

    .line 164
    iput-object p2, p0, Lcom/facebook/ui/images/cache/d;->f:Lcom/facebook/ui/images/cache/e;

    .line 165
    iput-object p3, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    .line 166
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/cache/e;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->f:Lcom/facebook/ui/images/cache/e;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/ui/images/cache/d;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "____"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/cache/d;->g:Ljava/lang/String;

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 196
    instance-of v0, p1, Lcom/facebook/ui/images/cache/d;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 197
    check-cast p1, Lcom/facebook/ui/images/cache/d;

    .line 198
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v2

    .line 201
    :goto_0
    iget-object v3, p0, Lcom/facebook/ui/images/cache/d;->d:Landroid/net/Uri;

    iget-object v4, p1, Lcom/facebook/ui/images/cache/d;->d:Landroid/net/Uri;

    invoke-virtual {v3, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->f:Lcom/facebook/ui/images/cache/e;

    iget-object v3, p1, Lcom/facebook/ui/images/cache/d;->f:Lcom/facebook/ui/images/cache/e;

    invoke-virtual {v0, v3}, Lcom/facebook/ui/images/cache/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 205
    :goto_1
    return v2

    :cond_2
    move v0, v1

    .line 198
    goto :goto_0

    :cond_3
    move v2, v1

    .line 201
    goto :goto_1

    :cond_4
    move v2, v1

    .line 205
    goto :goto_1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->d:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/ui/images/cache/d;->f:Lcom/facebook/ui/images/cache/e;

    invoke-virtual {v1}, Lcom/facebook/ui/images/cache/e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/cache/d;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method
