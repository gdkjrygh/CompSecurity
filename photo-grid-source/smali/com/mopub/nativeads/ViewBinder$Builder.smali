.class public final Lcom/mopub/nativeads/ViewBinder$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->g:Ljava/util/Map;

    .line 20
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->a:I

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->g:Ljava/util/Map;

    .line 22
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->a:I

    return v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->b:I

    return v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->c:I

    return v0
.end method

.method static synthetic d(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->d:I

    return v0
.end method

.method static synthetic e(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->e:I

    return v0
.end method

.method static synthetic f(Lcom/mopub/nativeads/ViewBinder$Builder;)I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->f:I

    return v0
.end method

.method static synthetic g(Lcom/mopub/nativeads/ViewBinder$Builder;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->g:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final addExtra(Ljava/lang/String;I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->g:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    return-object p0
.end method

.method public final addExtras(Ljava/util/Map;)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/mopub/nativeads/ViewBinder$Builder;"
        }
    .end annotation

    .prologue
    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->g:Ljava/util/Map;

    .line 57
    return-object p0
.end method

.method public final build()Lcom/mopub/nativeads/ViewBinder;
    .locals 2

    .prologue
    .line 68
    new-instance v0, Lcom/mopub/nativeads/ViewBinder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/nativeads/ViewBinder;-><init>(Lcom/mopub/nativeads/ViewBinder$Builder;B)V

    return-object v0
.end method

.method public final callToActionId(I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 0

    .prologue
    .line 38
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->d:I

    .line 39
    return-object p0
.end method

.method public final iconImageId(I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 0

    .prologue
    .line 50
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->f:I

    .line 51
    return-object p0
.end method

.method public final mainImageId(I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 0

    .prologue
    .line 44
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->e:I

    .line 45
    return-object p0
.end method

.method public final textId(I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->c:I

    .line 33
    return-object p0
.end method

.method public final titleId(I)Lcom/mopub/nativeads/ViewBinder$Builder;
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/mopub/nativeads/ViewBinder$Builder;->b:I

    .line 27
    return-object p0
.end method
