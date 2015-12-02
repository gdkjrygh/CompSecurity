.class public Lcom/qihoo/security/floatview/a/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/floatview/ui/c$a;
.implements Lcom/qihoo/security/floatview/ui/c$b;


# instance fields
.field private final a:Lcom/qihoo/security/service/a;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private final e:Lcom/qihoo/security/floatview/ui/a;

.field private final f:Lcom/qihoo/security/floatview/ui/f;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Ljava/lang/String;

.field private l:Z

.field private final m:Landroid/content/Context;

.field private n:Z

.field private o:I

.field private final p:Lcom/qihoo/security/floatview/a/b$a;

.field private final q:Lcom/qihoo/security/service/c$a;

.field private final r:Lcom/qihoo/security/service/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v8, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->b:Ljava/lang/String;

    .line 63
    iput-boolean v8, p0, Lcom/qihoo/security/floatview/a/a;->l:Z

    .line 65
    iput-boolean v6, p0, Lcom/qihoo/security/floatview/a/a;->n:Z

    .line 188
    new-instance v0, Lcom/qihoo/security/floatview/a/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/a/a$1;-><init>(Lcom/qihoo/security/floatview/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->p:Lcom/qihoo/security/floatview/a/b$a;

    .line 399
    new-instance v0, Lcom/qihoo/security/floatview/a/a$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/a/a$2;-><init>(Lcom/qihoo/security/floatview/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->q:Lcom/qihoo/security/service/c$a;

    .line 485
    new-instance v0, Lcom/qihoo/security/floatview/a/a$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/a/a$3;-><init>(Lcom/qihoo/security/floatview/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->r:Lcom/qihoo/security/service/b$a;

    .line 73
    iput-object p1, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    .line 74
    iput-object p2, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    .line 75
    iput-boolean v6, p0, Lcom/qihoo/security/floatview/a/a;->g:Z

    .line 76
    iput-boolean v8, p0, Lcom/qihoo/security/floatview/a/a;->h:Z

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-string/jumbo v1, "phone"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 79
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    if-nez v0, :cond_4

    move v0, v6

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->j:Z

    .line 82
    const-string/jumbo v0, "fv_enabled"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-string/jumbo v1, "fv_enabled"

    invoke-static {}, Lcom/qihoo/security/floatview/a/a;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-string/jumbo v1, "fv_enabled"

    invoke-static {}, Lcom/qihoo/security/floatview/a/a;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    .line 89
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    iput-boolean v8, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    .line 93
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-string/jumbo v1, "fv_mode"

    invoke-static {v0, v1, v8}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/a/a;->d:I

    .line 95
    new-instance v0, Lcom/qihoo/security/floatview/ui/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-string/jumbo v2, "fv_port_x"

    const-string/jumbo v3, "fv_port_Y"

    const-string/jumbo v4, "fv_land_x"

    const-string/jumbo v5, "fv_land_Y"

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lcom/qihoo/security/floatview/ui/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/qihoo/security/floatview/ui/c$a;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    .line 98
    new-instance v0, Lcom/qihoo/security/floatview/ui/f;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/floatview/ui/f;-><init>(Landroid/content/Context;Lcom/qihoo/security/floatview/ui/a;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->f:Lcom/qihoo/security/floatview/ui/f;

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/floatview/ui/a;->setOnPositionChangeListener(Lcom/qihoo/security/floatview/ui/c$b;)V

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->f:Lcom/qihoo/security/floatview/ui/f;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/a;->setActionListener(Lcom/qihoo/security/floatview/ui/b;)V

    .line 102
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotal()I

    move-result v0

    const/16 v1, 0xfa

    if-lt v0, v1, :cond_5

    :goto_1
    iput-boolean v6, p0, Lcom/qihoo/security/floatview/a/a;->n:Z

    .line 103
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->n:Z

    if-eqz v0, :cond_2

    .line 109
    :cond_2
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    if-eqz v0, :cond_3

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->q:Lcom/qihoo/security/service/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/c;)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->r:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :cond_3
    :goto_2
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->b:Ljava/lang/String;

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/qihoo/security/floatview/a/a;->o:I

    .line 120
    return-void

    :cond_4
    move v0, v8

    .line 79
    goto/16 :goto_0

    :cond_5
    move v6, v8

    .line 102
    goto :goto_1

    .line 113
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/a/a;I)I
    .locals 0

    .prologue
    .line 31
    iput p1, p0, Lcom/qihoo/security/floatview/a/a;->d:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/a/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/a/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/qihoo/security/floatview/a/a;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/a/a;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/a/a;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/a/a;->g:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/c$a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->q:Lcom/qihoo/security/service/c$a;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/a/a;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/a/a;->h:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/floatview/a/a;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/a/a;->i:Z

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/b$a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->r:Lcom/qihoo/security/service/b$a;

    return-object v0
.end method

.method public static e()Z
    .locals 2

    .prologue
    .line 533
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 133
    invoke-direct {p0}, Lcom/qihoo/security/floatview/a/a;->g()Z

    move-result v2

    if-nez v2, :cond_1

    .line 140
    :cond_0
    :goto_0
    return v1

    .line 136
    :cond_1
    iget-boolean v2, p0, Lcom/qihoo/security/floatview/a/a;->c:Z

    if-eqz v2, :cond_0

    .line 137
    iget-boolean v2, p0, Lcom/qihoo/security/floatview/a/a;->i:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/qihoo/security/floatview/a/a;->j:Z

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/qihoo/security/floatview/a/a;->h:Z

    if-nez v2, :cond_3

    iget v2, p0, Lcom/qihoo/security/floatview/a/a;->d:I

    if-eq v2, v0, :cond_2

    iget v2, p0, Lcom/qihoo/security/floatview/a/a;->d:I

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/qihoo/security/floatview/a/a;->g:Z

    if-eqz v2, :cond_3

    :cond_2
    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method static synthetic f(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/qihoo/security/floatview/a/a;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    return-object v0
.end method

.method private g()Z
    .locals 1

    .prologue
    .line 149
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/floatview/a/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo/security/floatview/a/a;->d:I

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 325
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v0

    .line 329
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 330
    iput-object v0, p0, Lcom/qihoo/security/floatview/a/a;->b:Ljava/lang/String;

    .line 333
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->g:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->h:Z

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->i:Z

    return v0
.end method

.method static synthetic l(Lcom/qihoo/security/floatview/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->n:Z

    return v0
.end method

.method static synthetic n(Lcom/qihoo/security/floatview/a/a;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->l:Z

    return v0
.end method


# virtual methods
.method public a()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->p:Lcom/qihoo/security/floatview/a/b$a;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 374
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->j:Z

    .line 380
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->j:Z

    if-nez v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->l()V

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->g()V

    .line 394
    :cond_0
    return-void

    .line 374
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(II)V
    .locals 0

    .prologue
    .line 497
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 292
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 293
    iget v1, p0, Lcom/qihoo/security/floatview/a/a;->o:I

    if-eq v0, v1, :cond_0

    .line 294
    iput v0, p0, Lcom/qihoo/security/floatview/a/a;->o:I

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/ui/a;->a(Landroid/content/res/Configuration;)V

    .line 303
    return-void
.end method

.method public a(IIZ)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 501
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/a;->a(Z)V

    .line 502
    return v1
.end method

.method public b()V
    .locals 2

    .prologue
    .line 158
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->q:Lcom/qihoo/security/service/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 165
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->a:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->r:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 172
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->g()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 185
    :goto_2
    return-void

    .line 173
    :catch_0
    move-exception v0

    goto :goto_2

    .line 166
    :catch_1
    move-exception v0

    goto :goto_1

    .line 159
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public b(II)V
    .locals 0

    .prologue
    .line 526
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    const/16 v2, 0x3e81

    .line 310
    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    .line 311
    const/16 v0, 0x3e82

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->e:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->getPercent()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 312
    invoke-static {v2}, Lcom/qihoo/security/support/b;->a(I)V

    .line 314
    invoke-direct {p0}, Lcom/qihoo/security/floatview/a/a;->h()V

    .line 315
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 316
    const-string/jumbo v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 318
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 319
    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a;->m:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 321
    return-void
.end method

.method public c(II)V
    .locals 0

    .prologue
    .line 530
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 507
    invoke-direct {p0}, Lcom/qihoo/security/floatview/a/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 508
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/a/a;->l:Z

    .line 511
    :cond_0
    return-void
.end method
