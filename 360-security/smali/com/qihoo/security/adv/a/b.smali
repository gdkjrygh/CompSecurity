.class public Lcom/qihoo/security/adv/a/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/adv/a/b$1;,
        Lcom/qihoo/security/adv/a/b$a;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/adv/a/b;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    .line 59
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/a/b;->b:Landroid/content/Context;

    .line 60
    return-void
.end method

.method public static a()Lcom/qihoo/security/adv/a/b;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/qihoo/security/adv/a/b;->a:Lcom/qihoo/security/adv/a/b;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/qihoo/security/adv/a/b;

    invoke-direct {v0}, Lcom/qihoo/security/adv/a/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/adv/a/b;->a:Lcom/qihoo/security/adv/a/b;

    .line 55
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/a/b;->a:Lcom/qihoo/security/adv/a/b;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/a/b;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/a/b;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/a/b;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/a/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/a/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/adv/a/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->b:Landroid/content/Context;

    return-object v0
.end method

.method private b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 106
    invoke-static {p1, p2}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    .line 107
    new-instance v2, Lcom/facebook/ads/NativeAd;

    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->b:Landroid/content/Context;

    invoke-direct {v2, v0, p2}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 108
    new-instance v0, Lcom/qihoo/security/adv/a/b$a;

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/adv/a/b$a;-><init>(Lcom/qihoo/security/adv/a/b;Lcom/facebook/ads/NativeAd;Lcom/qihoo/security/adv/AdvDataManager$AdvType;ZLjava/lang/String;Lcom/qihoo/security/adv/a/b$1;)V

    .line 109
    invoke-virtual {v2, v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/d;)V

    .line 111
    :try_start_0
    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd;->a()V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :goto_0
    return-void

    .line 113
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/d;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 266
    const/4 v1, 0x0

    .line 267
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 268
    invoke-virtual {p1}, Lcom/qihoo/security/adv/d;->b()Lcom/qihoo/security/appbox/core/c;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->b()Lcom/qihoo/security/appbox/core/c;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 271
    invoke-virtual {p1}, Lcom/qihoo/security/adv/d;->b()Lcom/qihoo/security/appbox/core/c;

    move-result-object v3

    iget-object v3, v3, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->b()Lcom/qihoo/security/appbox/core/c;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const/4 v0, 0x1

    .line 276
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 217
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 222
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/c;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    return-object v0
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    .line 84
    if-eqz v0, :cond_1

    .line 85
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/appbox/core/c;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/a/b;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    .line 96
    :cond_0
    :goto_0
    return-void

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/a/b;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/d;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 242
    invoke-virtual {p1}, Lcom/qihoo/security/adv/d;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/c;

    .line 243
    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->a()I

    move-result v3

    if-ne v3, v1, :cond_0

    .line 244
    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/qihoo/security/adv/a/b;->a(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/c;

    move-result-object v3

    .line 245
    if-eqz v3, :cond_0

    .line 246
    invoke-virtual {p1, v3}, Lcom/qihoo/security/adv/d;->a(Lcom/qihoo/security/appbox/core/c;)V

    .line 247
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/a/b;->b(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 249
    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/adv/a/b;->b(Ljava/lang/String;)V

    move v0, v1

    .line 255
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 232
    return-void
.end method
