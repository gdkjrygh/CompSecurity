.class public Lb/a/ad;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final d:Ljava/util/Map;

.field private static final e:Lb/a/gs;

.field private static final f:Lb/a/gk;

.field private static final g:Lb/a/gk;

.field private static final h:Lb/a/gk;

.field private static final i:Ljava/util/Map;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field private j:B

.field private k:[Lb/a/ai;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x2

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/16 v5, 0x8

    new-instance v0, Lb/a/gs;

    const-string v1, "ClientStats"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/ad;->e:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "successful_requests"

    invoke-direct {v0, v1, v5, v6}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/ad;->f:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "failed_requests"

    invoke-direct {v0, v1, v5, v7}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/ad;->g:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "last_request_spent_ms"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v5, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/ad;->h:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/ad;->i:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/af;

    invoke-direct {v2, v3}, Lb/a/af;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/ad;->i:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/ah;

    invoke-direct {v2, v3}, Lb/a/ah;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/ai;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/ai;->a:Lb/a/ai;

    new-instance v2, Lb/a/fz;

    const-string v3, "successful_requests"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ai;->b:Lb/a/ai;

    new-instance v2, Lb/a/fz;

    const-string v3, "failed_requests"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ai;->c:Lb/a/ai;

    new-instance v2, Lb/a/fz;

    const-string v3, "last_request_spent_ms"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/ad;->d:Ljava/util/Map;

    const-class v0, Lb/a/ad;

    sget-object v1, Lb/a/ad;->d:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte v2, p0, Lb/a/ad;->j:B

    const/4 v0, 0x1

    new-array v0, v0, [Lb/a/ai;

    sget-object v1, Lb/a/ai;->c:Lb/a/ai;

    aput-object v1, v0, v2

    iput-object v0, p0, Lb/a/ad;->k:[Lb/a/ai;

    iput v2, p0, Lb/a/ad;->a:I

    iput v2, p0, Lb/a/ad;->b:I

    return-void
.end method

.method public static g()V
    .locals 0

    return-void
.end method

.method static synthetic h()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/ad;->e:Lb/a/gs;

    return-object v0
.end method

.method static synthetic i()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/ad;->f:Lb/a/gk;

    return-object v0
.end method

.method static synthetic j()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/ad;->g:Lb/a/gk;

    return-object v0
.end method

.method static synthetic k()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/ad;->h:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lb/a/ad;
    .locals 0

    iput p1, p0, Lb/a/ad;->a:I

    invoke-virtual {p0}, Lb/a/ad;->b()V

    return-object p0
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/ad;->i:Ljava/util/Map;

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

    iget-byte v0, p0, Lb/a/ad;->j:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final b(I)Lb/a/ad;
    .locals 0

    iput p1, p0, Lb/a/ad;->b:I

    invoke-virtual {p0}, Lb/a/ad;->d()V

    return-object p0
.end method

.method public final b()V
    .locals 1

    iget-byte v0, p0, Lb/a/ad;->j:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/ad;->j:B

    return-void
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/ad;->i:Ljava/util/Map;

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

.method public final c(I)Lb/a/ad;
    .locals 0

    iput p1, p0, Lb/a/ad;->c:I

    invoke-virtual {p0}, Lb/a/ad;->f()V

    return-object p0
.end method

.method public final c()Z
    .locals 2

    iget-byte v0, p0, Lb/a/ad;->j:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    iget-byte v0, p0, Lb/a/ad;->j:B

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/ad;->j:B

    return-void
.end method

.method public final e()Z
    .locals 2

    iget-byte v0, p0, Lb/a/ad;->j:B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-byte v0, p0, Lb/a/ad;->j:B

    or-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/ad;->j:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClientStats("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "successful_requests:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/ad;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "failed_requests:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/ad;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb/a/ad;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "last_request_spent_ms:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/ad;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
