.class public Lb/a/ct;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final c:Ljava/util/Map;

.field private static final d:Lb/a/gs;

.field private static final e:Lb/a/gk;

.field private static final f:Lb/a/gk;

.field private static final g:Ljava/util/Map;


# instance fields
.field public a:I

.field public b:J

.field private h:B


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v7, 0xa

    const/16 v6, 0x8

    const/4 v3, 0x0

    const/4 v5, 0x1

    new-instance v0, Lb/a/gs;

    const-string v1, "Latent"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/ct;->d:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "latency"

    invoke-direct {v0, v1, v6, v5}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/ct;->e:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "interval"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v7, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/ct;->f:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/ct;->g:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/cv;

    invoke-direct {v2, v3}, Lb/a/cv;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/ct;->g:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/cx;

    invoke-direct {v2, v3}, Lb/a/cx;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/cy;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/cy;->a:Lb/a/cy;

    new-instance v2, Lb/a/fz;

    const-string v3, "latency"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v5, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/cy;->b:Lb/a/cy;

    new-instance v2, Lb/a/fz;

    const-string v3, "interval"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v7}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v5, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/ct;->c:Ljava/util/Map;

    const-class v0, Lb/a/ct;

    sget-object v1, Lb/a/ct;->c:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lb/a/ct;->h:B

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Lb/a/ct;-><init>()V

    iput p1, p0, Lb/a/ct;->a:I

    invoke-virtual {p0}, Lb/a/ct;->b()V

    iput-wide p2, p0, Lb/a/ct;->b:J

    invoke-virtual {p0}, Lb/a/ct;->d()V

    return-void
.end method

.method public static e()V
    .locals 0

    return-void
.end method

.method static synthetic f()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/ct;->d:Lb/a/gs;

    return-object v0
.end method

.method static synthetic g()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/ct;->e:Lb/a/gk;

    return-object v0
.end method

.method static synthetic h()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/ct;->f:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/ct;->g:Ljava/util/Map;

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

    iget-byte v0, p0, Lb/a/ct;->h:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    iget-byte v0, p0, Lb/a/ct;->h:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/ct;->h:B

    return-void
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/ct;->g:Ljava/util/Map;

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

.method public final c()Z
    .locals 2

    iget-byte v0, p0, Lb/a/ct;->h:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    iget-byte v0, p0, Lb/a/ct;->h:B

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/ct;->h:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Latent("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "latency:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/ct;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "interval:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lb/a/ct;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
