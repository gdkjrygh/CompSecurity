.class public Lcom/facebook/c/s;
.super Ljava/lang/Object;
.source "SecureContextHelper.java"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Lcom/facebook/c/t;

.field private final g:Lcom/facebook/common/e/h;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/c/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 34
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/c/s;->a:Ljava/lang/String;

    .line 35
    sget-object v0, Lcom/facebook/c/s;->a:Ljava/lang/String;

    const-string v1, "_no_activities"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/c/s;->b:Ljava/lang/String;

    .line 36
    sget-object v0, Lcom/facebook/c/s;->a:Ljava/lang/String;

    const-string v1, "_multiple_activities"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/c/s;->c:Ljava/lang/String;

    .line 37
    sget-object v0, Lcom/facebook/c/s;->a:Ljava/lang/String;

    const-string v1, "_mismatched_resolve"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/c/s;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/c/t;Lcom/facebook/common/e/h;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/c/t;",
            "Lcom/facebook/common/e/h;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/c/o;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/c/s;->e:Ljava/lang/String;

    .line 50
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/t;

    iput-object v0, p0, Lcom/facebook/c/s;->f:Lcom/facebook/c/t;

    .line 51
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/c/s;->g:Lcom/facebook/common/e/h;

    .line 52
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iput-object v0, p0, Lcom/facebook/c/s;->h:Ljava/util/Set;

    .line 53
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (intent:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 172
    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 173
    const-string v1, " action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 176
    const-string v1, " component="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    iget-object v1, p0, Lcom/facebook/c/s;->g:Lcom/facebook/common/e/h;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    return-void
.end method

.method private a(Landroid/content/Intent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 141
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/c/s;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 162
    :goto_0
    return v0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/facebook/c/s;->f:Lcom/facebook/c/t;

    invoke-virtual {v0, p1}, Lcom/facebook/c/t;->a(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v0

    .line 146
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 147
    sget-object v0, Lcom/facebook/c/s;->b:Ljava/lang/String;

    const-string v1, "no activities registered"

    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/c/s;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    move v0, v2

    .line 148
    goto :goto_0

    .line 150
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v1, :cond_2

    .line 151
    sget-object v0, Lcom/facebook/c/s;->c:Ljava/lang/String;

    const-string v1, "multiple activities registered"

    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/c/s;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    move v0, v2

    .line 152
    goto :goto_0

    .line 154
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    .line 155
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-nez v0, :cond_4

    .line 157
    invoke-virtual {p1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    :cond_3
    move v0, v1

    .line 162
    goto :goto_0

    .line 158
    :cond_4
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 159
    sget-object v0, Lcom/facebook/c/s;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mismatched resolve: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/c/s;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    move v0, v2

    .line 160
    goto :goto_0
.end method

.method private b(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/c/s;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/o;

    .line 184
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 185
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/c/o;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_0

    .line 189
    :cond_1
    return-object p1
.end method


# virtual methods
.method public a(Landroid/content/Intent;ILandroid/app/Activity;)V
    .locals 1

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 119
    invoke-virtual {p3, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 120
    return-void
.end method

.method public a(Landroid/content/Intent;ILandroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 129
    invoke-direct {p0, p1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 130
    invoke-virtual {p3, v0, p2}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Intent;I)V

    .line 131
    return-void
.end method

.method public a(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 60
    invoke-direct {p0, v0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {p2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 63
    :cond_0
    return-void
.end method

.method public b(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 108
    invoke-virtual {p2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 109
    return-void
.end method
