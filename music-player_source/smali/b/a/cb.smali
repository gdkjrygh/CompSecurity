.class public Lb/a/cb;
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
.field public a:Ljava/util/Map;

.field public b:I

.field public c:Ljava/lang/String;

.field private j:B


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v10, 0x8

    const/4 v3, 0x0

    const/16 v9, 0xb

    const/4 v8, 0x1

    new-instance v0, Lb/a/gs;

    const-string v1, "Imprint"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/cb;->e:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "property"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v8}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/cb;->f:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "version"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v10, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/cb;->g:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "checksum"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v9, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/cb;->h:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/cb;->i:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/cd;

    invoke-direct {v2, v3}, Lb/a/cd;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/cb;->i:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/cf;

    invoke-direct {v2, v3}, Lb/a/cf;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/cg;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/cg;->a:Lb/a/cg;

    new-instance v2, Lb/a/fz;

    const-string v3, "property"

    new-instance v4, Lb/a/gc;

    new-instance v5, Lb/a/ga;

    invoke-direct {v5, v9}, Lb/a/ga;-><init>(B)V

    new-instance v6, Lb/a/gd;

    const-class v7, Lb/a/ch;

    invoke-direct {v6, v7}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6}, Lb/a/gc;-><init>(Lb/a/ga;Lb/a/ga;)V

    invoke-direct {v2, v3, v8, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/cg;->b:Lb/a/cg;

    new-instance v2, Lb/a/fz;

    const-string v3, "version"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v10}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v8, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/cg;->c:Lb/a/cg;

    new-instance v2, Lb/a/fz;

    const-string v3, "checksum"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v9}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v8, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/cb;->d:Ljava/util/Map;

    const-class v0, Lb/a/cb;

    sget-object v1, Lb/a/cb;->d:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lb/a/cb;->j:B

    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method public static h()V
    .locals 0

    return-void
.end method

.method static synthetic j()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/cb;->e:Lb/a/gs;

    return-object v0
.end method

.method static synthetic k()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/cb;->f:Lb/a/gk;

    return-object v0
.end method

.method static synthetic l()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/cb;->g:Lb/a/gk;

    return-object v0
.end method

.method static synthetic m()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/cb;->h:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lb/a/cb;
    .locals 0

    iput p1, p0, Lb/a/cb;->b:I

    invoke-virtual {p0}, Lb/a/cb;->f()V

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lb/a/cb;
    .locals 0

    iput-object p1, p0, Lb/a/cb;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lb/a/cb;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/cb;->i:Ljava/util/Map;

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

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/cb;->i:Ljava/util/Map;

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

    iget-object v0, p0, Lb/a/cb;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lb/a/cb;->b:I

    return v0
.end method

.method public final e()Z
    .locals 2

    iget-byte v0, p0, Lb/a/cb;->j:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/a/fk;->a(BI)Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-byte v0, p0, Lb/a/cb;->j:B

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lb/a/cb;->j:B

    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/a/cb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, Lb/a/cb;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'property\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/cb;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lb/a/cb;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'checksum\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/cb;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Imprint("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "property:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/cb;->a:Ljava/util/Map;

    if-nez v1, :cond_0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb/a/cb;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "checksum:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/cb;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lb/a/cb;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lb/a/cb;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method
