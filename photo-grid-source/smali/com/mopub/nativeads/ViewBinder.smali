.class public Lcom/mopub/nativeads/ViewBinder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:I

.field final b:I

.field final c:I

.field final d:I

.field final e:I

.field final f:I

.field final g:Ljava/util/Map;
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
.method private constructor <init>(Lcom/mopub/nativeads/ViewBinder$Builder;)V
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->a(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->a:I

    .line 82
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->b(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->b:I

    .line 83
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->c(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->c:I

    .line 84
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->d(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->d:I

    .line 85
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->e(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->e:I

    .line 86
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->f(Lcom/mopub/nativeads/ViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/ViewBinder;->f:I

    .line 87
    invoke-static {p1}, Lcom/mopub/nativeads/ViewBinder$Builder;->g(Lcom/mopub/nativeads/ViewBinder$Builder;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/ViewBinder;->g:Ljava/util/Map;

    .line 88
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/nativeads/ViewBinder$Builder;B)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/ViewBinder;-><init>(Lcom/mopub/nativeads/ViewBinder$Builder;)V

    return-void
.end method
