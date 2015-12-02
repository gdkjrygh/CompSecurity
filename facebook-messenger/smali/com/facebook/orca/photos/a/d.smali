.class public Lcom/facebook/orca/photos/a/d;
.super Ljava/lang/Object;
.source "MessengerThreadTileViewData.java"

# interfaces
.implements Lcom/facebook/widget/tiles/j;


# instance fields
.field private final a:Lcom/facebook/user/tiles/c;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/widget/tiles/a;

.field private final d:Landroid/net/Uri;

.field private final e:Z

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/tiles/c;",
            "Ljava/lang/String;",
            "Lcom/facebook/widget/tiles/a;",
            "Landroid/net/Uri;",
            "Z",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/photos/a/d;->a:Lcom/facebook/user/tiles/c;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/photos/a/d;->b:Ljava/lang/String;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/photos/a/d;->c:Lcom/facebook/widget/tiles/a;

    .line 44
    iput-object p4, p0, Lcom/facebook/orca/photos/a/d;->d:Landroid/net/Uri;

    .line 45
    iput-boolean p5, p0, Lcom/facebook/orca/photos/a/d;->e:Z

    .line 46
    iput-object p6, p0, Lcom/facebook/orca/photos/a/d;->f:Ljava/util/List;

    .line 47
    return-void
.end method

.method private static a(I)Lcom/facebook/ui/images/d/h;
    .locals 3

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 92
    new-instance v0, Lcom/facebook/ui/images/d/i;

    invoke-direct {v0}, Lcom/facebook/ui/images/d/i;-><init>()V

    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p0, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    div-int/lit8 v1, p0, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/facebook/orca/photos/a/d;->e:Z

    if-eqz v0, :cond_0

    .line 57
    const/4 v0, 0x0

    .line 61
    :goto_0
    return v0

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/a/d;->d:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 59
    const/4 v0, 0x1

    goto :goto_0

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/photos/a/d;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public a(III)Lcom/facebook/ui/images/b/m;
    .locals 4

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/photos/a/d;->a()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/photos/a/d;->d:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 69
    invoke-static {p2}, Lcom/facebook/orca/photos/a/d;->a(I)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/photos/a/d;->d:Landroid/net/Uri;

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

    .line 80
    :goto_1
    return-object v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 80
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/photos/a/d;->a:Lcom/facebook/user/tiles/c;

    iget-object v0, p0, Lcom/facebook/orca/photos/a/d;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    invoke-virtual {v1, v0, p2, p3}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/tiles/e;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    goto :goto_1
.end method

.method public b()Lcom/facebook/widget/tiles/a;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/orca/photos/a/d;->c:Lcom/facebook/widget/tiles/a;

    return-object v0
.end method
