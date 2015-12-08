.class public final enum Lb/a/dq;
.super Ljava/lang/Enum;

# interfaces
.implements Lb/a/fr;


# static fields
.field public static final enum a:Lb/a/dq;

.field public static final enum b:Lb/a/dq;

.field private static final c:Ljava/util/Map;

.field private static final synthetic f:[Lb/a/dq;


# instance fields
.field private final d:S

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    new-instance v0, Lb/a/dq;

    const-string v1, "PAGE_NAME"

    const-string v2, "page_name"

    invoke-direct {v0, v1, v4, v3, v2}, Lb/a/dq;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/dq;->a:Lb/a/dq;

    new-instance v0, Lb/a/dq;

    const-string v1, "DURATION"

    const-string v2, "duration"

    invoke-direct {v0, v1, v3, v5, v2}, Lb/a/dq;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/dq;->b:Lb/a/dq;

    new-array v0, v5, [Lb/a/dq;

    sget-object v1, Lb/a/dq;->a:Lb/a/dq;

    aput-object v1, v0, v4

    sget-object v1, Lb/a/dq;->b:Lb/a/dq;

    aput-object v1, v0, v3

    sput-object v0, Lb/a/dq;->f:[Lb/a/dq;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/dq;->c:Ljava/util/Map;

    const-class v0, Lb/a/dq;

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

    check-cast v0, Lb/a/dq;

    sget-object v2, Lb/a/dq;->c:Ljava/util/Map;

    iget-object v3, v0, Lb/a/dq;->e:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lb/a/dq;->d:S

    iput-object p4, p0, Lb/a/dq;->e:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/dq;
    .locals 1

    const-class v0, Lb/a/dq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/dq;

    return-object v0
.end method

.method public static values()[Lb/a/dq;
    .locals 1

    sget-object v0, Lb/a/dq;->f:[Lb/a/dq;

    invoke-virtual {v0}, [Lb/a/dq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/dq;

    return-object v0
.end method


# virtual methods
.method public final a()S
    .locals 1

    iget-short v0, p0, Lb/a/dq;->d:S

    return v0
.end method
