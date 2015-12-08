.class public Lb/a/l;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final b:Ljava/util/Map;

.field private static final c:Lb/a/gs;

.field private static final d:Lb/a/gk;

.field private static final e:Ljava/util/Map;


# instance fields
.field public a:J

.field private f:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v6, 0xa

    const/4 v5, 0x1

    const/4 v3, 0x0

    new-instance v0, Lb/a/gs;

    const-string v1, "ActivateMsg"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/l;->c:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "ts"

    invoke-direct {v0, v1, v6, v5}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/l;->d:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/l;->e:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/n;

    invoke-direct {v2, v3}, Lb/a/n;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/l;->e:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/p;

    invoke-direct {v2, v3}, Lb/a/p;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/q;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/q;->a:Lb/a/q;

    new-instance v2, Lb/a/fz;

    const-string v3, "ts"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v5, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/l;->b:Ljava/util/Map;

    const-class v0, Lb/a/l;

    sget-object v1, Lb/a/l;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lb/a/l;->f:B

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Lb/a/l;-><init>()V

    iput-wide p1, p0, Lb/a/l;->a:J

    invoke-virtual {p0}, Lb/a/l;->b()V

    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method static synthetic d()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/l;->c:Lb/a/gs;

    return-object v0
.end method

.method static synthetic e()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/l;->d:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/l;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lb/a/gn;->s()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/gv;

    invoke-interface {v0}, Lb/a/gv;->a()Lb/a/gu;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lb/a/gu;->b(Lb/a/gn;Lb/a/fm;)V

    return-void
.end method

.method public final a()Z
    .locals 2

    iget-byte v0, p0, Lb/a/l;->f:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    iget-byte v0, p0, Lb/a/l;->f:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/l;->f:B

    return-void
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/l;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lb/a/gn;->s()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/gv;

    invoke-interface {v0}, Lb/a/gv;->a()Lb/a/gu;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lb/a/gu;->a(Lb/a/gn;Lb/a/fm;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ActivateMsg("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "ts:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lb/a/l;->a:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
