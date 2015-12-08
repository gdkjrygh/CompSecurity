.class public Lb/a/x;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final k:Ljava/util/Map;

.field private static final l:Lb/a/gs;

.field private static final m:Lb/a/gk;

.field private static final n:Lb/a/gk;

.field private static final o:Lb/a/gk;

.field private static final p:Lb/a/gk;

.field private static final q:Lb/a/gk;

.field private static final r:Lb/a/gk;

.field private static final s:Lb/a/gk;

.field private static final t:Lb/a/gk;

.field private static final u:Lb/a/gk;

.field private static final v:Lb/a/gk;

.field private static final w:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lb/a/eg;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I

.field private x:B

.field private y:[Lb/a/ac;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v3, 0x0

    const/4 v9, 0x1

    const/16 v8, 0x8

    const/4 v7, 0x2

    const/16 v6, 0xb

    new-instance v0, Lb/a/gs;

    const-string v1, "AppInfo"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/x;->l:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "key"

    invoke-direct {v0, v1, v6, v9}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->m:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "version"

    invoke-direct {v0, v1, v6, v7}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->n:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "version_index"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v8, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->o:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "package_name"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v6, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->p:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "sdk_type"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v8, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->q:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "sdk_version"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v6, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->r:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "channel"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v6, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->s:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "wrapper_type"

    invoke-direct {v0, v1, v6, v8}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->t:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "wrapper_version"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v6, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->u:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "vertical_type"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v8, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/x;->v:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/x;->w:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/z;

    invoke-direct {v2, v3}, Lb/a/z;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/x;->w:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/ab;

    invoke-direct {v2, v3}, Lb/a/ab;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/ac;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/ac;->a:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "key"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v9, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->b:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "version"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->c:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "version_index"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v8}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->d:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "package_name"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->e:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "sdk_type"

    new-instance v4, Lb/a/fy;

    const-class v5, Lb/a/eg;

    invoke-direct {v4, v5}, Lb/a/fy;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v9, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->f:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "sdk_version"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v9, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->g:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "channel"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v9, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->h:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "wrapper_type"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->i:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "wrapper_version"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ac;->j:Lb/a/ac;

    new-instance v2, Lb/a/fz;

    const-string v3, "vertical_type"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v8}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/x;->k:Ljava/util/Map;

    const-class v0, Lb/a/x;

    sget-object v1, Lb/a/x;->k:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte v2, p0, Lb/a/x;->x:B

    const/4 v0, 0x6

    new-array v0, v0, [Lb/a/ac;

    sget-object v1, Lb/a/ac;->b:Lb/a/ac;

    aput-object v1, v0, v2

    const/4 v1, 0x1

    sget-object v2, Lb/a/ac;->c:Lb/a/ac;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lb/a/ac;->d:Lb/a/ac;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lb/a/ac;->h:Lb/a/ac;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lb/a/ac;->i:Lb/a/ac;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lb/a/ac;->j:Lb/a/ac;

    aput-object v2, v0, v1

    iput-object v0, p0, Lb/a/x;->y:[Lb/a/ac;

    return-void
.end method

.method static synthetic A()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->u:Lb/a/gk;

    return-object v0
.end method

.method static synthetic B()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->v:Lb/a/gk;

    return-object v0
.end method

.method public static a()V
    .locals 0

    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method public static g()V
    .locals 0

    return-void
.end method

.method public static h()V
    .locals 0

    return-void
.end method

.method public static i()V
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

.method static synthetic r()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/x;->l:Lb/a/gs;

    return-object v0
.end method

.method static synthetic s()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->m:Lb/a/gk;

    return-object v0
.end method

.method static synthetic t()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->n:Lb/a/gk;

    return-object v0
.end method

.method static synthetic u()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->o:Lb/a/gk;

    return-object v0
.end method

.method static synthetic v()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->p:Lb/a/gk;

    return-object v0
.end method

.method static synthetic w()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->q:Lb/a/gk;

    return-object v0
.end method

.method static synthetic x()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->r:Lb/a/gk;

    return-object v0
.end method

.method static synthetic y()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->s:Lb/a/gk;

    return-object v0
.end method

.method static synthetic z()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/x;->t:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lb/a/x;
    .locals 0

    iput p1, p0, Lb/a/x;->c:I

    invoke-virtual {p0}, Lb/a/x;->e()V

    return-object p0
.end method

.method public final a(Lb/a/eg;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->e:Lb/a/eg;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/x;->w:Ljava/util/Map;

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

.method public final b(I)Lb/a/x;
    .locals 0

    iput p1, p0, Lb/a/x;->j:I

    invoke-virtual {p0}, Lb/a/x;->p()V

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/x;->w:Ljava/util/Map;

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
    .locals 1

    iget-object v0, p0, Lb/a/x;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final d()Z
    .locals 2

    iget-byte v0, p0, Lb/a/x;->x:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final e()V
    .locals 1

    iget-byte v0, p0, Lb/a/x;->x:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/x;->x:B

    return-void
.end method

.method public final f(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->h:Ljava/lang/String;

    return-object p0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lb/a/x;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g(Ljava/lang/String;)Lb/a/x;
    .locals 0

    iput-object p1, p0, Lb/a/x;->i:Ljava/lang/String;

    return-object p0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lb/a/x;->h:Ljava/lang/String;

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

    iget-object v0, p0, Lb/a/x;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 2

    iget-byte v0, p0, Lb/a/x;->x:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final p()V
    .locals 1

    iget-byte v0, p0, Lb/a/x;->x:B

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/x;->x:B

    return-void
.end method

.method public final q()V
    .locals 3

    iget-object v0, p0, Lb/a/x;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'key\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/x;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lb/a/x;->e:Lb/a/eg;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'sdk_type\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/x;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lb/a/x;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'sdk_version\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/x;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lb/a/x;->g:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'channel\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/x;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AppInfo("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "key:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->a:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p0}, Lb/a/x;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->b:Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    :goto_1
    invoke-virtual {p0}, Lb/a/x;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "version_index:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/x;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lb/a/x;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "package_name:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->d:Ljava/lang/String;

    if-nez v1, :cond_8

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_2
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "sdk_type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->e:Lb/a/eg;

    if-nez v1, :cond_9

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "sdk_version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->f:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "channel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->g:Ljava/lang/String;

    if-nez v1, :cond_b

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    invoke-virtual {p0}, Lb/a/x;->k()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "wrapper_type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->h:Ljava/lang/String;

    if-nez v1, :cond_c

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_6
    invoke-virtual {p0}, Lb/a/x;->m()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "wrapper_version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/x;->i:Ljava/lang/String;

    if-nez v1, :cond_d

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    :goto_7
    invoke-virtual {p0}, Lb/a/x;->o()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "vertical_type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/x;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_6
    iget-object v1, p0, Lb/a/x;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_7
    iget-object v1, p0, Lb/a/x;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :cond_8
    iget-object v1, p0, Lb/a/x;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :cond_9
    iget-object v1, p0, Lb/a/x;->e:Lb/a/eg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    :cond_a
    iget-object v1, p0, Lb/a/x;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_b
    iget-object v1, p0, Lb/a/x;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_c
    iget-object v1, p0, Lb/a/x;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_d
    iget-object v1, p0, Lb/a/x;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7
.end method
