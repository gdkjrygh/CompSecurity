.class public final enum Lb/a/ey;
.super Ljava/lang/Enum;

# interfaces
.implements Lb/a/fr;


# static fields
.field public static final enum a:Lb/a/ey;

.field public static final enum b:Lb/a/ey;

.field public static final enum c:Lb/a/ey;

.field public static final enum d:Lb/a/ey;

.field public static final enum e:Lb/a/ey;

.field public static final enum f:Lb/a/ey;

.field public static final enum g:Lb/a/ey;

.field public static final enum h:Lb/a/ey;

.field public static final enum i:Lb/a/ey;

.field public static final enum j:Lb/a/ey;

.field public static final enum k:Lb/a/ey;

.field private static final l:Ljava/util/Map;

.field private static final synthetic o:[Lb/a/ey;


# instance fields
.field private final m:S

.field private final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v9, 0x5

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    new-instance v0, Lb/a/ey;

    const-string v1, "CLIENT_STATS"

    const/4 v2, 0x0

    const-string v3, "client_stats"

    invoke-direct {v0, v1, v2, v5, v3}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->a:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "APP_INFO"

    const-string v2, "app_info"

    invoke-direct {v0, v1, v5, v6, v2}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->b:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "DEVICE_INFO"

    const-string v2, "device_info"

    invoke-direct {v0, v1, v6, v7, v2}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->c:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "MISC_INFO"

    const-string v2, "misc_info"

    invoke-direct {v0, v1, v7, v8, v2}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->d:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "ACTIVATE_MSG"

    const-string v2, "activate_msg"

    invoke-direct {v0, v1, v8, v9, v2}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->e:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "INSTANT_MSGS"

    const/4 v2, 0x6

    const-string v3, "instant_msgs"

    invoke-direct {v0, v1, v9, v2, v3}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->f:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "SESSIONS"

    const/4 v2, 0x6

    const/4 v3, 0x7

    const-string v4, "sessions"

    invoke-direct {v0, v1, v2, v3, v4}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->g:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "IMPRINT"

    const/4 v2, 0x7

    const/16 v3, 0x8

    const-string v4, "imprint"

    invoke-direct {v0, v1, v2, v3, v4}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->h:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "ID_TRACKING"

    const/16 v2, 0x8

    const/16 v3, 0x9

    const-string v4, "id_tracking"

    invoke-direct {v0, v1, v2, v3, v4}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->i:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "ACTIVE_USER"

    const/16 v2, 0x9

    const/16 v3, 0xa

    const-string v4, "active_user"

    invoke-direct {v0, v1, v2, v3, v4}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->j:Lb/a/ey;

    new-instance v0, Lb/a/ey;

    const-string v1, "CONTROL_POLICY"

    const/16 v2, 0xa

    const/16 v3, 0xb

    const-string v4, "control_policy"

    invoke-direct {v0, v1, v2, v3, v4}, Lb/a/ey;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    sput-object v0, Lb/a/ey;->k:Lb/a/ey;

    const/16 v0, 0xb

    new-array v0, v0, [Lb/a/ey;

    const/4 v1, 0x0

    sget-object v2, Lb/a/ey;->a:Lb/a/ey;

    aput-object v2, v0, v1

    sget-object v1, Lb/a/ey;->b:Lb/a/ey;

    aput-object v1, v0, v5

    sget-object v1, Lb/a/ey;->c:Lb/a/ey;

    aput-object v1, v0, v6

    sget-object v1, Lb/a/ey;->d:Lb/a/ey;

    aput-object v1, v0, v7

    sget-object v1, Lb/a/ey;->e:Lb/a/ey;

    aput-object v1, v0, v8

    sget-object v1, Lb/a/ey;->f:Lb/a/ey;

    aput-object v1, v0, v9

    const/4 v1, 0x6

    sget-object v2, Lb/a/ey;->g:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lb/a/ey;->h:Lb/a/ey;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lb/a/ey;->i:Lb/a/ey;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lb/a/ey;->j:Lb/a/ey;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lb/a/ey;->k:Lb/a/ey;

    aput-object v2, v0, v1

    sput-object v0, Lb/a/ey;->o:[Lb/a/ey;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/ey;->l:Ljava/util/Map;

    const-class v0, Lb/a/ey;

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

    check-cast v0, Lb/a/ey;

    sget-object v2, Lb/a/ey;->l:Ljava/util/Map;

    iget-object v3, v0, Lb/a/ey;->n:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lb/a/ey;->m:S

    iput-object p4, p0, Lb/a/ey;->n:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/ey;
    .locals 1

    const-class v0, Lb/a/ey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/ey;

    return-object v0
.end method

.method public static values()[Lb/a/ey;
    .locals 1

    sget-object v0, Lb/a/ey;->o:[Lb/a/ey;

    invoke-virtual {v0}, [Lb/a/ey;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/ey;

    return-object v0
.end method


# virtual methods
.method public final a()S
    .locals 1

    iget-short v0, p0, Lb/a/ey;->m:S

    return v0
.end method
