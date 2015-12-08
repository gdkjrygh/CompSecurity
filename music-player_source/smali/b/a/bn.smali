.class public final enum Lb/a/bn;
.super Ljava/lang/Enum;

# interfaces
.implements Lb/a/fr;


# static fields
.field public static final enum a:Lb/a/bn;

.field public static final enum b:Lb/a/bn;

.field public static final enum c:Lb/a/bn;

.field public static final enum d:Lb/a/bn;

.field private static final e:Ljava/util/Map;

.field private static final synthetic h:[Lb/a/bn;


# instance fields
.field private final f:S

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x0

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    new-instance v0, Lb/a/bn;

    const-string v1, "DOMAIN"

    const-string v2, "domain"

    invoke-direct {v0, v1, v6, v3, v2}, Lb/a/bn;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/bn;->a:Lb/a/bn;

    new-instance v0, Lb/a/bn;

    const-string v1, "OLD_ID"

    const-string v2, "old_id"

    invoke-direct {v0, v1, v3, v4, v2}, Lb/a/bn;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/bn;->b:Lb/a/bn;

    new-instance v0, Lb/a/bn;

    const-string v1, "NEW_ID"

    const-string v2, "new_id"

    invoke-direct {v0, v1, v4, v5, v2}, Lb/a/bn;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/bn;->c:Lb/a/bn;

    new-instance v0, Lb/a/bn;

    const-string v1, "TS"

    const-string v2, "ts"

    invoke-direct {v0, v1, v5, v7, v2}, Lb/a/bn;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/bn;->d:Lb/a/bn;

    new-array v0, v7, [Lb/a/bn;

    sget-object v1, Lb/a/bn;->a:Lb/a/bn;

    aput-object v1, v0, v6

    sget-object v1, Lb/a/bn;->b:Lb/a/bn;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/bn;->c:Lb/a/bn;

    aput-object v1, v0, v4

    sget-object v1, Lb/a/bn;->d:Lb/a/bn;

    aput-object v1, v0, v5

    sput-object v0, Lb/a/bn;->h:[Lb/a/bn;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/bn;->e:Ljava/util/Map;

    const-class v0, Lb/a/bn;

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

    check-cast v0, Lb/a/bn;

    sget-object v2, Lb/a/bn;->e:Ljava/util/Map;

    iget-object v3, v0, Lb/a/bn;->g:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lb/a/bn;->f:S

    iput-object p4, p0, Lb/a/bn;->g:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/bn;
    .locals 1

    const-class v0, Lb/a/bn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/bn;

    return-object v0
.end method

.method public static values()[Lb/a/bn;
    .locals 1

    sget-object v0, Lb/a/bn;->h:[Lb/a/bn;

    invoke-virtual {v0}, [Lb/a/bn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/bn;

    return-object v0
.end method


# virtual methods
.method public final a()S
    .locals 1

    iget-short v0, p0, Lb/a/bn;->f:S

    return v0
.end method
