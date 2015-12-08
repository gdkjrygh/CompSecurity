.class public Lb/a/et;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/fm;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final l:Ljava/util/Map;

.field private static final m:Lb/a/gs;

.field private static final n:Lb/a/gk;

.field private static final o:Lb/a/gk;

.field private static final p:Lb/a/gk;

.field private static final q:Lb/a/gk;

.field private static final r:Lb/a/gk;

.field private static final s:Lb/a/gk;

.field private static final t:Lb/a/gk;

.field private static final u:Lb/a/gk;

.field private static final v:Lb/a/gk;

.field private static final w:Lb/a/gk;

.field private static final x:Lb/a/gk;

.field private static final y:Ljava/util/Map;


# instance fields
.field public a:Lb/a/ad;

.field public b:Lb/a/x;

.field public c:Lb/a/ap;

.field public d:Lb/a/df;

.field public e:Lb/a/l;

.field public f:Ljava/util/List;

.field public g:Ljava/util/List;

.field public h:Lb/a/cb;

.field public i:Lb/a/bu;

.field public j:Lb/a/r;

.field public k:Lb/a/aj;

.field private z:[Lb/a/ey;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v5, 0xf

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/16 v3, 0xc

    new-instance v0, Lb/a/gs;

    const-string v1, "UALogEntry"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/et;->m:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "client_stats"

    invoke-direct {v0, v1, v3, v6}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->n:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "app_info"

    invoke-direct {v0, v1, v3, v7}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->o:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "device_info"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->p:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "misc_info"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->q:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "activate_msg"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->r:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "instant_msgs"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v5, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->s:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "sessions"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v5, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->t:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "imprint"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->u:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "id_tracking"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->v:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "active_user"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->w:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "control_policy"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v3, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/et;->x:Lb/a/gk;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lb/a/et;->y:Ljava/util/Map;

    const-class v1, Lb/a/gw;

    new-instance v2, Lb/a/ev;

    invoke-direct {v2, v4}, Lb/a/ev;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb/a/et;->y:Ljava/util/Map;

    const-class v1, Lb/a/gx;

    new-instance v2, Lb/a/ex;

    invoke-direct {v2, v4}, Lb/a/ex;-><init>(B)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/ey;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/ey;->a:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "client_stats"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/ad;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->b:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "app_info"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/x;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->c:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "device_info"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/ap;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->d:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "misc_info"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/df;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v6, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->e:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "activate_msg"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/l;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->f:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "instant_msgs"

    new-instance v4, Lb/a/gb;

    new-instance v5, Lb/a/gd;

    const-class v6, Lb/a/cn;

    invoke-direct {v5, v6}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v4, v5}, Lb/a/gb;-><init>(Lb/a/ga;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->g:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "sessions"

    new-instance v4, Lb/a/gb;

    new-instance v5, Lb/a/gd;

    const-class v6, Lb/a/eh;

    invoke-direct {v5, v6}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v4, v5}, Lb/a/gb;-><init>(Lb/a/ga;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->h:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "imprint"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/cb;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->i:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "id_tracking"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/bu;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->j:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "active_user"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/r;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/ey;->k:Lb/a/ey;

    new-instance v2, Lb/a/fz;

    const-string v3, "control_policy"

    new-instance v4, Lb/a/gd;

    const-class v5, Lb/a/aj;

    invoke-direct {v4, v5}, Lb/a/gd;-><init>(Ljava/lang/Class;)V

    invoke-direct {v2, v3, v7, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/et;->l:Ljava/util/Map;

    const-class v0, Lb/a/et;

    sget-object v1, Lb/a/et;->l:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x7

    new-array v0, v0, [Lb/a/ey;

    const/4 v1, 0x0

    sget-object v2, Lb/a/ey;->e:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lb/a/ey;->f:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lb/a/ey;->g:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lb/a/ey;->h:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lb/a/ey;->i:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lb/a/ey;->j:Lb/a/ey;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lb/a/ey;->k:Lb/a/ey;

    aput-object v2, v0, v1

    iput-object v0, p0, Lb/a/et;->z:[Lb/a/ey;

    return-void
.end method

.method static synthetic A()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->p:Lb/a/gk;

    return-object v0
.end method

.method static synthetic B()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->q:Lb/a/gk;

    return-object v0
.end method

.method static synthetic C()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->r:Lb/a/gk;

    return-object v0
.end method

.method static synthetic D()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->s:Lb/a/gk;

    return-object v0
.end method

.method static synthetic E()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->t:Lb/a/gk;

    return-object v0
.end method

.method static synthetic F()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->u:Lb/a/gk;

    return-object v0
.end method

.method static synthetic G()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->v:Lb/a/gk;

    return-object v0
.end method

.method static synthetic H()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->w:Lb/a/gk;

    return-object v0
.end method

.method static synthetic I()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->x:Lb/a/gk;

    return-object v0
.end method

.method public static a()V
    .locals 0

    return-void
.end method

.method public static b()V
    .locals 0

    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method public static d()V
    .locals 0

    return-void
.end method

.method public static f()V
    .locals 0

    return-void
.end method

.method public static k()V
    .locals 0

    return-void
.end method

.method public static n()V
    .locals 0

    return-void
.end method

.method public static p()V
    .locals 0

    return-void
.end method

.method public static r()V
    .locals 0

    return-void
.end method

.method public static t()V
    .locals 0

    return-void
.end method

.method public static v()V
    .locals 0

    return-void
.end method

.method static synthetic x()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/et;->m:Lb/a/gs;

    return-object v0
.end method

.method static synthetic y()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->n:Lb/a/gk;

    return-object v0
.end method

.method static synthetic z()Lb/a/gk;
    .locals 1

    sget-object v0, Lb/a/et;->o:Lb/a/gk;

    return-object v0
.end method


# virtual methods
.method public final a(Lb/a/ad;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->a:Lb/a/ad;

    return-object p0
.end method

.method public final a(Lb/a/aj;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->k:Lb/a/aj;

    return-object p0
.end method

.method public final a(Lb/a/ap;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->c:Lb/a/ap;

    return-object p0
.end method

.method public final a(Lb/a/bu;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->i:Lb/a/bu;

    return-object p0
.end method

.method public final a(Lb/a/cb;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->h:Lb/a/cb;

    return-object p0
.end method

.method public final a(Lb/a/df;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->d:Lb/a/df;

    return-object p0
.end method

.method public final a(Lb/a/l;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->e:Lb/a/l;

    return-object p0
.end method

.method public final a(Lb/a/r;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->j:Lb/a/r;

    return-object p0
.end method

.method public final a(Lb/a/x;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->b:Lb/a/x;

    return-object p0
.end method

.method public final a(Ljava/util/List;)Lb/a/et;
    .locals 0

    iput-object p1, p0, Lb/a/et;->g:Ljava/util/List;

    return-object p0
.end method

.method public final a(Lb/a/cn;)V
    .locals 1

    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lb/a/eh;)V
    .locals 1

    iget-object v0, p0, Lb/a/et;->g:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/a/et;->g:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lb/a/et;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lb/a/gn;)V
    .locals 2

    sget-object v0, Lb/a/et;->y:Ljava/util/Map;

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

    sget-object v0, Lb/a/et;->y:Ljava/util/Map;

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

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->e:Lb/a/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    return-object v0
.end method

.method public final i()Lb/a/et;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    return-object p0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb/a/et;->g:Ljava/util/List;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->h:Lb/a/cb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->i:Lb/a/bu;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->j:Lb/a/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UALogEntry("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "client_stats:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->a:Lb/a/ad;

    if-nez v1, :cond_7

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "app_info:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->b:Lb/a/x;

    if-nez v1, :cond_8

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "device_info:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->c:Lb/a/ap;

    if-nez v1, :cond_9

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "misc_info:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->d:Lb/a/df;

    if-nez v1, :cond_a

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {p0}, Lb/a/et;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "activate_msg:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->e:Lb/a/l;

    if-nez v1, :cond_b

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    :goto_4
    invoke-virtual {p0}, Lb/a/et;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "instant_msgs:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->f:Ljava/util/List;

    if-nez v1, :cond_c

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_5
    invoke-virtual {p0}, Lb/a/et;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "sessions:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->g:Ljava/util/List;

    if-nez v1, :cond_d

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_6
    invoke-virtual {p0}, Lb/a/et;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "imprint:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->h:Lb/a/cb;

    if-nez v1, :cond_e

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_7
    invoke-virtual {p0}, Lb/a/et;->q()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "id_tracking:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->i:Lb/a/bu;

    if-nez v1, :cond_f

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    :goto_8
    invoke-virtual {p0}, Lb/a/et;->s()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "active_user:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->j:Lb/a/r;

    if-nez v1, :cond_10

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_9
    invoke-virtual {p0}, Lb/a/et;->u()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "control_policy:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/a/et;->k:Lb/a/aj;

    if-nez v1, :cond_11

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    :goto_a
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7
    iget-object v1, p0, Lb/a/et;->a:Lb/a/ad;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lb/a/et;->b:Lb/a/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :cond_9
    iget-object v1, p0, Lb/a/et;->c:Lb/a/ap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :cond_a
    iget-object v1, p0, Lb/a/et;->d:Lb/a/df;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    :cond_b
    iget-object v1, p0, Lb/a/et;->e:Lb/a/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_c
    iget-object v1, p0, Lb/a/et;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_d
    iget-object v1, p0, Lb/a/et;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_6

    :cond_e
    iget-object v1, p0, Lb/a/et;->h:Lb/a/cb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_7

    :cond_f
    iget-object v1, p0, Lb/a/et;->i:Lb/a/bu;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lb/a/et;->j:Lb/a/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_11
    iget-object v1, p0, Lb/a/et;->k:Lb/a/aj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_a
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lb/a/et;->k:Lb/a/aj;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Lb/a/et;->a:Lb/a/ad;

    if-nez v0, :cond_0

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'client_stats\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/et;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lb/a/et;->b:Lb/a/x;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'app_info\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/et;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lb/a/et;->c:Lb/a/ap;

    if-nez v0, :cond_2

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'device_info\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/et;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lb/a/et;->d:Lb/a/df;

    if-nez v0, :cond_3

    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'misc_info\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/et;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lb/a/et;->a:Lb/a/ad;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lb/a/et;->a:Lb/a/ad;

    invoke-static {}, Lb/a/ad;->g()V

    :cond_4
    iget-object v0, p0, Lb/a/et;->b:Lb/a/x;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lb/a/et;->b:Lb/a/x;

    invoke-virtual {v0}, Lb/a/x;->q()V

    :cond_5
    iget-object v0, p0, Lb/a/et;->c:Lb/a/ap;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lb/a/et;->c:Lb/a/ap;

    invoke-virtual {v0}, Lb/a/ap;->I()V

    :cond_6
    iget-object v0, p0, Lb/a/et;->d:Lb/a/df;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lb/a/et;->d:Lb/a/df;

    invoke-static {}, Lb/a/df;->u()V

    :cond_7
    iget-object v0, p0, Lb/a/et;->e:Lb/a/l;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lb/a/et;->e:Lb/a/l;

    invoke-static {}, Lb/a/l;->c()V

    :cond_8
    iget-object v0, p0, Lb/a/et;->h:Lb/a/cb;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lb/a/et;->h:Lb/a/cb;

    invoke-virtual {v0}, Lb/a/cb;->i()V

    :cond_9
    iget-object v0, p0, Lb/a/et;->i:Lb/a/bu;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lb/a/et;->i:Lb/a/bu;

    invoke-virtual {v0}, Lb/a/bu;->g()V

    :cond_a
    iget-object v0, p0, Lb/a/et;->j:Lb/a/r;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lb/a/et;->j:Lb/a/r;

    invoke-virtual {v0}, Lb/a/r;->c()V

    :cond_b
    iget-object v0, p0, Lb/a/et;->k:Lb/a/aj;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lb/a/et;->k:Lb/a/aj;

    invoke-virtual {v0}, Lb/a/aj;->c()V

    :cond_c
    return-void
.end method
