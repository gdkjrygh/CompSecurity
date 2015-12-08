.class public Lb/a/eh;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final h:Ljava/util/Map;

.field private static final i:Lb/a/gs;

.field private static final j:Lb/a/gk;

.field private static final k:Lb/a/gk;

.field private static final l:Lb/a/gk;

.field private static final m:Lb/a/gk;

.field private static final n:Lb/a/gk;

.field private static final o:Lb/a/gk;

.field private static final p:Lb/a/gk;

.field private static final q:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:J

.field public e:Ljava/util/List;

.field public f:Ljava/util/List;

.field public g:Lb/a/en;

.field private r:B

.field private s:[Lb/a/em;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/16 v8, 0xb

    const/4 v4, 0x0

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/16 v5, 0xa

    new-instance v0, Lb/a/gs;

    const-string v1, "Session"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/eh;->i:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "id"

    invoke-direct {v0, v1, v8, v6}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->j:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "start_time"

    invoke-direct {v0, v1, v5, v7}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->k:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "end_time"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v5, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->l:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "duration"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v5, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->m:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "pages"

    const/16 v2, 0xf

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->n:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "locations"

    const/16 v2, 0xf

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->o:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "traffic"

    const/16 v2, 0xc

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/eh;->p:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/eh;->q:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/ej;

    invoke-direct {v2, v4}, Lb/a/ej;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/eh;->q:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/el;

    invoke-direct {v2, v4}, Lb/a/el;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/em;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/em;->a:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "id"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v8}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->b:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "start_time"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->c:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "end_time"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->d:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "duration"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v5}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->e:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "pages"

    new-instance v4, Lb/a/gb;

    new-instance v5, Lb/a/gd;

    const-class v6, Lb/a/dl;

    invoke-direct {v5, v6}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v4, v5}, Lb/a/gb;-><init>(Lb/a/ga;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->f:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "locations"

    new-instance v4, Lb/a/gb;

    new-instance v5, Lb/a/gd;

    const-class v6, Lb/a/cz;

    invoke-direct {v5, v6}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v4, v5}, Lb/a/gb;-><init>(Lb/a/ga;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/em;->g:Lb/a/em;

    new-instance v2, Lb/a/fz;

    const-string v3, "traffic"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/en;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/eh;->h:Ljava/util/Map;

    const-class v0, Lb/a/eh;

    sget-object v1, Lb/a/eh;->h:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte v2, p0, Lb/a/eh;->r:B

    const/4 v0, 0x3

    new-array v0, v0, [Lb/a/em;

    sget-object v1, Lb/a/em;->e:Lb/a/em;

    aput-object v1, v0, v2

    const/4 v1, 0x1

    sget-object v2, Lb/a/em;->f:Lb/a/em;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lb/a/em;->g:Lb/a/em;

    aput-object v2, v0, v1

    iput-object v0, p0, Lb/a/eh;->s:[Lb/a/em;

    return-void
.end method

.method public static a()V
    .locals 0

    return-void
.end method

.method public static j()V
    .locals 0

    return-void
.end method

.method public static l()V
    .locals 0

    return-void
.end method

.method public static n()V
    .locals 0

    return-void
.end method

.method static synthetic p()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/eh;->i:Lb/a/gs;

    return-object v0
.end method

.method static synthetic q()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->j:Lb/a/gk;

    return-object v0
.end method

.method static synthetic r()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->k:Lb/a/gk;

    return-object v0
.end method

.method static synthetic s()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->l:Lb/a/gk;

    return-object v0
.end method

.method static synthetic t()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->m:Lb/a/gk;

    return-object v0
.end method

.method static synthetic u()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->n:Lb/a/gk;

    return-object v0
.end method

.method static synthetic v()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->o:Lb/a/gk;

    return-object v0
.end method

.method static synthetic w()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/eh;->p:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(J)Lb/a/eh;
    .locals 1

    iput-wide p1, p0, Lb/a/eh;->b:J

    invoke-virtual {p0}, Lb/a/eh;->c()V

    return-object p0
.end method

.method public final a(Lb/a/en;)Lb/a/eh;
    .locals 0

    iput-object p1, p0, Lb/a/eh;->g:Lb/a/en;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lb/a/eh;
    .locals 0

    iput-object p1, p0, Lb/a/eh;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Ljava/util/List;)Lb/a/eh;
    .locals 0

    iput-object p1, p0, Lb/a/eh;->e:Ljava/util/List;

    return-object p0
.end method

.method public final a(Lb/a/cz;)V
    .locals 1

    iget-object v0, p0, Lb/a/eh;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/a/eh;->f:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lb/a/eh;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/eh;->q:Ljava/util/Map;

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

.method public final b(J)Lb/a/eh;
    .locals 1

    iput-wide p1, p0, Lb/a/eh;->c:J

    invoke-virtual {p0}, Lb/a/eh;->e()V

    return-object p0
.end method

.method public final b(Ljava/util/List;)Lb/a/eh;
    .locals 0

    iput-object p1, p0, Lb/a/eh;->f:Ljava/util/List;

    return-object p0
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/eh;->q:Ljava/util/Map;

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

.method public final b()Z
    .locals 2

    iget-byte v0, p0, Lb/a/eh;->r:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final c(J)Lb/a/eh;
    .locals 1

    iput-wide p1, p0, Lb/a/eh;->d:J

    invoke-virtual {p0}, Lb/a/eh;->g()V

    return-object p0
.end method

.method public final c()V
    .locals 1

    iget-byte v0, p0, Lb/a/eh;->r:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/eh;->r:B

    return-void
.end method

.method public final d()Z
    .locals 2

    iget-byte v0, p0, Lb/a/eh;->r:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 1

    iget-byte v0, p0, Lb/a/eh;->r:B

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/eh;->r:B

    return-void
.end method

.method public final f()Z
    .locals 2

    iget-byte v0, p0, Lb/a/eh;->r:B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 1

    iget-byte v0, p0, Lb/a/eh;->r:B

    or-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/eh;->r:B

    return-void
.end method

.method public final h()I
    .locals 1

    iget-object v0, p0, Lb/a/eh;->e:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lb/a/eh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lb/a/eh;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lb/a/eh;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lb/a/eh;->g:Lb/a/en;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lb/a/eh;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'id\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/eh;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lb/a/eh;->g:Lb/a/en;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/a/eh;->g:Lb/a/en;

    invoke-static {}, Lb/a/en;->e()V

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Session("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/eh;->a:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "start_time:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lb/a/eh;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "end_time:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lb/a/eh;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "duration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lb/a/eh;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb/a/eh;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "pages:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/eh;->e:Ljava/util/List;

    if-nez v1, :cond_4

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    :goto_1
    invoke-virtual {p0}, Lb/a/eh;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "locations:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/eh;->f:Ljava/util/List;

    if-nez v1, :cond_5

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_2
    invoke-virtual {p0}, Lb/a/eh;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "traffic:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/eh;->g:Lb/a/en;

    if-nez v1, :cond_6

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_3
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v1, p0, Lb/a/eh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_4
    iget-object v1, p0, Lb/a/eh;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lb/a/eh;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    iget-object v1, p0, Lb/a/eh;->g:Lb/a/en;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3
.end method
