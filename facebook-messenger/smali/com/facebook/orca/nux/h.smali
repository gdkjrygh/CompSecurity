.class public Lcom/facebook/orca/nux/h;
.super Ljava/lang/Object;
.source "OrcaNuxManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/config/a/a;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/orca/prefs/az;

.field private final e:Lcom/facebook/contacts/upload/c;

.field private final f:Landroid/content/pm/PackageManager;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/orca/nux/h;

    sput-object v0, Lcom/facebook/orca/nux/h;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/config/a/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/prefs/az;Lcom/facebook/contacts/upload/c;Landroid/content/pm/PackageManager;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/config/a/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/orca/prefs/az;",
            "Lcom/facebook/contacts/upload/c;",
            "Landroid/content/pm/PackageManager;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/orca/nux/h;->b:Lcom/facebook/config/a/a;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    .line 61
    iput-object p3, p0, Lcom/facebook/orca/nux/h;->d:Lcom/facebook/orca/prefs/az;

    .line 62
    iput-object p4, p0, Lcom/facebook/orca/nux/h;->e:Lcom/facebook/contacts/upload/c;

    .line 63
    iput-object p5, p0, Lcom/facebook/orca/nux/h;->f:Landroid/content/pm/PackageManager;

    .line 64
    iput-object p6, p0, Lcom/facebook/orca/nux/h;->g:Ljavax/inject/a;

    .line 65
    iput-object p7, p0, Lcom/facebook/orca/nux/h;->h:Ljavax/inject/a;

    .line 66
    iput-object p8, p0, Lcom/facebook/orca/nux/h;->i:Ljavax/inject/a;

    .line 67
    iput-object p9, p0, Lcom/facebook/orca/nux/h;->j:Ljavax/inject/a;

    .line 68
    iput-object p10, p0, Lcom/facebook/orca/nux/h;->k:Ljavax/inject/a;

    .line 70
    invoke-direct {p0}, Lcom/facebook/orca/nux/h;->s()V

    .line 81
    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 249
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 250
    return-void
.end method

.method private b(Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 254
    return-void
.end method

.method private s()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v1, 0x1

    const/4 v5, -0x1

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v3

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 88
    iget-object v2, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v2

    .line 90
    if-eq v0, v5, :cond_3

    .line 93
    iget-object v2, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/prefs/o;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/prefs/shared/e;->a()V

    .line 106
    :goto_0
    if-eq v0, v6, :cond_2

    .line 108
    iget-object v2, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v6}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v2

    .line 112
    if-eq v0, v5, :cond_0

    .line 113
    sget-object v3, Lcom/facebook/orca/prefs/o;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 117
    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 119
    sget-object v0, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->o:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    .line 124
    :cond_1
    invoke-interface {v2}, Lcom/facebook/prefs/shared/e;->a()V

    .line 126
    :cond_2
    return-void

    .line 97
    :cond_3
    if-ne v2, v5, :cond_4

    if-eqz v3, :cond_4

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->o:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->K:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->k:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 142
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->d:Lcom/facebook/orca/prefs/az;

    invoke-static {v0}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/prefs/az;)V

    .line 143
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 209
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->b:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/nux/h;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 156
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/nux/h;->d:Lcom/facebook/orca/prefs/az;

    const-string v4, "send_clicked"

    invoke-virtual {v3, v4}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v3

    if-ge v3, v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v2

    .line 160
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->e()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_3

    :goto_2
    return v2

    .line 155
    :cond_1
    const/16 v0, 0x14

    goto :goto_0

    :cond_2
    move v0, v1

    .line 156
    goto :goto_1

    :cond_3
    move v2, v1

    .line 160
    goto :goto_2
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 164
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/nux/h;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 3

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->h:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 173
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/nux/h;->f:Landroid/content/pm/PackageManager;

    const-string v2, "com.facebook.home"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 174
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public h()Z
    .locals 3

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 186
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/nux/h;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public j()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 192
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->k()V

    .line 194
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public k()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->k:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->k:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    sget-object v0, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->b(Lcom/facebook/prefs/shared/ae;)V

    .line 204
    :cond_0
    sget-object v0, Lcom/facebook/orca/prefs/o;->k:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 206
    :cond_1
    return-void
.end method

.method public l()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 215
    invoke-virtual {p0}, Lcom/facebook/orca/nux/h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/nux/h;->e:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/c;->e()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public m()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 221
    iget-object v1, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public n()V
    .locals 3

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/orca/nux/h;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 227
    sget-object v1, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 228
    sget-object v1, Lcom/facebook/orca/prefs/o;->i:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 229
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 230
    return-void
.end method

.method public o()V
    .locals 1

    .prologue
    .line 233
    sget-object v0, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 234
    return-void
.end method

.method public p()V
    .locals 1

    .prologue
    .line 237
    sget-object v0, Lcom/facebook/orca/prefs/o;->l:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 238
    return-void
.end method

.method public q()V
    .locals 1

    .prologue
    .line 241
    sget-object v0, Lcom/facebook/orca/prefs/o;->q:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 242
    return-void
.end method

.method public r()V
    .locals 1

    .prologue
    .line 245
    sget-object v0, Lcom/facebook/orca/prefs/o;->r:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/h;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 246
    return-void
.end method
