.class Ltwitter4j/internal/json/ResponseListImpl;
.super Ljava/util/ArrayList;
.source "ResponseListImpl.java"

# interfaces
.implements Ltwitter4j/ResponseList;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/ArrayList",
        "<TT;>;",
        "Ltwitter4j/ResponseList",
        "<TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x4e5cd1029e2727a0L


# instance fields
.field private transient accessLevel:I

.field private transient featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

.field private transient rateLimitStatus:Ltwitter4j/RateLimitStatus;


# direct methods
.method constructor <init>(ILtwitter4j/internal/http/HttpResponse;)V
    .locals 1
    .param p1, "size"    # I
    .param p2, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 43
    invoke-direct {p0, p2}, Ltwitter4j/internal/json/ResponseListImpl;->init(Ltwitter4j/internal/http/HttpResponse;)V

    .line 44
    return-void
.end method

.method constructor <init>(Ltwitter4j/RateLimitStatus;Ltwitter4j/RateLimitStatus;I)V
    .locals 1
    .param p1, "rateLimitStatus"    # Ltwitter4j/RateLimitStatus;
    .param p2, "featureSpecificRateLimitStatus"    # Ltwitter4j/RateLimitStatus;
    .param p3, "accessLevel"    # I

    .prologue
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    const/4 v0, 0x0

    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 47
    iput-object p1, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 48
    iput-object p2, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 49
    iput p3, p0, Ltwitter4j/internal/json/ResponseListImpl;->accessLevel:I

    .line 50
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;)V
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 38
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/ResponseListImpl;->init(Ltwitter4j/internal/http/HttpResponse;)V

    .line 39
    return-void
.end method

.method private init(Ltwitter4j/internal/http/HttpResponse;)V
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .line 52
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    invoke-static {p1}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 53
    invoke-static {p1}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createFeatureSpecificRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    .line 54
    invoke-static {p1}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->toAccessLevel(Ltwitter4j/internal/http/HttpResponse;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->accessLevel:I

    .line 55
    return-void
.end method


# virtual methods
.method public getAccessLevel()I
    .locals 1

    .prologue
    .line 75
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    iget v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->accessLevel:I

    return v0
.end method

.method public getFeatureSpecificRateLimitStatus()Ltwitter4j/RateLimitStatus;
    .locals 1

    .prologue
    .line 68
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    iget-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->featureSpecificRateLimitStatus:Ltwitter4j/RateLimitStatus;

    return-object v0
.end method

.method public getRateLimitStatus()Ltwitter4j/RateLimitStatus;
    .locals 1

    .prologue
    .line 61
    .local p0, "this":Ltwitter4j/internal/json/ResponseListImpl;, "Ltwitter4j/internal/json/ResponseListImpl<TT;>;"
    iget-object v0, p0, Ltwitter4j/internal/json/ResponseListImpl;->rateLimitStatus:Ltwitter4j/RateLimitStatus;

    return-object v0
.end method
