.class public Lcom/facebook/ads/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/facebook/ads/c;

.field public static final b:Lcom/facebook/ads/c;

.field public static final c:Lcom/facebook/ads/c;

.field public static final d:Lcom/facebook/ads/c;

.field public static final e:Lcom/facebook/ads/c;

.field public static final f:Lcom/facebook/ads/c;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final g:I

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x3e8

    const-string/jumbo v2, "Network Error"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->a:Lcom/facebook/ads/c;

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x3e9

    const-string/jumbo v2, "No Fill"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->b:Lcom/facebook/ads/c;

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x3ea

    const-string/jumbo v2, "Ad was re-loaded too frequently"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->c:Lcom/facebook/ads/c;

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x7d0

    const-string/jumbo v2, "Server Error"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->d:Lcom/facebook/ads/c;

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x7d1

    const-string/jumbo v2, "Internal Error"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->e:Lcom/facebook/ads/c;

    new-instance v0, Lcom/facebook/ads/c;

    const/16 v1, 0x7d2

    const-string/jumbo v2, "Native ad failed to load due to missing properties"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/ads/c;->f:Lcom/facebook/ads/c;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/facebook/ads/internal/util/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo p2, "unknown error"

    :cond_0
    iput p1, p0, Lcom/facebook/ads/c;->g:I

    iput-object p2, p0, Lcom/facebook/ads/c;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/facebook/ads/c;->g:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/c;->h:Ljava/lang/String;

    return-object v0
.end method
