.class public Lcom/facebook/contacts/contactcard/ax;
.super Ljava/lang/Object;
.source "VoipInfoLoader.java"


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
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/e/c;

.field private final e:Lcom/facebook/common/time/a;

.field private final f:Lcom/facebook/fbservice/ops/k;

.field private g:Lcom/facebook/contacts/contactcard/az;

.field private h:Lcom/facebook/user/UserKey;

.field private i:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

.field private l:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/contacts/contactcard/ax;

    sput-object v0, Lcom/facebook/contacts/contactcard/ax;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/e/c;Lcom/facebook/common/time/a;Lcom/facebook/fbservice/ops/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/e/c;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/fbservice/ops/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/contactcard/ax;->l:J

    .line 60
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ax;->b:Ljavax/inject/a;

    .line 61
    iput-object p2, p0, Lcom/facebook/contacts/contactcard/ax;->c:Ljavax/inject/a;

    .line 62
    iput-object p3, p0, Lcom/facebook/contacts/contactcard/ax;->d:Lcom/facebook/e/c;

    .line 63
    iput-object p4, p0, Lcom/facebook/contacts/contactcard/ax;->e:Lcom/facebook/common/time/a;

    .line 64
    iput-object p5, p0, Lcom/facebook/contacts/contactcard/ax;->f:Lcom/facebook/fbservice/ops/k;

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ax;J)J
    .locals 0

    .prologue
    .line 28
    iput-wide p1, p0, Lcom/facebook/contacts/contactcard/ax;->l:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ax;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->e:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ax;Lcom/facebook/contacts/server/FetchVoipInfoResult;)Lcom/facebook/contacts/server/FetchVoipInfoResult;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ax;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ax;Z)Z
    .locals 0

    .prologue
    .line 28
    iput-boolean p1, p0, Lcom/facebook/contacts/contactcard/ax;->j:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/contacts/contactcard/ax;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ax;->h()V

    return-void
.end method

.method static synthetic g()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/contacts/contactcard/ax;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private h()V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->g:Lcom/facebook/contacts/contactcard/az;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->g:Lcom/facebook/contacts/contactcard/az;

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/az;->a()V

    .line 116
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/contactcard/az;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ax;->g:Lcom/facebook/contacts/contactcard/az;

    .line 69
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;)V
    .locals 4

    .prologue
    .line 122
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->h:Lcom/facebook/user/UserKey;

    invoke-virtual {p1, v0}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 123
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->f()V

    .line 124
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ax;->h:Lcom/facebook/user/UserKey;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ax;->j:Z

    .line 128
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 129
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ax;->h()V

    .line 168
    :cond_2
    :goto_0
    return-void

    .line 132
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 135
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/contacts/contactcard/ax;->l:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 137
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ax;->h()V

    goto :goto_0

    .line 140
    :cond_4
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->h:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 143
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 144
    new-instance v3, Lcom/facebook/contacts/server/FetchVoipInfoParams;

    invoke-direct {v3, v0, v1}, Lcom/facebook/contacts/server/FetchVoipInfoParams;-><init>(J)V

    .line 145
    const-string v0, "fetchVoipInfoParams"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v1, Lcom/facebook/contacts/server/d;->l:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    .line 149
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/contactcard/ay;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/ay;-><init>(Lcom/facebook/contacts/contactcard/ax;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->h:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->h:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ax;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->d:Lcom/facebook/e/c;

    invoke-virtual {v0}, Lcom/facebook/e/c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 88
    :goto_0
    return v0

    .line 85
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    if-eqz v0, :cond_1

    .line 86
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchVoipInfoResult;->a()Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 88
    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ax;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->k:Lcom/facebook/contacts/server/FetchVoipInfoResult;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchVoipInfoResult;->b()Ljava/lang/String;

    move-result-object v0

    .line 95
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ax;->i:Lcom/google/common/d/a/s;

    .line 107
    :cond_0
    return-void
.end method
