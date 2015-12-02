.class public Lcom/facebook/zero/a/b;
.super Ljava/lang/Object;
.source "ZeroNetworkTypes.java"


# static fields
.field public static final a:Lcom/facebook/zero/server/c;

.field public static final b:Lcom/facebook/zero/server/c;

.field public static final c:Lcom/facebook/zero/server/c;

.field public static final d:Lcom/facebook/zero/server/c;

.field public static final e:Lcom/facebook/zero/server/c;

.field public static final f:Lcom/facebook/zero/server/c;

.field public static final g:Lcom/facebook/zero/server/c;

.field public static final h:Lcom/facebook/zero/server/c;

.field public static final i:Lcom/facebook/zero/server/c;

.field public static final j:Lcom/facebook/zero/server/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 16
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "none"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->a:Lcom/facebook/zero/server/c;

    .line 17
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "bluetooth"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->b:Lcom/facebook/zero/server/c;

    .line 18
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "ethernet"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->c:Lcom/facebook/zero/server/c;

    .line 19
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "mobile"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->d:Lcom/facebook/zero/server/c;

    .line 20
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "mobile_dun"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->e:Lcom/facebook/zero/server/c;

    .line 21
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "mobile_hipri"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->f:Lcom/facebook/zero/server/c;

    .line 22
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "mobile_mms"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->g:Lcom/facebook/zero/server/c;

    .line 23
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "mobile_supl"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->h:Lcom/facebook/zero/server/c;

    .line 24
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "wifi"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->i:Lcom/facebook/zero/server/c;

    .line 25
    new-instance v0, Lcom/facebook/zero/server/c;

    const-string v1, "wimax"

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/zero/a/b;->j:Lcom/facebook/zero/server/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
