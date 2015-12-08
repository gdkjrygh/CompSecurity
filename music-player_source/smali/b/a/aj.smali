.class public Lb/a/aj;
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
.field public a:Lb/a/ct;

.field private f:[Lb/a/ao;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v4, 0x0

    new-instance v0, Lb/a/gs;

    const-string v1, "ControlPolicy"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/aj;->c:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "latent"

    const/16 v2, 0xc

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/aj;->d:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/aj;->e:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/al;

    invoke-direct {v2, v4}, Lb/a/al;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/aj;->e:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/an;

    invoke-direct {v2, v4}, Lb/a/an;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/ao;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/ao;->a:Lb/a/ao;

    new-instance v2, Lb/a/fz;

    const-string v3, "latent"

    const/4 v4, 0x2

    new-instance v5, Lb/a/gd;

    const-class v6, Lb/a/ct;

    invoke-direct {v5, v6}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v4, v5}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/aj;->b:Ljava/util/Map;

    const-class v0, Lb/a/aj;

    sget-object v1, Lb/a/aj;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Lb/a/ao;

    const/4 v1, 0x0

    sget-object v2, Lb/a/ao;->a:Lb/a/ao;

    aput-object v2, v0, v1

    iput-object v0, p0, Lb/a/aj;->f:[Lb/a/ao;

    return-void
.end method

.method public static b()V
    .locals 0

    return-void
.end method

.method static synthetic d()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/aj;->c:Lb/a/gs;

    return-object v0
.end method

.method static synthetic e()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/aj;->d:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(Lb/a/ct;)Lb/a/aj;
    .locals 0

    iput-object p1, p0, Lb/a/aj;->a:Lb/a/ct;

    return-object p0
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/aj;->e:Ljava/util/Map;

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
    .locals 1

    iget-object v0, p0, Lb/a/aj;->a:Lb/a/ct;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/aj;->e:Ljava/util/Map;

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

.method public final c()V
    .locals 1

    iget-object v0, p0, Lb/a/aj;->a:Lb/a/ct;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/a/aj;->a:Lb/a/ct;

    invoke-static {}, Lb/a/ct;->e()V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ControlPolicy("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/aj;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "latent:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/aj;->a:Lb/a/ct;

    if-nez v1, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    :goto_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lb/a/aj;->a:Lb/a/ct;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
