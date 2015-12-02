.class public Lcom/facebook/orca/app/fg;
.super Ljava/lang/Object;
.source "OrcaDataManager.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/prefs/shared/ae;

.field private static final c:Lcom/facebook/prefs/shared/ae;

.field private static final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Lcom/facebook/auth/b/b;

.field private final e:Lcom/facebook/orca/g/aa;

.field private final f:Lcom/facebook/contacts/data/b;

.field private final g:Lcom/facebook/prefs/shared/j;

.field private final h:Lcom/facebook/orca/prefs/az;

.field private final i:Lcom/facebook/common/executors/a;

.field private final j:Lcom/facebook/orca/app/g;

.field private final k:Lcom/facebook/orca/app/fj;

.field private final l:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/app/dt;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/facebook/config/a/a;

.field private n:Lcom/facebook/prefs/shared/f;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 52
    const-class v0, Lcom/facebook/orca/app/fg;

    sput-object v0, Lcom/facebook/orca/app/fg;->a:Ljava/lang/Class;

    .line 55
    const-string v0, "messenger_sms_read_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/fg;->b:Lcom/facebook/prefs/shared/ae;

    .line 57
    const-string v0, "messenger_mms_read_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/fg;->c:Lcom/facebook/prefs/shared/ae;

    .line 181
    sget-object v0, Lcom/facebook/auth/e/a;->w:Lcom/facebook/prefs/shared/ae;

    sget-object v1, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    sget-object v2, Lcom/facebook/appconfig/l;->a:Lcom/facebook/prefs/shared/ae;

    sget-object v3, Lcom/facebook/orca/prefs/n;->y:Lcom/facebook/prefs/shared/ae;

    sget-object v4, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    sget-object v5, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    const/4 v6, 0x5

    new-array v6, v6, [Lcom/facebook/prefs/shared/ae;

    const/4 v7, 0x0

    sget-object v8, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    sget-object v8, Lcom/facebook/orca/background/n;->a:Lcom/facebook/prefs/shared/ae;

    aput-object v8, v6, v7

    const/4 v7, 0x2

    sget-object v8, Lcom/facebook/orca/emoji/w;->b:Lcom/facebook/prefs/shared/ae;

    aput-object v8, v6, v7

    const/4 v7, 0x3

    sget-object v8, Lcom/facebook/orca/stickers/v;->b:Lcom/facebook/prefs/shared/ae;

    aput-object v8, v6, v7

    const/4 v7, 0x4

    sget-object v8, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    aput-object v8, v6, v7

    invoke-static/range {v0 .. v6}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/fg;->o:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/g/aa;Lcom/facebook/prefs/shared/j;Lcom/facebook/orca/prefs/az;Lcom/facebook/common/executors/a;Lcom/facebook/orca/app/g;Lcom/facebook/contacts/data/b;Ljavax/inject/a;Lcom/facebook/config/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/orca/g/aa;",
            "Lcom/facebook/prefs/shared/j;",
            "Lcom/facebook/orca/prefs/az;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/orca/app/g;",
            "Lcom/facebook/contacts/data/b;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/app/dt;",
            ">;",
            "Lcom/facebook/config/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    .line 85
    iput-object p2, p0, Lcom/facebook/orca/app/fg;->e:Lcom/facebook/orca/g/aa;

    .line 86
    iput-object p3, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    .line 87
    iput-object p4, p0, Lcom/facebook/orca/app/fg;->h:Lcom/facebook/orca/prefs/az;

    .line 88
    iput-object p5, p0, Lcom/facebook/orca/app/fg;->i:Lcom/facebook/common/executors/a;

    .line 89
    iput-object p6, p0, Lcom/facebook/orca/app/fg;->j:Lcom/facebook/orca/app/g;

    .line 90
    new-instance v0, Lcom/facebook/orca/app/fj;

    invoke-direct {v0, p0}, Lcom/facebook/orca/app/fj;-><init>(Lcom/facebook/orca/app/fg;)V

    iput-object v0, p0, Lcom/facebook/orca/app/fg;->k:Lcom/facebook/orca/app/fj;

    .line 91
    iput-object p7, p0, Lcom/facebook/orca/app/fg;->f:Lcom/facebook/contacts/data/b;

    .line 92
    iput-object p8, p0, Lcom/facebook/orca/app/fg;->l:Ljavax/inject/a;

    .line 93
    iput-object p9, p0, Lcom/facebook/orca/app/fg;->m:Lcom/facebook/config/a/a;

    .line 94
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/app/fg;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/app/fg;->f()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/app/fg;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/fg;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->i:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/app/fi;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/app/fi;-><init>(Lcom/facebook/orca/app/fg;Lcom/facebook/prefs/shared/ae;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->c(Ljava/lang/Runnable;)V

    .line 169
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/app/fg;)Lcom/facebook/prefs/shared/j;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/app/fg;)Lcom/facebook/auth/b/b;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    return-object v0
.end method

.method static synthetic d()Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/orca/app/fg;->b:Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/app/fg;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->l:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/app/fg;)Lcom/facebook/orca/app/g;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->j:Lcom/facebook/orca/app/g;

    return-object v0
.end method

.method static synthetic e()Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/orca/app/fg;->c:Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->e:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->b()V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->f:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->c()V

    .line 179
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    const/4 v4, -0x1

    const/16 v6, 0x8

    const/4 v3, 0x2

    .line 98
    const-string v0, "OrcaDataManager.init"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 100
    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/j;->e()V

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    sget-object v2, Lcom/facebook/auth/e/a;->w:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v2, v4}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 106
    if-ge v0, v3, :cond_2

    .line 107
    sget-object v0, Lcom/facebook/orca/app/fg;->a:Ljava/lang/Class;

    const-string v2, "Me user version upgrade to version 2"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    instance-of v0, v0, Lcom/facebook/auth/b/d;

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    check-cast v0, Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->f()V

    .line 112
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/app/fg;->f()V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/j;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 114
    sget-object v2, Lcom/facebook/auth/e/a;->w:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 115
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 119
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    sget-object v2, Lcom/facebook/f/n;->b:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v2, v4}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 120
    if-ge v0, v6, :cond_4

    .line 121
    sget-object v0, Lcom/facebook/orca/app/fg;->a:Ljava/lang/Class;

    const-string v2, "GK version upgrade to version %d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    instance-of v0, v0, Lcom/facebook/auth/b/d;

    if-eqz v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->d:Lcom/facebook/auth/b/b;

    check-cast v0, Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->f()V

    .line 128
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/j;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 129
    sget-object v2, Lcom/facebook/f/n;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v6}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 130
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 133
    :cond_4
    new-instance v0, Lcom/facebook/orca/app/fh;

    invoke-direct {v0, p0}, Lcom/facebook/orca/app/fh;-><init>(Lcom/facebook/orca/app/fg;)V

    iput-object v0, p0, Lcom/facebook/orca/app/fg;->n:Lcom/facebook/prefs/shared/f;

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    iget-object v2, p0, Lcom/facebook/orca/app/fg;->n:Lcom/facebook/prefs/shared/f;

    invoke-virtual {v0, v2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/f;)V

    .line 145
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 146
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 172
    invoke-direct {p0}, Lcom/facebook/orca/app/fg;->f()V

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->g:Lcom/facebook/prefs/shared/j;

    sget-object v1, Lcom/facebook/orca/app/fg;->o:Ljava/util/Set;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;)V

    .line 174
    return-void
.end method

.method public c()Lcom/facebook/orca/app/fj;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/app/fg;->k:Lcom/facebook/orca/app/fj;

    return-object v0
.end method
