.class public final enum Lb/a/ai;
.super Ljava/lang/Enum;

# interfaces
.implements Lb/a/fr;


# static fields
.field public static final enum a:Lb/a/ai;

.field public static final enum b:Lb/a/ai;

.field public static final enum c:Lb/a/ai;

.field private static final d:Ljava/util/Map;

.field private static final synthetic g:[Lb/a/ai;


# instance fields
.field private final e:S

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x0

    const/4 v4, 0x2

    const/4 v3, 0x1

    new-instance v0, Lb/a/ai;

    const-string v1, "SUCCESSFUL_REQUESTS"

    const-string v2, "successful_requests"

    invoke-direct {v0, v1, v5, v3, v2}, Lb/a/ai;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ai;->a:Lb/a/ai;

    new-instance v0, Lb/a/ai;

    const-string v1, "FAILED_REQUESTS"

    const-string v2, "failed_requests"

    invoke-direct {v0, v1, v3, v4, v2}, Lb/a/ai;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ai;->b:Lb/a/ai;

    new-instance v0, Lb/a/ai;

    const-string v1, "LAST_REQUEST_SPENT_MS"

    const-string v2, "last_request_spent_ms"

    invoke-direct {v0, v1, v4, v6, v2}, Lb/a/ai;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ai;->c:Lb/a/ai;

    new-array v0, v6, [Lb/a/ai;

    sget-object v1, Lb/a/ai;->a:Lb/a/ai;

    aput-object v1, v0, v5

    sget-object v1, Lb/a/ai;->b:Lb/a/ai;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/ai;->c:Lb/a/ai;

    aput-object v1, v0, v4

    sput-object v0, Lb/a/ai;->g:[Lb/a/ai;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/ai;->d:Ljava/util/Map;

    const-class v0, Lb/a/ai;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/ai;

    sget-object v2, Lb/a/ai;->d:Ljava/util/Map;

    iget-object v3, v0, Lb/a/ai;->f:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lb/a/ai;->e:S

    iput-object p4, p0, Lb/a/ai;->f:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/ai;
    .locals 1

    const-class v0, Lb/a/ai;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/ai;

    return-object v0
.end method

.method public static values()[Lb/a/ai;
    .locals 1

    sget-object v0, Lb/a/ai;->g:[Lb/a/ai;

    invoke-virtual {v0}, [Lb/a/ai;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/ai;

    return-object v0
.end method


# virtual methods
.method public final a()S
    .locals 1

    iget-short v0, p0, Lb/a/ai;->e:S

    return v0
.end method
